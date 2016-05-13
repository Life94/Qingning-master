package com.jafir.qingning.app.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.jafir.qingning.R;
import com.jafir.qingning.app.activity.CityPickerActivity;

import org.kymjs.kjframe.ui.BindView;
import org.kymjs.kjframe.ui.SupportFragment;
import org.kymjs.kjframe.ui.ViewInject;
import org.kymjs.kjframe.utils.KJLoger;
import org.kymjs.kjframe.utils.ViewUtils;

/**
 * Created by jafir on 16/4/19.
 */
public class PersonFragment extends SupportFragment{


    private Activity aty;
    private View layout;
    /*@BindView(id = R.id.person_toolbar)
    private Toolbar mToolbar;*/
    @BindView(id = R.id.fab,click = true)
    private ImageView mFab;
    @BindView(id = R.id.tv_order,click = true)
    private TextView tv_order;
    @BindView(id = R.id.tv_setting,click = true)
    private TextView tv_setting;
    @BindView(id = R.id.tv_about,click = true)
    private TextView tv_about;
    @BindView(id = R.id.tv_logout,click = true)
    private TextView tv_logout;


    @Override
    protected View inflaterView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        aty = getActivity();
        layout = View.inflate(aty, R.layout.frag_person,null);
        return layout;
    }

    @Override
    protected void initData() {
        super.initData();

    }
    @Override
    protected void widgetClick(View v) {
        super.widgetClick(v);
        KJLoger.debug("dianjile");
        if(v.getId() == R.id.fab) {
            KJLoger.debug("fab");
            //Snackbar.make(v,"nsnaker",Snackbar.LENGTH_LONG).show();
            startActivity(new Intent(aty, CityPickerActivity.class));
        }
        if(v.getId() == R.id.tv_order) {
            KJLoger.debug("点击订单");
            ViewInject.toast("点击订单");
        }
        if(v.getId() == R.id.tv_setting) {
            KJLoger.debug("点击设置");
            ViewInject.toast("点击设置");
        }
        if(v.getId() == R.id.tv_about) {
            KJLoger.debug("点击关于");
            ViewInject.toast("点击关于");
        }
        if(v.getId() == R.id.tv_logout) {
            KJLoger.debug("点击注销");
            ViewInject.toast("点击注销");
        }
    }

}
