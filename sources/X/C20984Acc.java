package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.Acc  reason: case insensitive filesystem */
public final class C20984Acc implements AnonymousClass1O5 {
    public final /* synthetic */ AnonymousClass1GV A00;
    public final /* synthetic */ AnonymousClass1GV A01;
    public final /* synthetic */ AnonymousClass1GV A02;
    public final /* synthetic */ C187249fV A03;
    public final /* synthetic */ AnonymousClass9F6 A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ boolean A06;

    public void Bt9(C29621ca r10, String str) {
        AnonymousClass1UI r0;
        C18070vi.A0d(r10, 1);
        Log.e("ExitCommunityProtocolHelper/getIqResponseCallback/onError");
        try {
            AnonymousClass9F6 r02 = this.A04;
            AnonymousClass8BT.A1I(r10, r02, 2);
            Object obj = r02.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            A97 a97 = A97.A00;
            C21290Ahb ahb = new C21290Ahb(obj, a97, 46);
            C18070vi.A0d(ahb, 1);
            if (ahb.BCF(r10, A0s) != null) {
                C22470B9c[] b9cArr = new C22470B9c[7];
                C21283AhU.A00(b9cArr, 40, 0, a97);
                C21283AhU.A00(b9cArr, 41, 1, a97);
                C21283AhU.A00(b9cArr, 42, 2, a97);
                b9cArr[3] = new C21283AhU(a97, 43);
                b9cArr[4] = new C21283AhU(a97, 44);
                b9cArr[5] = new C21283AhU(a97, 45);
                Object A062 = A0s.A06(r10, "IQErrorRateOverlimit|IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorForbidden|IQErrorLocked|IQErrorFallbackClient", C18070vi.A0O(new C21283AhU(a97, 46), b9cArr, 6), AnonymousClass8BS.A1b(1, 0));
                if (A062 != null) {
                    ((C22478B9k) A062).BAa(new C197649x2(this.A01));
                    return;
                }
                r0 = AnonymousClass1O9.A00(A0s);
            } else {
                r0 = AnonymousClass1O9.A00(A0s);
            }
            throw r0;
        } catch (AnonymousClass1UI e) {
            Log.w((Throwable) e);
            this.A01.accept(1);
        }
    }

