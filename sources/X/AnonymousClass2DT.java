package X;

/* renamed from: X.2DT  reason: invalid class name */
public abstract class AnonymousClass2DT extends AnonymousClass268 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.2DO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.2DP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.2DO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.2DO} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r3 = r19
            r7 = r20
            r3.A00(r7)
            r4 = r21
            X.C18070vi.A0h(r7, r4)
            X.00c r0 = X.C17890vO.A0H(r7)
            X.10E r0 = (X.AnonymousClass10E) r0
            X.10E r0 = r0.Ao8
            X.10G r0 = r0.A00
            X.00S r0 = r0.A05
            java.lang.Object r1 = r0.get()
            X.10T r1 = (X.AnonymousClass10T) r1
            java.lang.String r0 = r4.getAction()
            if (r0 != 0) goto L_0x002d
            android.content.ComponentName r0 = r4.getComponent()
            if (r0 == 0) goto L_0x002d
            r0.getClassName()
        L_0x002d:
            r0 = 19
            X.AnonymousClass35V.A00(r1, r4, r0)
            boolean r0 = r3 instanceof X.AnonymousClass2DP
            if (r0 == 0) goto L_0x0047
            X.2DP r3 = (X.AnonymousClass2DP) r3
            X.1cq r0 = r3.A00
            X.10s r2 = r0.A0F
            r1 = 19
        L_0x003e:
            X.3By r0 = new X.3By
            r0.<init>(r3, r4, r1)
            r2.execute(r0)
        L_0x0046:
            return
        L_0x0047:
            boolean r0 = r3 instanceof X.AnonymousClass2DO
            if (r0 == 0) goto L_0x0054
            X.2DO r3 = (X.AnonymousClass2DO) r3
            X.1cq r0 = r3.A00
            X.10s r2 = r0.A0F
            r1 = 18
            goto L_0x003e
        L_0x0054:
            boolean r0 = r3 instanceof com.whatsapp.events.EventStartAlarmReceiver
            if (r0 == 0) goto L_0x00dd
            com.whatsapp.events.EventStartAlarmReceiver r3 = (com.whatsapp.events.EventStartAlarmReceiver) r3
            X.C18070vi.A0h(r7, r4)
            java.lang.String r0 = "EventStartAlarmReceiver event start alarm triggered"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r2 = r3.A01
            if (r2 == 0) goto L_0x017a
            r1 = 7306(0x1c8a, float:1.0238E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "EventStartAlarmReceiver skipping event start alarm trigger/ abprop disabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0076:
            X.205 r16 = X.AnonymousClass4aU.A02(r4)
            if (r16 == 0) goto L_0x0046
            X.2Z3 r0 = r3.A00
            if (r0 == 0) goto L_0x0177
            X.10H r0 = r0.A00
            X.10E r4 = r0.A00
            X.11P r9 = X.AnonymousClass10E.A6O(r4)
            X.00S r0 = r4.A2H
            java.lang.Object r11 = r0.get()
            X.1CJ r11 = (X.AnonymousClass1CJ) r11
            X.00S r0 = r4.ABd
            java.lang.Object r14 = r0.get()
            X.1LU r14 = (X.AnonymousClass1LU) r14
            X.00S r0 = r4.A3n
            java.lang.Object r13 = r0.get()
            X.4Yk r13 = (X.C88124Yk) r13
            X.1M9 r8 = X.AnonymousClass10E.A4z(r4)
            X.00S r0 = r4.A3w
            java.lang.Object r2 = r0.get()
            X.1W6 r2 = (X.AnonymousClass1W6) r2
            X.00S r0 = r4.A2E
            java.lang.Object r1 = r0.get()
            X.1Nb r1 = (X.AnonymousClass1Nb) r1
            X.00S r0 = r4.A93
            java.lang.Object r15 = r0.get()
            X.17d r15 = (X.C217217d) r15
            X.00S r0 = r4.A9A
            java.lang.Object r10 = r0.get()
            X.1Vn r10 = (X.C27301Vn) r10
            X.00S r0 = r4.A3l
            java.lang.Object r12 = r0.get()
            X.1y2 r12 = (X.C42351y2) r12
            X.3Co r6 = new X.3Co
            r17 = r1
            r18 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.10I r0 = r3.A02
            if (r0 == 0) goto L_0x017d
            r0.CGF(r6)
            return
        L_0x00dd:
            boolean r0 = r3 instanceof X.AnonymousClass2DQ
            if (r0 == 0) goto L_0x011a
            X.2DQ r3 = (X.AnonymousClass2DQ) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0106;
                case 1: goto L_0x018d;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            java.lang.String r2 = r4.getAction()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "xmpp/handler/logout-timer/timeout "
            X.C17900vP.A0f(r0, r2, r1)
            java.lang.String r0 = "com.whatsapp.MessageHandler.LOGOUT_ACTION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0185
            java.lang.Object r0 = r3.A01
            X.1cu r0 = (X.C29811cu) r0
            X.C29811cu.A03(r0, r2)
            return
        L_0x0106:
            java.lang.String r0 = "com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"
            boolean r0 = X.C17890vO.A1S(r4, r0)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r3.A01
            X.17v r1 = (X.C219017v) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            X.1dH r0 = r1.A0a
            r0.CFW()
            return
        L_0x011a:
            com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver r3 = (com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver) r3
            X.0z4 r0 = r3.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            java.lang.String r6 = "companion_device_verification_ids"
            java.lang.String r1 = X.C17880vN.A0r(r0, r6)
            if (r1 == 0) goto L_0x0171
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            if (r0 == 0) goto L_0x0171
            java.util.Iterator r5 = r0.iterator()
        L_0x013a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.String r2 = X.C17880vN.A0v(r5)
            X.1RK r1 = r3.A02
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r0 = r0.A06(r2)
            X.C17960vV.A07(r0)
            X.4Zh r2 = X.AnonymousClass1RK.A00(r1, r0)
            if (r2 == 0) goto L_0x013a
            X.2Kt r1 = r3.A00
            r0 = 2
            X.AnonymousClass35V.A00(r1, r2, r0)
        L_0x015b:
            X.0z4 r0 = r3.A01
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1B(r0, r6)
            r1 = 0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r0 = X.C1408573i.A01(r7, r1, r4, r0)
            if (r0 == 0) goto L_0x0046
            r0.cancel()
            return
        L_0x0171:
            java.lang.String r0 = "CompanionDeviceVerificationReceiver/onReceive/ deviceIds are missing from prefs"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x015b
        L_0x0177:
            java.lang.String r0 = "eventStartNotificationRunnableFactory"
            goto L_0x0180
        L_0x017a:
            java.lang.String r0 = "abProps"
            goto L_0x0180
        L_0x017d:
            java.lang.String r0 = "waWorkers"
        L_0x0180:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0185:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown intent received in logout receiver "
            goto L_0x01af
        L_0x018d:
            java.lang.String r0 = "com.whatsapp.MessageHandler.RECONNECT_ACTION"
            boolean r0 = X.C17890vO.A1S(r4, r0)
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "MessageHandler/reconnect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r3.A01
            X.17v r2 = (X.C219017v) r2
            java.lang.String r1 = "connect_reason"
            r0 = 0
            int r0 = r4.getIntExtra(r1, r0)
            r2.A0A(r0)
            return
        L_0x01a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageHandler/unknown intent received in reconnect receiver "
        L_0x01af:
            X.C17900vP.A0Z(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DT.onReceive(android.content.Context, android.content.Intent):void");
    }
}
