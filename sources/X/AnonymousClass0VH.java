package X;

/* renamed from: X.0VH  reason: invalid class name */
public class AnonymousClass0VH implements C16850tK {
    public final int A00;
    public final Object A01;

    public AnonymousClass0VH(C05120Qm r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BsJ(long j) {
        AnonymousClass0NM A02;
        C15800rE r0;
        AnonymousClass0NM A022;
        int A012;
        C26224CvE A0E;
        long j2;
        C17020tb r6;
        long j3 = j;
        if (this.A00 != 0) {
            C05120Qm r7 = (C05120Qm) this.A01;
            if (r7.A0E().A04().length() != 0) {
                r7.A02 = AnonymousClass0QY.A05(r7.A02, j3);
                C04940Pp r02 = r7.A03;
                if (!(r02 == null || (A022 = C04940Pp.A02(r02)) == null)) {
                    AnonymousClass0QY A0e = AnonymousClass000.A0e(AnonymousClass0QY.A05(r7.A01, r7.A02));
                    C17330uU r2 = r7.A0G;
                    r2.setValue(A0e);
                    if (r7.A08 == null) {
                        AnonymousClass0QY r03 = (AnonymousClass0QY) r2.getValue();
                        C18070vi.A0b(r03);
                        if (!A022.A04(r03.A00)) {
                            int CPo = r7.A0D().CPo(A022.A01(true, r7.A01));
                            EBT A0D = r7.A0D();
                            AnonymousClass0QY r04 = (AnonymousClass0QY) r2.getValue();
                            C18070vi.A0b(r04);
                            if (CPo == A0D.CPo(A022.A01(true, r04.A00))) {
                                r6 = AnonymousClass0PJ.A01;
                            } else {
                                r6 = AnonymousClass0PJ.A00;
                            }
                            A0E = r7.A0E();
                            AnonymousClass0QY r05 = (AnonymousClass0QY) r2.getValue();
                            C18070vi.A0b(r05);
                            j2 = r05.A00;
                            long unused = r7.A02(r6, A0E, j2, false, false, true);
                        }
                    }
                    Integer num = r7.A08;
                    if (num != null) {
                        A012 = num.intValue();
                    } else {
                        A012 = A022.A01(false, r7.A01);
                    }
                    AnonymousClass0QY r06 = (AnonymousClass0QY) r2.getValue();
                    C18070vi.A0b(r06);
                    int A013 = A022.A01(false, r06.A00);
                    if (r7.A08 != null || A012 != A013) {
                        A0E = r7.A0E();
                        AnonymousClass0QY r07 = (AnonymousClass0QY) r2.getValue();
                        C18070vi.A0b(r07);
                        j2 = r07.A00;
                        r6 = AnonymousClass0PJ.A00;
                        long unused2 = r7.A02(r6, A0E, j2, false, false, true);
                    } else {
                        return;
                    }
                }
                C05120Qm.A09(r7, false);
                return;
            }
            return;
        }
        C05120Qm r62 = (C05120Qm) this.A01;
        r62.A02 = AnonymousClass0QY.A05(r62.A02, j3);
        C04940Pp r08 = r62.A03;
        if (r08 != null && (A02 = C04940Pp.A02(r08)) != null) {
            AnonymousClass0QY A0e2 = AnonymousClass000.A0e(AnonymousClass0QY.A05(r62.A01, r62.A02));
            C17330uU r09 = r62.A0G;
            r09.setValue(A0e2);
            EBT A0D2 = r62.A0D();
            AnonymousClass0QY r010 = (AnonymousClass0QY) r09.getValue();
            C18070vi.A0b(r010);
            int CPo2 = A0D2.CPo(A02.A01(true, r010.A00));
            long A014 = C25858CnM.A01(CPo2, CPo2);
            if (A014 != r62.A0E().A01()) {
                C04940Pp r011 = r62.A03;
                if ((r011 == null || AnonymousClass001.A1b(r011.A09)) && (r0 = r62.A05) != null) {
                    ((C05900Wd) r0).A00.performHapticFeedback(9);
                }
                r62.A0F().invoke(C05120Qm.A05(r62.A0E().A02(), A014));
            }
        }
    }

    public void C6H(long j) {
        AnonymousClass0NM A02;
        C16910tQ r1;
        AnonymousClass0NM A022;
        AnonymousClass0NM A023;
        int i = this.A00;
        C05120Qm r5 = (C05120Qm) this.A01;
        if (i != 0) {
            C17330uU r12 = r5.A0H;
            if (r12.getValue() == null) {
                r12.setValue(AnonymousClass0CM.SelectionEnd);
                r5.A00 = -1;
                r5.A0H();
                C04940Pp r0 = r5.A03;
                long j2 = j;
                if (r0 == null || (A023 = C04940Pp.A02(r0)) == null || !A023.A04(j)) {
                    C04940Pp r02 = r5.A03;
                    if (!(r02 == null || (A022 = C04940Pp.A02(r02)) == null)) {
                        int CPo = r5.A0D().CPo(A022.A01(true, j));
                        C26224CvE A06 = C05120Qm.A05(r5.A0E().A02(), C25858CnM.A01(CPo, CPo));
                        r5.A0Q(false);
                        C05120Qm.A07(AnonymousClass0CN.Cursor, r5);
                        C15800rE r03 = r5.A05;
                        if (r03 != null) {
                            ((C05900Wd) r03).A00.performHapticFeedback(9);
                        }
                        r5.A0F().invoke(A06);
                    }
                } else if (r5.A0E().A04().length() != 0) {
                    r5.A0Q(false);
                    r5.A08 = Integer.valueOf(AnonymousClass000.A0G(r5.A02(AnonymousClass0PJ.A00, C26224CvE.A00((C27069DRu) null, r5.A0E(), 5, C24498C6s.A00()), j2, true, false, true)));
                } else {
                    return;
                }
                r5.A01 = j;
                r5.A0G.setValue(AnonymousClass000.A0e(j));
                r5.A02 = AnonymousClass0QY.A03;
                return;
            }
            return;
        }
        long A0B = r5.A0B(true);
        long A0p = AnonymousClass001.A0p(AnonymousClass0QY.A01(A0B), AnonymousClass0QY.A02(A0B) - 1.0f);
        C04940Pp r04 = r5.A03;
        if (r04 != null && (A02 = C04940Pp.A02(r04)) != null) {
            C16910tQ r4 = A02.A01;
            if (r4 != null && r4.Be8() && (r1 = A02.A00) != null && r1.Be8()) {
                A0p = r1.Bht(r4, A0p);
            }
            r5.A01 = A0p;
            r5.A0G.setValue(AnonymousClass000.A0e(A0p));
            r5.A02 = AnonymousClass0QY.A03;
            r5.A0H.setValue(AnonymousClass0CM.Cursor);
            C05120Qm.A09(r5, false);
        }
    }

    public void C6z() {
        int i = this.A00;
        C05120Qm r2 = (C05120Qm) this.A01;
        if (i != 0) {
            r2.A0H.setValue((Object) null);
            r2.A0G.setValue((Object) null);
            C05120Qm.A09(r2, true);
            r2.A08 = null;
            return;
        }
        C05120Qm.A08(r2);
    }

    public void C9Y() {
        if (this.A00 == 0) {
            C05120Qm.A08((C05120Qm) this.A01);
        }
    }

    public void Bs9() {
    }
}
