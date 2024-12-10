package X;

/* renamed from: X.D5b  reason: case insensitive filesystem */
public class C26587D5b implements C15950rT {
    public final int A00;
    public final Object A01;

    public C26587D5b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        return X.C18460wS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r4.size() <= 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0211, code lost:
        com.whatsapp.util.Log.e("InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r45) {
        /*
            r44 = this;
            r2 = r45
            r1 = r44
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x021a;
                case 1: goto L_0x0217;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r9 = r1.A01
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r9 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r9
            X.COf r2 = (X.C24887COf) r2
            r8 = 1
            X.C18070vi.A0d(r2, r8)
            java.lang.String r15 = "InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error"
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            X.1yT r5 = r2.A00
            r5.A02()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            monitor-enter(r9)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r2 = r9.A0M     // Catch:{ all -> 0x020d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x020d }
            if (r0 == 0) goto L_0x002c
            X.1M9 r0 = r9.A0G     // Catch:{ all -> 0x020d }
            r0.A0v(r2)     // Catch:{ all -> 0x020d }
        L_0x002c:
            monitor-exit(r9)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r5.A02()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.HashMap r3 = X.C17880vN.A11()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r7 = 0
            if (r4 == 0) goto L_0x003e
            int r0 = r4.size()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r13 = 1
            if (r0 > 0) goto L_0x003f
        L_0x003e:
            r13 = 0
        L_0x003f:
            if (r13 == 0) goto L_0x0091
            X.1Me r1 = r9.A0H     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.COO r0 = new X.COO     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1, r4)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r10 = X.C18070vi.A0M(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x0050:
            boolean r0 = r12.hasNext()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r6 = r12.next()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.1E7 r6 = (X.AnonymousClass1E7) r6     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r5.A02()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.C18070vi.A0d(r6, r8)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r11 = 1
            boolean r0 = r10 instanceof java.util.Collection     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r10.isEmpty()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x006e
            goto L_0x008b
        L_0x006e:
            java.util.Iterator r2 = r10.iterator()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x0072:
            boolean r0 = r2.hasNext()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r2.next()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.COO r0 = (X.COO) r0     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.1Me r1 = r0.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r0 = r0.A01     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            boolean r0 = r1.A0l(r6, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0072
            r11 = 0
        L_0x008b:
            if (r11 == 0) goto L_0x0050
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A00(r6, r3)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            goto L_0x0050
        L_0x0091:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x0095:
            boolean r0 = r2.hasNext()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r1 = r2.next()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.1E7 r1 = (X.AnonymousClass1E7) r1     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r5.A02()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A00(r1, r3)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            boolean r0 = r9.A01     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = r1.A0K()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x0095
            int r0 = r0.size()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 <= r8) goto L_0x0095
            r9.A01 = r8     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            goto L_0x0095
        L_0x00c0:
            java.util.LinkedList r2 = X.AnonymousClass8BR.A14()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.Iterator r5 = X.C17890vO.A0i(r3)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x00c8:
            boolean r0 = r5.hasNext()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x00e5
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r3 = X.C17880vN.A0x(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7EH r0 = new X.7EH     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1, r3)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r2.add(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            goto L_0x00c8
        L_0x00e5:
            X.0vb r1 = r9.A0I     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7Rc r0 = new X.7Rc     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.Collections.sort(r2, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r13 == 0) goto L_0x01c4
            X.0ve r3 = r9.A0J     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r1 = 7134(0x1bde, float:9.997E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = ""
            r14 = 0
            r13 = -1
            java.lang.String r39 = X.C29431cG.A0g(r0, r0, r0, r4, r14)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            android.app.Application r10 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C18070vi.A0z(r10, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0 = 2131102434(0x7f060ae2, float:1.7817306E38)
            int r12 = r1.getColor(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.Iterator r18 = r2.iterator()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x011f:
            boolean r0 = r18.hasNext()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r5 = r18.next()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7EH r5 = (X.AnonymousClass7EH) r5     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.CharSequence r11 = r5.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r1 = r11.toString()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0 = 16
            X.DRt r4 = new X.DRt     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r4.<init>((int) r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.StringBuilder r0 = r4.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.append(r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r3 = 0
        L_0x013e:
            int r0 = r11.length()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r3 >= r0) goto L_0x0199
            int r2 = r39.length()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r38 = r11
            r40 = r3
            r41 = r7
            r42 = r2
            r43 = r8
            boolean r0 = X.AnonymousClass1YF.A0X(r38, r39, r40, r41, r42, r43)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x018c
            long r0 = (long) r12     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r16 = 32
            long r0 = r0 << r16
            long r16 = X.C05100Qk.A01     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            long r33 = X.C26130Cst.A01     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            long r37 = X.C05100Qk.A05     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.EBX r30 = X.C25969Cpb.A00(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.CrN r0 = new X.CrN     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r22 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r31 = r14
            r32 = r14
            r20 = r14
            r35 = r33
            r19 = r0
            r21 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            int r2 = r2 + r3
            r4.A03(r0, r3, r2)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x018c:
            int r1 = r3 + 1
            r0 = 32
            int r0 = X.AnonymousClass1YF.A0C(r11, r0, r1, r7)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == r13) goto L_0x0199
            int r3 = r0 + 1
            goto L_0x013e
        L_0x0199:
            X.DRu r2 = r4.A00()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r1 = r5.A01     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7EH r0 = new X.7EH     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1, r2)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r6.add(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            goto L_0x011f
        L_0x01a9:
            boolean r0 = r6.isEmpty()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x0216
            r2 = 2131895497(0x7f1224c9, float:1.9425829E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r0 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r1 = X.AnonymousClass3Ma.A10(r10, r0, r1, r7, r2)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7ED r0 = new X.7ED     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.util.List r6 = X.C18070vi.A0M(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            return r6
        L_0x01c4:
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r6.<init>(r2)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            boolean r0 = X.AnonymousClass000.A1a(r6)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x01e6
            android.app.Application r1 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C18070vi.A0z(r1, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0 = 2131899050(0x7f1232aa, float:1.9433035E38)
            java.lang.String r1 = X.C18070vi.A0F(r1, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7EJ r0 = new X.7EJ     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r6.add(r7, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            return r6
        L_0x01e6:
            if (r13 == 0) goto L_0x0216
            java.lang.String r0 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x0216
            int r0 = r0.length()     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            if (r0 == 0) goto L_0x0216
            android.app.Application r3 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"
            X.C18070vi.A0z(r3, r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r2 = 2131895497(0x7f1224c9, float:1.9425829E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r0 = r9.A00     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            java.lang.String r1 = X.AnonymousClass3Ma.A10(r3, r0, r1, r7, r2)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            X.7ED r0 = new X.7ED     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r0.<init>(r1)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            r6.add(r0)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            return r6
        L_0x020d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
            throw r0     // Catch:{ 1QC | IllegalStateException -> 0x0210 }
        L_0x0210:
            r0 = move-exception
            com.whatsapp.util.Log.e(r15, r0)
            X.0wS r6 = X.C18460wS.A00
        L_0x0216:
            return r6
        L_0x0217:
            java.lang.Object r6 = r1.A01
            return r6
        L_0x021a:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.1GO r1 = r2.A0G
            boolean r0 = r1 instanceof X.AnonymousClass01A
            if (r0 == 0) goto L_0x0229
            X.01M r6 = r1.BMV()
            return r6
        L_0x0229:
            X.1FL r0 = r2.A1D()
            X.01M r6 = r0.A04
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26587D5b.apply(java.lang.Object):java.lang.Object");
    }
}
