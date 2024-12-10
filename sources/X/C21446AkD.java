package X;

/* renamed from: X.AkD  reason: case insensitive filesystem */
public class C21446AkD implements Runnable {
    public final int A00;
    public final Object A01;

    public C21446AkD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C200710s r1, Object obj, int i) {
        r1.execute(new C21446AkD(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21446AkD(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b9, code lost:
        if (r3.A00 == 3) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ca, code lost:
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0265, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x039d, code lost:
        if (r2 != null) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0525, code lost:
        if (r1 != null) goto L_0x0527;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x052d, code lost:
        if (r0 == null) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0543, code lost:
        if (r1 != null) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x054b, code lost:
        if (r0 != null) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x054d, code lost:
        X.C20321AGd.A00(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0550, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05fe, code lost:
        r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0601, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x064b, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x065c, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0660, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x06b7;
                case 1: goto L_0x04b7;
                case 2: goto L_0x06a1;
                case 3: goto L_0x0695;
                case 4: goto L_0x0676;
                case 5: goto L_0x0668;
                case 6: goto L_0x0620;
                case 7: goto L_0x060f;
                case 8: goto L_0x0602;
                case 9: goto L_0x05e5;
                case 10: goto L_0x05a8;
                case 11: goto L_0x0596;
                case 12: goto L_0x058b;
                case 13: goto L_0x0564;
                case 14: goto L_0x0557;
                case 15: goto L_0x04bf;
                case 16: goto L_0x0475;
                case 17: goto L_0x0467;
                case 18: goto L_0x03e9;
                case 19: goto L_0x064e;
                case 20: goto L_0x03cf;
                case 21: goto L_0x0389;
                case 22: goto L_0x0373;
                case 23: goto L_0x032e;
                case 24: goto L_0x0317;
                case 25: goto L_0x030b;
                case 26: goto L_0x0303;
                case 27: goto L_0x02e3;
                case 28: goto L_0x02d7;
                case 29: goto L_0x02b0;
                case 30: goto L_0x02b0;
                case 31: goto L_0x0005;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0287;
                case 35: goto L_0x027c;
                case 36: goto L_0x0274;
                case 37: goto L_0x026c;
                case 38: goto L_0x01e8;
                case 39: goto L_0x01d2;
                case 40: goto L_0x01ad;
                case 41: goto L_0x0187;
                case 42: goto L_0x016c;
                case 43: goto L_0x0149;
                case 44: goto L_0x012d;
                case 45: goto L_0x0125;
                case 46: goto L_0x00ef;
                case 47: goto L_0x00ef;
                case 48: goto L_0x00ce;
                case 49: goto L_0x00bb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r13.A01
            X.A4G r5 = (X.A4G) r5
            java.lang.String r4 = "BusinessSearchRecentSearchManager/saveRecentSearches/Failed!"
            java.util.concurrent.locks.ReadWriteLock r3 = r5.A05
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.lock()
            r2 = 0
            java.io.File r0 = X.A4G.A00(r5)     // Catch:{ Exception -> 0x00a0 }
            java.io.FileOutputStream r6 = X.C108945cZ.A19(r0)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x0099 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0099 }
            r7.<init>(r6, r0)     // Catch:{ all -> 0x0099 }
            java.util.List r9 = r5.A00     // Catch:{ all -> 0x0092 }
            X.C18070vi.A0W(r9)     // Catch:{ all -> 0x0092 }
            org.json.JSONArray r8 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x0092 }
            monitor-enter(r9)     // Catch:{ all -> 0x0092 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x008f }
        L_0x0032:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x008f }
            X.9N2 r11 = (X.AnonymousClass9N2) r11     // Catch:{ all -> 0x008f }
            boolean r0 = r11 instanceof X.AnonymousClass8lG     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0060
            X.8lG r11 = (X.AnonymousClass8lG) r11     // Catch:{ all -> 0x008f }
            org.json.JSONObject r10 = X.C17880vN.A15()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "query"
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x008f }
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "lastUpdated"
            java.lang.Long r0 = r11.A00     // Catch:{ all -> 0x008f }
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "type"
            r0 = 1
        L_0x0059:
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            r8.put(r10)     // Catch:{ all -> 0x008f }
            goto L_0x0032
        L_0x0060:
            X.8lH r11 = (X.AnonymousClass8lH) r11     // Catch:{ all -> 0x008f }
            org.json.JSONObject r10 = X.C17880vN.A15()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "id"
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x008f }
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x008f }
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "lastUpdated"
            java.lang.Long r0 = r11.A00     // Catch:{ all -> 0x008f }
            r10.put(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "type"
            r0 = 0
            goto L_0x0059
        L_0x007f:
            monitor-exit(r9)     // Catch:{ all -> 0x0092 }
            r0 = 2
            java.lang.String r0 = r8.toString(r0)     // Catch:{ all -> 0x0092 }
            r7.write(r0)     // Catch:{ all -> 0x0092 }
            r7.close()     // Catch:{ all -> 0x0099 }
            r6.close()     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00aa
        L_0x008f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ Exception -> 0x00a0 }
            throw r0     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x00b2 }
            X.190 r1 = r5.A01     // Catch:{ all -> 0x00b2 }
            r0 = 0
            r1.A0G(r4, r2, r0)     // Catch:{ all -> 0x00b2 }
        L_0x00aa:
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            return
        L_0x00b2:
            r1 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x00bb:
            java.lang.Object r0 = r13.A01
            X.8yP r0 = (X.C175258yP) r0
            java.util.Set r1 = r0.A0E
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0
            com.whatsapp.voipcalling.Voip.updateParticipantsRxSubscription(r0)
            return
        L_0x00ce:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r2 = r0.A03
            boolean r0 = r2 instanceof X.C110745gz
            r1 = 0
            if (r0 == 0) goto L_0x00e2
            if (r2 == 0) goto L_0x00e2
            r0 = 2131429948(0x7f0b0a3c, float:1.8481583E38)
            android.view.View r1 = r2.findViewById(r0)
        L_0x00e2:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x04be
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x04be
            r0 = 0
            X.C29191bl.A02(r1, r0)
            return
        L_0x00ef:
            java.lang.Object r0 = r13.A01
            X.AbB r0 = (X.C20895AbB) r0
            X.00H r0 = r0.A00
            java.lang.Object r3 = r0.get()
            X.9yJ r3 = (X.C198419yJ) r3
            java.util.List r0 = X.C198419yJ.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0101:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04be
            java.lang.String r1 = X.C17880vN.A0v(r2)
            X.00H r0 = r3.A00
            java.lang.Object r0 = r0.get()
            X.118 r0 = (X.AnonymousClass118) r0
            java.io.File r0 = X.C108945cZ.A16(r0)
            java.io.File r1 = X.C17880vN.A0e(r0, r1)
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x0101
            X.C21721ArX.A05(r1)
            goto L_0x0101
        L_0x0125:
            java.lang.Object r0 = r13.A01
            X.Adx r0 = (X.C21067Adx) r0
            r0.A03()
            return
        L_0x012d:
            java.lang.Object r3 = r13.A01
            X.Adx r3 = (X.C21067Adx) r3
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x04be
            X.9O5 r0 = r3.A0C
            r0.A01()
            X.8CB r0 = r3.A0K
            r0.A03(r3)
            X.1cw r2 = r3.A0H
            android.content.Context r1 = r3.A09
            X.8C8 r0 = r3.A0D
            r2.A02(r0, r1)
            return
        L_0x0149:
            java.lang.Object r5 = r13.A01
            X.Adx r5 = (X.C21067Adx) r5
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0154
            r3 = 0
        L_0x0154:
            X.1HQ r0 = r5.A0B
            com.whatsapp.voipcalling.CallInfo r2 = r0.BO3()
            if (r3 == 0) goto L_0x0168
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x0168
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0168
            r5.A09(r2, r4)
        L_0x0168:
            r5.A0A(r2, r3)
            return
        L_0x016c:
            java.lang.Object r3 = r13.A01
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.Object r2 = X.C21067Adx.A0N
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 0
            r0 = 2
            int r1 = r3.requestAudioFocus(r2, r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "result of audio focus for voice call: "
            r2.append(r0)
            r2.append(r1)
            goto L_0x01ca
        L_0x0187:
            java.lang.Object r5 = r13.A01
            X.Adx r5 = (X.C21067Adx) r5
            int r1 = r5.A00
            r0 = 2
            r4 = 0
            boolean r3 = X.AnonymousClass000.A1S(r1, r0)
            X.1HQ r0 = r5.A0B
            com.whatsapp.voipcalling.CallInfo r2 = r0.BO3()
            if (r3 == 0) goto L_0x01a7
            int r1 = r5.A00
            r0 = 3
            if (r1 != r0) goto L_0x01a7
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x01a7
            r5.A09(r2, r4)
        L_0x01a7:
            r0 = r3 ^ 1
            r5.A0A(r2, r0)
            return
        L_0x01ad:
            java.lang.Object r3 = r13.A01
            X.Adx r3 = (X.C21067Adx) r3
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x01bb
            int r2 = r3.A00
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x01bc
        L_0x01bb:
            r1 = 1
        L_0x01bc:
            r3.A07 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/audio_route/rememberBluetoothState "
            r2.append(r0)
            r2.append(r1)
        L_0x01ca:
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01d2:
            java.lang.Object r1 = r13.A01
            X.AQ7 r1 = (X.AQ7) r1
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r1.A01
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x04be
            X.11E r0 = r1.A00
            boolean r0 = r0.A0A()
            com.whatsapp.voipcalling.Voip.updateNetworkRestrictions(r0)
            return
        L_0x01e8:
            java.lang.Object r1 = r13.A01
            X.AQ7 r1 = (X.AQ7) r1
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r1.A01
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x04be
            X.11E r0 = r1.A00
            r4 = 1
            int r0 = r0.A03(r4)
            if (r0 != 0) goto L_0x0202
            r4 = 3
        L_0x01fe:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0206
        L_0x0202:
            if (r0 != r4) goto L_0x01fe
            r4 = 2
            goto L_0x01fe
        L_0x0206:
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x025e }
            java.util.ArrayList r1 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x025e }
            r0 = 3
            if (r4 == r0) goto L_0x0267
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x025e }
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0218:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x0265
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x025c }
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch:{ Exception -> 0x025c }
            boolean r0 = r5.isUp()     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x0218
            boolean r0 = r5.isLoopback()     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0218
            boolean r0 = r5.isVirtual()     // Catch:{ Exception -> 0x025c }
            if (r0 != 0) goto L_0x0218
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = X.AnonymousClass8BS.A0n(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "wlan"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x025c }
            if (r0 == 0) goto L_0x0250
            r0 = 2
            if (r4 == r0) goto L_0x0253
            goto L_0x0218
        L_0x0250:
            r0 = 1
            if (r4 != r0) goto L_0x0218
        L_0x0253:
            int r0 = r5.getMTU()     // Catch:{ Exception -> 0x025c }
            int r2 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x0218
        L_0x025c:
            r0 = move-exception
            goto L_0x0262
        L_0x025e:
            r0 = move-exception
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0262:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0265:
            if (r2 != r3) goto L_0x0268
        L_0x0267:
            r2 = 0
        L_0x0268:
            com.whatsapp.voipcalling.Voip.updateNetworkMedium(r4, r2)
            return
        L_0x026c:
            java.lang.Object r0 = r13.A01
            X.A6b r0 = (X.C20075A6b) r0
            r0.A06()
            return
        L_0x0274:
            java.lang.Object r0 = r13.A01
            X.A6b r0 = (X.C20075A6b) r0
            r0.A05()
            return
        L_0x027c:
            java.lang.Object r0 = r13.A01
            com.whatsapp.calling.CallDetailsLayout r0 = (com.whatsapp.calling.CallDetailsLayout) r0
            android.widget.TextView r1 = r0.A03
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x0287:
            java.lang.Object r1 = r13.A01
            com.whatsapp.businessupsell.BusinessProfileEducation r1 = (com.whatsapp.businessupsell.BusinessProfileEducation) r1
            X.00H r0 = r1.A07
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r3 = r0.get()
            X.Cgm r3 = (X.C25491Cgm) r3
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r0 = "key_extra_business_jid"
            java.lang.String r2 = r1.getStringExtra(r0)
            if (r2 != 0) goto L_0x02a3
            java.lang.String r2 = ""
        L_0x02a3:
            r1 = 3
            java.lang.Integer r0 = X.C17880vN.A0i()
            X.C25491Cgm.A00(r3, r0, r2, r1, r1)
            return
        L_0x02ac:
            java.lang.String r0 = "metaVerifiedInteractionLogger"
            goto L_0x065c
        L_0x02b0:
            java.lang.Object r2 = r13.A01
            X.A8w r2 = (X.C20135A8w) r2
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.C20135A8w.A05(r2, r1)
            X.1Dg r0 = r2.A08
            java.lang.Object r0 = r0.A06()
            X.1jz r0 = (X.C34141jz) r0
            if (r0 == 0) goto L_0x04be
            java.lang.String r0 = r0.A02()
            if (r0 == 0) goto L_0x04be
            int r0 = r0.length()
            if (r0 != 0) goto L_0x04be
            X.1Dg r0 = r2.A07
            r0.A0E(r1)
            return
        L_0x02d7:
            java.lang.Object r1 = r13.A01
            X.9uP r1 = (X.C196069uP) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A01()
            return
        L_0x02e3:
            java.lang.Object r2 = r13.A01
            X.9uP r2 = (X.C196069uP) r2
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r2.A00()
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x04be
            X.1wy r0 = r2.A04
            X.AnonymousClass3MX.A1K(r0, r1)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r2 = r2.A06
            r0 = 20000(0x4e20, double:9.8813E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0303:
            java.lang.Object r0 = r13.A01
            X.A2R r0 = (X.A2R) r0
            X.A2R.A00(r0)
            return
        L_0x030b:
            java.lang.Object r0 = r13.A01
            X.9gZ r0 = (X.C187909gZ) r0
            X.8yR r1 = r0.A02
            r0 = 18
            X.C20735AWq.A00(r1, r0)
            return
        L_0x0317:
            java.lang.Object r3 = r13.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            java.util.ArrayList r2 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A06(r3)
            r1 = 1
            X.8wa r0 = new X.8wa
            r0.<init>(r1)
            r2.add(r0)
            X.1Dg r0 = r3.A0F
            r0.A0E(r2)
            return
        L_0x032e:
            java.lang.Object r3 = r13.A01
            X.A2L r3 = (X.A2L) r3
            X.9oJ r2 = r3.A03
            r2.A01()
            X.1DT r1 = r3.A00
            java.util.List r0 = r2.A00()
            r1.A0E(r0)
            java.util.List r1 = r2.A00()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04be
            X.00H r0 = r3.A07
            java.lang.Object r2 = r0.get()
            X.AM7 r2 = (X.AM7) r2
            X.A5L r0 = r3.A04
            java.lang.Integer r3 = r0.A04()
            java.lang.Integer r4 = X.C17880vN.A0h()
            java.lang.Integer r1 = X.AnonymousClass8BT.A0l(r1)
            java.util.LinkedHashMap r5 = X.C17880vN.A13()
            if (r1 == 0) goto L_0x036b
            java.lang.String r0 = "recent_search_count"
            r5.put(r0, r1)
        L_0x036b:
            r6 = 1
            r7 = 8
            r8 = 2
            r2.A08(r3, r4, r5, r6, r7, r8)
            return
        L_0x0373:
            java.lang.Object r2 = r13.A01
            X.8FJ r2 = (X.AnonymousClass8FJ) r2
            r0 = 3
            r2.A00 = r0
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A09
            r1.removeCallbacks(r0)
            X.8we r0 = X.AnonymousClass8FJ.A00(r2)
            r2.A0E(r0)
            return
        L_0x0389:
            java.lang.Object r4 = r13.A01
            X.8FJ r4 = (X.AnonymousClass8FJ) r4
            X.A5L r3 = r4.A04
            X.A4k r1 = r4.A05
            X.1XN r0 = r3.A05
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x03a6
            X.A6f r2 = r3.A03()
        L_0x039d:
            if (r2 == 0) goto L_0x03cb
        L_0x039f:
            X.AnonymousClass8FJ.A01(r2, r4)
            X.AnonymousClass8FJ.A02(r4)
            return
        L_0x03a6:
            X.A6f r2 = r3.A02()
            if (r2 != 0) goto L_0x03b0
            X.A6f r2 = r1.A02()
        L_0x03b0:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A06
            boolean r0 = r1.get()
            if (r0 != 0) goto L_0x039d
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x03c7
            java.lang.String r0 = r2.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03c7
            goto L_0x039f
        L_0x03c7:
            r0 = 1
            r1.set(r0)
        L_0x03cb:
            r4.A0H()
            return
        L_0x03cf:
            java.lang.Object r1 = r13.A01
            X.8kf r1 = (X.C169258kf) r1
            X.8FG r0 = r1.A4b()
            X.1wy r0 = r0.A0W
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x04be
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x04be
            X.C169258kf.A0Q(r1)
            return
        L_0x03e9:
            java.lang.Object r0 = r13.A01
            X.Ams r0 = (X.C21603Ams) r0
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r3 = r0.A00
            X.99t r0 = r3.A02
            if (r0 == 0) goto L_0x04be
            X.00H r0 = r3.A0C
            java.lang.Object r4 = r0.get()
            X.9yN r4 = (X.C198459yN) r4
            boolean r2 = r4.A02
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "pt"
            boolean r0 = r0.equals(r1)
            if (r2 == r0) goto L_0x0421
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r1)
            r4.A02 = r0
            java.util.List r0 = X.C198459yN.A00(r4)
            r4.A01 = r0
        L_0x0421:
            java.util.List r1 = r4.A01
            int r0 = r4.A00
            java.lang.String r2 = X.C17880vN.A0w(r1, r0)
            int r0 = r4.A00
            int r1 = r0 + 1
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            int r1 = r1 % r0
            r4.A00 = r1
            java.lang.String r0 = X.C1776299t.A0H
            X.C1776299t.A0F = r0
            java.lang.String r0 = X.C1776299t.A0G
            X.C1776299t.A0H = r0
            X.C1776299t.A0G = r2
            X.99t r1 = r3.A02
            androidx.appcompat.widget.SearchView r0 = r1.A06
            if (r0 == 0) goto L_0x04be
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.A0b
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04be
            android.animation.ObjectAnimator r0 = r1.A02
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A03
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A01
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A00
            r0.start()
            return
        L_0x0467:
            java.lang.Object r1 = r13.A01
            X.9tN r1 = (X.C195459tN) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x04be
            X.B7f r0 = r1.A02
            r0.C2S()
            return
        L_0x0475:
            java.lang.Object r1 = r13.A01
            X.9g7 r1 = (X.C187629g7) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.ref.WeakReference r0 = r1.A00
            if (r0 == 0) goto L_0x04be
            java.lang.Object r1 = r0.get()
            X.B56 r1 = (X.B56) r1
            if (r1 == 0) goto L_0x04be
            X.AP7 r1 = (X.AP7) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x04a3
            java.lang.Object r1 = r1.A02
            X.A4k r1 = (X.C20041A4k) r1
            X.A2b r0 = r1.A07
            r0.A00()
            X.190 r3 = r1.A01
            java.lang.String r2 = "Approx location could not be generated"
            r1 = 0
            java.lang.String r0 = "directory_geocoder_timed_out"
            r3.A0G(r0, r2, r1)
            return
        L_0x04a3:
            java.lang.Object r4 = r1.A02
            X.AGd r4 = (X.C20321AGd) r4
            r3 = 0
            java.lang.Object r2 = r1.A01
            X.1KB r1 = r4.A05
            r0 = 45
            X.C21459AkQ.A00(r1, r4, r2, r3, r0)
            java.lang.String r0 = "Geocoding address timed out"
            X.C20321AGd.A02(r4, r0)
            return
        L_0x04b7:
            java.lang.Object r0 = r13.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r0 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r0
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A00(r0)
        L_0x04be:
            return
        L_0x04bf:
            java.lang.Object r3 = r13.A01
            X.AGd r3 = (X.C20321AGd) r3
            java.lang.String r0 = "System location services LocationManager timed out"
            X.C20321AGd.A02(r3, r0)
            X.BYv r4 = r3.A01
            if (r4 == 0) goto L_0x04ee
            X.CWc r1 = X.C25558Chw.A00()
            X.DIO r0 = new X.DIO
            r0.<init>(r4)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.BZS r0 = r1.A00()
            r2 = 0
            com.google.android.gms.tasks.zzw r1 = X.C26126Cso.A02(r4, r0, r2)
            if (r1 == 0) goto L_0x04ee
            X.AyG r0 = new X.AyG
            r0.<init>(r3)
            X.AJM.A00(r1, r0, r2)
        L_0x04ee:
            X.BYv r2 = r3.A01
            if (r2 == 0) goto L_0x050f
            X.CWc r1 = X.C25558Chw.A00()
            X.DIO r0 = new X.DIO
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2414(0x96e, float:3.383E-42)
            r1.A00 = r0
            X.BZS r0 = r1.A00()
            r1 = 0
            com.google.android.gms.tasks.zzw r0 = X.C26126Cso.A02(r2, r0, r1)
            if (r0 == 0) goto L_0x050f
            X.AJI.A00(r0, r3, r1)
        L_0x050f:
            X.17x r2 = r3.A09
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x052f
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x0527
            X.11C r0 = r3.A07
            android.location.LocationManager r1 = r0.A0C()
            r3.A00 = r1
            if (r1 == 0) goto L_0x052f
        L_0x0527:
            java.lang.String r0 = "gps"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 != 0) goto L_0x054d
        L_0x052f:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x0551
            android.location.LocationManager r1 = r3.A00
            if (r1 != 0) goto L_0x0545
            X.11C r0 = r3.A07
            android.location.LocationManager r1 = r0.A0C()
            r3.A00 = r1
            if (r1 == 0) goto L_0x0551
        L_0x0545:
            java.lang.String r0 = "network"
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 == 0) goto L_0x0551
        L_0x054d:
            X.C20321AGd.A00(r0, r3)
            return
        L_0x0551:
            java.lang.String r0 = "Unable to fetch last known location from location services"
            X.C20321AGd.A02(r3, r0)
            return
        L_0x0557:
            java.lang.Object r1 = r13.A01
            X.AGd r1 = (X.C20321AGd) r1
            X.C20321AGd.A01(r1)
            java.lang.String r0 = "FusedLocationProvider timed out"
            X.C20321AGd.A02(r1, r0)
            return
        L_0x0564:
            java.lang.Object r0 = r13.A01
            X.8kE r0 = (X.C169018kE) r0
            X.8F1 r3 = r0.A4b()
            com.whatsapp.jid.UserJid r4 = r0.A4c()
            java.lang.String r5 = r0.A4d()
            int r1 = r0.A00
            r0 = -1
            boolean r7 = X.AnonymousClass000.A1S(r1, r0)
            X.1OX r1 = X.C41561wd.A00(r3)
            X.0wl r0 = r3.A07
            r6 = 0
            com.whatsapp.businesscollection.viewmodel.CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1 r2 = new com.whatsapp.businesscollection.viewmodel.CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass3MW.A1X(r0, r2, r1)
            return
        L_0x058b:
            java.lang.Object r0 = r13.A01
            com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = (com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 0
            r1.A0f(r0)
            return
        L_0x0596:
            java.lang.Object r1 = r13.A01
            com.whatsapp.businessapisearch.view.fragment.BusinessAPINUXBottomSheet r1 = (com.whatsapp.businessapisearch.view.fragment.BusinessAPINUXBottomSheet) r1
            X.1LU r0 = r1.A04
            if (r0 == 0) goto L_0x064b
            java.lang.String r0 = "https://faq.whatsapp.com/530309022405692/"
            android.content.Intent r0 = X.C72473Md.A0D(r0)
            r1.A1k(r0)
            return
        L_0x05a8:
            java.lang.Object r1 = r13.A01
            X.DOp r1 = (X.C26993DOp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A04
            r0.getValue()
            X.0vl r0 = r1.A0M
            r0.getValue()
            X.0vl r0 = r1.A07
            r0.getValue()
            X.0vl r0 = r1.A0D
            r0.getValue()
            X.0vl r0 = r1.A0N
            r0.getValue()
            X.0vl r0 = r1.A0P
            r0.getValue()
            X.0vl r0 = r1.A03
            r0.getValue()
            X.0vl r0 = r1.A02
            r0.getValue()
            X.0vl r0 = r1.A08
            r0.getValue()
            X.0vl r0 = r1.A0G
            r0.getValue()
            X.0vl r0 = r1.A01
            goto L_0x05fe
        L_0x05e5:
            java.lang.Object r1 = r13.A01
            X.DOp r1 = (X.C26993DOp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A05
            r0.getValue()
            X.0vl r0 = r1.A06
            r0.getValue()
            X.0vl r0 = r1.A0D
            r0.getValue()
            X.0vl r0 = r1.A0E
        L_0x05fe:
            r0.getValue()
            return
        L_0x0602:
            java.lang.Object r0 = r13.A01
            X.BAU r0 = (X.BAU) r0
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r0 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r0
            r0.CEx()
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity.A11(r0)
            return
        L_0x060f:
            java.lang.Object r1 = r13.A01
            X.BAU r1 = (X.BAU) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r1 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r1
            r1.CEx()
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity.A11(r1)
            return
        L_0x0620:
            java.lang.Object r4 = r13.A01
            X.BAU r4 = (X.BAU) r4
            com.whatsapp.bridge.wfs.ui.LinkedUsersActivity r4 = (com.whatsapp.bridge.wfs.ui.LinkedUsersActivity) r4
            X.1LU r0 = r4.A01
            if (r0 == 0) goto L_0x064b
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.phonenumberentry.RegisterPhone"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.resetstate"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.clear_phone_number"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "com.whatsapp.registration.RegisterPhone.show_wfs_error_snack_bar"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x064b:
            java.lang.String r0 = "waIntents"
            goto L_0x065c
        L_0x064e:
            java.lang.Object r1 = r13.A01
            com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity r1 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.widget.ImageView r1 = r1.A00
            if (r1 != 0) goto L_0x0661
            java.lang.String r0 = "myLocationBtn"
        L_0x065c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0661:
            r0 = 2131232131(0x7f080583, float:1.8080363E38)
            r1.setImageResource(r0)
            return
        L_0x0668:
            java.lang.Object r0 = r13.A01
            X.9nK r0 = (X.C191869nK) r0
            X.1KB r2 = r0.A04
            r1 = 0
            r0 = 2131898558(0x7f1230be, float:1.9432037E38)
            r2.A08(r0, r1)
            return
        L_0x0676:
            java.lang.Object r2 = r13.A01
            X.3Uy r2 = (X.C73343Uy) r2
            X.1vp r1 = r2.A09
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0692
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0692
            java.lang.String r0 = r2.A01
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0692
            java.util.List r0 = r2.A02
        L_0x068e:
            r1.A0F(r0)
            return
        L_0x0692:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x068e
        L_0x0695:
            java.lang.Object r1 = r13.A01
            X.0vk r1 = (X.C18090vk) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke()
            return
        L_0x06a1:
            java.lang.Object r2 = r13.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r2 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r2
            X.1wy r1 = r2.A06     // Catch:{ Exception -> 0x06ca }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ Exception -> 0x06ca }
            r1.A0E(r0)     // Catch:{ Exception -> 0x06ca }
            android.media.MediaPlayer r0 = r2.A00     // Catch:{ Exception -> 0x06ca }
            if (r0 == 0) goto L_0x06b3
            r0.release()     // Catch:{ Exception -> 0x06ca }
        L_0x06b3:
            r0 = 0
            r2.A00 = r0     // Catch:{ Exception -> 0x06ca }
            return
        L_0x06b7:
            java.lang.Object r2 = r13.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel r2 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel) r2
            android.media.MediaPlayer r0 = r2.A00     // Catch:{ Exception -> 0x06ca }
            if (r0 == 0) goto L_0x06c2
            r0.start()     // Catch:{ Exception -> 0x06ca }
        L_0x06c2:
            X.1wy r1 = r2.A07     // Catch:{ Exception -> 0x06ca }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ Exception -> 0x06ca }
            r1.A0E(r0)     // Catch:{ Exception -> 0x06ca }
            return
        L_0x06ca:
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21446AkD.run():void");
    }
}
