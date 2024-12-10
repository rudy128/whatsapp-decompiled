package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Km  reason: invalid class name and case insensitive filesystem */
public class C24481Km {
    public String A00 = "static.whatsapp.net";
    public final C24421Kg A01;
    public final AnonymousClass10I A02;
    public final C18030ve A03;
    public final Object A04 = new Object();

    public static void A00(C24481Km r7) {
        C58142kD r3;
        synchronized (r7.A04) {
            AnonymousClass10I r32 = r7.A02;
            C24421Kg r2 = r7.A01;
            r2.getClass();
            r32.CGF(new C146767Qn(r2, 47));
            C59912n5 A0B = r2.A0B();
            String str = "static.whatsapp.net";
            if (A0B != null) {
                List list = A0B.A0C;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            r3 = (C58142kD) it2.next();
                            if ("primary".equals(r3.A08)) {
                                break;
                            }
                        }
                    } else {
                        r3 = (C58142kD) it.next();
                        Set set = r3.A0A;
                        if (set != null && set.contains("1")) {
                            break;
                        }
                    }
                }
                str = r3.A04;
            }
            r7.A00 = str;
        }
    }

    public String A01(String str) {
        if (!C18020vd.A05(C18040vf.A02, this.A03, 2565)) {
            return str;
        }
        A00(this);
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append("wa/static");
        sb.append(parse.getEncodedPath());
        encodedAuthority.encodedPath(sb.toString());
        return C50462Un.A00(Uri.parse(buildUpon.build().toString()).buildUpon(), "_nc_cat", "1").build().toString();
    }

    public C24481Km(C18030ve r2, C24421Kg r3, AnonymousClass10I r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r2;
    }
}
