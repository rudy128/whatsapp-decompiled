package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pF  reason: invalid class name and case insensitive filesystem */
public final class C133646pF {
    public BA8 A00;
    public AnonymousClass6VW A01;
    public final List A02;
    public final List A03;

    public final Integer A00(String str) {
        C18070vi.A0d(str, 0);
        BA8 ba8 = this.A00;
        Uri A002 = C26215Cuu.A00(ba8, str);
        if (A002 == null) {
            ba8.CFI("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
        } else {
            for (AnonymousClass6US A012 : this.A02) {
                if (A012.A01(A002)) {
                    return AnonymousClass00R.A00;
                }
            }
            String scheme = A002.getScheme();
            String authority = A002.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Uri is blocked, scheme: ");
            A10.append(scheme);
            ba8.CFI("WebViewUriHandler", AnonymousClass001.A1H(" , authority: ", authority, A10), (Throwable) null);
        }
        return AnonymousClass00R.A0C;
    }

    public final Integer A01(String str) {
        C18070vi.A0d(str, 1);
        BA8 ba8 = this.A00;
        if (C26215Cuu.A00(ba8, str) == null) {
            ba8.CFI("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
            return AnonymousClass00R.A0C;
        }
        Iterator it = this.A03.iterator();
        if (!it.hasNext()) {
            return A00(str);
        }
        it.next();
        throw AnonymousClass000.A0s("launch");
    }

    public C133646pF(BA8 ba8, AnonymousClass6VW r4, List list, List list2) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A03 = A13;
        ArrayList A132 = AnonymousClass000.A13();
        this.A02 = A132;
        A132.addAll(list2);
        A13.addAll(list);
        this.A00 = ba8;
        this.A01 = r4;
    }
}
