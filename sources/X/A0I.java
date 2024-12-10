package X;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class A0I {
    public final C189279ip A00;
    public final AnonymousClass10I A01;
    public final AtomicBoolean A02 = C108965cb.A0w();
    public final C18600wl A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass11E A05;
    public final C196109uT A06;
    public final C18030ve A07;
    public final AnonymousClass1OX A08;

    public final C172008sd A01(C172008sd r4, AnonymousClass9XS r5, String str, Throwable th) {
        if (!this.A05.A09()) {
            r4 = C171988sb.A00;
        }
        if (r5 != null) {
            r5.A00.countDown();
        }
        AnonymousClass190 r1 = this.A04;
        String str2 = r4.A00;
        if (th != null) {
            r1.A0E(str2, str, th);
            return r4;
        }
        r1.A0G(str2, str, false);
        return r4;
    }

    public static final AnonymousClass9ML A00(A0I a0i, AnonymousClass9XS r7, C138506xC r8) {
        C19978A1o a1o;
        String str;
        a0i.A02.set(false);
        if (r8.A00 != 0 || (a1o = (C19978A1o) r8.A03.A00) == null) {
            return a0i.A01(C171968sZ.A00, r7, "Asset verification response is not in expected format.", (Throwable) null);
        }
        C196109uT r5 = a0i.A06;
        JSONObject A15 = C17880vN.A15();
        A15.put("pub_key", a1o.A02);
        A15.put("prev_pub_key", a1o.A01);
        Long l = a1o.A00;
        if (l != null) {
            try {
                str = AnonymousClass8BS.A0q("yyyyMMdd'T'HHmmss'Z'").format(new Date(l.longValue()));
            } catch (ParseException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        C17880vN.A1E(C17890vO.A0A(r5.A01), "extensions_asset_verification", AnonymousClass8BV.A0r(str, "prev_pub_key_expiry", A15));
        C172018se r1 = new C172018se(a1o);
        if (r7 != null) {
            r7.A00.countDown();
        }
        return r1;
    }

    public A0I(AnonymousClass190 r2, C189279ip r3, AnonymousClass11E r4, C196109uT r5, C18030ve r6, AnonymousClass10I r7, C18600wl r8, AnonymousClass1OX r9) {
        C18070vi.A0w(r5, r3, r2, r4, r7);
        C18070vi.A0q(r6, r8, r9);
        this.A06 = r5;
        this.A00 = r3;
        this.A04 = r2;
        this.A05 = r4;
        this.A01 = r7;
        this.A07 = r6;
        this.A03 = r8;
        this.A08 = r9;
    }
}
