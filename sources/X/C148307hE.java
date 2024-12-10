package X;

/* renamed from: X.7hE  reason: invalid class name and case insensitive filesystem */
public final class C148307hE extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C138136wa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148307hE(C138136wa r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        r5 = r0.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            X.6wa r0 = r0.this$0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.6dc r0 = (X.C126986dc) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r1 = "battery:wake_ups_time"
            r0 = 0
            java.util.Set r0 = r2.getStringSet(r1, r0)
            if (r0 != 0) goto L_0x001d
            X.1Om r0 = X.C25511Om.A00
        L_0x001d:
            java.util.LinkedHashMap r12 = X.C17880vN.A13()
            long r15 = android.os.SystemClock.elapsedRealtime()
            java.util.Iterator r14 = r0.iterator()
        L_0x0029:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.String r3 = X.C17880vN.A0v(r14)
            r11 = 1
            java.lang.String[] r1 = new java.lang.String[r11]
            java.lang.String r0 = ","
            r2 = 0
            r1[r2] = r0
            java.util.List r13 = X.AnonymousClass1YF.A0S(r3, r1, r2)
            int r1 = r13.size()
            r0 = 2
            if (r1 < r0) goto L_0x0029
            java.lang.Object r10 = r13.get(r2)
            int r0 = X.AnonymousClass3MX.A02(r13, r11)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r0)
            int r8 = r13.size()
            r7 = 1
        L_0x0058:
            if (r7 >= r8) goto L_0x0082
            java.lang.String r0 = X.C17880vN.A0w(r13, r7)
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            if (r0 == 0) goto L_0x007b
            long r5 = r0.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            if (r2 == 0) goto L_0x007e
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r15 - r0
            long r1 = r2.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
        L_0x007b:
            int r7 = r7 + 1
            goto L_0x0058
        L_0x007e:
            X.C17880vN.A1R(r9, r5)
            goto L_0x007b
        L_0x0082:
            boolean r0 = r9.isEmpty()
            r11 = r11 ^ r0
            if (r11 == 0) goto L_0x0029
            r12.put(r10, r9)
            goto L_0x0029
        L_0x008d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148307hE.invoke():java.lang.Object");
    }
}
