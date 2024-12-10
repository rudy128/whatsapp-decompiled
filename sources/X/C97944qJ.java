package X;

import com.whatsapp.util.Log;

/* renamed from: X.4qJ  reason: invalid class name and case insensitive filesystem */
public final class C97944qJ implements AnonymousClass3LN {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;

    public void Bmm() {
        Log.i("EventStartAlarmBootCompletedObserver/ onBootCompleted");
        if (!C18020vd.A05(C18040vf.A02, this.A03, 7306)) {
            Log.i("EventStartAlarmBootCompletedObserver/ skipping, feature not enabled");
        } else {
            this.A04.CGN(new C98564rM(this, 49));
        }
    }

    public C97944qJ(AnonymousClass1Cd r2, C18030ve r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r6, r2);
        C18070vi.A0d(r7, 6);
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r6;
        this.A00 = r2;
        this.A02 = r7;
    }
}
