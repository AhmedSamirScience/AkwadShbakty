package sara.ahmed.moatazsamir.main.ui;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;

import sara.ahmed.moatazsamir.R;
import sara.ahmed.moatazsamir.main.pojo.Model;
import sara.ahmed.moatazsamir.singleton.IntentSingleton;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.EtisalatViewHolder>
{

     Model etisalatCodes ;
    final Context context ;
    public ListAdapter(Context context, Model etisalatCodes)
    {
        this.context = context;
        this.etisalatCodes = etisalatCodes;
    }

    @NonNull
    @Override
    public EtisalatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new EtisalatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.options_list_item, parent, false));
    }
    public static class EtisalatViewHolder extends RecyclerView.ViewHolder
    {
        final TextView codeDescriptionTextView;
        final TextView codeCategoryTextView;
        public EtisalatViewHolder(@NonNull View itemView)
        {
            super(itemView);
            codeDescriptionTextView = itemView.findViewById(R.id.codeDescriptionTextView);
            codeCategoryTextView = itemView.findViewById(R.id.codeCategoryTextView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull EtisalatViewHolder holder, int position)
    {
        holder.codeDescriptionTextView.setText(etisalatCodes.getCodeDescription().get(position));
        holder.codeCategoryTextView.setText(etisalatCodes.getCodeCategory().get(position));
        if(Locale.getDefault().getDisplayLanguage().equals("العربية")) {
            if (position % 2 == 0) {
                holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_animation_to_right));
            } else if (position % 2 == 1) {
                holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_animation_to_left));
            }
        }
        else
        {
            if (position % 2 == 0) {
                holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_animation_to_left));
            } else if (position % 2 == 1) {
                holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_transition_animation_to_right));
            }
        }

        switch (etisalatCodes.getSeparateCategories().get(position))
        {
            case "FirstCategory" :
            {
                holder.itemView.setBackgroundColor(ContextCompat.getColor(context,R.color.FirstColor));
                break;
            }

            case "SecondCategory" :
            {
                holder.itemView.setBackgroundColor(ContextCompat.getColor(context,R.color.SecondColor));
                break;
            }

            case "URLSource" :
            {
                holder.itemView.setBackgroundColor(ContextCompat.getColor(context,R.color.ThirdColor));
                break;
            }
        }


        holder.itemView.setOnClickListener(v ->
        {
            switch (etisalatCodes.getDetermineAction().get(position))
            {
                case "ACTION_VIEW" :
                {
                    IntentSingleton.getInstance().intentActionView(context,etisalatCodes.getCodeNumber().get(position));
                    break;
                }

                case "ACTION_DIAL" :
                {
                    IntentSingleton.getInstance().intentActionDial(context, etisalatCodes.getCodeNumber().get(position));
                    break;
                }

                case "ACTION_CALL" :
                {
                    IntentSingleton.getInstance().intentActionCall(context,etisalatCodes.getCodeNumber().get(position));
                    break;
                }
            }
        });


    }

    @Override
    public int getItemCount()
    {
        return etisalatCodes.getCodeNumber().size();
    }
    public void setList (Model etisalatCodes)
    {
        this.etisalatCodes = etisalatCodes;
        notifyDataSetChanged();
    }

}
