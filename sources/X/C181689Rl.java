package X;

import com.whatsapp.util.Log;

/* renamed from: X.9Rl  reason: invalid class name and case insensitive filesystem */
public abstract class C181689Rl {
    public static final void A00(AnonymousClass1KB r3) {
        C21449AkG akG;
        C18070vi.A0d(r3, 0);
        AnonymousClass1FR r2 = r3.A00;
        if (r2 != null) {
            Log.e("UnrecoverableErrorUtils/show error dialog");
            akG = new C21449AkG((Object) r2, 25);
        } else {
            Log.e("UnrecoverableErrorUtils/show error toast");
            akG = new C21449AkG((Object) r3, 26);
        }
        r3.CGP(akG);
    }
}
