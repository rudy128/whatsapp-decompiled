package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.D4j  reason: case insensitive filesystem */
public class C26569D4j implements View.OnAttachStateChangeListener {
    public final /* synthetic */ BIm A00;

    public C26569D4j(BIm bIm) {
        this.A00 = bIm;
    }

    public void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        BIm bIm = this.A00;
        if (bIm.A0A != null && (accessibilityManager = bIm.A0E) != null && bIm.isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(new D5L(bIm.A0A));
        }
    }

    public void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        BIm bIm = this.A00;
        E0F e0f = bIm.A0A;
        if (e0f != null && (accessibilityManager = bIm.A0E) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new D5L(e0f));
        }
    }
}
