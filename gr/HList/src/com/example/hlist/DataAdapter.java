package com.example.hlist;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DataAdapter extends ArrayAdapter<Data>{
	
	Context mContext;
	int res;
	List<Data> data;
	
	public DataAdapter(Context mContext,int res,List<Data> data){
		super(mContext,res,data);
		this.data = data;
		this.res = res;
		this.mContext = mContext;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Data currentPostion = (Data)data.get(position);
		ViewHolder holder = new ViewHolder();
		View v = convertView;
		if(v == null){
			LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.listitem, null);
			holder.txtTitle = (TextView)v.findViewById(R.id.txtTitle);
			holder.txtDescription = (TextView)v.findViewById(R.id.txtDes);
			holder.img = (ImageView)v.findViewById(R.id.img);
			v.setTag(holder);
		}else{
			holder = (ViewHolder)v.getTag();
		}
		holder.txtTitle.setText(currentPostion.title);
		holder.txtDescription.setText(currentPostion.des);
		return v;
	}
	
	private class ViewHolder{
		TextView txtTitle,txtDescription;
		ImageView img;
	}

}
