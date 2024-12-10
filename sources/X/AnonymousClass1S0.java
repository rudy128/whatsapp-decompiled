package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1S0  reason: invalid class name */
public class AnonymousClass1S0 {
    public final AnonymousClass11S A00;
    public final AnonymousClass18O A01;
    public final C25001Mm A02;
    public final C26371Rw A03;
    public final AnonymousClass11P A04;
    public final C19830z4 A05;
    public final C25551Oq A06;
    public final C26381Rx A07;
    public final C26391Ry A08;
    public final C26321Rr A09;
    public final C26401Rz A0A;
    public final AnonymousClass1PP A0B;

    public AnonymousClass1S0(AnonymousClass11S r2, AnonymousClass18O r3, C25001Mm r4, C26371Rw r5, AnonymousClass11P r6, C19830z4 r7, C25551Oq r8, C26381Rx r9, C26391Ry r10, C26321Rr r11, C26401Rz r12, AnonymousClass1PP r13) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r5, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r7, 11);
        C18070vi.A0d(r12, 12);
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = r10;
        this.A0B = r13;
        this.A05 = r7;
        this.A0A = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59062lh A05() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.A0B()     // Catch:{ all -> 0x00ab }
            r8 = 0
            if (r0 != 0) goto L_0x00a9
            X.1Rr r0 = r9.A09     // Catch:{ all -> 0x00ab }
            int r0 = r0.A01()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x001b
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            r0 = 65536(0x10000, float:9.18355E-41)
            int r0 = r1.nextInt(r0)     // Catch:{ all -> 0x00ab }
        L_0x001b:
            int r1 = r0 + 1
            X.11S r0 = r9.A00     // Catch:{ all -> 0x00ab }
            int r0 = r0.A06()     // Catch:{ all -> 0x00ab }
            X.A2n r7 = new X.A2n     // Catch:{ all -> 0x00ab }
            r7.<init>(r0, r1)     // Catch:{ all -> 0x00ab }
            r0 = 32
            byte[] r6 = X.C17970vW.A0I(r0)     // Catch:{ all -> 0x00ab }
            X.11P r0 = r9.A04     // Catch:{ all -> 0x00ab }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00ab }
            X.0z4 r0 = r9.A05     // Catch:{ all -> 0x00ab }
            int r5 = r0.A03()     // Catch:{ all -> 0x00ab }
            int r4 = r0.A02()     // Catch:{ all -> 0x00ab }
            java.util.HashSet r0 = r9.A01()     // Catch:{ all -> 0x00ab }
            X.9uE r1 = new X.9uE     // Catch:{ all -> 0x00ab }
            r1.<init>(r0, r5, r4)     // Catch:{ all -> 0x00ab }
            X.2mC r0 = new X.2mC     // Catch:{ all -> 0x00ab }
            r0.<init>(r1, r6, r2)     // Catch:{ all -> 0x00ab }
            X.2lh r4 = new X.2lh     // Catch:{ all -> 0x00ab }
            r4.<init>(r0, r7)     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r1.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "SyncdKeyManager/generateAndShareNewKey syncdKey = "
            r1.append(r0)     // Catch:{ all -> 0x00ab }
            r1.append(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ab }
            X.1Rx r0 = r9.A07     // Catch:{ all -> 0x00ab }
            java.util.Collection r1 = r0.A00()     // Catch:{ all -> 0x00ab }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0083
            A02(r9)     // Catch:{ all -> 0x00ab }
            java.util.Set r0 = java.util.Collections.singleton(r4)     // Catch:{ all -> 0x00ab }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00ab }
            r9.A0A(r0)     // Catch:{ all -> 0x00ab }
            monitor-exit(r9)
            return r4
        L_0x0083:
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x00ab }
        L_0x0087:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00ab }
            X.4Zh r0 = (X.C88344Zh) r0     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0087
            com.whatsapp.jid.DeviceJid r2 = r0.A08     // Catch:{ all -> 0x00ab }
            if (r2 == 0) goto L_0x0087
            X.A2n r1 = r4.A01     // Catch:{ all -> 0x00ab }
            X.1D6 r0 = new X.1D6     // Catch:{ all -> 0x00ab }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x00ab }
            java.util.Map r1 = X.C200610r.A04(r0)     // Catch:{ all -> 0x00ab }
            r0 = 1
            r9.A09(r2, r1, r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0087
        L_0x00a9:
            monitor-exit(r9)
            return r8
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S0.A05():X.2lh");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.23F, X.231, X.206] */
    public final void A09(DeviceJid deviceJid, Map map, boolean z) {
        C59372mC r9;
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        if (phoneUserJid != null && !map.isEmpty()) {
            AnonymousClass1PP r2 = this.A0B;
            long A012 = AnonymousClass11P.A01(this.A04);
            HashMap hashMap = new HashMap(map);
            ? r5 = new AnonymousClass206(r2.A01(phoneUserJid, true), 38, A012);
            r5.A01 = false;
            r5.A00 = deviceJid;
            C23624Bmt A0N = AnonymousClass2B3.DEFAULT_INSTANCE.A0N();
            for (Map.Entry entry : hashMap.entrySet()) {
                C19999A2n a2n = (C19999A2n) entry.getKey();
                C59062lh r02 = (C59062lh) entry.getValue();
                if (r02 != null) {
                    r9 = r02.A00;
                } else {
                    r9 = null;
                }
                C18070vi.A0d(a2n, 0);
                C23624Bmt A0N2 = AnonymousClass2B5.DEFAULT_INSTANCE.A0N();
                AnonymousClass8XX A013 = a2n.A01();
                A0N2.A0E();
                AnonymousClass2B5 r1 = (AnonymousClass2B5) A0N2.A00;
                A013.getClass();
                r1.keyId_ = A013;
                r1.bitField0_ |= 1;
                if (r9 != null) {
                    C23624Bmt A0N3 = AnonymousClass2BF.DEFAULT_INSTANCE.A0N();
                    byte[] bArr = r9.A02;
                    C23581BmB A014 = DSQ.A01(bArr, 0, bArr.length);
                    A0N3.A0E();
                    AnonymousClass2BF r12 = (AnonymousClass2BF) A0N3.A00;
                    r12.bitField0_ |= 1;
                    r12.keyData_ = A014;
                    long j = r9.A00;
                    A0N3.A0E();
                    AnonymousClass2BF r8 = (AnonymousClass2BF) A0N3.A00;
                    r8.bitField0_ |= 4;
                    r8.timestamp_ = j;
                    C165148af A002 = r9.A01.A00();
                    A0N3.A0E();
                    AnonymousClass2BF r13 = (AnonymousClass2BF) A0N3.A00;
                    A002.getClass();
                    r13.fingerprint_ = A002;
                    r13.bitField0_ |= 2;
                    AnonymousClass2BF r03 = (AnonymousClass2BF) A0N3.A0C();
                    A0N2.A0E();
                    AnonymousClass2B5 r14 = (AnonymousClass2B5) A0N2.A00;
                    r03.getClass();
                    r14.keyData_ = r03;
                    r14.bitField0_ |= 2;
                }
                C23577Bm6 A0C = A0N2.A0C();
                A0N.A0E();
                AnonymousClass2B3 r22 = (AnonymousClass2B3) A0N.A00;
                A0C.getClass();
                EE9 ee9 = r22.keys_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r22.keys_ = ee9;
                }
                ee9.add(A0C);
            }
            r5.A00 = (AnonymousClass2B3) A0N.A0C();
            r5.A01 = z;
            if (this.A08.A01(r5) < 0) {
                Log.e("SyncdKeyManager/shareKeys unable to add peer message");
            } else {
                this.A02.A01(new SendPeerMessageJob(deviceJid, r5));
            }
        }
    }

    public final boolean A0C(C59372mC r8) {
        String str;
        C195959uE r5 = r8.A01;
        int i = r5.A01;
        C19830z4 r1 = this.A05;
        if (i != r1.A03()) {
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: rawId did not match";
        } else {
            int A022 = r1.A02();
            Set A11 = C29431cG.A11(r5.A02);
            int i2 = r5.A00 + 1;
            if (i2 <= A022) {
                while (true) {
                    A11.add(Integer.valueOf(i2));
                    if (i2 == A022) {
                        break;
                    }
                    i2++;
                }
            }
            if (C18070vi.A18(A01(), A11)) {
                return true;
            }
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: one of a peer device is no longer registered";
        }
        Log.i(str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A00(X.AnonymousClass1S0 r9, java.util.Set r10) {
        /*
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r8 = r10.iterator()
        L_0x0009:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r4 = r8.next()
            X.A2n r4 = (X.C19999A2n) r4
            if (r4 != 0) goto L_0x0020
            r4 = 0
            X.2lh r1 = r9.A04()
        L_0x001c:
            r5.put(r4, r1)
            goto L_0x0009
        L_0x0020:
            X.1Rr r0 = r9.A09
            r1 = 0
            X.1Oq r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006a }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x006a }
            java.lang.String r6 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info WHERE device_id = ?  AND epoch = ? "
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006a }
            int r0 = r4.A00()     // Catch:{ all -> 0x006a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006a }
            r2[r1] = r0     // Catch:{ all -> 0x006a }
            byte[] r1 = r4.A00     // Catch:{ all -> 0x006a }
            r0 = 2
            int r0 = X.A8G.A01(r1, r0)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006a }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_KEY_WITH_ID"
            android.database.Cursor r2 = r7.A0A(r6, r0, r2)     // Catch:{ all -> 0x006a }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0063 }
            r1 = 0
            if (r0 == 0) goto L_0x005c
            X.2lh r1 = X.C26321Rr.A00(r2)     // Catch:{ all -> 0x0063 }
        L_0x005c:
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()
            goto L_0x001c
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0071:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S0.A00(X.1S0, java.util.Set):java.util.HashMap");
    }

    private final HashSet A01() {
        HashSet hashSet = new HashSet();
        Collection<C88344Zh> A002 = this.A07.A00();
        C18070vi.A0X(A002);
        for (C88344Zh r0 : A002) {
            if (r0 != null) {
                hashSet.add(Integer.valueOf(r0.A05));
            }
        }
        hashSet.add(Integer.valueOf(this.A00.A06()));
        return hashSet;
    }

    public static final void A02(AnonymousClass1S0 r4) {
        int i;
        C59062lh A022 = r4.A09.A02();
        if (A022 == null) {
            i = 3;
        } else {
            i = 1;
            if (!r4.A0C(A022.A00)) {
                i = 2;
            }
        }
        C26371Rw r2 = r4.A03;
        C46432En r1 = new C46432En();
        r1.A00 = Integer.valueOf(i);
        r2.A08.CC7(r1);
    }

    public static final boolean A03(AnonymousClass1S0 r4) {
        LinkedHashSet A002 = r4.A0A.A00();
        if (!(!A002.isEmpty()) || !r4.A06().isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdKeyManager/isKeyMissingOnAllClients: key(s) missing on all the clients for collection(s): ");
        sb.append(A002);
        Log.e(sb.toString());
        return true;
    }

    public C59062lh A04() {
        C59062lh A022 = this.A09.A02();
        if (A022 != null) {
            long A032 = C21348Aid.A03(C196999vz.A00(C179589Io.DAYS, this.A01.A04(AnonymousClass18O.A0z)));
            long A012 = AnonymousClass11P.A01(this.A04);
            C59372mC r2 = A022.A00;
            if (A012 - r2.A00 > A032 || !A0C(r2)) {
                return null;
            }
            return A022;
        }
        return null;
    }

    public final HashSet A06() {
        ArrayList A042 = this.A08.A04(39);
        HashSet hashSet = new HashSet();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            hashSet.addAll(Collections.unmodifiableSet(((AnonymousClass23D) it.next()).A00));
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b0, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedHashMap A07(java.lang.String r22, java.util.Collection r23) {
        /*
            r21 = this;
            r5 = r21
            X.1Rr r3 = r5.A09
            java.util.List r0 = X.C29431cG.A0q(r23)
            java.util.Set r2 = X.C29431cG.A12(r0)
            r0 = 0
            r3.A03(r2, r0)
            java.util.Set r0 = X.C29431cG.A12(r23)
            java.util.HashMap r0 = A00(r5, r0)
            java.util.LinkedHashMap r3 = X.AnonymousClass1D7.A08(r0)
            java.util.Collection r0 = r3.values()
            r13 = 0
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x01d0
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0035
            r8.add(r1)
            goto L_0x0035
        L_0x0051:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdKeyManager/requestMissingKeys syncdKeyIds="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r0 = r5.A00
            r0.A0I()
            com.whatsapp.jid.PhoneUserJid r6 = r0.A0E
            if (r6 == 0) goto L_0x011f
            boolean r0 = r8.isEmpty()
            r4 = 1
            if (r0 != 0) goto L_0x011f
            java.util.HashSet r0 = r5.A06()
            java.util.Set r2 = X.C29431cG.A11(r8)
            r2.removeAll(r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x011f
            X.1Rx r0 = r5.A07
            java.util.Collection r0 = r0.A00()
            X.C18070vi.A0X(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x009b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r9 = r12.next()
            X.4Zh r9 = (X.C88344Zh) r9
            X.1PP r7 = r5.A0B
            X.11P r0 = r5.A04
            long r0 = X.AnonymousClass11P.A01(r0)
            com.whatsapp.jid.DeviceJid r11 = r9.A08
            X.205 r7 = r7.A01(r6, r4)
            X.23D r10 = new X.23D
            r10.<init>(r7, r0)
            r10.A00 = r11
            java.util.Set r0 = r10.A00
            r0.clear()
            r0.addAll(r2)
            X.1Ry r0 = r5.A08
            long r0 = r0.A01(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = "SyncdKeyManager/requestMissingKeys to add peer message, rowId="
            r9.append(r7)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Oq r0 = r5.A06
            X.1au r7 = r0.A06()
            com.whatsapp.jobqueue.job.SendPeerMessageJob r9 = new com.whatsapp.jobqueue.job.SendPeerMessageJob     // Catch:{ all -> 0x010a }
            r9.<init>(r11, r10)     // Catch:{ all -> 0x010a }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x010a }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x010a }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x010a }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0101
            r1 = 11
            X.3Bv r0 = new X.3Bv     // Catch:{ all -> 0x010a }
            r0.<init>(r5, r9, r1)     // Catch:{ all -> 0x010a }
            r7.BJ7(r0)     // Catch:{ all -> 0x010a }
            goto L_0x0106
        L_0x0101:
            X.1Mm r0 = r5.A02     // Catch:{ all -> 0x010a }
            r0.A01(r9)     // Catch:{ all -> 0x010a }
        L_0x0106:
            r7.close()
            goto L_0x009b
        L_0x010a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        L_0x0111:
            X.1Rw r1 = r5.A03
            int r0 = r2.size()
            X.1Pw r4 = r1.A03
            java.lang.String r2 = "missing_key_counter"
            long r0 = (long) r0
            r4.A06(r2, r0)
        L_0x011f:
            X.1Rz r0 = r5.A0A
            X.1Oq r0 = r0.A00
            X.1au r2 = r0.A06()
            X.1xA r4 = r2.BD0()     // Catch:{ all -> 0x01ad }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01a6 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x01a6 }
            java.lang.String r1 = "INSERT OR REPLACE INTO missing_keys (device_id, epoch, collection_name) VALUES (?, ?, ?)"
            java.lang.String r0 = "SyncdMissingKeysTable.INSERT_OR_REPLACE"
            X.2nI r7 = r6.A0D(r1, r0)     // Catch:{ all -> 0x01a6 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x01a6 }
        L_0x013c:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01a6 }
            r15 = r22
            if (r0 == 0) goto L_0x0186
            java.lang.Object r6 = r12.next()     // Catch:{ all -> 0x01a6 }
            X.A2n r6 = (X.C19999A2n) r6     // Catch:{ all -> 0x01a6 }
            android.database.sqlite.SQLiteStatement r9 = r7.A00     // Catch:{ all -> 0x01a6 }
            r9.clearBindings()     // Catch:{ all -> 0x01a6 }
            int r0 = r6.A00()     // Catch:{ all -> 0x01a6 }
            long r0 = (long) r0     // Catch:{ all -> 0x01a6 }
            r8 = 1
            r9.bindLong(r8, r0)     // Catch:{ all -> 0x01a6 }
            byte[] r0 = r6.A00     // Catch:{ all -> 0x01a6 }
            r8 = 2
            int r0 = X.A8G.A01(r0, r8)     // Catch:{ all -> 0x01a6 }
            long r0 = (long) r0     // Catch:{ all -> 0x01a6 }
            r9.bindLong(r8, r0)     // Catch:{ all -> 0x01a6 }
            r0 = 3
            r9.bindString(r0, r15)     // Catch:{ all -> 0x01a6 }
            long r10 = r7.A01()     // Catch:{ all -> 0x01a6 }
            r8 = -1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r1.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = "SyncdMissingKeyStore/storeMissingKeys failed to store missing key: "
            r1.append(r0)     // Catch:{ all -> 0x01a6 }
            r1.append(r6)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a6 }
            goto L_0x013c
        L_0x0186:
            r4.A00()     // Catch:{ all -> 0x01a6 }
            r4.close()     // Catch:{ all -> 0x01ad }
            r2.close()
            boolean r0 = A03(r5)
            if (r0 == 0) goto L_0x01d0
            r20 = 71
            X.1Tq r12 = new X.1Tq
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r14 = r13
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            throw r12
        L_0x01a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x01ad }
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x01b4:
            boolean r0 = r3.containsKey(r13)
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r3.get(r13)
            if (r0 != 0) goto L_0x01c8
            X.2lh r0 = r5.A05()
            r3.put(r13, r0)
            return r3
        L_0x01c8:
            java.lang.String r0 = "SyncdKeyManager/resolveKeys: either there are missing keys or active key is missing"
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r0)
            throw r12
        L_0x01d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S0.A07(java.lang.String, java.util.Collection):java.util.LinkedHashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(int r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdKeyManager/expireKeysWithEpochIfActive expiredKeyEpoch = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rr r2 = r8.A09
            X.2lh r0 = r2.A02()
            if (r0 == 0) goto L_0x005e
            X.A2n r7 = r0.A01
            byte[] r6 = r7.A00
            r0 = 2
            int r0 = X.A8G.A01(r6, r0)
            if (r0 > r9) goto L_0x005e
            r1 = 0
            X.1Oq r0 = r2.A00
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0057 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "UPDATE crypto_info SET timestamp = 0  WHERE device_id = ?  AND epoch = ? "
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0057 }
            int r0 = r7.A00()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0057 }
            r2[r1] = r0     // Catch:{ all -> 0x0057 }
            r0 = 2
            int r0 = X.A8G.A01(r6, r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0057 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "SyncdCryptoInfoTable.EXPIRE_BY_KEY_ID"
            r4.A0F(r3, r0, r2)     // Catch:{ all -> 0x0057 }
            r5.close()
            return
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S0.A08(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.Set r11) {
        /*
            r10 = this;
            X.1Rr r0 = r10.A09
            X.1Oq r0 = r0.A00
            X.1au r3 = r0.A06()
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x0090 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0089 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "INSERT OR IGNORE INTO crypto_info (device_id, epoch, key_data, timestamp, fingerprint) VALUES (?, ?, ?, ?, ?)"
            java.lang.String r0 = "SyncdCryptoInfoTable.INSERT_OR_IGNORE"
            X.2nI r5 = r2.A0D(r1, r0)     // Catch:{ all -> 0x0089 }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x0089 }
        L_0x001d:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0089 }
            X.2lh r8 = (X.C59062lh) r8     // Catch:{ all -> 0x0089 }
            android.database.sqlite.SQLiteStatement r2 = r5.A00     // Catch:{ all -> 0x0089 }
            r2.clearBindings()     // Catch:{ all -> 0x0089 }
            X.A2n r6 = r8.A01     // Catch:{ all -> 0x0089 }
            int r0 = r6.A00()     // Catch:{ all -> 0x0089 }
            long r0 = (long) r0     // Catch:{ all -> 0x0089 }
            r7 = 1
            r2.bindLong(r7, r0)     // Catch:{ all -> 0x0089 }
            r7 = 2
            byte[] r0 = r6.A00     // Catch:{ all -> 0x0089 }
            int r0 = X.A8G.A01(r0, r7)     // Catch:{ all -> 0x0089 }
            long r0 = (long) r0     // Catch:{ all -> 0x0089 }
            r2.bindLong(r7, r0)     // Catch:{ all -> 0x0089 }
            X.2mC r8 = r8.A00     // Catch:{ all -> 0x0089 }
            byte[] r1 = r8.A02     // Catch:{ all -> 0x0089 }
            r0 = 3
            r2.bindBlob(r0, r1)     // Catch:{ all -> 0x0089 }
            long r0 = r8.A00     // Catch:{ all -> 0x0089 }
            r7 = 4
            r2.bindLong(r7, r0)     // Catch:{ all -> 0x0089 }
            X.9uE r0 = r8.A01     // Catch:{ all -> 0x0089 }
            X.8af r0 = r0.A00()     // Catch:{ all -> 0x0089 }
            byte[] r1 = r0.A0M()     // Catch:{ all -> 0x0089 }
            r0 = 5
            r2.bindBlob(r0, r1)     // Catch:{ all -> 0x0089 }
            long r7 = r5.A01()     // Catch:{ all -> 0x0089 }
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "SyncdCryptoStore/saveKey failed to store key: "
            r1.append(r0)     // Catch:{ all -> 0x0089 }
            r1.append(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0089 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0089 }
            goto L_0x001d
        L_0x007f:
            r4.A00()     // Catch:{ all -> 0x0089 }
            r4.close()     // Catch:{ all -> 0x0090 }
            r3.close()
            return
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S0.A0A(java.util.Set):void");
    }

    public final boolean A0B() {
        ArrayList A042 = this.A08.A04(38);
        if (!(A042 instanceof Collection) || !A042.isEmpty()) {
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                AnonymousClass23F r1 = (AnonymousClass23F) it.next();
                if (!r1.A01 && r1.A01) {
                    return true;
                }
            }
        }
        return false;
    }
}
