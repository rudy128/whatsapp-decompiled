package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.WaTextView;

/* renamed from: X.1Y5  reason: invalid class name */
public abstract class AnonymousClass1Y5 {
    public static void A02(View view, int i) {
        A0B(view, new C43061zB(16, i));
    }

    public static void A04(View view, int i) {
        A0B(view, new C43061zB(1, i));
    }

    public static void A05(View view, int i) {
        A0B(view, new C43061zB(32, i));
    }

    public static void A06(View view, String str) {
        A0B(view, new C45722Bk(str));
    }

    public static void A07(View view, String str) {
        AnonymousClass1HF.A0f(view, new C110905hT(0, str, view));
    }

    public static void A09(View view, boolean z) {
        AnonymousClass1HF.A0f(view, new C451227b(z, 1));
    }

    public static void A0A(View view, boolean z) {
        AnonymousClass1HF.A0f(view, new C451227b(z, 0));
    }

    public static void A01(View view) {
        AnonymousClass1HF.A0f(view, new AnonymousClass1XU());
    }

    public static void A03(View view, int i) {
        String string;
        if (i == 0) {
            string = null;
        } else {
            string = view.getContext().getString(i);
        }
        view.setContentDescription(string);
    }

    public static void A08(View view, String str, String str2, String str3) {
        AnonymousClass1HF.A0f(view, new C43401zk(str, str2, str3));
    }

    public static void A0B(View view, C43061zB... r2) {
        AnonymousClass1HF.A0f(view, new C43071zC(r2));
    }

    public static void A0C(WaTextView waTextView, AnonymousClass11C r2, C18030ve r3) {
        waTextView.setMovementMethod(new C39441t5(r3));
        AnonymousClass1HF.A0f(waTextView, new C39411t2(waTextView, r2));
    }

    public static boolean A0D(AccessibilityManager accessibilityManager) {
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    public static void A00(Context context, AnonymousClass11C r4, CharSequence charSequence) {
        AccessibilityManager A0M = r4.A0M();
        if (A0M != null && A0M.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName("android.widget.Button");
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            A0M.sendAccessibilityEvent(obtain);
        }
    }
}
