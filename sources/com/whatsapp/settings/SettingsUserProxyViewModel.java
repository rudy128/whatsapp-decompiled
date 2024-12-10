package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4HR;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C219017v;
import X.C25011Mn;
import X.C31311fM;
import X.C81303z1;
import X.C85354Nb;
import X.C85974Pq;
import X.C88074Yf;
import X.C88214Yt;
import X.C92244gz;
import X.C98844ro;

public class SettingsUserProxyViewModel extends AnonymousClass1J2 {
    public int A00 = 0;
    public int A01 = 0;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A08;
    public final AnonymousClass11E A09;
    public final C219017v A0A;
    public final C25011Mn A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final C18030ve A0I;

    public static int A00(int i) {
        if (i == 1) {
            return 2131894984;
        }
        if (i == 2) {
            return 2131894813;
        }
        if (i == 3) {
            return 2131894823;
        }
        if (i == 4) {
            return 2131894818;
        }
        if (i != 5) {
            return 2131894822;
        }
        return 2131894814;
    }

    public synchronized void A0V() {
        String A012 = AnonymousClass3MW.A0l(((C31311fM) this.A0H.get()).A00).A01();
        this.A02 = A012;
        this.A05.A0E(A012);
    }

    public synchronized void A0W(int i, boolean z) {
        C85974Pq r3;
        boolean z2;
        this.A00 = i;
        if (!z) {
            if (i == 2) {
                r3 = (C85974Pq) this.A0G.get();
                z2 = true;
            } else if (i == 3 || i == 4) {
                r3 = (C85974Pq) this.A0G.get();
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            C81303z1 r1 = new C81303z1();
            r1.A01 = null;
            r1.A00 = valueOf;
            r3.A00.CC7(r1);
        }
        this.A06.A0E(new C85354Nb(this.A00, this.A01, A00(i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0Z(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = X.AnonymousClass4ZA.A00     // Catch:{ all -> 0x0098 }
            r4 = 443(0x1bb, float:6.21E-43)
            r5 = 0
            X.C18070vi.A0d(r8, r5)     // Catch:{ all -> 0x0098 }
            boolean r0 = X.AnonymousClass4ZA.A01(r8)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = ":"
            X.1wr r0 = new X.1wr     // Catch:{ all -> 0x0098 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0098 }
            java.util.List r3 = r0.A01(r8, r5)     // Catch:{ all -> 0x0098 }
            int r1 = r3.size()     // Catch:{ all -> 0x0098 }
            r2 = 58
            r0 = 1
            if (r1 == r0) goto L_0x0034
            java.lang.String r0 = X.C17880vN.A0w(r3, r0)     // Catch:{ all -> 0x0098 }
            r1 = -1
            int r4 = X.C20099A7c.A01(r0, r1)     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0098 }
            if (r4 <= r1) goto L_0x008d
            if (r0 == 0) goto L_0x008d
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = X.C17880vN.A0w(r3, r5)     // Catch:{ all -> 0x0098 }
            r1.append(r0)     // Catch:{ all -> 0x0098 }
            r1.append(r2)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = X.C17880vN.A0t(r1, r4)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x008d
            X.00H r0 = r7.A0G     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0098 }
            X.4Pq r0 = (X.C85974Pq) r0     // Catch:{ all -> 0x0098 }
            r4 = 1
            r0.A00(r4)     // Catch:{ all -> 0x0098 }
            X.00H r0 = r7.A0H     // Catch:{ all -> 0x0098 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0098 }
            X.1fM r5 = (X.C31311fM) r5     // Catch:{ all -> 0x0098 }
            X.00H r6 = r5.A00     // Catch:{ all -> 0x0098 }
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r6)     // Catch:{ all -> 0x0098 }
            X.0vc r1 = r0.A01     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "user_proxy_setting_pref"
            android.content.SharedPreferences r2 = r1.A05(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "proxy_media_port"
            r0 = 587(0x24b, float:8.23E-43)
            int r2 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0098 }
            android.content.SharedPreferences r1 = X.C88214Yt.A00(r6)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "proxy_use_tls"
            boolean r1 = r1.getBoolean(r0, r4)     // Catch:{ all -> 0x0098 }
            r0 = 443(0x1bb, float:6.21E-43)
            X.4Yf r0 = X.AnonymousClass4HR.A00(r3, r0, r2, r1)     // Catch:{ all -> 0x0098 }
            r5.A03(r0)     // Catch:{ all -> 0x0098 }
            r7.A02 = r3     // Catch:{ all -> 0x0098 }
            X.1DT r0 = r7.A05     // Catch:{ all -> 0x0098 }
            r0.A0E(r3)     // Catch:{ all -> 0x0098 }
            goto L_0x0096
        L_0x008d:
            X.1KB r1 = r7.A08     // Catch:{ all -> 0x0098 }
            r0 = 2131894819(0x7f122223, float:1.9424454E38)
            r4 = 0
            r1.A09(r0, r5)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r7)
            return r4
        L_0x0098:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsUserProxyViewModel.A0Z(java.lang.String):boolean");
    }

    public static void A03(SettingsUserProxyViewModel settingsUserProxyViewModel) {
        C92244gz r2 = (C92244gz) settingsUserProxyViewModel.A0E.get();
        C98844ro.A00(r2.A01, r2, 42);
        settingsUserProxyViewModel.A04 = true;
        settingsUserProxyViewModel.A0W(1, false);
        settingsUserProxyViewModel.A0B.A00();
        settingsUserProxyViewModel.A0A.A0E((String) null, (String) null, 0, true, false, false, false, false, true);
        C98844ro.A02(settingsUserProxyViewModel.A0C, settingsUserProxyViewModel, 31);
    }

    public static void A04(SettingsUserProxyViewModel settingsUserProxyViewModel, AnonymousClass00H r3, Object obj) {
        ((C88214Yt) obj).A03(settingsUserProxyViewModel.A00);
        ((C88214Yt) r3.get()).A02(settingsUserProxyViewModel.A01);
    }

    public C88074Yf A0T() {
        String str = this.A02;
        if (str == null) {
            return new C88074Yf();
        }
        AnonymousClass00H r3 = this.A0F;
        return AnonymousClass4HR.A00(str, 443, AnonymousClass3MW.A0l(r3).A01.A05("user_proxy_setting_pref").getInt("proxy_media_port", 587), AnonymousClass3MX.A1T(C88214Yt.A00(r3), "proxy_use_tls"));
    }

    public boolean A0X() {
        return AnonymousClass3MW.A0l(((C31311fM) this.A0H.get()).A00).A06();
    }

    public boolean A0Y() {
        return C18020vd.A05(C18040vf.A01, this.A0I, 3641);
    }

    public SettingsUserProxyViewModel(AnonymousClass1KB r2, AnonymousClass11E r3, C18030ve r4, C219017v r5, C25011Mn r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A0I = r4;
        this.A08 = r2;
        this.A0C = r7;
        this.A0B = r6;
        this.A0A = r5;
        this.A0G = r8;
        this.A0H = r9;
        this.A0D = r10;
        this.A09 = r3;
        this.A0F = r11;
        this.A0E = r12;
    }

    public void A0U() {
        if (!A0X() || this.A02 == null) {
            C92244gz r2 = (C92244gz) this.A0E.get();
            C98844ro.A00(r2.A01, r2, 43);
            this.A04 = false;
            A0W(4, false);
            this.A0B.A00();
            this.A0A.A0E((String) null, (String) null, 0, true, false, false, false, false, true);
            return;
        }
        A03(this);
    }
}
