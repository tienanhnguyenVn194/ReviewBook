package com.example.gat_review_api.adaptor;

import android.content.Context;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gat_review_api.MainActivity;
import com.example.gat_review_api.R;
import com.example.gat_review_api.data.model.Datum;

import java.util.List;


public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {
    public static final String IMAGE_BASE_URL = "https://fordev.gatbook.org/rest/api/common/get_image/";
    private List<Datum> mdatum;
    private PostItemListener mItemListener;
    private Context mContext;

    public interface PostItemListener {
        void onPostClick(long id);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tvNameBook,tvNameUser,reviewBook;
        public ImageView imgBook,imgUser;
        PostItemListener mItemListener;

        public ViewHolder(@NonNull View itemView, PostItemListener postItemListener) {
            super(itemView);
            tvNameBook = itemView.findViewById(R.id.tvNameBook);
            tvNameUser = itemView.findViewById(R.id.tvNameUser);
            reviewBook = itemView.findViewById(R.id.reviewBook);
            imgBook = itemView.findViewById(R.id.imgBook);
            imgUser = itemView.findViewById(R.id.imgUser);

            this.mItemListener = postItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Datum datum = getDatum(getAdapterPosition());
            this.mItemListener.onPostClick(datum.getEdition().getBookId());

            notifyDataSetChanged();
        }
    }

    public AnswersAdapter(Context context,List<Datum> posts, PostItemListener itemListener) {
        mContext = context;
        mdatum = posts;
        mItemListener = itemListener;
    }

    @NonNull
    @Override
    public AnswersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(view,this.mItemListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnswersAdapter.ViewHolder holder, int position) {
        Datum datum = mdatum.get(position);
        TextView textView1 = holder.tvNameUser;
        TextView textView2 = holder.tvNameBook;
        TextView textView3 = holder.reviewBook;
        ImageView imageView1 = holder.imgBook;
        ImageView imageView2 = holder.imgUser;
        String imageUrl = IMAGE_BASE_URL + datum.getEdition().getImageId();
            textView1.setText(datum.getUserInfo().getName());
            textView2.setText(datum.getEdition().getTitle());
            textView3.setText(datum.getEvaluation().getReview());
            Glide.with(mContext).load(imageUrl).centerCrop().into(imageView1);

    }

    @Override
    public int getItemCount() {
        return mdatum.size();
    }
    public void updateAnswers(List<Datum> datum) {
        mdatum = datum;
        notifyDataSetChanged();
    }
    private Datum getDatum(int adapterPosition){
        return mdatum.get(adapterPosition);
    }
}