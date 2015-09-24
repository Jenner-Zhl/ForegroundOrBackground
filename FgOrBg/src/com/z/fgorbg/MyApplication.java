package com.z.fgorbg;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.widget.Toast;

public class MyApplication extends Application {
	
	private int mCount;

	private ActivityLifecycleCallbacks mCallback = new ActivityLifecycleCallbacks() {
		
		@Override
		public void onActivityStopped(Activity activity) {
			mCount--;
			if(mCount == 0) {
				Toast.makeText(getApplicationContext(), "Enter background", Toast.LENGTH_SHORT).show();
			}
		}
		
		@Override
		public void onActivityStarted(Activity activity) {
			mCount++;
			if(mCount == 1) {
				Toast.makeText(getApplicationContext(), "Forground displaying", Toast.LENGTH_SHORT).show();
			}
		}
		
		@Override
		public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onActivityResumed(Activity activity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onActivityPaused(Activity activity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onActivityDestroyed(Activity activity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			
		}
	};

	@Override
	public void onCreate() {
		registerActivityLifecycleCallbacks(mCallback );
		super.onCreate();
	}

	
}
