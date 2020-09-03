package andrey.elin.weatherapp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.DayViewHolder>{

    private List<String> days;

    public void setDays(List<String> days) {
        this.days = days;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DayViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_day, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {
        holder.bind(days.get(position));

    }

    @Override
    public int getItemCount() {
        if (days == null) return 0;
        return days.size();
    }

    static class DayViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public DayViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.day_textView1);
        }

        void bind(String day) {
            textView.setText(day);
        }
    }
}
