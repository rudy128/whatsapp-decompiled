package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.AhX  reason: case insensitive filesystem */
public final class C21286AhX implements C22470B9c {
    public static final C21286AhX A00 = new C21286AhX();

    public static void A00(C62672rm r2, String str, AbstractCollection abstractCollection, Iterator it) {
        C29621ca r1 = (C29621ca) it.next();
        C18070vi.A0b(r1);
        C18070vi.A0d(r1, 0);
        if (r2.A09(r1, str)) {
            abstractCollection.add(new AnonymousClass9CQ(r1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b5 A[LOOP:7: B:119:0x03af->B:121:0x03b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0144 A[LOOP:2: B:34:0x013e->B:36:0x0144, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a2 A[LOOP:3: B:49:0x019c->B:51:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b5 A[LOOP:5: B:83:0x02af->B:85:0x02b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r62, X.C62672rm r63) {
        /*
            r61 = this;
            r0 = 0
            r3 = r62
            r2 = r63
            boolean r1 = X.C18070vi.A17(r3, r2)
            java.lang.String r33 = "group"
            r4 = r33
            boolean r4 = r2.A09(r3, r4)
            r34 = 0
            if (r4 == 0) goto L_0x0683
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r4 = "ack"
            r5[r0] = r4
            java.lang.Class<java.lang.String> r37 = java.lang.String.class
            java.lang.Long r38 = X.AnonymousClass8BU.A0i()
            java.lang.Long r39 = X.AnonymousClass8BU.A0j()
            java.lang.String r40 = "false"
            r35 = r2
            r36 = r3
            r41 = r5
            r42 = r0
            r35.A05(r36, r37, r38, r39, r40, r41, r42)
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r4 = "description"
            r5[r0] = r4
            r4 = 16
            java.lang.Object r25 = X.C21287AhY.A00(r3, r2, r5, r4)
            r4 = r25
            X.9DO r4 = (X.AnonymousClass9DO) r4
            r25 = r4
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r4 = "locked"
            r5[r0] = r4
            r4 = 27
            java.lang.Object r26 = X.C21287AhY.A00(r3, r2, r5, r4)
            r4 = r26
            X.9CQ r4 = (X.AnonymousClass9CQ) r4
            r26 = r4
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r11 = "announcement"
            r8[r0] = r11
            r6 = 0
            r4 = 1
            r10 = r8[r0]
            java.util.List r8 = r3.A0R(r10)
            java.util.ArrayList r9 = X.C108965cb.A0t(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x006e:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0078
            A00(r2, r11, r9, r8)
            goto L_0x006e
        L_0x0078:
            long r12 = X.AnonymousClass8BR.A06(r9)
            r8 = 46
            int r11 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x00ea
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r10, r4, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r4, r8, r6)
        L_0x008d:
            r2.A00 = r4
        L_0x008f:
            r27 = 0
        L_0x0091:
            r4 = r27
            X.9CQ r4 = (X.AnonymousClass9CQ) r4
            r27 = r4
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r10 = "parent"
            r6[r0] = r10
            r4 = 0
            r12 = 1
            r9 = r6[r0]
            java.util.List r6 = r3.A0R(r9)
            java.util.ArrayList r8 = X.C108965cb.A0t(r6)
            java.util.Iterator r15 = r6.iterator()
        L_0x00af:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x0109
            X.1ca r7 = X.AnonymousClass8BW.A0R(r15, r0)
            boolean r6 = r2.A09(r7, r10)
            if (r6 == 0) goto L_0x00af
            boolean r11 = r2.A09(r7, r10)
            r6 = 0
            if (r11 == 0) goto L_0x00df
            java.lang.String[] r11 = new java.lang.String[r1]
            java.lang.String r14 = "default_membership_approval_mode"
            r11[r0] = r14
            java.lang.String r40 = "request_required"
            r36 = r7
            r41 = r11
            java.lang.Object r11 = r35.A05(r36, r37, r38, r39, r40, r41, r42)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00df
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r11)
        L_0x00df:
            r14 = 17
            X.9DO r11 = new X.9DO
            r11.<init>((X.C29621ca) r7, (X.AnonymousClass9CY) r6, (int) r14)
            r8.add(r11)
            goto L_0x00af
        L_0x00ea:
            long r11 = X.AnonymousClass8BR.A06(r9)
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00fe
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r10, r6, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r6, r8, r4)
            goto L_0x008d
        L_0x00fe:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x008f
            java.lang.Object r27 = r9.get(r0)
            goto L_0x0091
        L_0x0109:
            long r10 = X.AnonymousClass8BR.A06(r8)
            r7 = 46
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0148
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r9, r6, r8)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r6, r7, r4)
        L_0x011e:
            r2.A00 = r6
        L_0x0120:
            r28 = 0
        L_0x0122:
            r6 = r28
            X.9DO r6 = (X.AnonymousClass9DO) r6
            r28 = r6
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r9 = "no_frequently_forwarded"
            r8[r0] = r9
            r6 = 1
            r11 = r8[r0]
            java.util.List r8 = r3.A0R(r11)
            java.util.ArrayList r10 = X.C108965cb.A0t(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x013e:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0167
            A00(r2, r9, r10, r8)
            goto L_0x013e
        L_0x0148:
            long r10 = X.AnonymousClass8BR.A06(r8)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x015c
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r9, r6, r8)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r6, r7, r12)
            goto L_0x011e
        L_0x015c:
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L_0x0120
            java.lang.Object r28 = r8.get(r0)
            goto L_0x0122
        L_0x0167:
            long r12 = X.AnonymousClass8BR.A06(r10)
            r9 = 46
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x01a6
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r11, r6, r10)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r6, r9, r4)
        L_0x017c:
            r2.A00 = r6
        L_0x017e:
            r30 = 0
        L_0x0180:
            r6 = r30
            X.9CQ r6 = (X.AnonymousClass9CQ) r6
            r30 = r6
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r11 = "support"
            r8[r0] = r11
            r6 = 1
            r10 = r8[r0]
            java.util.List r8 = r3.A0R(r10)
            java.util.ArrayList r9 = X.C108965cb.A0t(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x019c:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x01c5
            A00(r2, r11, r9, r8)
            goto L_0x019c
        L_0x01a6:
            long r12 = X.AnonymousClass8BR.A06(r10)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x01ba
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r11, r8, r10)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r8, r9, r6)
            goto L_0x017c
        L_0x01ba:
            boolean r6 = r10.isEmpty()
            if (r6 != 0) goto L_0x017e
            java.lang.Object r30 = r10.get(r0)
            goto L_0x0180
        L_0x01c5:
            long r12 = X.AnonymousClass8BR.A06(r9)
            r8 = 46
            int r11 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0257
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r10, r6, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r6, r8, r4)
        L_0x01da:
            r2.A00 = r4
        L_0x01dc:
            r32 = 0
        L_0x01de:
            r4 = r32
            X.9CQ r4 = (X.AnonymousClass9CQ) r4
            r32 = r4
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r11 = "ephemeral"
            r4[r0] = r11
            r9 = 0
            r6 = 1
            r5 = r4[r0]
            java.util.List r8 = r3.A0R(r5)
            java.util.ArrayList r4 = X.C108965cb.A0t(r8)
            java.util.Iterator r14 = r8.iterator()
        L_0x01fc:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x0278
            X.1ca r13 = X.AnonymousClass8BW.A0R(r14, r0)
            boolean r8 = r2.A09(r13, r11)
            if (r8 == 0) goto L_0x01fc
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r12 = "expiration"
            r8[r0] = r12
            java.lang.Class r17 = java.lang.Long.TYPE
            java.lang.Long r18 = java.lang.Long.valueOf(r9)
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.Long r19 = java.lang.Long.valueOf(r15)
            r15 = r2
            r16 = r13
            r20 = r34
            r21 = r8
            r22 = r0
            java.lang.Object r8 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 == 0) goto L_0x01fc
            long r23 = r8.longValue()
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r12 = "trigger"
            r8[r0] = r12
            java.lang.Long r19 = X.AnonymousClass8BV.A0c()
            r21 = r8
            java.lang.Object r8 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Long r8 = (java.lang.Long) r8
            r22 = 3
            X.9DK r12 = new X.9DK
            r19 = r12
            r20 = r13
            r21 = r8
            r19.<init>(r20, r21, r22, r23)
            r4.add(r12)
            goto L_0x01fc
        L_0x0257:
            long r11 = X.AnonymousClass8BR.A06(r9)
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x026c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r10, r4, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r4, r8, r6)
            goto L_0x01da
        L_0x026c:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x01dc
            java.lang.Object r32 = r9.get(r0)
            goto L_0x01de
        L_0x0278:
            long r12 = X.AnonymousClass8BR.A06(r4)
            r11 = 46
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02b9
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r5, r6, r4)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r6, r11, r9)
        L_0x028d:
            r2.A00 = r4
        L_0x028f:
            r31 = 0
        L_0x0291:
            r4 = r31
            X.9DK r4 = (X.AnonymousClass9DK) r4
            r31 = r4
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r11 = "suspended"
            r8[r0] = r11
            r6 = 0
            r4 = 1
            r10 = r8[r0]
            java.util.List r8 = r3.A0R(r10)
            java.util.ArrayList r9 = X.C108965cb.A0t(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x02af:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x02d8
            A00(r2, r11, r9, r8)
            goto L_0x02af
        L_0x02b9:
            long r9 = X.AnonymousClass8BR.A06(r4)
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x02cd
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r5, r8, r4)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r8, r11, r6)
            goto L_0x028d
        L_0x02cd:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x028f
            java.lang.Object r31 = r4.get(r0)
            goto L_0x0291
        L_0x02d8:
            long r12 = X.AnonymousClass8BR.A06(r9)
            r8 = 46
            int r11 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x035e
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r10, r4, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r4, r8, r6)
        L_0x02ed:
            r2.A00 = r4
        L_0x02ef:
            r29 = 0
        L_0x02f1:
            r4 = r29
            X.9CQ r4 = (X.AnonymousClass9CQ) r4
            r29 = r4
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r13 = "growth_locked"
            r6[r0] = r13
            r4 = 0
            r8 = 1
            r7 = r6[r0]
            java.util.List r10 = r3.A0R(r7)
            java.util.ArrayList r6 = X.C108965cb.A0t(r10)
            java.util.Iterator r16 = r10.iterator()
        L_0x030f:
            boolean r10 = r16.hasNext()
            if (r10 == 0) goto L_0x037f
            r10 = r16
            X.1ca r12 = X.AnonymousClass8BW.A0R(r10, r0)
            boolean r10 = r2.A09(r12, r13)
            if (r10 == 0) goto L_0x030f
            java.lang.String[] r10 = new java.lang.String[r1]
            java.lang.String r11 = "expiration"
            r10[r0] = r11
            java.lang.Class r19 = java.lang.Long.TYPE
            java.lang.Long r20 = java.lang.Long.valueOf(r4)
            r17 = r2
            r18 = r12
            r21 = r39
            r22 = r34
            r23 = r10
            r24 = r0
            java.lang.Object r10 = r17.A05(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Number r10 = (java.lang.Number) r10
            if (r10 == 0) goto L_0x030f
            long r14 = r10.longValue()
            java.lang.String[] r41 = X.AnonymousClass8BS.A1a(r1, r0)
            java.lang.String r40 = "invite"
            r36 = r12
            java.lang.Object r11 = r35.A05(r36, r37, r38, r39, r40, r41, r42)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x030f
            X.9D6 r10 = new X.9D6
            r10.<init>(r12, r11, r14)
            r6.add(r10)
            goto L_0x030f
        L_0x035e:
            long r11 = X.AnonymousClass8BR.A06(r9)
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0373
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r10, r6, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r6, r8, r4)
            goto L_0x02ed
        L_0x0373:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x02ef
            java.lang.Object r29 = r9.get(r0)
            goto L_0x02f1
        L_0x037f:
            long r12 = X.AnonymousClass8BR.A06(r6)
            r11 = 46
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x03b9
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r7, r8, r6)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r8, r11, r4)
        L_0x0394:
            r2.A00 = r6
        L_0x0396:
            r12 = 0
        L_0x0397:
            X.9D6 r12 = (X.AnonymousClass9D6) r12
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r11 = "default_sub_group"
            r8[r0] = r11
            r6 = 1
            r10 = r8[r0]
            java.util.List r8 = r3.A0R(r10)
            java.util.ArrayList r9 = X.C108965cb.A0t(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x03af:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x03d8
            A00(r2, r11, r9, r8)
            goto L_0x03af
        L_0x03b9:
            long r12 = X.AnonymousClass8BR.A06(r6)
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x03cd
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r7, r10, r6)
            java.lang.String r6 = X.AnonymousClass8BV.A0u(r10, r11, r8)
            goto L_0x0394
        L_0x03cd:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0396
            java.lang.Object r12 = r6.get(r0)
            goto L_0x0397
        L_0x03d8:
            long r13 = X.AnonymousClass8BR.A06(r9)
            r8 = 46
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0662
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1K(r10, r6, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r6, r8, r4)
        L_0x03ed:
            r2.A00 = r4
        L_0x03ef:
            r4 = 0
        L_0x03f0:
            X.9CQ r4 = (X.AnonymousClass9CQ) r4
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "membership_approval_mode"
            r6[r0] = r5
            r5 = 17
            java.lang.Object r24 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r24
            X.9DO r5 = (X.AnonymousClass9DO) r5
            r24 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "incognito"
            r6[r0] = r5
            r5 = 18
            java.lang.Object r23 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r23
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r23 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "allow_admin_reports"
            r6[r0] = r5
            r5 = 19
            java.lang.Object r22 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r22
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r22 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "allow_non_admin_sub_group_creation"
            r6[r0] = r5
            r5 = 20
            java.lang.Object r21 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r21
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r21 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "general_chat"
            r6[r0] = r5
            r5 = 21
            java.lang.Object r20 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r20
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r20 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "auto_add_disabled"
            r6[r0] = r5
            r5 = 22
            java.lang.Object r19 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r19
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r19 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "group_history"
            r6[r0] = r5
            r5 = 23
            java.lang.Object r18 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r18
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r18 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "linked_parent"
            r6[r0] = r5
            r5 = 24
            java.lang.Object r17 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r17
            X.9DO r5 = (X.AnonymousClass9DO) r5
            r17 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "hidden_group"
            r6[r0] = r5
            r5 = 25
            java.lang.Object r16 = X.C21287AhY.A00(r3, r2, r6, r5)
            r5 = r16
            X.9CQ r5 = (X.AnonymousClass9CQ) r5
            r16 = r5
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "capi"
            r6[r0] = r5
            r5 = 26
            java.lang.Object r15 = X.C21287AhY.A00(r3, r2, r6, r5)
            X.9CQ r15 = (X.AnonymousClass9CQ) r15
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "evolution_version"
            r6[r0] = r5
            r9 = 28
            java.lang.Object r14 = X.C21287AhY.A00(r3, r2, r6, r9)
            X.9CX r14 = (X.AnonymousClass9CX) r14
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "group_safety_check"
            r6[r0] = r5
            r5 = 29
            java.lang.Object r13 = X.C21287AhY.A00(r3, r2, r6, r5)
            X.9CQ r13 = (X.AnonymousClass9CQ) r13
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r5 = "participant"
            r6[r0] = r5
            r7 = 30
            X.AhY r5 = new X.AhY
            r5.<init>(r7)
            r48 = 0
            r50 = 19999(0x4e1f, double:9.881E-320)
            r44 = r2
            r45 = r3
            r46 = r5
            r47 = r6
            java.util.ArrayList r60 = r44.A08(r45, r46, r47, r48, r50)
            if (r60 == 0) goto L_0x0683
            r5 = r33
            boolean r5 = r2.A09(r3, r5)
            if (r5 == 0) goto L_0x0683
            java.lang.String[] r46 = X.AnonymousClass8BS.A1W(r1, r0)
            java.lang.Long r43 = X.AnonymousClass8BV.A0b()
            java.lang.Long r44 = X.AnonymousClass8BV.A0e()
            r40 = r2
            r41 = r3
            r42 = r37
            r45 = r34
            r47 = r0
            java.lang.Object r5 = r40.A05(r41, r42, r43, r44, r45, r46, r47)
            if (r5 == 0) goto L_0x0683
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r6 = "creator"
            r5[r0] = r6
            java.lang.Class<com.whatsapp.jid.UserJid> r42 = com.whatsapp.jid.UserJid.class
            r43 = r38
            r44 = r39
            r46 = r5
            java.lang.Object r6 = r40.A05(r41, r42, r43, r44, r45, r46, r47)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "creation"
            r5[r0] = r7
            java.lang.Class r45 = java.lang.Long.TYPE
            java.lang.Long r46 = java.lang.Long.valueOf(r48)
            r43 = r2
            r44 = r3
            r47 = r39
            r48 = r34
            r49 = r5
            r50 = r0
            java.lang.Object r5 = r43.A05(r44, r45, r46, r47, r48, r49, r50)
            if (r5 == 0) goto L_0x0683
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "p_v_id"
            r5[r0] = r7
            java.lang.Long r50 = X.C108975cc.A0X()
            java.lang.Long r51 = X.AnonymousClass8BV.A0c()
            r47 = r2
            r48 = r3
            r49 = r37
            r52 = r34
            r53 = r5
            r54 = r0
            r47.A05(r48, r49, r50, r51, r52, r53, r54)
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "a_v_id"
            r5[r0] = r7
            r53 = r5
            r47.A05(r48, r49, r50, r51, r52, r53, r54)
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "s_t"
            r5[r0] = r7
            r52 = r2
            r53 = r3
            r56 = r39
            r57 = r34
            r58 = r5
            r59 = r0
            r54 = r45
            r55 = r46
            r52.A05(r53, r54, r55, r56, r57, r58, r59)
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r7 = "s_o"
            r5[r0] = r7
            r43 = r38
            r44 = r39
            r45 = r34
            r46 = r5
            r47 = r0
            java.lang.Object r5 = r40.A05(r41, r42, r43, r44, r45, r46, r47)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r8 = "open_thread_id"
            r7[r0] = r8
            r47 = r2
            r52 = r34
            r53 = r7
            r54 = r0
            r47.A05(r48, r49, r50, r51, r52, r53, r54)
            X.9CY r48 = X.A97.A03(r3, r2)
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r8 = "s_o_pn"
            r7[r0] = r8
            r8 = 0
            r46 = r7
            r47 = r0
            java.lang.Object r7 = r40.A05(r41, r42, r43, r44, r45, r46, r47)
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 == 0) goto L_0x05b7
            X.9DO r8 = new X.9DO
            r8.<init>((com.whatsapp.jid.UserJid) r7, (X.C29621ca) r3, (int) r9)
        L_0x05b7:
            java.lang.String[] r9 = new java.lang.String[r1]
            java.lang.String r7 = "creator_pn"
            r9[r0] = r7
            r7 = 0
            r36 = r3
            r37 = r42
            r40 = r7
            r41 = r9
            r42 = r0
            java.lang.Object r10 = r35.A05(r36, r37, r38, r39, r40, r41, r42)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            if (r10 == 0) goto L_0x05d7
            r9 = 13
            X.9DO r7 = new X.9DO
            r7.<init>((com.whatsapp.jid.UserJid) r10, (X.C29621ca) r3, (int) r9)
        L_0x05d7:
            r9 = 2
            X.B9c[] r10 = new X.C22470B9c[r9]
            X.AgQ r9 = X.C21217AgQ.A00
            r10[r0] = r9
            X.AgR r9 = X.C21218AgR.A00
            java.util.List r11 = X.C18070vi.A0O(r9, r10, r1)
            java.lang.String[] r10 = new java.lang.String[r0]
            java.lang.String r9 = "NamedSubject|UnnamedSubjectFallback"
            java.lang.Object r9 = r2.A06(r3, r9, r11, r10)
            if (r9 == 0) goto L_0x0683
            X.9CW r9 = (X.AnonymousClass9CW) r9
            X.9D2 r59 = new X.9D2
            r44 = r59
            r45 = r6
            r46 = r5
            r47 = r3
            r49 = r8
            r50 = r7
            r51 = r9
            r44.<init>(r45, r46, r47, r48, r49, r50, r51)
            r5 = 3
            X.B9c[] r7 = new X.C22470B9c[r5]
            X.AgY r5 = X.C21225AgY.A00
            r7[r0] = r5
            X.AgZ r5 = X.C21226AgZ.A00
            r7[r1] = r5
            r6 = 2
            X.Aga r5 = X.C21227Aga.A00
            java.util.List r6 = X.C18070vi.A0O(r5, r7, r6)
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r1 = "member_add_mode"
            r5[r0] = r1
            java.lang.String r0 = "AdminAddMode|AllMembersAddMode|UnknownAddMode"
            java.lang.Object r1 = r2.A06(r3, r0, r6, r5)
            if (r1 != 0) goto L_0x065a
            r0 = 0
        L_0x0624:
            X.9Dy r34 = new X.9Dy
            r36 = r26
            r37 = r27
            r38 = r30
            r39 = r32
            r40 = r29
            r41 = r4
            r42 = r23
            r43 = r22
            r44 = r21
            r45 = r20
            r46 = r19
            r47 = r18
            r48 = r16
            r49 = r15
            r50 = r13
            r51 = r14
            r52 = r31
            r53 = r12
            r54 = r25
            r55 = r28
            r56 = r24
            r57 = r17
            r58 = r0
            r35 = r3
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return r34
        L_0x065a:
            X.9CU r1 = (X.AnonymousClass9CU) r1
            X.9DO r0 = new X.9DO
            r0.<init>((X.C29621ca) r3, (X.AnonymousClass9CU) r1)
            goto L_0x0624
        L_0x0662:
            long r13 = X.AnonymousClass8BR.A06(r9)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0677
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A1J(r10, r4, r9)
            java.lang.String r4 = X.AnonymousClass8BV.A0u(r4, r8, r6)
            goto L_0x03ed
        L_0x0677:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x03ef
            java.lang.Object r4 = r9.get(r0)
            goto L_0x03f0
        L_0x0683:
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21286AhX.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
