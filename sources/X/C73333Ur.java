package X;

import com.whatsapp.event.EventsViewModel$1;
import java.util.List;

/* renamed from: X.3Ur  reason: invalid class name and case insensitive filesystem */
public final class C73333Ur extends AnonymousClass1J2 {
    public final C34511kb A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass1CJ A02;
    public final C88194Yr A03;
    public final AnonymousClass1BI A04;
    public final C18600wl A05;
    public final AnonymousClass1G1 A06;
    public final C24681Lg A07;
    public final AnonymousClass1WS A08;
    public final AnonymousClass1G4 A09;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.3y5, X.4Lh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ea, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ed, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C73333Ur r10) {
        /*
            X.1BI r2 = r10.A04
            boolean r0 = r2 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x00b7
            X.1CJ r1 = r10.A02
            r0 = r2
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A06(r0)
            r0 = 1
            if (r1 != r0) goto L_0x00b7
            X.1kb r0 = r10.A00
            X.1EC r2 = (X.AnonymousClass1EC) r2
            java.util.HashSet r0 = r0.A08(r2)
            X.4Yr r6 = r10.A03
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002e
            X.C72463Mc.A1K(r7, r1)
            goto L_0x0024
        L_0x002e:
            X.00H r0 = r6.A04
            java.lang.Object r5 = r0.get()
            X.2r4 r5 = (X.C62232r4) r5
            int r4 = r7.size()
            java.lang.String[] r3 = new java.lang.String[r4]
            r2 = 0
        L_0x003d:
            if (r2 >= r4) goto L_0x004d
            X.1LW r1 = r5.A00
            java.lang.Object r0 = r7.get(r2)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.AnonymousClass1LW.A03(r1, r0, r3, r2)
            int r2 = r2 + 1
            goto L_0x003d
        L_0x004d:
            r0 = 975(0x3cf, float:1.366E-42)
            X.23b r1 = new X.23b
            r1.<init>(r3, r0)
            X.1Cd r0 = r5.A02
            X.1at r4 = r0.get()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01e7 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x01e7 }
        L_0x0062:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x01e7 }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x01e7 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01e7 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x01e7 }
            int r1 = r7.size()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "?"
            java.util.List r2 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x01e7 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r2 = X.C29431cG.A0h(r1, r2, r0)     // Catch:{ all -> 0x01e7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "\n        SELECT DISTINCT message_row_id\n        FROM message_event\n        WHERE\n            chat_row_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x01e7 }
            r1.append(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = ")\n        ORDER BY start_time\n        DESC\n        LIMIT 1000\n        "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = X.AnonymousClass1Y7.A01(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHATS_QUERY_ID"
            android.database.Cursor r2 = r3.A0A(r1, r0, r8)     // Catch:{ all -> 0x01e7 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x01e0 }
            X.C62232r4.A00(r2, r5)     // Catch:{ all -> 0x01e0 }
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ all -> 0x01e7 }
            goto L_0x0062
        L_0x00af:
            r4.close()
            java.util.ArrayList r0 = X.C88194Yr.A00(r6, r5)
            goto L_0x00f7
        L_0x00b7:
            X.4Yr r6 = r10.A03
            X.00H r0 = r6.A04
            java.lang.Object r5 = r0.get()
            X.2r4 r5 = (X.C62232r4) r5
            r4 = 0
            X.1LW r0 = r5.A00
            long r1 = r0.A09(r2)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            X.C17880vN.A1V(r3, r4, r1)
            X.1Cd r0 = r5.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01e7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\nORDER BY start_time\nDESC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x01e7 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x01e0 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01e0 }
            X.C62232r4.A00(r2, r0)     // Catch:{ all -> 0x01e0 }
            if (r2 == 0) goto L_0x00f0
            r2.close()     // Catch:{ all -> 0x01e7 }
        L_0x00f0:
            r4.close()
            java.util.ArrayList r0 = X.C88194Yr.A00(r6, r0)
        L_0x00f7:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0107:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r1 = r2.next()
            X.23z r1 = (X.C445823z) r1
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0121
            boolean r0 = r6.A04(r1)
            if (r0 != 0) goto L_0x0121
            r3.add(r1)
            goto L_0x0107
        L_0x0121:
            r5.add(r1)
            goto L_0x0107
        L_0x0125:
            java.util.List r0 = X.C29431cG.A0r(r3)
            java.util.Iterator r4 = r0.iterator()
        L_0x012d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r3 = r4.next()
            X.23z r3 = (X.C445823z) r3
            X.4Ct r2 = X.C82944Ct.UPCOMING
            X.24H r0 = r6.A01(r3)
            if (r0 == 0) goto L_0x014c
            X.2Qx r1 = r0.A02
        L_0x0143:
            X.3y6 r0 = new X.3y6
            r0.<init>(r2, r3, r1)
            r8.add(r0)
            goto L_0x012d
        L_0x014c:
            r1 = 0
            goto L_0x0143
        L_0x014e:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x019b
            X.118 r9 = r10.A01
            r0 = 2131888137(0x7f120809, float:1.94109E38)
            java.lang.String r1 = X.C18070vi.A0G(r9, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.3y5 r7 = new X.3y5
            r7.<init>(r0)
            r7.A00 = r1
            r8.add(r7)
            java.util.Iterator r6 = r5.iterator()
            r5 = 0
            r4 = 0
        L_0x016f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r3 = r6.next()
            X.23z r3 = (X.C445823z) r3
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x018c
            X.4Ct r2 = X.C82944Ct.CANCELED
            r5 = 1
        L_0x0182:
            r1 = 0
            X.3y6 r0 = new X.3y6
            r0.<init>(r2, r3, r1)
            r8.add(r0)
            goto L_0x016f
        L_0x018c:
            X.4Ct r2 = X.C82944Ct.PAST
            r4 = 1
            goto L_0x0182
        L_0x0190:
            if (r5 != 0) goto L_0x01da
            r0 = 2131888136(0x7f120808, float:1.9410899E38)
        L_0x0195:
            java.lang.String r0 = X.C18070vi.A0G(r9, r0)
            r7.A00 = r0
        L_0x019b:
            X.1G4 r6 = r10.A09
        L_0x019d:
            java.lang.Object r5 = r6.getValue()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r8.iterator()
        L_0x01a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c6
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.4Lh r1 = (X.C84904Lh) r1
            boolean r0 = r1 instanceof X.C80793y6
            if (r0 == 0) goto L_0x01a9
            X.3y6 r1 = (X.C80793y6) r1
            X.4Ct r1 = r1.A00
            X.4Ct r0 = X.C82944Ct.UPCOMING
            if (r1 != r0) goto L_0x01a9
            r4.add(r2)
            goto L_0x01a9
        L_0x01c6:
            int r0 = r4.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.4YB r0 = new X.4YB
            r0.<init>(r1, r8)
            boolean r0 = r6.BFK(r5, r0)
            if (r0 == 0) goto L_0x019d
            return
        L_0x01da:
            if (r4 != 0) goto L_0x019b
            r0 = 2131888127(0x7f1207ff, float:1.941088E38)
            goto L_0x0195
        L_0x01e0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01e2 }
        L_0x01e2:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x01e7 }
            throw r0     // Catch:{ all -> 0x01e7 }
        L_0x01e7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73333Ur.A00(X.3Ur):void");
    }

    public void A0S() {
        this.A07.unregisterObserver(this.A08);
    }

    public C73333Ur(C34511kb r5, AnonymousClass118 r6, AnonymousClass1CJ r7, C24681Lg r8, C88194Yr r9, AnonymousClass1BI r10, C18600wl r11) {
        C18070vi.A0w(r6, r7, r8, r9, r5);
        C18070vi.A0d(r11, 6);
        this.A01 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A03 = r9;
        this.A00 = r5;
        this.A05 = r11;
        this.A04 = r10;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4YB((Integer) null, (List) null));
        this.A09 = A18;
        this.A06 = A18;
        C95514mM r2 = new C95514mM(this, 4);
        this.A08 = r2;
        AnonymousClass3MW.A1X(r11, new EventsViewModel$1(this, (C30391dr) null), C41561wd.A00(this));
        r8.registerObserver(r2);
    }
}
