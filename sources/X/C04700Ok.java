package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0Ok  reason: invalid class name and case insensitive filesystem */
public final class C04700Ok {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = C26229CvL.A02(0, 0, 15);
    public AnonymousClass0AL A04;
    public Integer A05 = AnonymousClass00R.A0Y;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass0XV A0F;
    public final AnonymousClass0AK A0G = new AnonymousClass0AK(this);
    public final C18090vk A0H = new C08250en(this);

    public static final void A00(C04700Ok r3, long j) {
        r3.A05 = AnonymousClass00R.A01;
        r3.A0D = false;
        AnonymousClass0XV r2 = r3.A0F;
        AnonymousClass0O0.A00(r2).getSnapshotObserver().A07(r2, new C08700fW(r3, j), true);
        r3.A0B = true;
        r3.A0C = true;
        if (AnonymousClass0F5.A00(r2)) {
            r3.A09 = true;
            r3.A0A = true;
        } else {
            r3.A0E = true;
        }
        r3.A05 = AnonymousClass00R.A0Y;
    }

    public static final void A01(C04700Ok r6, long j) {
        Integer num = r6.A05;
        Integer num2 = AnonymousClass00R.A0Y;
        if (num == num2) {
            Integer num3 = AnonymousClass00R.A00;
            r6.A05 = num3;
            r6.A0E = false;
            r6.A03 = j;
            AnonymousClass0XV r2 = r6.A0F;
            AnonymousClass0O0.A00(r2).getSnapshotObserver().A07(r2, r6.A0H, false);
            if (r6.A05 == num3) {
                r6.A09 = true;
                r6.A0A = true;
                r6.A05 = num2;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("layout state is not idle before measure starts");
    }

    public final C01850Ad A02() {
        return this.A0F.A0S.A08();
    }

    public final Constraints A03() {
        return this.A0G.A0a();
    }

    public final Constraints A04() {
        AnonymousClass0AL r0 = this.A04;
        if (r0 != null) {
            return r0.A0a();
        }
        return null;
    }

    public final void A05() {
        AnonymousClass0XV A0I;
        if (this.A0G.A0g() && (A0I = this.A0F.A0I()) != null) {
            AnonymousClass000.A1D(A0I);
        }
        AnonymousClass0AL r0 = this.A04;
        if (r0 != null && r0.A0g()) {
            AnonymousClass0XV r1 = this.A0F;
            boolean A002 = AnonymousClass0F5.A00(r1);
            AnonymousClass0XV A0I2 = r1.A0I();
            if (A002) {
                if (A0I2 != null) {
                    A0I2.A0m(false, true);
                }
            } else if (A0I2 != null) {
                A0I2.A0l(false, true);
            }
        }
    }

    public final void A06(int i) {
        AnonymousClass0XV A0I;
        C04700Ok r1;
        int i2;
        int i3 = this.A00;
        this.A00 = i;
        boolean z = false;
        boolean A1P = AnonymousClass000.A1P(i3);
        if (i == 0) {
            z = true;
        }
        if (A1P != z && (A0I = this.A0F.A0I()) != null && (r1 = A0I.A0Q) != null) {
            int i4 = r1.A00;
            if (i == 0) {
                i2 = i4 - 1;
            } else {
                i2 = i4 + 1;
            }
            r1.A06(i2);
        }
    }

    public final void A07(boolean z) {
        int i;
        if (this.A06 != z) {
            this.A06 = z;
            boolean z2 = this.A07;
            if (z) {
                if (!z2) {
                    i = this.A00 + 1;
                } else {
                    return;
                }
            } else if (!z2) {
                i = this.A00 - 1;
            } else {
                return;
            }
            A06(i);
        }
    }

    public final void A08(boolean z) {
        int i;
        if (this.A07 != z) {
            this.A07 = z;
            boolean z2 = this.A06;
            if (z) {
                if (!z2) {
                    i = this.A00 + 1;
                } else {
                    return;
                }
            } else if (!z2) {
                i = this.A00 - 1;
            } else {
                return;
            }
            A06(i);
        }
    }

    public C04700Ok(AnonymousClass0XV r3) {
        this.A0F = r3;
    }
}
