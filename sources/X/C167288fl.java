package X;

/* renamed from: X.8fl  reason: invalid class name and case insensitive filesystem */
public abstract class C167288fl extends C180569Nb {
    public void A01() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C42621yT r14, X.BCP r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C167278fk
            r8 = r14
            if (r0 == 0) goto L_0x0021
            r5 = r13
            X.8fk r5 = (X.C167278fk) r5
            X.9uA r0 = r5.A06
            long r1 = r0.A00()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.11P r0 = r5.A03
            long r3 = X.AnonymousClass11P.A01(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r5.A02
        L_0x001d:
            r0.A2H(r1)
            return
        L_0x0021:
            r5 = r13
            X.8fj r5 = (X.C167268fj) r5
            X.9uA r0 = r5.A04
            long r1 = r0.A00()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.11P r0 = r5.A02
            long r3 = X.AnonymousClass11P.A01(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r5.A01
            goto L_0x001d
        L_0x003a:
            X.9gK r6 = r5.A04
            X.AMI r3 = new X.AMI
            r3.<init>(r15, r5)
            X.11P r0 = r6.A01
            long r1 = X.AnonymousClass11P.A00(r0)
            boolean r0 = r6 instanceof X.AnonymousClass90R
            if (r0 == 0) goto L_0x0077
            r0 = r6
            X.90R r0 = (X.AnonymousClass90R) r0
            java.lang.Object[] r7 = X.AnonymousClass3MW.A1b()
            r4 = 0
            java.lang.String r0 = r0.A01
            r7[r4] = r0
            r0 = 1
            X.AnonymousClass3MX.A1S(r7, r0, r1)
        L_0x005b:
            byte[] r7 = X.A4K.A01(r7)
        L_0x005f:
            X.A5H r5 = r6.A04
            X.AMG r4 = new X.AMG
            r4.<init>(r6, r3, r1)
            X.A52 r2 = X.A5H.A00()
            if (r2 == 0) goto L_0x009e
            X.A7q r1 = r5.A00
            X.8EI r0 = new X.8EI
            r0.<init>(r4, r5, r7)
            r1.A05(r0, r2, r14)
            return
        L_0x0077:
            boolean r0 = r6 instanceof X.AnonymousClass90Q
            if (r0 == 0) goto L_0x0091
            r5 = r6
            X.90Q r5 = (X.AnonymousClass90Q) r5
            java.lang.Object[] r7 = X.AnonymousClass8BR.A1a()
            r4 = 0
            java.lang.String r0 = r5.A00
            r7[r4] = r0
            r0 = 1
            X.AnonymousClass3MX.A1S(r7, r0, r1)
            r4 = 2
            java.lang.String r0 = r5.A01
            r7[r4] = r0
            goto L_0x005b
        L_0x0091:
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            r0 = 0
            X.AnonymousClass3MX.A1S(r4, r0, r1)
            byte[] r7 = X.A4K.A01(r4)
            goto L_0x005f
        L_0x009e:
            X.1QE r1 = r5.A02
            java.lang.String r0 = "sign: cryptoObject is null"
            r1.A06(r0)
            r5.A03()
            X.8fk r1 = r3.A01
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r1.A02
            r0.A28()
            X.1FU r0 = r1.A01
            X.3Rj r2 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131893810(0x7f121e32, float:1.9422407E38)
            r2.A0E(r0)
            r0 = 2131893809(0x7f121e31, float:1.9422405E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 41
            X.C20151A9n.A00(r2, r3, r0, r1)
            r0 = 0
            r2.A0T(r0)
            r2.A0C()
            return
        L_0x00d1:
            X.9yw r9 = r5.A03
            X.AMJ r10 = new X.AMJ
            r10.<init>(r15, r5)
            X.10I r1 = r9.A0R
            r0 = 44
            X.C17890vO.A0v(r1, r9, r0)
            X.A54 r1 = r9.A0I
            java.lang.String r2 = "FB"
            java.lang.String r0 = "PIN"
            X.AZ2 r1 = r1.A01(r2, r0)
            if (r1 == 0) goto L_0x00f4
            X.9zC r0 = new X.9zC
            r0.<init>(r1)
            X.C198809yw.A00(r14, r9, r10, r0)
            return
        L_0x00f4:
            X.8fj r0 = r10.A01
            X.AYZ r0 = r0.A05
            com.whatsapp.payments.ui.BrazilPaymentActivity r0 = r0.A05
            X.90Y r0 = r0.A0O
            java.lang.String r1 = "get-provider-key"
            X.9r1 r0 = r0.A02
            java.lang.Integer r11 = r0.A00(r1)
            X.9mt r0 = r9.A0H
            r12 = 0
            X.AYh r7 = new X.AYh
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167288fl.A02(X.1yT, X.BCP):void");
    }

    public void A03(byte[] bArr) {
        if (this instanceof C167278fk) {
            ((C167278fk) this).A00 = bArr;
        }
    }
}
