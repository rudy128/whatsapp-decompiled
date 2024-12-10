package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.CgV  reason: case insensitive filesystem */
public class C25476CgV {
    public final Object A00;

    public C25476CgV(Object obj) {
        this.A00 = obj;
    }

    public static C25476CgV A00(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new C25476CgV(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }
}
