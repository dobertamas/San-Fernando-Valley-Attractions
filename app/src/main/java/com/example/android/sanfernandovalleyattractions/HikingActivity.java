package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class HikingActivity extends AppCompatActivity {

    public static final String TAG = HikingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> hikingList = new ArrayList<>();
  /*      hikingList.add(new Attraction("Santa Susana Pass State Historic Park", "9853 Andora Ave, Chatsworth, CA", new Location("9853", "Andora Ave", "Chatsworth", "CA", "91311"), "Historic Stagecoach Trail", "http://fpssm.org/history.php",-1));
        hikingList.add(new Attraction("Limekiln Canyon Park", "19585 Rinaldi Street, Porter Ranch, CA 91326 CA", new Location("19585", "Rinaldi Street", "Porter Ranch", "CA", "91326"), "Short trail way below the street", "https://www.yelp.com/biz/limekiln-canyon-trail-los-angeles",-1));
        hikingList.add(new Attraction("Palisades Park", "Porter Ranch, CA", new Location("", "", "Porter Ranch", "CA", "91326"), "1.6 mile multi-use trail", "https://www.yelp.com/biz/palisades-park-los-angeles",-1));
        hikingList.add(new Attraction("Aliso Canyon Park", "18041 Rinaldi St Porter Ranch, CA, 91326", new Location("18041", "Rinaldi St", "Porter Ranch", "CA", "91326"), "A simple easy to moderate walking jogging running trail", "https://www.yelp.com/biz/aliso-canyon-park-porter-ranch",-1));
        hikingList.add(new Attraction("O'Melveny Park", "17300 Sesnon Blvd, Granada Hills, CA 91344", new Location("17300", "Sesnon Blvd", "Granada Hills", "CA", "91344"), "Good workout that was mostly incline but was gradual", "https://www.alltrails.com/trail/us/california/omelveny-bee-canyon-trail",-1));
        hikingList.add(new Attraction("Stoney Point Park", "On Topanga Canyon Blvd, between Chatsworth St & 118 Freeway, Chatsworth, CA 91311", new Location("", "Topanga Canyon Blvd", "Chatsworth", "CA", "91311"), "Rocky outcroppings plus caves", "https://www.yelp.com/biz/stoney-point-chatsworth-2",-1));
*/
        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter hikingAdapter = new AttractionAdapter(this, hikingList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(hikingAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_hiking, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, " inside onOptionsItemSelected " + item.toString());
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the " " menu option
            case R.id.action_visit_restaurants_list:
                Intent myRestaurantsActivityIntent = new Intent(this, RestaurantsActivity.class);
                startActivity(myRestaurantsActivityIntent);
                return true;
            // Respond to a click on the " " menu option
            case R.id.action_visit_shopping_list:
                Intent myShoppingActivityIntent = new Intent(this, ShoppingActivity.class);
                startActivity(myShoppingActivityIntent);
                return true;
            case R.id.action_visit_drinks_list:
                Intent myDrinksActivityIntent = new Intent(this, DrinksActivity.class);
                startActivity(myDrinksActivityIntent);
                return true;
            case R.id.action_visit_main_page:
                Intent myMainPageActivityIntent = new Intent(this, MainActivity.class);
                startActivity(myMainPageActivityIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
