package com.google.android.exoplayer2.ui;

import X.AFE;
import X.AJ4;
import X.C17880vN;
import X.C22350B4d;
import X.C26554D3u;
import X.C72453Mb;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class TrackSelectionView extends LinearLayout {
    public boolean A00;
    public C26554D3u A01;
    public C22350B4d A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray A05;
    public final CheckedTextView A06;
    public final CheckedTextView A07;
    public final LayoutInflater A08;
    public final AFE A09;

    public List getOverrides() {
        SparseArray sparseArray = this.A05;
        ArrayList A0z = C17880vN.A0z(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            A0z.add(sparseArray.valueAt(i));
        }
        return A0z;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A00();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (!z) {
                SparseArray sparseArray = this.A05;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            A00();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.A07.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setTrackNameProvider(C22350B4d b4d) {
        if (b4d != null) {
            this.A02 = b4d;
            A00();
            return;
        }
        throw new NullPointerException();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.A05 = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.A08 = from;
        AFE afe = new AFE(this, 9);
        this.A09 = afe;
        this.A02 = new AJ4(getResources());
        this.A01 = C26554D3u.A03;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.A07 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(2131899013);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(afe);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(2131625268, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.A06 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(2131899012);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(afe);
        addView(checkedTextView2);
    }

    private void A00() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        this.A07.setEnabled(false);
        this.A06.setEnabled(false);
    }

    public boolean getIsDisabled() {
        return this.A00;
    }

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
