package X;

import android.content.Context;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import java.util.List;

/* renamed from: X.8yi  reason: invalid class name and case insensitive filesystem */
public final class C175438yi extends C20992Ack {
    public final /* synthetic */ BBZ A00;
    public final /* synthetic */ BrazilIncomeCollectionViewModel A01;
    public final /* synthetic */ AnonymousClass9F6 A02;

    /* JADX WARNING: type inference failed for: r0v18, types: [X.6UJ, java.lang.Object] */
    public void A06(C29621ca r23) {
        List<AnonymousClass9DK> list;
        BBZ bbz;
        AnonymousClass1QD r1;
        long j;
        String str;
        String A0y;
        C29621ca r15 = r23;
        C18070vi.A0d(r15, 0);
        AnonymousClass9F6 r0 = this.A02;
        C18070vi.A0d(r0, 2);
        C108945cZ.A1N(r15);
        Object obj = r0.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        String[] strArr = new String[2];
        strArr[0] = "0";
        String A07 = A0s.A07(r15, C18070vi.A0O("1", strArr, 1), new String[]{"account", "is_income_already_collected"});
        if (A07 != null) {
            Number number = (Number) A0s.A05(r15, Long.TYPE, 1577865600L, 4102473600L, (Object) null, new String[]{"account", "income_collection_ts"}, false);
            if (AnonymousClass8BY.A0W(r15, A0s, "br-get-info-for-income-collection", new String[]{"account", "action"}, false) != null) {
                A8Z a8z = A8Z.A00;
                if (A0s.A03(r15, new C21290Ahb(obj, a8z, 22), new String[0]) != null) {
                    AnonymousClass9DN r2 = (AnonymousClass9DN) A0s.A02(r15, new C21159AfU(a8z, 0), new String[]{"account", "income_ranges"});
                    new AnonymousClass9S8
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0095: CONSTRUCTOR  (r0v9 ? I:X.9S8) =  call: X.9S8.<init>():void type: CONSTRUCTOR in method: X.8yi.A06(X.1ca):void, dex: classes5.dex
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
                        	... 44 more
                        */
                    /*
                        this = this;
                        r7 = 0
                        r15 = r23
                        X.C18070vi.A0d(r15, r7)
                        r6 = r22
                        X.9F6 r0 = r6.A02
                        r8 = 1
                        r1 = 2
                        X.C18070vi.A0d(r0, r1)
                        java.lang.String r10 = "br-get-info-for-income-collection"
                        X.C108945cZ.A1N(r15)
                        java.lang.Object r0 = r0.A00
                        X.2rm r14 = X.AnonymousClass8BR.A0s()
                        java.lang.String[] r3 = new java.lang.String[r1]
                        java.lang.String r2 = "0"
                        r3[r7] = r2
                        java.lang.String r9 = "1"
                        java.util.List r4 = X.C18070vi.A0O(r9, r3, r8)
                        java.lang.String[] r3 = new java.lang.String[r1]
                        java.lang.String r13 = "account"
                        r3[r7] = r13
                        java.lang.String r2 = "is_income_already_collected"
                        r3[r8] = r2
                        java.lang.String r4 = r14.A07(r15, r4, r3)
                        if (r4 == 0) goto L_0x02b3
                        java.lang.String[] r2 = new java.lang.String[r1]
                        r2[r7] = r13
                        java.lang.String r3 = "income_collection_ts"
                        r2[r8] = r3
                        java.lang.Class r16 = java.lang.Long.TYPE
                        r11 = 1577865600(0x5e0c5180, double:7.795691867E-315)
                        java.lang.Long r17 = java.lang.Long.valueOf(r11)
                        r11 = 4102473600(0xf486c780, double:2.0268912687E-314)
                        java.lang.Long r18 = java.lang.Long.valueOf(r11)
                        r5 = 0
                        r19 = r5
                        r20 = r2
                        r21 = r7
                        java.lang.Object r3 = r14.A05(r15, r16, r17, r18, r19, r20, r21)
                        java.lang.Number r3 = (java.lang.Number) r3
                        java.lang.String[] r11 = new java.lang.String[r1]
                        r11[r7] = r13
                        java.lang.String r2 = "action"
                        r11[r8] = r2
                        java.lang.Object r2 = X.AnonymousClass8BY.A0W(r15, r14, r10, r11, r7)
                        if (r2 == 0) goto L_0x02ae
                        X.A8Z r2 = X.A8Z.A00
                        r11 = 22
                        X.Ahb r10 = new X.Ahb
                        r10.<init>(r0, r2, r11)
                        java.lang.String[] r0 = new java.lang.String[r7]
                        java.lang.Object r0 = r14.A03(r15, r10, r0)
                        if (r0 == 0) goto L_0x02a9
                        java.lang.String[] r1 = new java.lang.String[r1]
                        r1[r7] = r13
                        java.lang.String r0 = "income_ranges"
                        r1[r8] = r0
                        X.AfU r0 = new X.AfU
                        r0.<init>(r2, r7)
                        java.lang.Object r2 = r14.A02(r15, r0, r1)
                        X.9DN r2 = (X.AnonymousClass9DN) r2
                        java.lang.String[] r1 = new java.lang.String[r8]
                        r1[r7] = r13
                        X.9S8 r0 = new X.9S8
                        r0.<init>()
                        X.AnonymousClass8BS.A1A(r15, r1)
                        r10 = 0
                        if (r2 == 0) goto L_0x0248
                        java.lang.Object r8 = r2.A01
                        java.util.List r8 = (java.util.List) r8
                    L_0x00a2:
                        boolean r0 = r4.equals(r9)
                        if (r0 == 0) goto L_0x01dc
                        com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel r0 = r6.A01
                        X.1QD r1 = r0.A02
                        java.lang.String r0 = "collected"
                        r1.A0N(r0)
                        X.BBZ r3 = r6.A00
                    L_0x00b3:
                        android.content.SharedPreferences r1 = r1.A03()
                        java.lang.String r0 = "pref_income_verification_state"
                        java.lang.String r2 = "not_required"
                        java.lang.String r1 = r1.getString(r0, r2)
                        X.C18070vi.A0X(r1)
                        X.AaX r3 = (X.C20855AaX) r3
                        java.lang.String r0 = "collected"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L_0x029a
                        boolean r0 = r1.equals(r2)
                        if (r0 != 0) goto L_0x029a
                        java.lang.String r0 = "pending"
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L_0x0296
                        if (r10 == 0) goto L_0x0296
                        com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05 = r10
                        java.lang.Object r2 = r3.A02
                        com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r2 = (com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet) r2
                        java.lang.Object r3 = r3.A01
                        android.view.View r3 = (android.view.View) r3
                        r0 = 2131431605(0x7f0b10b5, float:1.8484944E38)
                        android.view.View r1 = r3.findViewById(r0)
                        android.view.ViewStub r1 = (android.view.ViewStub) r1
                        if (r1 == 0) goto L_0x029d
                        r0 = 2131626316(0x7f0e094c, float:1.8879865E38)
                        r1.setLayoutResource(r0)
                        X.1bI r0 = new X.1bI
                        r0.<init>(r1)
                        android.view.View r6 = r0.A02()
                        X.C18070vi.A0X(r6)
                        r0 = 2131431109(0x7f0b0ec5, float:1.8483938E38)
                        android.view.View r1 = X.C18070vi.A05(r3, r0)
                        r0 = 8
                        r1.setVisibility(r0)
                        r0 = 2131431608(0x7f0b10b8, float:1.848495E38)
                        android.view.View r8 = X.C18070vi.A05(r6, r0)
                        android.widget.RadioGroup r8 = (android.widget.RadioGroup) r8
                        java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
                        int r11 = r0.size()
                        r10 = 0
                    L_0x011f:
                        if (r10 >= r11) goto L_0x0251
                        android.content.Context r0 = r6.getContext()
                        android.widget.RadioButton r9 = new android.widget.RadioButton
                        r9.<init>(r0)
                        r9.setId(r10)
                        java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
                        java.lang.Object r0 = X.AnonymousClass8BS.A0Z(r0, r10)
                        X.6UJ r0 = (X.AnonymousClass6UJ) r0
                        X.C18070vi.A0d(r0, r7)
                        long r3 = r0.A00
                        r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                        int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                        if (r1 != 0) goto L_0x019f
                        r4 = 2131887365(0x7f120505, float:1.9409335E38)
                        java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
                        X.1R2 r13 = r2.A03
                        if (r13 == 0) goto L_0x024b
                        X.1KJ r12 = X.AnonymousClass1KL.A0A
                        long r0 = r0.A01
                        java.math.BigDecimal r14 = new java.math.BigDecimal
                        r14.<init>(r0)
                        X.1KN r1 = new X.1KN
                        r1.<init>(r14, r7)
                        X.0vb r0 = r13.A05
                        java.lang.String r0 = r12.BLc(r0, r1)
                        java.lang.String r0 = X.AnonymousClass3MX.A16(r2, r0, r3, r7, r4)
                        X.C18070vi.A0X(r0)
                    L_0x0169:
                        r9.setText(r0)
                        r0 = 1098907648(0x41800000, float:16.0)
                        r9.setTextSize(r0)
                        r3 = -1
                        r1 = -2
                        android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
                        r0.<init>(r3, r1)
                        r9.setLayoutParams(r0)
                        r0 = 1
                        r9.setLayoutDirection(r0)
                        android.content.Context r0 = r6.getContext()
                        r3 = 1094713344(0x41400000, float:12.0)
                        int r1 = X.C62762rw.A01(r0, r3)
                        android.content.Context r0 = r6.getContext()
                        int r0 = X.C62762rw.A01(r0, r3)
                        r9.setPadding(r7, r1, r7, r0)
                        r0 = 16
                        r9.setGravity(r0)
                        r8.addView(r9)
                        int r10 = r10 + 1
                        goto L_0x011f
                    L_0x019f:
                        java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
                        X.1R2 r15 = r2.A03
                        if (r15 == 0) goto L_0x024b
                        X.1KJ r13 = X.AnonymousClass1KL.A0A
                        long r0 = r0.A01
                        java.math.BigDecimal r14 = new java.math.BigDecimal
                        r14.<init>(r0)
                        X.1KN r1 = new X.1KN
                        r1.<init>(r14, r7)
                        X.0vb r0 = r15.A05
                        java.lang.String r0 = r13.BLc(r0, r1)
                        r12.append(r0)
                        java.lang.String r0 = " - "
                        r12.append(r0)
                        X.1R2 r14 = r2.A03
                        if (r14 == 0) goto L_0x024b
                        java.math.BigDecimal r0 = new java.math.BigDecimal
                        r0.<init>(r3)
                        X.1KN r1 = new X.1KN
                        r1.<init>(r0, r7)
                        X.0vb r0 = r14.A05
                        java.lang.String r0 = r13.BLc(r0, r1)
                        java.lang.String r0 = X.AnonymousClass000.A0y(r0, r12)
                        goto L_0x0169
                    L_0x01dc:
                        if (r3 == 0) goto L_0x0208
                        com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel r9 = r6.A01
                        X.0z4 r10 = r9.A01
                        java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                        long r0 = r3.longValue()
                        long r1 = r2.toMillis(r0)
                        java.lang.String r0 = "payments_income_collection_timestamp"
                        r10.A1q(r0, r1)
                        long r3 = java.lang.System.currentTimeMillis()
                        long r1 = r10.A0W(r0)
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        boolean r0 = X.C108975cc.A19(r0)
                        X.1QD r1 = r9.A02
                        if (r0 == 0) goto L_0x023f
                        java.lang.String r0 = "not_required"
                    L_0x0205:
                        r1.A0N(r0)
                    L_0x0208:
                        if (r8 == 0) goto L_0x029e
                        com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel r9 = r6.A01
                        java.util.ArrayList r10 = X.AnonymousClass000.A13()
                        java.util.Iterator r8 = r8.iterator()
                    L_0x0214:
                        boolean r0 = r8.hasNext()
                        if (r0 == 0) goto L_0x0242
                        java.lang.Object r0 = r8.next()
                        X.9DK r0 = (X.AnonymousClass9DK) r0
                        long r3 = r0.A00
                        java.lang.Object r0 = r0.A01
                        java.lang.Number r0 = (java.lang.Number) r0
                        if (r0 == 0) goto L_0x0239
                        long r1 = r0.longValue()
                    L_0x022c:
                        X.6UJ r0 = new X.6UJ
                        r0.<init>()
                        r0.A01 = r3
                        r0.A00 = r1
                        r10.add(r0)
                        goto L_0x0214
                    L_0x0239:
                        r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                        goto L_0x022c
                    L_0x023f:
                        java.lang.String r0 = "pending"
                        goto L_0x0205
                    L_0x0242:
                        X.BBZ r3 = r6.A00
                        X.1QD r1 = r9.A02
                        goto L_0x00b3
                    L_0x0248:
                        r8 = r5
                        goto L_0x00a2
                    L_0x024b:
                        java.lang.String r0 = "paymentsUtils"
                        X.C18070vi.A11(r0)
                        throw r5
                    L_0x0251:
                        java.lang.String r3 = r2.A04
                        X.BD4 r1 = r2.A00
                        if (r1 != 0) goto L_0x025d
                        java.lang.String r0 = "paymentFieldStatsLogger"
                        X.C18070vi.A11(r0)
                        throw r5
                    L_0x025d:
                        java.lang.String r0 = "income_collection_prompt"
                        X.C20087A6p.A03(r5, r1, r0, r3)
                        r0 = 2131431606(0x7f0b10b6, float:1.8484946E38)
                        android.view.View r3 = X.C18070vi.A05(r6, r0)
                        com.whatsapp.WaButtonWithLoader r3 = (com.whatsapp.WaButtonWithLoader) r3
                        r0 = 2131887363(0x7f120503, float:1.940933E38)
                        r3.setButtonText((int) r0)
                        r3.setEnabled(r7)
                        r1 = 2
                        X.79S r0 = new X.79S
                        r0.<init>(r3, r1)
                        r8.setOnCheckedChangeListener(r0)
                        r3.A01()
                        r1 = 24
                        X.78A r0 = new X.78A
                        r0.<init>(r3, r2, r8, r1)
                        r3.A00 = r0
                        r0 = 2131428391(0x7f0b0427, float:1.8478425E38)
                        android.view.View r1 = X.C18070vi.A05(r6, r0)
                        r0 = 48
                        X.AnonymousClass3Ma.A19(r1, r2, r0)
                        return
                    L_0x0296:
                        r3.Bsl()
                        return
                    L_0x029a:
                        r3.Bvq()
                    L_0x029d:
                        return
                    L_0x029e:
                        java.lang.String r0 = "PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onResponseSuccess: income ranges are empty"
                        com.whatsapp.util.Log.i((java.lang.String) r0)
                        X.BBZ r0 = r6.A00
                        r0.Bsl()
                        return
                    L_0x02a9:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r14)
                        throw r0
                    L_0x02ae:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r14)
                        throw r0
                    L_0x02b3:
                        X.1UI r0 = X.AnonymousClass1O9.A00(r14)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C175438yi.A06(X.1ca):void");
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C175438yi(Context context, AnonymousClass1KB r2, C33711jG r3, BBZ bbz, BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel, AnonymousClass9F6 r6) {
                    super(context, r3, r2);
                    this.A00 = bbz;
                    this.A02 = r6;
                    this.A01 = brazilIncomeCollectionViewModel;
                }

                public void A04(A7B a7b) {
                    C17900vP.A0Y(a7b, "PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onRequestError: ", C18070vi.A0K(a7b));
                    this.A00.Bsl();
                }

                public void A05(A7B a7b) {
                    C17900vP.A0Y(a7b, "PAY: BrazilSaveIncomeInformationAction/getIncomeCollectionInfo onResponseError: ", C18070vi.A0K(a7b));
                    this.A00.Bsl();
                }
            }
