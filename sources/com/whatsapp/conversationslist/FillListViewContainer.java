package com.whatsapp.conversationslist;

import X.AnonymousClass112;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;

public final class FillListViewContainer extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillListViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        int measuredHeight;
        ViewParent parent = getParent();
        if (!(parent instanceof ListView) || (viewGroup = (ListView) parent) == null) {
            ViewParent parent2 = getParent();
            C18070vi.A0z(parent2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            viewGroup = (RecyclerView) parent2;
        }
        ViewGroup viewGroup2 = viewGroup;
        int childCount = viewGroup2.getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup2.getChildAt(i4);
            if (C18070vi.A18(childAt, this)) {
                break;
            }
            i3 += childAt.getMeasuredHeight();
        }
        if (AnonymousClass112.A01()) {
            measuredHeight = View.MeasureSpec.getSize(i2);
        } else {
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        int i5 = measuredHeight - i3;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        if (i5 > getMeasuredHeight()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FillListViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ FillListViewContainer(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FillListViewContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
