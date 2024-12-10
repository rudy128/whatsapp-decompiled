package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1MR  reason: invalid class name */
public class AnonymousClass1MR {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final AnonymousClass1MQ A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass190 A05;

    public static C201110w A00(AnonymousClass1MR r5, boolean z) {
        Object obj;
        Object obj2;
        C201110w A002 = r5.A03.A04.A00();
        C201210x r3 = new C201210x();
        AnonymousClass1IZ it = A002.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r3.put(entry.getKey(), Long.valueOf((long) ((C88344Zh) entry.getValue()).A05));
        }
        AnonymousClass11S r1 = r5.A00;
        if (r1.A0N()) {
            if (z) {
                obj2 = r1.A08();
            } else {
                r1.A0I();
                obj2 = r1.A02;
            }
            r3.put(obj2, Long.valueOf((long) r5.A02.A02()));
        } else {
            if (z) {
                obj = r1.A08();
            } else {
                r1.A0I();
                obj = r1.A02;
            }
            r3.put(obj, 0L);
        }
        return r3.build();
    }

    public C199410f A02() {
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        if (r0.A0E == null) {
            return C199410f.of();
        }
        return this.A03.A04().keySet();
    }

    public C62512rW A03() {
        C19830z4 r0 = this.A02;
        int A032 = r0.A03();
        AnonymousClass00H r4 = r0.A00;
        return new C62512rW(AnonymousClass2RD.E2EE, A032, ((SharedPreferences) r4.get()).getLong("adv_timestamp_sec", -1), ((SharedPreferences) r4.get()).getLong("adv_expected_timestamp_sec_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_last_device_job_ts_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_update_ts_in_companion_mode", 0));
    }

    public C62512rW A04(C62512rW r15, long j) {
        long j2 = r15.A05;
        long j3 = j;
        if (j2 < j) {
            long j4 = r15.A02;
            if (j4 < j) {
                long j5 = ((SharedPreferences) this.A02.A00.get()).getLong("adv_last_device_job_ts", 0);
                long j6 = r15.A03;
                if (j2 >= j4) {
                    j6 = this.A01.A07();
                }
                return new C62512rW(r15.A01, r15.A00, j2, j3, j5, j6);
            }
        }
        return r15;
    }

    public C62512rW A05(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        if (this.A00.A0O(userJid)) {
            return A03();
        }
        AnonymousClass1MQ r2 = this.A03;
        C17960vV.A0H(!r2.A00.A0O(userJid), "only query info for others");
        return r2.A02.A03(userJid);
    }

    public AnonymousClass2RD A06(UserJid userJid) {
        C17960vV.A0H(!this.A00.A0O(userJid), "use HostedCompanionDeviceManager to get self state");
        C62512rW A052 = A05(userJid);
        if (A052 == null || A052.A00 != 1) {
            return AnonymousClass2RD.E2EE;
        }
        return AnonymousClass2RD.HOSTED;
    }

    public HashMap A07(Set set) {
        HashSet hashSet;
        DeviceJid deviceJid;
        HashMap hashMap = new HashMap();
        HashSet hashSet2 = new HashSet(set);
        AnonymousClass11S r6 = this.A00;
        r6.A0I();
        PhoneUserJid phoneUserJid = r6.A0E;
        AnonymousClass1E2 A09 = r6.A09();
        if (set.contains(phoneUserJid)) {
            HashSet A092 = A09();
            r6.A0I();
            AnonymousClass1E3 r0 = r6.A02;
            C17960vV.A07(r0);
            A092.add(r0);
            hashMap.put(phoneUserJid, A092);
            hashSet2.remove(phoneUserJid);
        }
        if (set.contains(A09)) {
            HashSet A08 = A08();
            C42521yJ A082 = r6.A08();
            C17960vV.A07(A082);
            A08.add(A082);
            hashMap.put(A09, A08);
            hashSet2.remove(A09);
        }
        AnonymousClass1ML r02 = this.A03.A05;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : r02.A03(hashSet2).entrySet()) {
            hashMap2.put(entry.getKey(), ((C201110w) entry.getValue()).keySet());
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (hashMap2.containsKey(userJid)) {
                Object obj = hashMap2.get(userJid);
                C17960vV.A07(obj);
                hashSet = new HashSet((Collection) obj);
            } else {
                hashSet = new HashSet();
            }
            AnonymousClass1E0 r03 = DeviceJid.Companion;
            if (userJid != null) {
                deviceJid = userJid.getPrimaryDevice();
            } else {
                deviceJid = null;
            }
            C17960vV.A07(deviceJid);
            hashSet.add(deviceJid);
            hashMap.put(userJid, hashSet);
        }
        return hashMap;
    }

    public HashSet A08() {
        Object r0;
        HashSet hashSet = new HashSet();
        AnonymousClass1E2 A09 = this.A00.A09();
        if (A09 != null) {
            AnonymousClass1IZ it = A02().iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                if (C22971Dz.A0Y(deviceJid.userJid)) {
                    try {
                        int device = deviceJid.getDevice();
                        if (device == 99) {
                            r0 = new C47732Jq(A09, device);
                        } else {
                            r0 = new C42521yJ(A09, device);
                        }
                        hashSet.add(r0);
                    } catch (AnonymousClass11T e) {
                        Log.w("Failed to map to LID companion", e);
                    }
                }
            }
        }
        return hashSet;
    }

    public HashSet A09() {
        HashSet hashSet = new HashSet();
        AnonymousClass1IZ it = A02().iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (C22971Dz.A0Y(deviceJid.userJid)) {
                hashSet.add(deviceJid);
            }
        }
        return hashSet;
    }

    public HashSet A0A(UserJid userJid) {
        HashSet A08;
        Object A082;
        AnonymousClass11S r2 = this.A00;
        r2.A0I();
        if (userJid.equals(r2.A0E)) {
            A08 = A09();
            r2.A0I();
            A082 = r2.A02;
        } else if (userJid.equals(r2.A09())) {
            A08 = A08();
            A082 = r2.A08();
        } else {
            HashSet hashSet = new HashSet(this.A03.A05(userJid).keySet());
            AnonymousClass1E0 r0 = DeviceJid.Companion;
            DeviceJid primaryDevice = userJid.getPrimaryDevice();
            C17960vV.A07(primaryDevice);
            hashSet.add(primaryDevice);
            return hashSet;
        }
        C17960vV.A07(A082);
        A08.add(A082);
        return A08;
    }

    public Map A0B(UserJid userJid) {
        if (this.A00.A0O(userJid)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(this.A03.A05(userJid));
        DeviceJid primaryDevice = userJid.getPrimaryDevice();
        C17960vV.A07(primaryDevice);
        hashMap.put(primaryDevice, 0L);
        return hashMap;
    }

    public void A0C(C199410f r5, UserJid userJid) {
        HashSet hashSet = new HashSet(r5);
        AnonymousClass1MQ r2 = this.A03;
        hashSet.retainAll(r2.A05(userJid).keySet());
        if (!hashSet.isEmpty()) {
            r2.A09(C199410f.copyOf((Collection) hashSet), userJid, (String) null);
            if (!hashSet.isEmpty()) {
                ((AnonymousClass2LS) this.A04.get()).A00(userJid, Collections.emptySet(), hashSet);
            }
        }
    }

    public void A0D(C62512rW r8, UserJid userJid) {
        C41851xA BD0;
        AnonymousClass11S r1 = this.A00;
        if (r1.A0O(userJid)) {
            C17960vV.A0C(r1.A0N());
            C19830z4 r4 = this.A02;
            C19830z4.A00(r4).putInt("adv_raw_id", r8.A01).apply();
            C19830z4.A00(r4).putLong("adv_timestamp_sec", r8.A05).apply();
            C19830z4.A00(r4).putLong("adv_expected_timestamp_sec_in_companion_mode", r8.A02).apply();
            C19830z4.A00(r4).putLong("adv_expected_ts_last_device_job_ts_in_companion_mode", r8.A04).apply();
            C19830z4.A00(r4).putLong("adv_expected_ts_update_ts_in_companion_mode", r8.A03).apply();
            return;
        }
        AnonymousClass1MQ r6 = this.A03;
        Set A0M = r6.A03.A0M(userJid);
        C28791au A052 = r6.A01.A05();
        try {
            BD0 = A052.BD0();
            Iterator it = A0M.iterator();
            while (true) {
                if (!it.hasNext()) {
                    BD0.A00();
                    break;
                }
                UserJid userJid2 = (UserJid) it.next();
                AnonymousClass1MN r12 = r6.A02;
                if (AnonymousClass1MQ.A03(A052, r12.A03(userJid2), r8, r6, userJid2)) {
                    r12.A05(r8, userJid2);
                }
            }
            BD0.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0E(UserJid userJid, String str) {
        C17960vV.A0D(!this.A00.A0O(userJid));
        AnonymousClass1MQ r3 = this.A03;
        HashSet hashSet = new HashSet(r3.A05(userJid).keySet());
        hashSet.remove(userJid.getPrimaryDevice());
        HashSet hashSet2 = new HashSet(r3.A05(userJid).keySet());
        hashSet2.remove(userJid.getPrimaryDevice());
        r3.A09(C199410f.copyOf((Collection) hashSet2), userJid, str);
        if (!hashSet.isEmpty()) {
            ((AnonymousClass2LS) this.A04.get()).A00(userJid, Collections.emptySet(), hashSet);
        }
    }

    public void A0F(UserJid userJid, HashMap hashMap) {
        String str;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((DeviceJid) entry.getKey()).userJid.equals(userJid)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2.size() > 0) {
            AnonymousClass190 r3 = this.A05;
            StringBuilder sb = new StringBuilder();
            sb.append("userJid=");
            sb.append(userJid);
            sb.append("; deviceJids=");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                sb2.append(",");
                sb2.append(entry2.getKey());
                sb2.append(":");
                sb2.append(entry2.getValue());
            }
            if (sb2.length() > 0) {
                str = sb2.substring(1);
            } else {
                str = "no-data-found";
            }
            sb.append(str);
            r3.A0G("userdevicemanager/invalid_devices", sb.toString(), false);
            for (Object remove : hashMap2.keySet()) {
                hashMap.remove(remove);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        if (r0.isEmpty() == false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(X.C201110w r31, X.C62512rW r32, com.whatsapp.jid.UserJid r33, boolean r34) {
        /*
            r30 = this;
            r7 = r30
            X.11S r0 = r7.A00
            r8 = r33
            boolean r0 = r0.A0O(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "cannot refresh yourself device"
            X.C17960vV.A0H(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r31
            r0.<init>(r1)
            r7.A0F(r8, r0)
            X.10w r6 = X.C201110w.copyOf((java.util.Map) r0)
            X.1MQ r5 = r7.A03
            X.10w r22 = r5.A05(r8)
            X.10f r0 = r6.keySet()
            boolean r0 = X.C62832s4.A02(r0)
            r1 = 1
            r9 = r32
            if (r0 == 0) goto L_0x0038
            if (r32 == 0) goto L_0x020e
            int r0 = r9.A00
            if (r0 != r1) goto L_0x020e
        L_0x0038:
            X.11S r0 = r5.A00
            boolean r0 = r0.A0O(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "only refresh devices for others"
            X.C17960vV.A0H(r1, r0)
            X.10f r1 = r6.keySet()
            com.whatsapp.jid.DeviceJid r0 = r8.getPrimaryDevice()
            boolean r1 = r1.contains(r0)
            java.lang.String r0 = "device list should always include primary."
            X.C17960vV.A0H(r1, r0)
            X.1Ln r0 = r5.A03
            java.util.Set r21 = r0.A0M(r8)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x0065:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.2fX r0 = new X.2fX
            r0.<init>(r6, r5, r1)
            r4.put(r1, r0)
            goto L_0x0065
        L_0x007a:
            X.1Cd r0 = r5.A01
            X.1au r3 = r0.A05()
            X.1xA r20 = r3.BD0()     // Catch:{ all -> 0x0204 }
            java.util.Iterator r19 = r21.iterator()     // Catch:{ all -> 0x01fa }
        L_0x0088:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r2 = r19.next()     // Catch:{ all -> 0x01fa }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x01fa }
            java.lang.Object r10 = r4.get(r2)     // Catch:{ all -> 0x01fa }
            X.2fX r10 = (X.C55292fX) r10     // Catch:{ all -> 0x01fa }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x01fa }
            X.10f r0 = r10.A02     // Catch:{ all -> 0x01fa }
            r24 = r0
            boolean r0 = r24.isEmpty()     // Catch:{ all -> 0x01fa }
            r28 = r34
            if (r0 == 0) goto L_0x00b1
            X.10f r0 = r10.A03     // Catch:{ all -> 0x01fa }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r1 != 0) goto L_0x014e
        L_0x00b1:
            X.1ML r12 = r5.A05     // Catch:{ all -> 0x01fa }
            X.10w r0 = r10.A01     // Catch:{ all -> 0x01fa }
            r23 = r0
            X.1Cd r0 = r12.A02     // Catch:{ all -> 0x01fa }
            X.1au r11 = r0.A05()     // Catch:{ all -> 0x01fa }
            X.1xA r18 = r11.BD0()     // Catch:{ all -> 0x018a }
            X.1DL r0 = r12.A01     // Catch:{ all -> 0x0180 }
            long r16 = r0.A09(r2)     // Catch:{ all -> 0x0180 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0180 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r14 = "user_device"
            java.lang.String r13 = "user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0180 }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0180 }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "DELETE_USER_DEVICE_JIDS_SQL"
            r15.A04(r14, r13, r0, r1)     // Catch:{ all -> 0x0180 }
            X.10f r0 = r23.entrySet()     // Catch:{ all -> 0x0180 }
            X.1IZ r15 = r0.iterator()     // Catch:{ all -> 0x0180 }
        L_0x00e9:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0180 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x0180 }
            java.lang.Object r0 = r14.getKey()     // Catch:{ all -> 0x0180 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ all -> 0x0180 }
            int r1 = r0.getDevice()     // Catch:{ all -> 0x0180 }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x0180 }
            com.whatsapp.jid.DeviceJid r13 = r0.A04(r2, r1)     // Catch:{ all -> 0x0180 }
            r1 = 0
            if (r13 == 0) goto L_0x0109
            r1 = 1
        L_0x0109:
            java.lang.String r0 = "DeviceJid must not be null"
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x0180 }
            if (r13 == 0) goto L_0x00e9
            java.lang.Object r0 = r14.getValue()     // Catch:{ all -> 0x0180 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0180 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0180 }
            r12.A05(r13, r2, r0)     // Catch:{ all -> 0x0180 }
            goto L_0x00e9
        L_0x011e:
            r18.A00()     // Catch:{ all -> 0x0180 }
            X.AnonymousClass1ML.A02(r11, r12, r2)     // Catch:{ all -> 0x0180 }
            r18.close()     // Catch:{ all -> 0x018a }
            r11.close()     // Catch:{ all -> 0x01fa }
            if (r32 == 0) goto L_0x013b
            X.1MN r1 = r5.A02     // Catch:{ all -> 0x01fa }
            X.2rW r0 = r1.A03(r2)     // Catch:{ all -> 0x01fa }
            boolean r0 = X.AnonymousClass1MQ.A03(r3, r0, r9, r5, r2)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0194
            r1.A05(r9, r2)     // Catch:{ all -> 0x01fa }
        L_0x013b:
            X.10w r0 = r10.A00     // Catch:{ all -> 0x01fa }
            X.10f r23 = r0.keySet()     // Catch:{ all -> 0x01fa }
            X.10f r0 = r10.A03     // Catch:{ all -> 0x01fa }
            r29 = 0
            r25 = r0
            r26 = r5
            r27 = r2
            X.AnonymousClass1MQ.A02(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01fa }
        L_0x014e:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x0088
            boolean r1 = r24.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x0088
            if (r34 == 0) goto L_0x016d
            X.10w r1 = r10.A00     // Catch:{ all -> 0x01fa }
            X.10f r10 = r1.keySet()     // Catch:{ all -> 0x01fa }
            r15 = 1
            r16 = 0
            r11 = r24
            r12 = r0
            r13 = r5
            r14 = r2
            X.AnonymousClass1MQ.A02(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01fa }
        L_0x016d:
            if (r32 == 0) goto L_0x0088
            X.1MN r1 = r5.A02     // Catch:{ all -> 0x01fa }
            X.2rW r0 = r1.A03(r2)     // Catch:{ all -> 0x01fa }
            boolean r0 = X.AnonymousClass1MQ.A03(r3, r0, r9, r5, r2)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0194
            r1.A05(r9, r2)     // Catch:{ all -> 0x01fa }
            goto L_0x0088
        L_0x0180:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0185 }
            goto L_0x0189
        L_0x0185:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x018a }
        L_0x0189:
            throw r1     // Catch:{ all -> 0x018a }
        L_0x018a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x018f }
            goto L_0x0193
        L_0x018f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01fa }
        L_0x0193:
            throw r1     // Catch:{ all -> 0x01fa }
        L_0x0194:
            r20.close()     // Catch:{ all -> 0x0204 }
            goto L_0x01c8
        L_0x0198:
            r20.A00()     // Catch:{ all -> 0x01fa }
            r20.close()     // Catch:{ all -> 0x0204 }
            r3.close()
            java.util.Iterator r10 = r21.iterator()
        L_0x01a5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r9 = r10.next()
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.Object r3 = r4.get(r9)
            X.C17960vV.A07(r3)
            X.2fX r3 = (X.C55292fX) r3
            X.10w r0 = r3.A00
            X.10f r2 = r0.keySet()
            X.10f r1 = r3.A02
            X.10f r0 = r3.A03
            X.AnonymousClass1MQ.A01(r2, r1, r0, r5, r9)
            goto L_0x01a5
        L_0x01c8:
            r3.close()
        L_0x01cb:
            r0 = r22
            X.10f r0 = X.C63442t5.A01(r6, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r0 = r22
            X.10f r0 = X.C63442t5.A02(r6, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.00H r0 = r7.A04
            java.lang.Object r0 = r0.get()
            X.2LS r0 = (X.AnonymousClass2LS) r0
            r0.A00(r8, r2, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01f8
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0213
        L_0x01f8:
            r0 = 1
            return r0
        L_0x01fa:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x01ff }
            goto L_0x0203
        L_0x01ff:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0204 }
        L_0x0203:
            throw r1     // Catch:{ all -> 0x0204 }
        L_0x0204:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0209 }
            throw r1
        L_0x0209:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x020e:
            java.lang.String r0 = "DeviceManager/refreshDevicesForUser cannot add hosted device with adv e2ee"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0213:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MR.A0G(X.10w, X.2rW, com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public AnonymousClass1MR(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass1MQ r5, AnonymousClass00H r6) {
        this.A01 = r3;
        this.A05 = r1;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }

    public long A01(UserJid userJid) {
        C62512rW A052 = A05(userJid);
        if (A052 == null) {
            return 0;
        }
        return A052.A05;
    }

    public boolean A0H(UserJid userJid, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(A0A(userJid));
        return C63442t5.A03(hashSet).equals(str);
    }
}
