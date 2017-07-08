package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    public static final String TAG = ShoppingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> shoppingList = new ArrayList<>();
        shoppingList.add(new Attraction("T.J. Maxx La Cañada", "663 Foothill Blvd, La Cañada Flintridge, CA 91011", new Location("663", "Foothill Blvd", "La Cañada Flintridge", "CA", "91011"), "Discount retail chain featuring stylish brand-name apparel", "https://www.yelp.com/biz/t-j-maxx-la-canada-flintridge",-1));
        shoppingList.add(new Attraction("Super King Markets", "19500 Plummer St, Northridge, CA 91324", new Location("19500", "Plummer St", "Northridge", "CA", "91324"), "Supermarket offering groceries & other sundries, a deli, a bakery", "https://superkingmarkets.com/pages/northridge-weekly-ad",-1));
        shoppingList.add(new Attraction("Porter Ranch Walmart Supercenter", "19821 Rinaldi St, Porter Ranch, CA 91326", new Location("19821", "Rinaldi St", "Porter Ranch", "CA", "91326"), "Garden Center, Pharmacy, Photo Center, Pickup", "https://www.walmart.com/store/2526/details",-1));
        shoppingList.add(new Attraction("Ralphs Porter Ranch", "19781 Rinaldi St, Porter Ranch, CA 91326", new Location("19781", "Rinaldi St", "Porter Ranch", "CA", "91326"), "They have sushi and sorbet", "https://www.yelp.com/biz/ralphs-los-angeles-70",-1));
        shoppingList.add(new Attraction("Trader Joe's", "10330 Mason Ave, Chatsworth, CA 91311", new Location("10330", "Mason Ave", "Chatsworth", "CA", "91311"), "Grocery chain with a variety of signature items, plus produce, dairy", "https://www.yelp.com/biz/trader-joes-chatsworth",-1));
        shoppingList.add(new Attraction("Whole Foods Market", "19340 Rinaldi St, Northridge, CA 91326", new Location("19340", "Rinaldi St", "Northridge", "CA", "91326"), "Eco-minded chain with natural & organic grocery items", "http://www.wholefoodsmarket.com/stores/porterranch",-1));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        // The adapter knows how to create list items for each item in the list.
        AttractionAdapter shoppingAdapter = new AttractionAdapter(this, shoppingList);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that
        // the {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(shoppingAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_shopping, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, " inside onOptionsItemSelected " + item.toString());
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            case R.id.action_visit_restaurants_list:
                Intent myRestaurantsActivityIntent = new Intent(this, RestaurantsActivity.class);
                startActivity(myRestaurantsActivityIntent);
                return true;
            case R.id.action_visit_hiking_list:
                Intent myHikingActivityIntent = new Intent(this, HikingActivity.class);
                startActivity(myHikingActivityIntent);
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
