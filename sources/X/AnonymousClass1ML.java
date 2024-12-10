package X;

import android.content.ContentValues;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1ML  reason: invalid class name */
public class AnonymousClass1ML {
    public final AnonymousClass190 A00;
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;
    public final C24751Ln A03;
    public final AnonymousClass1MM A04;
    public final C18030ve A05;
    public final AnonymousClass1MK A06;
    public final AnonymousClass10I A07;

    public AnonymousClass1ML(AnonymousClass190 r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, C24751Ln r5, C18030ve r6, AnonymousClass1MK r7, AnonymousClass10I r8) {
        AnonymousClass1MM r0 = new AnonymousClass1MM();
        this.A05 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = r8;
        this.A03 = r5;
        this.A02 = r4;
        this.A06 = r7;
        this.A04 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r13 > 0) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C201110w A00(X.AnonymousClass1ML r18, com.whatsapp.jid.UserJid r19) {
        /*
            r5 = r18
            X.1MM r0 = r5.A04
            java.util.Map r7 = r0.A00
            r8 = r19
            boolean r0 = r7.containsKey(r8)
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r7.get(r8)
            X.10w r0 = (X.C201110w) r0
            if (r0 == 0) goto L_0x0017
            return r0
        L_0x0017:
            X.1DL r11 = r5.A01
            long r9 = r11.A09(r8)
            X.1Cd r0 = r5.A02
            X.1at r19 = r0.get()
            monitor-enter(r5)     // Catch:{ all -> 0x0109 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0106 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "\n            SELECT device_jid_row_id, key_index \n            FROM user_device \n            WHERE user_jid_row_id = ?\n        "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0106 }
            java.lang.String r1 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x0106 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "GET_DEVICE_JIDS_BY_USER_JID_SQL"
            android.database.Cursor r6 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x0106 }
            X.10x r18 = new X.10x     // Catch:{ all -> 0x00fa }
            r18.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "device_jid_row_id"
            int r10 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "key_index"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fa }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00fa }
            r4.<init>()     // Catch:{ all -> 0x00fa }
        L_0x0052:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00d6
            long r2 = r6.getLong(r10)     // Catch:{ all -> 0x00fa }
            long r0 = r6.getLong(r9)     // Catch:{ all -> 0x00fa }
            com.whatsapp.jid.Jid r14 = r11.A0B(r2)     // Catch:{ all -> 0x00fa }
            X.1E0 r12 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x00fa }
            com.whatsapp.jid.DeviceJid r12 = r12.A02(r14)     // Catch:{ all -> 0x00fa }
            if (r12 == 0) goto L_0x008b
            int r13 = r12.getDevice()     // Catch:{ all -> 0x00fa }
            r17 = 0
            if (r13 != 0) goto L_0x0076
            r17 = 1
        L_0x0076:
            r15 = 0
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x007f
            if (r13 == 0) goto L_0x0081
            goto L_0x008b
        L_0x007f:
            if (r13 <= 0) goto L_0x008b
        L_0x0081:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fa }
            r0 = r18
            r0.put(r12, r1)     // Catch:{ all -> 0x00fa }
            goto L_0x0052
        L_0x008b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r15.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = "DeviceStore/getDevicesForUser/invalid devices jid="
            r15.append(r13)     // Catch:{ all -> 0x00fa }
            r15.append(r14)     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = "; for user jid="
            r15.append(r13)     // Catch:{ all -> 0x00fa }
            r15.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = "; deviceJidRowId="
            r15.append(r13)     // Catch:{ all -> 0x00fa }
            r15.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = "; keyIndex="
            r15.append(r13)     // Catch:{ all -> 0x00fa }
            r15.append(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x00fa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            if (r12 != 0) goto L_0x00d1
            X.190 r13 = r5.A00     // Catch:{ all -> 0x00fa }
            java.lang.String r12 = "invalid-device"
            if (r14 != 0) goto L_0x00c8
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00fa }
        L_0x00c3:
            r0 = 0
            r13.A0G(r12, r1, r0)     // Catch:{ all -> 0x00fa }
            goto L_0x0052
        L_0x00c8:
            int r0 = r14.getType()     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00c3
        L_0x00d1:
            r4.add(r12)     // Catch:{ all -> 0x00fa }
            goto L_0x0052
        L_0x00d6:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00e8
            X.10I r2 = r5.A07     // Catch:{ all -> 0x00fa }
            r1 = 26
            X.3C4 r0 = new X.3C4     // Catch:{ all -> 0x00fa }
            r0.<init>(r5, r8, r4, r1)     // Catch:{ all -> 0x00fa }
            r2.CGF(r0)     // Catch:{ all -> 0x00fa }
        L_0x00e8:
            X.10w r0 = r18.build()     // Catch:{ all -> 0x00fa }
            r7.put(r8, r0)     // Catch:{ all -> 0x00fa }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x00fa }
            r6.close()     // Catch:{ all -> 0x0106 }
            monitor-exit(r5)     // Catch:{ all -> 0x0106 }
            r19.close()
            return r0
        L_0x00fa:
            r1 = move-exception
            if (r6 == 0) goto L_0x0105
            r6.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0106 }
        L_0x0105:
            throw r1     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x010e }
            throw r1
        L_0x010e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ML.A00(X.1ML, com.whatsapp.jid.UserJid):X.10w");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 178 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap A01(java.util.Set r22) {
        /*
            r21 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r22.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            r9 = r21
            if (r0 == 0) goto L_0x0040
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.1MM r0 = r9.A04
            java.util.Map r1 = r0.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r1.get(r2)
        L_0x002a:
            if (r0 == 0) goto L_0x0030
            r10.put(r2, r0)
            goto L_0x000e
        L_0x0030:
            X.1DL r0 = r9.A01
            long r0 = r0.A09(r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.add(r0)
            goto L_0x000e
        L_0x003e:
            r0 = 0
            goto L_0x002a
        L_0x0040:
            java.lang.String[] r0 = X.C19620yd.A0M
            java.lang.Object[] r2 = r4.toArray(r0)
            r0 = 975(0x3cf, float:1.366E-42)
            X.23b r1 = new X.23b
            r1.<init>(r2, r0)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            X.1Cd r0 = r9.A02
            X.1at r14 = r0.get()
            monitor-enter(r9)     // Catch:{ all -> 0x01d5 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x01d2 }
            r7.<init>()     // Catch:{ all -> 0x01d2 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x01d2 }
            r12.<init>()     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x0067:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x01d2 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x01d2 }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01d2 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x01d2 }
            int r2 = r4.length     // Catch:{ all -> 0x01d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r1.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "\n            SELECT user_jid_row_id, device_jid_row_id, key_index\n            FROM user_device \n            WHERE user_jid_row_id IN \n        "
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r2)     // Catch:{ all -> 0x01d2 }
            r1.append(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "GET_DEVICE_JIDS_BY_USER_JIDS_SQL"
            android.database.Cursor r6 = r3.A0A(r1, r0, r4)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "user_jid_row_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "device_jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "key_index"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dc }
        L_0x00a7:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d8
            long r1 = r6.getLong(r5)     // Catch:{ all -> 0x00dc }
            long r17 = r6.getLong(r4)     // Catch:{ all -> 0x00dc }
            long r19 = r6.getLong(r3)     // Catch:{ all -> 0x00dc }
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00dc }
            r7.add(r0)     // Catch:{ all -> 0x00dc }
            X.1DL r11 = r9.A01     // Catch:{ all -> 0x00dc }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A0E(r0, r1)     // Catch:{ all -> 0x00dc }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00dc }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x00dc }
            X.2dv r15 = new X.2dv     // Catch:{ all -> 0x00dc }
            r16 = r0
            r15.<init>(r16, r17, r19)     // Catch:{ all -> 0x00dc }
            r12.add(r15)     // Catch:{ all -> 0x00dc }
            goto L_0x00a7
        L_0x00d8:
            r6.close()     // Catch:{ all -> 0x01d2 }
            goto L_0x0067
        L_0x00dc:
            r1 = move-exception
            if (r6 == 0) goto L_0x00e7
            r6.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01d2 }
        L_0x00e7:
            throw r1     // Catch:{ all -> 0x01d2 }
        L_0x00e8:
            X.1DL r1 = r9.A01     // Catch:{ all -> 0x01d2 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.HashMap r4 = r1.A0F(r0, r7)     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x00f4:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0157
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x01d2 }
            X.2dv r7 = (X.C54302dv) r7     // Catch:{ all -> 0x01d2 }
            com.whatsapp.jid.UserJid r6 = r7.A02     // Catch:{ all -> 0x01d2 }
            java.lang.Object r5 = r8.get(r6)     // Catch:{ all -> 0x01d2 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x01d2 }
            if (r5 != 0) goto L_0x0112
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x01d2 }
            r5.<init>()     // Catch:{ all -> 0x01d2 }
            r8.put(r6, r5)     // Catch:{ all -> 0x01d2 }
        L_0x0112:
            long r1 = r7.A00     // Catch:{ all -> 0x01d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.Object r3 = r4.get(r0)     // Catch:{ all -> 0x01d2 }
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3     // Catch:{ all -> 0x01d2 }
            if (r3 == 0) goto L_0x012a
            long r0 = r7.A01     // Catch:{ all -> 0x01d2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01d2 }
            r5.put(r3, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x00f4
        L_0x012a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d2 }
            r3.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "DeviceStore/getDeviceMapsForUsers/dangling device "
            r3.append(r0)     // Catch:{ all -> 0x01d2 }
            r3.append(r1)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = " for user "
            r3.append(r0)     // Catch:{ all -> 0x01d2 }
            r3.append(r6)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            X.190 r3 = r9.A00     // Catch:{ all -> 0x01d2 }
            java.lang.String r2 = "dangling-device"
            int r0 = r6.getType()     // Catch:{ all -> 0x01d2 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01d2 }
            r0 = 0
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x00f4
        L_0x0157:
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x015f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x01d2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01d2 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x01d2 }
            X.10x r3 = new X.10x     // Catch:{ all -> 0x01d2 }
            r3.<init>()     // Catch:{ all -> 0x01d2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01d2 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x01d2 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x0184:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x01d2 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x01d2 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x01d2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01d2 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x01d2 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0184
        L_0x01a0:
            X.10w r1 = r3.build()     // Catch:{ all -> 0x01d2 }
            X.1MM r0 = r9.A04     // Catch:{ all -> 0x01d2 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x01d2 }
            r0.put(r4, r1)     // Catch:{ all -> 0x01d2 }
            r10.put(r4, r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x015f
        L_0x01af:
            java.util.Iterator r2 = r22.iterator()     // Catch:{ all -> 0x01d2 }
        L_0x01b3:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01d2 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x01d2 }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x01b3
            X.10w r0 = X.C201110w.of()     // Catch:{ all -> 0x01d2 }
            r10.put(r1, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x01b3
        L_0x01cd:
            monitor-exit(r9)     // Catch:{ all -> 0x01d2 }
            r14.close()
            return r10
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01d2 }
            throw r0     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01da }
            throw r1
        L_0x01da:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ML.A01(java.util.Set):java.util.HashMap");
    }

    public static void A02(C28781at r3, AnonymousClass1ML r4, UserJid userJid) {
        C70733Ch r2 = new C70733Ch(r4, userJid, 22);
        C28801av r32 = (C28801av) r3;
        C17960vV.A0D(r32.A02.A00.inTransaction());
        C22561Ci r0 = r32.A01;
        C41861xB r1 = new C41861xB(r0, r2);
        Object obj = r0.A02.get();
        C17960vV.A07(obj);
        ((AbstractMap) obj).put(userJid, r1);
    }

    public Map A03(Set set) {
        if (!C18020vd.A05(C18040vf.A02, this.A05, 7088)) {
            return A01(set);
        }
        LinkedHashMap A012 = C60362nt.A01(this.A06, "user_device", set);
        HashMap A013 = A01(new HashSet(A012.values()));
        Set<Map.Entry> entrySet = A012.entrySet();
        int A032 = C200610r.A03(C29351c6.A0C(entrySet, 10));
        if (A032 < 16) {
            A032 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A032);
        for (Map.Entry entry : entrySet) {
            UserJid userJid = (UserJid) entry.getKey();
            Object obj = A013.get(entry.getValue());
            if (obj != null) {
                linkedHashMap.put(userJid, C60362nt.A00((C201110w) obj, userJid));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return linkedHashMap;
    }

    public void A04(C199410f r16, UserJid userJid) {
        C28791au A052;
        AnonymousClass1Cd r8 = this.A02;
        C28791au A053 = r8.A05();
        try {
            C41851xA BD0 = A053.BD0();
            try {
                AnonymousClass1IZ it = r16.iterator();
                while (true) {
                    UserJid userJid2 = userJid;
                    if (it.hasNext()) {
                        DeviceJid A042 = DeviceJid.Companion.A04(userJid2, ((DeviceJid) it.next()).getDevice());
                        boolean z = false;
                        if (A042 != null) {
                            z = true;
                        }
                        C17960vV.A0F(z, "DeviceJid must not be null");
                        if (A042 != null) {
                            AnonymousClass1DL r0 = this.A01;
                            long A09 = r0.A09(userJid2);
                            long A092 = r0.A09(A042);
                            A052 = r8.A05();
                            ((C28801av) A052).A02.A04("user_device", "user_jid_row_id= ? AND device_jid_row_id = ?", "DELETE_DEVICE_JID_SQL", new String[]{String.valueOf(A09), String.valueOf(A092)});
                            A052.close();
                        }
                    } else {
                        BD0.A00();
                        A02(A053, this, userJid2);
                        BD0.close();
                        A053.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public void A05(DeviceJid deviceJid, UserJid userJid, long j) {
        C28791au A052 = this.A02.A05();
        try {
            AnonymousClass1DL r0 = this.A01;
            long A09 = r0.A09(userJid);
            long A092 = r0.A09(deviceJid);
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("user_jid_row_id", Long.valueOf(A09));
            contentValues.put("device_jid_row_id", Long.valueOf(A092));
            contentValues.put("key_index", Long.valueOf(j));
            ((C28801av) A052).A02.A09("user_device", "INSERT_DEVICE_JID_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A06(UserJid userJid) {
        C28791au A052;
        AnonymousClass1Cd r1 = this.A02;
        C28791au A053 = r1.A05();
        try {
            C41851xA BD0 = A053.BD0();
            try {
                long A09 = this.A01.A09(userJid);
                A052 = r1.A05();
                ((C28801av) A052).A02.A04("user_device", "user_jid_row_id= ?", "DELETE_DEVICE_OF_USER_JID_SQL", new String[]{String.valueOf(A09)});
                A052.close();
                BD0.A00();
                A02(A053, this, userJid);
                BD0.close();
                A053.close();
                return;
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }
}
