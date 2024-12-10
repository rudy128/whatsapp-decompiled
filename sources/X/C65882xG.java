package X;

/* renamed from: X.2xG  reason: invalid class name and case insensitive filesystem */
public class C65882xG implements C26181Rd, AnonymousClass1R4 {
    public final AnonymousClass11S A00;
    public final C26721Tf A01;
    public final AnonymousClass1M9 A02;
    public final C26191Re A03;
    public final C25161Nd A04;
    public final AnonymousClass11P A05;
    public final C19830z4 A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1Cd A08;
    public final C24751Ln A09;
    public final AnonymousClass1U2 A0A;
    public final AnonymousClass1MR A0B;
    public final C18030ve A0C;
    public final AnonymousClass10I A0D;

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvV() {
    }

    public static boolean A00(C62512rW r9, C65882xG r10, long j) {
        long j2 = r9.A05;
        if (j - j2 >= ((long) Math.min(35, Math.max(C18020vd.A00(C18040vf.A02, r10.A0C, 730), 1))) * 86400) {
            return true;
        }
        if (r9.A02 <= j2 || r9.A04 == C17890vO.A05(C17890vO.A0B(r10.A06), "adv_last_device_job_ts") || (j * 1000) - r9.A03 < 90000000) {
            return false;
        }
        return true;
    }

    public void BvU() {
        Boolean bool = C17970vW.A03;
        this.A0D.CGL(new C70573Bq(this, 44), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public void Bvh() {
        this.A0D.CGL(new C70573Bq(this, 44), "DeviceADVInfoChecker/checkDeviceListADVInfo");
    }

    public C65882xG(AnonymousClass11S r1, C26721Tf r2, AnonymousClass1M9 r3, C26191Re r4, C25161Nd r5, AnonymousClass11P r6, C19830z4 r7, AnonymousClass1MZ r8, AnonymousClass1Cd r9, C24751Ln r10, AnonymousClass1U2 r11, AnonymousClass1MR r12, C18030ve r13, AnonymousClass10I r14) {
        this.A05 = r6;
        this.A0C = r13;
        this.A00 = r1;
        this.A0D = r14;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A0B = r12;
        this.A0A = r11;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = r2;
    }
}
