package com.example.chatbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ConversationUserListAdapter extends RecyclerView.Adapter<ConversationUserListAdapter.ListAdapter> {

    private List<Users> users;
    private Context context;

    private OnItemClickListener onItemClickListener;

    public ConversationUserListAdapter(List<Users> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public ListAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chats, parent, false);
        return new ListAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter holder, int position) {
        Users user = users.get(position);

        holder.name.setText(user.getName());
        holder.lastMsg.setText(user.getLastMsg());

        Glide.with(context).load(R.drawable.ic_account_circle_black_24dp).into(holder.avatar);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ListAdapter extends RecyclerView.ViewHolder {
        private ImageView avatar;
        private TextView name, lastMsg;

        public ListAdapter(@NonNull View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.user_name);
            lastMsg = itemView.findViewById(R.id.last_message);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();

                    if (pos != RecyclerView.NO_POSITION) {
                        if (onItemClickListener != null) {
                            onItemClickListener.itemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
