package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.2jN  reason: invalid class name and case insensitive filesystem */
public final class C57622jN {
    public final AnonymousClass1L9 A00;
    public final C32981i4 A01;
    public final AnonymousClass1LU A02;

    public final void A00(Context context, String str, String str2, boolean z) {
        Intent A0O;
        if (str == null) {
            Log.e("SafeDeepLinkUtils/navigateToUrl url is null");
            return;
        }
        Uri parse = Uri.parse(str);
        C18070vi.A0X(parse);
        if (1 != this.A01.A0E(parse)) {
            A0O = AnonymousClass1LU.A0O(context, parse, 2);
        } else if (z) {
            A0O = AnonymousClass1LU.A1g(context, str, str2, true, true);
        } else {
            this.A00.CGU(context, parse, (AnonymousClass206) null);
            return;
        }
        this.A00.A08(context, A0O);
    }

    public C57622jN(AnonymousClass1L9 r1, C32981i4 r2, AnonymousClass1LU r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
