package com.why.project.snackbarutildemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.why.project.snackbarutildemo.utils.SnackbarUtil;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((Button)findViewById(R.id.btn_info)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				/*这个view是有讲究的——我们传入的view经过了findSuitableParent()方法的包装。
				1.当传入的View不为空时，如果我们在布局中发现了CoordinatorLayout布局，那么View就是CoordinatorLayout；
				2.如果没有CoordinatorLayout布局，我们就先找到一个id为android.R.id.content的FrameLayout（这个布局是最底层的根布局），将View设置为该FrameLayout；
				3.其他情况下就使用View的Parent布局，一直到这个View不为空。*/
				SnackbarUtil.ShortSnackbar(view,"已超出范围，请重新选择",SnackbarUtil.Info).show();
			}
		});

		((Button)findViewById(R.id.btn_confirm)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				/*这个view是有讲究的——我们传入的view经过了findSuitableParent()方法的包装。
				1.当传入的View不为空时，如果我们在布局中发现了CoordinatorLayout布局，那么View就是CoordinatorLayout；
				2.如果没有CoordinatorLayout布局，我们就先找到一个id为android.R.id.content的FrameLayout（这个布局是最底层的根布局），将View设置为该FrameLayout；
				3.其他情况下就使用View的Parent布局，一直到这个View不为空。*/
				SnackbarUtil.ShortSnackbar(view,"保存成功",SnackbarUtil.Confirm).show();
			}
		});

		((Button)findViewById(R.id.btn_warning)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				/*这个view是有讲究的——我们传入的view经过了findSuitableParent()方法的包装。
				1.当传入的View不为空时，如果我们在布局中发现了CoordinatorLayout布局，那么View就是CoordinatorLayout；
				2.如果没有CoordinatorLayout布局，我们就先找到一个id为android.R.id.content的FrameLayout（这个布局是最底层的根布局），将View设置为该FrameLayout；
				3.其他情况下就使用View的Parent布局，一直到这个View不为空。*/
				SnackbarUtil.ShortSnackbar(view,"标题不能为空",SnackbarUtil.Warning).show();
			}
		});

		((Button)findViewById(R.id.btn_alert)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				/*这个view是有讲究的——我们传入的view经过了findSuitableParent()方法的包装。
				1.当传入的View不为空时，如果我们在布局中发现了CoordinatorLayout布局，那么View就是CoordinatorLayout；
				2.如果没有CoordinatorLayout布局，我们就先找到一个id为android.R.id.content的FrameLayout（这个布局是最底层的根布局），将View设置为该FrameLayout；
				3.其他情况下就使用View的Parent布局，一直到这个View不为空。*/
				SnackbarUtil.ShortSnackbar(view,"保存失败",SnackbarUtil.Alert).setAction("重试", new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						Toast.makeText(MainActivity.this,"重试",Toast.LENGTH_SHORT).show();
					}
				}).setActionTextColor(Color.parseColor("#ffffff")).show();
			}
		});
	}
}
