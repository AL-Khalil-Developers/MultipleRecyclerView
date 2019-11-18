package com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.alkhalildevelopers.multiplerecyclerview.R;
import java.util.List;

import static com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewModel.AdTextLayoutType;
import static com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewModel.ImageLayoutType;

public class MainRecyclerViewAdapter extends RecyclerView.Adapter {
    public MainRecyclerViewAdapter(List<MainRecyclerViewModel> mainRecyclerViewModelList) {
        this.mainRecyclerViewModelList = mainRecyclerViewModelList;
    }

    private List<MainRecyclerViewModel> mainRecyclerViewModelList;

    @Override
    public int getItemViewType(int viewTypePosition) {
        switch (mainRecyclerViewModelList.get(viewTypePosition).getViewType()){
            case 0:
                return ImageLayoutType;
            case 1:
                return AdTextLayoutType;
            default:
                return -1;

        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case ImageLayoutType:
                View imageViewLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout,parent,false);
                return new ImageLayoutViewHolder(imageViewLayout);
            case AdTextLayoutType:
                View AdTextLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.ad_layout,parent,false);
                return new AdTextLayoutViewHolder(AdTextLayout);
                default:
                    return null;
        }

    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (mainRecyclerViewModelList.get(position).getViewType()){
            case ImageLayoutType:
                int imageResource = mainRecyclerViewModelList.get(position).getImageResourse();
                ((ImageLayoutViewHolder)holder).setImageView(imageResource);
                break;
            case AdTextLayoutType:
                String adText = mainRecyclerViewModelList.get(position).getAdText();
                ((AdTextLayoutViewHolder)holder).setTextView(adText);
                break;
                default:
                    return;

        }

    }


    @Override
    public int getItemCount() {
        return mainRecyclerViewModelList.size();
    }

    public class ImageLayoutViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView ;
        public ImageLayoutViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageID);
        }
        private void setImageView(int ImageResource){
            imageView.setImageResource(ImageResource);
        }
    }

    public class AdTextLayoutViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public AdTextLayoutViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.adViewID);
        }
        private void setTextView(String text){
            textView.setText(text);
        }
    }
}
