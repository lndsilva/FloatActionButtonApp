package br.senac.sp.floatactionbuttonapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fab, fab_one, fab_two, fab_three;
    TextView photo, music, done;
    Float translationY = 100f;

    OvershootInterpolator interpolator = new OvershootInterpolator();

    Boolean isMenuOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab_one = (FloatingActionButton) findViewById(R.id.fab_one);
        fab_two = (FloatingActionButton) findViewById(R.id.fab_two);
        fab_three = (FloatingActionButton) findViewById(R.id.fab_three);

        photo = (TextView) findViewById(R.id.photos);
        music = (TextView) findViewById(R.id.music);
        done = (TextView) findViewById(R.id.done);

        fab_one.setAlpha(0f);
        photo.setAlpha(0f);
        fab_two.setAlpha(0f);
        music.setAlpha(0f);
        fab_three.setAlpha(0f);
        done.setAlpha(0f);

        fab_one.setTranslationY(translationY);
        photo.setTranslationY(translationY);
        fab_two.setTranslationY(translationY);
        fab_three.setTranslationY(translationY);
        music.setTranslationY(translationY);
        done.setTranslationY(translationY);

        fab.setOnClickListener(this);
        fab_one.setOnClickListener(this);
        fab_two.setOnClickListener(this);
        fab_three.setOnClickListener(this);
    }

    private void openMenu() {
        isMenuOpen = !isMenuOpen;

        fab.animate().setInterpolator(interpolator).rotation(45f).setDuration(300).start();
        fab_one.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        photo.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fab_two.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        music.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        fab_three.animate().translationY(0f).translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();
        done.animate().translationY(0f).alpha(1f).setInterpolator(interpolator).setDuration(300).start();

    }

    private void closeMenu() {
        isMenuOpen = !isMenuOpen;

        fab.animate().setInterpolator(interpolator).rotation(0f).setDuration(300).start();
        fab_one.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        photo.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fab_two.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        music.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        fab_three.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();
        done.animate().translationY(translationY).alpha(0f).setInterpolator(interpolator).setDuration(300).start();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.fab_one:
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
            case R.id.fab_two:
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
            case R.id.fab_three:
                if (isMenuOpen) {
                    closeMenu();
                } else {
                    openMenu();
                }
                break;
        }
    }
}
