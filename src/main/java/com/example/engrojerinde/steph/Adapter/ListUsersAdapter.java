package com.example.engrojerinde.steph.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.quickblox.users.model.QBUser;

import java.util.ArrayList;

public class ListUsersAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<QBUser> qbUserArrayList;

    public ListUsersAdapter(Context context, ArrayList<QBUser> qbUserArrayList) {
        this.context = context;
        this.qbUserArrayList = qbUserArrayList;
    }

    @Override
    public int getCount() {
        return qbUserArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return qbUserArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = view;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view1 = inflater.inflate(android.R.layout.simple_list_item_multiple_choice,null);
            TextView textView = view1.findViewById(android.R.id.text1);
            textView.setText(qbUserArrayList.get(i).getLogin());
        }
        return view1;
    }
}
