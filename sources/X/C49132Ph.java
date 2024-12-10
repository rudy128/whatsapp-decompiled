package X;

import java.util.List;

/* renamed from: X.2Ph  reason: invalid class name and case insensitive filesystem */
public class C49132Ph extends A34 {
    public final C18000vb A00;
    public final AnonymousClass1QB A01;
    public final AnonymousClass1QS A02;
    public final C188079gq A03;
    public final C189629jY A04;
    public final C193179pf A05;
    public final AnonymousClass1R2 A06;
    public final String A07;
    public final boolean A08 = true;
    public final boolean A09;

    public C49132Ph(C18000vb r2, AnonymousClass1QB r3, AnonymousClass1QS r4, C188079gq r5, C189629jY r6, C193179pf r7, AnonymousClass1R2 r8, String str, boolean z) {
        this.A07 = str;
        this.A09 = z;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r20) {
        /*
            r19 = this;
            r3 = r19
            boolean r0 = r3.A09
            r5 = 1
            X.9gq r7 = r3.A03
            if (r0 == 0) goto L_0x0050
            r7.A05 = r5
        L_0x000b:
            X.0vb r0 = r3.A00
            X.1jz r2 = new X.1jz
            r2.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A07 = r0
            r2.A05 = r7
            r0 = 100
            r2.A01 = r0
            java.lang.String r4 = r3.A07
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0029
            r2.A05(r4)
        L_0x0029:
            X.1QB r1 = r3.A01
            r0 = 0
            android.util.Pair r0 = r1.A08(r0, r2, r0)
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            X.206 r0 = X.C17880vN.A0Y(r1)
            X.AW0 r0 = X.AnonymousClass25B.A00(r0)
            if (r0 == 0) goto L_0x003c
            r2.add(r0)
            goto L_0x003c
        L_0x0050:
            r7.A04 = r5
            goto L_0x000b
        L_0x0053:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x01a6
            X.1QS r0 = r3.A02
            X.AnonymousClass1QS.A00(r0)
            X.1QR r6 = r0.A04
            android.util.Pair r7 = X.AnonymousClass1QR.A06(r6, r7)
            java.lang.String[] r1 = new java.lang.String[r5]
            r0 = 12
            java.lang.String r11 = java.lang.Integer.toString(r0)
            r9 = 0
            r1[r9] = r11
            java.lang.String r0 = "(status!=? AND interop_id IS NULL AND (metadata LIKE '%\"messageDeleted\":true%' ))"
            android.util.Pair r8 = android.util.Pair.create(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.lang.String r10 = " )"
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r9] = r11
            java.lang.String r0 = "( status!=? AND interop_id IS NOT NULL )"
            android.util.Pair r9 = android.util.Pair.create(r5, r0)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "(( "
            r5.append(r0)
            java.lang.Object r0 = r9.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " OR "
            r5.append(r0)
            java.lang.Object r0 = r8.second
            java.lang.String r0 = (java.lang.String) r0
            r5.append(r0)
            java.lang.String r0 = " ) AND "
            r5.append(r0)
            java.lang.Object r0 = r7.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r13 = X.AnonymousClass001.A1H(r0, r10, r5)
            java.lang.Object r0 = r9.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass1QR.A0A(r6)
            X.1DL r0 = r6.A02
            r0.A09(r5)
            r5.getRawString()
            java.lang.Object r0 = r8.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.Object r0 = r7.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            java.lang.String r11 = "pay_transaction"
            java.lang.String[] r12 = X.AnonymousClass1QR.A0D
            java.lang.String r18 = "readMessagelessPayments/QUERY_PAY_TRANSACTION"
            X.1Cd r0 = r6.A03     // Catch:{ Exception -> 0x0131 }
            X.1at r9 = r0.get()     // Catch:{ Exception -> 0x0131 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0127 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x0127 }
            r0 = 0
            java.lang.String[] r14 = X.C17890vO.A1b(r1, r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r16 = "init_timestamp DESC"
            r15 = 0
            r17 = r15
            android.database.Cursor r8 = r10.A0B(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0127 }
            if (r8 == 0) goto L_0x0123
            java.lang.String r0 = "readMessagelessPayments"
            java.util.ArrayList r5 = X.AnonymousClass1QR.A0B(r8, r6, r0)     // Catch:{ all -> 0x0119 }
            X.1QE r7 = r6.A04     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "readMessagelessPayments returned: "
            X.C17890vO.A14(r0, r1, r5)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0119 }
            X.AnonymousClass1QE.A02(r7, r15, r0)     // Catch:{ all -> 0x0119 }
            r8.close()     // Catch:{ all -> 0x0127 }
            r9.close()     // Catch:{ Exception -> 0x0131 }
            goto L_0x013d
        L_0x0119:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0127 }
        L_0x0122:
            throw r1     // Catch:{ all -> 0x0127 }
        L_0x0123:
            r9.close()     // Catch:{ Exception -> 0x0131 }
            goto L_0x0139
        L_0x0127:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x012c }
            goto L_0x0130
        L_0x012c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0131 }
        L_0x0130:
            throw r1     // Catch:{ Exception -> 0x0131 }
        L_0x0131:
            r5 = move-exception
            X.1QE r1 = r6.A04
            java.lang.String r0 = "PaymentTransactionStore/readMessagelessPayments "
            r1.A0A(r0, r5)
        L_0x0139:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
        L_0x013d:
            java.util.Iterator r8 = r5.iterator()
        L_0x0141:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r6 = r8.next()
            X.AW0 r6 = (X.AW0) r6
            X.8pG r7 = r6.A0A
            X.C17960vV.A07(r7)
            boolean r1 = r6.A0K()
            boolean r0 = r6.A0Q
            r1 = r1 ^ r0
            if (r1 == 0) goto L_0x0191
            java.lang.String r1 = r7.A0G()
        L_0x015f:
            X.C17960vV.A07(r1)
            X.1KN r0 = r6.A09
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0177
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x017a
        L_0x0177:
            r2.add(r6)
        L_0x017a:
            boolean r0 = r6.A0P
            if (r0 != 0) goto L_0x0141
            X.1R2 r1 = r3.A06
            r0 = 0
            java.lang.String r0 = r1.A0a(r6, r0)
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0141
            r2.add(r6)
            goto L_0x0141
        L_0x0191:
            java.lang.String r1 = r7.A0I()
            goto L_0x015f
        L_0x0196:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01a6
            r1 = 39
            X.Akr r0 = new X.Akr
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
        L_0x01a6:
            X.9pf r0 = r3.A05
            java.util.ArrayList r1 = r0.A02(r2)
            X.0yx r0 = new X.0yx
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132Ph.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r6 = (C19760yx) obj;
        C189629jY r4 = this.A04;
        String str = this.A07;
        C188079gq r2 = this.A03;
        Object obj2 = r6.A00;
        C17960vV.A07(obj2);
        Object obj3 = r6.A01;
        C17960vV.A07(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
