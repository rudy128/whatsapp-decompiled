package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.0Rn  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0Rn implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public final void onAccessibilityStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.A10(this.A00, z);
    }

    public /* synthetic */ AnonymousClass0Rn(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }
}
