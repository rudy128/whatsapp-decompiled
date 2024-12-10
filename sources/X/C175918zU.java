package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8zU  reason: invalid class name and case insensitive filesystem */
public class C175918zU extends C175498yo {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175918zU(Context context, Context context2, AnonymousClass1KB r12, UserJid userJid, C33711jG r14, C196259ui r15, BCC bcc, C195859u1 r17, AZ6 az6, AnonymousClass9F5 r19, Integer num, int i) {
        super(context, r12, r14, r15, az6, "upi-get-vpa", 8);
        this.A00 = i;
        this.A01 = r17;
        this.A04 = r19;
        this.A05 = num;
        this.A03 = context2;
        this.A06 = userJid;
        this.A02 = bcc;
    }

    public void A06(C29621ca r35) {
        AnonymousClass1UI r1;
        Object obj;
        AnonymousClass8pF r12;
        C29621ca r13 = r35;
        if (this.A00 != 0) {
            super.A06(r13);
            try {
                C20121A8g a8g = (C20121A8g) this.A04;
                int A0G = C72453Mb.A0G(r13, a8g, 1);
                C29621ca A032 = C20121A8g.A03(r13, a8g);
                C62672rm A0s = AnonymousClass8BR.A0s();
                List A0N = C18070vi.A0N("0", "1", new String[A0G], 0, 1);
                String[] strArr = new String[A0G];
                strArr[0] = "account";
                strArr[1] = "nodal";
                String A07 = A0s.A07(r13, A0N, strArr);
                if (A07 != null) {
                    List A0o = AnonymousClass8BX.A0o("0", "1", A0G, 1);
                    String[] strArr2 = new String[A0G];
                    strArr2[0] = "account";
                    strArr2[1] = "nodal-allowed";
                    String A072 = A0s.A07(r13, A0o, strArr2);
                    if (A072 != null) {
                        List A0o2 = AnonymousClass8BX.A0o("0", "1", A0G, 1);
                        String[] strArr3 = new String[A0G];
                        strArr3[0] = "account";
                        strArr3[1] = "notif-allowed";
                        String A073 = A0s.A07(r13, A0o2, strArr3);
                        if (A073 != null) {
                            String[] strArr4 = new String[A0G];
                            strArr4[0] = "account";
                            strArr4[1] = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                            Long A0i = AnonymousClass8BU.A0i();
                            Long A0j = AnonymousClass8BU.A0j();
                            C62672rm r21 = A0s;
                            C29621ca r22 = r13;
                            UserJid userJid = (UserJid) r21.A05(r22, UserJid.class, A0i, A0j, (Object) null, strArr4, false);
                            if (userJid != null) {
                                String[] strArr5 = new String[A0G];
                                strArr5[0] = "account";
                                strArr5[1] = "vpa";
                                Class<String> cls = String.class;
                                Long A0X = C108975cc.A0X();
                                C62672rm r26 = A0s;
                                C29621ca r27 = r13;
                                Object A052 = r26.A05(r27, cls, A0X, AnonymousClass8BV.A0g(), (Object) null, strArr5, false);
                                if (A052 != null) {
                                    String[] strArr6 = new String[A0G];
                                    strArr6[0] = "account";
                                    strArr6[1] = "vpa-id";
                                    String str = (String) r26.A05(r27, cls, A0X, AnonymousClass8BV.A0f(), (Object) null, strArr6, false);
                                    if (str != null) {
                                        String[] strArr7 = new String[A0G];
                                        strArr7[0] = "account";
                                        strArr7[1] = "user-name";
                                        Object A053 = r26.A05(r27, cls, A0X, AnonymousClass8BV.A0j(), (Object) null, strArr7, false);
                                        String[] strArr8 = new String[A0G];
                                        strArr8[0] = "account";
                                        strArr8[1] = "action";
                                        if (r26.A05(r27, cls, A0i, A0j, "upi-get-vpa", strArr8, false) != null) {
                                            String[] strArr9 = new String[A0G];
                                            strArr9[0] = "account";
                                            strArr9[1] = "version";
                                            if (r21.A05(r22, cls, A0i, A0j, "1", strArr9, false) != null) {
                                                if (C21289Aha.A00(A032, C20072A5y.A00, 30).BCF(r13, A0s) != null) {
                                                    new AnonymousClass9SK
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0110: CONSTRUCTOR  (r3v47 ? I:X.9SK) =  call: X.9SK.<init>():void type: CONSTRUCTOR in method: X.8zU.A06(X.1ca):void, dex: classes5.dex
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
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v47 ?
                                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                                        	... 84 more
                                                        */
                                                    /*
                                                        this = this;
                                                        r0 = r34
                                                        int r3 = r0.A00
                                                        java.lang.String r2 = "1"
                                                        r1 = r35
                                                        if (r3 == 0) goto L_0x01c0
                                                        super.A06(r1)
                                                        java.lang.Object r3 = r0.A04     // Catch:{ 1UI -> 0x037e }
                                                        X.A8g r3 = (X.C20121A8g) r3     // Catch:{ 1UI -> 0x037e }
                                                        r7 = 1
                                                        int r6 = X.C72453Mb.A0G(r1, r3, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r20 = "upi-get-vpa"
                                                        X.1ca r19 = X.C20121A8g.A03(r1, r3)     // Catch:{ 1UI -> 0x037e }
                                                        X.2rm r5 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r4 = 0
                                                        java.lang.String r10 = "0"
                                                        java.util.List r9 = X.C18070vi.A0N(r10, r2, r3, r4, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r18 = "account"
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "nodal"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r14 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r14 == 0) goto L_0x01ba
                                                        java.util.List r9 = X.AnonymousClass8BX.A0o(r10, r2, r6, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "nodal-allowed"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r13 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r13 == 0) goto L_0x01b4
                                                        java.util.List r9 = X.AnonymousClass8BX.A0o(r10, r2, r6, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "notif-allowed"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r12 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r12 == 0) goto L_0x01ae
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "user"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Class<com.whatsapp.jid.UserJid> r23 = com.whatsapp.jid.UserJid.class
                                                        java.lang.Long r24 = X.AnonymousClass8BU.A0i()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r25 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x037e }
                                                        r11 = 0
                                                        r26 = r11
                                                        r27 = r8
                                                        r28 = r4
                                                        r21 = r5
                                                        r22 = r1
                                                        java.lang.Object r8 = r21.A05(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x037e }
                                                        com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ 1UI -> 0x037e }
                                                        if (r8 == 0) goto L_0x01a8
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r9 = "vpa"
                                                        r3[r7] = r9     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Class<java.lang.String> r28 = java.lang.String.class
                                                        java.lang.Long r29 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0g()     // Catch:{ 1UI -> 0x037e }
                                                        r17 = 0
                                                        r26 = r5
                                                        r27 = r1
                                                        r31 = r11
                                                        r32 = r3
                                                        r33 = r4
                                                        java.lang.Object r9 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        if (r9 == 0) goto L_0x01a2
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r10 = "vpa-id"
                                                        r3[r7] = r10     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0f()     // Catch:{ 1UI -> 0x037e }
                                                        r32 = r3
                                                        java.lang.Object r10 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r10 = (java.lang.String) r10     // Catch:{ 1UI -> 0x037e }
                                                        if (r10 == 0) goto L_0x019c
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r15 = "user-name"
                                                        r3[r7] = r15     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0j()     // Catch:{ 1UI -> 0x037e }
                                                        r32 = r3
                                                        java.lang.Object r16 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r15 = "action"
                                                        r3[r7] = r15     // Catch:{ 1UI -> 0x037e }
                                                        r29 = r24
                                                        r30 = r25
                                                        r31 = r20
                                                        r32 = r3
                                                        java.lang.Object r3 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x0196
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r6 = "version"
                                                        r3[r7] = r6     // Catch:{ 1UI -> 0x037e }
                                                        r23 = r28
                                                        r26 = r2
                                                        r27 = r3
                                                        r28 = r4
                                                        java.lang.Object r3 = r21.A05(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x0379
                                                        X.A5y r15 = X.C20072A5y.A00     // Catch:{ 1UI -> 0x037e }
                                                        r6 = 30
                                                        r3 = r19
                                                        X.Aha r3 = X.C21289Aha.A00(r3, r15, r6)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r3.BCF(r1, r5)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x0190
                                                        java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x037e }
                                                        r5[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        X.9SK r3 = new X.9SK     // Catch:{ 1UI -> 0x037e }
                                                        r3.<init>()     // Catch:{ 1UI -> 0x037e }
                                                        X.AnonymousClass8BS.A1A(r1, r5)     // Catch:{ 1UI -> 0x037e }
                                                        X.8pF r1 = new X.8pF     // Catch:{ 1UI -> 0x037e }
                                                        r1.<init>()     // Catch:{ 1UI -> 0x037e }
                                                        r1.A03 = r8     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "upiHandle"
                                                        X.77e r3 = X.AnonymousClass8BW.A0K(r9, r3)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A01 = r3     // Catch:{ 1UI -> 0x037e }
                                                        r1.A02 = r10     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r4 = "accountHolderName"
                                                        r3 = r16
                                                        X.77e r3 = X.AnonymousClass8BW.A0K(r3, r4)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A00 = r3     // Catch:{ 1UI -> 0x037e }
                                                        boolean r4 = r14.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A03 = r4     // Catch:{ 1UI -> 0x037e }
                                                        boolean r3 = r13.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A04 = r3     // Catch:{ 1UI -> 0x037e }
                                                        boolean r2 = r12.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A05 = r2     // Catch:{ 1UI -> 0x037e }
                                                        if (r4 == 0) goto L_0x0149
                                                        r1.A01 = r11     // Catch:{ 1UI -> 0x037e }
                                                        r1.A02 = r11     // Catch:{ 1UI -> 0x037e }
                                                    L_0x0149:
                                                        java.lang.Object r5 = r0.A01     // Catch:{ 1UI -> 0x037e }
                                                        X.9u1 r5 = (X.C195859u1) r5     // Catch:{ 1UI -> 0x037e }
                                                        X.1QS r2 = r5.A06     // Catch:{ 1UI -> 0x037e }
                                                        X.A5I r6 = r2.A01()     // Catch:{ 1UI -> 0x037e }
                                                        X.1Ln r2 = r5.A02     // Catch:{ 1UI -> 0x037e }
                                                        X.10I r4 = r6.A03     // Catch:{ 1UI -> 0x037e }
                                                        X.8p2 r3 = new X.8p2     // Catch:{ 1UI -> 0x037e }
                                                        r3.<init>(r6, r2, r1)     // Catch:{ 1UI -> 0x037e }
                                                        r2 = r17
                                                        X.AnonymousClass3MW.A1T(r3, r4, r2)     // Catch:{ 1UI -> 0x037e }
                                                        X.90Z r4 = r5.A08     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r0.A05     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ 1UI -> 0x037e }
                                                        r2 = r20
                                                        r4.A04(r3, r2)     // Catch:{ 1UI -> 0x037e }
                                                        X.0ve r4 = r5.A03     // Catch:{ 1UI -> 0x037e }
                                                        r3 = 3619(0xe23, float:5.071E-42)
                                                        X.0vf r2 = X.C18040vf.A02     // Catch:{ 1UI -> 0x037e }
                                                        boolean r2 = X.C18020vd.A05(r2, r4, r3)     // Catch:{ 1UI -> 0x037e }
                                                        if (r2 == 0) goto L_0x018c
                                                        boolean r2 = r1.A03     // Catch:{ 1UI -> 0x037e }
                                                        if (r2 == 0) goto L_0x018c
                                                        java.lang.Object r4 = r0.A03     // Catch:{ 1UI -> 0x037e }
                                                        android.content.Context r4 = (android.content.Context) r4     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r0.A06     // Catch:{ 1UI -> 0x037e }
                                                        com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x037e }
                                                        X.BCC r2 = (X.BCC) r2     // Catch:{ 1UI -> 0x037e }
                                                        r5.A00(r4, r3, r1, r2)     // Catch:{ 1UI -> 0x037e }
                                                        return
                                                    L_0x018c:
                                                        java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x0344
                                                    L_0x0190:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0196:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x019c:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01a2:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01a8:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01ae:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01b4:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01ba:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x01c0:
                                                        super.A06(r1)
                                                        java.lang.Object r3 = r0.A04     // Catch:{ 1UI -> 0x037e }
                                                        X.A8g r3 = (X.C20121A8g) r3     // Catch:{ 1UI -> 0x037e }
                                                        r7 = 1
                                                        int r6 = X.C72453Mb.A0G(r1, r3, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r20 = "upi-get-vpa"
                                                        X.1ca r19 = X.C20121A8g.A03(r1, r3)     // Catch:{ 1UI -> 0x037e }
                                                        X.2rm r5 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r4 = 0
                                                        java.lang.String r10 = "0"
                                                        java.util.List r9 = X.C18070vi.A0N(r10, r2, r3, r4, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r18 = "account"
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "nodal"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r14 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r14 == 0) goto L_0x0374
                                                        java.util.List r9 = X.AnonymousClass8BX.A0o(r10, r2, r6, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "nodal-allowed"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r13 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r13 == 0) goto L_0x036f
                                                        java.util.List r9 = X.AnonymousClass8BX.A0o(r10, r2, r6, r7)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "notif-allowed"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r12 = r5.A07(r1, r9, r8)     // Catch:{ 1UI -> 0x037e }
                                                        if (r12 == 0) goto L_0x036a
                                                        java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r8[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "user"
                                                        r8[r7] = r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Class<com.whatsapp.jid.UserJid> r23 = com.whatsapp.jid.UserJid.class
                                                        java.lang.Long r24 = X.AnonymousClass8BU.A0i()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r25 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x037e }
                                                        r11 = 0
                                                        r26 = r11
                                                        r27 = r8
                                                        r28 = r4
                                                        r21 = r5
                                                        r22 = r1
                                                        java.lang.Object r8 = r21.A05(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x037e }
                                                        com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ 1UI -> 0x037e }
                                                        if (r8 == 0) goto L_0x0365
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r9 = "vpa"
                                                        r3[r7] = r9     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Class<java.lang.String> r28 = java.lang.String.class
                                                        java.lang.Long r29 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0g()     // Catch:{ 1UI -> 0x037e }
                                                        r17 = 0
                                                        r26 = r5
                                                        r27 = r1
                                                        r31 = r11
                                                        r32 = r3
                                                        r33 = r4
                                                        java.lang.Object r9 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        if (r9 == 0) goto L_0x0360
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r10 = "vpa-id"
                                                        r3[r7] = r10     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0f()     // Catch:{ 1UI -> 0x037e }
                                                        r32 = r3
                                                        java.lang.Object r10 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r10 = (java.lang.String) r10     // Catch:{ 1UI -> 0x037e }
                                                        if (r10 == 0) goto L_0x035b
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r15 = "user-name"
                                                        r3[r7] = r15     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Long r30 = X.AnonymousClass8BV.A0j()     // Catch:{ 1UI -> 0x037e }
                                                        r32 = r3
                                                        java.lang.Object r16 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r15 = "action"
                                                        r3[r7] = r15     // Catch:{ 1UI -> 0x037e }
                                                        r29 = r24
                                                        r30 = r25
                                                        r31 = r20
                                                        r32 = r3
                                                        java.lang.Object r3 = r26.A05(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x0356
                                                        java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ 1UI -> 0x037e }
                                                        r3[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r6 = "version"
                                                        r3[r7] = r6     // Catch:{ 1UI -> 0x037e }
                                                        r23 = r28
                                                        r26 = r2
                                                        r27 = r3
                                                        r28 = r4
                                                        java.lang.Object r3 = r21.A05(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x0351
                                                        X.A5y r15 = X.C20072A5y.A00     // Catch:{ 1UI -> 0x037e }
                                                        r6 = 30
                                                        r3 = r19
                                                        X.Aha r3 = X.C21289Aha.A00(r3, r15, r6)     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r3.BCF(r1, r5)     // Catch:{ 1UI -> 0x037e }
                                                        if (r3 == 0) goto L_0x034c
                                                        java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x037e }
                                                        r5[r4] = r18     // Catch:{ 1UI -> 0x037e }
                                                        X.9SK r3 = new X.9SK     // Catch:{ 1UI -> 0x037e }
                                                        r3.<init>()     // Catch:{ 1UI -> 0x037e }
                                                        X.AnonymousClass8BS.A1A(r1, r5)     // Catch:{ 1UI -> 0x037e }
                                                        X.8pF r1 = new X.8pF     // Catch:{ 1UI -> 0x037e }
                                                        r1.<init>()     // Catch:{ 1UI -> 0x037e }
                                                        r1.A03 = r8     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r3 = "upiHandle"
                                                        X.77e r3 = X.AnonymousClass8BW.A0K(r9, r3)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A01 = r3     // Catch:{ 1UI -> 0x037e }
                                                        r1.A02 = r10     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.String r4 = "accountHolderName"
                                                        r3 = r16
                                                        X.77e r3 = X.AnonymousClass8BW.A0K(r3, r4)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A00 = r3     // Catch:{ 1UI -> 0x037e }
                                                        boolean r4 = r14.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A03 = r4     // Catch:{ 1UI -> 0x037e }
                                                        boolean r3 = r13.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A04 = r3     // Catch:{ 1UI -> 0x037e }
                                                        boolean r2 = r12.equals(r2)     // Catch:{ 1UI -> 0x037e }
                                                        r1.A05 = r2     // Catch:{ 1UI -> 0x037e }
                                                        if (r4 == 0) goto L_0x02ff
                                                        r1.A01 = r11     // Catch:{ 1UI -> 0x037e }
                                                        r1.A02 = r11     // Catch:{ 1UI -> 0x037e }
                                                    L_0x02ff:
                                                        java.lang.Object r5 = r0.A01     // Catch:{ 1UI -> 0x037e }
                                                        X.9u1 r5 = (X.C195859u1) r5     // Catch:{ 1UI -> 0x037e }
                                                        X.1QS r2 = r5.A06     // Catch:{ 1UI -> 0x037e }
                                                        X.A5I r6 = r2.A01()     // Catch:{ 1UI -> 0x037e }
                                                        X.1Ln r2 = r5.A02     // Catch:{ 1UI -> 0x037e }
                                                        X.10I r4 = r6.A03     // Catch:{ 1UI -> 0x037e }
                                                        X.8p2 r3 = new X.8p2     // Catch:{ 1UI -> 0x037e }
                                                        r3.<init>(r6, r2, r1)     // Catch:{ 1UI -> 0x037e }
                                                        r2 = r17
                                                        X.AnonymousClass3MW.A1T(r3, r4, r2)     // Catch:{ 1UI -> 0x037e }
                                                        X.90Z r4 = r5.A08     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r0.A05     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ 1UI -> 0x037e }
                                                        r2 = r20
                                                        r4.A04(r3, r2)     // Catch:{ 1UI -> 0x037e }
                                                        X.0ve r4 = r5.A03     // Catch:{ 1UI -> 0x037e }
                                                        r3 = 3619(0xe23, float:5.071E-42)
                                                        X.0vf r2 = X.C18040vf.A02     // Catch:{ 1UI -> 0x037e }
                                                        boolean r2 = X.C18020vd.A05(r2, r4, r3)     // Catch:{ 1UI -> 0x037e }
                                                        if (r2 == 0) goto L_0x0342
                                                        boolean r2 = r1.A03     // Catch:{ 1UI -> 0x037e }
                                                        if (r2 == 0) goto L_0x0342
                                                        java.lang.Object r4 = r0.A03     // Catch:{ 1UI -> 0x037e }
                                                        android.content.Context r4 = (android.content.Context) r4     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r3 = r0.A06     // Catch:{ 1UI -> 0x037e }
                                                        com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ 1UI -> 0x037e }
                                                        java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x037e }
                                                        X.BCC r2 = (X.BCC) r2     // Catch:{ 1UI -> 0x037e }
                                                        r5.A00(r4, r3, r1, r2)     // Catch:{ 1UI -> 0x037e }
                                                        return
                                                    L_0x0342:
                                                        java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x037e }
                                                    L_0x0344:
                                                        X.BCC r2 = (X.BCC) r2
                                                        if (r2 == 0) goto L_0x038a
                                                        r2.Bpz(r1)     // Catch:{ 1UI -> 0x037e }
                                                        return
                                                    L_0x034c:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0351:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0356:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x035b:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0360:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0365:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x036a:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x036f:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0374:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                        goto L_0x037d
                                                    L_0x0379:
                                                        X.1UI r1 = X.AnonymousClass1O9.A00(r5)     // Catch:{ 1UI -> 0x037e }
                                                    L_0x037d:
                                                        throw r1     // Catch:{ 1UI -> 0x037e }
                                                    L_0x037e:
                                                        java.lang.String r1 = "PAY: IndiaUpiContactActions : invalid node"
                                                        com.whatsapp.util.Log.w((java.lang.String) r1)
                                                        X.A7B r1 = X.A7B.A00()
                                                        r0.A07(r1)
                                                    L_0x038a:
                                                        return
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.C175918zU.A06(X.1ca):void");
                                                }

                                                public void A07(A7B a7b) {
                                                    ((C195859u1) this.A01).A08.A02.A01(a7b, (Integer) this.A05, "upi-get-vpa");
                                                    BCC bcc = (BCC) this.A02;
                                                    if (bcc != null) {
                                                        bcc.Bss(a7b);
                                                    }
                                                }

                                                public void A04(A7B a7b) {
                                                    super.A04(a7b);
                                                    A07(a7b);
                                                }

                                                public void A05(A7B a7b) {
                                                    super.A05(a7b);
                                                    A07(a7b);
                                                }
                                            }
