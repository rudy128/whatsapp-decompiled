package X;

import com.whatsapp.util.Log;

/* renamed from: X.66W  reason: invalid class name */
public class AnonymousClass66W extends C133816pX {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public AnonymousClass66W(AnonymousClass66S r2, CharSequence charSequence) {
        this.A01 = r2;
        this.A02 = charSequence;
        A02((String) null);
    }

    public final void A02(String str) {
        AnonymousClass66S r4 = (AnonymousClass66S) this.A01;
        if (!C18020vd.A05(C18040vf.A02, r4.A05, 12694)) {
            Log.e("loadSearchPage/giphy gif api disabled");
            return;
        }
        AnonymousClass3MW.A1T(new AnonymousClass66R(this, r4, (CharSequence) this.A02, str), r4.A0A, 0);
    }

    public final void A03(String str) {
        AnonymousClass66T r4 = (AnonymousClass66T) this.A01;
        if (!C18020vd.A05(C18040vf.A02, r4.A05, 12696)) {
            Log.e("loadSearchPage/tenor gif api disabled");
            return;
        }
        AnonymousClass3MW.A1T(new AnonymousClass66R(this, r4, (CharSequence) this.A02, str), r4.A0A, 0);
    }

    public AnonymousClass66W(AnonymousClass66T r2, CharSequence charSequence) {
        this.A01 = r2;
        this.A02 = charSequence;
        A03((String) null);
    }
}
