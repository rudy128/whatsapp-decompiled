package X;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public final class C57142ib {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: android.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r3v11, types: [android.util.Pair] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00ca: MOVE  (r3v6 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[SYNTHETIC, Splitter:B:11:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[Catch:{ IOException -> 0x0059, all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d A[Catch:{ IOException -> 0x0059, all -> 0x0056 }] */
    public final android.util.Pair A00(android.graphics.Bitmap.CompressFormat r12, android.graphics.Bitmap r13, android.graphics.Rect r14, android.net.Uri r15, int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r11 = this;
            java.lang.String r5 = "no-space"
            r6 = 0
            X.C18070vi.A0f(r15, r6, r13)
            r0 = 7
            X.C18070vi.A0d(r12, r0)
            java.lang.String r0 = r15.getPath()
            r3 = 0
            if (r0 == 0) goto L_0x0124
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r8 = 75
        L_0x0018:
            r4 = 1
            X.00H r0 = r11.A01     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            X.11C r0 = (X.AnonymousClass11C) r0     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            X.11B r0 = r0.A0O()     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "CropImageUseCase/save-output cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0032
        L_0x002d:
            java.io.OutputStream r1 = r0.A08(r15)     // Catch:{ IOException -> 0x0059, all -> 0x0056 }
            goto L_0x0033
        L_0x0032:
            r1 = r3
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r13.compress(r12, r8, r1)     // Catch:{ IOException -> 0x0054 }
        L_0x0038:
            int r8 = r8 + -10
            X.AnonymousClass1EY.A02(r1)
            r1 = r17
            if (r17 == 0) goto L_0x0052
            if (r8 <= 0) goto L_0x0052
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0052
            long r9 = r2.length()
            long r0 = (long) r1
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0018
        L_0x0052:
            r1 = 0
            goto L_0x0095
        L_0x0054:
            r7 = move-exception
            goto L_0x005b
        L_0x0056:
            r0 = move-exception
            goto L_0x0120
        L_0x0059:
            r7 = move-exception
            r1 = r3
        L_0x005b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "CropImageUseCase/cannot save: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r15, r0, r3)     // Catch:{ all -> 0x011e }
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = r7.getMessage()     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x007e
            java.lang.String r3 = r7.getMessage()     // Catch:{ all -> 0x011e }
            if (r3 == 0) goto L_0x007e
            java.lang.String r0 = "No space"
            boolean r0 = X.AnonymousClass1YF.A0Y(r3, r0, r6)     // Catch:{ all -> 0x011e }
            if (r0 != r4) goto L_0x007e
            r3 = r5
            goto L_0x0080
        L_0x007e:
            java.lang.String r3 = "io-error"
        L_0x0080:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x011e }
            android.content.Intent r0 = X.C17880vN.A0A()     // Catch:{ all -> 0x011e }
            android.content.Intent r0 = r0.putExtra(r3, r4)     // Catch:{ all -> 0x011e }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x011e }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x011e }
            X.AnonymousClass1EY.A02(r1)
            r1 = 1
        L_0x0095:
            long r7 = r2.length()
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00c6
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r7 = r0.A01()
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "CompressImageTask/nospace"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            android.content.Intent r0 = X.C17880vN.A0A()
            android.content.Intent r0 = r0.putExtra(r5, r4)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            r1 = 1
        L_0x00c6:
            if (r1 != 0) goto L_0x011a
            if (r20 != 0) goto L_0x00f6
            r3 = r18
            if (r3 == r4) goto L_0x00f6
            if (r18 == 0) goto L_0x00f6
            boolean r0 = X.C26303CxM.A0M     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00e8 }
            X.CxM r2 = new X.CxM     // Catch:{ IOException -> 0x00e8 }
            r2.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00e8 }
            java.lang.String r1 = "Orientation"
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x00e8 }
            r2.A0c(r1, r0)     // Catch:{ IOException -> 0x00e8 }
            r2.A0b()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00f6
        L_0x00e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CropImageUseCase/exif/cannot save: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r15, r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00f6:
            android.content.Intent r1 = X.C17880vN.A0A()
            r1.setData(r15)
            java.lang.String r0 = "rect"
            r1.putExtra(r0, r14)
            java.lang.String r0 = "rotate"
            r2 = r16
            r1.putExtra(r0, r2)
            java.lang.String r0 = "composerToolToOpenOnComplete"
            r2 = r19
            r1.putExtra(r0, r2)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r1)
        L_0x011a:
            r13.recycle()
            return r3
        L_0x011e:
            r0 = move-exception
            r3 = r1
        L_0x0120:
            X.AnonymousClass1EY.A02(r3)
            throw r0
        L_0x0124:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57142ib.A00(android.graphics.Bitmap$CompressFormat, android.graphics.Bitmap, android.graphics.Rect, android.net.Uri, int, int, int, int, boolean):android.util.Pair");
    }

    public C57142ib(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
