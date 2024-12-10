package X;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;

/* renamed from: X.0kC  reason: invalid class name */
public final class AnonymousClass0kC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C06990aB $alreadyComposed;
    public final /* synthetic */ C06990aB $modifiedValues;
    public final /* synthetic */ List $toApply;
    public final /* synthetic */ Set $toComplete;
    public final /* synthetic */ List $toInsert;
    public final /* synthetic */ Set $toLateApply;
    public final /* synthetic */ List $toRecompose;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0kC(Recomposer recomposer, C06990aB r3, C06990aB r4, List list, List list2, List list3, Set set, Set set2) {
        super(1);
        this.this$0 = recomposer;
        this.$modifiedValues = r3;
        this.$alreadyComposed = r4;
        this.$toRecompose = list;
        this.$toInsert = list2;
        this.$toLateApply = set;
        this.$toApply = list3;
        this.$toComplete = set2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0162, code lost:
        if ((!r13.isEmpty()) == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r6 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x016c, code lost:
        if (r6.hasNext() == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x016e, code lost:
        r5 = (X.AnonymousClass0VT) ((X.C17250uM) r6.next());
        r3 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0178, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r5.A04.A0I = null;
        X.AnonymousClass0VT.A02(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0183, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        X.AnonymousClass0VT.A02(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0187, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0188, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        X.AnonymousClass0VT.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x018c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0190, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        androidx.compose.runtime.Recomposer.A0H((X.C17250uM) null, r2, r1);
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r13.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x019c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r13.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01a1, code lost:
        r13.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01a4, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        X.C31761g5 unused = r2.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01a9, code lost:
        X.C05200Qx.A01().A0H();
        r8.clear();
        r7.clear();
        r2.A03 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01ba, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01e0, code lost:
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (X.AnonymousClass000.A1a(r11) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r2.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3 = r11.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f4, code lost:
        if (r1 >= r3) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f6, code lost:
        r13.add((X.C17250uM) r11.get(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0102, code lost:
        r3 = r11.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0107, code lost:
        if (r1 >= r3) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0109, code lost:
        ((X.C17250uM) r11.get(r1)).BCP();
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0128, code lost:
        r11.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0131, code lost:
        if ((!r12.isEmpty()) == false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        X.C29401cD.A0J(r12, r13);
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x013e, code lost:
        if (r1.hasNext() == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0140, code lost:
        ((X.C17250uM) r1.next()).BCS();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        androidx.compose.runtime.Recomposer.A0H((X.C17250uM) null, r2, r1);
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0156, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r15) {
        /*
            r14 = this;
            androidx.compose.runtime.Recomposer r0 = r14.this$0
            java.lang.Object r1 = r0.A0B
            monitor-enter(r1)
            boolean r0 = androidx.compose.runtime.Recomposer.A0Q(r0)     // Catch:{ all -> 0x01e9 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = "Recomposer:animation"
            androidx.compose.runtime.Recomposer r0 = r14.this$0
            android.os.Trace.beginSection(r1)
            X.0Vd r0 = r0.A0F     // Catch:{ all -> 0x01e4 }
            r1 = r15
            r0.A04(r1)     // Catch:{ all -> 0x01e4 }
            X.C04790Ov.A03()     // Catch:{ all -> 0x01e4 }
            android.os.Trace.endSection()
        L_0x0021:
            java.lang.String r0 = "Recomposer:recompose"
            androidx.compose.runtime.Recomposer r2 = r14.this$0
            X.0aB r7 = r14.$modifiedValues
            X.0aB r8 = r14.$alreadyComposed
            java.util.List r9 = r14.$toRecompose
            java.util.List r10 = r14.$toInsert
            java.util.Set r12 = r14.$toLateApply
            java.util.List r11 = r14.$toApply
            java.util.Set r13 = r14.$toComplete
            android.os.Trace.beginSection(r0)
            androidx.compose.runtime.Recomposer.A0R(r2)     // Catch:{ all -> 0x01e4 }
            java.lang.Object r4 = r2.A0B     // Catch:{ all -> 0x01e4 }
            monitor-enter(r4)     // Catch:{ all -> 0x01e4 }
            java.util.List r5 = r2.A0D     // Catch:{ all -> 0x01dd }
            int r3 = r5.size()     // Catch:{ all -> 0x01dd }
            r1 = 0
        L_0x0043:
            if (r1 >= r3) goto L_0x0051
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x01dd }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ all -> 0x01dd }
            r9.add(r0)     // Catch:{ all -> 0x01dd }
            int r1 = r1 + 1
            goto L_0x0043
        L_0x0051:
            r5.clear()     // Catch:{ all -> 0x01dd }
            monitor-exit(r4)     // Catch:{ all -> 0x01e4 }
            r7.clear()     // Catch:{ all -> 0x01e4 }
            r8.clear()     // Catch:{ all -> 0x01e4 }
        L_0x005b:
            boolean r0 = X.AnonymousClass000.A1a(r9)     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x0075
            boolean r0 = X.AnonymousClass000.A1a(r10)     // Catch:{ all -> 0x01e4 }
            if (r0 != 0) goto L_0x0075
            boolean r0 = X.AnonymousClass000.A1a(r11)     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x012b
            long r0 = r2.A00     // Catch:{ all -> 0x01e4 }
            r5 = 1
            long r0 = r0 + r5
            r2.A00 = r0     // Catch:{ all -> 0x01e4 }
            goto L_0x00ef
        L_0x0075:
            int r3 = r9.size()     // Catch:{ Exception -> 0x01c9 }
            r1 = 0
        L_0x007a:
            if (r1 >= r3) goto L_0x0091
            java.lang.Object r0 = r9.get(r1)     // Catch:{ Exception -> 0x01c9 }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ Exception -> 0x01c9 }
            r8.add(r0)     // Catch:{ Exception -> 0x01c9 }
            X.0uM r0 = r2.A02(r0, r7)     // Catch:{ Exception -> 0x01c9 }
            if (r0 == 0) goto L_0x008e
            r11.add(r0)     // Catch:{ Exception -> 0x01c9 }
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x0091:
            r9.clear()     // Catch:{ all -> 0x01e4 }
            boolean r0 = r7.A03()     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x00bf
            monitor-enter(r4)     // Catch:{ all -> 0x01e4 }
            java.util.List r6 = androidx.compose.runtime.Recomposer.A08(r2)     // Catch:{ all -> 0x01dd }
            int r5 = r6.size()     // Catch:{ all -> 0x01dd }
            r3 = 0
        L_0x00a4:
            if (r3 >= r5) goto L_0x00be
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x01dd }
            X.0uM r1 = (X.C17250uM) r1     // Catch:{ all -> 0x01dd }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r1.Bkb(r7)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x00bb
            r9.add(r1)     // Catch:{ all -> 0x01dd }
        L_0x00bb:
            int r3 = r3 + 1
            goto L_0x00a4
        L_0x00be:
            monitor-exit(r4)     // Catch:{ all -> 0x01e4 }
        L_0x00bf:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x005b
            goto L_0x00cd
        L_0x00c6:
            java.util.List r0 = r2.A0A(r7, r10)     // Catch:{ Exception -> 0x01c0 }
            X.C29401cD.A0J(r0, r12)     // Catch:{ Exception -> 0x01c0 }
        L_0x00cd:
            r10.clear()     // Catch:{ Exception -> 0x01c0 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x01c0 }
            java.util.List r5 = r2.A0E     // Catch:{ all -> 0x01bd }
            int r3 = r5.size()     // Catch:{ all -> 0x01bd }
            r1 = 0
        L_0x00d8:
            if (r1 >= r3) goto L_0x00e4
            r5.get(r1)     // Catch:{ all -> 0x01bd }
            r0 = 0
            r10.add(r0)     // Catch:{ all -> 0x01bd }
            int r1 = r1 + 1
            goto L_0x00d8
        L_0x00e4:
            r5.clear()     // Catch:{ all -> 0x01bd }
            monitor-exit(r4)     // Catch:{ Exception -> 0x01c0 }
            boolean r0 = X.AnonymousClass000.A1a(r10)     // Catch:{ Exception -> 0x01c0 }
            if (r0 == 0) goto L_0x005b
            goto L_0x00c6
        L_0x00ef:
            int r3 = r11.size()     // Catch:{ Exception -> 0x0115 }
            r1 = 0
        L_0x00f4:
            if (r1 >= r3) goto L_0x0102
            java.lang.Object r0 = r11.get(r1)     // Catch:{ Exception -> 0x0115 }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ Exception -> 0x0115 }
            r13.add(r0)     // Catch:{ Exception -> 0x0115 }
            int r1 = r1 + 1
            goto L_0x00f4
        L_0x0102:
            int r3 = r11.size()     // Catch:{ Exception -> 0x0115 }
            r1 = 0
        L_0x0107:
            if (r1 >= r3) goto L_0x0128
            java.lang.Object r0 = r11.get(r1)     // Catch:{ Exception -> 0x0115 }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ Exception -> 0x0115 }
            r0.BCP()     // Catch:{ Exception -> 0x0115 }
            int r1 = r1 + 1
            goto L_0x0107
        L_0x0115:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A0H(r0, r2, r1)     // Catch:{ all -> 0x0122 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0122 }
            r11.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01d4
        L_0x0122:
            r0 = move-exception
            r11.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x0128:
            r11.clear()     // Catch:{ all -> 0x01e4 }
        L_0x012b:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x01e4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x015c
            X.C29401cD.A0J(r12, r13)     // Catch:{ Exception -> 0x014a }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ Exception -> 0x014a }
        L_0x013a:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x014a }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ Exception -> 0x014a }
            r0.BCS()     // Catch:{ Exception -> 0x014a }
            goto L_0x013a
        L_0x014a:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A0H(r0, r2, r1)     // Catch:{ all -> 0x0156 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0156 }
            r12.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01d4
        L_0x0156:
            r0 = move-exception
            goto L_0x01e0
        L_0x0159:
            r12.clear()     // Catch:{ all -> 0x01e4 }
        L_0x015c:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x01e4 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a4
            java.util.Iterator r6 = r13.iterator()     // Catch:{ Exception -> 0x0190 }
        L_0x0168:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x0190 }
            X.0uM r5 = (X.C17250uM) r5     // Catch:{ Exception -> 0x0190 }
            X.0VT r5 = (X.AnonymousClass0VT) r5     // Catch:{ Exception -> 0x0190 }
            java.lang.Object r3 = r5.A09     // Catch:{ Exception -> 0x0190 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0190 }
            X.0VR r1 = r5.A04     // Catch:{ all -> 0x0183 }
            r0 = 0
            r1.A0I = r0     // Catch:{ all -> 0x0183 }
            X.AnonymousClass0VT.A02(r5)     // Catch:{ all -> 0x0183 }
            monitor-exit(r3)     // Catch:{ Exception -> 0x0190 }
            goto L_0x0168
        L_0x0183:
            r0 = move-exception
            X.AnonymousClass0VT.A02(r5)     // Catch:{ Exception -> 0x0188 }
            throw r0     // Catch:{ Exception -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            X.AnonymousClass0VT.A03(r5)     // Catch:{ all -> 0x018d }
            throw r0     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x0190 }
            throw r0     // Catch:{ Exception -> 0x0190 }
        L_0x0190:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A0H(r0, r2, r1)     // Catch:{ all -> 0x019c }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x019c }
            r13.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01d4
        L_0x019c:
            r0 = move-exception
            r13.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x01a1:
            r13.clear()     // Catch:{ all -> 0x01e4 }
        L_0x01a4:
            monitor-enter(r4)     // Catch:{ all -> 0x01e4 }
            X.C31761g5 unused = r2.A0B()     // Catch:{ all -> 0x01ba }
            monitor-exit(r4)     // Catch:{ all -> 0x01e4 }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.C05200Qx.A01()     // Catch:{ all -> 0x01e4 }
            r0.A0H()     // Catch:{ all -> 0x01e4 }
            r8.clear()     // Catch:{ all -> 0x01e4 }
            r7.clear()     // Catch:{ all -> 0x01e4 }
            r0 = 0
            r2.A03 = r0     // Catch:{ all -> 0x01e4 }
            goto L_0x01d4
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x01c0 }
            throw r0     // Catch:{ Exception -> 0x01c0 }
        L_0x01c0:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A0H(r0, r2, r1)     // Catch:{ all -> 0x01e4 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01e4 }
            goto L_0x01d4
        L_0x01c9:
            r1 = move-exception
            r0 = 0
            androidx.compose.runtime.Recomposer.A0H(r0, r2, r1)     // Catch:{ all -> 0x01d8 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d8 }
            r9.clear()     // Catch:{ all -> 0x01e4 }
        L_0x01d4:
            android.os.Trace.endSection()
            return
        L_0x01d8:
            r0 = move-exception
            r9.clear()     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e4 }
            goto L_0x01e3
        L_0x01e0:
            r12.clear()     // Catch:{ all -> 0x01e4 }
        L_0x01e3:
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0kC.A00(long):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((Number) obj).longValue());
        return C27621Wu.A00;
    }
}
