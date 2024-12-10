package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.CgW  reason: case insensitive filesystem */
public class C25477CgW {
    public final Object A00;

    public C25477CgW(Object obj) {
        this.A00 = obj;
    }

    public static C25477CgW A00(float f, float f2, float f3, int i) {
        return new C25477CgW(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
    }
}
