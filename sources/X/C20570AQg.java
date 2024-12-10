package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.AQg  reason: case insensitive filesystem */
public final class C20570AQg implements AnonymousClass1L0 {
    public final long A00;
    public final long A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0191, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.C17900vP.A0X(r1, ": ", X.AnonymousClass8BW.A0o("MultiAccountSharedPrefReader/readIntegerSharedPrefFromFile/", "registration_device_id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a5, code lost:
        if (r0.intValue() <= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01aa, code lost:
        X.C17900vP.A0X(r1, ": ", X.AnonymousClass8BW.A0o("MultiAccountSharedPrefReader/readIntegerSharedPrefFromFile/", "registration_device_id"));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a9 A[ExcHandler: IOException | SAXException (r1v4 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:25:0x0140] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r24 = this;
            r4 = r24
            X.00H r3 = r4.A04
            X.1cN r0 = X.C17880vN.A0I(r3)
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "AccountSwitchingDailyCron/onDailyCronNoMessageStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = X.C18070vi.A0E(r3)
            X.1cN r2 = (X.C29491cN) r2
            r1 = 1
            r0 = 0
            java.util.List r0 = r2.A09(r1, r1, r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0023:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01b3
            java.lang.Object r5 = r13.next()
            X.2rb r5 = (X.C62562rb) r5
            X.1cN r0 = X.C17880vN.A0I(r3)
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            X.00H r0 = r0.A0I
            java.lang.Object r6 = r0.get()
            X.A3v r6 = (X.C20026A3v) r6
            java.lang.String r0 = "MultiAccountSharedPrefReader/getPushNameFromSharedPref"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "startup_prefs"
            java.lang.String r10 = "registration_device_id"
            java.lang.String r0 = "MultiAccountSharedPrefReader/getIntegerSharedPref"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = ".xml"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r1 = X.C20026A3v.A00(r5, r6, r0)
            if (r1 != 0) goto L_0x013c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MultiAccountSharedPrefReader/getIntegerSharedPref/"
            X.AnonymousClass8BW.A18(r5, r0, r1)
            java.lang.String r0 = ": shared pref file does not exist"
            X.C17890vO.A19(r1, r0)
        L_0x006b:
            r7 = 0
        L_0x006c:
            boolean r6 = r5.A0A
            if (r6 == 0) goto L_0x0124
            if (r7 != 0) goto L_0x0124
            long r6 = r5.A03
            long r0 = r4.A00
            long r11 = r6 + r0
            X.11P r10 = r4.A02
            long r8 = X.AnonymousClass11P.A01(r10)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00d7
            X.0z4 r0 = r4.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "last_daily_cron"
            long r8 = X.C17890vO.A05(r1, r0)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            X.00H r0 = r4.A05
            java.lang.Object r1 = r0.get()
            X.A6J r1 = (X.A6J) r1
            java.lang.String r0 = "InactiveAccountNotificationManager/showDeleteAccountNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r1.A06
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.2sq r14 = (X.C63302sq) r14
            java.lang.String r7 = r5.A07
            X.9In r0 = X.C179579In.DELETE_ACCOUNT
            java.lang.String r18 = X.A6J.A00(r0, r7)
            java.lang.String r19 = r1.A03(r5)
            X.118 r1 = r1.A02
            r0 = 2131886372(0x7f120124, float:1.940732E38)
            java.lang.String r17 = X.C18070vi.A0G(r1, r0)
            android.content.Context r6 = X.C108945cZ.A0E(r1)
            java.lang.String r1 = r5.A05
            r0 = 6
        L_0x00c3:
            android.content.Intent r15 = X.AnonymousClass1LU.A1a(r6, r7, r1, r0, r2)
            r16 = 0
            r20 = 2131231578(0x7f08035a, float:1.807924E38)
            r23 = r2
            r21 = r0
            r22 = r2
            r14.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0023
        L_0x00d7:
            long r0 = r4.A01
            long r6 = r6 + r0
            long r8 = X.AnonymousClass11P.A01(r10)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0023
            X.0z4 r0 = r4.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "last_daily_cron"
            long r8 = X.C17890vO.A05(r1, r0)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            X.00H r0 = r4.A05
            java.lang.Object r1 = r0.get()
            X.A6J r1 = (X.A6J) r1
            java.lang.String r0 = "InactiveAccountNotificationManager/showLogoutAccountNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r1.A06
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.2sq r14 = (X.C63302sq) r14
            java.lang.String r7 = r5.A07
            X.9In r0 = X.C179579In.LOGGED_OUT_ACCOUNT
            java.lang.String r18 = X.A6J.A00(r0, r7)
            java.lang.String r19 = r1.A03(r5)
            X.118 r1 = r1.A02
            r0 = 2131886373(0x7f120125, float:1.9407323E38)
            java.lang.String r17 = X.C18070vi.A0G(r1, r0)
            android.content.Context r6 = X.C108945cZ.A0E(r1)
            java.lang.String r1 = r5.A05
            r0 = 5
            goto L_0x00c3
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingDailyCron/onDailyCronNoMessageStore/account : "
            X.AnonymousClass8BW.A18(r5, r0, r1)
            java.lang.String r0 = ", isLoggedIn : "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", isCompanion : "
            X.C17900vP.A0n(r0, r1, r7)
            goto L_0x0023
        L_0x013c:
            java.lang.String r9 = ": "
            java.lang.String r8 = "MultiAccountSharedPrefReader/readIntegerSharedPrefFromFile/"
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException | SAXException -> 0x01a9 }
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ IOException | SAXException -> 0x01a9 }
            org.w3c.dom.Document r1 = r0.parse(r1)     // Catch:{ IOException | SAXException -> 0x01a9 }
            java.lang.String r0 = "int"
            org.w3c.dom.NodeList r11 = r1.getElementsByTagName(r0)     // Catch:{ IOException | SAXException -> 0x01a9 }
            int r7 = r11.getLength()     // Catch:{ IOException | SAXException -> 0x01a9 }
            if (r7 < 0) goto L_0x006b
            r6 = 0
        L_0x0159:
            org.w3c.dom.Node r1 = r11.item(r6)     // Catch:{ IOException | SAXException -> 0x01a9 }
            if (r1 == 0) goto L_0x0199
            org.w3c.dom.NamedNodeMap r0 = r1.getAttributes()     // Catch:{ IOException | SAXException -> 0x01a9 }
            int r0 = r0.getLength()     // Catch:{ IOException | SAXException -> 0x01a9 }
            if (r0 <= 0) goto L_0x0199
            org.w3c.dom.NamedNodeMap r0 = r1.getAttributes()     // Catch:{ IOException | SAXException -> 0x01a9 }
            org.w3c.dom.Node r0 = r0.item(r2)     // Catch:{ IOException | SAXException -> 0x01a9 }
            java.lang.String r0 = r0.getNodeValue()     // Catch:{ IOException | SAXException -> 0x01a9 }
            boolean r0 = X.C18070vi.A18(r0, r10)     // Catch:{ IOException | SAXException -> 0x01a9 }
            if (r0 == 0) goto L_0x0199
            org.w3c.dom.NamedNodeMap r1 = r1.getAttributes()     // Catch:{ NumberFormatException -> 0x0191, IOException | SAXException -> 0x01a9 }
            r0 = 1
            org.w3c.dom.Node r0 = r1.item(r0)     // Catch:{ NumberFormatException -> 0x0191, IOException | SAXException -> 0x01a9 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r0.getNodeValue()     // Catch:{ NumberFormatException -> 0x0191, IOException | SAXException -> 0x01a9 }
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = X.C108955ca.A0l(r0)     // Catch:{ NumberFormatException -> 0x0191, IOException | SAXException -> 0x01a9 }
            goto L_0x019e
        L_0x0191:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r8, r10)     // Catch:{ IOException | SAXException -> 0x01a9 }
            X.C17900vP.A0X(r1, r9, r0)     // Catch:{ IOException | SAXException -> 0x01a9 }
        L_0x0199:
            if (r6 == r7) goto L_0x006b
            int r6 = r6 + 1
            goto L_0x0159
        L_0x019e:
            if (r0 == 0) goto L_0x006b
            int r0 = r0.intValue()
            r7 = 1
            if (r0 > 0) goto L_0x006c
            goto L_0x006b
        L_0x01a9:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass8BW.A0o(r8, r10)
            X.C17900vP.A0X(r1, r9, r0)
            goto L_0x006b
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20570AQg.Bqh():void");
    }

    public C20570AQg(AnonymousClass11P r4, C19830z4 r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0s(r4, r6, r5, r7);
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A01 = timeUnit.toMillis(25);
        this.A00 = timeUnit.toMillis(55);
    }
}
