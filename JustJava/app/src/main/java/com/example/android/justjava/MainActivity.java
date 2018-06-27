/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox cream = (CheckBox) findViewById(R.id.cream);
        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        EditText ed = (EditText) findViewById(R.id.ed);
        boolean hasWhippedCream = cream.isChecked();
        boolean hasChocolate = chocolate.isChecked();
        String edittext1 = ed.getText().toString();
        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String priceMessage = createOrderSummary(price, hasWhippedCream, hasChocolate, edittext1);


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.subject) + edittext1);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    /**creates a summary of the order
     *
     */
    private String createOrderSummary(int price, boolean hasWhippedCream, boolean hasChocolate, String edittext1) {
        String priceMessage = getString(R.string.order_summary_name, edittext1);
        priceMessage += "\n" + getString(R.string.cream) + hasWhippedCream;
        priceMessage += "\n" + getString(R.string.chocolate) + hasChocolate;
        priceMessage += "\n" + getString(R.string.Qty) + quantity;
        priceMessage += "\n"+ getString(R.string.total) + price;
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }


    /**
     * Calculates the price of the order.
     *
     * quantity is the number of cups of coffee ordered
     * price per cup is the price of cups of coffee ordered
     */
    private int calculatePrice(boolean addWhippedCream, boolean addChocolate) {
        //price of 1 cup of coffee
        int basePrice = 5;
        //if customer wants whip cream added to coffee it is a 1$ extra
        if (addWhippedCream) {
            basePrice = basePrice + 1;
            //if customer wants chocolate added to coffee it is a 2$ extra
        }
        if (addChocolate) {
            basePrice = basePrice + 2;
        }
        //calculate coffee plus cost of toppings
        return quantity * basePrice;
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            // error message when a customer tries to order more than 100 coffees
            Toast.makeText(this, "You cannot order more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 1) {
//error message when a customer tries to order less than 1 coffee
            Toast.makeText(this, "You cannot order less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    }




