package animelabs.uisample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Asheesh on 10/31/2015.
 */
public class Splash extends Activity {
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        i1=(ImageView)findViewById(R.id.imageView3);
        startAnimationSplash();
        Thread thread=new Thread()
        {
          public void run()
          {
              try
              {
                  sleep(1005);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              finally {
                  Intent intent=new Intent(Splash.this,MainActivity.class);
                  startActivity(intent);
              }
          }
        }; thread.start();

    }
    private void startAnimationSplash() {
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.customanimation);
        animation.reset();
        animation.setFillAfter(true);
        i1.startAnimation(animation);
    }
}
