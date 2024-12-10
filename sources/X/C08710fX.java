package X;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Map;

/* renamed from: X.0fX  reason: invalid class name and case insensitive filesystem */
public final class C08710fX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C06120Xa $scrollObservationScope;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08710fX(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C06120Xa r3) {
        super(0);
        this.$scrollObservationScope = r3;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void A00() {
        float f;
        float f2;
        AnonymousClass0XV r2;
        C06120Xa r0 = this.$scrollObservationScope;
        AnonymousClass0Js r5 = r0.A00;
        AnonymousClass0Js r4 = r0.A01;
        Float f3 = r0.A02;
        Float f4 = r0.A03;
        if (r5 == null || f3 == null) {
            f = 0.0f;
        } else {
            f = AnonymousClass000.A04(r5.A01().invoke()) - f3.floatValue();
        }
        if (r4 == null || f4 == null) {
            f2 = 0.0f;
        } else {
            f2 = AnonymousClass000.A04(r4.A01().invoke()) - f4.floatValue();
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            int A02 = this.this$0.A00(this.$scrollObservationScope.A04);
            AnonymousClass0HU r22 = (AnonymousClass0HU) AnonymousClass000.A0w(this.this$0.A0c(), this.this$0.A01);
            if (r22 != null) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                try {
                    AccessibilityNodeInfo A0I = androidComposeViewAccessibilityDelegateCompat.A03;
                    if (A0I != null) {
                        A0I.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.A08(r22));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            this.this$0.A1c().invalidate();
            Map A0d = this.this$0.A0c();
            Integer valueOf = Integer.valueOf(A02);
            AnonymousClass0HU r02 = (AnonymousClass0HU) A0d.get(valueOf);
            if (!(r02 == null || (r2 = r02.A01.A03) == null)) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                if (r5 != null) {
                    androidComposeViewAccessibilityDelegateCompat2.A0X.put(valueOf, r5);
                }
                if (r4 != null) {
                    androidComposeViewAccessibilityDelegateCompat2.A0Y.put(valueOf, r4);
                }
                androidComposeViewAccessibilityDelegateCompat2.A0s(r2);
            }
        }
        if (r5 != null) {
            this.$scrollObservationScope.A02 = (Float) r5.A01().invoke();
        }
        if (r4 != null) {
            this.$scrollObservationScope.A03 = (Float) r4.A01().invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
