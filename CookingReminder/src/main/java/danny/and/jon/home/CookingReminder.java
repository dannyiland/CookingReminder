
package danny.and.jon.home;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.view.Menu;
import danny.and.jon.home.robosherlock.RoboSherlockActivity;
import roboguice.inject.InjectView;

public class CookingReminder
    extends RoboSherlockActivity
    implements TabListener
{

    @InjectView(R.id.hello)
    TextView hello;
    private String[] locations;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locations = getResources().getStringArray(R.array.locations);
        configureActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

    private void configureActionBar() {
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String location: locations) {
            Tab tab = getSupportActionBar().newTab();
            tab.setText(location);
            tab.setTabListener(this);
            getSupportActionBar().addTab(tab);
        }
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
    }
    @Override
 public void onTabUnselected(Tab tab, FragmentTransaction ft) {}@Override
public void onTabReselected(Tab tab, FragmentTransaction ft) {}
}
