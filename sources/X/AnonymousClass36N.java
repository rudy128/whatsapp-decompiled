package X;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigDecimal;

/* renamed from: X.36N  reason: invalid class name */
public final class AnonymousClass36N implements C437420t {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final C18030ve A02;

    public AnonymousClass3KT BXT(AnonymousClass206 r7) {
        String str;
        BigDecimal bigDecimal;
        C18070vi.A0d(r7, 0);
        AnonymousClass22U r72 = (AnonymousClass22U) r7;
        C18000vb r5 = this.A01;
        if (!TextUtils.isEmpty(r72.A09)) {
            str = r72.A09;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(r72.A07)) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" ");
            str = AnonymousClass000.A0y(r72.A07, A11);
        }
        String str2 = r72.A06;
        if (!(str2 == null || (bigDecimal = r72.A0B) == null)) {
            StringBuilder A112 = AnonymousClass000.A11(str);
            A112.append(" ");
            str = AnonymousClass000.A0y(new A6S(str2).A03(r5, bigDecimal, true), A112);
        }
        C18070vi.A0X(str);
        return C690335q.A01(str);
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        C56302hF r3 = C61522pp.A03;
        Context context = this.A00.A00;
        C18070vi.A0X(context);
        return C690335q.A00(r3, C50062Sz.A00(context, this.A01, this.A02, (AnonymousClass22U) r5), "🛒", context.getString(2131889019));
    }

    public AnonymousClass36N(AnonymousClass118 r1, C18000vb r2, C18030ve r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
