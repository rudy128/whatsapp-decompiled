package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.4Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C87424Vn {
    public static final int A00(View[] viewArr, int i) {
        int i2 = 0;
        int i3 = 0;
        do {
            if (viewArr[i2] != null) {
                i3++;
            }
            i2++;
        } while (i2 < 4);
        C17960vV.A0F(AnonymousClass000.A1R(i3), "MessageBadgeDrawables/getNextAvailableViewIndex Require >1 non-null badgeViews");
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (viewArr[i5] != null) {
                i4++;
            }
        }
        return i4;
    }

    public static final Drawable A01(Context context, int i, boolean z) {
        int i2;
        C18070vi.A0d(context, 0);
        if (i != 0) {
            i2 = 2131232520;
            if (i != 1) {
                i2 = 2131233511;
            }
        } else {
            i2 = 2131232637;
        }
        int i3 = 2131101872;
        if (z) {
            i3 = AnonymousClass1YL.A00(context, 2130971957, 2131103410);
        }
        return AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, i2), i3);
    }
}
