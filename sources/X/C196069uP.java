package X;

import android.os.Handler;

/* renamed from: X.9uP  reason: invalid class name and case insensitive filesystem */
public final class C196069uP {
    public C20079A6f A00;
    public final Handler A01 = new Handler();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C186589eR A03;
    public final C41731wy A04 = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A05;
    public final Runnable A06 = new C21446AkD(this, 28);
    public final C20041A4k A07;
    public final C219217x A08;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[Catch:{ Exception -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r6 = this;
            X.9eR r4 = r6.A03
            X.A4k r5 = r6.A07
            monitor-enter(r4)
            X.A6f r0 = r4.A00     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0043
            X.00H r0 = r4.A03     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0054 }
            X.8vd r3 = (X.C173728vd) r3     // Catch:{ all -> 0x0054 }
            X.9kR r0 = r3.A03     // Catch:{ Exception -> 0x0032 }
            android.content.SharedPreferences r2 = r0.A00()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = "current_search_location"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ Exception -> 0x0032 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0032 }
            if (r0 != 0) goto L_0x0038
            X.1Cs r1 = r3.A02     // Catch:{ Exception -> 0x0032 }
            X.190 r0 = r3.A00     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = X.C20015A3h.A00(r0, r1, r2)     // Catch:{ Exception -> 0x0032 }
            X.A6f r0 = X.C20079A6f.A01(r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            r1 = move-exception
            java.lang.String r0 = "BusinessSearchSharedPrefs/readBusinessSearchLocation: Failed to fetch the search location"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0054 }
        L_0x0038:
            r0 = 0
        L_0x0039:
            r4.A00 = r0     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0043
            X.A6f r0 = r5.A02()     // Catch:{ all -> 0x0054 }
            r4.A00 = r0     // Catch:{ all -> 0x0054 }
        L_0x0043:
            monitor-exit(r4)
            r6.A00 = r0
            boolean r0 = r0.A05()
            r1 = 2
            if (r0 == 0) goto L_0x004e
            r1 = 4
        L_0x004e:
            X.1DT r0 = r6.A02
            X.AnonymousClass3MX.A1K(r0, r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196069uP.A00():void");
    }

    public final void A01() {
        this.A01.removeCallbacks(this.A06);
        AnonymousClass1DT r2 = this.A02;
        Number A1C = C108945cZ.A1C(r2);
        if (A1C != null && A1C.intValue() == 7) {
            AnonymousClass3MX.A1K(this.A04, 7);
        }
        AnonymousClass3MX.A1K(r2, 6);
    }

    public final boolean A03() {
        C173728vd r1 = (C173728vd) this.A03.A03.get();
        if (!r1.A03.A00().getBoolean("location_access_granted", C18020vd.A05(C18040vf.A02, r1.A00, 6328)) || !this.A08.A06()) {
            return false;
        }
        return true;
    }

    public C196069uP(C20041A4k a4k, C186589eR r4, C219217x r5, AnonymousClass10I r6) {
        C18070vi.A0s(r6, r5, r4, a4k);
        this.A05 = r6;
        this.A08 = r5;
        this.A03 = r4;
        this.A07 = a4k;
    }

    public final void A02() {
        if (A03()) {
            AnonymousClass3MX.A1K(this.A02, 7);
            AnonymousClass3MX.A1K(this.A04, 0);
            this.A01.postDelayed(this.A06, 20000);
        }
    }
}
