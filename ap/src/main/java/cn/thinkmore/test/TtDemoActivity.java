package cn.thinkmore.test;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class TtDemoActivity extends Activity{

	private TreeListView listView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_relative_layout);



		RelativeLayout rl = new RelativeLayout(this);
		rl.setLayoutParams(new LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
		listView = new TreeListView(this,initNodeTree());
		List<Node> resultNode = listView.mNodeList;
		//rl.addView(listView);
		//setContentView(rl);

		relativeLayout.addView(listView);

//		Button button = new Button(this);
//		button.setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//		button.setText("提交");
//
//		RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//		layoutParams.topMargin = 800;
//
//		rl.addView(button, layoutParams);

//		button.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent();
//				//intent.putCharSequenceArrayListExtra("list", listView.get());
////				Bundle bundle = new Bundle();
////				bundle.putCharSequenceArrayList("node", listView.get());
////				intent.putExtra("node",bundle);
//
//				intent.putExtra("listobj", (Serializable) listView.get());
//
//				setResult(200, intent);
//				finish();
//			}
//		});

	}
	public List<NodeResource> initNodeTree(){
		List <NodeResource> list = new ArrayList<NodeResource>();
		NodeResource n1 = new NodeResource(""+-1, ""+0, "全部城市", "dfs");//, R.drawable.icon_department
		list.add(n1);
		NodeResource n3 = new NodeResource(""+0, ""+1, "北京", "dfs");
		list.add(n3);
		NodeResource n4 = new NodeResource(""+1, ""+2, "金刚狼军团", "dfs");
		list.add(n4);
		NodeResource n5 = new NodeResource(""+1, ""+3, "蚂蚁军团", "dfs");
		list.add(n5);
		NodeResource n6 = new NodeResource(""+1, ""+4, "大象军团", "dfs");
		list.add(n6);
		NodeResource n7 = new NodeResource(""+2,""+5, "张三", "dfs");
		list.add(n7);
		NodeResource n8 = new NodeResource(""+2,""+6, "李四", "dfs");
		list.add(n8);
		NodeResource n9 = new NodeResource(""+0,""+7, "天津", "dfs");
		list.add(n9);
		NodeResource n10 = new NodeResource(""+7,""+8, "老鼠军团", "dfs");
		list.add(n10);
		NodeResource n11 = new NodeResource(""+8,""+9, "王五", "dfs");
		list.add(n11);
		NodeResource n12 = new NodeResource(""+8,""+10, "赵六", "dfs");
		list.add(n12);
		return list;
	}

	public void finish(View view) {

		Intent intent = new Intent();
		//intent.putCharSequenceArrayListExtra("list", listView.get());
//				Bundle bundle = new Bundle();
//				bundle.putCharSequenceArrayList("node", listView.get());
//				intent.putExtra("node",bundle);

		intent.putExtra("listobj", (Serializable) listView.get());

		setResult(200, intent);
		finish();

	}
}
