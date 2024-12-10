package com.whatsapp;

import X.AnonymousClass28M;
import X.C113665nU;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C38251qy;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class AutoFitGridRecyclerView extends C113665nU {
    public int A00;
    public C18000vb A01;
    public C18030ve A02;
    public int A03;

    private void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A01);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
            if (dimensionPixelSize > 0) {
                A0r(new AnonymousClass28M(this.A01, dimensionPixelSize));
            }
        }
        setLayoutManager(new GridLayoutManager(context, 1));
        this.A0R = true;
    }

    private void setColumnCount(int i) {
        int i2 = this.A00;
        if (i2 > 0) {
            C38251qy layoutManager = getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).A1g(Math.max(1, i / i2));
            }
        }
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A14();
        A04(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (C18020vd.A01(C18040vf.A02, this.A02, 6409).contains("holdout_enabled")) {
            if (this.A03 != measuredWidth) {
                this.A03 = measuredWidth;
            } else {
                return;
            }
        }
        setColumnCount(measuredWidth);
    }

    public void setGridSize(int i) {
        this.A00 = i;
    }

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(context, attributeSet);
    }

    public AutoFitGridRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A14();
        A04(context, (AttributeSet) null);
    }
}
