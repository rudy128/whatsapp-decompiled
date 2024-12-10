package X;

/* renamed from: X.0VG  reason: invalid class name */
public final class AnonymousClass0VG implements C16850tK {
    public final /* synthetic */ C05120Qm A00;
    public final /* synthetic */ boolean A01;

    public void C6H(long j) {
    }

    public AnonymousClass0VG(C05120Qm r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void Bs9() {
        AnonymousClass0CM r1;
        AnonymousClass0NM A02;
        C16910tQ r12;
        C05120Qm r4 = this.A00;
        boolean z = this.A01;
        if (z) {
            r1 = AnonymousClass0CM.SelectionStart;
        } else {
            r1 = AnonymousClass0CM.SelectionEnd;
        }
        r4.A0H.setValue(r1);
        long A0B = r4.A0B(z);
        long A0p = AnonymousClass001.A0p(AnonymousClass0QY.A01(A0B), AnonymousClass0QY.A02(A0B) - 1.0f);
        C04940Pp r0 = r4.A03;
        if (r0 != null && (A02 = C04940Pp.A02(r0)) != null) {
            C16910tQ r5 = A02.A01;
            if (r5 != null && r5.Be8() && (r12 = A02.A00) != null && r12.Be8()) {
                A0p = r12.Bht(r5, A0p);
            }
            r4.A01 = A0p;
            r4.A0G.setValue(AnonymousClass000.A0e(A0p));
            r4.A02 = AnonymousClass0QY.A03;
            r4.A00 = -1;
            C04940Pp r02 = r4.A03;
            if (r02 != null) {
                AnonymousClass000.A1C(r02.A09, true);
            }
            C05120Qm.A09(r4, false);
        }
    }

    public void BsJ(long j) {
        C05120Qm r4 = this.A00;
        long A05 = AnonymousClass0QY.A05(r4.A02, j);
        r4.A02 = A05;
        AnonymousClass0QY A0e = AnonymousClass000.A0e(AnonymousClass0QY.A05(r4.A01, A05));
        C17330uU r0 = r4.A0G;
        r0.setValue(A0e);
        C26224CvE A0E = r4.A0E();
        AnonymousClass0QY r02 = (AnonymousClass0QY) r0.getValue();
        C18070vi.A0b(r02);
        long unused = r4.A02(AnonymousClass0PJ.A00, A0E, r02.A00, false, this.A01, true);
        C05120Qm.A09(r4, false);
    }

    public void C6z() {
        C05120Qm r1 = this.A00;
        C05120Qm.A08(r1);
        C05120Qm.A09(r1, true);
    }

    public void C9Y() {
        C05120Qm r1 = this.A00;
        C05120Qm.A08(r1);
        C05120Qm.A09(r1, true);
    }
}
