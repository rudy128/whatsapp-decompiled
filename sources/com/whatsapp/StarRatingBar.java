package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4IB;
import X.AnonymousClass4aX;
import X.BHI;
import X.C107015Yb;
import X.C72453Mb;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;

public class StarRatingBar extends LinearLayout implements View.OnClickListener {
    public int A00;
    public C107015Yb A01;
    public final int A02;
    public final Drawable A03;
    public final Drawable A04;

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setRating(int i) {
        this.A00 = i;
        A00();
        sendAccessibilityEvent(16384);
        C107015Yb r0 = this.A01;
        if (r0 != null) {
            r0.C2T(i, false);
        }
    }

    public int getRating() {
        return this.A00;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        BHI bhi = (BHI) parcelable;
        super.onRestoreInstanceState(bhi.getSuperState());
        this.A00 = bhi.A00;
        A00();
    }

    private void A00() {
        Drawable drawable;
        Drawable drawable2;
        if (getChildCount() == 0) {
            for (int i = 0; i < this.A02; i++) {
                ImageView A0U = C72453Mb.A0U(this);
                A0U.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                int i2 = i + 1;
                Integer valueOf = Integer.valueOf(i2);
                A0U.setTag(valueOf);
                Resources resources = getResources();
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = valueOf;
                A0U.setContentDescription(resources.getQuantityString(2131755150, i2, A1a));
                if (i2 <= this.A00) {
                    drawable2 = this.A03;
                } else {
                    drawable2 = this.A04;
                }
                A0U.setImageDrawable(drawable2);
                A0U.setOnClickListener(this);
                addView(A0U);
            }
            return;
        }
        for (int i3 = 0; i3 < this.A02; i3++) {
            ImageView imageView = (ImageView) getChildAt(i3);
            if (i3 + 1 <= this.A00) {
                drawable = this.A03;
            } else {
                drawable = this.A04;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public void onClick(View view) {
        int A0M = AnonymousClass000.A0M(view.getTag());
        this.A00 = A0M;
        A00();
        sendAccessibilityEvent(16384);
        C107015Yb r0 = this.A01;
        if (r0 != null) {
            r0.C2T(A0M, true);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        A00();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, X.BHI, android.os.Parcelable] */
    public Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = this.A00;
        return baseSavedState;
    }

    public void sendAccessibilityEvent(int i) {
        if (((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            super.sendAccessibilityEvent(i);
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            List<CharSequence> text = obtain.getText();
            Resources A0Y = AnonymousClass000.A0Y(this);
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass000.A1L(A1b, this.A00);
            text.add(AnonymousClass3MW.A0x(A0Y, Integer.valueOf(this.A02), A1b, 1, 2131890387));
            obtain.setEnabled(true);
            ((AccessibilityManager) getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public void setOnRatingChangeListener(C107015Yb r1) {
        this.A01 = r1;
    }

    /* JADX INFO: finally extract failed */
    public StarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4IB.A00, 0, 0);
        try {
            this.A02 = obtainStyledAttributes.getInt(1, 5);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            this.A03 = drawable == null ? AnonymousClass4aX.A03(context, 2130970098, 2131101221, 2131232635) : drawable;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
            this.A04 = drawable2 == null ? AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131232319), 2131101222) : drawable2;
            obtainStyledAttributes.recycle();
            setSaveEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public StarRatingBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
