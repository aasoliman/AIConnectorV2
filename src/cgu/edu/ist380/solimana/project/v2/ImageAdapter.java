package cgu.edu.ist380.solimana.project.v2;

import com.androidbegin.fragmenttabs.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context mContext;
	
	// Keep all Images in array
	public Integer[] mThumbIds = {			
			R.drawable.one, R.drawable.two,
			R.drawable.three, R.drawable.four,
			R.drawable.five, R.drawable.six,
			R.drawable.seven, R.drawable.eight,
			R.drawable.nine, R.drawable.ten,			
	};
	
	// Constructor
	public ImageAdapter(Context c){
		mContext = c;
	}

	//@Override
	public int getCount() {
		return mThumbIds.length;
	}

	//@Override
	public Object getItem(int position) {
		return mThumbIds[position];
	}

	//@Override
	public long getItemId(int position) {
		return 0;
	}

	//@Override
	public View getView(int position, View convertView, ViewGroup parent) {			
		ImageView imageView;
		if (convertView == null) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(220, 220));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);			
		}
		else
		{
			imageView = (ImageView) convertView;			
		}
		imageView.setImageResource(mThumbIds[position]);
        return imageView;
        
	}
	

}
