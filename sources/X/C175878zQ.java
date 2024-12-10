package X;

import android.content.Context;

/* renamed from: X.8zQ  reason: invalid class name and case insensitive filesystem */
public class C175878zQ extends C175498yo {
    public final AnonymousClass190 A00;
    public final C190779lV A01;
    public final AnonymousClass9F3 A02;

    public void A06(C29621ca r25) {
        try {
            AnonymousClass9F3 r4 = this.A02;
            C29621ca r3 = r25;
            int A0G = C72453Mb.A0G(r3, r4, 1);
            C108945cZ.A1N(r3);
            C29621ca r9 = (C29621ca) r4.A04;
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = new String[A0G];
            strArr[0] = "account";
            strArr[1] = "action";
            Class<String> cls = String.class;
            String[] strArr2 = new String[A0G];
            strArr2[0] = "account";
            Long A0Z = AnonymousClass8BW.A0Z("action", strArr2, 1);
            Long A0j = AnonymousClass8BU.A0j();
            Object A05 = A0s.A05(r9, cls, A0Z, A0j, (Object) null, strArr2, false);
            if (A05 != null) {
                C62672rm r16 = A0s;
                Class<String> cls2 = cls;
                C29621ca r17 = r3;
                if (r16.A05(r17, cls2, A0Z, A0j, A05, strArr, true) != null) {
                    String[] strArr3 = new String[A0G];
                    strArr3[0] = "account";
                    strArr3[1] = "transaction-id";
                    Long A0X = C108975cc.A0X();
                    String str = (String) r16.A05(r17, cls2, A0X, AnonymousClass8BV.A0j(), (Object) null, strArr3, false);
                    if (str != null) {
                        String[] strArr4 = new String[A0G];
                        strArr4[0] = "account";
                        strArr4[1] = "mandate-no";
                        String str2 = (String) r16.A05(r17, cls2, A0X, AnonymousClass8BV.A0f(), (Object) null, strArr4, false);
                        if (str2 == null) {
                            throw AnonymousClass1O9.A00(A0s);
                        } else if (C21289Aha.A00(r9, C20072A5y.A00, 29).BCF(r3, A0s) != null) {
                            new AnonymousClass9SI
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0092: CONSTRUCTOR  (r0v11 ? I:X.9SI) =  call: X.9SI.<init>():void type: CONSTRUCTOR in method: X.8zQ.A06(X.1ca):void, dex: classes5.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v11 ?
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	... 56 more
                                */
                            /*
                                this = this;
                                r13 = 0
                                r1 = r24
                                X.9F3 r4 = r1.A02     // Catch:{ 1UI -> 0x00b7 }
                                r2 = 1
                                r3 = r25
                                int r0 = X.C72453Mb.A0G(r3, r4, r2)     // Catch:{ 1UI -> 0x00b7 }
                                X.C108945cZ.A1N(r3)     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Object r9 = r4.A04     // Catch:{ 1UI -> 0x00b7 }
                                X.1ca r9 = (X.C29621ca) r9     // Catch:{ 1UI -> 0x00b7 }
                                X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x00b7 }
                                r15 = 0
                                java.lang.String r7 = "account"
                                r5[r15] = r7     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String r4 = "action"
                                r5[r2] = r4     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                                java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x00b7 }
                                r14[r15] = r7     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Long r11 = X.AnonymousClass8BW.A0Z(r4, r14, r2)     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Long r12 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Object r21 = r8.A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1UI -> 0x00b7 }
                                if (r21 == 0) goto L_0x00b2
                                r16 = r8
                                r18 = r10
                                r19 = r11
                                r20 = r12
                                r22 = r5
                                r23 = r2
                                r17 = r3
                                java.lang.Object r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x00b7 }
                                if (r4 == 0) goto L_0x00ad
                                java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x00b7 }
                                r5[r15] = r7     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String r4 = "transaction-id"
                                r5[r2] = r4     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Long r19 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Long r20 = X.AnonymousClass8BV.A0j()     // Catch:{ 1UI -> 0x00b7 }
                                r21 = r13
                                r22 = r5
                                r23 = r15
                                java.lang.Object r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String r4 = (java.lang.String) r4     // Catch:{ 1UI -> 0x00b7 }
                                if (r4 == 0) goto L_0x00a8
                                java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x00b7 }
                                r5[r15] = r7     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String r0 = "mandate-no"
                                r5[r2] = r0     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Long r20 = X.AnonymousClass8BV.A0f()     // Catch:{ 1UI -> 0x00b7 }
                                r22 = r5
                                java.lang.Object r6 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.String r6 = (java.lang.String) r6     // Catch:{ 1UI -> 0x00b7 }
                                if (r6 == 0) goto L_0x00a3
                                X.A5y r5 = X.C20072A5y.A00     // Catch:{ 1UI -> 0x00b7 }
                                r0 = 29
                                X.Aha r0 = X.C21289Aha.A00(r9, r5, r0)     // Catch:{ 1UI -> 0x00b7 }
                                java.lang.Object r0 = r0.BCF(r3, r8)     // Catch:{ 1UI -> 0x00b7 }
                                if (r0 == 0) goto L_0x009e
                                java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x00b7 }
                                r2[r15] = r7     // Catch:{ 1UI -> 0x00b7 }
                                X.9SI r0 = new X.9SI     // Catch:{ 1UI -> 0x00b7 }
                                r0.<init>()     // Catch:{ 1UI -> 0x00b7 }
                                X.AnonymousClass8BS.A1A(r3, r2)     // Catch:{ 1UI -> 0x00b7 }
                                X.9lV r0 = r1.A01     // Catch:{ 1UI -> 0x00b7 }
                                r0.A00(r13, r6, r4)     // Catch:{ 1UI -> 0x00b7 }
                                return
                            L_0x009e:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x00b7 }
                                throw r0     // Catch:{ 1UI -> 0x00b7 }
                            L_0x00a3:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x00b7 }
                                throw r0     // Catch:{ 1UI -> 0x00b7 }
                            L_0x00a8:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x00b7 }
                                throw r0     // Catch:{ 1UI -> 0x00b7 }
                            L_0x00ad:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x00b7 }
                                throw r0     // Catch:{ 1UI -> 0x00b7 }
                            L_0x00b2:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x00b7 }
                                throw r0     // Catch:{ 1UI -> 0x00b7 }
                            L_0x00b7:
                                X.9lV r2 = r1.A01
                                r1 = 500(0x1f4, float:7.0E-43)
                                X.A7B r0 = new X.A7B
                                r0.<init>((int) r1)
                                r2.A00(r0, r13, r13)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C175878zQ.A06(X.1ca):void");
                        }

                        public C175878zQ(Context context, AnonymousClass190 r8, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C190779lV r12, AnonymousClass9F3 r13) {
                            super(context, r9, r10, r11, "upi-create-mandate");
                            this.A00 = r8;
                            this.A02 = r13;
                            this.A01 = r12;
                        }

                        public void A04(A7B a7b) {
                            super.A04(a7b);
                            this.A01.A00(a7b, (String) null, (String) null);
                        }

                        public void A05(A7B a7b) {
                            super.A05(a7b);
                            this.A01.A00(a7b, (String) null, (String) null);
                        }
                    }
