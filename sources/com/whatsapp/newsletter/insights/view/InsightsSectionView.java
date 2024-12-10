package com.whatsapp.newsletter.insights.view;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import X.C99434so;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;

public final class InsightsSectionView extends LinearLayout {
    public View.OnClickListener A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final View.OnClickListener getRecoverErrorListener() {
        return this.A00;
    }

    public final void setStatus(int i) {
        int i2 = 8;
        if (i == 0) {
            i2 = 0;
        }
        Iterator A002 = C99434so.A00(this, 1);
        while (A002.hasNext()) {
            View A0E = AnonymousClass3MX.A0E(A002);
            if (!C18070vi.A18(A0E.getTag(), "error-view")) {
                A0E.setVisibility(i2);
            }
        }
        View findViewWithTag = findViewWithTag("error-view");
        if (i != 0) {
            int i3 = 2131431668;
            if (i == 1) {
                i3 = 2131431666;
            }
            if (findViewWithTag != null) {
                if (findViewWithTag.getId() != i3) {
                    removeView(findViewWithTag);
                } else {
                    return;
                }
            }
            int i4 = 2131626210;
            if (i == 1) {
                i4 = 2131626209;
            }
            View inflate = AnonymousClass3MZ.A0D(this).inflate(i4, this, false);
            inflate.setTag("error-view");
            if (i == 1) {
                AnonymousClass3Ma.A19(inflate.findViewById(2131431696), this, 0);
            }
            addView(inflate);
        } else if (findViewWithTag != null) {
            removeView(findViewWithTag);
        }
    }

    public final void setRecoverErrorListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        setOrientation(1);
    }

    public /* synthetic */ InsightsSectionView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsSectionView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
