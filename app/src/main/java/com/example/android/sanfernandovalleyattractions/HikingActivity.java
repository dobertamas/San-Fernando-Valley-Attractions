package com.example.android.sanfernandovalleyattractions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class HikingActivity extends AppCompatActivity {

    public static final String TAG = HikingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiking);

        final ArrayList<Attraction> hikingList = new ArrayList<>();
        hikingList.add(new Attraction("Santa Susana Pass State Historic Park", "9853 Andora Ave, Chatsworth, CA", new Location("9853", "Andora Ave", "Chatsworth", "CA", "91311"), "Good Thai Food", "http://fpssm.org/history.php",R.drawable.santasusanna));

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
        }

        return super.onOptionsItemSelected(item);
    }
}
