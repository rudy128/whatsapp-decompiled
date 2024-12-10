package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.AcX  reason: case insensitive filesystem */
public class C20979AcX implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C20979AcX(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public void BrD(String str) {
        if (this.A00 != 0) {
            Log.e("deactivateInternationalPayments/onDeactivateInternational/onDeliveryFailure");
        }
    }

    public void Bt9(C29621ca r6, String str) {
        if (this.A00 != 0) {
            C18070vi.A0d(r6, 1);
            AnonymousClass9YN r4 = (AnonymousClass9YN) this.A01;
            AnonymousClass9F7 r1 = (AnonymousClass9F7) this.A02;
            AnonymousClass8BT.A1I(r6, r1, 2);
            Object obj = r1.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            if (C21289Aha.A01(r6, A0s, obj, C20072A5y.A00, 33) != null) {
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = r4.A00;
                indiaUpiBankAccountDetailsActivity.A00.CGP(C21447AkE.A00(indiaUpiBankAccountDetailsActivity, 0));
                return;
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        Log.i("GroupXmppMethods/sendSetGroupAdminSetting error");
        ((B9K) this.A02).CGB(C60482o6.A00(r6));
    }

    public void C7Z(C29621ca r27, String str) {
        C29621ca r4 = r27;
        if (this.A00 != 0) {
            C18070vi.A0d(r4, 1);
            AnonymousClass9F7 r3 = (AnonymousClass9F7) this.A02;
            C18070vi.A0d(r3, 2);
            C29621ca.A04(r4, "iq");
            C29621ca r13 = (C29621ca) r3.A00;
            C62672rm A0s = AnonymousClass8BR.A0s();
            String[] strArr = new String[2];
            strArr[0] = "activated";
            String A07 = A0s.A07(r4, C18070vi.A0O("deactivated", strArr, 1), new String[]{"account", "international-payments-status"});
            if (A07 != null) {
                String[] strArr2 = {"account", "action"};
                Class<String> cls = String.class;
                String[] strArr3 = new String[2];
                strArr3[0] = "account";
                Long A0Z = AnonymousClass8BW.A0Z("action", strArr3, 1);
                Long A0j = AnonymousClass8BU.A0j();
                Object A05 = A0s.A05(r13, cls, A0Z, A0j, (Object) null, strArr3, false);
                if (A05 != null) {
                    C62672rm r18 = A0s;
                    C29621ca r19 = r4;
                    Long l = A0j;
                    if (r18.A05(r19, cls, A0Z, l, A05, strArr2, true) != null) {
                        if (r18.A05(r19, Long.TYPE, C108975cc.A0X(), l, (Object) null, new String[]{"account", "version"}, false) != null) {
                            C20072A5y a5y = C20072A5y.A00;
                            if (C21289Aha.A00(r13, a5y, 34).BCF(r4, A0s) != null) {
                                new AnonymousClass9SM
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a2: CONSTRUCTOR  (r0v10 ? I:X.9SM) =  call: X.9SM.<init>():void type: CONSTRUCTOR in method: X.AcX.C7Z(X.1ca, java.lang.String):void, dex: classes5.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v10 ?
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	... 69 more
                                    */
                                /*
                                    this = this;
                                    r2 = r26
                                    int r0 = r2.A00
                                    r4 = r27
                                    if (r0 == 0) goto L_0x00df
                                    r0 = 1
                                    X.C18070vi.A0d(r4, r0)
                                    java.lang.Object r3 = r2.A02
                                    X.9F7 r3 = (X.AnonymousClass9F7) r3
                                    r8 = 2
                                    X.C18070vi.A0d(r3, r8)
                                    java.lang.String r1 = "iq"
                                    X.C29621ca.A04(r4, r1)
                                    java.lang.Object r13 = r3.A00
                                    X.1ca r13 = (X.C29621ca) r13
                                    X.2rm r12 = X.AnonymousClass8BR.A0s()
                                    java.lang.String[] r7 = new java.lang.String[r8]
                                    java.lang.String r5 = "activated"
                                    r3 = 0
                                    r7[r3] = r5
                                    java.lang.String r6 = "deactivated"
                                    java.util.List r9 = X.C18070vi.A0O(r6, r7, r0)
                                    java.lang.String[] r7 = new java.lang.String[r8]
                                    java.lang.String r11 = "account"
                                    r7[r3] = r11
                                    java.lang.String r5 = "international-payments-status"
                                    r7[r0] = r5
                                    java.lang.String r5 = r12.A07(r4, r9, r7)
                                    if (r5 == 0) goto L_0x0125
                                    java.lang.String[] r7 = new java.lang.String[r8]
                                    r7[r3] = r11
                                    java.lang.String r10 = "action"
                                    r7[r0] = r10
                                    java.lang.Class<java.lang.String> r14 = java.lang.String.class
                                    java.lang.String[] r9 = new java.lang.String[r8]
                                    r9[r3] = r11
                                    java.lang.Long r15 = X.AnonymousClass8BW.A0Z(r10, r9, r0)
                                    java.lang.Long r16 = X.AnonymousClass8BU.A0j()
                                    r17 = 0
                                    r18 = r9
                                    r19 = r3
                                    java.lang.Object r23 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
                                    if (r23 == 0) goto L_0x0120
                                    r18 = r12
                                    r19 = r4
                                    r20 = r14
                                    r21 = r15
                                    r22 = r16
                                    r24 = r7
                                    r25 = r0
                                    java.lang.Object r7 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                    if (r7 == 0) goto L_0x011b
                                    java.lang.String[] r8 = new java.lang.String[r8]
                                    r8[r3] = r11
                                    java.lang.String r7 = "version"
                                    r8[r0] = r7
                                    java.lang.Class r20 = java.lang.Long.TYPE
                                    java.lang.Long r21 = X.C108975cc.A0X()
                                    r23 = r17
                                    r24 = r8
                                    r25 = r3
                                    java.lang.Object r7 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
                                    if (r7 == 0) goto L_0x0116
                                    X.A5y r8 = X.C20072A5y.A00
                                    r7 = 34
                                    X.Aha r7 = X.C21289Aha.A00(r13, r8, r7)
                                    java.lang.Object r7 = r7.BCF(r4, r12)
                                    if (r7 == 0) goto L_0x0111
                                    java.lang.String[] r7 = new java.lang.String[r0]
                                    r7[r3] = r11
                                    X.9SM r0 = new X.9SM
                                    r0.<init>()
                                    X.AnonymousClass8BS.A1A(r4, r7)
                                    boolean r0 = r5.equals(r6)
                                    if (r0 == 0) goto L_0x00ed
                                    java.lang.Object r0 = r2.A03
                                    X.8yz r0 = (X.C175608yz) r0
                                    X.00H r0 = r0.A01
                                    java.lang.Object r4 = r0.get()
                                    X.A0u r4 = (X.A0u) r4
                                    java.lang.String r3 = r2.A04
                                    X.0vl r1 = r4.A01
                                    java.util.Map r0 = X.AnonymousClass3MW.A12(r1)
                                    r0.remove(r3)
                                    java.util.Map r0 = X.AnonymousClass3MW.A12(r1)
                                    X.A0u.A00(r4, r0)
                                    java.lang.Object r0 = r2.A01
                                    X.9YN r0 = (X.AnonymousClass9YN) r0
                                    com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = r0.A00
                                    X.1KB r2 = r3.A00
                                    r1 = 49
                                    X.Ajt r0 = new X.Ajt
                                    r0.<init>(r3, r1)
                                    r2.CGP(r0)
                                L_0x00de:
                                    return
                                L_0x00df:
                                    java.lang.String r0 = r2.A04
                                    X.1ca r0 = r4.A0K(r0)
                                    if (r0 == 0) goto L_0x00de
                                    java.lang.Object r0 = r2.A03
                                    X.C108945cZ.A1P(r0)
                                    return
                                L_0x00ed:
                                    java.lang.Object r2 = r2.A01
                                    X.9YN r2 = (X.AnonymousClass9YN) r2
                                    X.C29621ca.A04(r4, r1)
                                    X.2rm r1 = X.AnonymousClass8BR.A0s()
                                    r0 = 33
                                    java.lang.Object r0 = X.C21289Aha.A01(r4, r1, r13, r8, r0)
                                    if (r0 == 0) goto L_0x010c
                                    com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r0 = r2.A00
                                    X.1KB r1 = r0.A00
                                    X.AkE r0 = X.C21447AkE.A00(r0, r3)
                                    r1.CGP(r0)
                                    return
                                L_0x010c:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r1)
                                    throw r0
                                L_0x0111:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                    throw r0
                                L_0x0116:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                    throw r0
                                L_0x011b:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                    throw r0
                                L_0x0120:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                    throw r0
                                L_0x0125:
                                    X.1UI r0 = X.AnonymousClass1O9.A00(r12)
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C20979AcX.C7Z(X.1ca, java.lang.String):void");
                            }

                            public /* synthetic */ C22384B5n CM9(String str) {
                                return C20958AcC.A00;
                            }
                        }
