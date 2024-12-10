package X;

import com.whatsapp.util.Log;

/* renamed from: X.1D8  reason: invalid class name */
public final class AnonymousClass1D8 {
    public final AnonymousClass190 A00;

    public AnonymousClass1D8(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void A00(Exception exc) {
        Log.e("wamsysJniBridge/caught exception", exc);
        this.A00.A0G("wamsysJniBridge/caught exception", exc.getMessage(), true);
    }
}
