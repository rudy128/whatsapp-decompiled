package X;

import android.text.Html;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9yN  reason: invalid class name and case insensitive filesystem */
public final class C198459yN {
    public int A00;
    public List A01 = A00(this);
    public boolean A02 = Locale.getDefault().getLanguage().equals("pt");
    public final C18030ve A03;
    public final AnonymousClass118 A04;

    public static final List A00(C198459yN r6) {
        boolean z = r6.A02;
        C18030ve r1 = r6.A03;
        int i = 2010;
        if (z) {
            i = 2011;
        }
        List A0R = AnonymousClass1YF.A0R(r1.A0I(i), new char[]{':'});
        ArrayList A0D = C29351c6.A0D(A0R);
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(AnonymousClass3MW.A05(r6.A04).getString(2131887065));
            A10.append(" \"");
            A10.append(Html.fromHtml(A0v));
            A10.append('\"');
            C108955ca.A1U(A10, A0D);
        }
        return A0D;
    }

    public C198459yN(AnonymousClass118 r3, C18030ve r4) {
        C18070vi.A0j(r3, r4);
        this.A04 = r3;
        this.A03 = r4;
    }
}
