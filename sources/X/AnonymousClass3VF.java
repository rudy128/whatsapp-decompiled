package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3VF  reason: invalid class name */
public class AnonymousClass3VF extends AnonymousClass1J2 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C27161Uy A02;
    public final C36531o3 A03;
    public final AnonymousClass1CJ A04;
    public final AnonymousClass1MZ A05;
    public final AnonymousClass1EC A06;
    public final AnonymousClass3TD A07 = new AnonymousClass1DS();
    public final AnonymousClass3TD A08 = new AnonymousClass1DS();
    public final AnonymousClass3TD A09 = new AnonymousClass1DS();
    public final AnonymousClass3TD A0A = new AnonymousClass1DS();
    public final AnonymousClass3TD A0B = new AnonymousClass1DS();
    public final C36401np A0C;
    public final C41111vp A0D;
    public final C41111vp A0E;
    public final AnonymousClass10I A0F;
    public final C84294Iy A0G;
    public final C23581Gv A0H;
    public final C24671Lf A0I;
    public final C53112c0 A0J;
    public final AnonymousClass11P A0K;
    public final C195899u7 A0L;
    public final C194389re A0M;
    public final AnonymousClass1MX A0N;
    public final C41011vf A0O;
    public final C41001ve A0P;
    public final AnonymousClass1HB A0Q;

    public static void A00(C133356oc r1, AnonymousClass3VF r2) {
        AnonymousClass4NO r0 = (AnonymousClass4NO) r2.A07.A06();
        if (r0 != null) {
            AnonymousClass1E7.A03(r1, r0.A00);
            AnonymousClass3TD r12 = r2.A0B;
            Object A062 = r12.A06();
            if (A062 != null) {
                r12.A0E(A062);
            }
            AnonymousClass3TD r13 = r2.A08;
            Object A063 = r13.A06();
            if (A063 != null) {
                r13.A0E(A063);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008f, code lost:
        if (r11.A01 != 2) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dd, code lost:
        if (r0 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b8, code lost:
        if (r3 != null) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a5 A[LOOP:5: B:101:0x029f->B:103:0x02a5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass3VF r18) {
        /*
            r9 = r18
            X.1HB r0 = r9.A0Q
            java.lang.String r1 = "fetching_group_participants"
            X.19a r8 = r0.A01
            r8.A07(r1)
            X.1MZ r7 = r9.A05
            X.1EC r4 = r9.A06
            X.1MW r0 = r7.A08
            X.2tp r0 = r0.A0B(r4)
            r8.A06(r1)
            java.lang.String r1 = "deduplicate_participants"
            r8.A07(r1)
            X.10f r11 = X.C72483Me.A0O(r0)
            int r0 = r11.size()
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r0)
            r8.A06(r1)
            java.lang.String r5 = "convert_jid_to_contact"
            r8.A07(r5)
            java.util.HashSet r2 = X.C17880vN.A12()
            X.1IZ r1 = r11.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()
            X.2sr r0 = (X.C63312sr) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r2.add(r0)
            goto L_0x003a
        L_0x004c:
            java.util.HashSet r3 = X.C17880vN.A12()
            X.1M9 r10 = r9.A01
            java.util.HashMap r18 = r10.A0Q(r2)
            r8.A06(r5)
            java.util.HashSet r1 = X.C17880vN.A12()
            java.lang.String r6 = "create_admin_list"
            r8.A07(r6)
            X.1IZ r17 = r11.iterator()
            r2 = 0
        L_0x0067:
            boolean r0 = r17.hasNext()
            r14 = 1
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r11 = r17.next()
            X.2sr r11 = (X.C63312sr) r11
            com.whatsapp.jid.UserJid r5 = r11.A04
            r0 = r18
            java.lang.Object r13 = r0.get(r5)
            X.1E7 r13 = (X.AnonymousClass1E7) r13
            if (r13 == 0) goto L_0x0091
            X.1yf r0 = r13.A0G
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0091
            int r15 = r11.A01
            r0 = 2
            r16 = 1
            if (r15 == r0) goto L_0x0093
        L_0x0091:
            r16 = 0
        L_0x0093:
            r2 = r2 | r16
            if (r13 != 0) goto L_0x0098
            r14 = 0
        L_0x0098:
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Contact with "
            r15.append(r0)
            r15.append(r5)
            java.lang.String r0 = " is null"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r15)
            X.C17960vV.A0F(r14, r0)
            r12.add(r13)
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00bd
            com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r13)
            r3.add(r0)
        L_0x00bd:
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0067
            r1.add(r5)
            goto L_0x0067
        L_0x00c5:
            r8.A06(r6)
            java.lang.String r5 = "sort_participants"
            r8.A07(r5)
            X.2c0 r11 = r9.A0J
            int r6 = r12.size()
            r0 = 3
            if (r6 >= r0) goto L_0x00df
            X.1CJ r0 = r11.A00
            boolean r0 = r0.A0R(r4)
            r11 = 1
            if (r0 == 0) goto L_0x00e0
        L_0x00df:
            r11 = 7
        L_0x00e0:
            X.4Iy r0 = r9.A0G
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.11S r6 = X.AnonymousClass10E.A17(r0)
            X.1Me r0 = X.AnonymousClass3MZ.A0g(r0)
            X.4NN r13 = new X.4NN
            r13.<init>(r6, r0, r11)
            X.11S r0 = r13.A01
            X.1Me r11 = r13.A02
            X.4s2 r6 = new X.4s2
            r6.<init>((X.AnonymousClass11S) r0, (X.C24921Me) r11, (X.AnonymousClass4NN) r13, (java.util.HashSet) r1)
            java.util.ArrayList r15 = X.C29351c6.A0D(r12)
            java.util.Iterator r16 = r12.iterator()
        L_0x0104:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x011e
            X.1E7 r12 = X.C17880vN.A0O(r16)
            int r1 = r13.A00
            r0 = 0
            X.1yg r1 = r11.A0F(r12, r1, r0, r0)
            X.4Tf r0 = new X.4Tf
            r0.<init>(r1, r12)
            r15.add(r0)
            goto L_0x0104
        L_0x011e:
            java.util.List r0 = X.C29431cG.A0y(r15, r6)
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x012a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r1.next()
            X.4Tf r0 = (X.C86824Tf) r0
            X.1E7 r0 = r0.A01
            r6.add(r0)
            goto L_0x012a
        L_0x013c:
            X.3TD r1 = r9.A07
            X.4NO r0 = new X.4NO
            r0.<init>(r6, r3, r2)
            r1.A0E(r0)
            r8.A06(r5)
            java.lang.String r5 = "load_past_participants"
            r8.A07(r5)
            X.1MX r11 = r9.A0N
            X.0ve r2 = r11.A02
            r0 = 1613(0x64d, float:2.26E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 1527(0x5f7, float:2.14E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x01d1
            X.1CJ r0 = r9.A04
            int r1 = r0.A06(r4)
            r0 = 3
            if (r1 != r0) goto L_0x0173
            boolean r0 = r7.A0K(r4)
            if (r0 == 0) goto L_0x01d1
        L_0x0173:
            X.11P r0 = r9.A0K
            long r2 = X.AnonymousClass11P.A01(r0)
            r0 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r2 = r2 - r0
            X.1DL r0 = r11.A00
            long r0 = r0.A09(r4)
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]
            r13 = 0
            X.C17880vN.A1V(r12, r13, r0)
            X.C17880vN.A1V(r12, r14, r2)
            X.1Cd r0 = r11.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01c7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01c7 }
            java.lang.String r1 = "SELECT group_jid_row_id, user_jid_row_id, is_leave, timestamp FROM group_past_participant_user WHERE group_jid_row_id = ? AND timestamp >= ? ORDER BY timestamp DESC"
            java.lang.String r0 = "GET_GROUP_PAST_PARTICIPANT_USERS_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r12)     // Catch:{ all -> 0x01c7 }
            java.util.ArrayList r0 = X.AnonymousClass1MX.A00(r2)     // Catch:{ all -> 0x01bb }
            if (r2 == 0) goto L_0x01ab
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x01ab:
            r3.close()
            java.util.HashMap r0 = X.AnonymousClass1MX.A01(r11, r0)
            java.lang.Object r3 = r0.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x01d1
            goto L_0x01d5
        L_0x01bb:
            r1 = move-exception
            if (r2 == 0) goto L_0x01c6
            r2.close()     // Catch:{ all -> 0x01c2 }
            goto L_0x01c6
        L_0x01c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01c7 }
        L_0x01c6:
            throw r1     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01cc }
            throw r1
        L_0x01cc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x01d1:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x01d5:
            r8.A06(r5)
            java.lang.String r5 = "create_participants_items"
            r8.A07(r5)
            java.util.ArrayList r12 = X.AnonymousClass000.A14(r6)
            java.util.Iterator r13 = r6.iterator()
        L_0x01e5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x021f
            X.1E7 r2 = X.C17880vN.A0O(r13)
            X.11S r0 = r9.A00
            boolean r11 = X.AnonymousClass3Ma.A1V(r0, r2)
            X.1CJ r0 = r9.A04
            int r1 = r0.A06(r4)
            r0 = 3
            if (r1 != r0) goto L_0x021d
            boolean r0 = r7.A0K(r4)
            if (r0 != 0) goto L_0x021d
            com.whatsapp.jid.Jid r0 = X.C72453Mb.A0m(r2)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r7.A0Q(r4, r0)
            if (r0 != 0) goto L_0x0212
            if (r11 == 0) goto L_0x01e5
        L_0x0212:
            r1 = r11 ^ 1
        L_0x0214:
            X.40a r0 = new X.40a
            r0.<init>(r2, r1)
            r12.add(r0)
            goto L_0x01e5
        L_0x021d:
            r1 = 1
            goto L_0x0214
        L_0x021f:
            boolean r1 = X.AnonymousClass000.A1a(r3)
            java.util.ArrayList r11 = X.C17880vN.A10(r12)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0235
            X.4nX r0 = new X.4nX
            r0.<init>()
            r11.add(r0)
        L_0x0235:
            if (r1 == 0) goto L_0x023f
            X.4nU r0 = new X.4nU
            r0.<init>()
            r11.add(r0)
        L_0x023f:
            boolean r7 = X.AnonymousClass000.A1a(r3)
            int r1 = r12.size()
            r0 = 11
            if (r1 <= r0) goto L_0x02be
            r0 = 0
            r7 = 10
            java.util.List r0 = r12.subList(r0, r7)
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
            int r1 = r12.size()
            int r1 = r1 - r7
            X.4nV r0 = new X.4nV
            r0.<init>(r1)
        L_0x0260:
            r2.add(r0)
        L_0x0263:
            X.3TD r0 = r9.A0B
            r0.A0E(r2)
            X.3TD r0 = r9.A08
            r0.A0E(r11)
            int r2 = r6.size()
            X.1CJ r0 = r9.A04
            int r1 = r0.A06(r4)
            r0 = 3
            if (r1 != r0) goto L_0x028a
            X.1Uy r0 = r9.A02
            java.lang.Integer r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x028a
            int r0 = r0.intValue()
            int r2 = java.lang.Math.max(r2, r0)
        L_0x028a:
            X.1vp r0 = r9.A0D
            X.AnonymousClass3MX.A1K(r0, r2)
            r8.A06(r5)
            java.lang.String r7 = "create_past_participants"
            r8.A07(r7)
            java.util.ArrayList r6 = X.AnonymousClass000.A14(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x029f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r1 = r5.next()
            X.4O4 r1 = (X.AnonymousClass4O4) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            X.1E7 r4 = r10.A0H(r0)
            boolean r3 = r1.A02
            long r1 = r1.A00
            X.40b r0 = new X.40b
            r0.<init>(r4, r1, r3)
            r6.add(r0)
            goto L_0x029f
        L_0x02be:
            java.util.ArrayList r2 = X.C17880vN.A10(r12)
            if (r7 == 0) goto L_0x0263
            X.4nU r0 = new X.4nU
            r0.<init>()
            goto L_0x0260
        L_0x02ca:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x02d8
            X.4nX r0 = new X.4nX
            r0.<init>()
            r6.add(r0)
        L_0x02d8:
            X.3TD r0 = r9.A09
            r0.A0E(r6)
            r8.A06(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VF.A03(X.3VF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass3VF r6) {
        /*
            X.1vp r5 = r6.A0E
            X.1MZ r0 = r6.A05
            X.1EC r3 = r6.A06
            boolean r0 = r0.A0K(r3)
            if (r0 == 0) goto L_0x0016
            X.9u7 r0 = r6.A0L
            int r6 = r0.A00(r3)
        L_0x0012:
            X.AnonymousClass3MX.A1K(r5, r6)
            return
        L_0x0016:
            X.9re r2 = r6.A0M
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = r3.getRawString()
            r6 = 0
            r4[r1] = r0
            X.1Lt r0 = r2.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0053 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM non_admin_group_membership_approval_requests WHERE group_jid = ?"
            java.lang.String r0 = "get_count_non_admin_gjr"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x0053 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "count"
            int r6 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x004c }
        L_0x0045:
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()
            goto L_0x0012
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VF.A04(X.3VF):void");
    }

    public void A0S() {
        this.A0P.unregisterObserver(this.A0O);
        this.A0I.unregisterObserver(this.A0H);
    }

    public void A0T() {
        this.A0F.CGN(new C21355Aik(this, 24));
    }

    public boolean A0U(UserJid userJid) {
        AnonymousClass4NO r0 = (AnonymousClass4NO) this.A07.A06();
        if (r0 == null || !r0.A01.contains(userJid)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.3TD, X.1DS] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.3TD, X.1DS] */
    public AnonymousClass3VF(C84294Iy r5, AnonymousClass11S r6, AnonymousClass1M9 r7, C24671Lf r8, C53112c0 r9, C27161Uy r10, C36531o3 r11, AnonymousClass11P r12, AnonymousClass1CJ r13, C195899u7 r14, AnonymousClass1MZ r15, C194389re r16, AnonymousClass1MX r17, C41001ve r18, AnonymousClass1EC r19, AnonymousClass1HB r20, C36401np r21, AnonymousClass10I r22) {
        Integer A0f = AnonymousClass3MY.A0f();
        this.A0D = AnonymousClass3MW.A0n(A0f);
        this.A0E = AnonymousClass3MW.A0n(A0f);
        AnonymousClass40c r2 = new AnonymousClass40c(this, 1);
        this.A0O = r2;
        C94174kA r0 = new C94174kA(this, 8);
        this.A0H = r0;
        this.A0K = r12;
        this.A0C = r21;
        this.A00 = r6;
        this.A0F = r22;
        this.A04 = r13;
        this.A01 = r7;
        this.A0I = r8;
        this.A0M = r16;
        C41001ve r3 = r18;
        this.A0P = r3;
        this.A03 = r11;
        this.A0J = r9;
        this.A05 = r15;
        this.A0N = r17;
        this.A02 = r10;
        this.A0L = r14;
        this.A0G = r5;
        this.A06 = r19;
        this.A0Q = r20;
        r3.registerObserver(r2);
        r8.registerObserver(r0);
    }
}
