package com.example.vtrust.maillist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vtrust on 18-4-4.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    private int resourceId;

    public PersonAdapter(@NonNull Context context, int resourceId, List<Person> objects) {
        super(context, resourceId,objects);
        this.resourceId = resourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.personAvatar = view.findViewById(R.id.person_avatar);
            viewHolder.personName = view.findViewById(R.id.person_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.personAvatar.setImageResource(person.getAvatar());
        viewHolder.personName.setText(person.getName());

        return view;
    }

    class ViewHolder{
        ImageView personAvatar;
        TextView personName;
    }
}
