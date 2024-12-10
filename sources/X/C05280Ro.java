package X;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.0Ro  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C05280Ro implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public final void onTouchExplorationStateChanged(boolean z) {
        this.A00.A08 = this.A00.A0M.getEnabledAccessibilityServiceList(-1);
    }

    public /* synthetic */ C05280Ro(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }
}