    public void C7Z(C29621ca r16, String str) {
        AnonymousClass1UI r0;
        int i;
        C29621ca r8 = r16;
        C18070vi.A0d(r8, 1);
        Log.i("ExitCommunityProtocolHelper/getIqResponseCallback/onSuccess");
        try {
            AnonymousClass9F6 r02 = this.A04;
            AnonymousClass8BT.A1I(r8, r02, 2);
            C62672rm A0s = AnonymousClass8BR.A0s();
            A97 a97 = A97.A00;
            C21290Ahb ahb = new C21290Ahb((C29621ca) r02.A00, a97, 47);
            C18070vi.A0d(ahb, 1);
            if (((AnonymousClass9DG) ahb.BCF(r8, A0s)) != null) {
                if (A0s.A08(r8, new C21283AhU(a97, 47), new String[]{"leave", "group"}, 0, 1024) != null) {
                    ArrayList A08 = A0s.A08(r8, new C21283AhU(a97, 48), new String[]{"leave", "linked_groups"}, 0, 1024);
                    if (A08 != null) {
                        new AnonymousClass9SD
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r0v14 ? I:X.9SD) =  call: X.9SD.<init>():void type: CONSTRUCTOR in method: X.Acc.C7Z(X.1ca, java.lang.String):void, dex: classes5.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v14 ?
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	... 49 more
                            */
                        /*
                            this = this;
                            r3 = 1
                            r8 = r16
                            X.C18070vi.A0d(r8, r3)
                            java.lang.String r0 = "ExitCommunityProtocolHelper/getIqResponseCallback/onSuccess"
                            com.whatsapp.util.Log.i((java.lang.String) r0)
                            X.9F6 r0 = r15.A04     // Catch:{ Exception -> 0x00f3 }
                            r2 = 2
                            X.AnonymousClass8BT.A1I(r8, r0, r2)     // Catch:{ Exception -> 0x00f3 }
                            java.lang.Object r4 = r0.A00     // Catch:{ Exception -> 0x00f3 }
                            X.1ca r4 = (X.C29621ca) r4     // Catch:{ Exception -> 0x00f3 }
                            X.2rm r7 = X.AnonymousClass8BR.A0s()     // Catch:{ Exception -> 0x00f3 }
                            X.A97 r1 = X.A97.A00     // Catch:{ Exception -> 0x00f3 }
                            r6 = 47
                            X.Ahb r0 = new X.Ahb     // Catch:{ Exception -> 0x00f3 }
                            r0.<init>(r4, r1, r6)     // Catch:{ Exception -> 0x00f3 }
                            r5 = 0
                            X.C18070vi.A0d(r0, r3)     // Catch:{ Exception -> 0x00f3 }
                            java.lang.Object r0 = r0.BCF(r8, r7)     // Catch:{ Exception -> 0x00f3 }
                            X.9DG r0 = (X.AnonymousClass9DG) r0     // Catch:{ Exception -> 0x00f3 }
                            if (r0 == 0) goto L_0x00e9
                            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00f3 }
                            java.lang.String r4 = "leave"
                            r10[r5] = r4     // Catch:{ Exception -> 0x00f3 }
                            java.lang.String r0 = "group"
                            r10[r3] = r0     // Catch:{ Exception -> 0x00f3 }
                            X.AhU r9 = new X.AhU     // Catch:{ Exception -> 0x00f3 }
                            r9.<init>(r1, r6)     // Catch:{ Exception -> 0x00f3 }
                            r11 = 0
                            r13 = 1024(0x400, double:5.06E-321)
                            java.util.ArrayList r0 = r7.A08(r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x00f3 }
                            if (r0 == 0) goto L_0x00ee
                            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00f3 }
                            r10[r5] = r4     // Catch:{ Exception -> 0x00f3 }
                            java.lang.String r0 = "linked_groups"
                            r10[r3] = r0     // Catch:{ Exception -> 0x00f3 }
                            r0 = 48
                            X.AhU r9 = new X.AhU     // Catch:{ Exception -> 0x00f3 }
                            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x00f3 }
                            java.util.ArrayList r2 = r7.A08(r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x00f3 }
                            if (r2 == 0) goto L_0x00e4
                            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00f3 }
                            r1[r5] = r4     // Catch:{ Exception -> 0x00f3 }
                            X.9SD r0 = new X.9SD     // Catch:{ Exception -> 0x00f3 }
                            r0.<init>()     // Catch:{ Exception -> 0x00f3 }
                            X.AnonymousClass8BS.A1A(r8, r1)     // Catch:{ Exception -> 0x00f3 }
                            java.util.ArrayList r7 = X.AnonymousClass000.A13()
                            java.util.ArrayList r5 = X.AnonymousClass000.A13()
                            java.util.Iterator r4 = r2.iterator()
                        L_0x0074:
                            boolean r0 = r4.hasNext()
                            if (r0 == 0) goto L_0x00ad
                            java.lang.Object r1 = r4.next()
                            X.9DP r1 = (X.AnonymousClass9DP) r1
                            java.lang.Object r0 = r1.A02
                            X.9Co r0 = (X.C178299Co) r0
                            java.lang.Object r2 = r0.A02
                            X.1EC r2 = (X.AnonymousClass1EC) r2
                            java.lang.Object r0 = r1.A00
                            X.9Ce r0 = (X.C178199Ce) r0
                            if (r0 != 0) goto L_0x0092
                            r5.add(r2)
                            goto L_0x0074
                        L_0x0092:
                            X.9xJ r1 = new X.9xJ
                            r1.<init>(r2, r7)
                            int r0 = r0.A00
                            java.util.List r3 = r1.A01
                            X.1EC r2 = r1.A00
                            int r0 = 2 - r0
                            if (r0 == 0) goto L_0x00ab
                            r1 = 2
                        L_0x00a2:
                            X.9an r0 = new X.9an
                            r0.<init>(r2, r1)
                            r3.add(r0)
                            goto L_0x0074
                        L_0x00ab:
                            r1 = 0
                            goto L_0x00a2
                        L_0x00ad:
                            X.9ao r6 = new X.9ao
                            r6.<init>(r5, r7)
                            java.util.List r5 = r6.A01
                            boolean r0 = X.AnonymousClass000.A1a(r5)
                            if (r0 == 0) goto L_0x00d0
                            boolean r4 = r15.A06
                            X.9fV r3 = r15.A03
                            X.00H r0 = r3.A02
                            java.lang.Object r2 = r0.get()
                            X.2kZ r2 = (X.C58362kZ) r2
                            r1 = 24
                            X.7RF r0 = new X.7RF
                            r0.<init>(r5, r3, r1, r4)
                            r2.A01(r0)
                        L_0x00d0:
                            java.util.List r0 = r6.A00
                            boolean r0 = r0.isEmpty()
                            if (r0 == 0) goto L_0x00de
                            java.lang.Runnable r0 = r15.A05
                            r0.run()
                            return
                        L_0x00de:
                            X.1GV r0 = r15.A02
                            r0.accept(r6)
                            return
                        L_0x00e4:
                            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ Exception -> 0x00f3 }
                            goto L_0x00f2
                        L_0x00e9:
                            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ Exception -> 0x00f3 }
                            goto L_0x00f2
                        L_0x00ee:
                            X.1UI r0 = X.AnonymousClass1O9.A00(r7)     // Catch:{ Exception -> 0x00f3 }
                        L_0x00f2:
                            throw r0     // Catch:{ Exception -> 0x00f3 }
                        L_0x00f3:
                            r2 = move-exception
                            X.1GV r1 = r15.A01
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                            r1.accept(r0)
                            throw r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20984Acc.C7Z(X.1ca, java.lang.String):void");
                    }

                    public C20984Acc(AnonymousClass1GV r1, AnonymousClass1GV r2, AnonymousClass1GV r3, C187249fV r4, AnonymousClass9F6 r5, Runnable runnable, boolean z) {
                        this.A04 = r5;
                        this.A01 = r1;
                        this.A06 = z;
                        this.A05 = runnable;
                        this.A02 = r2;
                        this.A00 = r3;
                        this.A03 = r4;
                    }

                    public void BrD(String str) {
                        this.A00.accept(AnonymousClass3MY.A0f());
                    }

                    public /* synthetic */ C22384B5n CM9(String str) {
                        return C20958AcC.A00;
                    }
                }
