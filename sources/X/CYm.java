package X;

import androidx.window.extensions.WindowExtensions;

public final class CYm {
    public final C24744CIg A00;
    public final C24745CIh A01;
    public final ClassLoader A02;
    public final WindowExtensions A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (X.C24512C7g.A00("WindowExtensionsProvider#getWindowExtensions is not valid", new X.C27467Dfw(r2)) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (X.C24512C7g.A00("WindowExtensions#getActivityEmbeddingComponent is not valid", new X.C27470Dfz(r3)) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.window.extensions.embedding.ActivityEmbeddingComponent A00() {
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
            if (r0 == 0) goto L_0x0029
            X.Dfz r1 = new X.Dfz
            r1.<init>(r3)
            java.lang.String r0 = "WindowExtensions#getActivityEmbeddingComponent is not valid"
            boolean r1 = X.C24512C7g.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r2 = 0
            if (r0 == 0) goto L_0x0038
            int r1 = X.C25864CnX.A00()
            r0 = 1
            if (r1 != r0) goto L_0x003c
            boolean r2 = r3.A01()
        L_0x0038:
            r1 = 0
            if (r2 == 0) goto L_0x0074
            goto L_0x006e
        L_0x003c:
            r0 = 2
            if (r0 > r1) goto L_0x0038
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0038
            X.Dg4 r1 = new X.Dg4
            r1.<init>(r3)
            java.lang.String r0 = "ActivityEmbeddingComponent#setSplitInfoCallback is not valid"
            boolean r0 = X.C24512C7g.A00(r0, r1)
            if (r0 == 0) goto L_0x0038
            X.Dg0 r1 = new X.Dg0
            r1.<init>(r3)
            java.lang.String r0 = "ActivityEmbeddingComponent#clearSplitInfoCallback is not valid"
            boolean r0 = X.C24512C7g.A00(r0, r1)
            if (r0 == 0) goto L_0x0038
            X.Dg5 r1 = new X.Dg5
            r1.<init>(r3)
            java.lang.String r0 = "ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid"
            boolean r0 = X.C24512C7g.A00(r0, r1)
            if (r0 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0038
        L_0x006e:
            androidx.window.extensions.WindowExtensions r0 = r3.A03     // Catch:{ UnsupportedOperationException -> 0x0074 }
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r1 = r0.getActivityEmbeddingComponent()     // Catch:{ UnsupportedOperationException -> 0x0074 }
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CYm.A00():androidx.window.extensions.embedding.ActivityEmbeddingComponent");
    }

    public final boolean A01() {
        if (!C24512C7g.A00("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new C27473Dg2(this)) || !C24512C7g.A00("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new C27472Dg1(this)) || !C24512C7g.A00("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new C27474Dg3(this))) {
            return false;
        }
        return true;
    }

    public CYm(C24745CIh cIh, WindowExtensions windowExtensions, ClassLoader classLoader) {
        this.A02 = classLoader;
        this.A01 = cIh;
        this.A03 = windowExtensions;
        this.A00 = new C24744CIg(classLoader);
    }
}
