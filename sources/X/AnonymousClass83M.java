package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83M  reason: invalid class name */
public final class AnonymousClass83M extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ AnonymousClass732 $userEntity;
    public final /* synthetic */ C144137Gd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83M(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (r4 != 406) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            X.6Sm r0 = X.C108965cb.A0V(r16)
            X.7Gd r10 = r15.this$0
            java.security.cert.X509Certificate r14 = r15.$encryptionCert
            X.732 r7 = r15.$userEntity
            java.security.PublicKey r13 = r15.$passwordPublicKey
            java.lang.Integer r11 = r15.$passwordKeyId
            X.89m r8 = r15.$callback
            X.705 r9 = r15.$operationRetryState
            java.lang.String r12 = r15.$userDeleteReason
            r1 = 2
            X.7RG r6 = new X.7RG
            r6.<init>((X.AnonymousClass732) r7, (X.C1606789m) r8, (X.AnonymousClass705) r9, (X.C144137Gd) r10, (java.lang.Integer) r11, (java.lang.String) r12, (java.security.PublicKey) r13, (java.security.cert.X509Certificate) r14)
            X.7Gd r2 = r15.this$0
            X.00H r2 = r2.A03
            java.lang.Object r2 = r2.get()
            X.71E r2 = (X.AnonymousClass71E) r2
            X.89m r9 = r15.$callback
            X.705 r10 = r15.$operationRetryState
            X.7Gd r11 = r15.this$0
            X.732 r8 = r15.$userEntity
            java.lang.String r12 = r15.$userDeleteReason
            X.83D r7 = new X.83D
            r7.<init>(r8, r9, r10, r11, r12)
            r3 = 1
            X.C18070vi.A0d(r9, r3)
            X.C18070vi.A0d(r10, r1)
            int r4 = X.C122936Sm.A00(r0)
            X.00H r1 = r2.A01
            java.lang.Object r3 = r1.get()
            X.1mP r3 = (X.C35541mP) r3
            java.lang.String r5 = X.AnonymousClass71E.A00(r4)
            r1 = 6
            r3.A03(r5, r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SupportUser/Delete User Error: "
            X.C17900vP.A0g(r1, r5, r3)
            r1 = 400(0x190, float:5.6E-43)
            if (r4 != r1) goto L_0x0062
            r0 = 0
            r9.C7I(r0)
        L_0x005f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0062:
            r1 = 500(0x1f4, float:7.0E-43)
            if (r4 == r1) goto L_0x0077
            r1 = 503(0x1f7, float:7.05E-43)
            if (r4 == r1) goto L_0x0077
            r1 = 405(0x195, float:5.68E-43)
            if (r4 == r1) goto L_0x0073
            r1 = 406(0x196, float:5.69E-43)
            if (r4 == r1) goto L_0x0081
            goto L_0x005f
        L_0x0073:
            X.AnonymousClass71E.A01(r9, r10, r2, r0, r7)
            goto L_0x005f
        L_0x0077:
            boolean r1 = r10.A04()
            if (r1 == 0) goto L_0x0081
            r6.run()
            goto L_0x005f
        L_0x0081:
            r9.Bsw(r0)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83M.invoke(java.lang.Object):java.lang.Object");
    }
}
