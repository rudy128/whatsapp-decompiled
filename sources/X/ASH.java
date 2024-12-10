package X;

public final class ASH implements C436920n {
    public final AnonymousClass00H A00;

    public ASH(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BDc(C184489b2 r8, AnonymousClass206 r9) {
        C179809Jz r0;
        boolean A17 = C18070vi.A17(r9, r8);
        if (r9 instanceof C440021t) {
            this.A00.get();
            AnonymousClass8X8 r5 = r8.A00;
            C163928Ww A002 = C20028A3x.A00(AnonymousClass8X8.A03(r5), (AnonymousClass21W) r9, r8.A01);
            if (A002 != null) {
                C62572rc r3 = ((AnonymousClass21V) r9).A02;
                if (!(r3 == null || r3.A0a == null)) {
                    C166248ca A0L = AnonymousClass8BS.A0L(A002);
                    A0L.bitField0_ |= 128;
                    A0L.gifPlayback_ = true;
                    int i = r3.A05;
                    if (i == A17) {
                        r0 = C179809Jz.GIPHY;
                    } else if (i != 2) {
                        r0 = C179809Jz.NONE;
                    } else {
                        r0 = C179809Jz.TENOR;
                    }
                    A002.A0G(r0);
                }
                r5.A0T((C166248ca) A002.A0C());
                return;
            }
            return;
        }
        throw AnonymousClass8BW.A0S(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBH(X.C195239t1 r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.8bz r1 = r7.A01
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005a
            X.8cS r5 = r1.videoMessage_
            if (r5 != 0) goto L_0x0012
            X.8cS r5 = X.C166168cS.DEFAULT_INSTANCE
        L_0x0012:
            boolean r0 = r5.gifPlayback_
            if (r0 == 0) goto L_0x005a
            X.205 r3 = r7.A02
            long r1 = r7.A00
            r0 = 13
            X.21t r4 = new X.21t
            r4.<init>(r3, r0, r1)
            X.00H r0 = r6.A00
            r0.get()
            X.C20028A3x.A01(r5, r4)
            int r1 = r5.bitField0_
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0051
            X.2rc r3 = r4.A02
            if (r3 == 0) goto L_0x0051
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r0 = 1
            int r1 = r5.gifAttribution_
            if (r1 == 0) goto L_0x0057
            if (r1 == r0) goto L_0x0054
            r0 = 2
            if (r1 != r0) goto L_0x0057
            X.9K0 r0 = X.AnonymousClass9K0.TENOR
        L_0x0044:
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 != r0) goto L_0x004f
            r2 = 2
        L_0x004f:
            r3.A05 = r2
        L_0x0051:
            return r4
        L_0x0052:
            r2 = 1
            goto L_0x004f
        L_0x0054:
            X.9K0 r0 = X.AnonymousClass9K0.GIPHY
            goto L_0x0044
        L_0x0057:
            X.9K0 r0 = X.AnonymousClass9K0.NONE
            goto L_0x0044
        L_0x005a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASH.CBH(X.9t1):X.206");
    }
}
