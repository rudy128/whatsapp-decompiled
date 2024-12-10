package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9FO  reason: invalid class name */
public class AnonymousClass9FO extends AnonymousClass9CP {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public AnonymousClass9FO(C29621ca r43, AnonymousClass9F5 r44) {
        String A0u;
        StringBuilder A10;
        C29621ca r5 = r43;
        C29621ca A032 = C20121A8g.A03(r5, r44);
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, "jid"};
        Long A0i = AnonymousClass8BU.A0i();
        Long A0j = AnonymousClass8BU.A0j();
        Object A052 = A0s.A05(r5, UserJid.class, A0i, A0j, (Object) null, strArr, false);
        if (A052 != null) {
            this.A00 = A052;
            String[] A1b = C17880vN.A1b("bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, 3, 1);
            A1b[2] = "persona_id";
            Class<String> cls = String.class;
            Long A0L = C17890vO.A0L();
            C62672rm r26 = A0s;
            String str = (String) r26.A05(r5, cls, A0L, 41L, (Object) null, A1b, false);
            if (str != null) {
                this.A05 = str;
                if (A0s.A05(r5, cls, A0i, A0j, "2", new String[]{"bot", "v"}, false) != null) {
                    C18070vi.A0d(C20020A3m.A00, 0);
                    C18070vi.A0d(A032, 1);
                    AnonymousClass9DG A002 = C20020A3m.A00(r5, A032, A0s);
                    if (A002 != null) {
                        this.A04 = A002;
                        String[] strArr2 = {"bot", "section"};
                        C29621ca A0Q = AnonymousClass8BS.A0Q(r5, strArr2, 0);
                        if (A0Q == null) {
                            A10 = AnonymousClass000.A10();
                            AnonymousClass8BY.A12(r5, A10, strArr2, 0);
                        } else {
                            String str2 = strArr2[1];
                            List A0R = A0Q.A0R(str2);
                            ArrayList A0t = C108965cb.A0t(A0R);
                            Iterator it = A0R.iterator();
                            while (it.hasNext()) {
                                C29621ca A0R2 = AnonymousClass8BW.A0R(it, 1);
                                if (A0s.A09(A0R2, "section")) {
                                    String[] A1b2 = AnonymousClass8BR.A1b();
                                    A1b2[0] = "all";
                                    A1b2[1] = "category";
                                    String A07 = A0s.A07(A0R2, C18070vi.A0O("featured", A1b2, 2), AnonymousClass8BS.A1a(1, 0));
                                    if (A07 != null) {
                                        C29621ca r27 = A0R2;
                                        String str3 = (String) r26.A05(r27, cls, A0L, AnonymousClass8BV.A0g(), (Object) null, AnonymousClass8BS.A1T(1), false);
                                        if (str3 != null) {
                                            String[] strArr3 = new String[1];
                                            strArr3[0] = "bot";
                                            ArrayList A08 = A0s.A08(A0R2, new C21280AhR(2), strArr3, 0, Long.MAX_VALUE);
                                            if (A08 != null) {
                                                A0t.add(new AnonymousClass9DG(A0R2, A07, str3, (List) A08, 6));
                                            }
                                        }
                                    }
                                }
                            }
                            if (AnonymousClass8BR.A06(A0t) < 1) {
                                A10 = AnonymousClass000.A10();
                                AnonymousClass8BY.A1K(str2, A10, A0t);
                                A10.append(1);
                                A10.append('.');
                            } else if (AnonymousClass8BR.A06(A0t) > Long.MAX_VALUE) {
                                StringBuilder A102 = AnonymousClass000.A10();
                                AnonymousClass8BY.A1J(str2, A102, A0t);
                                A0u = AnonymousClass8BV.A0u(A102, '.', Long.MAX_VALUE);
                                A0s.A00 = A0u;
                                throw AnonymousClass1UI.A01(A0u);
                            } else {
                                this.A03 = A0t;
                                this.A00 = r5;
                                String str4 = new String[]{"bot"}[0];
                                List A0R3 = r5.A0R(str4);
                                ArrayList A0t2 = C108965cb.A0t(A0R3);
                                Iterator it2 = A0R3.iterator();
                                while (it2.hasNext()) {
                                    AnonymousClass8BX.A1M(A0t2, it2);
                                }
                                if (AnonymousClass8BR.A06(A0t2) < 1) {
                                    StringBuilder A103 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1K(str4, A103, A0t2);
                                    throw C198999zG.A01(A103);
                                } else if (AnonymousClass8BR.A06(A0t2) <= 1) {
                                    this.A02 = A0t2.get(0);
                                    String[] A1b3 = C17880vN.A1b("bot", CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, 2, 1);
                                    C29621ca A0L2 = r5.A0L(A1b3[0]);
                                    String str5 = A1b3[1];
                                    List A0R4 = A0L2.A0R(str5);
                                    ArrayList A0t3 = C108965cb.A0t(A0R4);
                                    Iterator it3 = A0R4.iterator();
                                    while (it3.hasNext()) {
                                        AnonymousClass8BX.A1M(A0t3, it3);
                                    }
                                    if (AnonymousClass8BR.A06(A0t3) < 1) {
                                        StringBuilder A104 = AnonymousClass000.A10();
                                        AnonymousClass8BY.A1K(str5, A104, A0t3);
                                        throw C198999zG.A01(A104);
                                    } else if (AnonymousClass8BR.A06(A0t3) <= 1) {
                                        this.A01 = A0t3.get(0);
                                        return;
                                    } else {
                                        StringBuilder A105 = AnonymousClass000.A10();
                                        AnonymousClass8BY.A1J(str5, A105, A0t3);
                                        throw C198999zG.A01(A105);
                                    }
                                } else {
                                    StringBuilder A106 = AnonymousClass000.A10();
                                    AnonymousClass8BY.A1J(str4, A106, A0t2);
                                    throw C198999zG.A01(A106);
                                }
                            }
                        }
                        A0u = A10.toString();
                        A0s.A00 = A0u;
                        throw AnonymousClass1UI.A01(A0u);
                    }
                    throw AnonymousClass1O9.A00(A0s);
                }
                throw AnonymousClass1O9.A00(A0s);
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }

    public AnonymousClass9FO(C29621ca r28, AnonymousClass9F7 r29) {
        AnonymousClass9F7 r3 = r29;
        C18070vi.A0d(r3, 2);
        C29621ca r4 = r28;
        C108945cZ.A1N(r4);
        C29621ca r11 = (C29621ca) r3.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = {"from"};
        Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
        String[] strArr2 = new String[1];
        Long A0Z = AnonymousClass8BW.A0Z("to", strArr2, 0);
        Long A0j = AnonymousClass8BU.A0j();
        Object A052 = A0s.A05(r11, cls, A0Z, A0j, (Object) null, strArr2, false);
        if (A052 != null) {
            Object A053 = A0s.A05(r4, cls, A0Z, A0j, A052, strArr, true);
            if (A053 != null) {
                this.A00 = A053;
                String[] strArr3 = {PublicKeyCredentialControllerUtility.JSON_KEY_ID};
                Class<String> cls2 = String.class;
                Object A054 = A0s.A05(r11, cls2, A0Z, A0j, (Object) null, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID}, false);
                if (A054 != null) {
                    String str = (String) A0s.A05(r4, cls2, A0Z, A0j, A054, strArr3, true);
                    if (str != null) {
                        this.A05 = str;
                        if (A0s.A05(r4, cls2, A0Z, A0j, "result", AnonymousClass8BS.A1a(1, 0), false) != null) {
                            A97 a97 = A97.A00;
                            this.A01 = A0s.A02(r4, new C21284AhV(a97, 11), new String[]{"sub_group_suggestions_action", "approve"});
                            this.A04 = A0s.A02(r4, new C21284AhV(a97, 12), new String[]{"sub_group_suggestions_action", "reject"});
                            this.A02 = A0s.A02(r4, new C21284AhV(a97, 13), new String[]{"sub_group_suggestions_action", "cancel"});
                            this.A00 = r4;
                            new AnonymousClass9SE
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d7: CONSTRUCTOR  (r0v9 ? I:X.9SE) =  call: X.9SE.<init>():void type: CONSTRUCTOR in method: X.9FO.<init>(X.1ca, X.9F7):void, dex: classes5.dex
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
                                	... 64 more
                                */
                            /*
                                this = this;
                                r1 = 1
                                r0 = 2
                                r3 = r29
                                X.C18070vi.A0d(r3, r0)
                                r2 = r27
                                r2.<init>()
                                java.lang.String r24 = "result"
                                r4 = r28
                                X.C108945cZ.A1N(r4)
                                java.lang.Object r11 = r3.A00
                                X.1ca r11 = (X.C29621ca) r11
                                X.2rm r10 = X.AnonymousClass8BR.A0s()
                                java.lang.String[] r7 = new java.lang.String[r1]
                                java.lang.String r5 = "from"
                                r3 = 0
                                r7[r3] = r5
                                java.lang.Class<X.1EC> r12 = X.AnonymousClass1EC.class
                                java.lang.String[] r6 = new java.lang.String[r1]
                                java.lang.String r5 = "to"
                                java.lang.Long r13 = X.AnonymousClass8BW.A0Z(r5, r6, r3)
                                java.lang.Long r14 = X.AnonymousClass8BU.A0j()
                                r15 = 0
                                r17 = r3
                                r16 = r6
                                java.lang.Object r21 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
                                if (r21 == 0) goto L_0x00f9
                                r16 = r10
                                r17 = r4
                                r18 = r12
                                r19 = r13
                                r20 = r14
                                r22 = r7
                                r23 = r1
                                java.lang.Object r5 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
                                if (r5 == 0) goto L_0x00f4
                                r2.A00 = r5
                                java.lang.String[] r7 = new java.lang.String[r1]
                                java.lang.String r6 = "id"
                                r7[r3] = r6
                                java.lang.Class<java.lang.String> r12 = java.lang.String.class
                                java.lang.String[] r5 = new java.lang.String[r1]
                                r5[r3] = r6
                                r16 = r5
                                r17 = r3
                                java.lang.Object r15 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
                                if (r15 == 0) goto L_0x00ef
                                r11 = r4
                                r16 = r7
                                r17 = r1
                                java.lang.Object r5 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
                                java.lang.String r5 = (java.lang.String) r5
                                if (r5 == 0) goto L_0x00ea
                                r2.A05 = r5
                                java.lang.String[] r25 = X.AnonymousClass8BS.A1a(r1, r3)
                                r19 = r10
                                r20 = r4
                                r21 = r12
                                r22 = r13
                                r23 = r14
                                r26 = r3
                                java.lang.Object r5 = r19.A05(r20, r21, r22, r23, r24, r25, r26)
                                if (r5 == 0) goto L_0x00e5
                                X.A97 r8 = X.A97.A00
                                java.lang.String[] r7 = new java.lang.String[r0]
                                java.lang.String r9 = "sub_group_suggestions_action"
                                r7[r3] = r9
                                java.lang.String r5 = "approve"
                                r7[r1] = r5
                                r6 = 11
                                X.AhV r5 = new X.AhV
                                r5.<init>(r8, r6)
                                java.lang.Object r5 = r10.A02(r4, r5, r7)
                                r2.A01 = r5
                                java.lang.String[] r7 = new java.lang.String[r0]
                                r7[r3] = r9
                                java.lang.String r5 = "reject"
                                r7[r1] = r5
                                r6 = 12
                                X.AhV r5 = new X.AhV
                                r5.<init>(r8, r6)
                                java.lang.Object r5 = r10.A02(r4, r5, r7)
                                r2.A04 = r5
                                java.lang.String[] r6 = new java.lang.String[r0]
                                r6[r3] = r9
                                java.lang.String r0 = "cancel"
                                r6[r1] = r0
                                r5 = 13
                                X.AhV r0 = new X.AhV
                                r0.<init>(r8, r5)
                                java.lang.Object r0 = r10.A02(r4, r0, r6)
                                r2.A02 = r0
                                r2.A00 = r4
                                java.lang.String[] r1 = new java.lang.String[r1]
                                r1[r3] = r9
                                X.9SE r0 = new X.9SE
                                r0.<init>()
                                java.util.ArrayList r0 = X.C29601cY.A00(r4, r1)
                                java.lang.Object r0 = r0.get(r3)
                                r2.A03 = r0
                                return
                            L_0x00e5:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r10)
                                throw r0
                            L_0x00ea:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r10)
                                throw r0
                            L_0x00ef:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r10)
                                throw r0
                            L_0x00f4:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r10)
                                throw r0
                            L_0x00f9:
                                X.1UI r0 = X.AnonymousClass1O9.A00(r10)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FO.<init>(X.1ca, X.9F7):void");
                        }
                    }
