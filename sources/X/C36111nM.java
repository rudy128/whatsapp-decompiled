package X;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: X.1nM  reason: invalid class name and case insensitive filesystem */
public final class C36111nM implements AnonymousClass1RJ {
    public final C36101nL A00;

    public C36111nM(C36101nL r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public int[] BSG() {
        return new int[]{257};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2rm] */
    public boolean BcT(Message message, int i) {
        boolean z;
        Message message2 = message;
        C18070vi.A0d(message2, 1);
        if (i != 257) {
            return false;
        }
        Object obj = message2.obj;
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.ProtocolTreeNode");
        C29621ca r6 = (C29621ca) obj;
        C18070vi.A0d(r6, 1);
        C173438v4 r10 = C173438v4.A00;
        C29621ca.A04(r6, "ib");
        ? obj2 = new Object();
        if (obj2.A05(r6, C173438v4.class, -9007199254740991L, 9007199254740991L, r10, new String[]{"from"}, false) != null) {
            C61002ox r3 = C61002ox.A00;
            obj2.A03(r6, new C21284AhV(r3, 28), new String[]{"thread_metadata"});
            C62672rm r13 = obj2;
            C29621ca r14 = r6;
            ArrayList A08 = r13.A08(r14, new C21159AfU(r3, 2), new String[]{"thread_metadata", "item"}, 0, 50);
            if (A08 != null) {
                new AnonymousClass2VA
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007d: CONSTRUCTOR  (r0v12 ? I:X.2VA) =  call: X.2VA.<init>():void type: CONSTRUCTOR in method: X.1nM.BcT(android.os.Message, int):boolean, dex: classes2.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v12 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 47 more
                    */
                /*
                    this = this;
                    r1 = 1
                    r3 = r22
                    X.C18070vi.A0d(r3, r1)
                    r0 = 257(0x101, float:3.6E-43)
                    r2 = r23
                    if (r2 == r0) goto L_0x000e
                    r1 = 0
                L_0x000d:
                    return r1
                L_0x000e:
                    java.lang.Object r6 = r3.obj
                    java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.ProtocolTreeNode"
                    X.C18070vi.A0z(r6, r0)
                    X.1ca r6 = (X.C29621ca) r6
                    X.C18070vi.A0d(r6, r1)
                    X.8v4 r10 = X.C173438v4.A00
                    java.lang.String r0 = "ib"
                    X.C29621ca.A04(r6, r0)
                    X.2rm r5 = new X.2rm
                    r5.<init>()
                    java.lang.String[] r11 = new java.lang.String[r1]
                    java.lang.String r0 = "from"
                    r12 = 0
                    r11[r12] = r0
                    java.lang.Class<X.8v4> r7 = X.C173438v4.class
                    r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
                    java.lang.Long r8 = java.lang.Long.valueOf(r2)
                    r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
                    java.lang.Long r9 = java.lang.Long.valueOf(r2)
                    java.lang.Object r0 = r5.A05(r6, r7, r8, r9, r10, r11, r12)
                    if (r0 == 0) goto L_0x016a
                    X.2ox r3 = X.C61002ox.A00
                    r0 = 28
                    X.AhV r2 = new X.AhV
                    r2.<init>(r3, r0)
                    java.lang.String[] r0 = new java.lang.String[r1]
                    java.lang.String r4 = "thread_metadata"
                    r0[r12] = r4
                    r5.A03(r6, r2, r0)
                    r0 = 2
                    java.lang.String[] r2 = new java.lang.String[r0]
                    r2[r12] = r4
                    java.lang.String r0 = "item"
                    r2[r1] = r0
                    r0 = 2
                    X.AfU r15 = new X.AfU
                    r15.<init>(r3, r0)
                    r17 = 0
                    r19 = 50
                    r13 = r5
                    r14 = r6
                    r16 = r2
                    java.util.ArrayList r3 = r13.A08(r14, r15, r16, r17, r19)
                    if (r3 == 0) goto L_0x0162
                    java.lang.String[] r2 = new java.lang.String[r1]
                    r2[r12] = r4
                    X.2VA r0 = new X.2VA
                    r0.<init>()
                    java.util.ArrayList r0 = X.C29601cY.A00(r6, r2)
                    r0.get(r12)
                    boolean r0 = r3.isEmpty()
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L_0x000d
                    r0 = r21
                    X.1nL r8 = r0.A00
                    boolean r0 = r3.isEmpty()
                    if (r0 != 0) goto L_0x000d
                    java.util.HashMap r13 = new java.util.HashMap
                    r13.<init>()
                    java.util.Iterator r7 = r3.iterator()
                L_0x00a2:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L_0x00c2
                    java.lang.Object r2 = r7.next()
                    X.9DK r2 = (X.AnonymousClass9DK) r2
                    java.lang.Object r6 = r2.A01
                    java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.ChatJid"
                    X.C18070vi.A0z(r6, r0)
                    long r4 = r2.A00
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r4 = r4 * r2
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r13.put(r6, r0)
                    goto L_0x00a2
                L_0x00c2:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r0 = "PresortingChatsManager/onThreadMetadataItems: "
                    r2.append(r0)
                    int r0 = r13.size()
                    r2.append(r0)
                    java.lang.String r0 = " conversations"
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.whatsapp.util.Log.i((java.lang.String) r0)
                    X.1Nd r0 = r8.A00
                    X.1Ne r7 = r0.A01
                    monitor-enter(r7)
                    boolean r0 = r7.A00     // Catch:{ all -> 0x015f }
                    if (r0 != 0) goto L_0x0155
                    r7.A00 = r1     // Catch:{ all -> 0x015f }
                    java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x015f }
                    r9.<init>()     // Catch:{ all -> 0x015f }
                    java.util.ArrayList r6 = r7.A01     // Catch:{ all -> 0x015f }
                    java.util.Iterator r12 = r6.iterator()     // Catch:{ all -> 0x015f }
                L_0x00f5:
                    boolean r0 = r12.hasNext()     // Catch:{ all -> 0x015f }
                    if (r0 == 0) goto L_0x011e
                    java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x015f }
                    X.1ng r11 = (X.C36311ng) r11     // Catch:{ all -> 0x015f }
                    X.1BI r10 = r11.A01     // Catch:{ all -> 0x015f }
                    java.lang.Object r0 = r13.get(r10)     // Catch:{ all -> 0x015f }
                    java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x015f }
                    if (r0 == 0) goto L_0x011a
                    long r4 = r0.longValue()     // Catch:{ all -> 0x015f }
                    long r2 = r11.A00     // Catch:{ all -> 0x015f }
                    int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L_0x011a
                    X.1ng r11 = new X.1ng     // Catch:{ all -> 0x015f }
                    r11.<init>(r10, r4)     // Catch:{ all -> 0x015f }
                L_0x011a:
                    r9.add(r11)     // Catch:{ all -> 0x015f }
                    goto L_0x00f5
                L_0x011e:
                    java.util.Collections.sort(r9)     // Catch:{ all -> 0x015f }
                    java.util.HashMap r10 = r7.A02     // Catch:{ all -> 0x015f }
                    r10.clear()     // Catch:{ all -> 0x015f }
                    java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x015f }
                L_0x012a:
                    boolean r0 = r5.hasNext()     // Catch:{ all -> 0x015f }
                    if (r0 == 0) goto L_0x0142
                    java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x015f }
                    X.1ng r0 = (X.C36311ng) r0     // Catch:{ all -> 0x015f }
                    X.1BI r4 = r0.A01     // Catch:{ all -> 0x015f }
                    long r2 = r0.A00     // Catch:{ all -> 0x015f }
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x015f }
                    r10.put(r4, r0)     // Catch:{ all -> 0x015f }
                    goto L_0x012a
                L_0x0142:
                    boolean r0 = r6.equals(r9)     // Catch:{ all -> 0x015f }
                    if (r0 != 0) goto L_0x0155
                    java.lang.String r0 = "SortedConversationsList/updateFromThreadMetadata setting timestamps from metadata"
                    com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015f }
                    r6.clear()     // Catch:{ all -> 0x015f }
                    r6.addAll(r9)     // Catch:{ all -> 0x015f }
                    r0 = 1
                    goto L_0x0156
                L_0x0155:
                    r0 = 0
                L_0x0156:
                    monitor-exit(r7)     // Catch:{ all -> 0x015f }
                    if (r0 == 0) goto L_0x000d
                    X.1NN r0 = r8.A01
                    r0.A00()
                    return r1
                L_0x015f:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch:{ all -> 0x015f }
                    throw r0
                L_0x0162:
                    java.lang.String r1 = r5.A00
                    X.1UI r0 = new X.1UI
                    r0.<init>((java.lang.String) r1)
                    throw r0
                L_0x016a:
                    java.lang.String r1 = r5.A00
                    X.1UI r0 = new X.1UI
                    r0.<init>((java.lang.String) r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C36111nM.BcT(android.os.Message, int):boolean");
            }
        }
