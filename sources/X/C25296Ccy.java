package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.Ccy  reason: case insensitive filesystem */
public abstract class C25296Ccy {
    public static String A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
