/*
 * Copyright (C) 2017 seiginonakama (https://github.com/seiginonakama).
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
package com.letv.sarrsdesktop.aapt.test;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TypedArray typedArray = obtainStyledAttributes(R.style.testTheme, R.styleable.test);
        String testStr = typedArray.getString(R.styleable.test_testStr);
        int resId = typedArray.getResourceId(R.styleable.test_testRef, 0);
        typedArray.recycle();

        setContentView(resId);

        TextView showTextView = (TextView) findViewById(R.id.show_text);
        showTextView.setText(String.valueOf(testStr));

        TextView showResIdView = (TextView) findViewById(R.id.show_res_id);
        showResIdView.setText(getString(R.string.show_res_id_str, Integer.toHexString(R.string.show_res_id_str)));
    }
}
