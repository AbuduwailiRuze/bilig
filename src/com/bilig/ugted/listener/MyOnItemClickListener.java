package com.bilig.ugted.listener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.bilig.ugted.activity.MainActivity;
import com.letv.simple.utils.LetvParamsUtils;
import com.example.playerdemo.activity.*;



public class MyOnItemClickListener implements OnItemClickListener {

	private Activity activity;
	public MyOnItemClickListener(Activity activity) {
		this.activity=activity;
		
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
			startLecloudVod();
			if(!(activity instanceof MainActivity)){
				activity.finish();
			}
	}
	
	private void startLecloudVod() {
        Intent intent;
        String uuid = "40ff268ca7";
        String vuid = "6c658686bf";
        intent = new Intent(activity, PlayActivity.class);
        //Bundle bundle = LetvParamsUtils.setVodParams(etUUID.getText().toString().trim(), etVUID.getText().toString().trim(), "", "151398", "", false);
        Bundle bundle = LetvParamsUtils.setVodParams(uuid, vuid, "", "151398", "", false);
        intent.putExtra(PlayActivity.DATA, bundle);
        activity.startActivity(intent);
    }

}
