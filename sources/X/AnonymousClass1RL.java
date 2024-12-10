package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1RL  reason: invalid class name */
public final class AnonymousClass1RL {
    public static final long A09 = TimeUnit.DAYS.toMillis(1);
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1DL A02;
    public final C24751Ln A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final Map A07;
    public final Set A08;

    public AnonymousClass1RL(AnonymousClass11P r3, AnonymousClass1CJ r4, AnonymousClass1DL r5, C24751Ln r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r9, 7);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A04 = r7;
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = linkedHashSet;
        this.A07 = linkedHashMap;
    }

    public synchronized Boolean A06(AnonymousClass1E2 r6) {
        Boolean bool;
        C18070vi.A0d(r6, 0);
        long A092 = this.A02.A09(r6);
        Map map = this.A07;
        Long valueOf = Long.valueOf(A092);
        if (map.containsKey(valueOf)) {
            C62412rM r0 = (C62412rM) map.get(valueOf);
            if (r0 != null) {
                bool = r0.A01;
            }
        } else if (A092 != -1) {
            bool = ((C59972nB) this.A05.get()).A01(A092);
            A05(bool, A092);
        }
        bool = null;
        return bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r4 != false) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A07(X.AnonymousClass1E2 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C18070vi.A0d(r6, r0)     // Catch:{ all -> 0x0058 }
            java.lang.Boolean r0 = r5.A06(r6)     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0056
            X.1CJ r0 = r5.A01     // Catch:{ all -> 0x0058 }
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0029
            X.2Qs r0 = r0.A0b     // Catch:{ all -> 0x0058 }
        L_0x0015:
            X.2Qs r1 = X.C49502Qs.USERNAME     // Catch:{ all -> 0x0058 }
            if (r0 == r1) goto L_0x002b
            X.00H r0 = r5.A04     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0058 }
            X.9oM r0 = (X.C192419oM) r0     // Catch:{ all -> 0x0058 }
            X.2Qs r0 = r0.A00(r6)     // Catch:{ all -> 0x0058 }
            r4 = 0
            if (r0 != r1) goto L_0x002c
            goto L_0x002b
        L_0x0029:
            r0 = 0
            goto L_0x0015
        L_0x002b:
            r4 = 1
        L_0x002c:
            X.1Ln r0 = r5.A03     // Catch:{ all -> 0x0058 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0D(r6)     // Catch:{ all -> 0x0058 }
            r3 = 0
            if (r0 != 0) goto L_0x0036
            r3 = 1
        L_0x0036:
            X.1DL r0 = r5.A02     // Catch:{ all -> 0x0058 }
            long r1 = r0.A09(r6)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0041
            r0 = 1
            if (r4 == 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            A04(r5, r6, r1, r0)     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x0056
            X.00H r0 = r5.A06     // Catch:{ all -> 0x0058 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0058 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0058 }
            X.CVx r1 = (X.C25065CVx) r1     // Catch:{ all -> 0x0058 }
            r0 = 1
            r1.A00(r6, r0, r0, r0)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r5)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RL.A07(X.1E2):void");
    }

    public synchronized void A08(AnonymousClass1E2 r4) {
        C18070vi.A0d(r4, 0);
        A04(this, r4, this.A02.A09(r4), true);
    }

    public synchronized boolean A09(AnonymousClass1E2 r7) {
        boolean z;
        z = false;
        if (A00(this, r7) + A09 > System.currentTimeMillis()) {
            z = true;
        }
        return z;
    }

    public static final long A00(AnonymousClass1RL r6, AnonymousClass1E2 r7) {
        long A092 = r6.A02.A09(r7);
        Map map = r6.A07;
        Long valueOf = Long.valueOf(A092);
        if (map.containsKey(valueOf)) {
            C62412rM r0 = (C62412rM) map.get(valueOf);
            if (r0 != null) {
                return r0.A00;
            }
            return 0;
        }
        long A002 = ((C59972nB) r6.A05.get()).A00(A092);
        A01(r6, A092, A002);
        return A002;
    }

    public static final void A01(AnonymousClass1RL r5, long j, long j2) {
        Boolean A012;
        boolean A022;
        Map map = r5.A07;
        Long valueOf = Long.valueOf(j);
        C62412rM r0 = (C62412rM) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A022 = r0.A02;
        } else {
            AnonymousClass00H r1 = r5.A05;
            A012 = ((C59972nB) r1.get()).A01(j);
            A022 = ((C59972nB) r1.get()).A02(j);
        }
        map.put(valueOf, new C62412rM(A012, j2, A022));
    }

    public static final void A02(AnonymousClass1RL r6, long j, boolean z) {
        Boolean A012;
        long A002;
        Map map = r6.A07;
        Long valueOf = Long.valueOf(j);
        C62412rM r0 = (C62412rM) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A002 = r0.A00;
        } else {
            AnonymousClass00H r1 = r6.A05;
            A012 = ((C59972nB) r1.get()).A01(j);
            A002 = ((C59972nB) r1.get()).A00(j);
        }
        map.put(valueOf, new C62412rM(A012, A002, z));
    }

    public static final void A03(AnonymousClass1RL r4, AnonymousClass1E2 r5, long j) {
        C62412rM r3 = (C62412rM) r4.A07.get(Long.valueOf(j));
        if (r3 != null) {
            Set<C72153Kv> set = r4.A08;
            synchronized (set) {
                for (C72153Kv C0U : set) {
                    C0U.C0U(r3, r5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass1RL r7, X.AnonymousClass1E2 r8, long r9, boolean r11) {
        /*
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0085
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.2nB r0 = (X.C59972nB) r0
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x0058 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0058 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x0051 }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x004a }
            r6.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x004a }
            r6.put(r1, r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "is_pn_shared"
            X.C63432t4.A02(r6, r0, r11)     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "LidChatStateStore/SET_PN_SHARED_FOR_JID"
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004a }
            r1 = 5
            java.lang.String r0 = "lid_chat_state"
            r2.A09(r0, r3, r6, r1)     // Catch:{ all -> 0x004a }
            r5.A00()     // Catch:{ all -> 0x004a }
            r5.close()     // Catch:{ all -> 0x0051 }
            r4.close()     // Catch:{ all -> 0x0058 }
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005e
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.1IU r2 = new X.1IU
            r2.<init>(r0)
        L_0x005e:
            java.lang.Throwable r1 = X.C30671eK.A00(r2)
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "LidChatStateStore/failed to set phone number shared state"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0069:
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x0073
            r2 = r1
        L_0x0073:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L_0x0085
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.A05(r0, r9)
            A03(r7, r8, r9)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RL.A04(X.1RL, X.1E2, long, boolean):void");
    }

    private final void A05(Boolean bool, long j) {
        long A002;
        boolean A022;
        Map map = this.A07;
        Long valueOf = Long.valueOf(j);
        C62412rM r0 = (C62412rM) map.get(valueOf);
        if (r0 != null) {
            A002 = r0.A00;
            A022 = r0.A02;
        } else {
            AnonymousClass00H r3 = this.A05;
            A002 = ((C59972nB) r3.get()).A00(j);
            A022 = ((C59972nB) r3.get()).A02(j);
        }
        map.put(valueOf, new C62412rM(bool, A002, A022));
    }
}
