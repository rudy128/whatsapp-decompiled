package X;

import android.os.Build;

/* renamed from: X.1Zd  reason: invalid class name and case insensitive filesystem */
public final class C28171Zd {
    public final C28181Ze A00;

    public AnonymousClass1HO A00() {
        return this.A00.A00();
    }

    @Deprecated
    public void A01(C33321id r2) {
        this.A00.A05(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.1Zg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.1Zg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.1Zg} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.27d, X.1Ze] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28171Zd(X.AnonymousClass1HO r3) {
        /*
            r2 = this;
            r2.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0011
            X.1Zg r1 = new X.1Zg
            r1.<init>(r3)
        L_0x000e:
            r2.A00 = r1
            return
        L_0x0011:
            r0 = 29
            if (r1 < r0) goto L_0x001b
            X.1Zf r1 = new X.1Zf
            r1.<init>(r3)
            goto L_0x000e
        L_0x001b:
            X.27d r1 = new X.27d
            r1.<init>(r3)
            android.view.WindowInsets r0 = r3.A06()
            r1.A00 = r0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28171Zd.<init>(X.1HO):void");
    }

    public C28171Zd() {
        C28181Ze r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new C28201Zg();
        } else if (i >= 29) {
            r0 = new C28191Zf();
        } else {
            r0 = new AnonymousClass27d();
        }
        this.A00 = r0;
    }
}
