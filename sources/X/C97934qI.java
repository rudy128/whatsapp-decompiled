package X;

import com.whatsapp.util.Log;

/* renamed from: X.4qI  reason: invalid class name and case insensitive filesystem */
public final class C97934qI implements AnonymousClass3LN {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final C18030ve A02;
    public final AnonymousClass10I A03;

    public void Bmm() {
        Log.i("ScheduledReminderMessageBootObserver onBootCompleted");
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A02, 5075);
        AnonymousClass10I r1 = this.A03;
        if (A05) {
            C98834rn.A00(r1, this, 20);
        } else {
            C98834rn.A01(r1, this, 21);
        }
    }

    public C97934qI(AnonymousClass1Cd r1, C18030ve r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0s(r3, r1, r4, r2);
        this.A03 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A02 = r2;
    }
}
