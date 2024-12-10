package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.List;

/* renamed from: X.9BQ  reason: invalid class name */
public final class AnonymousClass9BQ extends A34 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1QR A01;
    public final C184889bg A02;

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0277, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0280, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        if (r4 != null) goto L_0x0185;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r27) {
        /*
            r26 = this;
            r6 = r26
            X.1QR r2 = r6.A01
            r3 = 4
            java.util.ArrayList r1 = r2.A0Q()
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
            boolean r4 = X.C17880vN.A1X(r1)
            if (r4 == 0) goto L_0x019c
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.1M9 r0 = r6.A00
            r0.A0u(r5)
            java.util.LinkedHashMap r0 = X.C17880vN.A13()
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x005b
            java.util.HashMap r7 = X.C17880vN.A11()
            java.util.Iterator r5 = r5.iterator()
        L_0x002e:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0038
            X.AnonymousClass8BY.A1M(r7, r5)
            goto L_0x002e
        L_0x0038:
            java.util.Iterator r6 = r1.iterator()
        L_0x003c:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r6.next()
            X.Aia r4 = (X.C21346Aia) r4
            com.whatsapp.jid.UserJid r5 = r4.A04
            java.lang.String r4 = X.C72463Mc.A0n(r5)
            java.lang.Object r4 = r7.get(r4)
            if (r4 == 0) goto L_0x003c
            X.C18070vi.A0b(r5)
            r0.put(r5, r4)
            goto L_0x003c
        L_0x005b:
            boolean r4 = X.AnonymousClass8BR.A1Y(r0)
            if (r4 == 0) goto L_0x019c
            java.util.Set r4 = r0.keySet()
            java.util.ArrayList r9 = X.C29431cG.A0m(r4)
            monitor-enter(r2)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "status =? AND type=? AND receiver_jid_row_id IN ("
            r8.append(r4)     // Catch:{ all -> 0x0199 }
            int r7 = r9.size()     // Catch:{ all -> 0x0199 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0199 }
            r5 = 0
        L_0x007c:
            if (r5 >= r7) goto L_0x008f
            java.lang.String r4 = "?"
            r6.append(r4)     // Catch:{ all -> 0x0199 }
            int r4 = r7 + -1
            if (r5 == r4) goto L_0x008c
            java.lang.String r4 = ","
            r6.append(r4)     // Catch:{ all -> 0x0199 }
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x007c
        L_0x008f:
            X.AnonymousClass8BS.A1D(r6, r8)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = ") AND "
            r8.append(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "sender_jid_row_id"
            r8.append(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = " =?"
            java.lang.String r12 = X.AnonymousClass000.A0y(r4, r8)     // Catch:{ all -> 0x0199 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0199 }
            r4 = 405(0x195, float:5.68E-43)
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0199 }
            r7.add(r4)     // Catch:{ all -> 0x0199 }
            r4 = 1
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0199 }
            r7.add(r4)     // Catch:{ all -> 0x0199 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0199 }
            java.util.Iterator r6 = r9.iterator()     // Catch:{ all -> 0x0199 }
        L_0x00bf:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x0199 }
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0199 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x0199 }
            X.1DL r4 = r2.A02     // Catch:{ all -> 0x0199 }
            long r4 = r4.A09(r5)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0199 }
            r8.add(r4)     // Catch:{ all -> 0x0199 }
            goto L_0x00bf
        L_0x00d9:
            r7.addAll(r8)     // Catch:{ all -> 0x0199 }
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass1QR.A0A(r2)     // Catch:{ all -> 0x0199 }
            X.1DL r4 = r2.A02     // Catch:{ all -> 0x0199 }
            long r4 = r4.A09(r5)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0199 }
            r7.add(r4)     // Catch:{ all -> 0x0199 }
            r6 = 0
            java.lang.String[] r13 = X.C17890vO.A1b(r7, r6)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "readLatestSuccessfulP2PTransactionsForUsers/QUERY_SUCCESSFUL_TRANSACTIONS"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r17 = X.AnonymousClass000.A0y(r4, r5)     // Catch:{ all -> 0x0199 }
            java.lang.String[] r4 = X.AnonymousClass1QR.A0D     // Catch:{ all -> 0x0199 }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ all -> 0x0199 }
            java.util.ArrayList r5 = X.C17880vN.A10(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String r4 = "MAX(init_timestamp)"
            r5.add(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String[] r11 = X.C17890vO.A1b(r5, r6)     // Catch:{ all -> 0x0199 }
            X.1Cd r4 = r2.A03     // Catch:{ all -> 0x0199 }
            X.1at r8 = r4.get()     // Catch:{ all -> 0x0199 }
            r4 = r8
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x018f }
            X.1Ev r9 = r4.A02     // Catch:{ all -> 0x018f }
            java.lang.String r10 = "pay_transaction"
            java.lang.String r14 = "receiver_jid_row_id"
            java.lang.String r15 = "init_timestamp DESC"
            r16 = 0
            android.database.Cursor r7 = r9.A0B(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x018f }
            if (r7 == 0) goto L_0x014f
            java.lang.String r4 = "readLatestSuccessfulP2PTransactionsForUsers"
            java.util.ArrayList r10 = X.AnonymousClass1QR.A0B(r7, r2, r4)     // Catch:{ all -> 0x0145 }
            X.1QE r6 = r2.A04     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = "readLatestSuccessfulP2PTransactionsForUsers returned: "
            X.C17890vO.A14(r4, r5, r10)     // Catch:{ all -> 0x0145 }
            X.AnonymousClass8BS.A19(r6, r5)     // Catch:{ all -> 0x0145 }
            r7.close()     // Catch:{ all -> 0x018f }
            r8.close()     // Catch:{ all -> 0x0199 }
            goto L_0x0156
        L_0x0145:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x014a }
            goto L_0x014e
        L_0x014a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x018f }
        L_0x014e:
            throw r1     // Catch:{ all -> 0x018f }
        L_0x014f:
            r8.close()     // Catch:{ all -> 0x0199 }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0199 }
        L_0x0156:
            monitor-exit(r2)
            java.util.Iterator r9 = r1.iterator()
        L_0x015b:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x019c
            java.lang.Object r8 = r9.next()
            X.Aia r8 = (X.C21346Aia) r8
            com.whatsapp.jid.UserJid r7 = r8.A04
            java.util.Iterator r6 = r10.iterator()
        L_0x016d:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x018a
            java.lang.Object r5 = r6.next()
            X.AW0 r5 = (X.AW0) r5
            com.whatsapp.jid.UserJid r4 = r5.A0D
            boolean r4 = X.C18070vi.A18(r7, r4)
            if (r4 == 0) goto L_0x016d
            X.1KN r4 = r5.A09
            if (r4 == 0) goto L_0x018a
        L_0x0185:
            monitor-enter(r8)
            r8.A02 = r4     // Catch:{ all -> 0x018c }
            monitor-exit(r8)
            goto L_0x015b
        L_0x018a:
            r4 = 0
            goto L_0x0185
        L_0x018c:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x018f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0199 }
        L_0x0198:
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x019c:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r4 = r4 - r6
            java.lang.String[] r6 = X.AnonymousClass8BR.A1b()
            r7 = 405(0x195, float:5.68E-43)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            r7 = 0
            r6[r7] = r9
            r9 = 1
            java.lang.String r7 = java.lang.String.valueOf(r9)
            r6[r9] = r7
            r7 = 2
            X.C17880vN.A1V(r6, r7, r4)
            java.lang.String r4 = "readFrequentlyPaidNonWaPaymentUsers/QUERY_SUCCESSFUL_INTEROP_TRANSACTIONS"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r4)
            java.lang.String r4 = "/QUERY_PAY_TRANSACTION"
            java.lang.String r25 = X.AnonymousClass000.A0y(r4, r5)
            X.1Cd r4 = r2.A03
            X.1at r16 = r4.get()
            r4 = r16
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x02c3 }
            X.1Ev r4 = r4.A02     // Catch:{ all -> 0x02c3 }
            java.lang.String r18 = "pay_transaction"
            java.lang.String r20 = "status =? AND type =? AND init_timestamp <=? AND receiver_jid_row_id is null"
            r19 = 0
            r23 = r19
            r24 = r19
            r17 = r4
            r21 = r6
            r22 = r19
            android.database.Cursor r9 = r17.A0B(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02c3 }
            if (r9 == 0) goto L_0x0281
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ all -> 0x0277 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = "extractFrequentlyPaidNonWaPaymentUser"
            java.util.ArrayList r4 = X.AnonymousClass1QR.A0B(r9, r2, r4)     // Catch:{ all -> 0x0277 }
            java.util.Iterator r15 = r4.iterator()     // Catch:{ all -> 0x0277 }
        L_0x0202:
            boolean r4 = r15.hasNext()     // Catch:{ all -> 0x0277 }
            if (r4 == 0) goto L_0x0265
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x0277 }
            X.AW0 r13 = (X.AW0) r13     // Catch:{ all -> 0x0277 }
            X.8pG r4 = r13.A0A     // Catch:{ all -> 0x0277 }
            java.lang.String r5 = r4.A0G()     // Catch:{ all -> 0x0277 }
            boolean r4 = r10.containsKey(r5)     // Catch:{ all -> 0x0277 }
            if (r4 == 0) goto L_0x0240
            java.lang.Object r14 = r10.get(r5)     // Catch:{ all -> 0x0277 }
            r12 = r14
            X.Aia r12 = (X.C21346Aia) r12     // Catch:{ all -> 0x0277 }
            monitor-enter(r14)     // Catch:{ all -> 0x0277 }
            int r4 = r12.A00     // Catch:{ all -> 0x0262 }
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            int r4 = r4 + 1
            monitor-enter(r14)     // Catch:{ all -> 0x0277 }
            r12.A00 = r4     // Catch:{ all -> 0x0262 }
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            monitor-enter(r14)     // Catch:{ all -> 0x0277 }
            long r6 = r12.A01     // Catch:{ all -> 0x0262 }
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            long r4 = r13.A05     // Catch:{ all -> 0x0277 }
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0202
            monitor-enter(r14)     // Catch:{ all -> 0x0277 }
            r12.A01 = r4     // Catch:{ all -> 0x0262 }
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            X.1KN r4 = r13.A09     // Catch:{ all -> 0x0277 }
            monitor-enter(r14)     // Catch:{ all -> 0x0277 }
            r12.A02 = r4     // Catch:{ all -> 0x0262 }
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            goto L_0x0202
        L_0x0240:
            com.whatsapp.jid.UserJid r12 = r13.A0E     // Catch:{ all -> 0x0277 }
            long r4 = r13.A05     // Catch:{ all -> 0x0277 }
            X.1KN r11 = r13.A09     // Catch:{ all -> 0x0277 }
            X.8pG r7 = r13.A0A     // Catch:{ all -> 0x0277 }
            X.Aia r6 = new X.Aia     // Catch:{ all -> 0x0277 }
            r17 = r6
            r18 = r11
            r19 = r7
            r20 = r12
            r21 = r4
            r17.<init>((X.AnonymousClass1KN) r18, (X.AnonymousClass8pG) r19, (com.whatsapp.jid.UserJid) r20, (long) r21)     // Catch:{ all -> 0x0277 }
            java.lang.String r4 = r7.A0G()     // Catch:{ all -> 0x0277 }
            r10.put(r4, r6)     // Catch:{ all -> 0x0277 }
            r8.add(r6)     // Catch:{ all -> 0x0277 }
            goto L_0x0202
        L_0x0262:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0277 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0265:
            X.1QE r5 = r2.A04     // Catch:{ all -> 0x0277 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0277 }
            java.lang.String r2 = "readFrequentlyPaidNonWaPaymentUsers returned: "
            X.C17890vO.A14(r2, r4, r8)     // Catch:{ all -> 0x0277 }
            X.AnonymousClass8BS.A19(r5, r4)     // Catch:{ all -> 0x0277 }
            r9.close()     // Catch:{ all -> 0x02c3 }
            goto L_0x0281
        L_0x0277:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x027c }
            goto L_0x0280
        L_0x027c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02c3 }
        L_0x0280:
            throw r1     // Catch:{ all -> 0x02c3 }
        L_0x0281:
            r16.close()
            r8.addAll(r1)
            X.C29391cC.A0G(r8)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r8.iterator()
        L_0x0296:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02bd
            java.lang.Object r2 = r4.next()
            X.Aia r2 = (X.C21346Aia) r2
            int r1 = r6.size()
            if (r1 >= r3) goto L_0x02bd
            boolean r1 = r2.A06
            if (r1 != 0) goto L_0x02b9
            com.whatsapp.jid.UserJid r1 = r2.A04
            if (r1 == 0) goto L_0x02b9
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x0296
            r5.add(r1)
        L_0x02b9:
            r6.add(r2)
            goto L_0x0296
        L_0x02bd:
            X.9bj r0 = new X.9bj
            r0.<init>(r5, r6)
            return r0
        L_0x02c3:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x02c8 }
            throw r1
        L_0x02c8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BQ.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C184919bj r13 = (C184919bj) obj;
        C18070vi.A0d(r13, 0);
        C184889bg r0 = this.A02;
        PaymentSettingsFragment paymentSettingsFragment = r0.A01;
        C37451pZ r6 = r0.A00;
        List list = r13.A01;
        List list2 = r13.A00;
        int size = list2.size();
        View view = paymentSettingsFragment.A03;
        if (size == 0) {
            view.setVisibility(8);
            paymentSettingsFragment.A09.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        paymentSettingsFragment.A09.setVisibility(0);
        int i = ((GridLayoutManager) paymentSettingsFragment.A0A.getLayoutManager()).A00;
        paymentSettingsFragment.A0A.setAdapter(new C161738Hn(paymentSettingsFragment.A1B(), paymentSettingsFragment.A0G, r6, new C184909bi(paymentSettingsFragment, list2), paymentSettingsFragment.A0l, list, list2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9BQ(AnonymousClass1M9 r2, AnonymousClass1QR r3, C184889bg r4, PaymentSettingsFragment paymentSettingsFragment) {
        super(paymentSettingsFragment, true);
        C18070vi.A0k(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
