package X;

import android.app.Activity;

/* renamed from: X.0Y8  reason: invalid class name */
public final class AnonymousClass0Y8 implements AnonymousClass1GC {
    public static final C18100vl A01 = AnonymousClass1DF.A01(C08790ff.A00);
    public final Activity A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C6U(X.C27581Wq r5, X.AnonymousClass1F9 r6) {
        /*
            r4 = this;
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            X.1Wq r0 = X.C27581Wq.ON_DESTROY
            if (r5 != r0) goto L_0x003e
            android.app.Activity r1 = r4.A00
            java.lang.String r0 = "input_method"
            java.lang.Object r3 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C18070vi.A0z(r3, r0)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            X.0Ct r2 = A00()
            java.lang.Object r1 = r2.A01(r3)
            if (r1 == 0) goto L_0x003e
            monitor-enter(r1)
            android.view.View r0 = r2.A00(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            boolean r0 = r2.A02(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x003e
            r3.isActive()
            return
        L_0x0039:
            monitor-exit(r1)
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Y8.C6U(X.1Wq, X.1F9):void");
    }

    public AnonymousClass0Y8(Activity activity) {
        this.A00 = activity;
    }

    public static final C02110Ct A00() {
        return (C02110Ct) A01.getValue();
    }
}
