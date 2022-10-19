package Ronaldo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androistudio_recyclerview.R;

import java.util.List;

public class RonaldoAdapter extends RecyclerView.Adapter <RonaldoAdapter.RonaldoViewHolder> {

    private List<Ronaldo> mRonaldo;

    public void setData (List<Ronaldo> list) {
        this.mRonaldo = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Ronaldo.RonaldoAdapter.RonaldoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_cr7, parent, false);
        return new RonaldoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Ronaldo.RonaldoAdapter.RonaldoViewHolder holder, int position) {
        Ronaldo ronaldo = mRonaldo.get(position);
        if (ronaldo == null) {
            return;
        }

        holder.imgCr7.setImageResource(ronaldo.getResourceId());
        holder.txtTile.setText(ronaldo.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mRonaldo != null) {
            return mRonaldo.size();
        }

        return 0;
    }

    public class RonaldoViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTile;
        private ImageView imgCr7;


        public RonaldoViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCr7 = itemView.findViewById(R.id.img_cr7);
            txtTile = itemView.findViewById(R.id.txt_cr7);


        }
    }

}
