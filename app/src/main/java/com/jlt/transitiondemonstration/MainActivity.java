package com.jlt.transitiondemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Random;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Transition Demonstration
 *
 * Simple tutorial to show transitions in Android
 *
 * Copyright (C) 2016 Kairu Joshua Wambugu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

// begin activity MainActivity
public class MainActivity extends AppCompatActivity {

    /** CONSTANTS */

    /** VARIABLES */

    /* Image Views */

    @InjectView( R.id.am_iv )
    ImageView imageView; // the image view

    /* Primitives */

    private boolean goingOut; // boolean to track the direction of the image

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. use the main activity layout
        // 2. inject views
        // 3. start with the image leaving

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. inject views

        ButterKnife.inject( this );

        // 3. start with the image leaving

        goingOut = true;

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method initializeUI
    private int initializeUI() {

        // 0. initialize the image view

        // 0. initialize the image view

//        imageView = ( ImageView ) findViewById( R. )

        return -1;

    } // end method initializeUI

    // begin method click
    // method to respond to clicking of the button
    // declared in activity_main
    public void click( View view ) {

        // 0. initialize the slide that will be used to transition
        // 1. randomly choose an edge from which the slide will happen
        // 2. get the content view group
        // 3. begin the transition
        // 4. if the image is going out
        // 4a. make the image view invisible
        // 4b. set going out to false
        // 5. if the image is coming in
        // 5a. make the image view visible
        // 5b. set going out to true

        // 0. initialize the slide that will be used to transition

        Slide slide = new Slide();

        // 1. randomly choose an edge from which the slide will happen

        int slideEdge = -1;

        Random randomNumberGenerator = new Random();

        // begin switch to know what to use
        switch ( randomNumberGenerator.nextInt( 6 ) ) {

            // 0. left
            // 1. top
            // 2. right
            // 3. bottom
            // 4. start
            // 5. end

            // 0. left

            case 0: slideEdge = Gravity.LEFT; break;

            // 1. top

            case 1: slideEdge = Gravity.TOP; break;

            // 2. right

            case 2: slideEdge = Gravity.RIGHT; break;

            // 3. bottom

            case 3: slideEdge = Gravity.BOTTOM; break;

            // 4. start

            case 4: slideEdge = Gravity.START; break;

            // 5. end

            case 5: slideEdge = Gravity.END; break;

        } // end switch to know what to use

        // set the edge which the slid items should appear from or disappear to
        slide.setSlideEdge( slideEdge );

        // 2. get the content view group

        ViewGroup root = ( ViewGroup ) findViewById( android.R.id.content );

        // 3. begin the transition

        TransitionManager.beginDelayedTransition( root, slide );

        // 4. if the image is going out

        // begin if for if we are going out
        if ( goingOut == true ) {

            // 4a. make the image view invisible

            imageView.setVisibility( View.INVISIBLE );

            // 4b. set going out to false

            goingOut = false;

        } // end if for if we are going out

        // 5. if the image is coming in

        // begin else for when we are coming in
        else {

            // 5a. make the image view visible

            imageView.setVisibility( View.VISIBLE );

            // 5b. set going out to true

            goingOut = true;

        } // end else for when we are coming in

    } // end method click

} // end activity MainActivity