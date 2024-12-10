package X;

import android.widget.Filter;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import java.util.ArrayList;

/* renamed from: X.1vo  reason: invalid class name and case insensitive filesystem */
public class C41101vo extends Filter {
    public int A00 = 0;
    public CharSequence A01 = "";
    public final /* synthetic */ CallsHistoryFragmentViewModel A02;

    public C41101vo(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel) {
        this.A02 = callsHistoryFragmentViewModel;
    }

    private void A00(ArrayList arrayList, int i) {
        arrayList.add(this.A02.A0q.get(Integer.valueOf(i)));
        this.A00++;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b5, code lost:
        if (r9 == null) goto L_0x01b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r25) {
        /*
            r24 = this;
            r5 = r24
            r7 = r25
            r5.A01 = r7
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r6 = r5.A02
            X.00H r0 = r6.A0o
            java.lang.Object r4 = r0.get()
            X.2pk r4 = (X.C61472pk) r4
            int r1 = r7.length()
            java.util.UUID r0 = r4.A00
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0037
            r3 = 1
            if (r1 < r3) goto L_0x0037
            X.2G9 r2 = X.C61472pk.A00(r4)
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A03 = r0
            X.18K r0 = r4.A02
            r0.CC7(r2)
            r4.A01 = r1
        L_0x0037:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.widget.Filter$FilterResults r2 = new android.widget.Filter$FilterResults
            r2.<init>()
            java.lang.String r0 = r7.toString()
            X.0vb r11 = r6.A0c
            java.util.ArrayList r1 = X.C20103A7h.A03(r11, r0)
            r7 = 0
            r5.A00 = r7
            r10 = 2
            r5.A00(r3, r10)
            monitor-enter(r5)
            java.util.ArrayList r0 = r6.A0F     // Catch:{ all -> 0x02de }
            if (r0 != 0) goto L_0x007c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02de }
            r8.<init>()     // Catch:{ all -> 0x02de }
            r6.A0F = r8     // Catch:{ all -> 0x02de }
            X.1M9 r0 = r6.A0Z     // Catch:{ all -> 0x02de }
            r0.A0u(r8)     // Catch:{ all -> 0x02de }
            java.util.ArrayList r9 = r6.A0F     // Catch:{ all -> 0x02de }
            X.1Me r8 = r6.A0a     // Catch:{ all -> 0x02de }
            X.7Rj r0 = new X.7Rj     // Catch:{ all -> 0x02de }
            r0.<init>(r8, r11)     // Catch:{ all -> 0x02de }
            java.util.Collections.sort(r9, r0)     // Catch:{ all -> 0x02de }
        L_0x007c:
            java.util.ArrayList r0 = r6.A0F     // Catch:{ all -> 0x02de }
            monitor-exit(r5)
            java.util.Iterator r11 = r0.iterator()
        L_0x0083:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r8 = r11.next()
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            X.2lf r0 = r8.A0H
            if (r0 == 0) goto L_0x0083
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r9 = r8.A06(r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x0083
            boolean r0 = r4.contains(r9)
            if (r0 != 0) goto L_0x0083
            X.1Me r0 = r6.A0a
            boolean r0 = r0.A0l(r8, r1)
            if (r0 == 0) goto L_0x0083
            int r8 = r3.size()
            int r0 = r5.A00
            int r8 = r8 - r0
            X.2yM r0 = new X.2yM
            r0.<init>(r9, r1, r8, r7)
            r3.add(r0)
            r4.add(r9)
            goto L_0x0083
        L_0x00be:
            r5.A01(r3, r10)
            r10 = 3
            r5.A00(r3, r10)
            monitor-enter(r5)
            java.util.List r0 = r6.A0H     // Catch:{ all -> 0x02de }
            if (r0 != 0) goto L_0x00d2
            X.1M9 r0 = r6.A0Z     // Catch:{ all -> 0x02de }
            java.util.ArrayList r0 = r0.A0M()     // Catch:{ all -> 0x02de }
            r6.A0H = r0     // Catch:{ all -> 0x02de }
        L_0x00d2:
            monitor-exit(r5)
            java.util.Iterator r11 = r0.iterator()
        L_0x00d7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r15 = r11.next()
            X.1E7 r15 = (X.AnonymousClass1E7) r15
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r9 = r15.A06(r0)
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.1CJ r13 = r6.A0e
            int r8 = r13.A06(r9)
            if (r9 == 0) goto L_0x00d7
            X.1Me r0 = r6.A0a
            boolean r0 = r0.A0l(r15, r1)
            if (r0 == 0) goto L_0x00d7
            if (r8 == 0) goto L_0x0103
            r0 = 2
            if (r8 == r0) goto L_0x0103
            r0 = 6
            if (r8 != r0) goto L_0x00d7
        L_0x0103:
            X.0ve r0 = r6.A0h
            X.1MZ r14 = r6.A0f
            X.0zA r12 = r6.A0N
            r17 = r9
            r16 = r0
            boolean r0 = X.C63982u1.A07(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00d7
            int r8 = r3.size()
            int r0 = r5.A00
            int r8 = r8 - r0
            X.2yN r0 = new X.2yN
            r0.<init>(r9, r1, r8, r7)
            r3.add(r0)
            goto L_0x00d7
        L_0x0123:
            r5.A01(r3, r10)
            r10 = 4
            r5.A00(r3, r10)
            java.util.concurrent.locks.Lock r0 = r6.A0s
            r23 = r0
            r23.lock()
            java.util.LinkedHashMap r0 = r6.A0r     // Catch:{ all -> 0x02d9 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x02d9 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x02d9 }
        L_0x013b:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0233
            java.lang.Object r11 = r16.next()     // Catch:{ all -> 0x02d9 }
            X.1vq r11 = (X.C41121vq) r11     // Catch:{ all -> 0x02d9 }
            int r0 = r11.BTW()     // Catch:{ all -> 0x02d9 }
            r8 = 2
            if (r0 != r8) goto L_0x013b
            X.2yP r11 = (X.C66582yP) r11     // Catch:{ all -> 0x02d9 }
            X.3Bg r9 = r11.A01     // Catch:{ all -> 0x02d9 }
            X.1Mc r15 = r6.A0j     // Catch:{ all -> 0x02d9 }
            X.126 r14 = r6.A0i     // Catch:{ all -> 0x02d9 }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ all -> 0x02d9 }
            X.C18070vi.A0d(r14, r8)     // Catch:{ all -> 0x02d9 }
            boolean r0 = r9.A04()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0223
            java.util.List r13 = r9.A04     // Catch:{ all -> 0x02d9 }
            java.lang.Object r0 = r13.get(r7)     // Catch:{ all -> 0x02d9 }
            X.9Bw r0 = (X.C178119Bw) r0     // Catch:{ all -> 0x02d9 }
            boolean r8 = r0.A0W()     // Catch:{ all -> 0x02d9 }
            java.lang.Object r0 = r13.get(r7)     // Catch:{ all -> 0x02d9 }
            X.9Bw r0 = (X.C178119Bw) r0     // Catch:{ all -> 0x02d9 }
            com.whatsapp.jid.GroupJid r0 = r0.A0C     // Catch:{ all -> 0x02d9 }
            X.1M9 r12 = r9.A00     // Catch:{ all -> 0x02d9 }
            X.1E7 r8 = X.C63982u1.A01(r12, r14, r0, r15, r8)     // Catch:{ all -> 0x02d9 }
            if (r8 == 0) goto L_0x01ce
            X.1Me r0 = r9.A01     // Catch:{ all -> 0x02d9 }
            boolean r0 = r0.A0l(r8, r1)     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x01ce
        L_0x0187:
            int r22 = r3.size()     // Catch:{ all -> 0x02d9 }
            int r0 = r5.A00     // Catch:{ all -> 0x02d9 }
            int r22 = r22 - r0
            X.1E7 r12 = r11.A03     // Catch:{ all -> 0x02d9 }
            X.2lG r11 = r11.A02     // Catch:{ all -> 0x02d9 }
            X.2yP r0 = new X.2yP     // Catch:{ all -> 0x02d9 }
            r17 = r0
            r18 = r9
            r19 = r11
            r20 = r12
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x02d9 }
            r3.add(r0)     // Catch:{ all -> 0x02d9 }
            java.util.List r0 = r9.A04     // Catch:{ all -> 0x02d9 }
            X.C18070vi.A0W(r0)     // Catch:{ all -> 0x02d9 }
            java.lang.Object r0 = X.C29431cG.A0c(r0)     // Catch:{ all -> 0x02d9 }
            X.9Bw r0 = (X.C178119Bw) r0     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x01b7
            com.whatsapp.jid.GroupJid r9 = r0.A0C     // Catch:{ all -> 0x02d9 }
            r0 = 1
            if (r9 != 0) goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            if (r0 != 0) goto L_0x013b
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r8.A06(r0)     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "CallsHistoryViewModel/performFiltering contact user jid is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02d9 }
            goto L_0x013b
        L_0x01c9:
            r4.add(r0)     // Catch:{ all -> 0x02d9 }
            goto L_0x013b
        L_0x01ce:
            java.lang.Object r0 = X.C29431cG.A0c(r13)     // Catch:{ all -> 0x02d9 }
            X.9Bw r0 = (X.C178119Bw) r0     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x01ff
            java.util.ArrayList r13 = r0.A0B()     // Catch:{ all -> 0x02d9 }
            r0 = 10
            int r0 = X.C29351c6.A0C(r13, r0)     // Catch:{ all -> 0x02d9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02d9 }
            r8.<init>(r0)     // Catch:{ all -> 0x02d9 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x02d9 }
        L_0x01e9:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x02d9 }
            X.9Bv r0 = (X.C178109Bv) r0     // Catch:{ all -> 0x02d9 }
            com.whatsapp.jid.UserJid r0 = r0.A00     // Catch:{ all -> 0x02d9 }
            X.1E7 r0 = r12.A0H(r0)     // Catch:{ all -> 0x02d9 }
            r8.add(r0)     // Catch:{ all -> 0x02d9 }
            goto L_0x01e9
        L_0x01ff:
            X.0wS r8 = X.C18460wS.A00     // Catch:{ all -> 0x02d9 }
        L_0x0201:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x02d9 }
        L_0x0205:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x021d
            java.lang.Object r8 = r13.next()     // Catch:{ all -> 0x02d9 }
            r12 = r8
            X.1E7 r12 = (X.AnonymousClass1E7) r12     // Catch:{ all -> 0x02d9 }
            X.1Me r0 = r9.A01     // Catch:{ all -> 0x02d9 }
            boolean r0 = r0.A0l(r12, r1)     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x0205
        L_0x021a:
            X.1E7 r8 = (X.AnonymousClass1E7) r8     // Catch:{ all -> 0x02d9 }
            goto L_0x021f
        L_0x021d:
            r8 = 0
            goto L_0x021a
        L_0x021f:
            if (r8 == 0) goto L_0x013b
            goto L_0x0187
        L_0x0223:
            X.1E7 r8 = r9.A01()     // Catch:{ all -> 0x02d9 }
            if (r8 == 0) goto L_0x013b
            X.1Me r0 = r9.A01     // Catch:{ all -> 0x02d9 }
            boolean r0 = r0.A0l(r8, r1)     // Catch:{ all -> 0x02d9 }
            if (r0 == 0) goto L_0x013b
            goto L_0x0187
        L_0x0233:
            r23.unlock()
            r5.A01(r3, r10)
            X.0ve r8 = r6.A0h
            r7 = 8711(0x2207, float:1.2207E-41)
            X.0vf r0 = X.C18040vf.A02
            int r7 = X.C18020vd.A00(r0, r8, r7)
            r0 = 1
            if (r7 == r0) goto L_0x0247
            r0 = 0
        L_0x0247:
            if (r0 == 0) goto L_0x02cb
            X.00H r0 = r6.A0n
            java.lang.Object r0 = r0.get()
            X.6mc r0 = (X.C132336mc) r0
            java.util.List r0 = r0.A00()
            r11 = 6
            r5.A00(r3, r11)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x0262:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r9 = r13.next()
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            java.lang.String r0 = r9.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0262
            java.lang.String r12 = r9.A0K()
            X.C17960vV.A07(r12)
            X.2lf r0 = r9.A0H
            if (r0 == 0) goto L_0x0262
            boolean r0 = r9.A10
            if (r0 != 0) goto L_0x0262
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r8 = r9.A06(r0)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            if (r8 == 0) goto L_0x0262
            boolean r0 = r4.contains(r8)
            if (r0 != 0) goto L_0x0262
            X.1Me r0 = r6.A0a
            boolean r0 = r0.A0l(r9, r1)
            if (r0 == 0) goto L_0x0262
            boolean r0 = r10.containsKey(r12)
            if (r0 != 0) goto L_0x02b5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.2yL r0 = new X.2yL
            r0.<init>(r9, r8, r7)
            r3.add(r0)
            r10.put(r12, r0)
        L_0x02b5:
            java.lang.String r0 = r9.A0K()
            java.lang.Object r0 = r10.get(r0)
            X.2yL r0 = (X.C66542yL) r0
            java.util.List r0 = r0.A02
            r0.add(r9)
            r4.add(r8)
            goto L_0x0262
        L_0x02c8:
            r5.A01(r3, r11)
        L_0x02cb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r2.values = r0
            int r0 = r3.size()
            r2.count = r0
            return r2
        L_0x02d9:
            r0 = move-exception
            r23.unlock()
            throw r0
        L_0x02de:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41101vo.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        if (filterResults == null || (obj = filterResults.values) == null) {
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = this.A02;
            new C177929Bd((Object) callsHistoryFragmentViewModel, 6).A02.executeOnExecutor(callsHistoryFragmentViewModel.A0D, new Void[0]);
            return;
        }
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel2 = this.A02;
        ArrayList arrayList = (ArrayList) obj;
        callsHistoryFragmentViewModel2.A0E = arrayList;
        callsHistoryFragmentViewModel2.A0k.A0F(arrayList);
        callsHistoryFragmentViewModel2.A0X();
    }

    private void A01(ArrayList arrayList, int i) {
        int size = arrayList.size() - 1;
        if (C42171xk.A00(this.A02.A0q.get(Integer.valueOf(i)), arrayList.get(size))) {
            arrayList.remove(size);
            this.A00--;
        }
    }
}
