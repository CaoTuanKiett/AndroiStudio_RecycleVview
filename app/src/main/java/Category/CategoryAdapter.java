package Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androistudio_recyclerview.R;

import java.util.List;

import Ronaldo.RonaldoAdapter;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context mContext;
    private List<Category> mListCategory;

    public CategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Category> list) {
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mListCategory.get(position);
        if (category == null) {
            return;
        }

        holder.txtNameCategory.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcvRonaldo.setLayoutManager(linearLayoutManager);

        RonaldoAdapter ronaldoAdapter = new RonaldoAdapter();
        ronaldoAdapter.setData(category.getCr7());
        holder.rcvRonaldo.setAdapter(ronaldoAdapter);
    }

    @Override
    public int getItemCount() {

        if (mListCategory != null){
            return mListCategory.size();
        }

        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNameCategory;
        private RecyclerView rcvRonaldo;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNameCategory = itemView.findViewById(R.id.txt_name_category);
            rcvRonaldo = itemView.findViewById(R.id.rcv_cr7);
        }
    }
}
