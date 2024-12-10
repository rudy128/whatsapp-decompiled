package X;

/* renamed from: X.2vN  reason: invalid class name and case insensitive filesystem */
public class C64812vN implements AnonymousClass02j {
    public final int A00;
    public final Object A01;

    public C64812vN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        r1.append(r0);
        r1.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        android.util.Log.w(r5, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        r1.append(r0);
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r2.A1w(r3, r8.A00, r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bkx(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x003b;
                case 2: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.02m r8 = (X.C005702m) r8
            X.AnonymousClass1FU.A0e(r8, r0)
            return
        L_0x000f:
            X.02m r8 = (X.C005702m) r8
            java.lang.Object r1 = r7.A01
            X.1GP r1 = (X.AnonymousClass1GP) r1
            java.util.ArrayDeque r0 = r1.A0C
            java.lang.Object r0 = r0.pollFirst()
            X.76m r0 = (X.C1416676m) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No IntentSenders were started for "
            goto L_0x0053
        L_0x0028:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.1GR r0 = r1.A0U
            androidx.fragment.app.Fragment r2 = r0.A01(r4)
            if (r2 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            goto L_0x0073
        L_0x003b:
            X.02m r8 = (X.C005702m) r8
            java.lang.Object r1 = r7.A01
            X.1GP r1 = (X.AnonymousClass1GP) r1
            java.util.ArrayDeque r0 = r1.A0C
            java.lang.Object r0 = r0.pollLast()
            X.76m r0 = (X.C1416676m) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No Activities were started for result for "
        L_0x0053:
            r1.append(r0)
            r1.append(r7)
        L_0x0059:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
            return
        L_0x0061:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.1GR r0 = r1.A0U
            androidx.fragment.app.Fragment r2 = r0.A01(r4)
            if (r2 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
        L_0x0073:
            r1.append(r0)
            r1.append(r4)
            goto L_0x0059
        L_0x007a:
            int r1 = r8.A00
            android.content.Intent r0 = r8.A01
            r2.A1w(r3, r1, r0)
            return
        L_0x0082:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r1 = r8.keySet()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r3 = X.C17880vN.A10(r0)
            int r0 = r3.size()
            int[] r6 = new int[r0]
            r2 = 0
        L_0x00a0:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00b7
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            r0 = -1
            if (r1 == 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00b7:
            java.lang.Object r4 = r7.A01
            X.1GP r4 = (X.AnonymousClass1GP) r4
            java.util.ArrayDeque r0 = r4.A0C
            java.lang.Object r0 = r0.pollFirst()
            X.76m r0 = (X.C1416676m) r0
            java.lang.String r3 = "FragmentManager"
            if (r0 != 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No permissions were requested for "
            r1.append(r0)
            r1.append(r7)
        L_0x00d3:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            return
        L_0x00db:
            java.lang.String r2 = r0.A01
            int r1 = r0.A00
            X.1GR r0 = r4.A0U
            androidx.fragment.app.Fragment r0 = r0.A01(r2)
            if (r0 != 0) goto L_0x00f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            r1.append(r0)
            r1.append(r2)
            goto L_0x00d3
        L_0x00f4:
            r0.A1O(r1, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64812vN.Bkx(java.lang.Object):void");
    }
}
