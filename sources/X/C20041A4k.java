package X;

import com.whatsapp.Me;

/* renamed from: X.A4k  reason: case insensitive filesystem */
public final class C20041A4k {
    public C20079A6f A00;
    public final AnonymousClass190 A01;
    public final C173738ve A02;
    public final A5L A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass1XN A06;
    public final C19989A2b A07;
    public final AnonymousClass1K3 A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C189319it A0B;
    public final AnonymousClass11S A0C;
    public final AnonymousClass00H A0D;

    public static final C20079A6f A00(C20041A4k a4k) {
        C19989A2b a2b = a4k.A07;
        a2b.A03("country_default_start");
        String A012 = A01(a4k);
        String A032 = a4k.A08.A03(a4k.A05, A012);
        if (A032 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Localized name for country code ");
            A10.append(A012);
            C17890vO.A19(A10, " is null!");
        }
        C20079A6f a6f = new C20079A6f((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, A032, A012, "country_default");
        a2b.A03("country_default_end");
        return a6f;
    }

    public static final String A01(C20041A4k a4k) {
        AnonymousClass11S r0 = a4k.A0C;
        r0.A0I();
        Me me = r0.A00;
        if (me == null) {
            a4k.A01.A0G("directory_country_code_resolve_error", "Me object from MeManager is null", false);
        } else {
            String A012 = AnonymousClass1K3.A01(me.cc, me.number);
            C18070vi.A0X(A012);
            if (!A012.equals("ZZ")) {
                return A012;
            }
        }
        return "XX";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a5, code lost:
        X.CDX.A00(r13, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C20079A6f A02() {
        /*
            r19 = this;
            r7 = r19
            X.A2b r6 = r7.A07
            r6.A02()
            X.1XN r0 = r7.A06
            X.0ve r1 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r1)
            if (r0 == 0) goto L_0x022f
            r0 = 3788(0xecc, float:5.308E-42)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = "approx_default_location_start"
            r6.A03(r0)
            X.A5L r10 = r7.A03
            X.8ve r4 = r10.A02     // Catch:{ Exception -> 0x0072 }
            X.9kR r5 = r4.A03     // Catch:{ Exception -> 0x0072 }
            android.content.SharedPreferences r3 = r5.A00()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "default_location_last_updated"
            r0 = -1
            long r8 = r3.getLong(r2, r0)     // Catch:{ Exception -> 0x0072 }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0078
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0072 }
            if (r0 == 0) goto L_0x0078
            long r8 = X.AnonymousClass8BR.A04(r8)     // Catch:{ Exception -> 0x0072 }
            X.0ve r1 = r10.A04     // Catch:{ Exception -> 0x0072 }
            r0 = 3857(0xf11, float:5.405E-42)
            long r2 = X.AnonymousClass8BR.A05(r1, r0)     // Catch:{ Exception -> 0x0072 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            android.content.SharedPreferences r2 = r5.A00()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r1 = "default_search_location"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)     // Catch:{ Exception -> 0x0072 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0072 }
            if (r0 != 0) goto L_0x0078
            X.1Cs r1 = r4.A02     // Catch:{ Exception -> 0x0072 }
            X.190 r0 = r4.A00     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = X.C20015A3h.A00(r0, r1, r2)     // Catch:{ Exception -> 0x0072 }
            X.A6f r1 = X.C20079A6f.A01(r0)     // Catch:{ Exception -> 0x0072 }
            if (r1 == 0) goto L_0x0078
            goto L_0x0234
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationRepository/readDefaultSearchLocation: Failed to fetch the default search location"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0078:
            java.lang.String r0 = "approx_default_generation_start"
            r6.A03(r0)
            X.00H r0 = r7.A09
            java.lang.Object r5 = r0.get()
            X.9eM r5 = (X.C186539eM) r5
            r4 = 0
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ Exception -> 0x01eb }
            X.1Ty r1 = r5.A02     // Catch:{ Exception -> 0x01eb }
            X.11S r0 = r5.A01     // Catch:{ Exception -> 0x01eb }
            r0.A0I()     // Catch:{ Exception -> 0x01eb }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r15 = r0.cc     // Catch:{ Exception -> 0x01eb }
        L_0x0097:
            X.0vl r0 = r1.A04     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r14 = r0.getValue()     // Catch:{ Exception -> 0x01eb }
            X.9CB r14 = (X.AnonymousClass9CB) r14     // Catch:{ Exception -> 0x01eb }
            java.util.ArrayList r18 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x01eb }
            goto L_0x00a6
        L_0x00a4:
            r15 = 0
            goto L_0x0097
        L_0x00a6:
            if (r15 == 0) goto L_0x0116
            X.1Lt r0 = r14.A00     // Catch:{ Exception -> 0x01eb }
            X.1at r13 = r0.get()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r2 = "SELECT jid, latitude, longitude FROM wa_biz_profiles WHERE jid IS NOT NULL AND latitude IS NOT NULL AND longitude IS NOT NULL"
            java.lang.String r1 = "GET_ALL_BUSINESSES_WITH_LAT_LONG"
            r0 = 0
            android.database.Cursor r12 = X.C24861Ly.A03(r13, r2, r1, r0)     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = "jid"
            int r17 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "latitude"
            int r16 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "longitude"
            int r9 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010a }
        L_0x00c9:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0106
            X.1Lx r2 = r14.A00     // Catch:{ all -> 0x010a }
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x010a }
            r0 = r17
            java.lang.String r0 = r12.getString(r0)     // Catch:{ all -> 0x010a }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ all -> 0x010a }
            com.whatsapp.jid.UserJid r0 = r2.A00(r0)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x010a }
            java.lang.String r0 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x00c9
            r0 = r16
            double r2 = r12.getDouble(r0)     // Catch:{ all -> 0x010a }
            double r0 = r12.getDouble(r9)     // Catch:{ all -> 0x010a }
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng     // Catch:{ all -> 0x010a }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x010a }
            r0 = r18
            r0.add(r8)     // Catch:{ all -> 0x010a }
            goto L_0x00c9
        L_0x0106:
            r12.close()     // Catch:{ all -> 0x0111 }
            goto L_0x0113
        L_0x010a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ all -> 0x0111 }
            throw r0     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a4 }
        L_0x0113:
            r13.close()     // Catch:{ Exception -> 0x01eb }
        L_0x0116:
            java.util.Iterator r13 = r18.iterator()     // Catch:{ Exception -> 0x01eb }
            r9 = 0
            r8 = 0
        L_0x011c:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r13.next()     // Catch:{ Exception -> 0x01eb }
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0     // Catch:{ Exception -> 0x01eb }
            double r2 = r0.A00     // Catch:{ Exception -> 0x01eb }
            double r0 = r0.A01     // Catch:{ Exception -> 0x01eb }
            r12 = 10
            java.util.ArrayList r2 = X.C20086A6o.A03(r2, r0, r12)     // Catch:{ Exception -> 0x01eb }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r1 = r2.get(r4)     // Catch:{ Exception -> 0x01eb }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01eb }
            r0 = 1
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x01eb }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x01eb }
            java.lang.String r3 = X.C20086A6o.A02(r1, r0, r12)     // Catch:{ Exception -> 0x01eb }
            X.C18070vi.A0X(r3)     // Catch:{ Exception -> 0x01eb }
            boolean r0 = r10.containsKey(r3)     // Catch:{ Exception -> 0x01eb }
            if (r0 != 0) goto L_0x0152
            X.C17890vO.A0z(r3, r10, r4)     // Catch:{ Exception -> 0x01eb }
        L_0x0152:
            java.lang.Object r0 = r10.get(r3)     // Catch:{ Exception -> 0x01eb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x0163
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01eb }
            int r0 = r0 + 1
            X.C17890vO.A0z(r3, r10, r0)     // Catch:{ Exception -> 0x01eb }
        L_0x0163:
            java.lang.Object r0 = r10.get(r3)     // Catch:{ Exception -> 0x01eb }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x011c
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x01eb }
            if (r8 >= r2) goto L_0x011c
            X.0ve r1 = r5.A03     // Catch:{ Exception -> 0x01eb }
            r0 = 3830(0xef6, float:5.367E-42)
            int r0 = X.C18020vd.A00(r11, r1, r0)     // Catch:{ Exception -> 0x01eb }
            if (r2 < r0) goto L_0x011c
            r8 = r2
            r9 = r3
            goto L_0x011c
        L_0x017e:
            if (r9 == 0) goto L_0x01f3
            int r10 = r9.length()     // Catch:{ Exception -> 0x01eb }
            r3 = 0
            r2 = r10
            r8 = 0
            goto L_0x018b
        L_0x0188:
            int r3 = r3 + r0
        L_0x0189:
            int r2 = r2 + -1
        L_0x018b:
            r0 = 1
            if (r2 < r0) goto L_0x01a9
            int r1 = r2 + -1
            int r0 = r0 << r1
            int r1 = r10 - r2
            char r1 = r9.charAt(r1)     // Catch:{ Exception -> 0x01eb }
            switch(r1) {
                case 48: goto L_0x0189;
                case 49: goto L_0x0188;
                case 50: goto L_0x01a2;
                case 51: goto L_0x01a1;
                default: goto L_0x019a;
            }     // Catch:{ Exception -> 0x01eb }
        L_0x019a:
            java.lang.String r0 = "Invalid Quadkey"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01a8
        L_0x01a1:
            int r3 = r3 + r0
        L_0x01a2:
            int r8 = r8 + r0
            goto L_0x0189
        L_0x01a4:
            r0 = move-exception
            X.CDX.A00(r13, r1)     // Catch:{ Exception -> 0x01eb }
        L_0x01a8:
            throw r0     // Catch:{ Exception -> 0x01eb }
        L_0x01a9:
            long r2 = (long) r3     // Catch:{ Exception -> 0x01eb }
            long r0 = (long) r8     // Catch:{ Exception -> 0x01eb }
            java.util.ArrayList r3 = X.C20086A6o.A04(r10, r2, r0)     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r0 = r3.get(r4)     // Catch:{ Exception -> 0x01eb }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x01eb }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x01eb }
            double r0 = X.AnonymousClass8BR.A00(r0)     // Catch:{ Exception -> 0x01eb }
            r2 = 1
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Exception -> 0x01eb }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x01eb }
            X.C18070vi.A0X(r2)     // Catch:{ Exception -> 0x01eb }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x01eb }
            com.google.android.gms.maps.model.LatLng r9 = X.AnonymousClass8BV.A09(r2, r0)     // Catch:{ Exception -> 0x01eb }
            double r2 = r9.A00     // Catch:{ Exception -> 0x01eb }
            double r0 = r9.A01     // Catch:{ Exception -> 0x01eb }
            r8 = 10
            java.util.ArrayList r0 = X.C20086A6o.A03(r2, r0, r8)     // Catch:{ Exception -> 0x01eb }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x01eb }
            double r0 = X.C20086A6o.A01(r0, r8)     // Catch:{ Exception -> 0x01eb }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x01eb }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x01eb }
            X.1D6 r1 = X.AnonymousClass1D6.A01(r9, r0)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01f4
        L_0x01eb:
            r2 = move-exception
            X.190 r1 = r5.A00
            java.lang.String r0 = "DirectoryApproxDefaultLocationManager/getApproxDefaultLocation : exception while generating approx location"
            X.AnonymousClass8BS.A17(r1, r0, r2, r4)
        L_0x01f3:
            r1 = 0
        L_0x01f4:
            java.lang.String r0 = "approx_default_generation_end"
            r6.A03(r0)
            if (r1 == 0) goto L_0x022a
            X.00H r0 = r7.A0A
            java.lang.Object r10 = r0.get()
            X.9g7 r10 = (X.C187629g7) r10
            java.lang.Object r0 = r1.first
            com.google.android.gms.maps.model.LatLng r0 = (com.google.android.gms.maps.model.LatLng) r0
            double r11 = r0.A00
            double r13 = r0.A01
            r0 = 1
            X.AP7 r9 = new X.AP7
            r9.<init>(r1, r7, r0)
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r9)
            r10.A00 = r0
            android.os.Handler r3 = r10.A01
            java.lang.Runnable r2 = r10.A05
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
            X.10I r0 = r10.A04
            X.Aiq r8 = new X.Aiq
            r8.<init>(r9, r10, r11, r13)
            r0.CGF(r8)
        L_0x022a:
            X.A6f r1 = A00(r7)
            return r1
        L_0x022f:
            X.A6f r1 = A00(r7)
            goto L_0x023b
        L_0x0234:
            r7.A00 = r1
            java.lang.String r0 = "approx_default_location_end"
            r6.A03(r0)
        L_0x023b:
            r6.A01()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20041A4k.A02():X.A6f");
    }

    public C20041A4k(AnonymousClass190 r2, C189319it r3, AnonymousClass11S r4, C173738ve r5, A5L a5l, AnonymousClass118 r7, C18000vb r8, AnonymousClass1XN r9, AnonymousClass1K3 r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r4, r2, r7, r8, r10);
        C18070vi.A0x(r11, r9, a5l, r3, r5);
        C72473Md.A1L(r12, r13);
        this.A0C = r4;
        this.A01 = r2;
        this.A04 = r7;
        this.A05 = r8;
        this.A08 = r10;
        this.A0A = r11;
        this.A06 = r9;
        this.A03 = a5l;
        this.A0B = r3;
        this.A02 = r5;
        this.A0D = r12;
        this.A09 = r13;
        this.A07 = r3.A00(871827416);
    }
}
