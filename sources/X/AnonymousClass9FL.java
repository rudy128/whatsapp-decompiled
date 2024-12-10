package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9FL  reason: invalid class name */
public final class AnonymousClass9FL extends AnonymousClass9CP {
    public final long A00;
    public final AnonymousClass1EC A01;
    public final UserJid A02;
    public final AnonymousClass9CY A03;
    public final AnonymousClass1EC A04;
    public final C29621ca A05;

    public AnonymousClass9FL(C29621ca r31, AnonymousClass9F6 r32) {
        AnonymousClass9F6 r3 = r32;
        C18070vi.A0d(r3, 2);
        C29621ca r5 = r31;
        C29621ca A002 = AnonymousClass9F6.A00(r5, r3);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"from"};
        Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        Object A052 = A0s.A05(A002, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A052 != null) {
            C62672rm r16 = A0s;
            Long l = A0Z;
            Long l2 = A0j;
            AnonymousClass1EC r33 = (AnonymousClass1EC) r16.A05(r5, cls, l, l2, A052, strArr, true);
            if (r33 != null) {
                this.A04 = r33;
                String[] strArr3 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls2 = String.class;
                Object A053 = r16.A05(A002, cls2, l, l2, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                if (A053 == null) {
                    throw AnonymousClass1O9.A00(A0s);
                } else if (r16.A05(r5, cls2, l, l2, A053, strArr3, true) != null) {
                    C29621ca r9 = r5;
                    AnonymousClass1EC r34 = (AnonymousClass1EC) A0s.A05(r9, cls, A0Z, A0j, (Object) null, new String[]{"sub_group_suggestion", "jid"}, false);
                    if (r34 != null) {
                        this.A01 = r34;
                        UserJid userJid = (UserJid) A0s.A05(r9, UserJid.class, A0Z, A0j, (Object) null, new String[]{"sub_group_suggestion", "creator"}, false);
                        if (userJid != null) {
                            this.A02 = userJid;
                            C62672rm r19 = A0s;
                            C29621ca r20 = r5;
                            Number number = (Number) r19.A05(r20, Long.TYPE, C17890vO.A0L(), A0j, (Object) null, new String[]{"sub_group_suggestion", "creation"}, false);
                            if (number != null) {
                                this.A00 = number.longValue();
                                if (A0s.A05(r5, cls2, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                                    String[] strArr4 = {"sub_group_suggestion", "description"};
                                    this.A03 = (AnonymousClass9CY) A0s.A02(r5, new C21283AhU(A97.A00, 21), strArr4);
                                    this.A00 = r5;
                                    new AnonymousClass9SC
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00fc: CONSTRUCTOR  (r0v9 ? I:X.9SC) =  call: X.9SC.<init>():void type: CONSTRUCTOR in method: X.9FL.<init>(X.1ca, X.9F6):void, dex: classes5.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v9 ?
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	... 74 more
                                        */
                                    /*
                                        this = this;
                                        r0 = 1
                                        r2 = 2
                                        r3 = r32
                                        X.C18070vi.A0d(r3, r2)
                                        r1 = r30
                                        r1.<init>()
                                        java.lang.String r27 = "result"
                                        r5 = r31
                                        X.1ca r9 = X.AnonymousClass9F6.A00(r5, r3)
                                        X.2rm r8 = X.AnonymousClass8BR.A0s()
                                        java.lang.String[] r4 = new java.lang.String[r0]
                                        java.lang.String r3 = "from"
                                        r15 = 0
                                        r4[r15] = r3
                                        java.lang.Class<X.1EC> r10 = X.AnonymousClass1EC.class
                                        java.lang.String[] r14 = new java.lang.String[r0]
                                        java.lang.String r3 = "to"
                                        java.lang.Long r11 = X.AnonymousClass8BW.A0Z(r3, r14, r15)
                                        java.lang.Long r12 = X.AnonymousClass8BU.A0j()
                                        r13 = 0
                                        java.lang.Object r21 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
                                        if (r21 == 0) goto L_0x012d
                                        r16 = r8
                                        r18 = r10
                                        r19 = r11
                                        r20 = r12
                                        r22 = r4
                                        r23 = r0
                                        r17 = r5
                                        java.lang.Object r3 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
                                        X.1EC r3 = (X.AnonymousClass1EC) r3
                                        if (r3 == 0) goto L_0x0128
                                        r1.A04 = r3
                                        java.lang.String[] r4 = new java.lang.String[r0]
                                        java.lang.String r6 = "id"
                                        r4[r15] = r6
                                        java.lang.Class<java.lang.String> r18 = java.lang.String.class
                                        java.lang.String[] r3 = new java.lang.String[r0]
                                        r3[r15] = r6
                                        r17 = r9
                                        r21 = r13
                                        r22 = r3
                                        r23 = r15
                                        java.lang.Object r21 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
                                        if (r21 == 0) goto L_0x0123
                                        r17 = r5
                                        r22 = r4
                                        r23 = r0
                                        java.lang.Object r3 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
                                        if (r3 == 0) goto L_0x011e
                                        java.lang.String[] r4 = new java.lang.String[r2]
                                        java.lang.String r7 = "sub_group_suggestion"
                                        r4[r15] = r7
                                        java.lang.String r3 = "jid"
                                        r4[r0] = r3
                                        r9 = r5
                                        r14 = r4
                                        java.lang.Object r3 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
                                        X.1EC r3 = (X.AnonymousClass1EC) r3
                                        if (r3 == 0) goto L_0x0119
                                        r1.A01 = r3
                                        java.lang.String[] r4 = new java.lang.String[r2]
                                        r4[r15] = r7
                                        java.lang.String r3 = "creator"
                                        r4[r0] = r3
                                        java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
                                        r14 = r4
                                        java.lang.Object r3 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
                                        com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
                                        if (r3 == 0) goto L_0x0114
                                        r1.A02 = r3
                                        java.lang.String[] r4 = new java.lang.String[r2]
                                        r4[r15] = r7
                                        java.lang.String r3 = "creation"
                                        r4[r0] = r3
                                        java.lang.Class r21 = java.lang.Long.TYPE
                                        java.lang.Long r22 = X.C17890vO.A0L()
                                        r19 = r8
                                        r20 = r5
                                        r23 = r12
                                        r24 = r13
                                        r25 = r4
                                        r26 = r15
                                        java.lang.Object r3 = r19.A05(r20, r21, r22, r23, r24, r25, r26)
                                        java.lang.Number r3 = (java.lang.Number) r3
                                        if (r3 == 0) goto L_0x010f
                                        long r3 = r3.longValue()
                                        r1.A00 = r3
                                        java.lang.String[] r28 = X.AnonymousClass8BS.A1a(r0, r15)
                                        r22 = r8
                                        r23 = r5
                                        r24 = r18
                                        r25 = r11
                                        r26 = r12
                                        r29 = r15
                                        java.lang.Object r3 = r22.A05(r23, r24, r25, r26, r27, r28, r29)
                                        if (r3 == 0) goto L_0x010a
                                        X.A97 r6 = X.A97.A00
                                        java.lang.String[] r4 = new java.lang.String[r2]
                                        r4[r15] = r7
                                        java.lang.String r2 = "description"
                                        r4[r0] = r2
                                        r3 = 21
                                        X.AhU r2 = new X.AhU
                                        r2.<init>(r6, r3)
                                        java.lang.Object r2 = r8.A02(r5, r2, r4)
                                        X.9CY r2 = (X.AnonymousClass9CY) r2
                                        r1.A03 = r2
                                        r1.A00 = r5
                                        java.lang.String[] r2 = new java.lang.String[r0]
                                        r2[r15] = r7
                                        X.9SC r0 = new X.9SC
                                        r0.<init>()
                                        java.util.ArrayList r0 = X.C29601cY.A00(r5, r2)
                                        X.1ca r0 = X.AnonymousClass8BR.A0m(r0, r15)
                                        r1.A05 = r0
                                        return
                                    L_0x010a:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x010f:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x0114:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x0119:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x011e:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x0123:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x0128:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    L_0x012d:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FL.<init>(X.1ca, X.9F6):void");
                                }
                            }
