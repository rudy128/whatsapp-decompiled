package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.8zP  reason: invalid class name and case insensitive filesystem */
public class C175868zP extends C175498yo {
    public C186879eu A00;
    public AnonymousClass9F7 A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("GetContactsPaymentStatusIndiaUpiNetworkCallback", "network", "IN");

    public C175868zP(Context context, AnonymousClass1KB r11, C186879eu r12, C33711jG r13, AnonymousClass9F7 r14) {
        super(context, r11, r13, (C196259ui) null, "get-contacts-payment-status");
        this.A01 = r14;
        this.A00 = r12;
    }

    public void A06(C29621ca r34) {
        AnonymousClass1UI r0;
        String A1G;
        try {
            AnonymousClass9F7 r4 = this.A01;
            C29621ca r3 = r34;
            int A0G = C72453Mb.A0G(r3, r4, 1);
            C173438v4 r27 = C173438v4.A00;
            C108945cZ.A1N(r3);
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
            Class<String> cls = String.class;
            String[] strArr2 = new String[1];
            Long A0Z = AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_ID, strArr2, 0);
            Long A0j = AnonymousClass8BU.A0j();
            Object A05 = A0s.A05((C29621ca) r4.A00, cls, A0Z, A0j, (Object) null, strArr2, false);
            if (A05 != null) {
                if (A0s.A05(r3, cls, A0Z, A0j, A05, strArr, true) != null) {
                    if (A0s.A05(r3, cls, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                        if (A0s.A05(r3, C173438v4.class, A0Z, A0j, r27, AnonymousClass8BS.A1Z(1, 0), false) != null) {
                            String[] strArr3 = new String[A0G];
                            strArr3[0] = "account";
                            strArr3[1] = "action";
                            if (A0s.A05(r3, cls, A0Z, A0j, "get-contacts-payment-status", strArr3, false) != null) {
                                C20072A5y a5y = C20072A5y.A00;
                                String[] strArr4 = new String[A0G];
                                strArr4[0] = "account";
                                strArr4[1] = "contact";
                                ArrayList A0k = AnonymousClass8BX.A0k(r3, A0s, new C21285AhW(a5y, 7), strArr4);
                                if (A0k != null) {
                                    new AnonymousClass9SJ
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b0: CONSTRUCTOR  (r0v11 ? I:X.9SJ) =  call: X.9SJ.<init>():void type: CONSTRUCTOR in method: X.8zP.A06(X.1ca):void, dex: classes5.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v11 ?
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	... 66 more
                                        */
                                    /*
                                        this = this;
                                        r1 = r33
                                        X.9F7 r4 = r1.A01     // Catch:{ 1UI -> 0x0131 }
                                        r0 = 1
                                        r3 = r34
                                        int r2 = X.C72453Mb.A0G(r3, r4, r0)     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r24 = "result"
                                        X.8v4 r27 = X.C173438v4.A00     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r30 = "get-contacts-payment-status"
                                        X.C108945cZ.A1N(r3)     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Object r9 = r4.A00     // Catch:{ 1UI -> 0x0131 }
                                        X.1ca r9 = (X.C29621ca) r9     // Catch:{ 1UI -> 0x0131 }
                                        X.2rm r8 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0131 }
                                        r15 = 0
                                        java.lang.String r5 = "id"
                                        r4[r15] = r5     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Class<java.lang.String> r10 = java.lang.String.class
                                        java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Long r11 = X.AnonymousClass8BW.A0Z(r5, r14, r15)     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Long r12 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0131 }
                                        r13 = 0
                                        java.lang.Object r21 = r8.A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1UI -> 0x0131 }
                                        if (r21 == 0) goto L_0x0127
                                        r16 = r8
                                        r18 = r10
                                        r19 = r11
                                        r20 = r12
                                        r22 = r4
                                        r23 = r0
                                        r17 = r3
                                        java.lang.Object r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x0131 }
                                        if (r4 == 0) goto L_0x0122
                                        java.lang.String[] r25 = X.AnonymousClass8BS.A1a(r0, r15)     // Catch:{ 1UI -> 0x0131 }
                                        r19 = r8
                                        r20 = r3
                                        r21 = r10
                                        r22 = r11
                                        r23 = r12
                                        r26 = r15
                                        java.lang.Object r4 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x0131 }
                                        if (r4 == 0) goto L_0x011d
                                        java.lang.String[] r28 = X.AnonymousClass8BS.A1Z(r0, r15)     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Class<X.8v4> r24 = X.C173438v4.class
                                        r22 = r8
                                        r23 = r3
                                        r25 = r11
                                        r26 = r12
                                        r29 = r15
                                        java.lang.Object r4 = r22.A05(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 1UI -> 0x0131 }
                                        if (r4 == 0) goto L_0x0118
                                        java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r7 = "account"
                                        r5[r15] = r7     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r4 = "action"
                                        r5[r0] = r4     // Catch:{ 1UI -> 0x0131 }
                                        r25 = r8
                                        r26 = r3
                                        r27 = r10
                                        r28 = r11
                                        r29 = r12
                                        r31 = r5
                                        r32 = r15
                                        java.lang.Object r4 = r25.A05(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ 1UI -> 0x0131 }
                                        if (r4 == 0) goto L_0x0113
                                        X.A5y r6 = X.C20072A5y.A00     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0131 }
                                        r5[r15] = r7     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r2 = "contact"
                                        r5[r0] = r2     // Catch:{ 1UI -> 0x0131 }
                                        r4 = 7
                                        X.AhW r2 = new X.AhW     // Catch:{ 1UI -> 0x0131 }
                                        r2.<init>(r6, r4)     // Catch:{ 1UI -> 0x0131 }
                                        java.util.ArrayList r4 = X.AnonymousClass8BX.A0k(r3, r8, r2, r5)     // Catch:{ 1UI -> 0x0131 }
                                        if (r4 == 0) goto L_0x012c
                                        java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0131 }
                                        r2[r15] = r7     // Catch:{ 1UI -> 0x0131 }
                                        X.9SJ r0 = new X.9SJ     // Catch:{ 1UI -> 0x0131 }
                                        r0.<init>()     // Catch:{ 1UI -> 0x0131 }
                                        X.AnonymousClass8BS.A1A(r3, r2)     // Catch:{ 1UI -> 0x0131 }
                                        java.util.HashMap r7 = X.C17880vN.A11()     // Catch:{ 1UI -> 0x0131 }
                                        java.util.Iterator r4 = r4.iterator()     // Catch:{ 1UI -> 0x0131 }
                                    L_0x00be:
                                        boolean r0 = r4.hasNext()     // Catch:{ 1UI -> 0x0131 }
                                        if (r0 == 0) goto L_0x00d8
                                        java.lang.Object r3 = r4.next()     // Catch:{ 1UI -> 0x0131 }
                                        X.9DH r3 = (X.AnonymousClass9DH) r3     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.Object r0 = r3.A01     // Catch:{ 1UI -> 0x0131 }
                                        com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r2 = r0.getRawString()     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r0 = r3.A02     // Catch:{ 1UI -> 0x0131 }
                                        r7.put(r2, r0)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x00be
                                    L_0x00d8:
                                        X.9eu r6 = r1.A00     // Catch:{ 1UI -> 0x0131 }
                                        java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x0131 }
                                        java.util.List r0 = r6.A03     // Catch:{ 1UI -> 0x0131 }
                                        java.util.Iterator r4 = r0.iterator()     // Catch:{ 1UI -> 0x0131 }
                                    L_0x00e4:
                                        boolean r0 = r4.hasNext()     // Catch:{ 1UI -> 0x0131 }
                                        if (r0 == 0) goto L_0x010d
                                        X.1E7 r3 = X.C17880vN.A0O(r4)     // Catch:{ 1UI -> 0x0131 }
                                        com.whatsapp.jid.Jid r0 = X.AnonymousClass1E7.A01(r3)     // Catch:{ 1UI -> 0x0131 }
                                        if (r0 == 0) goto L_0x00e4
                                        java.lang.String r0 = r0.getRawString()     // Catch:{ 1UI -> 0x0131 }
                                        java.lang.String r0 = X.C108945cZ.A1G(r0, r7)     // Catch:{ 1UI -> 0x0131 }
                                        if (r0 == 0) goto L_0x00e4
                                        java.lang.String r0 = X.AnonymousClass8BS.A0n(r0)     // Catch:{ 1UI -> 0x0131 }
                                        int r2 = X.AnonymousClass9QL.A00(r0)     // Catch:{ 1UI -> 0x0131 }
                                        r0 = 2
                                        if (r0 != r2) goto L_0x00e4
                                        r5.add(r3)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x00e4
                                    L_0x010d:
                                        X.1TI r0 = r6.A00     // Catch:{ 1UI -> 0x0131 }
                                        r0.accept(r5)     // Catch:{ 1UI -> 0x0131 }
                                        return
                                    L_0x0113:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x0130
                                    L_0x0118:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x0130
                                    L_0x011d:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x0130
                                    L_0x0122:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x0130
                                    L_0x0127:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                        goto L_0x0130
                                    L_0x012c:
                                        X.1UI r0 = X.AnonymousClass1O9.A00(r8)     // Catch:{ 1UI -> 0x0131 }
                                    L_0x0130:
                                        throw r0     // Catch:{ 1UI -> 0x0131 }
                                    L_0x0131:
                                        X.1QE r2 = r1.A02
                                        java.lang.String r0 = "sendGetContactsPaymentStatus/onResponseSuccess/CorruptStreamException"
                                        r2.A05(r0)
                                        X.9eu r2 = r1.A00
                                        r0 = 500(0x1f4, float:7.0E-43)
                                        X.A7B r1 = new X.A7B
                                        r1.<init>((int) r0)
                                        X.1TI r0 = r2.A02
                                        r0.accept(r1)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C175868zP.A06(X.1ca):void");
                                }

                                public void A04(A7B a7b) {
                                    super.A04(a7b);
                                    this.A00.A01.accept(a7b);
                                }

                                public void A05(A7B a7b) {
                                    super.A05(a7b);
                                    this.A00.A02.accept(a7b);
                                }
                            }
