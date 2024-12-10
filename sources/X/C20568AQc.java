package X;

import java.io.File;
import java.util.Random;

/* renamed from: X.AQc  reason: case insensitive filesystem */
public final class C20568AQc implements AnonymousClass1L0 {
    public final C20105A7j A00;
    public final C188529hZ A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public void Bqi() {
        C20105A7j a7j = this.A00;
        if (!a7j.A07.A04() || a7j.A02.A06() == null || C20105A7j.A01(a7j) == 5) {
            C188529hZ r3 = this.A01;
            AnonymousClass1Cd r0 = r3.A05;
            r0.A06();
            if (r0.A08) {
                if (C18020vd.A05(C18040vf.A02, r3.A06, 1456)) {
                    Integer[] numArr = new Integer[5];
                    numArr[0] = 1;
                    numArr[1] = 3;
                    numArr[2] = 2;
                    C17880vN.A1T(numArr, 20, 3);
                    AnonymousClass3Ma.A1T(numArr, 13);
                    Random random = r3.A0A;
                    int intValue = numArr[random.nextInt(5)].intValue();
                    File A0K = r3.A01.A0K(intValue, 0, new Integer[]{2, 1, 3}[random.nextInt(3)].intValue());
                    AnonymousClass10I r10 = r3.A09;
                    AnonymousClass190 r4 = r3.A00;
                    AnonymousClass18K r8 = r3.A07;
                    C25291Nq r9 = r3.A08;
                    AnonymousClass3MW.A1T(new C24146BwC(r4, r3.A02, r3.A03, r3.A04, r8, r9, r10, A0K, intValue), r10, 0);
                }
            }
        }
    }

    public C20568AQc(C20105A7j a7j, C188529hZ r2) {
        C18070vi.A0j(r2, a7j);
        this.A01 = r2;
        this.A00 = a7j;
    }
}
