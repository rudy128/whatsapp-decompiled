package X;

import android.os.SystemClock;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Eh  reason: invalid class name and case insensitive filesystem */
public final class C143667Eh implements C1605388w {
    public long A00;
    public long A01;
    public final C24921Me A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass1M9 A08;

    public boolean BLC(AnonymousClass1BI r9) {
        long j;
        AnonymousClass1E7 A0G;
        long j2;
        long j3;
        long j4;
        long j5;
        C18070vi.A0d(r9, 0);
        C17960vV.A00();
        boolean z = this.A06;
        if (z) {
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        AnonymousClass11S r2 = this.A07;
        if (r2.A0O(r9)) {
            r2.A0I();
            A0G = r2.A0D;
        } else {
            A0G = this.A08.A0G(r9);
        }
        long j6 = this.A00;
        if (z) {
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        this.A00 = j6 + (j2 - j);
        if (A0G == null) {
            return false;
        }
        if (z) {
            j3 = SystemClock.elapsedRealtimeNanos();
        } else {
            j3 = 0;
        }
        AnonymousClass1BI r1 = A0G.A0J;
        boolean z2 = false;
        if (!C22971Dz.A0T(r1) || this.A04 || this.A05) {
            if (!C22971Dz.A0c(r1) && this.A02.A0l(A0G, this.A03)) {
                z2 = true;
            }
            j4 = this.A01;
            if (!z) {
                j5 = 0;
                this.A01 = j4 + (j5 - j3);
                return z2;
            }
        } else {
            j4 = this.A01;
        }
        j5 = SystemClock.elapsedRealtimeNanos();
        this.A01 = j4 + (j5 - j3);
        return z2;
    }

    public C143667Eh(AnonymousClass11S r4, AnonymousClass1M9 r5, C24921Me r6, C18030ve r7, C52682bJ r8, List list) {
        C18070vi.A0w(r7, r8, r5, r4, r6);
        C18070vi.A0d(list, 6);
        this.A08 = r5;
        this.A07 = r4;
        this.A02 = r6;
        this.A03 = list;
        C18030ve r2 = r8.A00;
        C18040vf r1 = C18040vf.A02;
        this.A04 = C18020vd.A05(r1, r2, 3751);
        this.A05 = C18020vd.A05(r1, r7, 4748);
        this.A06 = C18020vd.A05(r1, r7, 1777);
    }

    public /* synthetic */ Set BYj() {
        return C25511Om.A00;
    }
}
