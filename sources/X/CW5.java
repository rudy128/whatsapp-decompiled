package X;

public final class CW5 {
    public final C24744CIg A00;
    public final C24745CIh A01;
    public final ClassLoader A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (X.C24512C7g.A00("FoldingFeature class is not valid", new X.C27477Dg6(r3)) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        if (X.C24512C7g.A00(X.AnonymousClass000.A0y(", androidx.window.extensions.core.util.function.Consumer) is not valid", r1), new X.C27479Dg8(r3)) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (X.C24512C7g.A00("WindowExtensionsProvider#getWindowExtensions is not valid", new X.C27467Dfw(r2)) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.window.extensions.layout.WindowLayoutComponent A00() {
        /*
            r3 = this;
            X.CIg r2 = r3.A00
            X.Dfv r0 = new X.Dfv
            r0.<init>(r2)
            r0.invoke()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0018 }
            X.Dfw r1 = new X.Dfw
            r1.<init>(r2)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r1 = X.C24512C7g.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x0036
            X.Dg9 r1 = new X.Dg9
            r1.<init>(r3)
            java.lang.String r0 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = X.C24512C7g.A00(r0, r1)
            if (r0 == 0) goto L_0x0036
            X.Dg6 r1 = new X.Dg6
            r1.<init>(r3)
            java.lang.String r0 = "FoldingFeature class is not valid"
            boolean r1 = X.C24512C7g.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r2 = 0
            if (r0 == 0) goto L_0x005e
            int r1 = X.C25864CnX.A00()
            r0 = 1
            if (r1 != r0) goto L_0x0062
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            r1.append(r0)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            X.BE7.A1E(r0, r1)
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.Dg7 r0 = new X.Dg7
            r0.<init>(r3)
            boolean r2 = X.C24512C7g.A00(r1, r0)
        L_0x005e:
            r1 = 0
            if (r2 == 0) goto L_0x00a9
            goto L_0x00a1
        L_0x0062:
            r0 = 2
            if (r0 > r1) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            r1.append(r2)
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            X.BE7.A1E(r0, r1)
            java.lang.String r0 = ", java.util.function.Consumer) is not valid"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.Dg7 r0 = new X.Dg7
            r0.<init>(r3)
            boolean r0 = X.C24512C7g.A00(r1, r0)
            if (r0 == 0) goto L_0x009f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            X.BE7.A1E(r0, r1)
            java.lang.String r0 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.Dg8 r0 = new X.Dg8
            r0.<init>(r3)
            boolean r0 = X.C24512C7g.A00(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x005e
        L_0x009f:
            r2 = 0
            goto L_0x005e
        L_0x00a1:
            androidx.window.extensions.WindowExtensions r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch:{ UnsupportedOperationException -> 0x00a9 }
            androidx.window.extensions.layout.WindowLayoutComponent r1 = r0.getWindowLayoutComponent()     // Catch:{ UnsupportedOperationException -> 0x00a9 }
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CW5.A00():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public CW5(C24745CIh cIh, ClassLoader classLoader) {
        this.A02 = classLoader;
        this.A01 = cIh;
        this.A00 = new C24744CIg(classLoader);
    }
}
