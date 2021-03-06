/*
 * Copyright (C) 2018  KassyLab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kassylab;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/**
 * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
 *
 * <p>{@link RecyclerView.Adapter} implementations should subclass ViewHolder and add fields for caching
 * potentially expensive {@link View#findViewById(int)} results.</p>
 *
 * <p>While {@link RecyclerView.LayoutParams} belong to the {@link RecyclerView.LayoutManager},
 * {@link RecyclerView.ViewHolder ViewHolders} belong to the adapter. Adapters should feel free to use
 * their own custom ViewHolder implementations to store data that makes binding view contents
 * easier. Implementations should assume that individual item views will hold strong references
 * to <code>ViewHolder</code> objects and that <code>RecyclerView</code> instances may hold
 * strong references to extra off-screen item views for caching purposes</p>
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class MultiValueViewHolder extends ViewHolder {
	
	public final SparseArray<View> views = new SparseArray<>();
	
	public MultiValueViewHolder(View itemView, @IdRes int[] idViews) {
		this(null, itemView, idViews);
	}
	
	public MultiValueViewHolder(ViewGroup parent, View itemView, @IdRes int[] idViews) {
		super(parent, itemView);
		
		for (int id : idViews) {
			views.put(id, itemView.findViewById(id));
		}
	}
}
