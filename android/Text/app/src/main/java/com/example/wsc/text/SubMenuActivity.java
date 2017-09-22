package com.example.wsc.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class SubMenuActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //手动添加菜单
        /*SubMenu file=menu.addSubMenu("文件");
        SubMenu edit=menu.addSubMenu("编辑");//添加主菜单
        //添加子菜单
        file.add(1,1,1,"新建");
        file.add(1,2,1,"粘贴");
        file.add(1,3,1,"剪切");
        file.add(1,4,1,"重命名");

        //设置标题名
        file.setHeaderTitle("wsc");

        edit.add(2,1,1,"新建");
        edit.add(2,2,1,"粘贴");
        edit.add(2,3,1,"剪切");
        edit.add(2,4,1,"重命名");*/
        getMenuInflater().inflate(R.menu.submenu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override//重写设置响应事件
    public boolean onOptionsItemSelected(MenuItem item) {
       /* if (item.getGroupId() == 1) {
            switch (item.getItemId()) {
                case 1:
                    Toast.makeText(this,"这是复制1",Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                case 3:
                case 4:

            }
        }else if (item.getGroupId() == 2) {
                switch (item.getItemId()) {
                    case 1:
                        Toast.makeText(this,"这是复制2",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                    case 3:
                    case 4:
                }

            }*/
       switch (item.getItemId()){
           case R.id.file_item1:
               Toast.makeText(this, "这是复制(xml)",Toast.LENGTH_SHORT).show();
               break;
           case R.id.file_item2:
               //后面懒得写，省略
       }

            return super.onOptionsItemSelected(item);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);
    }
}
