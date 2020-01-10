package com.example.mylivedemo.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

/**
 * @author: create by OlderJiao
 * @date: 2020 2020/1/9 15:05
 */
public class FotterBehavior extends CoordinatorLayout.Behavior<View> {

    private int changed;

    /**
     * Default constructor for inflating Behaviors from layout. The Behavior will have
     * the opportunity to parse specially defined layout parameters. These parameters will
     * appear on the child view tag.
     *
     * @param context
     * @param attrs
     */
    public FotterBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View child, @NonNull View directTargetChild, @NonNull View target, int axes, int type) {
        return (axes & ViewCompat.SCROLL_AXIS_VERTICAL) !=0;
    }

    @Override
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View child, @NonNull View target, int dx, int dy, @NonNull int[] consumed, int type) {
        if(dy > 0 && changed < 0 || dy < 0 && changed > 0){
            child.animate().cancel();
            changed = 0;
        }
        changed += dy;
        if(changed > child.getHeight()&&child.getVisibility() == View.VISIBLE){
            hide(child);
        }else if(changed < 0 && child.getVisibility() == View.INVISIBLE){
            show(child);
        }
    }

    /**
     * 显示动画效果
     * @param child
     */
    private void show(final View child) {
        Log.e("###显示","显示自定义");
        //设置动画
        ViewPropertyAnimator animator = child.animate()
                .translationY(0)
                .setInterpolator(new FastOutSlowInInterpolator()).setDuration(250);
        animator.setListener(new AnimatorListenerAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param animation
             */
            @Override
            public void onAnimationEnd(Animator animation) {
                child.setVisibility(View.VISIBLE);
            }
        }).start();
    }

    /**
     * 隐藏动画操作
     * @param child
     */
    private void hide(final View child) {
        Log.e("###隐藏","隐藏自定义");
        //设置动画
        ViewPropertyAnimator animator = child.animate()
                .translationY(child.getHeight())
                .setInterpolator(new FastOutSlowInInterpolator()).setDuration(200);
        animator.setListener(new AnimatorListenerAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param animation
             */
            @Override
            public void onAnimationEnd(Animator animation) {
                child.setVisibility(View.INVISIBLE);
            }
        }).start();
    }
}
