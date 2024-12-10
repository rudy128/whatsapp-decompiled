package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83J  reason: invalid class name */
public final class AnonymousClass83J extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83J(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0088, code lost:
        if (r5 != 406) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            X.6Sm r0 = X.C108965cb.A0V(r16)
            X.7Gd r1 = r15.this$0
            X.19T r2 = r1.A00
            r1 = 376777540(0x16752b44, float:1.9804595E-25)
            java.lang.String r4 = "case"
            java.lang.String r3 = "refetchTokenError"
            r2.markerAnnotate((int) r1, (int) r1, (java.lang.String) r4, (java.lang.String) r3)
            X.7Gd r1 = r15.this$0
            X.19T r2 = r1.A00
            r1 = 376777108(0x16752994, float:1.9804062E-25)
            r2.markerAnnotate((int) r1, (int) r1, (java.lang.String) r4, (java.lang.String) r3)
            X.7Gd r11 = r15.this$0
            java.security.cert.X509Certificate r14 = r15.$encryptionCert
            X.732 r8 = r15.$userEntity
            java.security.PublicKey r13 = r15.$passwordPublicKey
            java.lang.Integer r12 = r15.$passwordKeyId
            X.89m r9 = r15.$callback
            X.705 r10 = r15.$operationRetryState
            r1 = 2
            X.AkV r7 = new X.AkV
            r7.<init>((X.AnonymousClass732) r8, (X.C1606789m) r9, (X.AnonymousClass705) r10, (X.C144137Gd) r11, (java.lang.Integer) r12, (java.security.PublicKey) r13, (java.security.cert.X509Certificate) r14)
            X.7Gd r2 = r15.this$0
            X.00H r2 = r2.A03
            java.lang.Object r3 = r2.get()
            X.71E r3 = (X.AnonymousClass71E) r3
            X.89m r9 = r15.$callback
            X.705 r10 = r15.$operationRetryState
            X.7Gd r11 = r15.this$0
            X.732 r4 = r15.$userEntity
            X.835 r2 = new X.835
            r2.<init>(r4, r9, r10, r11)
            java.security.cert.X509Certificate r14 = r15.$encryptionCert
            java.security.PublicKey r13 = r15.$passwordPublicKey
            java.lang.Integer r12 = r15.$passwordKeyId
            X.7wb r8 = new X.7wb
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4 = 1
            X.C18070vi.A0d(r9, r4)
            X.C18070vi.A0d(r10, r1)
            int r5 = X.C122936Sm.A00(r0)
            X.00H r1 = r3.A01
            java.lang.Object r4 = r1.get()
            X.1mP r4 = (X.C35541mP) r4
            java.lang.String r6 = X.AnonymousClass71E.A00(r5)
            r1 = 7
            r4.A03(r6, r1)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SupportUser/Refresh Token Error: "
            X.C17900vP.A0g(r1, r6, r4)
            r1 = 400(0x190, float:5.6E-43)
            if (r5 == r1) goto L_0x00a5
            r1 = 500(0x1f4, float:7.0E-43)
            if (r5 == r1) goto L_0x0097
            r1 = 503(0x1f7, float:7.05E-43)
            if (r5 == r1) goto L_0x0097
            r1 = 405(0x195, float:5.68E-43)
            if (r5 == r1) goto L_0x008d
            r1 = 406(0x196, float:5.69E-43)
            if (r5 == r1) goto L_0x00a1
        L_0x008a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008d:
            boolean r1 = r10.A03()
            if (r1 != 0) goto L_0x00a5
            X.AnonymousClass71E.A01(r9, r10, r3, r0, r2)
            goto L_0x008a
        L_0x0097:
            boolean r1 = r10.A04()
            if (r1 == 0) goto L_0x00a1
            r7.run()
            goto L_0x008a
        L_0x00a1:
            r9.Bsw(r0)
            goto L_0x008a
        L_0x00a5:
            X.00H r0 = r3.A00
            X.1lS r0 = X.C108945cZ.A0f(r0)
            X.1lW r1 = X.C35021lW.A08
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1j8 r0 = (X.C33631j8) r0
            r0.A07(r1)
            r8.invoke()
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83J.invoke(java.lang.Object):java.lang.Object");
    }
}
