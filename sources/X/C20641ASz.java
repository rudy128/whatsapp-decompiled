package X;

/* renamed from: X.ASz  reason: case insensitive filesystem */
public class C20641ASz implements B83, B85, C436820m {
    public final A79 A00;
    public final C19969A1e A01;
    public final ASL A02;

    public void BDb(C19998A2m a2m, AnonymousClass206 r6) {
        C17960vV.A0G(r6 instanceof AnonymousClass21Y, AnonymousClass001.A1E(r6, "FMessageVideoProtobuf: message type is not supported ", AnonymousClass000.A10()));
        AnonymousClass21W r62 = (AnonymousClass21W) r6;
        if (AnonymousClass8BV.A1R(r62)) {
            this.A02.A00(new C20612ARw(this, 4), a2m, r62);
            return;
        }
        AnonymousClass8X8 r3 = a2m.A00;
        C163928Ww A03 = AnonymousClass8X8.A03(r3);
        this.A01.A02(a2m, A03, r62);
        if (!r62.A0z(8) || AnonymousClass8BR.A0i(r62) == null) {
            r3.A0S(A03);
            return;
        }
        C165858bs r0 = ((C166418cr) r3.A00).buttonsMessage_;
        if (r0 == null) {
            r0 = C165858bs.DEFAULT_INSTANCE;
        }
        C163728Wc r2 = (C163728Wc) r0.A0O();
        C20097A7a.A00(A03, r2, r62).headerCase_ = 4;
        r2.A0G(AnonymousClass9KT.VIDEO);
        r3.A0I((C165858bs) r2.A0C());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r3.viewOnce_ == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r7) {
        /*
            r6 = this;
            X.8cr r1 = r7.A08
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r5 = 0
            if (r0 == 0) goto L_0x003a
            X.8ca r3 = r1.videoMessage_
            r4 = r3
            if (r3 != 0) goto L_0x0014
            X.8ca r3 = X.C166248ca.DEFAULT_INSTANCE
        L_0x0014:
            boolean r2 = r3.gifPlayback_
            int r1 = r3.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0022
            boolean r1 = r3.viewOnce_
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r2 != 0) goto L_0x003a
            if (r0 != 0) goto L_0x003a
            if (r4 != 0) goto L_0x002b
            X.8ca r4 = X.C166248ca.DEFAULT_INSTANCE
        L_0x002b:
            X.205 r3 = r7.A0A
            long r1 = r7.A03
            r0 = 3
            X.21Y r5 = new X.21Y
            r5.<init>(r3, r0, r1)
            X.A1e r0 = r6.A01
            X.C20077A6d.A02(r7, r4, r5, r0)
        L_0x003a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20641ASz.CBG(X.A6d):X.206");
    }

    public C20641ASz(ASL asl, A79 a79, C19969A1e a1e) {
        this.A02 = asl;
        this.A00 = a79;
        this.A01 = a1e;
    }
}
