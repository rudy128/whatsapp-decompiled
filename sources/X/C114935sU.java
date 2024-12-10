package X;

import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5sU  reason: invalid class name and case insensitive filesystem */
public abstract class C114935sU extends AnonymousClass1FY {
    public boolean A00 = false;

    public static void A0Q(WaBloksActivity waBloksActivity) {
        waBloksActivity.A03.A00(waBloksActivity.getApplicationContext(), (C22415B6x) waBloksActivity.A06.get(), waBloksActivity.A01);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            WaBloksActivity waBloksActivity = (WaBloksActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, waBloksActivity);
            AnonymousClass1FB.A0M(A0A, waBloksActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, waBloksActivity);
            C109005cf.A0e(A0A, r1, waBloksActivity, r1.A5A);
            A03(r4, A0A, r1, waBloksActivity);
        }
    }

    public C114935sU() {
        C1423379b.A00(this, 13);
    }

    public static void A03(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, WaBloksActivity waBloksActivity) {
        waBloksActivity.A07 = C000200d.A00(r3.A6e);
        waBloksActivity.A04 = (C20000A2o) r2.AFK.get();
        waBloksActivity.A0C = r3.ATO();
        waBloksActivity.A0B = r3.ATM();
        waBloksActivity.A00 = (C56382hN) r1.A64.get();
        waBloksActivity.A06 = C000200d.A00(r3.AFQ);
        waBloksActivity.A02 = (C20049A4s) r3.A6k.get();
        waBloksActivity.A0A = AnonymousClass1K1.A01(r1);
        waBloksActivity.A03 = r3.A2Q();
    }
}
