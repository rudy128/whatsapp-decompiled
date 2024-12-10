package com.whatsapp.stickers;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.AutoFitGridRecyclerView;

public final class BottomFadeRecyclerView extends AutoFitGridRecyclerView {
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomFadeRecyclerView(Context context) {
        super(context);
    }
}
