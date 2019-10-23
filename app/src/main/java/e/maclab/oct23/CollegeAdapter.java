package e.maclab.oct23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CollegeAdapter extends ArrayAdapter<College> {
    Context mContext;
    int mResource;
    public CollegeAdapter(@NonNull Context context, int resource, @NonNull List<College> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

        int image = getItem(position).getLogo();
        String name = getItem(position).getName();
        String patron = getItem(position).getPatron();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);
        TextView tvname = convertView.findViewById(R.id.tvName);
        TextView tvSaint = convertView.findViewById(R.id.tvSaint);
        ImageView ivLogo = convertView.findViewById(R.id.ivLogo);
        tvname.setText(name);
        ivLogo.setImageResource(image);
        return convertView;
    }
}
