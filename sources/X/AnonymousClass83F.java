package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.83F  reason: invalid class name */
public final class AnonymousClass83F extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1606789m $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C144147Ge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83F(C144147Ge r2, C1606789m r3, AnonymousClass705 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r2;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r1 != 503) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            X.6Sm r11 = X.C108965cb.A0V(r14)
            X.7Ge r4 = r13.this$0
            java.security.cert.X509Certificate r9 = r13.$encryptionCert
            java.security.PublicKey r8 = r13.$passwordPublicKey
            java.lang.Integer r7 = r13.$passwordKeyId
            X.89m r5 = r13.$callback
            X.705 r6 = r13.$operationRetryState
            r1 = 2
            X.Akd r3 = new X.Akd
            r3.<init>((X.C144147Ge) r4, (X.C1606789m) r5, (X.AnonymousClass705) r6, (java.lang.Integer) r7, (java.security.PublicKey) r8, (java.security.cert.X509Certificate) r9)
            X.7Ge r0 = r13.this$0
            X.00H r0 = r0.A01
            java.lang.Object r8 = r0.get()
            X.6i1 r8 = (X.C129576i1) r8
            X.89m r9 = r13.$callback
            X.705 r10 = r13.$operationRetryState
            X.7Ge r0 = r13.this$0
            X.82h r5 = new X.82h
            r5.<init>(r0, r9, r10)
            r0 = 1
            X.C18070vi.A0d(r9, r0)
            X.C18070vi.A0d(r10, r1)
            int r1 = X.C122936Sm.A00(r11)
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x00c8
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x00c8
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 == r0) goto L_0x0083
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x00c8
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00c8
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x00c4
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x0073
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x0073
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0073
            r0 = 481(0x1e1, float:6.74E-43)
            if (r1 == r0) goto L_0x0069
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0073
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 == r0) goto L_0x00c4
        L_0x0066:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0069:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x00c4
            r3.run()
            goto L_0x0066
        L_0x0073:
            java.lang.Long r0 = r10.A01()
            if (r0 == 0) goto L_0x00c4
            X.10I r2 = r8.A00
            long r0 = r0.longValue()
            r2.CGv(r3, r0)
            goto L_0x0066
        L_0x0083:
            boolean r0 = r10.A04()
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r10.A03()
            if (r0 != 0) goto L_0x00c4
            r10.A02()
            X.00H r0 = r8.A02
            java.lang.Object r3 = r0.get()
            X.1lX r3 = (X.C35031lX) r3
            X.00H r2 = r8.A01
            r2.get()
            java.lang.String r4 = "shops"
            r1 = 1
            X.1lW r0 = new X.1lW
            r0.<init>(r4, r1)
            r3.A03(r0)
            X.00H r0 = r8.A04
            java.lang.Object r3 = r0.get()
            X.1lY r3 = (X.C35041lY) r3
            r2.get()
            X.1lW r2 = new X.1lW
            r2.<init>(r4, r1)
            r1 = 0
            X.7Gl r0 = new X.7Gl
            r0.<init>(r9, r5, r1)
            r3.A01(r2, r0)
            goto L_0x0066
        L_0x00c4:
            r9.Bsw(r11)
            goto L_0x0066
        L_0x00c8:
            X.7wT r7 = new X.7wT
            r12 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            X.00H r6 = r8.A03
            X.1lS r3 = X.C108945cZ.A0f(r6)
            X.00H r2 = r8.A01
            r2.get()
            java.lang.String r5 = "shops"
            r4 = 0
            r1 = 1
            X.1lW r0 = new X.1lW
            r0.<init>(r5, r1)
            X.732 r0 = r3.A00(r0)
            if (r0 != 0) goto L_0x00ed
            r7.invoke()
            goto L_0x0066
        L_0x00ed:
            X.1lS r3 = X.C108945cZ.A0f(r6)
            r2.get()
            X.1lW r2 = new X.1lW
            r2.<init>(r5, r1)
            r1 = 0
            X.7GV r0 = new X.7GV
            r0.<init>(r9, r11, r7, r1)
            r3.A05(r0, r2, r4, r4)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass83F.invoke(java.lang.Object):java.lang.Object");
    }
}
