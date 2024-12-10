package X;

import java.io.IOException;

/* renamed from: X.7Gk  reason: invalid class name and case insensitive filesystem */
public class C144207Gk implements C72383Ls {
    public final int A00;
    public final Object A01;

    public C144207Gk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrC(Exception exc) {
        if (this.A00 != 0) {
            C31081ez.A01(C17900vP.A0C("CompanionWaffleCertificateHelper/executeWithValidCertificate/onDeliveryFailure ", C18070vi.A0K(exc), exc));
            ((C30391dr) this.A01).resumeWith(new AnonymousClass6OB(new IOException(exc), true));
            return;
        }
        C31081ez.A01("WfsRefreshTokenIqHelper/sendRefreshTokenIq/validateCertAndSignature onDeliveryFailure");
        ((C130766jy) this.A01).A00.A11();
    }

    public void Bsw(Exception exc) {
        if (this.A00 != 0) {
            C31081ez.A01(C17900vP.A0C("CompanionWaffleCertificateHelper/executeWithValidCertificate/onError ", C18070vi.A0K(exc), exc));
            ((C30391dr) this.A01).resumeWith(AnonymousClass6OB.A00(exc));
            return;
        }
        C31081ez.A01("WfsRefreshTokenIqHelper/sendRefreshTokenIq/validateCertAndSignature onError");
        ((C130766jy) this.A01).A00.A11();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7m(java.lang.Integer r20, java.security.PublicKey r21, java.security.cert.X509Certificate r22, java.security.cert.X509Certificate r23) {
        /*
            r19 = this;
            r4 = r19
            int r1 = r4.A00
            r0 = 0
            r2 = r22
            if (r1 == 0) goto L_0x0019
            X.C18070vi.A0d(r2, r0)
            java.lang.Object r1 = r4.A01
            X.1dr r1 = (X.C30391dr) r1
            X.6OA r0 = new X.6OA
            r0.<init>(r2)
            r1.resumeWith(r0)
            return
        L_0x0019:
            X.C18070vi.A0d(r2, r0)
            java.lang.String r0 = "WfsRefreshTokenIqHelper/sendRefreshTokenIq/validateCertAndSignature success"
            X.C31081ez.A02(r0)
            X.7Ik r5 = new X.7Ik
            r5.<init>()
            java.lang.Class r3 = java.lang.Long.TYPE
            java.lang.Object r7 = r4.A01
            X.6jy r7 = (X.C130766jy) r7
            X.0z4 r4 = r7.A00
            java.lang.String r0 = r4.A0p()
            if (r0 == 0) goto L_0x0067
            java.lang.Long r1 = X.C108965cb.A0m(r0)
        L_0x0038:
            java.lang.String r0 = "WaFbid"
            X.77e r10 = new X.77e
            r10.<init>(r5, r3, r1, r0)
            X.7Ik r5 = new X.7Ik
            r5.<init>()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r4)
            java.lang.String r0 = "pref_wfs_pw"
            r11 = 0
            java.lang.String r1 = r1.getString(r0, r11)
            java.lang.String r0 = "WaFbPassword"
            X.77e r6 = new X.77e
            r6.<init>(r5, r3, r1, r0)
            X.00H r0 = r7.A05
            java.lang.Object r5 = r0.get()
            X.1lc r5 = (X.C35081lc) r5
            r0 = 1
            X.7GX r3 = new X.7GX
            r3.<init>(r7, r0)
            goto L_0x0069
        L_0x0067:
            r1 = 0
            goto L_0x0038
        L_0x0069:
            java.security.KeyPair r7 = X.C20059A5i.A02()     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            X.C18070vi.A0b(r7)     // Catch:{ NoSuchAlgorithmException -> 0x009e }
            java.lang.String r1 = X.C108985cd.A0p(r7)
            java.lang.Object r0 = r6.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{  }
            org.json.JSONObject r0 = X.C35081lc.A01(r5, r1, r0, r11)     // Catch:{  }
            java.lang.String r1 = r0.toString()     // Catch:{  }
            X.C18070vi.A0b(r1)     // Catch:{  }
            X.00H r0 = r5.A04     // Catch:{  }
            X.6h6 r9 = X.C108975cc.A0I(r0, r1, r2)     // Catch:{  }
            X.11P r0 = r5.A00     // Catch:{  }
            long r17 = X.AnonymousClass11P.A00(r0)     // Catch:{  }
            r16 = -1
            X.6Oe r8 = new X.6Oe     // Catch:{  }
            r13 = r11
            r14 = r11
            r15 = r11
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{  }
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            r3.Bsw(r0)
            goto L_0x00c2
        L_0x00a3:
            X.00H r0 = r5.A07
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.878 r2 = (X.AnonymousClass878) r2
            java.security.PrivateKey r14 = r7.getPrivate()
            X.7Og r1 = new X.7Og
            r1.<init>(r3, r6, r10, r5)
            r0 = 46
            X.7GP r9 = new X.7GP
            r10 = r3
            r11 = r1
            r12 = r5
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r2.CHQ(r9, r8, r0)
        L_0x00c2:
            r4.A11()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144207Gk.C7m(java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate, java.security.cert.X509Certificate):void");
    }
}
