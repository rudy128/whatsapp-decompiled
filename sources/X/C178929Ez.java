package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ez  reason: invalid class name and case insensitive filesystem */
public final class C178929Ez extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C184649bI A00;

    public static final void A00(C184649bI r23, C29621ca r24, AnonymousClass9F7 r25) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r02;
        Object obj;
        C193139pb r8;
        AnonymousClass9F7 r22 = r25;
        C18070vi.A0d(r22, 1);
        ArrayList A16 = C108955ca.A16(r23, 2);
        C29621ca r7 = r24;
        try {
            C108945cZ.A1N(r7);
            Object obj2 = r22.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = new String[2];
            strArr[0] = "false";
            List A0O = C18070vi.A0O("true", strArr, 1);
            String[] strArr2 = new String[2];
            AnonymousClass8BR.A1K(strArr2, 0, 1, "result");
            String A07 = A0s.A07(r7, A0O, strArr2);
            if (A07 != null) {
                Long l = null;
                String str = (String) A0s.A05(r7, String.class, C108975cc.A0X(), AnonymousClass8BV.A0j(), (Object) null, new String[]{"result", "credential"}, false);
                Class cls = Long.TYPE;
                Long A0L = C17890vO.A0L();
                Long A0j = AnonymousClass8BU.A0j();
                C29621ca r14 = r7;
                Number number = (Number) A0s.A05(r14, cls, A0L, A0j, (Object) null, new String[]{"result", "create_ts_s"}, false);
                Number number2 = (Number) A0s.A05(r14, cls, A0L, A0j, (Object) null, new String[]{"result", "used_ts_s"}, false);
                if (C21289Aha.A00(obj2, C197359wZ.A00, 21).BCF(r7, A0s) != null) {
                    new AnonymousClass9SG
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009d: CONSTRUCTOR  (r2v8 ? I:X.9SG) =  call: X.9SG.<init>():void type: CONSTRUCTOR in method: X.9Ez.A00(X.9bI, X.1ca, X.9F7):void, dex: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v8 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 46 more
                        */
                    /*
                        r6 = 0
                        r5 = 1
                        r22 = r25
                        r0 = r22
                        X.C18070vi.A0d(r0, r5)
                        r4 = 2
                        r0 = r23
                        java.util.ArrayList r3 = X.C108955ca.A16(r0, r4)
                        r7 = r24
                        X.C108945cZ.A1N(r7)     // Catch:{ 1UI -> 0x00f1 }
                        r0 = r22
                        java.lang.Object r0 = r0.A00     // Catch:{ 1UI -> 0x00f1 }
                        r21 = r0
                        X.2rm r9 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r0 = "false"
                        r1[r6] = r0     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r8 = "true"
                        java.util.List r1 = X.C18070vi.A0O(r8, r1, r5)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r2 = "result"
                        X.AnonymousClass8BR.A1K(r0, r6, r5, r2)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r1 = r9.A07(r7, r1, r0)     // Catch:{ 1UI -> 0x00f1 }
                        if (r1 == 0) goto L_0x00e7
                        java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x00f1 }
                        r10[r6] = r2     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r0 = "credential"
                        r10[r5] = r0     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Class<java.lang.String> r11 = java.lang.String.class
                        java.lang.Long r12 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Long r13 = X.AnonymousClass8BV.A0j()     // Catch:{ 1UI -> 0x00f1 }
                        r0 = 0
                        r14 = r0
                        r15 = r10
                        r16 = r6
                        r10 = r7
                        java.lang.Object r12 = r9.A05(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r12 = (java.lang.String) r12     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String[] r11 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x00f1 }
                        r11[r6] = r2     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r10 = "create_ts_s"
                        r11[r5] = r10     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Class r15 = java.lang.Long.TYPE     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Long r16 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Long r17 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x00f1 }
                        r18 = r0
                        r19 = r11
                        r20 = r6
                        r13 = r9
                        r14 = r7
                        java.lang.Object r11 = r13.A05(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x00f1 }
                        r10[r6] = r2     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.String r13 = "used_ts_s"
                        r10[r5] = r13     // Catch:{ 1UI -> 0x00f1 }
                        r19 = r10
                        r13 = r9
                        java.lang.Object r14 = r13.A05(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Number r14 = (java.lang.Number) r14     // Catch:{ 1UI -> 0x00f1 }
                        X.9wZ r13 = X.C197359wZ.A00     // Catch:{ 1UI -> 0x00f1 }
                        r10 = 21
                        r15 = r21
                        X.Aha r10 = X.C21289Aha.A00(r15, r13, r10)     // Catch:{ 1UI -> 0x00f1 }
                        java.lang.Object r10 = r10.BCF(r7, r9)     // Catch:{ 1UI -> 0x00f1 }
                        if (r10 == 0) goto L_0x00ec
                        java.lang.String[] r9 = new java.lang.String[r5]     // Catch:{ 1UI -> 0x00f1 }
                        r9[r6] = r2     // Catch:{ 1UI -> 0x00f1 }
                        X.9SG r2 = new X.9SG     // Catch:{ 1UI -> 0x00f1 }
                        r2.<init>()     // Catch:{ 1UI -> 0x00f1 }
                        X.AnonymousClass8BS.A1A(r7, r9)     // Catch:{ 1UI -> 0x00f1 }
                        r2 = r23
                        X.9Y6 r9 = r2.A00     // Catch:{ 1UI -> 0x00f1 }
                        boolean r1 = r1.equals(r8)     // Catch:{ 1UI -> 0x00f1 }
                        if (r1 == 0) goto L_0x00cb
                        r10 = 0
                        if (r12 == 0) goto L_0x00ba
                        X.9pc r1 = X.C196759vb.A00(r12)     // Catch:{ 1UI -> 0x00f1 }
                        X.9pb r8 = new X.9pb     // Catch:{ 1UI -> 0x00f1 }
                        r8.<init>(r1)     // Catch:{ 1UI -> 0x00f1 }
                        goto L_0x00bb
                    L_0x00ba:
                        r8 = r0
                    L_0x00bb:
                        r12 = 1000(0x3e8, double:4.94E-321)
                        if (r11 == 0) goto L_0x00c8
                        long r0 = r11.longValue()     // Catch:{ 1UI -> 0x00f1 }
                        long r0 = r0 * r12
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 1UI -> 0x00f1 }
                    L_0x00c8:
                        if (r14 == 0) goto L_0x00d7
                        goto L_0x00ce
                    L_0x00cb:
                        X.AWx r2 = X.C20742AWx.A00     // Catch:{ 1UI -> 0x00f1 }
                        goto L_0x00dc
                    L_0x00ce:
                        long r1 = r14.longValue()     // Catch:{ 1UI -> 0x00f1 }
                        long r1 = r1 * r12
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)     // Catch:{ 1UI -> 0x00f1 }
                    L_0x00d7:
                        X.AWw r2 = new X.AWw     // Catch:{ 1UI -> 0x00f1 }
                        r2.<init>(r8, r0, r10)     // Catch:{ 1UI -> 0x00f1 }
                    L_0x00dc:
                        X.1dr r1 = r9.A00     // Catch:{ 1UI -> 0x00f1 }
                        X.8yZ r0 = new X.8yZ     // Catch:{ 1UI -> 0x00f1 }
                        r0.<init>(r2)     // Catch:{ 1UI -> 0x00f1 }
                        r1.resumeWith(r0)     // Catch:{ 1UI -> 0x00f1 }
                        return
                    L_0x00e7:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x00f1 }
                        goto L_0x00f0
                    L_0x00ec:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r9)     // Catch:{ 1UI -> 0x00f1 }
                    L_0x00f0:
                        throw r0     // Catch:{ 1UI -> 0x00f1 }
                    L_0x00f1:
                        r2 = move-exception
                        java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                        java.lang.String r0 = "PasskeyExistCheckResponseSuccess: "
                        X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
                        X.C108945cZ.A1N(r7)     // Catch:{ 1UI -> 0x0180 }
                        r0 = r22
                        java.lang.Object r1 = r0.A00     // Catch:{ 1UI -> 0x0180 }
                        X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0180 }
                        X.9wZ r9 = X.C197359wZ.A00     // Catch:{ 1UI -> 0x0180 }
                        r0 = 20
                        X.Aha r0 = X.C21289Aha.A00(r1, r9, r0)     // Catch:{ 1UI -> 0x0180 }
                        java.lang.Object r0 = r0.BCF(r7, r8)     // Catch:{ 1UI -> 0x0180 }
                        if (r0 == 0) goto L_0x0176
                        r0 = 7
                        X.B9c[] r2 = new X.C22470B9c[r0]     // Catch:{ 1UI -> 0x0180 }
                        r0 = 29
                        X.C21284AhV.A00(r2, r0, r6, r9)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 30
                        X.C21284AhV.A00(r2, r0, r5, r9)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 31
                        X.C21284AhV.A00(r2, r0, r4, r9)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 32
                        X.AhV r1 = new X.AhV     // Catch:{ 1UI -> 0x0180 }
                        r1.<init>(r9, r0)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 3
                        r2[r0] = r1     // Catch:{ 1UI -> 0x0180 }
                        r0 = 33
                        X.AhV r1 = new X.AhV     // Catch:{ 1UI -> 0x0180 }
                        r1.<init>(r9, r0)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 4
                        r2[r0] = r1     // Catch:{ 1UI -> 0x0180 }
                        r0 = 34
                        X.AhV r1 = new X.AhV     // Catch:{ 1UI -> 0x0180 }
                        r1.<init>(r9, r0)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 5
                        r2[r0] = r1     // Catch:{ 1UI -> 0x0180 }
                        r0 = 35
                        X.AhV r1 = new X.AhV     // Catch:{ 1UI -> 0x0180 }
                        r1.<init>(r9, r0)     // Catch:{ 1UI -> 0x0180 }
                        r0 = 6
                        java.util.List r2 = X.C18070vi.A0O(r1, r2, r0)     // Catch:{ 1UI -> 0x0180 }
                        java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r5, r6)     // Catch:{ 1UI -> 0x0180 }
                        java.lang.String r0 = "IQErrorBadRequest|IQErrorNotAllowed|IQErrorInternalServerError|IQErrorRequestTimeout|IQErrorRateOverlimit|IQErrorServiceUnavailable|IQErrorFeatureNotImplemented"
                        java.lang.Object r2 = r8.A06(r7, r0, r2, r1)     // Catch:{ 1UI -> 0x0180 }
                        if (r2 == 0) goto L_0x017b
                        X.9Cn r2 = (X.C178289Cn) r2     // Catch:{ 1UI -> 0x0180 }
                        r0 = r23
                        X.9Y6 r1 = r0.A00     // Catch:{ 1UI -> 0x0180 }
                        long r4 = r2.A00     // Catch:{ 1UI -> 0x0180 }
                        java.lang.String r0 = r2.A02     // Catch:{ 1UI -> 0x0180 }
                        X.9L9 r2 = new X.9L9     // Catch:{ 1UI -> 0x0180 }
                        r2.<init>(r4, r0)     // Catch:{ 1UI -> 0x0180 }
                        X.1dr r1 = r1.A00     // Catch:{ 1UI -> 0x0180 }
                        X.8yY r0 = new X.8yY     // Catch:{ 1UI -> 0x0180 }
                        r0.<init>(r2)     // Catch:{ 1UI -> 0x0180 }
                        r1.resumeWith(r0)     // Catch:{ 1UI -> 0x0180 }
                        return
                    L_0x0176:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0180 }
                        goto L_0x017f
                    L_0x017b:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0180 }
                    L_0x017f:
                        throw r0     // Catch:{ 1UI -> 0x0180 }
                    L_0x0180:
                        r2 = move-exception
                        java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                        java.lang.String r0 = "PasskeyExistCheckResponseError: "
                        X.1UI r0 = X.AnonymousClass8BY.A0N(r0, r1, r2, r3)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C178929Ez.A00(X.9bI, X.1ca, X.9F7):void");
                }

                public void BrD(String str) {
                    C18070vi.A0d(str, 0);
                }

                public C178929Ez(C184649bI r1, AnonymousClass9F7 r2) {
                    this.A00 = r2;
                    this.A00 = r1;
                }

                public void Bt9(C29621ca r3, String str) {
                    A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
                }

                public void C7Z(C29621ca r3, String str) {
                    A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
                }

                public /* synthetic */ C22384B5n CM9(String str) {
                    return C20958AcC.A00;
                }
            }
