package X;

import android.location.LocationManager;

public class APP implements C22552BCj, BAW {
    public boolean A00 = true;
    public final C192699op A01;
    public final C196069uP A02;
    public final C186589eR A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass19T A05;
    public final C219217x A06;

    public void BxM(C185719d2 r11) {
        Number A1C;
        Number A1C2;
        C196069uP r2 = this.A02;
        C41731wy r1 = r2.A04;
        if (r1.A06() != null && (A1C = C108945cZ.A1C(r1)) != null && A1C.intValue() == 0) {
            this.A01.A01(r11.A01, this, (C19989A2b) null, r11.A02, "device", r11.A00);
            if (r1.A06() != null && (A1C2 = C108945cZ.A1C(r1)) != null && A1C2.intValue() == 0) {
                AnonymousClass3MX.A1J(r1, 2);
                r2.A01.removeCallbacks(r2.A06);
            }
        }
    }

    public void A00() {
        C41731wy r1;
        int i;
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("network");
        C196069uP r2 = this.A02;
        boolean A032 = r2.A03();
        if (isProviderEnabled) {
            if (A032) {
                r1 = r2.A04;
                i = 5;
            } else {
                return;
            }
        } else if (A032) {
            r1 = r2.A04;
            i = 6;
        } else {
            return;
        }
        AnonymousClass3MX.A1K(r1, i);
        r2.A01.postDelayed(r2.A06, 20000);
    }

    public void BL4() {
        this.A02.A02();
        this.A05.markerPoint(207368785, "fetch_user_location_request_start");
    }

    public void Bvo(C190599lD r6, int i) {
        C196069uP r4 = this.A02;
        AnonymousClass1DT r3 = r4.A02;
        Number A1C = C108945cZ.A1C(r3);
        if (A1C != null && A1C.intValue() == 7) {
            int i2 = 3;
            if (i == -1) {
                i2 = 5;
            }
            r4.A01.removeCallbacks(r4.A06);
            Number A1C2 = C108945cZ.A1C(r3);
            if (A1C2 != null && A1C2.intValue() == 7) {
                AnonymousClass3MX.A1K(r4.A04, 7);
            }
            AnonymousClass3MX.A1J(r3, i2);
        }
    }

    public void Bvp(C20079A6f a6f) {
        boolean z;
        C196069uP r2 = this.A02;
        r2.A01.removeCallbacks(r2.A06);
        C21451AkI.A01(r2.A05, r2, a6f, 48);
        Number A1C = C108945cZ.A1C(r2.A02);
        if (A1C == null || A1C.intValue() != 7) {
            C186589eR r1 = this.A03;
            synchronized (r1) {
                z = r1.A02;
            }
            if (z) {
                return;
            }
        }
        this.A00 = false;
    }

    public void BxF() {
        boolean isProviderEnabled = ((LocationManager) this.A04.A00.getSystemService("location")).isProviderEnabled("gps");
        C196069uP r1 = this.A02;
        if (isProviderEnabled) {
            r1.A02();
        } else if (r1.A03()) {
            AnonymousClass3MX.A1K(r1.A04, 4);
        }
    }

    public void BxJ() {
        this.A02.A01();
    }

    public void CRJ() {
        C196069uP r2 = this.A02;
        C21446AkD.A01(r2.A05, r2, 27);
    }

    public APP(C189329iu r2, C20041A4k a4k, AM6 am6, C186589eR r5, AnonymousClass118 r6, C219217x r7, AnonymousClass19T r8, AnonymousClass10I r9) {
        this.A04 = r6;
        this.A06 = r7;
        this.A05 = r8;
        this.A03 = r5;
        this.A01 = r2.A00((AnonymousClass16N) C221618v.A02(AnonymousClass16N.class), am6);
        this.A02 = new C196069uP(a4k, r5, r7, r9);
    }
}
