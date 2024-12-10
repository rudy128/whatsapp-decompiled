package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Cg  reason: invalid class name and case insensitive filesystem */
public class C70723Cg implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C70723Cg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A07 = obj2;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A04 = obj5;
        this.A08 = obj6;
        this.A03 = obj7;
        this.A02 = obj8;
    }

    public final boolean A01(C201110w r21, UserJid userJid, C61732qA r23) {
        C58252kO r2;
        String A1E;
        AnonymousClass2BR r0;
        C201110w r5 = r21;
        if (!r5.isEmpty()) {
            UserJid userJid2 = userJid;
            if (!((AnonymousClass11S) this.A07).A0O(userJid2)) {
                C61732qA r10 = r23;
                byte[] bArr = r10.A08;
                if (bArr == null) {
                    A1E = "SyncDeviceNotificationRunnable/verifyADVIndexList/no key index list in device add notification";
                } else {
                    UserJid userJid3 = r10.A06;
                    AnonymousClass1U5 r52 = (AnonymousClass1U5) this.A03;
                    C59352mA A072 = r52.A07(userJid3, bArr);
                    if (A072 != null && A072.A02) {
                        ((AnonymousClass123) this.A05).A02(C18070vi.A0M(userJid3.getPrimaryDevice()));
                    }
                    AnonymousClass2BR r8 = null;
                    if (A072 == null || (r0 = A072.A01) == null) {
                        r2 = null;
                    } else {
                        r8 = r0;
                        r2 = A072.A00;
                    }
                    long j = r10.A00;
                    if (!AnonymousClass1U5.A04(r52, userJid3, r8, AnonymousClass1A3.A01, j)) {
                        A1E = AnonymousClass001.A1E(userJid3, "SyncDeviceNotificationRunnable/verifyADVIndexList/validate indexList fail, userJid=", AnonymousClass000.A10());
                    } else if (r8 != null) {
                        AnonymousClass1MR r6 = (AnonymousClass1MR) this.A08;
                        HashMap hashMap = new HashMap(r6.A0B(userJid3));
                        hashMap.putAll(r10.A02);
                        C62512rW A052 = r6.A05(userJid3);
                        if (A052 == null) {
                            int i = r8.rawId_;
                            AnonymousClass2RD A002 = AnonymousClass2RD.A00(r8.accountType_);
                            if (A002 == null) {
                                A002 = AnonymousClass2RD.E2EE;
                            }
                            A052 = new C62512rW(A002, i, 0, 0, 0, 0);
                        }
                        r6.A0G(C201110w.copyOf((Map) r52.A08(r8.validIndexes_, r6.A0B(userJid3), hashMap, r8.currentIndex_)), r6.A04(A052, j), userJid3, false);
                        if (r2 != null) {
                            r52.A06.A0a(r2, C63962tz.A02(userJid3.getPrimaryDevice()));
                            return false;
                        }
                    } else {
                        throw C17880vN.A0g();
                    }
                }
                Log.e(A1E);
                Log.e("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/invalid adv data");
                return true;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Add self device, userJid=");
            A10.append(userJid2);
            ((AnonymousClass190) this.A01).A0G("invalid-device-notification", AnonymousClass001.A1E(r5, "; toAdd=", A10), false);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0146
            java.lang.Object r5 = r2.A01
            X.2rZ r5 = (X.C62542rZ) r5
            java.lang.Object r8 = r2.A02
            X.77d r8 = (X.C1418377d) r8
            java.lang.Object r14 = r2.A03
            X.1BI r14 = (X.AnonymousClass1BI) r14
            java.lang.Object r15 = r2.A04
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15
            java.lang.Object r7 = r2.A05
            X.206 r7 = (X.AnonymousClass206) r7
            java.lang.Object r6 = r2.A06
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r4 = r2.A07
            X.AEX r4 = (X.AEX) r4
            java.lang.Object r3 = r2.A08
            X.Af0 r3 = (X.C21132Af0) r3
            X.2f6 r2 = new X.2f6
            r2.<init>()
            r0 = 2
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r0)
            if (r8 != 0) goto L_0x00b3
            r0 = 6
        L_0x0034:
            r2.A01 = r0
            r11.countDown()
        L_0x0039:
            X.0ve r10 = r5.A03
            r9 = 1084(0x43c, float:1.519E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r8, r10, r9)
            r0 = 7
            if (r1 == 0) goto L_0x0059
            if (r4 == 0) goto L_0x0059
            X.17r r0 = r5.A00
            java.io.File r0 = r0.A0H()
            java.io.File r17 = r4.A01(r0)
            boolean r0 = r17.exists()
            if (r0 != 0) goto L_0x0060
            r0 = 4
        L_0x0059:
            r2.A00 = r0
        L_0x005b:
            r11.countDown()
            goto L_0x012e
        L_0x0060:
            X.1QQ r1 = r5.A02
            java.lang.String r0 = r4.A0F
            X.AEX r7 = r1.A03(r0)
            r6 = 1
            if (r7 == 0) goto L_0x00f0
            byte[] r12 = r7.A08
            if (r12 == 0) goto L_0x00f0
            long r0 = r7.A00
            X.2pa r13 = new X.2pa
            r13.<init>(r12, r0)
            X.11P r12 = r5.A01
            long r0 = X.AnonymousClass11P.A01(r12)
            boolean r0 = X.C61382pa.A00(r13, r0)
            if (r0 == 0) goto L_0x00f0
            long r0 = r7.A00
            long r15 = X.AnonymousClass11P.A01(r12)
            r12 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r0 = r0 + r12
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x00f0
            int r12 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x00f0
            byte[] r14 = r7.A08
            long r0 = r7.A00
            java.lang.String r13 = r7.A04
            java.lang.String r12 = r7.A03
            java.lang.String r7 = r7.A02
            boolean r5 = X.C18020vd.A05(r8, r10, r9)
            r4.A08 = r14
            r4.A00 = r0
            r4.A04 = r13
            r4.A03 = r12
            r4.A02 = r7
            r4.A07 = r5
            r2.A00 = r6
            goto L_0x005b
        L_0x00b3:
            int r0 = r8.A00
            long r0 = (long) r0
            r12 = 1048576(0x100000, double:5.180654E-318)
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x00ed
            r10 = 0
            X.2ta r1 = X.C62542rZ.A00(r8, r10)
            if (r1 != 0) goto L_0x00c7
            r0 = 4
            goto L_0x0034
        L_0x00c7:
            X.1T6 r9 = r5.A04
            r0 = 1
            X.34B r1 = r9.A0C(r1, r0)
            java.lang.String r0 = "mms"
            r1.A0Z = r0
            X.3Ad r13 = new X.3Ad
            r16 = r1
            r17 = r2
            r18 = r5
            r19 = r7
            r20 = r8
            r21 = r6
            r22 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1.A07(r13, r10)
            r9.A0J(r1, r10)
            goto L_0x0039
        L_0x00ed:
            r0 = 2
            goto L_0x0034
        L_0x00f0:
            r0 = 0
            X.2qf r15 = new X.2qf
            r15.<init>(r6, r0, r6)
            X.1So r16 = X.C26551So.A0f
            android.net.Uri r12 = android.net.Uri.fromFile(r17)
            r13 = 0
            r17 = r13
            r18 = r13
            r21 = r0
            r19 = r0
            r14 = r13
            r22 = r6
            r20 = r0
            X.2ta r0 = X.C63722ta.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1T6 r7 = r5.A04
            X.34B r1 = r7.A0C(r0, r6)
            java.lang.String r0 = "mms"
            r1.A0Z = r0
            X.Aep r14 = new X.Aep
            r15 = r1
            r16 = r5
            r17 = r4
            r18 = r2
            r19 = r11
            r20 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.A07(r14, r13)
            r7.A0J(r1, r13)
        L_0x012e:
            r11.await()     // Catch:{ InterruptedException -> 0x0132 }
            goto L_0x013d
        L_0x0132:
            r1 = move-exception
            java.lang.String r0 = "Payment Media upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0141 }
            r0 = 3
            r2.A01 = r0     // Catch:{ all -> 0x0141 }
            r2.A00 = r0     // Catch:{ all -> 0x0141 }
        L_0x013d:
            r3.A0B(r2)
            return
        L_0x0141:
            r0 = move-exception
            r3.A0B(r2)
            throw r0
        L_0x0146:
            java.lang.Object r10 = r2.A02
            X.2qA r10 = (X.C61732qA) r10
            X.0yx r9 = r10.A01
            if (r9 == 0) goto L_0x021c
            java.lang.Object r6 = r9.A00
            X.1E1 r6 = (X.AnonymousClass1E1) r6
        L_0x0152:
            com.whatsapp.jid.UserJid r5 = r10.A06
            boolean r0 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x016a
            if (r6 == 0) goto L_0x016a
            java.lang.Object r0 = r2.A06
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            r0 = r5
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            r1.A0P(r6, r0)
        L_0x016a:
            java.util.HashSet r4 = X.C17880vN.A12()
            java.lang.String r8 = r10.A07
            java.lang.String r14 = "Required value was null."
            java.lang.Object r7 = r2.A08
            X.1MR r7 = (X.AnonymousClass1MR) r7
            long r12 = r7.A01(r5)
            long r0 = r10.A00
            r11 = 0
            int r3 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x01c8
            java.lang.String r0 = "SyncDeviceNotificationRunnable/handleUserDeviceUpdate/local ts is larger than notification one"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            X.0yx r3 = new X.0yx
            r3.<init>(r0, r0)
        L_0x018f:
            java.lang.Object r0 = r3.A00
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x019d
            r4.add(r5)
        L_0x019d:
            java.lang.Object r0 = r3.A01
            X.C18070vi.A0W(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x01ad
            if (r6 == 0) goto L_0x01ad
            r4.add(r6)
        L_0x01ad:
            boolean r0 = X.C17880vN.A1X(r4)
            if (r0 == 0) goto L_0x01c7
            r4.size()
            java.lang.Object r2 = r2.A04
            X.1Re r2 = (X.C26191Re) r2
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r4.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0 = 2
            r2.A01(r1, r0)
        L_0x01c7:
            return
        L_0x01c8:
            X.10w r0 = r10.A02
            boolean r3 = r2.A01(r0, r5, r10)
            if (r9 == 0) goto L_0x0219
            java.lang.Object r1 = r9.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x021a
            X.10w r0 = r10.A04
            boolean r0 = r2.A01(r0, r1, r10)
        L_0x01dc:
            if (r3 != 0) goto L_0x0210
            if (r0 != 0) goto L_0x0210
            X.10w r0 = r10.A03
            r2.A00(r0, r5, r10)
            if (r9 == 0) goto L_0x01ec
            X.10w r0 = r10.A05
            r2.A00(r0, r5, r10)
        L_0x01ec:
            if (r1 == 0) goto L_0x01fc
            if (r9 == 0) goto L_0x021f
            java.lang.Object r0 = r9.A01
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x021f
            boolean r0 = r7.A0H(r1, r0)
            r11 = r0 ^ 1
        L_0x01fc:
            boolean r0 = r7.A0H(r5, r8)
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
        L_0x020a:
            X.0yx r3 = new X.0yx
            r3.<init>(r1, r0)
            goto L_0x018f
        L_0x0210:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x020a
        L_0x0219:
            r1 = 0
        L_0x021a:
            r0 = 0
            goto L_0x01dc
        L_0x021c:
            r6 = 0
            goto L_0x0152
        L_0x021f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70723Cg.run():void");
    }

    public final void A00(C201110w r8, UserJid userJid, C61732qA r10) {
        if (r8.isEmpty()) {
            return;
        }
        if (!((AnonymousClass11S) this.A07).A0O(userJid)) {
            AnonymousClass1MR r6 = (AnonymousClass1MR) this.A08;
            UserJid userJid2 = r10.A06;
            AnonymousClass1F8 r4 = new AnonymousClass1F8();
            Map A0B = r6.A0B(userJid);
            C18070vi.A0X(A0B);
            Iterator A15 = AnonymousClass000.A15(A0B);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                Object value = A16.getValue();
                if (r8.containsKey(key) && r8.get(key) == value) {
                    r4.add(key);
                }
            }
            r6.A0C(r4.build(), userJid2);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Remove self device, userJid=");
        A10.append(userJid);
        ((AnonymousClass190) this.A01).A0G("invalid-device-notification", AnonymousClass001.A1E(r8, "; toAdd=", A10), false);
    }
}
