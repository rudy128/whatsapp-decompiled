package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: X.1PJ  reason: invalid class name */
public class AnonymousClass1PJ {
    public final AnonymousClass1PH A00;
    public final AnonymousClass11P A01;
    public final C25641Oz A02;
    public final C25581Ot A03;
    public final C18030ve A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.3EL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.3EL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.3EL} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A4S A00(X.C72123Ks r10, X.C60002nE r11, X.AnonymousClass1PJ r12, X.C21573AmN r13, boolean r14) {
        /*
            if (r14 == 0) goto L_0x001d
            X.3EN r9 = new X.3EN
            r9.<init>()
            X.1PH r5 = r12.A00
            X.1PI r6 = r5.A05
            X.3EM r8 = new X.3EM
            r8.<init>(r5)
            X.2mN r7 = X.C62812s2.A01(r11)
            X.A7H r4 = new X.A7H
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0019:
            r2 = 0
            if (r10 == 0) goto L_0x002d
            goto L_0x0033
        L_0x001d:
            X.1PH r5 = r12.A00
            X.1PI r6 = r5.A05
            X.2mN r7 = X.C62812s2.A01(r11)
            X.A7H r4 = new X.A7H
            r9 = r5
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0019
        L_0x002d:
            X.3EK r1 = new X.3EK     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            r1.<init>()     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            goto L_0x0038
        L_0x0033:
            X.3EL r1 = new X.3EL     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            r1.<init>(r10)     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
        L_0x0038:
            X.1Ot r0 = r12.A03     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            boolean r0 = r0.A03()     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r3 = X.A7H.A04     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            monitor-enter(r3)     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            byte[] r1 = r4.A04(r1, r13)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
        L_0x004c:
            byte[] r1 = r4.A04(r1, r13)     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
        L_0x0050:
            r0 = 0
            X.A4S r0 = X.A4S.A00(r2, r1, r0)     // Catch:{ 1P6 -> 0x008b, 1P5 -> 0x0083, 1P9 -> 0x007b, 1P8 -> 0x0073, 1PB -> 0x006b, 1P4 -> 0x0063, Exception -> 0x0056 }
            return r0
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "SignalCoordinatorDefault/decryptForIndividualPreKey with prekey"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x0063:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x006b:
            r1 = move-exception
            r0 = -1010(0xfffffffffffffc0e, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x0073:
            r1 = move-exception
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x007b:
            r1 = move-exception
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x0083:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        L_0x008b:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PJ.A00(X.3Ks, X.2nE, X.1PJ, X.AmN, boolean):X.A4S");
    }

    public static boolean A01(C165098aa r2, C165098aa r3) {
        C164588Zk r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = C164588Zk.DEFAULT_INSTANCE;
        }
        byte[] A06 = r0.content_.A06();
        C164588Zk r02 = r3.localFingerprint_;
        if (r02 == null) {
            r02 = C164588Zk.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A06, r02.content_.A06())) {
            C164588Zk r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = C164588Zk.DEFAULT_INSTANCE;
            }
            byte[] A062 = r03.identifier_.A06();
            C164588Zk r04 = r3.localFingerprint_;
            if (r04 == null) {
                r04 = C164588Zk.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A062, r04.identifier_.A06())) {
                C164588Zk r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = C164588Zk.DEFAULT_INSTANCE;
                }
                byte[] A063 = r05.content_.A06();
                C164588Zk r06 = r3.remoteFingerprint_;
                if (r06 == null) {
                    r06 = C164588Zk.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A063, r06.content_.A06())) {
                    C164588Zk r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = C164588Zk.DEFAULT_INSTANCE;
                    }
                    byte[] A064 = r07.identifier_.A06();
                    C164588Zk r08 = r3.remoteFingerprint_;
                    if (r08 == null) {
                        r08 = C164588Zk.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A064, r08.identifier_.A06())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A02(C165098aa r2, C165098aa r3) {
        C164588Zk r0 = r2.localFingerprint_;
        if (r0 == null) {
            r0 = C164588Zk.DEFAULT_INSTANCE;
        }
        byte[] A06 = r0.content_.A06();
        C164588Zk r02 = r3.remoteFingerprint_;
        if (r02 == null) {
            r02 = C164588Zk.DEFAULT_INSTANCE;
        }
        if (MessageDigest.isEqual(A06, r02.content_.A06())) {
            C164588Zk r03 = r2.localFingerprint_;
            if (r03 == null) {
                r03 = C164588Zk.DEFAULT_INSTANCE;
            }
            byte[] A062 = r03.identifier_.A06();
            C164588Zk r04 = r3.remoteFingerprint_;
            if (r04 == null) {
                r04 = C164588Zk.DEFAULT_INSTANCE;
            }
            if (MessageDigest.isEqual(A062, r04.identifier_.A06())) {
                C164588Zk r05 = r2.remoteFingerprint_;
                if (r05 == null) {
                    r05 = C164588Zk.DEFAULT_INSTANCE;
                }
                byte[] A063 = r05.content_.A06();
                C164588Zk r06 = r3.localFingerprint_;
                if (r06 == null) {
                    r06 = C164588Zk.DEFAULT_INSTANCE;
                }
                if (MessageDigest.isEqual(A063, r06.content_.A06())) {
                    C164588Zk r07 = r2.remoteFingerprint_;
                    if (r07 == null) {
                        r07 = C164588Zk.DEFAULT_INSTANCE;
                    }
                    byte[] A064 = r07.identifier_.A06();
                    C164588Zk r08 = r3.localFingerprint_;
                    if (r08 == null) {
                        r08 = C164588Zk.DEFAULT_INSTANCE;
                    }
                    if (!MessageDigest.isEqual(A064, r08.identifier_.A06())) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public C53272cG A03() {
        C54022dT BSl = this.A00.BSl();
        return new C53272cG(new C58242kN(BSl.A01.A00), new C58252kO(new C33801jP(BSl.A00.A00.A00)));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.2S5, java.lang.Object] */
    public void A04() {
        AnonymousClass1PH r7 = this.A00;
        int A042 = r7.A00.A04(AnonymousClass18O.A1S);
        int A002 = r7.A03.A00();
        if (A002 >= A042) {
            StringBuilder sb = new StringBuilder();
            sb.append("SignalProtocolStore/get-schema skipping key generation because already more than ");
            sb.append(A042);
            sb.append(" are unsent");
            Log.i(sb.toString());
            return;
        }
        while (true) {
            A042 -= A002;
            if (A042 > 0) {
                A002 = Math.min(A042, 50);
                int A012 = r7.A02.A01();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SignalProtocolStore/generate ");
                sb2.append(A002);
                sb2.append(" new prekeys starting from ");
                sb2.append(A012);
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                ArrayList arrayList = new ArrayList();
                LinkedList<AnonymousClass2S5> linkedList = new LinkedList<>();
                int i = A012 - 1;
                for (int i2 = 0; i2 < A002; i2++) {
                    C185259cI A022 = C20065A5o.A02();
                    ? obj = new Object();
                    C23624Bmt A0N = AnonymousClass2BH.DEFAULT_INSTANCE.A0N();
                    A0N.A0E();
                    AnonymousClass2BH r1 = (AnonymousClass2BH) A0N.A00;
                    r1.bitField0_ |= 1;
                    r1.id_ = ((i + i2) % 16777214) + 1;
                    byte[] A003 = A022.A01.A00();
                    C23581BmB A013 = DSQ.A01(A003, 0, A003.length);
                    A0N.A0E();
                    AnonymousClass2BH r12 = (AnonymousClass2BH) A0N.A00;
                    r12.bitField0_ |= 2;
                    r12.publicKey_ = A013;
                    byte[] bArr = A022.A00.A00;
                    C23581BmB A014 = DSQ.A01(bArr, 0, bArr.length);
                    A0N.A0E();
                    AnonymousClass2BH r13 = (AnonymousClass2BH) A0N.A00;
                    r13.bitField0_ |= 4;
                    r13.privateKey_ = A014;
                    obj.A00 = (AnonymousClass2BH) A0N.A0C();
                    linkedList.add(obj);
                }
                for (AnonymousClass2S5 r0 : linkedList) {
                    AnonymousClass2BH r02 = r0.A00;
                    arrayList.add(new C52972bm(r02.id_, r02.A0M()));
                }
                r7.A06.A0X(arrayList, ((A012 + A002) % 16777214) + 1);
            } else {
                return;
            }
        }
    }

    public AnonymousClass1PJ(AnonymousClass1PH r1, AnonymousClass11P r2, C25641Oz r3, C25581Ot r4, C18030ve r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }
}
