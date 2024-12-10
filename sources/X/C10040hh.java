package X;

import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public final class C10040hh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10040hh(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.this$0.A1c().getParent().requestSendAccessibilityEvent(this.this$0.A1c(), (AccessibilityEvent) obj));
    }
}
