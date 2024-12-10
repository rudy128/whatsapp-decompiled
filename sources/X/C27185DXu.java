package X;

/* renamed from: X.DXu  reason: case insensitive filesystem */
public class C27185DXu implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C27185DXu(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.util.Map} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x037c, code lost:
        X.C30691eM.A01(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BJt(java.lang.Object r41, X.C30391dr r42) {
        /*
            r40 = this;
            r10 = r41
            r4 = r40
            int r0 = r4.A00
            r6 = r42
            switch(r0) {
                case 0: goto L_0x0354;
                case 1: goto L_0x02df;
                case 2: goto L_0x0267;
                case 3: goto L_0x0218;
                case 4: goto L_0x01c2;
                case 5: goto L_0x0184;
                case 6: goto L_0x0146;
                case 7: goto L_0x0101;
                case 8: goto L_0x00af;
                case 9: goto L_0x0065;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r0 = r6 instanceof X.C27417DdY
            if (r0 == 0) goto L_0x005f
            r7 = r6
            X.DdY r7 = (X.C27417DdY) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005f
            int r2 = r2 - r1
            r7.label = r2
        L_0x001d:
            java.lang.Object r5 = r7.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r2) goto L_0x0049
            if (r0 != r3) goto L_0x052b
            X.C30691eM.A01(r5)
        L_0x002e:
            X.1Wu r9 = X.C27621Wu.A00
            return r9
        L_0x0031:
            X.C30691eM.A01(r5)
            java.lang.Object r1 = r4.A02
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            java.lang.Object r0 = r4.A01
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r7.L$0 = r10
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r0 = r0.invoke(r10, r7)
            if (r0 != r9) goto L_0x0052
            return r9
        L_0x0049:
            java.lang.Object r1 = r7.L$1
            X.1G2 r1 = (X.AnonymousClass1G2) r1
            java.lang.Object r10 = r7.L$0
            X.C30691eM.A01(r5)
        L_0x0052:
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.label = r3
            java.lang.Object r0 = r1.BJt(r10, r7)
            goto L_0x04dc
        L_0x005f:
            X.DdY r7 = new X.DdY
            r7.<init>(r4, r6)
            goto L_0x001d
        L_0x0065:
            boolean r0 = r6 instanceof X.C27394Dd7
            if (r0 == 0) goto L_0x00a9
            r5 = r6
            X.Dd7 r5 = (X.C27394Dd7) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r5.label = r2
        L_0x0077:
            java.lang.Object r1 = r5.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x008d
            if (r0 != r3) goto L_0x0530
            java.lang.Object r2 = r5.L$0
            X.4rF r2 = (X.C98494rF) r2
            X.C30691eM.A01(r1)
        L_0x0089:
            r10 = r1
        L_0x008a:
            r2.element = r10
            goto L_0x002e
        L_0x008d:
            X.C30691eM.A01(r1)
            java.lang.Object r2 = r4.A01
            X.4rF r2 = (X.C98494rF) r2
            java.lang.Object r1 = r2.element
            X.1I8 r0 = X.AnonymousClass4IV.A01
            if (r1 == r0) goto L_0x008a
            java.lang.Object r0 = r4.A02
            X.1nB r0 = (X.C36001nB) r0
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r1 = r0.invoke(r1, r10, r5)
            if (r1 != r9) goto L_0x0089
            return r9
        L_0x00a9:
            X.Dd7 r5 = new X.Dd7
            r5.<init>(r4, r6)
            goto L_0x0077
        L_0x00af:
            boolean r0 = r6 instanceof X.C27415DdW
            if (r0 == 0) goto L_0x00fb
            r3 = r6
            X.DdW r3 = (X.C27415DdW) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fb
            int r2 = r2 - r1
            r3.label = r2
        L_0x00c1:
            java.lang.Object r2 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x00e7
            if (r0 != r1) goto L_0x0535
            java.lang.Object r10 = r3.L$1
            java.lang.Object r4 = r3.L$0
            X.DXu r4 = (X.C27185DXu) r4
            X.C30691eM.A01(r2)
        L_0x00d5:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r4.A02
            X.4rF r0 = (X.C98494rF) r0
            r0.element = r10
            X.Dc8 r0 = new X.Dc8
            r0.<init>(r4)
            throw r0
        L_0x00e7:
            X.C30691eM.A01(r2)
            java.lang.Object r0 = r4.A01
            X.1OS r0 = (X.AnonymousClass1OS) r0
            r3.L$0 = r4
            r3.L$1 = r10
            r3.label = r1
            java.lang.Object r2 = r0.invoke(r10, r3)
            if (r2 != r9) goto L_0x00d5
            return r9
        L_0x00fb:
            X.DdW r3 = new X.DdW
            r3.<init>(r4, r6)
            goto L_0x00c1
        L_0x0101:
            boolean r0 = r6 instanceof X.C27370Dcj
            if (r0 == 0) goto L_0x0123
            r3 = r6
            X.Dcj r3 = (X.C27370Dcj) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0123
            int r2 = r2 - r1
            r3.label = r2
        L_0x0113:
            java.lang.Object r1 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x0129
            if (r0 == r2) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0123:
            X.Dcj r3 = new X.Dcj
            r3.<init>(r4, r6)
            goto L_0x0113
        L_0x0129:
            X.C30691eM.A01(r1)
            java.lang.Object r1 = r4.A02
            X.4rD r1 = (X.C98474rD) r1
            int r0 = r1.element
            if (r0 < r2) goto L_0x0140
            java.lang.Object r0 = r4.A01
            X.1G2 r0 = (X.AnonymousClass1G2) r0
            r3.label = r2
            java.lang.Object r0 = r0.BJt(r10, r3)
            goto L_0x04dc
        L_0x0140:
            int r0 = r0 + 1
            r1.element = r0
            goto L_0x002e
        L_0x0146:
            boolean r0 = r6 instanceof X.C27390Dd3
            if (r0 == 0) goto L_0x0168
            r3 = r6
            X.Dd3 r3 = (X.C27390Dd3) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0168
            int r2 = r2 - r1
            r3.label = r2
        L_0x0158:
            java.lang.Object r2 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L_0x0173
            if (r0 != r1) goto L_0x053a
            java.lang.Object r4 = r3.L$0
            X.DXu r4 = (X.C27185DXu) r4
            goto L_0x016e
        L_0x0168:
            X.Dd3 r3 = new X.Dd3
            r3.<init>(r4, r6)
            goto L_0x0158
        L_0x016e:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x053f }
            goto L_0x002e
        L_0x0173:
            X.C30691eM.A01(r2)
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x053f }
            X.1G2 r0 = (X.AnonymousClass1G2) r0     // Catch:{ all -> 0x053f }
            r3.L$0 = r4     // Catch:{ all -> 0x053f }
            r3.label = r1     // Catch:{ all -> 0x053f }
            java.lang.Object r0 = r0.BJt(r10, r3)     // Catch:{ all -> 0x053f }
            goto L_0x04dc
        L_0x0184:
            boolean r0 = r6 instanceof X.C27368Dch
            if (r0 == 0) goto L_0x01a6
            r3 = r6
            X.Dch r3 = (X.C27368Dch) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01a6
            int r2 = r2 - r1
            r3.label = r2
        L_0x0196:
            java.lang.Object r1 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x01ac
            if (r0 == r2) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x01a6:
            X.Dch r3 = new X.Dch
            r3.<init>(r4, r6)
            goto L_0x0196
        L_0x01ac:
            X.C30691eM.A01(r1)
            java.lang.Object r1 = r4.A01
            X.1Dh r1 = (X.C22811Dh) r1
            r0 = 0
            r1.element = r0
            java.lang.Object r0 = r4.A02
            X.1G2 r0 = (X.AnonymousClass1G2) r0
            r3.label = r2
            java.lang.Object r0 = r0.BJt(r10, r3)
            goto L_0x04dc
        L_0x01c2:
            boolean r0 = r6 instanceof X.C27387Dd0
            if (r0 == 0) goto L_0x01e4
            r5 = r6
            X.Dd0 r5 = (X.C27387Dd0) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01e4
            int r2 = r2 - r1
            r5.label = r2
        L_0x01d4:
            java.lang.Object r1 = r5.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x01ea
            if (r0 == r3) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x01e4:
            X.Dd0 r5 = new X.Dd0
            r5.<init>(r4, r6)
            goto L_0x01d4
        L_0x01ea:
            X.C30691eM.A01(r1)
            java.lang.Object r2 = r4.A01
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            int r1 = X.AnonymousClass000.A0M(r10)
            if (r1 == 0) goto L_0x0215
            if (r1 == r3) goto L_0x0215
            r0 = 2
            if (r1 == r0) goto L_0x0212
            r0 = 3
            if (r1 == r0) goto L_0x020f
            r0 = 4
            if (r1 == r0) goto L_0x020c
            X.Bzc r0 = X.C24341Bzc.UNKNOWN
        L_0x0204:
            r5.label = r3
            java.lang.Object r0 = r2.BJt(r0, r5)
            goto L_0x04dc
        L_0x020c:
            X.Bzc r0 = X.C24341Bzc.WIFI
            goto L_0x0204
        L_0x020f:
            X.Bzc r0 = X.C24341Bzc.NETWORK_5G
            goto L_0x0204
        L_0x0212:
            X.Bzc r0 = X.C24341Bzc.NETWORK_4G
            goto L_0x0204
        L_0x0215:
            X.Bzc r0 = X.C24341Bzc.MOBILE
            goto L_0x0204
        L_0x0218:
            boolean r0 = r6 instanceof X.C27385Dcy
            if (r0 == 0) goto L_0x023a
            r5 = r6
            X.Dcy r5 = (X.C27385Dcy) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x023a
            int r2 = r2 - r1
            r5.label = r2
        L_0x022a:
            java.lang.Object r1 = r5.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0240
            if (r0 == r3) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x023a:
            X.Dcy r5 = new X.Dcy
            r5.<init>(r4, r6)
            goto L_0x022a
        L_0x0240:
            X.C30691eM.A01(r1)
            java.lang.Object r2 = r4.A01
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r1 = r4.A02
            X.Clh r1 = (X.C25770Clh) r1
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.util.Map r0 = r1.A00
            r1 = 0
            if (r0 == 0) goto L_0x025b
            boolean r0 = r0.containsKey(r10)
            if (r0 != r3) goto L_0x025b
            r1 = 1
        L_0x025b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.label = r3
            java.lang.Object r0 = r2.BJt(r0, r5)
            goto L_0x04dc
        L_0x0267:
            boolean r0 = r6 instanceof X.C27383Dcw
            if (r0 == 0) goto L_0x0289
            r3 = r6
            X.Dcw r3 = (X.C27383Dcw) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0289
            int r2 = r2 - r1
            r3.label = r2
        L_0x0279:
            java.lang.Object r1 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L_0x028f
            if (r0 == r5) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0289:
            X.Dcw r3 = new X.Dcw
            r3.<init>(r4, r6)
            goto L_0x0279
        L_0x028f:
            X.C30691eM.A01(r1)
            java.lang.Object r6 = r4.A01
            X.1G2 r6 = (X.AnonymousClass1G2) r6
            X.1D6 r10 = (X.AnonymousClass1D6) r10
            X.Bz2 r7 = X.C24305Bz2.EDITOR_SCREEN_PREVIEW_LOW_MEMORY
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.Object r0 = r10.second
            X.6Qr r0 = (X.C122516Qr) r0
            java.lang.String r0 = r0.name()
            r2.append(r0)
            java.lang.String r0 = "WhatsappCriticalLowMemoryEvent"
            r2.append(r0)
            java.lang.Object r0 = r4.A02
            X.DQl r0 = (X.C27040DQl) r0
            X.11C r0 = r0.A00
            android.app.ActivityManager r1 = r0.A04()
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            if (r1 == 0) goto L_0x02c2
            r1.getMemoryInfo(r0)
        L_0x02c2:
            long r0 = r0.availMem
            java.lang.String r2 = X.C17880vN.A0u(r2, r0)
            X.Bxq r0 = X.C24236Bxq.A05
            java.lang.String r1 = r0.A00()
            X.CaV r0 = new X.CaV
            r0.<init>(r2, r1)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r7, r0)
            r3.label = r5
            java.lang.Object r0 = r6.BJt(r0, r3)
            goto L_0x04dc
        L_0x02df:
            boolean r0 = r6 instanceof X.C27382Dcv
            if (r0 == 0) goto L_0x0301
            r3 = r6
            X.Dcv r3 = (X.C27382Dcv) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0301
            int r2 = r2 - r1
            r3.label = r2
        L_0x02f1:
            java.lang.Object r1 = r3.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L_0x0307
            if (r0 == r5) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0301:
            X.Dcv r3 = new X.Dcv
            r3.<init>(r4, r6)
            goto L_0x02f1
        L_0x0307:
            X.C30691eM.A01(r1)
            java.lang.Object r4 = r4.A01
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C3B r10 = (X.C3B) r10
            boolean r0 = r10 instanceof X.BR8
            if (r0 == 0) goto L_0x0331
            X.Bz2 r6 = X.C24305Bz2.EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_FAILED
            X.BR8 r10 = (X.BR8) r10
            java.lang.String r1 = r10.A00
            X.Bxq r0 = X.C24236Bxq.A02
            java.lang.String r0 = r0.A00()
            X.CaV r2 = new X.CaV
            r2.<init>(r1, r0)
        L_0x0325:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r6, r2)
            r3.label = r5
            java.lang.Object r0 = r4.BJt(r0, r3)
            goto L_0x04dc
        L_0x0331:
            boolean r0 = r10 instanceof X.BRB
            if (r0 == 0) goto L_0x0345
            X.Bz2 r6 = X.C24305Bz2.EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_FAILED
            X.Bxq r0 = X.C24236Bxq.A03
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "ArEffectRenderFail"
        L_0x033f:
            X.CaV r2 = new X.CaV
            r2.<init>(r0, r1)
            goto L_0x0325
        L_0x0345:
            boolean r0 = r10 instanceof X.BRA
            if (r0 == 0) goto L_0x0547
            X.Bz2 r6 = X.C24305Bz2.EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_FAILED
            X.Bxq r0 = X.C24236Bxq.A03
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "ArEffectFetchFail"
            goto L_0x033f
        L_0x0354:
            boolean r0 = r6 instanceof X.C27375Dco
            if (r0 == 0) goto L_0x0376
            r8 = r6
            X.Dco r8 = (X.C27375Dco) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0376
            int r2 = r2 - r1
            r8.label = r2
        L_0x0366:
            java.lang.Object r1 = r8.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x0381
            if (r0 == r7) goto L_0x037c
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0376:
            X.Dco r8 = new X.Dco
            r8.<init>(r4, r6)
            goto L_0x0366
        L_0x037c:
            X.C30691eM.A01(r1)
            goto L_0x002e
        L_0x0381:
            X.C30691eM.A01(r1)
            java.lang.Object r6 = r4.A01
            X.1G2 r6 = (X.AnonymousClass1G2) r6
            X.CbX r10 = (X.C25236CbX) r10
            java.lang.Object r0 = r4.A02
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r0 = (com.whatsapp.avatar.prefetch.AvatarPrefetchController) r0
            X.2eX r11 = r0.A07
            r5 = 0
            r4 = 0
            X.C18070vi.A0d(r10, r4)
            java.util.Map r0 = r10.A08
            r3 = 0
            if (r0 == 0) goto L_0x0528
            X.CbL r1 = X.C25353CeC.A00(r0)
        L_0x039e:
            X.11C r0 = r11.A00
            android.app.ActivityManager r0 = r0.A04()
            X.BzP r18 = X.C25353CeC.A01(r0, r1)
            java.util.Map r2 = r10.A0A
            X.Clh r1 = new X.Clh
            r1.<init>(r2)
            X.CVz r12 = r11.A01
            X.Bzc r0 = r12.A00()
            java.lang.String r11 = r0.bloksString
            X.C18070vi.A0d(r11, r4)
            java.util.Map r0 = r1.A00
            r1 = 0
            if (r0 == 0) goto L_0x03c8
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x03c6
            r1 = r0
        L_0x03c6:
            java.util.Map r1 = (java.util.Map) r1
        L_0x03c8:
            r14 = 0
            r13 = 0
            if (r1 == 0) goto L_0x03f5
            java.lang.String r0 = "leLightPayload"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x03f5
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x03f5
            java.lang.String r0 = "effect_id"
            java.lang.Object r11 = r1.get(r0)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0525
            java.lang.String r11 = (java.lang.String) r11
        L_0x03e6:
            java.lang.String r0 = "quality_buckets"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x03f3
            r13 = r1
            java.util.List r13 = (java.util.List) r13
        L_0x03f3:
            r5 = r11
            r14 = 1
        L_0x03f5:
            X.1SL r0 = r12.A01
            java.lang.Float r0 = r0.BNL(r7)
            if (r0 != 0) goto L_0x0401
            java.lang.Float r0 = X.BE7.A0W()
        L_0x0401:
            float r1 = r0.floatValue()
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 * r0
            double r0 = (double) r1
            r11 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r11
            if (r14 == 0) goto L_0x04fc
            if (r13 == 0) goto L_0x04fc
            X.BTI r12 = X.C25308CdD.A00(r13, r0)
        L_0x0417:
            java.util.Map r13 = r10.A09
            if (r13 == 0) goto L_0x04f9
            java.lang.String r0 = "aleFeatureLevel"
            java.lang.Object r1 = r13.get(r0)
        L_0x0421:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0428
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x0428:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r3 == 0) goto L_0x04f5
            int r0 = r3.intValue()
            if (r0 != r7) goto L_0x04f5
            r3 = r1
        L_0x0433:
            if (r14 == 0) goto L_0x0437
            if (r5 != 0) goto L_0x04ea
        L_0x0437:
            java.lang.String r5 = r10.A02
            if (r5 != 0) goto L_0x04ea
            r5 = 0
        L_0x043c:
            java.lang.String r0 = r10.A03
            r19 = r0
            java.lang.String r0 = r10.A00
            r17 = r0
            X.Clh r15 = new X.Clh
            r15.<init>(r2)
            boolean r37 = X.AnonymousClass000.A1Z(r3, r1)
            java.lang.String r0 = r10.A01
            r16 = r0
            r14 = 0
            if (r13 == 0) goto L_0x04e7
            java.lang.String r0 = "atomTypeVersion"
            java.lang.Object r1 = r13.get(r0)
        L_0x045a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0461
            r14 = r1
            java.lang.Integer r14 = (java.lang.Integer) r14
        L_0x0461:
            r11 = 0
            if (r13 == 0) goto L_0x04e5
            java.lang.String r0 = "lowPriRamCacheSize"
            java.lang.Object r1 = r13.get(r0)
        L_0x046a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0471
            r11 = r1
            java.lang.Integer r11 = (java.lang.Integer) r11
        L_0x0471:
            r3 = 0
            if (r13 == 0) goto L_0x04e3
            java.lang.String r0 = "highPriRamCacheSize"
            java.lang.Object r1 = r13.get(r0)
        L_0x047a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0481
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x0481:
            r2 = 0
            if (r13 == 0) goto L_0x04e1
            java.lang.String r0 = "lowPriDiskCacheSize"
            java.lang.Object r1 = r13.get(r0)
        L_0x048a:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0491
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0491:
            r1 = 0
            if (r13 == 0) goto L_0x04df
            java.lang.String r0 = "highPriDiskCacheSize"
            java.lang.Object r13 = r13.get(r0)
        L_0x049a:
            boolean r0 = r13 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x04a1
            r1 = r13
            java.lang.Integer r1 = (java.lang.Integer) r1
        L_0x04a1:
            r20 = 0
            X.Cbe r0 = new X.Cbe
            r27 = r20
            r28 = r20
            r33 = r20
            r35 = r4
            r38 = r4
            r39 = r4
            r21 = r20
            r22 = r14
            r23 = r3
            r24 = r11
            r25 = r1
            r26 = r2
            r29 = r5
            r30 = r19
            r31 = r17
            r32 = r16
            r34 = r4
            r36 = r7
            r16 = r0
            r17 = r12
            r19 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r10, r0)
            r8.label = r7
            java.lang.Object r0 = r6.BJt(r0, r8)
        L_0x04dc:
            if (r0 != r9) goto L_0x002e
            return r9
        L_0x04df:
            r13 = r1
            goto L_0x049a
        L_0x04e1:
            r1 = r2
            goto L_0x048a
        L_0x04e3:
            r1 = r3
            goto L_0x047a
        L_0x04e5:
            r1 = r11
            goto L_0x046a
        L_0x04e7:
            r1 = r14
            goto L_0x045a
        L_0x04ea:
            java.lang.String r11 = ""
            int r0 = r11.length()
            if (r0 <= 0) goto L_0x043c
            r5 = r11
            goto L_0x043c
        L_0x04f5:
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            goto L_0x0433
        L_0x04f9:
            r1 = r3
            goto L_0x0421
        L_0x04fc:
            java.util.Map r13 = r10.A09
            r12 = 0
            if (r13 == 0) goto L_0x0507
            java.lang.String r11 = "quality_buckets"
            java.lang.Object r12 = r13.get(r11)
        L_0x0507:
            boolean r11 = r12 instanceof java.util.List
            if (r11 == 0) goto L_0x0515
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x0515
            X.BTI r12 = X.C25308CdD.A00(r12, r0)
            goto L_0x0417
        L_0x0515:
            java.lang.String r1 = "CdlQualityBucketParser"
            java.lang.String r0 = "No quality buckets found in props"
            X.C26294Cx6.A04(r1, r0)
            r0 = 1024(0x400, float:1.435E-42)
            X.BTI r12 = new X.BTI
            r12.<init>(r4, r0)
            goto L_0x0417
        L_0x0525:
            r11 = r5
            goto L_0x03e6
        L_0x0528:
            r1 = r3
            goto L_0x039e
        L_0x052b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0530:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0535:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x053a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x053f:
            r1 = move-exception
            java.lang.Object r0 = r4.A02
            X.4rF r0 = (X.C98494rF) r0
            r0.element = r1
            throw r1
        L_0x0547:
            java.lang.String r0 = "Unknown error type in LiveEditingPlayerEventsTrigger"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27185DXu.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
