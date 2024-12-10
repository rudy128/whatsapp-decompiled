package X;

import com.whatsapp.util.LRUCache;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class A2R {
    public String A00;
    public final AnonymousClass9WA A01;
    public final C26911Ty A02;
    public final AnonymousClass9AX A03;
    public final APP A04;
    public final C31191fA A05;
    public final AnonymousClass1PM A06;
    public final C24921Me A07;
    public final C25161Nd A08;
    public final C25181Nf A09;
    public final C1602687u A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C51692Zg A0E;
    public final AnonymousClass11P A0F;
    public final C18030ve A0G;
    public final AnonymousClass10I A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;

    public final AnonymousClass9M6 A01(C42621yT r21, String str, String str2) {
        LRUCache lRUCache;
        String str3;
        String str4;
        C20664ATw aTw = new C20664ATw(this);
        AnonymousClass9AX r0 = this.A03;
        synchronized (r0) {
            lRUCache = r0.A01;
            str3 = str;
            AnonymousClass1D6 r4 = (AnonymousClass1D6) lRUCache.get(str3);
            str4 = str2;
            if (r4 != null && C18070vi.A18(r4.first, str4)) {
                AnonymousClass8lD r3 = (AnonymousClass8lD) r4.second;
                if (r3 != null) {
                    return new AnonymousClass8lD(r3.A00, false, r3.A01);
                }
            }
        }
        C196069uP r42 = this.A04.A02;
        if (r42.A00 == null) {
            r42.A00();
        }
        C20079A6f a6f = r42.A00;
        C18070vi.A0X(a6f);
        C51692Zg r6 = this.A0E;
        String str5 = this.A00;
        AnonymousClass00H r43 = this.A0J;
        C195549tW r7 = new C195549tW(a6f, str3, str5, str4, AnonymousClass8BR.A0L(r43).A03, AnonymousClass8BR.A0L(r43).A02, AnonymousClass8BR.A0L(r43).A02(), C18020vd.A05(C18040vf.A02, this.A0G, 6973));
        AnonymousClass10E r32 = r6.A00.A00.A00;
        C18030ve A8r = AnonymousClass10E.A8r(r32);
        AnonymousClass181 A0H2 = C108965cb.A0H(r32);
        AnonymousClass11W A0e = AnonymousClass8BU.A0e(r32);
        C195549tW r14 = r7;
        new AnonymousClass8lE(A0H2, r14, AnonymousClass3Ma.A0c(r32), A8r, C108955ca.A0X(r32), A0e, C108945cZ.A14(r32)).CBv(aTw);
        r21.A02();
        AnonymousClass9M6 r44 = aTw.A00;
        if (r44 instanceof AnonymousClass8lD) {
            AnonymousClass8lD r45 = (AnonymousClass8lD) r44;
            C18070vi.A0d(r45, 2);
            synchronized (r0) {
                lRUCache.put(str3, AnonymousClass1D6.A01(str4, r45));
                for (C195819tx r46 : C29431cG.A0r(r45.A00)) {
                    r0.A00.put(r46.A0A, r46);
                }
            }
        }
        return aTw.A00;
    }

    public A2R(AnonymousClass9WA r21, C26911Ty r22, AnonymousClass9AX r23, APP app, C51692Zg r25, C31191fA r26, AnonymousClass1PM r27, C24921Me r28, C25161Nd r29, AnonymousClass11P r30, C25181Nf r31, C18030ve r32, C183279Xq r33, C1602687u r34, AnonymousClass10I r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40) {
        AnonymousClass10I r7 = r35;
        C24921Me r14 = r28;
        AnonymousClass11P r12 = r30;
        C18030ve r10 = r32;
        C31191fA r16 = r26;
        C18070vi.A0w(r12, r10, r7, r14, r16);
        AnonymousClass00H r6 = r36;
        AnonymousClass00H r5 = r37;
        C25161Nd r13 = r29;
        C183279Xq r9 = r33;
        AnonymousClass1PM r15 = r27;
        C18070vi.A0x(r9, r15, r13, r6, r5);
        C1602687u r8 = r34;
        AnonymousClass00H r4 = r38;
        C25181Nf r11 = r31;
        C26911Ty r18 = r22;
        AnonymousClass9AX r17 = r23;
        C18070vi.A0y(r18, r17, r8, r11, r4);
        AnonymousClass00H r3 = r39;
        AnonymousClass00H r2 = r40;
        AnonymousClass8BU.A1I(r3, 16, r2);
        AnonymousClass9WA r19 = r21;
        C18070vi.A0d(r19, 20);
        this.A0F = r12;
        this.A0G = r10;
        this.A0H = r7;
        this.A07 = r14;
        this.A05 = r16;
        this.A06 = r15;
        this.A08 = r13;
        this.A0B = r6;
        this.A0C = r5;
        this.A02 = r18;
        this.A03 = r17;
        this.A0A = r8;
        this.A09 = r11;
        this.A0D = r4;
        this.A0I = r3;
        this.A0E = r25;
        this.A0J = r2;
        this.A04 = app;
        this.A01 = r19;
        this.A00 = C197659x3.A00(r9.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.A2R r13) {
        /*
            X.ATw r1 = new X.ATw
            r1.<init>(r13)
            X.9WA r0 = r13.A01
            java.lang.String r9 = r13.A00
            X.10H r0 = r0.A00
            X.10E r0 = r0.A00
            X.0ve r5 = X.AnonymousClass10E.A8r(r0)
            X.181 r3 = X.C108965cb.A0H(r0)
            X.11W r7 = X.AnonymousClass8BU.A0e(r0)
            X.0z4 r4 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r8 = X.C108945cZ.A14(r0)
            X.1fq r6 = X.C108955ca.A0X(r0)
            X.8lF r2 = new X.8lF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2.CBv(r1)
            X.9M6 r1 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass8lD
            if (r0 == 0) goto L_0x0114
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.8lD r1 = (X.AnonymousClass8lD) r1
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x003f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r3.next()
            X.9tx r0 = (X.C195819tx) r0
            java.lang.String r2 = r0.A07
            java.lang.String r1 = r0.A0A
            X.9qS r0 = new X.9qS
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x003f
        L_0x0058:
            X.00H r0 = r13.A0I
            java.lang.Object r5 = r0.get()
            X.9mL r5 = (X.C191289mL) r5
            java.lang.String r6 = "BusinessSearchPopularBusinessesManager/initPopularBusinesses/Failed!"
            r4 = 0
            long r1 = java.lang.System.currentTimeMillis()
            X.9qT r0 = new X.9qT
            r0.<init>(r7, r1)
            r5.A00 = r0
            r3 = 0
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03     // Catch:{ Exception -> 0x00f6 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ Exception -> 0x00f6 }
            r0.lock()     // Catch:{ Exception -> 0x00f6 }
            X.118 r0 = r5.A02     // Catch:{ Exception -> 0x00f6 }
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = "business_search"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)     // Catch:{ Exception -> 0x00f6 }
            X.AnonymousClass8BV.A1H(r1)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = "business_search_popular_businesses"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ Exception -> 0x00f6 }
            java.io.FileOutputStream r7 = X.C108945cZ.A19(r0)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x00ef }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ef }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x00ef }
            X.9qT r11 = r5.A00     // Catch:{ all -> 0x00e8 }
            if (r11 == 0) goto L_0x00e1
            org.json.JSONObject r9 = X.C17880vN.A15()     // Catch:{ all -> 0x00e8 }
            org.json.JSONArray r12 = X.AnonymousClass8BR.A1A()     // Catch:{ all -> 0x00e8 }
            java.util.List r0 = r11.A01     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x00e8 }
        L_0x00aa:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x00e8 }
            X.9qS r10 = (X.C193659qS) r10     // Catch:{ all -> 0x00e8 }
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r10.A00     // Catch:{ all -> 0x00e8 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "verified_name"
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x00e8 }
            r2.put(r1, r0)     // Catch:{ all -> 0x00e8 }
            r12.put(r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x00aa
        L_0x00cc:
            java.lang.String r0 = "popular_businesses"
            r9.put(r0, r12)     // Catch:{ all -> 0x00e8 }
            java.lang.String r2 = "last_updated"
            long r0 = r11.A00     // Catch:{ all -> 0x00e8 }
            r9.put(r2, r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e1
            r8.write(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00e1:
            r8.close()     // Catch:{ all -> 0x00ef }
            r7.close()     // Catch:{ Exception -> 0x00f6 }
            goto L_0x010b
        L_0x00e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ Exception -> 0x00f6 }
            throw r0     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)     // Catch:{ all -> 0x0100 }
            X.190 r0 = r5.A01     // Catch:{ all -> 0x0100 }
            r0.A0G(r6, r3, r4)     // Catch:{ all -> 0x0100 }
            goto L_0x010b
        L_0x0100:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r1
        L_0x010b:
            java.util.concurrent.locks.ReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2R.A00(X.A2R):void");
    }

    public final C193669qT A02() {
        AnonymousClass00H r1 = this.A0I;
        C193669qT A002 = ((C191289mL) r1.get()).A00();
        if (A002 != null) {
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - A002.A00) >= 1) {
                C21446AkD.A01(this.A0H, this, 26);
            }
            return A002;
        }
        A00(this);
        return ((C191289mL) r1.get()).A00();
    }

    public final void A03() {
        APP app = this.A04;
        C196069uP r0 = app.A02;
        r0.A01.removeCallbacks(r0.A06);
        app.A01.A00();
        this.A03.A0A();
        ((C191289mL) this.A0I.get()).A00 = null;
        List list = ((A4G) this.A0D.get()).A00;
        C18070vi.A0W(list);
        synchronized (list) {
            list.clear();
        }
    }
}
