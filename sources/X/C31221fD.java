package X;

import com.whatsapp.calling.telecom.SelfManagedConnectionService;

/* renamed from: X.1fD  reason: invalid class name and case insensitive filesystem */
public final class C31221fD extends C008503u {
    public AnonymousClass00S A00;
    public AnonymousClass00S A01;
    public AnonymousClass00S A02;
    public AnonymousClass00S A03;
    public AnonymousClass00S A04;
    public AnonymousClass00S A05;
    public AnonymousClass00S A06;
    public final AnonymousClass10E A07;
    public final C31221fD A08;

    public C31221fD(AnonymousClass10E r1) {
        this.A08 = this;
        this.A07 = r1;
        A00();
    }

    private void A00() {
        AnonymousClass10E r3 = this.A07;
        C31221fD r2 = this.A08;
        this.A06 = new C31231fE(r2, r3, 0);
        this.A00 = AnonymousClass00f.A00(new C31231fE(r2, r3, 1));
        this.A01 = AnonymousClass00f.A00(new C31231fE(r2, r3, 2));
        this.A02 = AnonymousClass00f.A00(new C31231fE(r2, r3, 3));
        this.A03 = AnonymousClass00f.A00(new C31231fE(r2, r3, 5));
        this.A04 = AnonymousClass00f.A00(new C31231fE(r2, r3, 4));
        this.A05 = new C31231fE(r2, r3, 6);
    }

    private void A01(SelfManagedConnectionService selfManagedConnectionService) {
        A02(selfManagedConnectionService, (AnonymousClass1VM) this.A07.A9l.get());
    }

    public void A03(SelfManagedConnectionService selfManagedConnectionService) {
        A01(selfManagedConnectionService);
    }

    public static void A02(SelfManagedConnectionService selfManagedConnectionService, AnonymousClass1VM r1) {
        selfManagedConnectionService.A00 = r1;
    }
}
