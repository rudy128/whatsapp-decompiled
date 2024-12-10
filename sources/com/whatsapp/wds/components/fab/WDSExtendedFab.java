package com.whatsapp.wds.components.fab;

import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public final class WDSExtendedFab extends MaterialButton {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(2131169423), 1073741824));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971883);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A09;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSExtendedFab(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
