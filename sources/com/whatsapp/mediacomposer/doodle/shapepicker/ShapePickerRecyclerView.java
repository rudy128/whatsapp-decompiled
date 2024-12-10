package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass000;
import X.C111645k3;
import X.C111685kG;
import X.C112395lP;
import X.C113655nT;
import X.C17890vO;
import X.C18070vi;
import X.C25272CcK;
import X.C37961qT;
import X.C38391rD;
import X.C72453Mb;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;

public class ShapePickerRecyclerView extends C113655nT {
    public int A00;
    public int A01;
    public int A02;
    public C25272CcK A03;
    public GridLayoutManagerNonPredictiveAnimations A04;
    public int A05;

    private void A05(GridLayoutManager gridLayoutManager, C38391rD r4) {
        if (r4 instanceof C112395lP) {
            C112395lP r42 = (C112395lP) r4;
            gridLayoutManager.A01 = new C111645k3(gridLayoutManager, r42, this);
            int i = this.A01;
            if (r42.A00 != i) {
                r42.A00 = i;
                if (r42.A01 == null) {
                    r42.A0U();
                }
            }
        }
    }

    public static void A06(ShapePickerRecyclerView shapePickerRecyclerView) {
        if (shapePickerRecyclerView.A01 == -1) {
            int measuredWidth = shapePickerRecyclerView.getMeasuredWidth();
            int i = shapePickerRecyclerView.A05;
            int i2 = i + shapePickerRecyclerView.A02;
            int i3 = measuredWidth / i2;
            if ((i2 * i3) + i <= shapePickerRecyclerView.getMeasuredWidth()) {
                i3++;
            }
            shapePickerRecyclerView.A01 = Math.max(1, i3);
        }
    }

    public int getActualShapeSpacing() {
        int i = this.A00;
        if (i == -1) {
            A06(this);
            if (this.A01 > 1) {
                int measuredWidth = getMeasuredWidth();
                int i2 = this.A01;
                i = (measuredWidth - (this.A05 * i2)) / (i2 - 1);
            } else {
                i = 0;
            }
            this.A00 = i;
        }
        return i;
    }

    public int getAdapterItemCount() {
        C38391rD r0 = this.A0B;
        if (r0 != null) {
            return r0.A0Q();
        }
        throw AnonymousClass000.A0n("Must set adapter first");
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A04(context);
    }

    private void A04(Context context) {
        this.A05 = context.getResources().getDimensionPixelOffset(2131168689);
        boolean A1T = AnonymousClass000.A1T(C72453Mb.A08(getContext()), 1);
        Resources A0Y = AnonymousClass000.A0Y(this);
        int i = 2131168701;
        if (A1T) {
            i = 2131168702;
        }
        this.A02 = A0Y.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
        this.A0R = true;
        this.A03 = new C111685kG(context, this, 1);
    }

    public void A14(boolean z, boolean z2) {
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168690);
        Resources resources = getResources();
        int i2 = 2131168694;
        if (z) {
            i2 = 2131168692;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
        if (z2) {
            Resources resources2 = getResources();
            int i3 = 2131168693;
            if (z) {
                i3 = 2131168691;
            }
            i = resources2.getDimensionPixelSize(i3);
        } else {
            i = 0;
        }
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, i);
    }

    public int getColumnCount() {
        A06(this);
        return this.A01;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean A1R = C17890vO.A1R(configuration.orientation);
        Resources A0Y = AnonymousClass000.A0Y(this);
        int i = 2131168701;
        if (A1R) {
            i = 2131168702;
        }
        this.A02 = A0Y.getDimensionPixelSize(i);
        this.A00 = -1;
        this.A01 = -1;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = -1;
        this.A01 = -1;
        A06(this);
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        int i3 = this.A01;
        gridLayoutManager.A1g(i3 * i3);
        A05(gridLayoutManager, this.A0B);
        A0Y();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations, androidx.recyclerview.widget.GridLayoutManager] */
    public void setAdapter(C38391rD r6) {
        super.setAdapter(r6);
        this.A00 = -1;
        this.A01 = -1;
        A06(this);
        Context context = getContext();
        int i = this.A01;
        C18070vi.A0d(context, 1);
        this.A04 = new GridLayoutManager(context, i * i, 1, false);
        setItemAnimator((C37961qT) null);
        A05(this.A04, r6);
        setLayoutManager(this.A04);
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(context);
    }

    public ShapePickerRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A04(context);
    }
}
