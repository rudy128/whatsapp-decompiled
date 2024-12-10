package X;

import android.os.SystemClock;
import java.io.File;

/* renamed from: X.7Ml  reason: invalid class name and case insensitive filesystem */
public class C145747Ml implements C160828Ab {
    public final int A00;
    public final Object A01;

    public C145747Ml(C115295ti r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public /* synthetic */ void Bn3(C136956ug r6, long j) {
        if (this.A00 != 0) {
            C115295ti r4 = (C115295ti) this.A01;
            r4.A0r.A03(1);
            long j2 = r6.A0B;
            r4.A0I.A04(Long.valueOf(j2));
            r4.A0d.A0A(j2);
            r4.A0k.A0B(j2, j);
            C56202h4 r0 = r4.A01;
            if (r0 != null) {
                r0.A0A = j2;
            }
        }
    }

    public void BsE(int i) {
        C115295ti r3 = (C115295ti) this.A01;
        if (i == 0) {
            r3.A0i.A03(r3.A07, AnonymousClass00R.A15);
        } else if (i == 1) {
            r3.A0i.A03(r3.A07, AnonymousClass00R.A18);
            r3.A0k.A08();
        } else if (i == 2) {
            AnonymousClass70W r7 = r3.A0k;
            long j = r7.A0A;
            if (j != -1 && r7.A01() != -1) {
                r7.A0G = SystemClock.elapsedRealtime() - j;
                r7.A03 = 2;
            }
        } else if (i == 3) {
            r3.A0k.A0A();
        }
    }

    public /* synthetic */ void BsF(int i) {
        if (this.A00 != 0 && i == 4) {
            AnonymousClass70W r5 = ((C115295ti) this.A01).A0k;
            if (!r5.A0D()) {
                r5.A08();
            }
            if (r5.A02() == -1) {
                r5.A0A();
            }
        }
    }

    public /* synthetic */ void C06(File file, boolean z) {
        if (this.A00 != 0) {
            C115295ti r3 = (C115295ti) this.A01;
            C136996uk A02 = r3.A0d.A02();
            synchronized (A02) {
                A02.A03 = false;
                A02.A04 = Boolean.valueOf(z);
                A02.A01 = new C1409173o(23);
            }
            C115295ti.A06(r3, A02, file, AnonymousClass74L.A07(r3.A0e.A0J), true);
            r3.A03 = A02.A03();
            r3.A0H.A04(new C134716r2(A02, z));
        }
    }

    public /* synthetic */ void C3T() {
        if (this.A00 != 0) {
            ((C115295ti) this.A01).A0G();
        }
    }

    public /* synthetic */ void BuV() {
    }
}
