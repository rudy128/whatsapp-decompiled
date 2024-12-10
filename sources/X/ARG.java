package X;

public class ARG implements C22442B7y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ARG(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        r2.A01(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0113, code lost:
        r2.A00(r3, (X.A7B) null, (java.util.ArrayList) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0189, code lost:
        r0.A00(r1, r2, r2, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BlH(java.util.List r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x0178;
                case 2: goto L_0x0166;
                case 3: goto L_0x0150;
                case 4: goto L_0x0144;
                case 5: goto L_0x0138;
                case 6: goto L_0x012b;
                case 7: goto L_0x0118;
                case 8: goto L_0x0104;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d2;
                case 12: goto L_0x00c3;
                case 13: goto L_0x00b5;
                case 14: goto L_0x00aa;
                case 15: goto L_0x001c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.AY4 r0 = (X.AY4) r0
            java.lang.Object r1 = r7.A02
            X.8pK r1 = (X.AnonymousClass8pK) r1
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = r0.A00
            r2.A04 = r1
            X.A5Y r0 = r2.A0B
            android.content.Intent r1 = r0.A02(r2, r1)
            r0 = 1
            r2.CNh(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r1 = r7.A01
            X.AY6 r1 = (X.AY6) r1
            java.lang.Object r4 = r7.A02
            X.9sN r4 = (X.C194839sN) r4
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x001b
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity r0 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r0
            X.A5Y r3 = r0.A0H
            java.lang.Object r2 = X.C108955ca.A0p(r8)
            X.8pK r2 = (X.AnonymousClass8pK) r2
            r1 = -1
            r0 = 0
            java.util.HashMap r1 = r3.A04(r2, r0, r0, r1)
            java.lang.String r0 = "on_success"
            r4.A01(r0, r1)
            return
        L_0x0042:
            java.lang.Object r3 = r7.A01
            X.1if r3 = (X.C33341if) r3
            java.lang.Object r6 = r7.A02
            int r1 = r8.size()
            r0 = 1
            if (r1 != r0) goto L_0x001b
            java.lang.Object r4 = X.C108955ca.A0p(r8)
            X.AEs r4 = (X.C20284AEs) r4
            X.C17960vV.A07(r4)
            java.lang.String r5 = r4.A0A
            X.00H r0 = r3.A0D
            X.10T r1 = X.C17880vN.A0V(r0)
            r2 = 5
            X.AWi r0 = new X.AWi
            r0.<init>(r4, r6, r2)
            r1.notifyAllObservers(r0)
            X.1QS r0 = r3.A0A
            X.BD1 r0 = r0.A06()
            X.9mX r0 = r0.BWn()
            if (r0 == 0) goto L_0x018e
            int r1 = r4.A05()
            r0 = 1
            if (r1 == r0) goto L_0x0088
            r0 = 4
            if (r1 == r0) goto L_0x0088
            if (r1 == r2) goto L_0x0091
            r0 = 6
            if (r1 == r0) goto L_0x0088
            r0 = 7
            if (r1 == r0) goto L_0x0088
            return
        L_0x0088:
            X.8pb r0 = r4.A08
            X.8pT r0 = (X.AnonymousClass8pT) r0
            if (r0 == 0) goto L_0x001b
            java.lang.String r4 = r0.A04
            goto L_0x0099
        L_0x0091:
            X.8pb r0 = r4.A08
            X.8pZ r0 = (X.AnonymousClass8pZ) r0
            if (r0 == 0) goto L_0x001b
            java.lang.String r4 = r0.A04
        L_0x0099:
            if (r4 == 0) goto L_0x001b
            X.1ic r3 = r3.A06
            X.10I r2 = r3.A03
            r1 = 16
            X.7Pq r0 = new X.7Pq
            r0.<init>(r3, r5, r4, r1)
            r2.CGF(r0)
            return
        L_0x00aa:
            java.lang.Object r2 = r7.A01
            X.9sN r2 = (X.C194839sN) r2
            java.lang.Object r1 = r7.A02
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "on_failure"
            goto L_0x00bf
        L_0x00b5:
            java.lang.Object r2 = r7.A01
            X.9sN r2 = (X.C194839sN) r2
            java.lang.Object r1 = r7.A02
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = "on_success"
        L_0x00bf:
            r2.A01(r0, r1)
            return
        L_0x00c3:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r0 = r0.A01
            X.8yx r0 = (X.C175588yx) r0
            X.9kZ r1 = r0.A02
            r0 = 0
            r1.A00(r0)
            return
        L_0x00d2:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r2 = r7.A02
            X.8pK r2 = (X.AnonymousClass8pK) r2
            java.lang.Object r0 = r0.A01
            X.8yy r0 = (X.C175598yy) r0
            X.9lS r1 = r0.A04
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x00e5:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r0 = r0.A01
            X.8yu r0 = (X.C175558yu) r0
            X.9jT r1 = r0.A07
            r0 = 0
            r1.A00(r0)
            return
        L_0x00f4:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r3 = r7.A02
            X.8pK r3 = (X.AnonymousClass8pK) r3
            java.lang.Object r0 = r0.A01
            X.8yt r0 = (X.C175548yt) r0
            X.9ka r2 = r0.A09
            r1 = 0
            goto L_0x0113
        L_0x0104:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r3 = r7.A02
            X.8pK r3 = (X.AnonymousClass8pK) r3
            java.lang.Object r0 = r0.A01
            X.8yt r0 = (X.C175548yt) r0
            X.9ka r2 = r0.A09
            r1 = 1
        L_0x0113:
            r0 = 0
            r2.A00(r3, r0, r0, r1)
            return
        L_0x0118:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r2 = r7.A02
            X.8pO r2 = (X.AnonymousClass8pO) r2
            java.lang.Object r0 = r0.A01
            X.9hK r0 = (X.C188379hK) r0
            X.9jS r1 = r0.A06
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x012b:
            java.lang.Object r2 = r7.A01
            X.BB9 r2 = (X.BB9) r2
            java.lang.Object r1 = r7.A02
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0 = 0
            r2.C3s(r0, r1)
            return
        L_0x0138:
            java.lang.Object r1 = r7.A01
            X.BB9 r1 = (X.BB9) r1
            java.lang.Object r0 = r7.A02
            X.8pK r0 = (X.AnonymousClass8pK) r0
            r1.Bo0(r0)
            return
        L_0x0144:
            java.lang.Object r1 = r7.A01
            X.A0N r1 = (X.A0N) r1
            java.lang.Object r0 = r7.A02
            X.8pK r0 = (X.AnonymousClass8pK) r0
            X.A0N.A00(r0, r1)
            return
        L_0x0150:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r1 = r7.A02
            X.8pK r1 = (X.AnonymousClass8pK) r1
            java.lang.Object r0 = r0.A01
            X.8yw r0 = (X.C175578yw) r0
            X.9kY r0 = r0.A0G
            r2 = 0
            r4 = 0
            r3 = r2
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0166:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r1 = r7.A02
            X.8pK r1 = (X.AnonymousClass8pK) r1
            java.lang.Object r0 = r0.A01
            X.8yw r0 = (X.C175578yw) r0
            X.9kY r0 = r0.A0G
            r2 = 0
            r4 = 0
            r5 = 1
            goto L_0x0189
        L_0x0178:
            java.lang.Object r0 = r7.A01
            X.8yf r0 = (X.C175408yf) r0
            java.lang.Object r1 = r7.A02
            X.8pK r1 = (X.AnonymousClass8pK) r1
            java.lang.Object r0 = r0.A01
            X.8yw r0 = (X.C175578yw) r0
            X.9kY r0 = r0.A0G
            r2 = 0
            r4 = 1
            r5 = 0
        L_0x0189:
            r3 = r2
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x018e:
            X.1QE r1 = r3.A0B
            java.lang.String r0 = "onRecvPaymentMethodUpdate: storeOrUpdatePaymentMethod failed"
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARG.BlH(java.util.List):void");
    }
}
