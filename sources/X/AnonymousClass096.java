package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.096  reason: invalid class name */
public final class AnonymousClass096 extends AnonymousClass0XW implements C17670v2 {
    public C05400Ua A00;
    public boolean A01;
    public boolean A02;

    public int BjB(C16860tL r2, C17740v9 r3, int i) {
        if (this.A02) {
            return r2.Bj9(i);
        }
        return r2.Bj9(Integer.MAX_VALUE);
    }

    public int BjE(C16860tL r2, C17740v9 r3, int i) {
        if (this.A02) {
            return r2.BjC(Integer.MAX_VALUE);
        }
        return r2.BjC(i);
    }

    public C16820tH Bja(C17500ul r10, C17530uo r11, long j) {
        AnonymousClass0CI r0;
        int A002;
        int i;
        Snapshot A022;
        boolean z = this.A02;
        if (z) {
            r0 = AnonymousClass0CI.Vertical;
        } else {
            r0 = AnonymousClass0CI.Horizontal;
        }
        long j2 = j;
        C02220De.A00(r0, j);
        if (z) {
            A002 = Integer.MAX_VALUE;
            i = Constraints.A01(j);
        } else {
            A002 = Constraints.A00(j);
            i = Integer.MAX_VALUE;
        }
        AnonymousClass0XJ Bjb = r10.Bjb(Constraints.A04(0, i, 0, A002, 5, j2));
        int i2 = Bjb.A01;
        int i3 = i2;
        int A012 = Constraints.A01(j);
        if (i2 > A012) {
            i2 = A012;
        }
        int i4 = Bjb.A00;
        int i5 = i4;
        int A003 = Constraints.A00(j);
        if (i4 > A003) {
            i4 = A003;
        }
        int i6 = i5 - i4;
        int i7 = i3 - i2;
        if (!this.A02) {
            i6 = i7;
        }
        C05400Ua r1 = this.A00;
        r1.A01.CJC(i6);
        Snapshot A004 = C04790Ov.A00();
        try {
            A022 = A004.A02();
            C17280uP r12 = r1.A03;
            if (r12.BT8() > i6) {
                r12.CJC(i6);
            }
            AnonymousClass0N4.A00(A022);
            A004.A0D();
            C05400Ua r2 = this.A00;
            int i8 = i2;
            if (this.A02) {
                i8 = i4;
            }
            r2.A04.CJC(i8);
            return r11.BhL(AnonymousClass1D7.A0I(), new C11110jV(this, Bjb, i6), i2, i4);
        } catch (Throwable th) {
            A004.A0D();
            throw th;
        }
    }

    public int Bjx(C16860tL r2, C17740v9 r3, int i) {
        if (this.A02) {
            return r2.Bjv(i);
        }
        return r2.Bjv(Integer.MAX_VALUE);
    }

    public int Bk0(C16860tL r2, C17740v9 r3, int i) {
        if (this.A02) {
            return r2.Bjy(Integer.MAX_VALUE);
        }
        return r2.Bjy(i);
    }
}
