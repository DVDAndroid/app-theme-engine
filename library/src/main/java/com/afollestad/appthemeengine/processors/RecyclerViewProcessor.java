package com.afollestad.appthemeengine.processors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.afollestad.appthemeengine.Config;
import com.afollestad.appthemeengine.util.EdgeGlowUtil;

/**
 * @author Aidan Follestad (afollestad)
 */
public class RecyclerViewProcessor implements Processor<RecyclerView, Void> {

    public static final String MAIN_CLASS = "android.support.v7.widget.RecyclerView";

    @Override
    public void process(@NonNull Context context, @Nullable String key, @Nullable RecyclerView target, @Nullable Void extra) {
        if (target == null) return;
        EdgeGlowUtil.setEdgeGlowColor(target, ScrollViewProcessor.processTag(context, key, target), null);
    }
}
