package X;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public class C29791cs {
    public final C29801ct A00;
    public final AnonymousClass18O A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1ct, java.lang.Object] */
    public synchronized C29801ct A00() {
        ? obj;
        C29801ct r3 = this.A00;
        obj = new Object();
        obj.A00 = r3.A00;
        obj.A02 = r3.A02;
        obj.A01 = r3.A01;
        return obj;
    }

    public synchronized void A01() {
        this.A00.A01++;
    }

    public synchronized void A02() {
        C29801ct r3 = this.A00;
        r3.A00 = 0;
        r3.A02 = 0;
        r3.A01 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r0 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r5 = this;
            X.0z4 r2 = r5.A03
            X.00H r4 = r2.A00
            java.lang.Object r1 = r4.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "c2dm_reg_id"
            boolean r0 = r1.contains(r0)
            r3 = 0
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r2.A0e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            X.18O r1 = r5.A01
            X.18R r0 = X.AnonymousClass18O.A0i
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x003b
            if (r2 == 0) goto L_0x003b
            java.lang.Object r1 = r4.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "logins_with_messages"
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x003b
            r3 = 1
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29791cs.A03():boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1ct, java.lang.Object] */
    public C29791cs(AnonymousClass18O r3, AnonymousClass11P r4, C19830z4 r5) {
        ? obj = new Object();
        obj.A00 = 0;
        this.A00 = obj;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }
}
