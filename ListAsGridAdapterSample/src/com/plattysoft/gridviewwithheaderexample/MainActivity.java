package com.plattysoft.gridviewwithheaderexample;

import com.plattysoft.ui.GridItemClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements GridItemClickListener {

	private ListAsGridExampleAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listView = (ListView) findViewById(R.id.listView);
		View header = View.inflate(getBaseContext(), R.layout.simple_list_item, null);
		TextView tv = (TextView) header.findViewById(R.id.text);
		tv.setText("This is a Header");
		listView.addHeaderView(tv);
		mAdapter = new ListAsGridExampleAdapter(this);
		mAdapter.setNumColumns(2);
		mAdapter.setOnGridClickListener(this);
		listView.setAdapter (mAdapter);
	}

	@Override
	public void onGridItemClicked(View v, int position, long itemId) {
		Toast.makeText(this, "Item clicked: "+mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
	}
}
