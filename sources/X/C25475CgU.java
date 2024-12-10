package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.CgU  reason: case insensitive filesystem */
public class C25475CgU {
    public final Object A00;

    public C25475CgU(Object obj) {
        this.A00 = obj;
    }

    public static C25475CgU A00(int i, int i2, int i3, boolean z) {
        return new C25475CgU(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }
}
