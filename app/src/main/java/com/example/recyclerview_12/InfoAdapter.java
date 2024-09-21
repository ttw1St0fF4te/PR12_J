package com.example.recyclerview_12;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
//    private final LayoutInflater inflater;
    private final List<Info> infoList;

    private Context context;

    InfoAdapter(Context context, List<Info> infoList)
    {
        this.context = context;
        this.infoList = infoList;
    }

    @Override
    public InfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoAdapter.ViewHolder holder, int position) {
        Info info = infoList.get(position);
        holder.gunImage.setImageResource(info.getGunImage());
        holder.gunName.setText(info.getGunName());
        holder.gunDescription.setText(info.getGunDescription());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), InfoActivity.class);
            intent.putExtra("gun_name", info.getGunName());
            intent.putExtra("gun_description", info.getGunDescription());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView gunImage;
        final TextView gunName, gunDescription;
        ViewHolder(View view)
        {
            super(view);
            gunImage = view.findViewById(R.id.gun);
            gunName = view.findViewById(R.id.gun_name);
            gunDescription = view.findViewById(R.id.gun_description);
        }
    }
}
