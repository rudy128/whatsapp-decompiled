package X;

import com.whatsapp.util.Log;

/* renamed from: X.6py  reason: invalid class name and case insensitive filesystem */
public class C134076py {
    public final AnonymousClass11C A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final A98 A03;
    public final AnonymousClass7AF A04;
    public final C192309o9 A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass11P A07;

    public void A00() {
        Log.i("AccountDefenceDataManager/resetRegistration");
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        this.A04.A01();
        C192309o9 r1 = this.A05;
        Log.i("AccountDefenceLocalDataRepository/clearAllData");
        C17900vP.A0J(r1.A00.A05("AccountDefenceLocalDataRepository_prefs"));
    }

    public void A01(AnonymousClass89K r6, String str, String str2) {
        Log.i("AccountDefenceDataManager/startFetchingDeviceConfirmation");
        C128686gW r3 = new C128686gW(r6, str, str2);
        AnonymousClass7AF r4 = this.A04;
        synchronized (r4) {
            Log.i("FetchDeviceConfirmationPoller/onRequestComplete/startPolling");
            if (r4.A01 == null) {
                r4.A01 = C200710s.A00(r4.A06);
            }
            r4.A07.set(false);
            r4.A00 = System.currentTimeMillis();
            r4.A01.execute(new C146517Pk(r4, r3, 37));
        }
    }

    public C134076py(AnonymousClass11C r1, AnonymousClass11P r2, AnonymousClass118 r3, C19830z4 r4, A98 a98, AnonymousClass7AF r6, C192309o9 r7, AnonymousClass10I r8) {
        this.A07 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = a98;
        this.A04 = r6;
    }
}
