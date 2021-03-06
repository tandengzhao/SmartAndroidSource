package com.smartandroid.sa.avatars;

import android.content.Context;
/*
 * Copyright 2014 Pedro Álvarez Fernández <pedroafa@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import android.content.res.Resources;

public class AvatarBorder {

	private final Resources mResources;
	private final Context context;

	public AvatarBorder(Resources resources, Context c) {
		mResources = resources;
		this.context = c;
	}

	public int getColor() {
		return mResources.getColor(mResources.getIdentifier("avatar_border", "color", context.getPackageName()));
		// return mResources.getColor(R.color.avatar_border);
	}

	public float getRoundWidth() {
		return mResources.getDimension(mResources.getIdentifier("avatar_round_border_size", "dimen",
				context.getPackageName()));
		// return mResources.getDimension(R.dimen.avatar_round_border_size);
	}

	public int getSquareWidth() {
		return (int) mResources.getDimension(mResources.getIdentifier("avatar_square_border_size", "dimen",
				context.getPackageName()));
		// return (int)
		// mResources.getDimension(R.dimen.avatar_square_border_size);
	}
}
