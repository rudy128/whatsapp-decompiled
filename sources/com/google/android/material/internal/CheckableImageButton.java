package com.google.android.material.internal;

import X.AnonymousClass1HF;
import X.BE6;
import X.C22667BJi;
import X.C22696BKy;
import X.C27741Xj;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] A03;
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public boolean isChecked() {
        return this.A02;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.A02) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), A03);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C22696BKy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22696BKy bKy = (C22696BKy) parcelable;
        super.onRestoreInstanceState(bKy.A00);
        setChecked(bKy.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.A00 && this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void setPressed(boolean z) {
        if (this.A01) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.A02);
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16842912;
        A03 = A1X;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        AnonymousClass1HF.A0f(this, new C22667BJi(this, 4));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, android.os.Parcelable, X.BKy] */
    public Parcelable onSaveInstanceState() {
        ? r1 = new C27741Xj(super.onSaveInstanceState());
        r1.A00 = this.A02;
        return r1;
    }

    public void setPressable(boolean z) {
        this.A01 = z;
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970112);
    }
}
