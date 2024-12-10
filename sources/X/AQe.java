package X;

import java.util.Random;

public final class AQe implements AnonymousClass1L0 {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass190 A02;
    public final C17930vS A03;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        AnonymousClass192 r3 = (AnonymousClass192) this.A02;
        r3.A0C.CGF(new C70573Bq(r3, 9));
        int A002 = C18020vd.A00(C18040vf.A02, this.A00, 1211);
        if (A002 > 0 && new Random().nextInt(A002) < 1) {
            C171618s0 r1 = new C171618s0();
            r1.A02 = AnonymousClass3MY.A0f();
            r1.A03 = C108975cc.A0X();
            r1.A09 = "Dummy";
            r1.A08 = "Dummy";
            r1.A06 = "2.24.24.78";
            this.A01.CC4(r1);
        }
        this.A03.A02("minidumps", 0).delete();
    }

    public AQe(AnonymousClass190 r1, C18030ve r2, AnonymousClass18K r3, C17930vS r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
        this.A03 = r4;
    }
}
