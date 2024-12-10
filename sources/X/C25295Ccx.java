package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.Ccx  reason: case insensitive filesystem */
public abstract class C25295Ccx {
    public static CharSequence A00(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void A01(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
