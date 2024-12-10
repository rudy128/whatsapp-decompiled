package com.whatsapp;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C72463Mc;
import X.C74933d9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ListItemWithRightIcon extends C74933d9 {
    public void setDescriptionVisibility(int i) {
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
            if (i != 0) {
                int A05 = C72463Mc.A05(this);
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131167078);
                View A06 = AnonymousClass1HF.A06(this, 2131432090);
                if (AnonymousClass3MW.A1Z(this.A04)) {
                    A06.setPadding(0, A05, dimensionPixelSize, A05);
                } else {
                    A06.setPadding(dimensionPixelSize, A05, 0, A05);
                }
            }
        }
    }

    public int getRootLayoutID() {
        return 2131625855;
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListItemWithRightIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A06 = true;
        A06(attributeSet);
        A04();
    }

    public ListItemWithRightIcon(Context context) {
        super(context, (AttributeSet) null);
        A04();
    }
}
