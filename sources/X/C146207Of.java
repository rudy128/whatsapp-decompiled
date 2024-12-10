package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Of  reason: invalid class name and case insensitive filesystem */
public final class C146207Of implements AnonymousClass89X {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass732 A01;
    public final /* synthetic */ C1606789m A02;
    public final /* synthetic */ AnonymousClass705 A03;
    public final /* synthetic */ C35081lc A04;
    public final /* synthetic */ PublicKey A05;
    public final /* synthetic */ X509Certificate A06;

    public C146207Of(AnonymousClass732 r1, C1606789m r2, AnonymousClass705 r3, C35081lc r4, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A04 = r4;
        this.A06 = x509Certificate;
        this.A01 = r1;
        this.A05 = publicKey;
        this.A00 = i;
        this.A02 = r2;
        this.A03 = r3;
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/getNonceAndReactivateUser: get nonce error", 0);
        this.A02.Bsw(exc);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r29) {
        /*
            r28 = this;
            r10 = r29
            X.77e r10 = (X.C1418477e) r10
            java.lang.String r0 = "AccountLinkingFbUserEntityOperationHelper/getNonceAndReactivateUser: get nonce success"
            r8 = 0
            X.C18070vi.A0d(r0, r8)
            r0 = r28
            X.1lc r7 = r0.A04
            java.security.cert.X509Certificate r6 = r0.A06
            X.732 r5 = r0.A01
            java.security.PublicKey r4 = r0.A05
            int r3 = r0.A00
            X.89m r2 = r0.A02
            X.705 r13 = r0.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = X.AnonymousClass6Y9.A00(r2, r0, r4)
            if (r0 == 0) goto L_0x00ca
            java.security.KeyPair r24 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r24)     // Catch:{  }
            java.lang.String r9 = X.C108985cd.A0p(r24)
            X.77e r0 = r5.A05     // Catch:{ NoSuchAlgorithmException -> 0x00c6 }
            java.lang.String r0 = X.C108985cd.A0m(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00c6 }
            java.lang.String r1 = X.C35081lc.A00(r7, r0, r4, r3)     // Catch:{ NoSuchAlgorithmException -> 0x00c6 }
            java.lang.Object r0 = r10.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{  }
            org.json.JSONObject r0 = X.C35081lc.A01(r7, r9, r1, r0)     // Catch:{  }
            java.lang.String r1 = r0.toString()     // Catch:{  }
            X.C18070vi.A0b(r1)     // Catch:{  }
            X.00H r0 = r7.A04     // Catch:{  }
            X.6h6 r0 = X.C108975cc.A0I(r0, r1, r6)     // Catch:{  }
            X.11P r1 = r7.A00     // Catch:{  }
            long r22 = X.AnonymousClass11P.A00(r1)     // Catch:{  }
            X.77e r10 = r5.A04     // Catch:{  }
            X.00H r12 = r7.A08
            java.lang.String r15 = X.C17890vO.A0T(r12)
            byte[] r21 = X.C35081lc.A09(r10, r7)
            if (r21 != 0) goto L_0x006b
            java.lang.String r0 = "null fbId"
            X.C108965cb.A1D(r2, r0)
            return
        L_0x006b:
            byte[] r11 = r0.A01
            X.C18070vi.A0W(r11)
            byte[] r9 = r0.A02
            X.C18070vi.A0W(r9)
            byte[] r1 = r0.A00
            X.C18070vi.A0W(r1)
            byte[] r0 = r0.A03
            X.C18070vi.A0W(r0)
            java.lang.Object r10 = r10.A00
            X.C17960vV.A07(r10)
            java.lang.String r16 = java.lang.String.valueOf(r10)
            X.9F4 r14 = new X.9F4
            r19 = r1
            r20 = r0
            r18 = r9
            r17 = r11
            r14.<init>((java.lang.String) r15, (java.lang.String) r16, (byte[]) r17, (byte[]) r18, (byte[]) r19, (byte[]) r20, (byte[]) r21, (long) r22)
            java.lang.String r0 = "AccountLinkingFbUserEntityOperationHelper/performReactivateUser: sending reactivate state request"
            X.C18070vi.A0d(r0, r8)
            X.6jm r1 = new X.6jm
            r22 = r13
            r23 = r7
            r25 = r4
            r26 = r6
            r27 = r3
            r19 = r1
            r20 = r5
            r21 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            X.1OZ r2 = X.C17880vN.A0U(r12)
            java.lang.Object r0 = r14.A00
            X.1ca r0 = (X.C29621ca) r0
            X.6P2 r3 = new X.6P2
            r3.<init>(r1, r14)
            r6 = 451(0x1c3, float:6.32E-43)
            r7 = 32000(0x7d00, double:1.581E-319)
            r4 = r0
            r5 = r15
            r2.A0N(r3, r4, r5, r6, r7)
            return
        L_0x00c6:
            r0 = move-exception
            r2.Bsw(r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146207Of.onSuccess(java.lang.Object):void");
    }
}
