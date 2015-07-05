package com.example.hlist;

import java.util.ArrayList;
import java.util.List;

import com.example.hlist.widget.AdapterView;
import com.example.hlist.widget.AdapterView.OnItemClickListener;
import com.example.hlist.widget.HListView;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	HListView hList,hl;
	Data data;
	List<Data> lstData;
	DataAdapter dataAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		hList = (HListView)findViewById(R.id.hListView1);
		hl = (HListView)findViewById(R.id.hListView2);
		lstData = new ArrayList<Data>();
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		lstData.add(new Data("first","first"));
		dataAdapter = new DataAdapter(MainActivity.this, R.layout.listitem, lstData);
		hList.setAdapter(dataAdapter);
		hl.setAdapter(dataAdapter);
		hList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, lstData.get(position).title+position, Toast.LENGTH_LONG).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
