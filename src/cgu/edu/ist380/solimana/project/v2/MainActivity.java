package cgu.edu.ist380.solimana.project.v2;

import com.androidbegin.fragmenttabs.R;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	// Declare Tab Variable
	Tab tab;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Create the actionbar
		ActionBar actionBar = getActionBar();

		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(false);

		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create first Tab
		tab = actionBar.newTab().setTabListener(new FragmentsTab1());
		// Create your own custom icon
		//tab.setIcon(R.drawable.tab1);
		tab.setText("Food");	
		tab.setIcon(R.drawable.pizza);
		actionBar.addTab(tab);

		// Create Second Tab
		tab = actionBar.newTab().setTabListener(new FragmentsTab2());
		// Set Tab Title
		tab.setText("Activities");
		tab.setIcon(R.drawable.videogames);
		actionBar.addTab(tab);

		// Create Third Tab
		tab = actionBar.newTab().setTabListener(new FragmentsTab3());
		// Set Tab Title
		tab.setText("Admin");
		actionBar.addTab(tab);
	}
}
