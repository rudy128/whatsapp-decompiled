package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;

/* renamed from: X.2Th  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C50142Th {
    public static Drawable A00(C34041jo r1, int i) {
        AnonymousClass1FL A1B = ((Fragment) r1).A1B();
        if (!(A1B instanceof C23311Fn)) {
            return null;
        }
        C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.home.HomeActivityInterface");
        Context context = (Context) ((C23311Fn) A1B);
        if (C22891Dp.A05) {
            return AnonymousClass4aX.A01(context, i);
        }
        return null;
    }
}
