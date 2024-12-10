package com.whatsapp.mediacomposer.bottombar.filterswipe;

import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class FilterSwipeView extends LinearLayout {
    public final TextView A00 = AnonymousClass3Ma.A0E(this, 2131430859);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View.inflate(getContext(), 2131625322, this);
        AnonymousClass3MY.A0w(context, this, 2131890407);
    }

    public final int getFilterSwipeTextViewVisibility() {
        return this.A00.getVisibility();
    }

    public final void setFilterSwipeTextVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public final void setText(int i) {
        this.A00.setText(i);
    }
}
