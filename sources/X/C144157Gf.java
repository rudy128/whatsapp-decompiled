package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Gf  reason: invalid class name and case insensitive filesystem */
public abstract class C144157Gf implements C35071lb {
    public final A0V A00;
    public final C35021lW A01;
    public final String A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass61O A04;
    public final C137206v5 A05;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CBb(X.AnonymousClass732 r5, X.C1606789m r6, X.AnonymousClass705 r7, java.lang.Integer r8, java.lang.String r9, java.security.PublicKey r10, java.security.cert.X509Certificate r11) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000c
            java.lang.String r0 = "User is null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            r6.Bsw(r0)
            return
        L_0x000c:
            java.lang.String r3 = X.AnonymousClass732.A01(r5)
            java.security.KeyPair r0 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x0037 }
            java.security.PublicKey r0 = r0.getPublic()
            java.lang.String r2 = X.C20059A5i.A01(r0)
            X.77e r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "DELETE_USER"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.A0V r0 = r4.A00     // Catch:{  }
            X.6h6 r3 = r0.A01(r1, r11)     // Catch:{  }
            X.61O r2 = r4.A04
            X.61Y r1 = new X.61Y
            r1.<init>(r4, r6, r6)
            r0 = 19
            r2.CHQ(r1, r3, r0)
            return
        L_0x0037:
            r0 = move-exception
            r6.Bsw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144157Gf.CBb(X.732, X.89m, X.705, java.lang.Integer, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public C144157Gf(AnonymousClass11P r1, AnonymousClass61O r2, A0V a0v, C137206v5 r4, C35021lW r5, String str) {
        this.A03 = r1;
        this.A00 = a0v;
        this.A05 = r4;
        this.A04 = r2;
        this.A01 = r5;
        this.A02 = str;
    }

    private String A00(C1418477e r5, String str, String str2, String str3) {
        JSONObject A0h = C108995ce.A0h();
        A0h.put("operation", str2);
        A0h.put("timestamp", AnonymousClass11P.A00(this.A03));
        C108985cd.A1J(str, A0h);
        A0h.put("password", str3);
        if (r5 != null) {
            A0h.put("fbid", String.valueOf(C108985cd.A09(r5)));
        }
        return A0h.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CBW(X.C1606789m r5, X.AnonymousClass705 r6, java.lang.Integer r7, java.security.PublicKey r8, java.security.cert.X509Certificate r9) {
        /*
            r4 = this;
            java.security.KeyPair r8 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x002b }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.C20059A5i.A01(r0)
            java.lang.String r7 = X.C20059A5i.A00()
            java.lang.String r1 = r4.A02     // Catch:{  }
            r0 = 0
            java.lang.String r1 = r4.A00(r0, r2, r1, r7)     // Catch:{  }
            X.A0V r0 = r4.A00     // Catch:{  }
            X.6h6 r2 = r0.A01(r1, r9)     // Catch:{  }
            X.61O r1 = r4.A04
            X.61Z r3 = new X.61Z
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 20
            r1.CHQ(r3, r2, r0)
            return
        L_0x002b:
            r0 = move-exception
            r5.Bsw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144157Gf.CBW(X.89m, X.705, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public final void CBX(C1606789m r2, AnonymousClass705 r3, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }

    public /* bridge */ /* synthetic */ void CBY(C1606789m r2, AnonymousClass705 r3, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }

    public final void CBd(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CBe(X.AnonymousClass732 r5, X.C1606789m r6, X.AnonymousClass705 r7, java.lang.Integer r8, java.security.PublicKey r9, java.security.cert.X509Certificate r10) {
        /*
            r4 = this;
            java.lang.String r3 = X.AnonymousClass732.A01(r5)
            java.security.KeyPair r8 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x002c }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r2 = X.C20059A5i.A01(r0)
            X.77e r1 = r5.A04     // Catch:{  }
            java.lang.String r0 = "GET_ACCESS_TOKEN"
            java.lang.String r1 = r4.A00(r1, r2, r0, r3)     // Catch:{  }
            X.A0V r0 = r4.A00     // Catch:{  }
            X.6h6 r2 = r0.A01(r1, r10)     // Catch:{  }
            X.61O r1 = r4.A04
            X.61a r3 = new X.61a
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 19
            r1.CHQ(r3, r2, r0)
            return
        L_0x002c:
            r0 = move-exception
            r6.Bsw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144157Gf.CBe(X.732, X.89m, X.705, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }
}
