package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.9Ev  reason: invalid class name and case insensitive filesystem */
public final class C178889Ev extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C183969aC A00;

    public static final void A00(C183969aC r28, C29621ca r29, AnonymousClass9F5 r30) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r5;
        AnonymousClass1UI r52;
        AnonymousClass1UI r53;
        AnonymousClass9F5 r6 = r30;
        C18070vi.A0d(r6, 1);
        C183969aC r7 = r28;
        ArrayList A16 = C108955ca.A16(r7, 2);
        C29621ca r2 = r29;
        try {
            C29621ca A03 = C20121A8g.A03(r2, r6);
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] A1Z = AnonymousClass8BS.A1Z(1, 0);
            Class<Jid> cls = Jid.class;
            String[] strArr = new String[1];
            Long A0Z = AnonymousClass8BW.A0Z("to", strArr, 0);
            Long A0j = AnonymousClass8BU.A0j();
            Object A05 = A0s.A05(A03, cls, A0Z, A0j, (Object) null, strArr, false);
            if (A05 != null) {
                Long l = A0Z;
                Long l2 = A0j;
                if (A0s.A05(r2, cls, l, l2, A05, A1Z, true) != null) {
                    String[] strArr2 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                    Class<String> cls2 = String.class;
                    Object A052 = A0s.A05(A03, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                    if (A052 != null) {
                        C62672rm r20 = A0s;
                        Class<String> cls3 = cls2;
                        C29621ca r21 = r2;
                        if (r20.A05(r21, cls3, l, l2, A052, strArr2, true) != null) {
                            String str = (String) r20.A05(r21, cls3, C17890vO.A0L(), AnonymousClass8BV.A0f(), (Object) null, new String[]{"list", "dhash"}, false);
                            if (A0s.A05(r2, cls2, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                                String[] strArr3 = {"list", "item"};
                                C29621ca r15 = r2;
                                ArrayList A08 = A0s.A08(r15, new C21282AhT(C20019A3l.A00, 31), strArr3, 0, 64000);
                                if (A08 != null) {
                                    new AnonymousClass9S2
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c9: CONSTRUCTOR  (r8v16 ? I:X.9S2) =  call: X.9S2.<init>():void type: CONSTRUCTOR in method: X.9Ev.A00(X.9aC, X.1ca, X.9F5):void, dex: classes5.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v16 ?
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	... 66 more
                                        */
                                    /*
                                        r1 = 0
                                        r0 = 1
                                        r6 = r30
                                        X.C18070vi.A0d(r6, r0)
                                        r4 = 2
                                        r7 = r28
                                        java.util.ArrayList r3 = X.C108955ca.A16(r7, r4)
                                        r2 = r29
                                        java.lang.String r28 = "result"
                                        X.1ca r15 = X.C20121A8g.A03(r2, r6)     // Catch:{ 1UI -> 0x0120 }
                                        X.2rm r14 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r0, r1)     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Class<com.whatsapp.jid.Jid> r16 = com.whatsapp.jid.Jid.class
                                        java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r8 = "to"
                                        java.lang.Long r17 = X.AnonymousClass8BW.A0Z(r8, r5, r1)     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Long r18 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0120 }
                                        r19 = 0
                                        r20 = r5
                                        r21 = r1
                                        java.lang.Object r25 = r14.A05(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1UI -> 0x0120 }
                                        if (r25 == 0) goto L_0x0116
                                        r20 = r14
                                        r22 = r16
                                        r23 = r17
                                        r24 = r18
                                        r27 = r0
                                        r21 = r2
                                        java.lang.Object r5 = r20.A05(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ 1UI -> 0x0120 }
                                        if (r5 == 0) goto L_0x0111
                                        java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r9 = "id"
                                        r5[r1] = r9     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Class<java.lang.String> r16 = java.lang.String.class
                                        java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0120 }
                                        r8[r1] = r9     // Catch:{ 1UI -> 0x0120 }
                                        r20 = r8
                                        r21 = r1
                                        java.lang.Object r25 = r14.A05(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1UI -> 0x0120 }
                                        if (r25 == 0) goto L_0x010c
                                        r20 = r14
                                        r22 = r16
                                        r26 = r5
                                        r21 = r2
                                        java.lang.Object r5 = r20.A05(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ 1UI -> 0x0120 }
                                        if (r5 == 0) goto L_0x0107
                                        java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r12 = "list"
                                        r5[r1] = r12     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r8 = "dhash"
                                        r5[r0] = r8     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Long r23 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Long r24 = X.AnonymousClass8BV.A0f()     // Catch:{ 1UI -> 0x0120 }
                                        r25 = r19
                                        r26 = r5
                                        r27 = r1
                                        java.lang.Object r5 = r20.A05(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r5 = (java.lang.String) r5     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String[] r29 = X.AnonymousClass8BS.A1a(r0, r1)     // Catch:{ 1UI -> 0x0120 }
                                        r23 = r14
                                        r24 = r2
                                        r25 = r16
                                        r26 = r17
                                        r27 = r18
                                        r30 = r1
                                        java.lang.Object r8 = r23.A05(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1UI -> 0x0120 }
                                        if (r8 == 0) goto L_0x011b
                                        X.A3l r11 = X.C20019A3l.A00     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ 1UI -> 0x0120 }
                                        r10[r1] = r12     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r8 = "item"
                                        r10[r0] = r8     // Catch:{ 1UI -> 0x0120 }
                                        r9 = 31
                                        X.AhT r8 = new X.AhT     // Catch:{ 1UI -> 0x0120 }
                                        r8.<init>(r11, r9)     // Catch:{ 1UI -> 0x0120 }
                                        r18 = 0
                                        r20 = 64000(0xfa00, double:3.162E-319)
                                        r16 = r8
                                        r17 = r10
                                        r15 = r2
                                        java.util.ArrayList r13 = r14.A08(r15, r16, r17, r18, r20)     // Catch:{ 1UI -> 0x0120 }
                                        if (r13 == 0) goto L_0x0102
                                        java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0120 }
                                        r9[r1] = r12     // Catch:{ 1UI -> 0x0120 }
                                        X.9S2 r8 = new X.9S2     // Catch:{ 1UI -> 0x0120 }
                                        r8.<init>()     // Catch:{ 1UI -> 0x0120 }
                                        X.AnonymousClass8BS.A1A(r2, r9)     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.String r8 = "GetOptOutListResponseSuccessWithMismatch"
                                        com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ 1UI -> 0x0120 }
                                        X.9k5 r12 = r7.A01     // Catch:{ 1UI -> 0x0120 }
                                        X.BAR r11 = r7.A00     // Catch:{ 1UI -> 0x0120 }
                                        java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x0120 }
                                        java.util.Iterator r9 = r13.iterator()     // Catch:{ 1UI -> 0x0120 }
                                    L_0x00e0:
                                        boolean r8 = r9.hasNext()     // Catch:{ 1UI -> 0x0120 }
                                        if (r8 == 0) goto L_0x00fa
                                        java.lang.Object r8 = r9.next()     // Catch:{ 1UI -> 0x0120 }
                                        X.9DN r8 = (X.AnonymousClass9DN) r8     // Catch:{ 1UI -> 0x0120 }
                                        java.lang.Object r8 = r8.A00     // Catch:{ 1UI -> 0x0120 }
                                        X.9DG r8 = (X.AnonymousClass9DG) r8     // Catch:{ 1UI -> 0x0120 }
                                        X.9NH r8 = r12.A00(r8)     // Catch:{ 1UI -> 0x0120 }
                                        if (r8 == 0) goto L_0x00e0
                                        r10.add(r8)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x00e0
                                    L_0x00fa:
                                        X.1KB r9 = r12.A00     // Catch:{ 1UI -> 0x0120 }
                                        r8 = 36
                                        X.C21459AkQ.A00(r9, r11, r10, r5, r8)     // Catch:{ 1UI -> 0x0120 }
                                        return
                                    L_0x0102:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x011f
                                    L_0x0107:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x011f
                                    L_0x010c:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x011f
                                    L_0x0111:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x011f
                                    L_0x0116:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                        goto L_0x011f
                                    L_0x011b:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0120 }
                                    L_0x011f:
                                        throw r5     // Catch:{ 1UI -> 0x0120 }
                                    L_0x0120:
                                        r9 = move-exception
                                        java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
                                        java.lang.String r5 = "GetOptOutListResponseSuccessWithMismatch: "
                                        X.AnonymousClass8BY.A1I(r5, r8, r9, r3)
                                        java.lang.String r27 = "result"
                                        X.1ca r11 = X.C20121A8g.A03(r2, r6)     // Catch:{ 1UI -> 0x01dc }
                                        X.2rm r10 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.String r9 = "category"
                                        r5[r1] = r9     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.Class<java.lang.String> r12 = java.lang.String.class
                                        java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.Long r13 = X.AnonymousClass8BW.A0Z(r9, r8, r1)     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.Long r14 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x01dc }
                                        r15 = 0
                                        r16 = r8
                                        r17 = r1
                                        java.lang.Object r21 = r10.A05(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 1UI -> 0x01dc }
                                        r16 = r10
                                        r18 = r12
                                        r19 = r13
                                        r20 = r14
                                        r22 = r5
                                        r23 = r0
                                        r17 = r2
                                        r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.String[] r25 = X.AnonymousClass8BS.A1Z(r0, r1)     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.Class<com.whatsapp.jid.Jid> r18 = com.whatsapp.jid.Jid.class
                                        java.lang.String[] r22 = X.AnonymousClass8BS.A1X(r0, r1)     // Catch:{ 1UI -> 0x01dc }
                                        r17 = r11
                                        r21 = r15
                                        r23 = r1
                                        java.lang.Object r24 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x01dc }
                                        if (r24 == 0) goto L_0x01d2
                                        r19 = r10
                                        r20 = r2
                                        r21 = r18
                                        r22 = r13
                                        r23 = r14
                                        r26 = r0
                                        java.lang.Object r5 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x01dc }
                                        if (r5 == 0) goto L_0x01cd
                                        java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.String r9 = "id"
                                        r5[r1] = r9     // Catch:{ 1UI -> 0x01dc }
                                        java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x01dc }
                                        r8[r1] = r9     // Catch:{ 1UI -> 0x01dc }
                                        r16 = r8
                                        r17 = r1
                                        java.lang.Object r15 = r10.A05(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 1UI -> 0x01dc }
                                        if (r15 == 0) goto L_0x01c8
                                        r16 = r5
                                        r17 = r0
                                        r11 = r2
                                        java.lang.Object r5 = r10.A05(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 1UI -> 0x01dc }
                                        if (r5 == 0) goto L_0x01d7
                                        java.lang.String[] r28 = X.AnonymousClass8BS.A1a(r0, r1)     // Catch:{ 1UI -> 0x01dc }
                                        r22 = r10
                                        r23 = r2
                                        r24 = r12
                                        r25 = r13
                                        r26 = r14
                                        r29 = r1
                                        java.lang.Object r5 = r22.A05(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 1UI -> 0x01dc }
                                        if (r5 == 0) goto L_0x01c3
                                        java.lang.String r5 = "GetOptOutListResponseSuccessWithMatch"
                                        com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 1UI -> 0x01dc }
                                        return
                                    L_0x01c3:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01dc }
                                        goto L_0x01db
                                    L_0x01c8:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01dc }
                                        goto L_0x01db
                                    L_0x01cd:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01dc }
                                        goto L_0x01db
                                    L_0x01d2:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01dc }
                                        goto L_0x01db
                                    L_0x01d7:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x01dc }
                                    L_0x01db:
                                        throw r5     // Catch:{ 1UI -> 0x01dc }
                                    L_0x01dc:
                                        r9 = move-exception
                                        java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
                                        java.lang.String r5 = "GetOptOutListResponseSuccessWithMatch: "
                                        X.AnonymousClass8BY.A1I(r5, r8, r9, r3)
                                        X.1ca r8 = X.C20121A8g.A03(r2, r6)     // Catch:{ 1UI -> 0x022f }
                                        X.2rm r10 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x022f }
                                        X.A3l r11 = X.C20019A3l.A00     // Catch:{ 1UI -> 0x022f }
                                        r5 = 15
                                        X.Ahb r5 = X.C21290Ahb.A00(r8, r11, r5)     // Catch:{ 1UI -> 0x022f }
                                        java.lang.Object r5 = r5.BCF(r2, r10)     // Catch:{ 1UI -> 0x022f }
                                        if (r5 == 0) goto L_0x022a
                                        X.B9c[] r9 = new X.C22470B9c[r4]     // Catch:{ 1UI -> 0x022f }
                                        r5 = 29
                                        X.C21282AhT.A00(r9, r5, r1, r11)     // Catch:{ 1UI -> 0x022f }
                                        r8 = 30
                                        X.AhT r5 = new X.AhT     // Catch:{ 1UI -> 0x022f }
                                        r5.<init>(r11, r8)     // Catch:{ 1UI -> 0x022f }
                                        java.util.List r9 = X.C18070vi.A0O(r5, r9, r0)     // Catch:{ 1UI -> 0x022f }
                                        java.lang.String[] r8 = X.AnonymousClass8BS.A1b(r0, r1)     // Catch:{ 1UI -> 0x022f }
                                        java.lang.String r5 = "IQErrorBadRequest|IQErrorRateOverlimit"
                                        java.lang.Object r5 = r10.A06(r2, r5, r9, r8)     // Catch:{ 1UI -> 0x022f }
                                        if (r5 == 0) goto L_0x0225
                                        java.lang.String r8 = "GetOptOutListResponseInvalidRequest"
                                        com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ 1UI -> 0x022f }
                                        X.BAR r5 = r7.A00     // Catch:{ 1UI -> 0x022f }
                                        r5.BcF(r8)     // Catch:{ 1UI -> 0x022f }
                                        return
                                    L_0x0225:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x022f }
                                        goto L_0x022e
                                    L_0x022a:
                                        X.1UI r5 = X.AnonymousClass1O9.A00(r10)     // Catch:{ 1UI -> 0x022f }
                                    L_0x022e:
                                        throw r5     // Catch:{ 1UI -> 0x022f }
                                    L_0x022f:
                                        r9 = move-exception
                                        java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
                                        java.lang.String r5 = "GetOptOutListResponseInvalidRequest: "
                                        X.AnonymousClass8BY.A1I(r5, r8, r9, r3)
                                        X.1ca r6 = X.C20121A8g.A03(r2, r6)     // Catch:{ 1UI -> 0x0282 }
                                        X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0282 }
                                        X.A3l r9 = X.C20019A3l.A00     // Catch:{ 1UI -> 0x0282 }
                                        r5 = 14
                                        X.Ahb r5 = X.C21290Ahb.A00(r6, r9, r5)     // Catch:{ 1UI -> 0x0282 }
                                        java.lang.Object r5 = r5.BCF(r2, r8)     // Catch:{ 1UI -> 0x0282 }
                                        if (r5 == 0) goto L_0x027d
                                        X.B9c[] r6 = new X.C22470B9c[r4]     // Catch:{ 1UI -> 0x0282 }
                                        r4 = 27
                                        X.C21282AhT.A00(r6, r4, r1, r9)     // Catch:{ 1UI -> 0x0282 }
                                        r5 = 28
                                        X.AhT r4 = new X.AhT     // Catch:{ 1UI -> 0x0282 }
                                        r4.<init>(r9, r5)     // Catch:{ 1UI -> 0x0282 }
                                        java.util.List r4 = X.C18070vi.A0O(r4, r6, r0)     // Catch:{ 1UI -> 0x0282 }
                                        java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r0, r1)     // Catch:{ 1UI -> 0x0282 }
                                        java.lang.String r0 = "IQErrorFeatureNotImplemented|IQErrorInternalServerError"
                                        java.lang.Object r0 = r8.A06(r2, r0, r4, r1)     // Catch:{ 1UI -> 0x0282 }
                                        if (r0 == 0) goto L_0x0278
                                        java.lang.String r1 = "GetOptOutListResponseInternalServerError"
                                        com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1UI -> 0x0282 }
                                        X.BAR r0 = r7.A00     // Catch:{ 1UI -> 0x0282 }
                                        r0.BcF(r1)     // Catch:{ 1UI -> 0x0282 }
                                        return
                                    L_0x0278:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0282 }
                                        goto L_0x0281
                                    L_0x027d:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0282 }
                                    L_0x0281:
                                        throw r0     // Catch:{ 1UI -> 0x0282 }
                                    L_0x0282:
                                        r2 = move-exception
                                        java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                                        java.lang.String r0 = "GetOptOutListResponseInternalServerError: "
                                        X.AnonymousClass8BY.A1I(r0, r1, r2, r3)
                                        java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
                                        java.lang.String r0 = "Could not parse stanza into valid response class. Encountered the following errors for each possible response:\n"
                                        r4.append(r0)
                                        java.lang.String r2 = "\n"
                                        r1 = 0
                                        java.lang.String r0 = ""
                                        java.lang.String r0 = X.C29431cG.A0g(r2, r0, r0, r3, r1)
                                        java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
                                        X.1UI r0 = X.AnonymousClass1UI.A01(r0)
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C178889Ev.A00(X.9aC, X.1ca, X.9F5):void");
                                }

                                public void BrD(String str) {
                                    C18070vi.A0d(str, 0);
                                }

                                public C22384B5n CM9(String str) {
                                    C18070vi.A0d(str, 0);
                                    return C20958AcC.A00;
                                }

                                public C178889Ev(C183969aC r1, AnonymousClass9F5 r2) {
                                    this.A00 = r2;
                                    this.A00 = r1;
                                }

                                public void Bt9(C29621ca r3, String str) {
                                    A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
                                }

                                public void C7Z(C29621ca r3, String str) {
                                    A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
                                }
                            }
