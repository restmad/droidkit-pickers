package com.droidkit.file.selectors.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import com.droidkit.file.R;
import com.droidkit.file.selectors.items.ExplorerItem;
import com.droidkit.file.selectors.items.HistoryItem;

import java.util.ArrayList;

/**
 * Created by kiolt_000 on 14/09/2014.
 */
public class WelcomeExplorerAdapter extends ExplorerAdapter {
    public WelcomeExplorerAdapter(Activity activity, ArrayList<ExplorerItem> items) {
        super(activity,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        ExplorerItem item = getItem(position);
        if(item instanceof HistoryItem){

            itemView = View.inflate(context, R.layout.item_history, null);
            itemView.setTag("history");
            return itemView;
        }else {
            if(convertView!=null && !convertView.getTag().equals("history"))
                return super.getView(position, convertView, parent);
            else
                return super.getView(position, null, parent);
        }

    }
}
