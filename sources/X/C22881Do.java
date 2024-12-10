package X;

/* renamed from: X.1Do  reason: invalid class name and case insensitive filesystem */
public final class C22881Do extends AnonymousClass17A {
    public int A00;
    public boolean A01;
    public final AnonymousClass118 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22881Do(AnonymousClass118 r2, AnonymousClass00H r3) {
        super(r3, false);
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r5, int r6) {
        /*
            r4 = this;
            boolean r1 = r4.A01
            if (r1 != r5) goto L_0x0008
            int r0 = r4.A00
            if (r6 == r0) goto L_0x0044
        L_0x0008:
            r2 = 0
            r3 = 0
            if (r1 == r5) goto L_0x000d
            r3 = 1
        L_0x000d:
            r4.A01 = r5
            r4.A00 = r6
            X.118 r0 = r4.A02     // Catch:{ IOException -> 0x0033 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x0033 }
            java.lang.String r0 = "login_failed"
            java.io.FileOutputStream r0 = r1.openFileOutput(r0, r2)     // Catch:{ IOException -> 0x0033 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0033 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0033 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x002c }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x002c }
            r2.writeInt(r6)     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0039
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0033 }
            throw r0     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "loginmanager/failed/save login_failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0039:
            if (r3 == 0) goto L_0x0044
            r1 = 5
            X.AWs r0 = new X.AWs
            r0.<init>(r5, r1)
            r4.notifyAllObservers(r0)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22881Do.A00(boolean, int):void");
    }

    public final boolean A01() {
        return this.A01;
    }
}
