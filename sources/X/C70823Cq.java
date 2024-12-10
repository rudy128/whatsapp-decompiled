package X;

import java.net.UnknownHostException;

/* renamed from: X.3Cq  reason: invalid class name and case insensitive filesystem */
public class C70823Cq implements Runnable {
    public Object A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    public C70823Cq(int i, int i2) {
        this.A01 = 4;
        this.A04 = new AnonymousClass1DS();
        this.A03 = i;
        this.A02 = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x02b8;
                case 1: goto L_0x0277;
                case 2: goto L_0x0231;
                case 3: goto L_0x0208;
                case 4: goto L_0x02e6;
                case 5: goto L_0x01de;
                case 6: goto L_0x01aa;
                case 7: goto L_0x0199;
                case 8: goto L_0x0199;
                case 9: goto L_0x015a;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0148;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00c7;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00a8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r8 = r0.A04
            X.1nP r8 = (X.C36141nP) r8
            int r6 = r0.A02
            java.lang.Object r4 = r0.A00
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r2 = r0.A03
            X.2nE r7 = X.C63962tz.A02(r4)
            X.1Os r0 = r8.A04
            X.3Ez r3 = X.C25571Os.A00(r7, r0)
            X.C25571Os.A03(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "LocationNotificationHandler/checking sessions for "
            r1.append(r0)     // Catch:{ all -> 0x009c }
            r1.append(r7)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = " due to retry receipt for "
            X.C17900vP.A0Y(r4, r0, r1)     // Catch:{ all -> 0x009c }
            X.1P3 r5 = r8.A03     // Catch:{ all -> 0x009c }
            boolean r0 = r5.A0b(r7)     // Catch:{ all -> 0x009c }
            r9 = 0
            if (r0 == 0) goto L_0x008c
            X.9zg r0 = r5.A0F(r7)     // Catch:{ all -> 0x009c }
            X.9XJ r10 = r0.A01     // Catch:{ all -> 0x009c }
            X.8cI r0 = r10.A00     // Catch:{ all -> 0x009c }
            int r0 = r0.remoteRegistrationId_     // Catch:{ all -> 0x009c }
            if (r0 == r2) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "LocationNotificationHandler/deleting session due to registration id change for "
            r1.append(r0)     // Catch:{ all -> 0x009c }
            r1.append(r4)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = " stop retrying"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x009c }
            r5.A0G(r7)     // Catch:{ all -> 0x009c }
            r5.A0S(r7)     // Catch:{ all -> 0x009c }
            goto L_0x0096
        L_0x005e:
            r2 = 2
            if (r6 < r2) goto L_0x008c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "LocationNotificationHandler/requiring new session before resending for "
            X.C17900vP.A0Y(r4, r0, r1)     // Catch:{ all -> 0x009c }
            X.8cI r0 = r10.A00     // Catch:{ all -> 0x009c }
            X.DSQ r0 = r0.aliceBaseKey_     // Catch:{ all -> 0x009c }
            byte[] r9 = r0.A06()     // Catch:{ all -> 0x009c }
            if (r6 <= r2) goto L_0x0082
            com.whatsapp.jid.UserJid r0 = r4.userJid     // Catch:{ all -> 0x009c }
            boolean r0 = r5.A0c(r7, r0)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "LocationNotificationHandler/will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009c }
            goto L_0x0096
        L_0x0082:
            java.lang.String r0 = "LocationNotificationHandler/will record the base key used to send "
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009c }
            com.whatsapp.jid.UserJid r0 = r4.userJid     // Catch:{ all -> 0x009c }
            r5.A0T(r7, r0, r9)     // Catch:{ all -> 0x009c }
        L_0x008c:
            X.1Mm r1 = r8.A02     // Catch:{ all -> 0x009c }
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r0 = new com.whatsapp.jobqueue.job.SendLiveLocationKeyJob     // Catch:{ all -> 0x009c }
            r0.<init>(r4, r9, r6)     // Catch:{ all -> 0x009c }
            r1.A01(r0)     // Catch:{ all -> 0x009c }
        L_0x0096:
            if (r3 == 0) goto L_0x031f
            r3.close()
            return
        L_0x009c:
            r1 = move-exception
            if (r3 == 0) goto L_0x00a7
            r3.close()     // Catch:{ all -> 0x00a3 }
            throw r1
        L_0x00a3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00a7:
            throw r1
        L_0x00a8:
            java.lang.Object r4 = r0.A04
            X.2sl r4 = (X.C63252sl) r4
            int r3 = r0.A02
            int r2 = r0.A03
            java.lang.Object r1 = r0.A00
            X.2f9 r1 = (X.C55062f9) r1
            r0 = 0
            goto L_0x00c3
        L_0x00b6:
            java.lang.Object r4 = r0.A04
            X.2sl r4 = (X.C63252sl) r4
            int r3 = r0.A02
            int r2 = r0.A03
            java.lang.Object r1 = r0.A00
            X.2f9 r1 = (X.C55062f9) r1
            r0 = 1
        L_0x00c3:
            X.C63252sl.A00(r1, r4, r3, r2, r0)
            return
        L_0x00c7:
            java.lang.Object r4 = r0.A04
            X.2sl r4 = (X.C63252sl) r4
            int r3 = r0.A03
            java.lang.Object r2 = r0.A00
            X.2f9 r2 = (X.C55062f9) r2
            r1 = 897463359(0x357e343f, float:9.46984E-7)
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            r0 = 2
            X.C63252sl.A00(r2, r4, r1, r3, r0)
            return
        L_0x00dd:
            java.lang.Object r1 = r0.A04
            X.2r7 r1 = (X.C62262r7) r1
            int r12 = r0.A02
            java.lang.Object r4 = r0.A00
            X.206 r4 = (X.AnonymousClass206) r4
            int r3 = r0.A03
            X.00H r0 = r1.A02
            java.lang.Object r5 = r0.get()
            X.2q2 r5 = (X.C61652q2) r5
            r6 = 0
            r9 = 0
            monitor-enter(r5)
            java.lang.String r11 = r5.A00     // Catch:{ all -> 0x0145 }
            if (r11 != 0) goto L_0x00fc
            java.lang.String r11 = X.C61652q2.A00(r5)     // Catch:{ all -> 0x0145 }
        L_0x00fc:
            monitor-exit(r5)
            X.205 r0 = r4.A0v
            X.1BI r2 = r0.A00
            X.00H r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.2sb r0 = (X.C63152sb) r0
            int r0 = r0.A02(r2)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r2 = X.C42941yz.A00(r2)
            if (r2 == 0) goto L_0x0129
            X.1PU r0 = r5.A01
            X.1MZ r0 = r0.A01
            boolean r0 = r0.A0K(r2)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0129:
            X.00H r0 = r5.A03
            int r0 = X.C62242r5.A00(r4, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Long r10 = X.C17880vN.A0n(r3)
            r13 = 82
            X.8rf r2 = X.C181749Rr.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.18K r1 = r1.A00
            X.0vt r0 = X.C62262r7.A03
            r1.CC6(r2, r0)
            return
        L_0x0145:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0148:
            java.lang.Object r4 = r0.A04
            X.10T r4 = (X.AnonymousClass10T) r4
            java.lang.Object r3 = r0.A00
            int r2 = r0.A03
            r1 = 0
            X.7KT r0 = new X.7KT
            r0.<init>(r3, r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x015a:
            java.lang.Object r6 = r0.A04
            X.1nP r6 = (X.C36141nP) r6
            java.lang.Object r5 = r0.A00
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            int r2 = r0.A02
            int r4 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationNotificationHandler/send retry receipt; jid="
            X.C17900vP.A0Y(r5, r0, r1)
            byte[] r3 = X.A8G.A03(r2)
            r0 = 1
            if (r4 <= r0) goto L_0x017b
            X.120 r0 = r6.A01
            r0.A06()
        L_0x017b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationNotificationHandler/axolotl sending retry receipt; jid="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; localRegistrationId="
            X.C17900vP.A0j(r0, r1, r2)
            X.1Uv r2 = r6.A05
            com.whatsapp.jid.UserJid r1 = r5.userJid
            X.C17960vV.A07(r1)
            int r0 = r4 + 1
            r2.A0Y(r1, r3, r0)
            return
        L_0x0199:
            java.lang.Object r3 = r0.A04
            X.189 r3 = (X.AnonymousClass189) r3
            int r2 = r0.A02
            int r1 = r0.A03
            java.lang.Object r0 = r0.A00
            r3.A00(r2)
            r3.A01(r0, r1, r2)
            return
        L_0x01aa:
            java.lang.Object r6 = r0.A04
            X.18C r6 = (X.AnonymousClass18C) r6
            int r5 = r0.A02
            java.lang.Object r4 = r0.A00
            int r3 = r0.A03
            X.183 r0 = r6.A01
            X.10s r0 = r0.A01
            r0.A02()
            java.util.concurrent.CountDownLatch r0 = r6.A03     // Catch:{ InterruptedException -> 0x01c1 }
            r0.await()     // Catch:{ InterruptedException -> 0x01c1 }
            goto L_0x01da
        L_0x01c1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "wamruntime: unexpected thread interrupt ("
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1F(r2, r1)
            com.whatsapp.util.Log.a((java.lang.String) r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x01da:
            X.AnonymousClass18C.A00(r6, r4, r5, r3)
            return
        L_0x01de:
            java.lang.Object r2 = r0.A04
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.Object r1 = r0.A00
            X.77J r1 = (X.AnonymousClass77J) r1
            int r11 = r0.A02
            int r12 = r0.A03
            X.77C r0 = r1.A01
            java.lang.String r5 = r0.A03
            X.1BI r0 = r2.A3R
            java.util.List r10 = java.util.Collections.singletonList(r0)
            java.lang.String r6 = r1.A04
            X.77C r0 = r1.A02
            java.lang.String r9 = r0.A03
            int r13 = r1.A00
            r14 = 0
            r3 = 0
            r7 = r3
            r8 = r3
            r16 = r14
            r4 = r3
            r15 = r14
            X.AnonymousClass4aY.A1Z(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0208:
            java.lang.Object r4 = r0.A04
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            int r3 = r0.A02
            int r7 = r0.A03
            java.lang.Object r5 = r0.A00
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.1Me r1 = r4.A0k
            X.1E7 r0 = r4.A1P
            java.lang.String r1 = r1.A0I(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r6 = r4.A1I(r3, r2)
            X.1KB r0 = r4.A0S
            r8 = 9
            X.3Cm r3 = new X.3Cm
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0J(r3)
            return
        L_0x0231:
            int r5 = r0.A02
            int r4 = r0.A03
            java.lang.Object r3 = r0.A04
            X.1fA r3 = (X.C31191fA) r3
            java.lang.Object r2 = r0.A00
            X.1Di r2 = (X.C22821Di) r2
            r1 = 2
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            if (r5 != 0) goto L_0x025f
            if (r4 != r1) goto L_0x025c
            X.00H r0 = r3.A0I
            java.lang.Object r0 = r0.get()
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r0 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r0
            X.1TK r0 = r0.A02
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x025c
            X.2Qi r0 = X.C49402Qi.LEAKY_COMPANION_WITH_SECRET_CODE
        L_0x0258:
            r2.invoke(r0)
            return
        L_0x025c:
            X.2Qi r0 = X.C49402Qi.LEAKY_COMPANION
            goto L_0x0258
        L_0x025f:
            if (r4 != r1) goto L_0x0274
            X.00H r0 = r3.A0I
            java.lang.Object r0 = r0.get()
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r0 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r0
            X.1TK r0 = r0.A02
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0274
            X.2Qi r0 = X.C49402Qi.FULL_SUPPORT
            goto L_0x0258
        L_0x0274:
            X.2Qi r0 = X.C49402Qi.NO_BANNER
            goto L_0x0258
        L_0x0277:
            int r5 = r0.A02
            int r4 = r0.A03
            java.lang.Object r1 = r0.A04
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r3 = r0.A00
            X.1V9 r3 = (X.AnonymousClass1V9) r3
            X.63d r2 = new X.63d
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A03 = r0
            r2.A02 = r1
            java.lang.String r0 = r3.A00
            r2.A06 = r0
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.9iv r0 = (X.C189339iv) r0
            java.lang.String r0 = r0.A00()
            r2.A05 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            X.18K r0 = r3.A01
            r0.CC7(r2)
            return
        L_0x02b8:
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r5 < r1) goto L_0x02ce
            java.lang.Object r3 = r0.A04
            android.app.Service r3 = (android.app.Service) r3
            int r2 = r0.A02
            java.lang.Object r1 = r0.A00
            android.app.Notification r1 = (android.app.Notification) r1
            int r0 = r0.A03
            X.AnonymousClass9OJ.A00(r1, r3, r2, r0)
            return
        L_0x02ce:
            r4 = 29
            java.lang.Object r3 = r0.A04
            android.app.Service r3 = (android.app.Service) r3
            int r2 = r0.A02
            java.lang.Object r1 = r0.A00
            android.app.Notification r1 = (android.app.Notification) r1
            if (r5 < r4) goto L_0x02e2
            int r0 = r0.A03
            X.AnonymousClass9OI.A00(r1, r3, r2, r0)
            return
        L_0x02e2:
            r3.startForeground(r2, r1)
            return
        L_0x02e6:
            monitor-enter(r0)
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x0328 }
            X.206 r1 = (X.AnonymousClass206) r1
            monitor-exit(r0)
            r5 = 0
            if (r1 == 0) goto L_0x0320
            X.36u r1 = r1.A0O()
            if (r1 == 0) goto L_0x0320
            byte[] r4 = r1.A01()
            if (r4 == 0) goto L_0x0320
            int r3 = r0.A03
            int r2 = r0.A02
            X.25O r1 = new X.25O
            r1.<init>(r3, r2)
            X.25P r1 = X.AnonymousClass204.A0C(r1, r4)
            android.graphics.Bitmap r2 = r1.A02
            if (r2 == 0) goto L_0x0320
            int r1 = r2.getHeight()
            if (r1 == 0) goto L_0x0320
            int r1 = r2.getWidth()
            if (r1 == 0) goto L_0x0320
            java.lang.Object r0 = r0.A04
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0E(r2)
        L_0x031f:
            return
        L_0x0320:
            java.lang.Object r0 = r0.A04
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0E(r5)
            return
        L_0x0328:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70823Cq.run():void");
    }

    public C70823Cq(C55062f9 r2, C63252sl r3, int i, int i2, int i3) {
        this.A01 = i3;
        if (14 - i3 != 0) {
            this.A04 = r3;
            this.A02 = i;
        } else {
            this.A04 = r3;
            this.A02 = 897463359;
        }
        this.A03 = i2;
        this.A00 = r2;
    }

    public C70823Cq(C31281fJ r2, UnknownHostException unknownHostException, int i) {
        this.A01 = 12;
        this.A04 = r2;
        this.A02 = 1;
        this.A00 = unknownHostException;
        this.A03 = i;
    }

    public C70823Cq(Object obj, int i, Object obj2, int i2, int i3) {
        this.A01 = i3;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = obj;
        this.A00 = obj2;
    }
}
