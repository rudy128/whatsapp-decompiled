package X;

/* renamed from: X.73d  reason: invalid class name and case insensitive filesystem */
public final class C1408073d {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final Integer A04(AnonymousClass6RD r6) {
        C18020vd r2;
        int i;
        String A012;
        int A042 = C108955ca.A04(r6, 0);
        if (A042 == 0) {
            r2 = C17880vN.A0P(this.A03);
            i = 9483;
            A012 = C18020vd.A01(C18040vf.A02, r2, i);
        } else if (A042 != 2) {
            A012 = null;
        } else {
            r2 = C17880vN.A0P(this.A03);
            i = 9482;
            A012 = C18020vd.A01(C18040vf.A02, r2, i);
        }
        if (A012 != null && new C41661wr("[0-9]+").A03(A012)) {
            try {
                return C108955ca.A0l(A012);
            } catch (NumberFormatException e) {
                C17900vP.A0h("BonsaiTosManager/getNoticeIdFromABProp notice id could not be converted to int: ", A012, AnonymousClass000.A10(), e);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r2 = (X.AnonymousClass1H7) r0.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r4) {
        /*
            r3 = this;
            long r0 = (long) r4
            X.6RZ r0 = X.AnonymousClass6XA.A00(r0)
            if (r0 == 0) goto L_0x003f
            int r0 = r0.ordinal()
            switch(r0) {
                case -1: goto L_0x003f;
                case 0: goto L_0x000f;
                case 1: goto L_0x0016;
                case 2: goto L_0x001d;
                case 3: goto L_0x0024;
                case 4: goto L_0x0032;
                case 5: goto L_0x0032;
                case 6: goto L_0x002b;
                case 7: goto L_0x002b;
                default: goto L_0x000e;
            }
        L_0x000e:
            return
        L_0x000f:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A01
            goto L_0x0038
        L_0x0016:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A02
            goto L_0x0038
        L_0x001d:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A04
            goto L_0x0038
        L_0x0024:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A05
            goto L_0x0038
        L_0x002b:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A06
            goto L_0x0038
        L_0x0032:
            X.1rq r0 = A01(r3)
            X.0vl r0 = r0.A03
        L_0x0038:
            java.lang.Object r2 = r0.getValue()
            X.1H7 r2 = (X.AnonymousClass1H7) r2
            goto L_0x0065
        L_0x003f:
            X.0z2 r0 = X.AnonymousClass6RD.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r2.next()
            X.6RD r1 = (X.AnonymousClass6RD) r1
            java.lang.Integer r0 = r3.A04(r1)
            if (r0 == 0) goto L_0x0045
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0045
            X.1rq r0 = A01(r3)
            X.1H7 r2 = r0.A01(r1)
        L_0x0065:
            X.1rs r1 = X.C38781rs.A02
            r0 = 1
            r2.A04(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408073d.A05(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        A02(new X.AnonymousClass7D6(r5, r1), r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r5.BzU(X.AnonymousClass6R9.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass86Z r5, X.C1598386b r6, X.AnonymousClass6RD r7) {
        /*
            r4 = this;
            r3 = 0
            r0 = 0
            int r0 = X.C108955ca.A04(r7, r0)
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x000a;
                case 2: goto L_0x002e;
                case 3: goto L_0x009c;
                case 4: goto L_0x009c;
                case 5: goto L_0x0048;
                case 6: goto L_0x007a;
                case 7: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x009c
            X.1rq r0 = A01(r4)
            X.0vl r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.1H7 r0 = (X.AnonymousClass1H7) r0
            java.lang.Object r1 = r0.A01()
            X.1rs r0 = X.C38781rs.A02
            if (r1 == r0) goto L_0x009c
            X.6RZ r0 = X.AnonymousClass6RZ.AGENT_TOS
            long r2 = r0.noticeId
            r1 = 4
            goto L_0x0093
        L_0x002e:
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x009c
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x009c
            X.6RZ r0 = X.AnonymousClass6RZ.META_AI_SHORTCUT_TOS
            long r2 = r0.noticeId
            r1 = 2
            goto L_0x0093
        L_0x0048:
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x00a4
            X.1rq r0 = A01(r4)
            X.0vl r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.1H7 r0 = (X.AnonymousClass1H7) r0
            java.lang.Object r1 = r0.A01()
            X.1rs r0 = X.C38781rs.A02
            if (r1 == r0) goto L_0x00a4
            X.6RZ r0 = X.AnonymousClass6RZ.AI_STUDIO_TOS
            long r1 = r0.noticeId
            r3 = 3
            X.7D6 r0 = new X.7D6
            r0.<init>(r5, r3)
            A02(r0, r4, r1)
            if (r6 == 0) goto L_0x0009
            r0 = 0
            r6.BzV(r0)
            return
        L_0x007a:
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x009c
            X.1rq r0 = A01(r4)
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x009c
            X.6RZ r0 = X.AnonymousClass6RZ.INVOKE_TOS
            long r2 = r0.noticeId
            r1 = 1
        L_0x0093:
            X.7D6 r0 = new X.7D6
            r0.<init>(r5, r1)
            A02(r0, r4, r2)
            return
        L_0x009c:
            if (r5 == 0) goto L_0x0009
            X.6R9 r0 = X.AnonymousClass6R9.NOT_ACCEPTED
            r5.BzU(r0)
            return
        L_0x00a4:
            if (r5 == 0) goto L_0x00ab
            X.6R9 r0 = X.AnonymousClass6R9.NOT_ACCEPTED
            r5.BzU(r0)
        L_0x00ab:
            X.00H r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.18K r2 = (X.AnonymousClass18K) r2
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 68
            X.C108945cZ.A1M(r1, r0)
            X.AnonymousClass3MZ.A1T(r1, r3)
            r2.CC7(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408073d.A06(X.86Z, X.86b, X.6RD):void");
    }

    public final boolean A0A(AnonymousClass6RD r2) {
        C18070vi.A0d(r2, 0);
        return A01(this).A05(r2);
    }

    public static C38761rq A01(C1408073d r0) {
        return (C38761rq) r0.A01.get();
    }

    public static final void A02(C1598686e r2, C1408073d r3, long j) {
        ((C131496lC) r3.A04.get()).A00(new AnonymousClass7D9(r2, r3, j), j);
    }

    public C1408073d(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r7;
    }

    public static final long A00(AnonymousClass6RD r1) {
        AnonymousClass6RZ r0;
        switch (r1.ordinal()) {
            case 0:
                r0 = AnonymousClass6RZ.INVOKE_TOS;
                break;
            case 1:
                r0 = AnonymousClass6RZ.AGENT_TOS;
                break;
            case 2:
                r0 = AnonymousClass6RZ.META_AI_SHORTCUT_TOS;
                break;
            case 3:
                r0 = AnonymousClass6RZ.IMAGINE_ME_NUX;
                break;
            case 4:
                r0 = AnonymousClass6RZ.IMAGINE_ME_TOS;
                break;
            case 5:
                r0 = AnonymousClass6RZ.AI_STUDIO_TOS;
                break;
            case 6:
                r0 = AnonymousClass6RZ.INVOKE_BR_TOS;
                break;
            case 7:
                r0 = AnonymousClass6RZ.META_AI_SHORTCUT_BR_TOS;
                break;
            default:
                throw AnonymousClass3MW.A14();
        }
        return r0.noticeId;
    }

    private final void A03(AnonymousClass8B8 r12, long j) {
        C17900vP.A0m("BonsaiTosManager/sendResetState reset noticeId=", AnonymousClass000.A10(), j);
        if (r12 == null) {
            r12 = new AnonymousClass7DB();
        }
        C127046di r3 = (C127046di) this.A05.get();
        AnonymousClass00H r0 = r3.A00;
        String A0T = C17890vO.A0T(r0);
        AnonymousClass9F7 r2 = new AnonymousClass9F7(A0T, j);
        C17880vN.A0U(r0).A0I(new C122356Oy(new C128306fm(r3, r12, (int) j), r2), (C29621ca) r2.A00, A0T, 429, 32000);
    }

    public final void A07(AnonymousClass8B8 r4, AnonymousClass6RD r5) {
        A01(this).A01(r5).A04(C38781rs.A03, true);
        A03(r4, A00(r5));
        Integer A042 = A04(r5);
        if (A042 != null) {
            A03(r4, (long) A042.intValue());
        }
        if (r5 == AnonymousClass6RD.META_AI_IMAGINE_ME_TOS) {
            A07((AnonymousClass8B8) null, AnonymousClass6RD.META_AI_IMAGINE_ME_NUX);
        }
    }

    public final boolean A08() {
        return AnonymousClass000.A1Z(((AnonymousClass1H7) A01(this).A05.getValue()).A01(), C38781rs.A02);
    }

    public final boolean A09() {
        return A01(this).A04();
    }
}
