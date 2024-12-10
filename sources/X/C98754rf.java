package X;

/* renamed from: X.4rf  reason: invalid class name and case insensitive filesystem */
public class C98754rf implements Runnable {
    public final int A00;
    public final Object A01;

    public C98754rf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C200710s r1, Object obj, int i) {
        r1.execute(new C98754rf(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C98754rf(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0484, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0607, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x060b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x061a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x061b, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x061e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06f6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06f7, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0703, code lost:
        r8.A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0706, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0709, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x070d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0710, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0711, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0714, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0783, code lost:
        r0.A0U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0786, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07b6, code lost:
        X.C77033p1.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0920, code lost:
        r2.A0J(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0923, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0938, code lost:
        r1.A0U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x093b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        X.AnonymousClass3VJ.A04((X.AnonymousClass3VJ) r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0235, code lost:
        if (r6 != 9) goto L_0x0237;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x034e;
                case 1: goto L_0x03a9;
                case 2: goto L_0x03b6;
                case 3: goto L_0x0413;
                case 4: goto L_0x0423;
                case 5: goto L_0x0436;
                case 6: goto L_0x0026;
                case 7: goto L_0x0014;
                case 8: goto L_0x043e;
                case 9: goto L_0x045c;
                case 10: goto L_0x004b;
                case 11: goto L_0x046b;
                case 12: goto L_0x0478;
                case 13: goto L_0x0488;
                case 14: goto L_0x049f;
                case 15: goto L_0x052b;
                case 16: goto L_0x0541;
                case 17: goto L_0x0547;
                case 18: goto L_0x061f;
                case 19: goto L_0x0058;
                case 20: goto L_0x0715;
                case 21: goto L_0x0721;
                case 22: goto L_0x0078;
                case 23: goto L_0x076d;
                case 24: goto L_0x077c;
                case 25: goto L_0x0787;
                case 26: goto L_0x0796;
                case 27: goto L_0x07a2;
                case 28: goto L_0x07a2;
                case 29: goto L_0x07ab;
                case 30: goto L_0x07a2;
                case 31: goto L_0x07ba;
                case 32: goto L_0x07cc;
                case 33: goto L_0x07db;
                case 34: goto L_0x0809;
                case 35: goto L_0x0097;
                case 36: goto L_0x08aa;
                case 37: goto L_0x009b;
                case 38: goto L_0x08e9;
                case 39: goto L_0x00a3;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x00ab;
                case 44: goto L_0x00b3;
                case 45: goto L_0x0911;
                case 46: goto L_0x0917;
                case 47: goto L_0x0924;
                case 48: goto L_0x00bb;
                case 49: goto L_0x092f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.4mM r0 = (X.C95514mM) r0
            java.lang.Object r1 = r0.A01
        L_0x000d:
            X.3VJ r1 = (X.AnonymousClass3VJ) r1
            r0 = 1
            X.AnonymousClass3VJ.A04(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r1.A01
            X.8GM r2 = (X.AnonymousClass8GM) r2
            X.1wy r1 = r2.A03
            r0 = 0
            X.AnonymousClass3MY.A1M(r1, r0)
            X.1wy r1 = r2.A02
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            goto L_0x00f6
        L_0x0026:
            java.lang.Object r5 = r1.A01
            com.whatsapp.community.CommunityExitDialogFragment r5 = (com.whatsapp.community.CommunityExitDialogFragment) r5
            android.content.Context r4 = r5.A1n()
            if (r4 == 0) goto L_0x0013
            X.129 r1 = r5.A0B
            java.lang.String r0 = "3114626665494175"
            android.net.Uri r3 = r1.A03(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunityExitDialogFragment intent: "
            X.C17900vP.A0Y(r3, r0, r1)
            X.1L9 r0 = r5.A01
            r0.A08(r4, r2)
            return
        L_0x004b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.community.CommunityMembersActivity r0 = (com.whatsapp.community.CommunityMembersActivity) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A01
            if (r1 == 0) goto L_0x0013
            r0 = 0
            r1.A0f(r0)
            return
        L_0x0058:
            java.lang.Object r3 = r1.A01
            X.3Uc r3 = (X.AnonymousClass3Uc) r3
            X.1R3 r2 = r3.A0e
            X.1EC r1 = r3.A0q
            r0 = 1
            X.206 r0 = r2.A06(r1, r0)
            if (r0 == 0) goto L_0x006e
            boolean r0 = X.AnonymousClass25A.A0q(r0)
            if (r0 == 0) goto L_0x006e
            return
        L_0x006e:
            X.1ci r1 = r3.A03
            if (r1 == 0) goto L_0x0013
            X.1kb r0 = r3.A0N
            r0.A0G(r1)
            return
        L_0x0078:
            java.lang.Object r3 = r1.A01
            X.3Uc r3 = (X.AnonymousClass3Uc) r3
            X.1kb r2 = r3.A0N
            X.1EC r1 = r3.A0q
            boolean r0 = r2.A0U(r1)
            if (r0 == 0) goto L_0x008b
            X.1wy r0 = r3.A14
            r0.A0E(r1)
        L_0x008b:
            boolean r0 = r2.A0P(r1)
            if (r0 == 0) goto L_0x0013
            X.1wy r0 = r3.A13
            r0.A0E(r1)
            return
        L_0x0097:
            java.lang.Object r1 = r1.A01
            goto L_0x000d
        L_0x009b:
            java.lang.Object r0 = r1.A01
            X.411 r0 = (X.AnonymousClass411) r0
            java.lang.Object r1 = r0.A01
            goto L_0x000d
        L_0x00a3:
            java.lang.Object r0 = r1.A01
            X.4ne r0 = (X.C96314ne) r0
            java.lang.Object r1 = r0.A01
            goto L_0x000d
        L_0x00ab:
            java.lang.Object r0 = r1.A01
            X.4mF r0 = (X.C95444mF) r0
            java.lang.Object r1 = r0.A01
            goto L_0x000d
        L_0x00b3:
            java.lang.Object r0 = r1.A01
            X.4mC r0 = (X.C95414mC) r0
            java.lang.Object r1 = r0.A01
            goto L_0x000d
        L_0x00bb:
            java.lang.Object r0 = r1.A01
            X.3VM r0 = (X.AnonymousClass3VM) r0
            X.1vp r7 = r0.A0d
            int r5 = X.C72463Mc.A0A(r7)
            X.1DT r8 = r0.A0E
            java.lang.Object r9 = r8.A06()
            java.lang.Number r9 = (java.lang.Number) r9
            r2 = 5
            r1 = 1
            if (r5 != r2) goto L_0x00d5
            r0.A0U(r1)
            return
        L_0x00d5:
            r4 = 4
            if (r5 != r4) goto L_0x00fe
            int r1 = r0.A02
            r4 = 2
            if (r1 != r4) goto L_0x00fa
            X.1kU r1 = r0.A0c
            X.1EC r3 = r0.A0a
            if (r3 != 0) goto L_0x00e5
            X.1EC r3 = r0.A07
        L_0x00e5:
            java.lang.String r2 = "community_home"
            X.1aA r1 = r1.A00
            boolean r2 = r1.A01(r3, r2)
            X.1vp r1 = r0.A0e
            if (r2 != 0) goto L_0x00f2
            r4 = 3
        L_0x00f2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x00f6:
            r1.A0E(r0)
            return
        L_0x00fa:
            X.1vp r1 = r0.A0e
            r4 = 4
            goto L_0x00f2
        L_0x00fe:
            r2 = 2
            if (r5 == r2) goto L_0x0104
            r3 = 6
            if (r5 != r3) goto L_0x0013
        L_0x0104:
            int r6 = r0.A01
            r5 = 426(0x1aa, float:5.97E-43)
            r3 = 7
            if (r6 != r5) goto L_0x010f
            X.AnonymousClass3MX.A1K(r7, r3)
            return
        L_0x010f:
            r7 = 9
            if (r9 == 0) goto L_0x0191
            int r5 = r9.intValue()
            if (r5 != r7) goto L_0x0191
            X.11P r3 = r0.A0Q
            long r5 = X.AnonymousClass11P.A01(r3)
            r0.A03 = r5
            X.4Me r8 = r0.A0Z
            X.11S r3 = r0.A0H
            com.whatsapp.jid.PhoneUserJid r7 = X.AnonymousClass11S.A00(r3)
            X.1EC r6 = r0.A07
            r3 = 0
            X.C18070vi.A0d(r7, r3)
            X.C18070vi.A0d(r6, r1)
            X.Af0 r5 = new X.Af0
            r5.<init>()
            X.00H r9 = r8.A00
            java.lang.String r13 = X.C17890vO.A0T(r9)
            X.1MD[] r10 = new X.AnonymousClass1MD[r1]
            java.lang.String r8 = "jid"
            X.1MD r3 = new X.1MD
            r3.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r8)
            r11 = 0
            r10[r11] = r3
            java.lang.String r3 = "participant"
            X.1ca r12 = new X.1ca
            r12.<init>(r3, r10)
            java.lang.String r8 = "cancel_membership_requests"
            r3 = 0
            X.1ca r10 = new X.1ca
            r10.<init>((X.C29621ca) r12, (java.lang.String) r8, (X.AnonymousClass1MD[]) r3)
            X.1MD[] r8 = new X.AnonymousClass1MD[r4]
            java.lang.String r4 = "xmlns"
            java.lang.String r3 = "w:g2"
            X.C17880vN.A1Q(r4, r3, r8, r11)
            java.lang.String r3 = "id"
            X.C17880vN.A1Q(r3, r13, r8, r1)
            java.lang.String r4 = "type"
            java.lang.String r3 = "set"
            X.C17880vN.A1Q(r4, r3, r8, r2)
            X.1ca r12 = X.C29621ca.A00(r6, r10, r8)
            X.1OZ r10 = X.C17880vN.A0U(r9)
            X.4ph r11 = new X.4ph
            r11.<init>(r5, r6, r7, r1)
            r15 = 2000(0x7d0, double:9.88E-321)
            r14 = 351(0x15f, float:4.92E-43)
            r10.A0N(r11, r12, r13, r14, r15)
            r1 = 3
            X.C98334qx.A00(r5, r0, r1)
            X.4qx r3 = new X.4qx
            r3.<init>(r0, r2)
            X.1TJ r1 = r5.A00
            r0 = 0
            r1.A03(r3, r0)
            return
        L_0x0191:
            X.1EC r6 = r0.A07
            if (r6 == 0) goto L_0x01f2
            X.1CJ r5 = r0.A0T
            int r5 = r5.A06(r6)
            boolean r5 = X.AnonymousClass2TI.A00(r5)
            if (r5 == 0) goto L_0x01f2
            java.lang.Object r5 = r8.A06()
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x01f2
            int r5 = r5.intValue()
            if (r5 == r2) goto L_0x0337
            if (r5 == r4) goto L_0x0337
            if (r5 != r1) goto L_0x01f2
            X.1ub r9 = r0.A0L
            int r10 = r0.A0A
            X.1MZ r5 = r0.A0U
            X.1EC r6 = r0.A07
            X.1MW r5 = r5.A08
            X.2tp r5 = r5.A0B(r6)
            int r5 = r5.A06()
            long r5 = (long) r5
            r13 = 12
        L_0x01c8:
            X.2GC r12 = new X.2GC
            r12.<init>()
            X.00H r11 = r9.A04
            java.lang.Object r11 = r11.get()
            X.9iv r11 = (X.C189339iv) r11
            java.lang.String r11 = r11.A00()
            r12.A05 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r12.A00 = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.A01 = r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r12.A04 = r5
            X.18K r5 = r9.A03
            r5.CC7(r12)
        L_0x01f2:
            X.1DT r6 = r0.A0F
            r5 = 0
            r6.A0E(r5)
            r5 = 8
            X.AnonymousClass3MX.A1K(r8, r5)
            X.11P r5 = r0.A0Q
            long r5 = X.AnonymousClass11P.A01(r5)
            r0.A04 = r5
            int r8 = r0.A02
            if (r8 == r4) goto L_0x029e
            r5 = 3
            if (r8 == r5) goto L_0x029e
            r5 = 8
            if (r8 == r5) goto L_0x029e
            r5 = 6
            if (r8 != r5) goto L_0x0253
            X.1vp r6 = r0.A0e
            r5 = 5
            X.AnonymousClass3MX.A1K(r6, r5)
        L_0x0219:
            boolean r5 = r0.A0h
            if (r5 == 0) goto L_0x0013
            X.3yk r8 = new X.3yk
            r8.<init>()
            int r6 = r0.A02
            if (r6 == 0) goto L_0x0247
            if (r6 == r1) goto L_0x0242
            if (r6 == r2) goto L_0x024c
            r5 = 3
            if (r6 == r5) goto L_0x023d
            if (r6 == r4) goto L_0x0242
            if (r6 == r3) goto L_0x0247
            r1 = 8
            if (r6 == r1) goto L_0x0242
            if (r6 == r7) goto L_0x0242
        L_0x0237:
            X.18K r0 = r0.A0W
            r0.CC7(r8)
            return
        L_0x023d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0250
        L_0x0242:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0250
        L_0x0247:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0250
        L_0x024c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L_0x0250:
            r8.A00 = r1
            goto L_0x0237
        L_0x0253:
            boolean r5 = X.AnonymousClass3VM.A07(r8)
            if (r5 == 0) goto L_0x026e
            java.lang.String r9 = r0.A0g
            X.C17960vV.A07(r9)
            X.12M r8 = r0.A0Y
            X.4o6 r6 = new X.4o6
            r6.<init>(r0, r1)
            X.4pb r5 = new X.4pb
            r5.<init>(r0, r1)
            r8.A0A(r6, r5, r9)
            goto L_0x0219
        L_0x026e:
            if (r8 != r3) goto L_0x0296
            java.lang.String r12 = r0.A0g
            X.C17960vV.A07(r12)
            com.whatsapp.jid.UserJid r11 = r0.A0b
            X.C17960vV.A07(r11)
            X.1EC r10 = r0.A07
            X.C17960vV.A07(r10)
            long r13 = r0.A0B
            X.2fB r9 = new X.2fB
            r9.<init>(r10, r11, r12, r13)
            X.12M r8 = r0.A0Y
            X.4o6 r6 = new X.4o6
            r6.<init>(r0, r1)
            X.4pb r5 = new X.4pb
            r5.<init>(r0, r1)
            r8.A09(r6, r5, r9)
            goto L_0x0219
        L_0x0296:
            java.lang.String r6 = "has to to be one of the use case"
            r5 = 0
            X.C17960vV.A0F(r5, r6)
            goto L_0x0219
        L_0x029e:
            X.1EC r11 = r0.A07
            X.C17960vV.A07(r11)
            X.1EC r14 = r0.A0a
            X.C17960vV.A07(r14)
            X.4Of r15 = r0.A0K
            X.4Kz r13 = new X.4Kz
            r13.<init>(r0)
            X.4L0 r10 = new X.4L0
            r10.<init>(r0)
            r5 = 0
            X.C18070vi.A0d(r14, r5)
            X.C18070vi.A0d(r11, r1)
            r12 = 3
            X.4KG r9 = r15.A00
            X.4Nq r6 = new X.4Nq
            r6.<init>(r13, r10, r15, r11)
            X.10f r5 = X.C87604Wf.A02
            X.10F r5 = r9.A00
            X.10E r5 = r5.A00
            X.00S r5 = r5.A6N
            java.lang.Object r5 = r5.get()
            X.1OZ r5 = (X.AnonymousClass1OZ) r5
            X.4Wf r10 = new X.4Wf
            r10.<init>(r6, r5)
            r6 = 2
            if (r8 != r12) goto L_0x02da
            r6 = 3
        L_0x02da:
            X.1OZ r15 = r10.A01
            java.lang.String r8 = r15.A0B()
            java.lang.String r5 = "JoinSubgroupProtocolHelper/sendJoinSubgroupRequest"
            com.whatsapp.util.Log.i((java.lang.String) r5)
            if (r6 != r12) goto L_0x0334
            java.lang.String r6 = "default_sub_group"
        L_0x02e9:
            X.1MD[] r9 = new X.AnonymousClass1MD[r2]
            java.lang.String r13 = "type"
            X.1MD r5 = new X.1MD
            r5.<init>((java.lang.String) r13, (java.lang.String) r6)
            r6 = 0
            r9[r6] = r5
            java.lang.String r5 = "jid"
            X.C17880vN.A1I(r11, r5, r9, r1)
            java.lang.String r5 = "join_linked_group"
            X.1ca r11 = new X.1ca
            r11.<init>(r5, r9)
            X.1MD[] r9 = new X.AnonymousClass1MD[r4]
            java.lang.String r5 = "to"
            X.C17880vN.A1I(r14, r5, r9, r6)
            java.lang.String r5 = "set"
            X.C17880vN.A1Q(r13, r5, r9, r1)
            java.lang.String r5 = "id"
            X.C17880vN.A1Q(r5, r8, r9, r2)
            java.lang.String r6 = "xmlns"
            java.lang.String r5 = "w:g2"
            X.C17880vN.A1Q(r6, r5, r9, r12)
            java.lang.String r5 = "iq"
            X.1ca r6 = new X.1ca
            r6.<init>((X.C29621ca) r11, (java.lang.String) r5, (X.AnonymousClass1MD[]) r9)
            X.4pc r5 = new X.4pc
            r5.<init>(r10)
            r20 = 0
            r19 = 310(0x136, float:4.34E-43)
            r17 = r6
            r18 = r8
            r16 = r5
            r15.A0N(r16, r17, r18, r19, r20)
            goto L_0x0219
        L_0x0334:
            java.lang.String r6 = "sub_group"
            goto L_0x02e9
        L_0x0337:
            X.1ub r9 = r0.A0L
            int r10 = r0.A0A
            X.1MZ r5 = r0.A0U
            X.1EC r6 = r0.A07
            X.1MW r5 = r5.A08
            X.2tp r5 = r5.A0B(r6)
            int r5 = r5.A06()
            long r5 = (long) r5
            r13 = 20
            goto L_0x01c8
        L_0x034e:
            java.lang.Object r5 = r1.A01
            X.3oR r5 = (X.C76793oR) r5
            X.1MZ r2 = r5.A04
            X.1BI r1 = r5.A0F
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid"
            X.C18070vi.A0z(r1, r0)
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r2.A08
            X.2tp r0 = r0.A0B(r1)
            X.10f r0 = r0.A07()
            X.C18070vi.A0X(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0372:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.11S r0 = r5.A02
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x0372
            r4.add(r2)
            goto L_0x0372
        L_0x038b:
            java.util.ArrayList r3 = X.C29351c6.A0D(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0393:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03a3
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r5.A03
            X.AnonymousClass3MY.A1O(r0, r1, r3)
            goto L_0x0393
        L_0x03a3:
            X.1vp r0 = r5.A06
            r0.A0E(r3)
            return
        L_0x03a9:
            java.lang.Object r1 = r1.A01
            X.1fA r1 = (X.C31191fA) r1
            r0 = 0
            X.5as r0 = r1.A05(r0)
            r0.BEO()
            return
        L_0x03b6:
            java.lang.Object r7 = r1.A01
            X.1fA r7 = (X.C31191fA) r7
            java.util.HashSet r6 = X.C17880vN.A12()
            X.1CJ r0 = r7.A05
            java.util.ArrayList r0 = r0.A0G()
            java.util.Iterator r5 = r0.iterator()
        L_0x03c8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x03fc
            java.lang.Object r0 = r5.next()
            X.1ci r0 = (X.C29691ci) r0
            X.1BI r4 = r0.A08()
            X.C18070vi.A0X(r4)
            r3 = 0
            r7.A0G(r4, r3)
            X.0vp r0 = r7.A0M
            java.lang.Object r2 = r0.get()
            X.121 r2 = (X.AnonymousClass121) r2
            r1 = 0
            r0 = 1
            r2.BEq(r4, r1, r3, r0)
            X.00H r0 = r7.A0J
            java.lang.Object r0 = r0.get()
            X.1To r0 = (X.C26811To) r0
            java.util.Set r0 = r0.A08(r4, r3)
            r6.addAll(r0)
            goto L_0x03c8
        L_0x03fc:
            X.00H r0 = r7.A0J
            java.lang.Object r0 = r0.get()
            X.1To r0 = (X.C26811To) r0
            r0.A0R(r6)
            X.00H r0 = r7.A0E
            java.lang.Object r0 = r0.get()
            X.1NN r0 = (X.AnonymousClass1NN) r0
            r0.A00()
            return
        L_0x0413:
            java.lang.Object r0 = r1.A01
            X.1fA r0 = (X.C31191fA) r0
            X.00H r0 = r0.A0K
            java.lang.Object r0 = r0.get()
            X.1xI r0 = (X.C41911xI) r0
            r0.A00()
            return
        L_0x0423:
            java.lang.Object r1 = r1.A01
            com.whatsapp.chatlock.ChatLockPrivacySettingsActivity r1 = (com.whatsapp.chatlock.ChatLockPrivacySettingsActivity) r1
            X.4R5 r0 = r1.A00
            if (r0 == 0) goto L_0x042f
            r0.A00(r1)
            return
        L_0x042f:
            java.lang.String r0 = "chatLockLinkUtil"
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0436:
            java.lang.Object r0 = r1.A01
            X.3dz r0 = (X.C75093dz) r0
            r0.A4e()
            return
        L_0x043e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.3p1 r2 = r0.A0R
            X.1EC r5 = r0.A0j
            X.1vp r0 = r2.A0y
            X.C72463Mc.A1B(r0)
            X.12M r0 = r2.A0l
            X.126 r4 = r2.A0k
            X.1NN r3 = r2.A0a
            java.lang.String r6 = r2.A07
            X.40f r1 = new X.40f
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0E(r1)
            return
        L_0x045c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.community.CommunityHomeActivity r1 = (com.whatsapp.community.CommunityHomeActivity) r1
            X.00H r0 = r1.A0r
            X.1kb r2 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r1 = r1.A0j
            r0 = 0
            goto L_0x0920
        L_0x046b:
            java.lang.Object r2 = r1.A01
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.00H r0 = r2.A08
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "community-privacy-policy-for-creator"
            goto L_0x0484
        L_0x0478:
            java.lang.Object r2 = r1.A01
            com.whatsapp.community.CommunityNUXActivity r2 = (com.whatsapp.community.CommunityNUXActivity) r2
            X.00H r0 = r2.A08
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "community-examples-article"
        L_0x0484:
            r1.A01(r2, r0)
            return
        L_0x0488:
            java.lang.Object r0 = r1.A01
            X.3p2 r0 = (X.C77043p2) r0
            com.whatsapp.community.CommunityNavigationActivity r1 = r0.A00
            X.00H r0 = r1.A0m
            java.lang.Object r3 = r0.get()
            X.1pz r3 = (X.C37701pz) r3
            X.1BI r2 = r1.A0W
            X.1i2 r1 = X.C32961i2.COMMUNITY_NAVIGATION
            r0 = 0
            r3.A01(r2, r1, r0)
            return
        L_0x049f:
            java.lang.Object r2 = r1.A01
            X.3Vh r2 = (X.AnonymousClass3Vh) r2
            r6 = 0
            X.C18070vi.A0d(r2, r6)
            X.1kb r0 = r2.A02
            X.1EC r5 = r2.A08
            X.1EC r4 = r0.A04(r5)
            if (r4 == 0) goto L_0x0523
            X.1Mc r1 = r2.A09
            X.126 r0 = r2.A06
            boolean r1 = X.C72463Mc.A1S(r0, r4, r1)
            X.1MZ r3 = r2.A04
            boolean r0 = r3.A0J(r4)
            if (r1 == 0) goto L_0x0523
            if (r0 == 0) goto L_0x0523
            X.1xo r1 = r2.A07
            X.1M9 r0 = r1.A00
            X.1E7 r0 = r0.A0H(r4)
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x04d9
            boolean r0 = r3.A0P(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0523
        L_0x04d9:
            X.0z4 r0 = r2.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "privacy_groupadd"
            int r0 = r1.getInt(r0, r6)
            r10 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r4 = 0
            if (r0 != 0) goto L_0x04ef
            r10 = 8
        L_0x04ef:
            r5 = 8
            r17 = 1
            r12 = 2131890883(0x7f1212c3, float:1.941647E38)
            r13 = -1
            r15 = 2131891130(0x7f1213ba, float:1.9416971E38)
            r8 = r5
            r11 = r5
            r16 = r6
            r18 = r6
            X.4PI r3 = new X.4PI
            r7 = r5
            r9 = r6
            r14 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1DT r1 = r2.A00
            X.3oz r0 = new X.3oz
            r0.<init>(r3)
            r1.A0E(r0)
            X.00H r0 = r2.A0D
            X.10T r0 = X.C17880vN.A0V(r0)
            X.4mF r1 = r2.A01
            r0.registerObserver(r1)
            X.00H r0 = r2.A0C
            X.C72453Mb.A1Q(r0, r1)
            return
        L_0x0523:
            X.1DT r1 = r2.A00
            X.3p0 r0 = X.C77023p0.A00
            r1.A0E(r0)
            return
        L_0x052b:
            java.lang.Object r1 = r1.A01
            X.4SG r1 = (X.AnonymousClass4SG) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FY r1 = r1.A00
            java.lang.String r0 = "community-remove-member"
            r2.A01(r1, r0)
            return
        L_0x0541:
            java.lang.Object r0 = r1.A01
            X.3Uc r0 = (X.AnonymousClass3Uc) r0
            goto L_0x0783
        L_0x0547:
            java.lang.Object r8 = r1.A01
            X.3Uc r8 = (X.AnonymousClass3Uc) r8
            X.1kb r1 = r8.A0N
            X.1EC r0 = r8.A0q
            java.util.HashSet r0 = r1.A08(r0)
            X.4Yr r2 = r8.A0h
            java.util.ArrayList r10 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x055d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0567
            X.C72463Mc.A1K(r10, r1)
            goto L_0x055d
        L_0x0567:
            X.00H r0 = r2.A04
            java.lang.Object r7 = r0.get()
            X.2r4 r7 = (X.C62232r4) r7
            X.11P r0 = r2.A00
            long r4 = X.AnonymousClass11P.A01(r0)
            r9 = 0
            int r6 = r10.size()
            java.lang.String[] r3 = new java.lang.String[r6]
            r2 = 0
        L_0x057d:
            if (r2 >= r6) goto L_0x058d
            X.1LW r1 = r7.A00
            java.lang.Object r0 = r10.get(r2)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.AnonymousClass1LW.A03(r1, r0, r3, r2)
            int r2 = r2 + 1
            goto L_0x057d
        L_0x058d:
            r0 = 974(0x3ce, float:1.365E-42)
            X.23b r1 = new X.23b
            r1.<init>(r3, r0)
            X.1Cd r0 = r7.A02
            X.1at r7 = r0.get()
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0618 }
            r2 = 0
        L_0x05a0:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0618 }
            if (r0 == 0) goto L_0x060c
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0618 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0618 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x0618 }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0618 }
            X.C17880vN.A1V(r0, r9, r4)     // Catch:{ all -> 0x0618 }
            java.lang.Object[] r11 = X.C200310o.A0F(r1, r0)     // Catch:{ all -> 0x0618 }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ all -> 0x0618 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0618 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0618 }
            int r1 = r10.size()     // Catch:{ all -> 0x0618 }
            java.lang.String r0 = "?"
            java.util.List r12 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0618 }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x0618 }
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r12 = X.C29431cG.A0h(r1, r12, r0)     // Catch:{ all -> 0x0618 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0618 }
            java.lang.String r0 = "\n        SELECT COUNT(DISTINCT message_row_id) as count\n        FROM message_event\n        WHERE\n            chat_row_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x0618 }
            r1.append(r12)     // Catch:{ all -> 0x0618 }
            java.lang.String r0 = ")\n            AND\n            start_time > ?\n            AND\n            is_canceled = 0\n        "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0618 }
            java.lang.String r1 = X.AnonymousClass1Y7.A01(r0)     // Catch:{ all -> 0x0618 }
            java.lang.String r0 = "GET_COUNT_OF_UPCOMING_EVENTS_IN_CHATS_QUERY_ID"
            android.database.Cursor r6 = r6.A0A(r1, r0, r11)     // Catch:{ all -> 0x0618 }
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0605 }
            if (r0 == 0) goto L_0x0601
            java.lang.String r0 = "count"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0605 }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x0605 }
            long r2 = r2 + r0
        L_0x0601:
            r6.close()     // Catch:{ all -> 0x0618 }
            goto L_0x05a0
        L_0x0605:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0607 }
        L_0x0607:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0618 }
            throw r0     // Catch:{ all -> 0x0618 }
        L_0x060c:
            r7.close()
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A06 = r0
            goto L_0x0703
        L_0x0618:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x061a }
        L_0x061a:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        L_0x061f:
            java.lang.Object r8 = r1.A01
            X.3Uc r8 = (X.AnonymousClass3Uc) r8
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r6 = r8.A0T
            X.1EC r3 = r8.A0q
            X.00H r5 = r6.A09
            java.lang.Object r0 = r5.get()
            X.2lJ r0 = (X.C58822lJ) r0
            r10 = 0
            X.1Lt r0 = r0.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x070e }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x070e }
            java.lang.String r4 = "SELECT COUNT(DISTINCT group_jid)  as count FROM member_suggested_groups_v2 WHERE parent_group_jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x070e }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x070e }
            r7 = 0
            r1[r10] = r0     // Catch:{ all -> 0x070e }
            java.lang.String r0 = "GET_DISTINCT_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r4 = r9.A0A(r4, r0, r1)     // Catch:{ all -> 0x070e }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0707 }
            if (r0 == 0) goto L_0x0659
            java.lang.String r0 = "count"
            int r7 = X.C17890vO.A01(r4, r0)     // Catch:{ all -> 0x0707 }
        L_0x0659:
            r4.close()     // Catch:{ all -> 0x070e }
            r2.close()
            X.4XG r0 = r6.A06
            X.0ve r2 = r0.A01
            r1 = 8128(0x1fc0, float:1.139E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x06fb
            X.00H r0 = r6.A07
            java.lang.Object r0 = r0.get()
            X.1kV r0 = (X.C34451kV) r0
            X.1Lt r0 = r0.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x070e }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x070e }
            java.lang.String r4 = "SELECT suggested_groups_view_time_seconds FROM community_settings WHERE community_raw_jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x070e }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x070e }
            r1[r10] = r0     // Catch:{ all -> 0x070e }
            java.lang.String r0 = "CommunitySettingsStore/getSuggestedGroupsViewTime"
            android.database.Cursor r4 = r6.A0A(r4, r0, r1)     // Catch:{ all -> 0x070e }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0707 }
            r9 = 0
            if (r0 == 0) goto L_0x06a9
            java.lang.String r0 = "suggested_groups_view_time_seconds"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0707 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0707 }
            if (r0 != 0) goto L_0x06a9
            long r9 = r4.getLong(r1)     // Catch:{ all -> 0x0707 }
        L_0x06a9:
            r4.close()     // Catch:{ all -> 0x070e }
            r2.close()
            java.lang.Object r0 = r5.get()
            X.2lJ r0 = (X.C58822lJ) r0
            r1 = 0
            X.1Lt r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x06f4 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x06f4 }
            java.lang.String r5 = "SELECT COUNT(*) as count\n            FROM\n            member_suggested_groups_v2\n            WHERE parent_group_jid = ? \n              AND request_creation_time > ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x06f4 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x06f4 }
            r3 = 0
            r2[r1] = r0     // Catch:{ all -> 0x06f4 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x06f4 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x06f4 }
            java.lang.String r0 = "GET_NEW_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID_AFTER_TIME"
            android.database.Cursor r2 = r6.A0A(r5, r0, r2)     // Catch:{ all -> 0x06f4 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x06ed }
            if (r0 == 0) goto L_0x06e6
            java.lang.String r0 = "count"
            int r3 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x06ed }
        L_0x06e6:
            r2.close()     // Catch:{ all -> 0x06f4 }
            r4.close()
            goto L_0x06fc
        L_0x06ed:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x06ef }
        L_0x06ef:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x06f4 }
            throw r0     // Catch:{ all -> 0x06f4 }
        L_0x06f4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06f6 }
        L_0x06f6:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        L_0x06fb:
            r3 = 0
        L_0x06fc:
            X.4YA r0 = new X.4YA
            r0.<init>(r7, r3)
            r8.A02 = r0
        L_0x0703:
            r8.A0U()
            return
        L_0x0707:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0709 }
        L_0x0709:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x070e }
            throw r0     // Catch:{ all -> 0x070e }
        L_0x070e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0710 }
        L_0x0710:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0715:
            java.lang.Object r2 = r1.A01
            X.3Uc r2 = (X.AnonymousClass3Uc) r2
            X.10s r1 = r2.A10
            r0 = 16
            A00(r1, r2, r0)
            return
        L_0x0721:
            java.lang.Object r3 = r1.A01
            X.3p1 r3 = (X.C77033p1) r3
            X.C77033p1.A06(r3)
            X.1aA r2 = r3.A0s
            java.lang.String r1 = "community_events"
            r0 = 0
            boolean r0 = r2.A01(r0, r1)
            r3.A09 = r0
            int r1 = r3.A0B
            r0 = 1
            if (r1 == r0) goto L_0x0756
            X.0ve r2 = r3.A0i
            r1 = 8069(0x1f85, float:1.1307E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0756
            java.lang.String r0 = "CommunitySubgroupsViewModel/fetchParentGroupInfo/push only"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C77033p1.A05(r3)
        L_0x074c:
            X.C77033p1.A08(r3)
            X.C77033p1.A04(r3)
            X.C77033p1.A07(r3)
            return
        L_0x0756:
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper r5 = r3.A0o
            X.1EC r7 = r3.A0q
            X.4ni r6 = new X.4ni
            r6.<init>(r3)
            r8 = 0
            r10 = 0
            X.1OX r0 = r5.A04
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1 r4 = new com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequestAsync$1
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass3MX.A1Q(r4, r0)
            goto L_0x074c
        L_0x076d:
            java.lang.Object r1 = r1.A01
            X.3Uc r1 = (X.AnonymousClass3Uc) r1
            X.2l4 r0 = r1.A0V
            r0.A00()
            X.2je r0 = r1.A0U
            r0.A00()
            return
        L_0x077c:
            java.lang.Object r0 = r1.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.C77033p1.A03(r0)
        L_0x0783:
            r0.A0U()
            return
        L_0x0787:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r1 = r0.A01
            X.3Uc r1 = (X.AnonymousClass3Uc) r1
            r0 = 1
            r1.A09 = r0
            r1.A0U()
            return
        L_0x0796:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r0 = r0.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.C77033p1.A08(r0)
            return
        L_0x07a2:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r0 = r0.A01
            X.3p1 r0 = (X.C77033p1) r0
            goto L_0x07b6
        L_0x07ab:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r0 = r0.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.C77033p1.A04(r0)
        L_0x07b6:
            X.C77033p1.A07(r0)
            return
        L_0x07ba:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r0 = r0.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.C77033p1.A08(r0)
            r0.A0U()
            X.C77033p1.A06(r0)
            return
        L_0x07cc:
            java.lang.Object r0 = r1.A01
            X.4jh r0 = (X.C93884jh) r0
            java.lang.Object r0 = r0.A01
            X.3p1 r0 = (X.C77033p1) r0
            X.C77033p1.A07(r0)
            r0.A0T()
            return
        L_0x07db:
            java.lang.Object r4 = r1.A01
            X.3Uc r4 = (X.AnonymousClass3Uc) r4
            X.1QB r3 = r4.A0c
            X.1kb r1 = r4.A0N
            X.1EC r0 = r4.A0q
            java.util.List r0 = r1.A0A(r0)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x07f1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07fb
            X.C72463Mc.A1K(r2, r1)
            goto L_0x07f1
        L_0x07fb:
            int r0 = r3.A07(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            r4.A0U()
            return
        L_0x0809:
            java.lang.Object r3 = r1.A01
            X.3VJ r3 = (X.AnonymousClass3VJ) r3
            X.0ve r2 = r3.A0H
            r1 = 7983(0x1f2f, float:1.1187E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x082c
            X.1kb r0 = r3.A03
            X.1MG r0 = r0.A08
            r0.A04()
            java.util.Map r0 = r0.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x082c
            r0 = 1
            X.AnonymousClass3VJ.A04(r3, r0)
        L_0x082c:
            X.1kb r0 = r3.A03
            X.1QW r0 = r0.A03
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r7 = r0.iterator()
        L_0x0838:
            boolean r0 = r7.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x089a
            X.1BI r1 = X.C17880vN.A0Q(r7)
            X.1CJ r0 = r3.A0B
            X.1ci r4 = r0.A0A(r1)
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass3MW.A0f(r1)
            if (r4 == 0) goto L_0x0838
            if (r5 == 0) goto L_0x0838
            java.util.Map r0 = r3.A0W
            java.util.ArrayList r1 = X.AnonymousClass3VJ.A00(r3, r4, r0)
            if (r1 == 0) goto L_0x0869
            java.util.Comparator r0 = r3.A0U
            java.util.Collections.sort(r1, r0)
            java.util.Map r0 = r3.A0V
            r0.put(r4, r1)
            int r0 = r1.size()
            if (r0 != r6) goto L_0x0838
        L_0x0869:
            X.1xo r2 = r3.A0M
            int r1 = r4.A03
            if (r1 == r6) goto L_0x0873
            r0 = 3
            if (r1 == r0) goto L_0x0873
            goto L_0x0838
        L_0x0873:
            X.1M9 r1 = r2.A00
            X.1BI r0 = r4.A08()
            X.1E7 r0 = r1.A0H(r0)
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0838
            X.4ZH r0 = r3.A04
            java.util.Set r0 = r0.A01
            r0.add(r5)
            java.util.Map r1 = r3.A0V
            java.lang.Object r0 = r1.get(r4)
            if (r0 != 0) goto L_0x0838
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r4, r0)
            goto L_0x0838
        L_0x089a:
            X.AnonymousClass3VJ.A04(r3, r6)
            X.1KB r2 = r3.A01
            r1 = 36
            X.4rf r0 = new X.4rf
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x08aa:
            java.lang.Object r2 = r1.A01
            X.3VJ r2 = (X.AnonymousClass3VJ) r2
            X.1lp r1 = r2.A0N
            X.4Kx r0 = r2.A05
            r1.registerObserver(r0)
            X.1NN r1 = r2.A0D
            X.1Nk r0 = r2.A0C
            r1.registerObserver(r0)
            X.1tB r1 = r2.A0L
            X.1k6 r0 = r2.A0K
            r1.registerObserver(r0)
            X.1Ng r1 = r2.A0J
            X.1Nj r0 = r2.A0I
            r1.registerObserver(r0)
            X.1Lg r1 = r2.A0G
            X.1WR r0 = r2.A0F
            r1.registerObserver(r0)
            X.1Lf r1 = r2.A08
            X.1Gv r0 = r2.A07
            r1.registerObserver(r0)
            X.4ZH r0 = r2.A04
            X.1NN r1 = r0.A03
            X.1Nk r0 = r0.A02
            r1.registerObserver(r0)
            X.1Q1 r1 = r2.A0A
            X.1ap r0 = r2.A09
            r1.registerObserver(r0)
            return
        L_0x08e9:
            java.lang.Object r0 = r1.A01
            X.411 r0 = (X.AnonymousClass411) r0
            java.lang.Object r3 = r0.A01
            X.3VJ r3 = (X.AnonymousClass3VJ) r3
            X.00H r0 = r3.A0S
            java.lang.Object r1 = r0.get()
            X.4Q3 r1 = (X.AnonymousClass4Q3) r1
            java.lang.String r0 = "CommunitySharedPrefs/ setSimplifyCommunityCreationDismissed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vl r0 = r1.A01
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r0)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "simplified_community_creation_banner_dismissed"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
            X.AnonymousClass3VJ.A04(r3, r0)
            return
        L_0x0911:
            java.lang.Object r1 = r1.A01
            X.3VM r1 = (X.AnonymousClass3VM) r1
            r0 = 0
            goto L_0x0938
        L_0x0917:
            java.lang.Object r0 = r1.A01
            X.3VM r0 = (X.AnonymousClass3VM) r0
            X.1kb r2 = r0.A0J
            X.1EC r1 = r0.A0a
            r0 = 3
        L_0x0920:
            r2.A0J(r1, r0)
            return
        L_0x0924:
            java.lang.Object r0 = r1.A01
            X.3VM r0 = (X.AnonymousClass3VM) r0
            r1 = 4
            X.1vp r0 = r0.A0d
            X.AnonymousClass3MX.A1K(r0, r1)
            return
        L_0x092f:
            java.lang.Object r0 = r1.A01
            X.4k4 r0 = (X.C94114k4) r0
            java.lang.Object r1 = r0.A01
            X.3VM r1 = (X.AnonymousClass3VM) r1
            r0 = 1
        L_0x0938:
            r1.A0U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98754rf.run():void");
    }
}
