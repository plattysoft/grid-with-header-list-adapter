package com.plattysoft.gridviewwithheaderexample;

import com.plattysoft.ui.GridViewWithHeaderBaseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shalafi on 6/6/13.
 */
public class GidViewWithHeaderExampleAdapter extends GridViewWithHeaderBaseAdapter {

    Integer[] mArray = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

	private LayoutInflater mInflater;

    public GidViewWithHeaderExampleAdapter(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public Integer getItem(int position) {
    	return mArray[position];
    }
    
    @Override
    public long getItemId(int position) {
    	return position;
    }
    
    @Override
    public int getItemCount() {
    	return mArray.length;
    }
    
    @Override
    protected View getItemView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = mInflater.inflate(R.layout.simple_list_item, null);
        }
        TextView tv = (TextView) view.findViewById(R.id.text);        
        tv.setText(String.valueOf(getItem(position)));
        return view;
    }

}
