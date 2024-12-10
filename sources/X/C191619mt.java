package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9mt  reason: invalid class name and case insensitive filesystem */
public final class C191619mt {
    public final A54 A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("PaymentProviderKeyAction", "network", "COMMON");
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final C33711jG A04;
    public final C31061ex A05;
    public final String A06;

    public final void A00(BBF bbf, String str) {
        ArrayList A16 = C108955ca.A16(str, 0);
        C17890vO.A11("action", "get-provider-key", A16);
        C17890vO.A11("provider", str, A16);
        C17890vO.A11("key-scope", this.A06, A16);
        C29621ca A0P = AnonymousClass8BX.A0P(A16);
        AnonymousClass8BW.A1C(this.A05, new C175428yh(this.A02, this.A04, this.A03, this, bbf, 19), A0P);
    }

    public C191619mt(Context context, AnonymousClass1KB r5, C33711jG r6, C31061ex r7, A54 a54, String str) {
        C18070vi.A0w(context, r5, r7, r6, a54);
        this.A02 = context;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = a54;
        this.A06 = str;
    }
}
