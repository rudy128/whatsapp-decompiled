package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.0RY  reason: invalid class name */
public final class AnonymousClass0RY implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat A00;

    public AnonymousClass0RY(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.A00 = androidComposeViewAccessibilityDelegateCompat;
    }

    public void onViewAttachedToWindow(View view) {
        ContentCaptureSession A002;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        AccessibilityManager A0G = androidComposeViewAccessibilityDelegateCompat.A0M;
        A0G.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0S);
        A0G.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0T);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AnonymousClass0FT.A00(view);
        }
        AnonymousClass0NP r1 = null;
        if (i >= 29 && (A002 = AnonymousClass0FS.A00(view)) != null) {
            r1 = AnonymousClass0NP.A00(view, A002);
        }
        androidComposeViewAccessibilityDelegateCompat.A1l(r1);
    }

    public void onViewDetachedFromWindow(View view) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.A00;
        androidComposeViewAccessibilityDelegateCompat.A0R.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.A0W);
        AccessibilityManager A0G = androidComposeViewAccessibilityDelegateCompat.A0M;
        A0G.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0S);
        A0G.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.A0T);
        androidComposeViewAccessibilityDelegateCompat.A1l((AnonymousClass0NP) null);
    }
}
