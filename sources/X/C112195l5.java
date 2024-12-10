package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5l5  reason: invalid class name and case insensitive filesystem */
public final class C112195l5 extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final AnonymousClass1KB A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final C37451pZ A04;
    public final AnonymousClass11P A05;
    public final C18000vb A06;
    public final C127856f3 A07;
    public final AnonymousClass10I A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C112195l5(AnonymousClass1KB r2, AnonymousClass1M9 r3, C24921Me r4, C37451pZ r5, AnonymousClass11P r6, C18000vb r7, C127856f3 r8, AnonymousClass10I r9, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(r5, 2);
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A0A = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A07 = r8;
        this.A08 = r9;
        this.A09 = z4;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C113575nJ r6 = (C113575nJ) r10;
        C18070vi.A0d(r6, 0);
        int i2 = i;
        C129226hS r5 = (C129226hS) this.A00.get(i);
        if (this.A09) {
            this.A08.CGF(new C146607Px(this, r5, r6, i2, 5));
            return;
        }
        AnonymousClass1E7 A0H = this.A02.A0H(r5.A02);
        this.A04.A0C(r6.A00, A0H, false);
        r6.A0B(r5, this.A03.A0N(A0H), i);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        LayoutInflater A0B2 = AnonymousClass3MY.A0B(viewGroup);
        boolean z = this.A0C;
        int i2 = 2131627003;
        if (z) {
            i2 = 2131627004;
        }
        View A0B3 = AnonymousClass3MX.A0B(A0B2, viewGroup, i2, false);
        boolean z2 = this.A0B;
        boolean z3 = this.A0A;
        return new C113575nJ(A0B3, this.A05, this.A06, this.A07, z, z2, z3);
    }

    public long A0M(int i) {
        if (this.A09) {
            return (long) ((C129226hS) this.A00.get(i)).A02.hashCode();
        }
        return -1;
    }

    public int A0Q() {
        return this.A00.size();
    }

    public final void A0U(AnonymousClass1BI r3) {
        for (C129226hS r0 : this.A00) {
            if (r3.equals(r0.A02)) {
                notifyDataSetChanged();
                return;
            }
        }
    }
}
