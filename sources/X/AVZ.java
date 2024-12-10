package X;

import android.os.SystemClock;
import java.util.List;

public final class AVZ implements C160938Ar {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public AnonymousClass1Be A04;
    public String A05;
    public List A06 = AnonymousClass000.A13();
    public boolean A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass18K A09;

    public void Bpn(C62652rk r2) {
        A03(r2, 6);
        A01(1);
    }

    public void Bpo(C62652rk r3, int i, boolean z) {
        A04(r3, (Integer) null, 6);
        A01(i);
    }

    public void Brz(int i) {
        if (AnonymousClass000.A1T(i, 12)) {
            this.A06.clear();
            this.A07 = false;
        } else if (this.A07) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C171648s3 r4 = new C171648s3();
            A02(r4, 2, uptimeMillis);
            r4.A03 = C63602tO.A01(i);
            r4.A00 = false;
            r4.A07 = 1;
            this.A03 = uptimeMillis;
            this.A01++;
            this.A00++;
            this.A06.add(r4);
        }
    }

    public /* synthetic */ void Bs1(int i) {
    }

    public void BvW(C62652rk r2) {
        A03(r2, 4);
    }

    public void BvX(C62652rk r3, int i) {
        A04(r3, Integer.valueOf(i), 4);
    }

    public /* synthetic */ void BvY(C62652rk r1) {
    }

    public void BxP(C62652rk r2) {
        A03(r2, 5);
    }

    public void BxR(C62652rk r3, int i) {
        A04(r3, Integer.valueOf(i), 5);
    }

    public /* synthetic */ void BxS(C62652rk r1) {
    }

    public void C5s(C62652rk r3, int i) {
        A04(r3, Integer.valueOf(i), 3);
    }

    public void C5t(C62652rk r2) {
        A03(r2, 3);
    }

    public /* synthetic */ void C5u(C62652rk r1) {
    }

    private final C171648s3 A00(C62652rk r6, C22821Di r7, int i) {
        int i2 = r6.A02;
        if (i2 == 12) {
            this.A06.clear();
            this.A07 = false;
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        C171648s3 r4 = new C171648s3();
        A02(r4, i, uptimeMillis);
        r4.A02 = r6.A01();
        r4.A03 = C63602tO.A01(i2);
        r4.A0D = r6.A02();
        r4.A04 = Integer.valueOf(r6.A00());
        Boolean bool = r6.A00;
        if (bool != null) {
            r4.A01 = bool;
        }
        r7.invoke(r4);
        this.A03 = uptimeMillis;
        this.A01++;
        this.A00++;
        return r4;
    }

    private final void A01(int i) {
        AnonymousClass1Be r4 = this.A04;
        if (r4 != null) {
            List<C171648s3> list = this.A06;
            for (C171648s3 r1 : list) {
                r1.A05 = Integer.valueOf(i);
                this.A09.CC8(r1, r4);
            }
            list.clear();
            this.A07 = false;
        }
    }

    private final void A03(C62652rk r3, int i) {
        C171648s3 A002;
        if (this.A07 && (A002 = A00(r3, B39.A00, i)) != null) {
            this.A06.add(A002);
        }
    }

    private final void A04(C62652rk r3, Integer num, int i) {
        C171648s3 A002;
        if (this.A07 && (A002 = A00(r3, new C22204AzK(num), i)) != null) {
            this.A06.add(A002);
        }
    }

    public void Bs0(C62652rk r3) {
        C171648s3 A002;
        if (this.A07 && (A002 = A00(r3, B39.A00, 2)) != null) {
            this.A06.add(A002);
        }
    }

    public AVZ(AnonymousClass11P r2, AnonymousClass18K r3) {
        C18070vi.A0j(r2, r3);
        this.A08 = r2;
        this.A09 = r3;
    }

    private final void A02(C171648s3 r3, int i, long j) {
        r3.A06 = Integer.valueOf(i);
        r3.A08 = C108945cZ.A1B(j, this.A02);
        r3.A0B = C108945cZ.A1B(j, this.A03);
        r3.A09 = Long.valueOf(this.A00);
        r3.A0C = this.A05;
        r3.A0A = Long.valueOf(this.A01);
    }

    public void Bpp() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A02 = uptimeMillis;
        this.A03 = uptimeMillis;
        this.A05 = C17890vO.A0Q();
        this.A01 = 0;
        C171648s3 r2 = new C171648s3();
        r2.A06 = 1;
        r2.A08 = 0L;
        r2.A0B = 0L;
        r2.A0C = this.A05;
        r2.A0A = Long.valueOf(this.A01);
        r2.A09 = Long.valueOf(this.A00);
        r2.A00 = true;
        AnonymousClass1Be BDn = this.A09.BDn(r2, (C18180vt) null);
        this.A04 = BDn;
        boolean A002 = BDn.A00();
        this.A07 = A002;
        if (A002) {
            this.A06.add(r2);
        }
        this.A01++;
        this.A00++;
    }
}
