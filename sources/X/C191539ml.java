package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9ml  reason: invalid class name and case insensitive filesystem */
public class C191539ml {
    public final C22456B8o A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("PaymentGetTokenIdAction", "network", "COMMON");
    public final Context A02;
    public final AnonymousClass1KB A03;
    public final C33711jG A04;
    public final C31061ex A05;

    public C191539ml(Context context, AnonymousClass1KB r5, C33711jG r6, C31061ex r7, C22456B8o b8o) {
        this.A02 = context;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = b8o;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A00.C3r((String) null);
            return;
        }
        this.A01.A06("starts to fetch token id");
        ArrayList A13 = AnonymousClass000.A13();
        C17890vO.A11("action", "get-token-id", A13);
        C17890vO.A11("credential-id", str, A13);
        C29621ca A0P = AnonymousClass8BX.A0P(A13);
        AnonymousClass8BW.A1C(this.A05, new C175408yf(this.A02, this.A04, this.A03, this, 11), A0P);
    }
}
