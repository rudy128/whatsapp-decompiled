package X;

import com.whatsapp.util.Log;

/* renamed from: X.3qB  reason: invalid class name and case insensitive filesystem */
public final class C77493qB extends AnonymousClass6UT {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;

    public void A00() {
        Log.i("EventCompanionRegistrationObserver/ Companion device bootstrap successful");
        if (!C18020vd.A05(C18040vf.A02, this.A03, 7306)) {
            Log.i("EventCompanionRegistrationObserver/ skipping, feature not enabled");
        } else {
            this.A04.CGN(new C98564rM(this, 47));
        }
    }

    public C77493qB(AnonymousClass1Cd r1, C18030ve r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A02 = r5;
    }
}
