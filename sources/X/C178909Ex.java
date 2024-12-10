package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9Ex  reason: invalid class name and case insensitive filesystem */
public final class C178909Ex extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C184119aR A00;

    public static final void A00(C184119aR r21, C29621ca r22, AnonymousClass9F5 r23) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r6;
        AnonymousClass1UI r62;
        AnonymousClass1UI r63;
        AnonymousClass9F5 r5 = r23;
        C18070vi.A0d(r5, 1);
        C184119aR r3 = r21;
        ArrayList A16 = C108955ca.A16(r3, 2);
        C29621ca r12 = r22;
        try {
            C29621ca A03 = C20121A8g.A03(r12, r5);
            C62672rm A0s = AnonymousClass8BR.A0s();
            A0s.A05(r12, String.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), "1", new String[]{"bot", "v"}, false);
            C20020A3m a3m = C20020A3m.A00;
            if (C21290Ahb.A00(A03, a3m, 19).BCF(r12, A0s) != null) {
                if (AnonymousClass8BX.A0l(r12, A0s, new C21282AhT(a3m, 46), new String[]{"bot", "bot"}) != null) {
                    new AnonymousClass9S5
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: CONSTRUCTOR  (r6v54 ? I:X.9S5) =  call: X.9S5.<init>():void type: CONSTRUCTOR in method: X.9Ex.A00(X.9aR, X.1ca, X.9F5):void, dex: classes5.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v54 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 46 more
                        */
                    /*
                        r1 = 0
                        r0 = 1
                        r5 = r23
                        X.C18070vi.A0d(r5, r0)
                        r2 = 2
                        r3 = r21
                        java.util.ArrayList r4 = X.C108955ca.A16(r3, r2)
                        r12 = r22
                        X.1ca r7 = X.C20121A8g.A03(r12, r5)     // Catch:{ 1UI -> 0x0077 }
                        X.2rm r11 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0077 }
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0077 }
                        java.lang.String r10 = "bot"
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0077 }
                        java.lang.String r6 = "v"
                        r8[r0] = r6     // Catch:{ 1UI -> 0x0077 }
                        java.lang.Class<java.lang.String> r13 = java.lang.String.class
                        java.lang.Long r14 = X.AnonymousClass8BU.A0i()     // Catch:{ 1UI -> 0x0077 }
                        java.lang.Long r15 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0077 }
                        java.lang.String r16 = "1"
                        r17 = r8
                        r18 = r1
                        r11.A05(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 1UI -> 0x0077 }
                        X.A3m r9 = X.C20020A3m.A00     // Catch:{ 1UI -> 0x0077 }
                        r6 = 19
                        X.Ahb r6 = X.C21290Ahb.A00(r7, r9, r6)     // Catch:{ 1UI -> 0x0077 }
                        java.lang.Object r6 = r6.BCF(r12, r11)     // Catch:{ 1UI -> 0x0077 }
                        if (r6 == 0) goto L_0x0072
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0077 }
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0077 }
                        r8[r0] = r10     // Catch:{ 1UI -> 0x0077 }
                        r7 = 46
                        X.AhT r6 = new X.AhT     // Catch:{ 1UI -> 0x0077 }
                        r6.<init>(r9, r7)     // Catch:{ 1UI -> 0x0077 }
                        java.util.ArrayList r6 = X.AnonymousClass8BX.A0l(r12, r11, r6, r8)     // Catch:{ 1UI -> 0x0077 }
                        if (r6 == 0) goto L_0x006d
                        java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0077 }
                        r7[r1] = r10     // Catch:{ 1UI -> 0x0077 }
                        X.9S5 r6 = new X.9S5     // Catch:{ 1UI -> 0x0077 }
                        r6.<init>()     // Catch:{ 1UI -> 0x0077 }
                        X.AnonymousClass8BS.A1A(r12, r7)     // Catch:{ 1UI -> 0x0077 }
                        java.lang.String r6 = "GetChatbotListProtocolHelper/v1 not implemented, deprecated"
                        com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ 1UI -> 0x0077 }
                        X.9k9 r6 = r3.A00     // Catch:{ 1UI -> 0x0077 }
                        r6.A00()     // Catch:{ 1UI -> 0x0077 }
                        return
                    L_0x006d:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0077 }
                        goto L_0x0076
                    L_0x0072:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0077 }
                    L_0x0076:
                        throw r6     // Catch:{ 1UI -> 0x0077 }
                    L_0x0077:
                        r8 = move-exception
                        java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
                        java.lang.String r6 = "BotListResponseSuccessV1: "
                        X.AnonymousClass8BY.A1I(r6, r7, r8, r4)
                        X.9FO r8 = new X.9FO     // Catch:{ 1UI -> 0x00b4 }
                        r8.<init>((X.C29621ca) r12, (X.AnonymousClass9F5) r5)     // Catch:{ 1UI -> 0x00b4 }
                        com.whatsapp.bot.home.sync.discovery.DiscoveryBotsSerializer r7 = com.whatsapp.bot.home.sync.discovery.DiscoveryBotsSerializer.A00     // Catch:{ 1UI -> 0x00b4 }
                        X.9aS r6 = r3.A01     // Catch:{ 1UI -> 0x00b4 }
                        X.11P r6 = r6.A00     // Catch:{ 1UI -> 0x00b4 }
                        java.lang.Long r6 = X.AnonymousClass8BU.A0l(r6)     // Catch:{ 1UI -> 0x00b4 }
                        X.1D6 r6 = X.AnonymousClass1D6.A01(r8, r6)     // Catch:{ 1UI -> 0x00b4 }
                        com.whatsapp.bot.home.sync.discovery.DiscoveryBots r9 = r7.BLj(r6)     // Catch:{ 1UI -> 0x00b4 }
                        if (r9 == 0) goto L_0x00ae
                        java.util.List r7 = r9.A02     // Catch:{ 1UI -> 0x00b4 }
                        r7.size()     // Catch:{ 1UI -> 0x00b4 }
                        X.9k9 r6 = r3.A00     // Catch:{ 1UI -> 0x00b4 }
                        r7.size()     // Catch:{ 1UI -> 0x00b4 }
                        X.24f r8 = r6.A01     // Catch:{ 1UI -> 0x00b4 }
                        X.10I r7 = r8.A05     // Catch:{ 1UI -> 0x00b4 }
                        X.2iZ r6 = r6.A00     // Catch:{ 1UI -> 0x00b4 }
                        X.C21434Ak1.A00(r7, r8, r9, r6, r2)     // Catch:{ 1UI -> 0x00b4 }
                        return
                    L_0x00ae:
                        X.9k9 r6 = r3.A00     // Catch:{ 1UI -> 0x00b4 }
                        r6.A00()     // Catch:{ 1UI -> 0x00b4 }
                        return
                    L_0x00b4:
                        r8 = move-exception
                        java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
                        java.lang.String r6 = "BotListResponseSuccessV2: "
                        X.AnonymousClass8BY.A1I(r6, r7, r8, r4)
                        java.lang.String r19 = "3"
                        X.1ca r6 = X.C20121A8g.A03(r12, r5)     // Catch:{ 1UI -> 0x0161 }
                        X.2rm r11 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r10 = "bot"
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r7 = "bhash"
                        r8[r0] = r7     // Catch:{ 1UI -> 0x0161 }
                        java.lang.Class<java.lang.String> r13 = java.lang.String.class
                        java.lang.Long r14 = X.AnonymousClass8BV.A0d()     // Catch:{ 1UI -> 0x0161 }
                        r16 = 0
                        r15 = r14
                        r17 = r8
                        r18 = r1
                        java.lang.Object r7 = r11.A05(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 1UI -> 0x0161 }
                        if (r7 == 0) goto L_0x0157
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0161 }
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r7 = "v"
                        java.lang.Long r17 = X.AnonymousClass8BW.A0Z(r7, r8, r0)     // Catch:{ 1UI -> 0x0161 }
                        java.lang.Long r18 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0161 }
                        r14 = r11
                        r15 = r12
                        r16 = r13
                        r20 = r8
                        r21 = r1
                        java.lang.Object r7 = r14.A05(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1UI -> 0x0161 }
                        if (r7 == 0) goto L_0x0152
                        X.A3m r9 = X.C20020A3m.A00     // Catch:{ 1UI -> 0x0161 }
                        r7 = 20
                        X.Ahb r6 = X.C21290Ahb.A00(r6, r9, r7)     // Catch:{ 1UI -> 0x0161 }
                        java.lang.Object r6 = r6.BCF(r12, r11)     // Catch:{ 1UI -> 0x0161 }
                        if (r6 == 0) goto L_0x015c
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0161 }
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r6 = "default"
                        r8[r0] = r6     // Catch:{ 1UI -> 0x0161 }
                        r7 = 47
                        X.AhT r6 = new X.AhT     // Catch:{ 1UI -> 0x0161 }
                        r6.<init>(r9, r7)     // Catch:{ 1UI -> 0x0161 }
                        r11.A02(r12, r6, r8)     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0161 }
                        r8[r1] = r10     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r6 = "section"
                        r8[r0] = r6     // Catch:{ 1UI -> 0x0161 }
                        r7 = 48
                        X.AhT r6 = new X.AhT     // Catch:{ 1UI -> 0x0161 }
                        r6.<init>(r9, r7)     // Catch:{ 1UI -> 0x0161 }
                        java.util.ArrayList r6 = X.AnonymousClass8BX.A0k(r12, r11, r6, r8)     // Catch:{ 1UI -> 0x0161 }
                        if (r6 == 0) goto L_0x014d
                        java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x0161 }
                        r7[r1] = r10     // Catch:{ 1UI -> 0x0161 }
                        X.9S6 r6 = new X.9S6     // Catch:{ 1UI -> 0x0161 }
                        r6.<init>()     // Catch:{ 1UI -> 0x0161 }
                        X.AnonymousClass8BS.A1A(r12, r7)     // Catch:{ 1UI -> 0x0161 }
                        java.lang.String r6 = "GetChatbotListProtocolHelper/v3 deprecated"
                        com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ 1UI -> 0x0161 }
                        X.9k9 r6 = r3.A00     // Catch:{ 1UI -> 0x0161 }
                        r6.A00()     // Catch:{ 1UI -> 0x0161 }
                        return
                    L_0x014d:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0161 }
                        goto L_0x0160
                    L_0x0152:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0161 }
                        goto L_0x0160
                    L_0x0157:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0161 }
                        goto L_0x0160
                    L_0x015c:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x0161 }
                    L_0x0160:
                        throw r6     // Catch:{ 1UI -> 0x0161 }
                    L_0x0161:
                        r8 = move-exception
                        java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
                        java.lang.String r6 = "BotListResponseSuccessV3: "
                        X.AnonymousClass8BY.A1I(r6, r7, r8, r4)
                        java.lang.String r21 = "4"
                        X.1ca r8 = X.C20121A8g.A03(r12, r5)     // Catch:{ 1UI -> 0x01ff }
                        X.2rm r7 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x01ff }
                        java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x01ff }
                        java.lang.String r11 = "bot"
                        r9[r1] = r11     // Catch:{ 1UI -> 0x01ff }
                        java.lang.String r6 = "bhash"
                        r9[r0] = r6     // Catch:{ 1UI -> 0x01ff }
                        java.lang.Class<java.lang.String> r15 = java.lang.String.class
                        java.lang.Long r16 = X.AnonymousClass8BV.A0d()     // Catch:{ 1UI -> 0x01ff }
                        r18 = 0
                        r17 = r16
                        r13 = r7
                        r14 = r12
                        r19 = r9
                        r20 = r1
                        java.lang.Object r6 = r13.A05(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x01ff }
                        if (r6 == 0) goto L_0x01f5
                        java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x01ff }
                        r9[r1] = r11     // Catch:{ 1UI -> 0x01ff }
                        java.lang.String r6 = "v"
                        java.lang.Long r19 = X.AnonymousClass8BW.A0Z(r6, r9, r0)     // Catch:{ 1UI -> 0x01ff }
                        java.lang.Long r20 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x01ff }
                        r16 = r7
                        r17 = r12
                        r18 = r15
                        r22 = r9
                        r23 = r1
                        java.lang.Object r6 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x01ff }
                        if (r6 == 0) goto L_0x01f0
                        X.A3m r10 = X.C20020A3m.A00     // Catch:{ 1UI -> 0x01ff }
                        r6 = 21
                        X.Ahb r6 = X.C21290Ahb.A00(r8, r10, r6)     // Catch:{ 1UI -> 0x01ff }
                        java.lang.Object r6 = r6.BCF(r12, r7)     // Catch:{ 1UI -> 0x01ff }
                        if (r6 == 0) goto L_0x01fa
                        java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x01ff }
                        r9[r1] = r11     // Catch:{ 1UI -> 0x01ff }
                        r9[r0] = r11     // Catch:{ 1UI -> 0x01ff }
                        r8 = 49
                        X.AhT r6 = new X.AhT     // Catch:{ 1UI -> 0x01ff }
                        r6.<init>(r10, r8)     // Catch:{ 1UI -> 0x01ff }
                        java.util.ArrayList r6 = X.AnonymousClass8BX.A0k(r12, r7, r6, r9)     // Catch:{ 1UI -> 0x01ff }
                        if (r6 == 0) goto L_0x01eb
                        java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ 1UI -> 0x01ff }
                        r7[r1] = r11     // Catch:{ 1UI -> 0x01ff }
                        X.9S7 r6 = new X.9S7     // Catch:{ 1UI -> 0x01ff }
                        r6.<init>()     // Catch:{ 1UI -> 0x01ff }
                        X.AnonymousClass8BS.A1A(r12, r7)     // Catch:{ 1UI -> 0x01ff }
                        java.lang.String r6 = "GetChatbotListProtocolHelper/v4 not implemented"
                        com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ 1UI -> 0x01ff }
                        X.9k9 r6 = r3.A00     // Catch:{ 1UI -> 0x01ff }
                        r6.A00()     // Catch:{ 1UI -> 0x01ff }
                        return
                    L_0x01eb:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x01ff }
                        goto L_0x01fe
                    L_0x01f0:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x01ff }
                        goto L_0x01fe
                    L_0x01f5:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x01ff }
                        goto L_0x01fe
                    L_0x01fa:
                        X.1UI r6 = X.AnonymousClass1O9.A00(r7)     // Catch:{ 1UI -> 0x01ff }
                    L_0x01fe:
                        throw r6     // Catch:{ 1UI -> 0x01ff }
                    L_0x01ff:
                        r8 = move-exception
                        java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
                        java.lang.String r6 = "BotListResponseSuccessV4: "
                        X.AnonymousClass8BY.A1I(r6, r7, r8, r4)
                        X.1ca r7 = X.C20121A8g.A03(r12, r5)     // Catch:{ 1UI -> 0x026c }
                        X.2rm r6 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x026c }
                        X.A3m r8 = X.C20020A3m.A00     // Catch:{ 1UI -> 0x026c }
                        r5 = 18
                        X.Ahb r5 = X.C21290Ahb.A00(r7, r8, r5)     // Catch:{ 1UI -> 0x026c }
                        java.lang.Object r5 = r5.BCF(r12, r6)     // Catch:{ 1UI -> 0x026c }
                        if (r5 == 0) goto L_0x0267
                        r5 = 4
                        X.B9c[] r7 = new X.C22470B9c[r5]     // Catch:{ 1UI -> 0x026c }
                        r5 = 42
                        X.C21282AhT.A00(r7, r5, r1, r8)     // Catch:{ 1UI -> 0x026c }
                        r5 = 43
                        X.C21282AhT.A00(r7, r5, r0, r8)     // Catch:{ 1UI -> 0x026c }
                        r5 = 44
                        X.C21282AhT.A00(r7, r5, r2, r8)     // Catch:{ 1UI -> 0x026c }
                        r2 = 45
                        X.AhT r5 = new X.AhT     // Catch:{ 1UI -> 0x026c }
                        r5.<init>(r8, r2)     // Catch:{ 1UI -> 0x026c }
                        r2 = 3
                        java.util.List r2 = X.C18070vi.A0O(r5, r7, r2)     // Catch:{ 1UI -> 0x026c }
                        java.lang.String[] r1 = X.AnonymousClass8BS.A1b(r0, r1)     // Catch:{ 1UI -> 0x026c }
                        java.lang.String r0 = "IQErrorInternalServerError|IQErrorForbidden|IQErrorBadRequest|IQErrorNotAllowed"
                        java.lang.Object r1 = r6.A06(r12, r0, r2, r1)     // Catch:{ 1UI -> 0x026c }
                        if (r1 == 0) goto L_0x0262
                        X.9Cd r1 = (X.C178189Cd) r1     // Catch:{ 1UI -> 0x026c }
                        java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x026c }
                        java.lang.String r0 = "GetChatbotListProtocolHelper/get list error code="
                        r2.append(r0)     // Catch:{ 1UI -> 0x026c }
                        long r0 = r1.A00     // Catch:{ 1UI -> 0x026c }
                        r2.append(r0)     // Catch:{ 1UI -> 0x026c }
                        X.C17890vO.A0w(r2)     // Catch:{ 1UI -> 0x026c }
                        X.9k9 r0 = r3.A00     // Catch:{ 1UI -> 0x026c }
                        r0.A00()     // Catch:{ 1UI -> 0x026c }
                        return
                    L_0x0262:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x026c }
                        goto L_0x026b
                    L_0x0267:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r6)     // Catch:{ 1UI -> 0x026c }
                    L_0x026b:
                        throw r0     // Catch:{ 1UI -> 0x026c }
                    L_0x026c:
                        r2 = move-exception
                        java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
                        java.lang.String r0 = "BotListResponseError: "
                        X.1UI r0 = X.AnonymousClass8BY.A0N(r0, r1, r2, r4)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C178909Ex.A00(X.9aR, X.1ca, X.9F5):void");
                }

                public void BrD(String str) {
                    C18070vi.A0d(str, 0);
                    C184119aR r1 = this.A00;
                    Log.w("GetChatbotListProtocolHelper/onDeliveryFailure");
                    r1.A00.A00();
                }

                public C178909Ex(C184119aR r1, AnonymousClass9F5 r2) {
                    this.A00 = r2;
                    this.A00 = r1;
                }

                public void Bt9(C29621ca r3, String str) {
                    A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
                }

                public void C7Z(C29621ca r3, String str) {
                    A00(this.A00, r3, (AnonymousClass9F5) C108955ca.A0c(this, r3));
                }

                public /* synthetic */ C22384B5n CM9(String str) {
                    return C20958AcC.A00;
                }
            }
