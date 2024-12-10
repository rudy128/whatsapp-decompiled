package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83G  reason: invalid class name */
public final class AnonymousClass83G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83G(C1606789m r2, AnonymousClass705 r3, C144137Gd r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        if (r4 != 406) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            X.6Sm r2 = X.C108965cb.A0V(r17)
            r3 = r16
            X.7Gd r0 = r3.this$0
            X.19T r1 = r0.A00
            r0 = 376777540(0x16752b44, float:1.9804595E-25)
            java.lang.String r5 = "case"
            java.lang.String r4 = "userCreateError"
            r1.markerAnnotate((int) r0, (int) r0, (java.lang.String) r5, (java.lang.String) r4)
            X.7Gd r0 = r3.this$0
            X.19T r1 = r0.A00
            r0 = 376777108(0x16752994, float:1.9804062E-25)
            r1.markerAnnotate((int) r0, (int) r0, (java.lang.String) r5, (java.lang.String) r4)
            X.7Gd r12 = r3.this$0
            java.security.cert.X509Certificate r15 = r3.$encryptionCert
            java.security.PublicKey r14 = r3.$passwordPublicKey
            java.lang.Integer r13 = r3.$passwordKeyId
            X.89m r10 = r3.$callback
            X.705 r11 = r3.$operationRetryState
            X.Akd r9 = new X.Akd
            r9.<init>((X.C1606789m) r10, (X.AnonymousClass705) r11, (X.C144137Gd) r12, (java.lang.Integer) r13, (java.security.PublicKey) r14, (java.security.cert.X509Certificate) r15)
            X.7Gd r0 = r3.this$0
            X.00H r0 = r0.A03
            java.lang.Object r8 = r0.get()
            X.71E r8 = (X.AnonymousClass71E) r8
            X.89m r6 = r3.$callback
            X.705 r7 = r3.$operationRetryState
            X.7Gd r0 = r3.this$0
            X.82q r5 = new X.82q
            r5.<init>(r6, r7, r0)
            X.C18070vi.A0j(r6, r7)
            r1 = 3
            int r4 = X.C122936Sm.A00(r2)
            X.00H r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.1mP r0 = (X.C35541mP) r0
            java.lang.String r3 = X.AnonymousClass71E.A00(r4)
            r0.A03(r3, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SupportUser/Create User Error: "
            X.C17900vP.A0g(r0, r3, r1)
            r0 = 400(0x190, float:5.6E-43)
            if (r4 == r0) goto L_0x0089
            r0 = 500(0x1f4, float:7.0E-43)
            if (r4 == r0) goto L_0x007f
            r0 = 503(0x1f7, float:7.05E-43)
            if (r4 == r0) goto L_0x007f
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x007b
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x0089
        L_0x0078:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x007b:
            X.AnonymousClass71E.A01(r6, r7, r8, r2, r5)
            goto L_0x0078
        L_0x007f:
            boolean r0 = r7.A04()
            if (r0 == 0) goto L_0x0089
            r9.run()
            goto L_0x0078
        L_0x0089:
            r6.Bsw(r2)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83G.invoke(java.lang.Object):java.lang.Object");
    }
}
