package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.05K  reason: invalid class name */
public final class AnonymousClass05K extends AccessibilityNodeProvider {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public AnonymousClass05K(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.A00.A0m(i, accessibilityNodeInfo, str, bundle);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        AccessibilityNodeInfo A0J = androidComposeViewAccessibilityDelegateCompat.A0H(i);
        if (androidComposeViewAccessibilityDelegateCompat.A0L && i == androidComposeViewAccessibilityDelegateCompat.A01) {
            androidComposeViewAccessibilityDelegateCompat.A03 = A0J;
        }
        return A0J;
    }

    public AccessibilityNodeInfo findFocus(int i) {
        return createAccessibilityNodeInfo(this.A00.A01);
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A1G(i, i2, bundle);
    }
}
