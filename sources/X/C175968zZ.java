package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8zZ  reason: invalid class name and case insensitive filesystem */
public class C175968zZ extends C175498yo {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175968zZ(Context context, AnonymousClass1KB r8, C33711jG r9, C196259ui r10, C175708z9 r11, AnonymousClass9YQ r12, Integer num, int i) {
        super(context, r8, r9, r10, "get-order-transaction");
        this.A00 = i;
        this.A03 = r11;
        this.A02 = num;
        this.A01 = r12;
    }

    public static void A02(A7B a7b, C175968zZ r2, C194009r1 r3, Integer num) {
        r3.A01(a7b, num, "get-order-transaction");
        AnonymousClass9YQ r32 = (AnonymousClass9YQ) r2.A01;
        r32.A00.runOnUiThread(new C21447AkE(r32, 25));
    }

    public void A04(A7B a7b) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(a7b, 0);
                super.A04(a7b);
                A02(a7b, this, AnonymousClass8BR.A0b(((C175708z9) this.A03).A0A), (Integer) this.A02);
                return;
            case 1:
                ((C175658z4) this.A01).A03.Bi4(a7b, 23);
                super.A04(a7b);
                ((C189679jd) this.A03).A00((AEC) this.A02, a7b);
                return;
            case 2:
                super.A04(a7b);
                AnonymousClass8BR.A0b(((C175698z8) this.A01).A08).A01(a7b, (Integer) this.A03, "upi-get-p2m-config");
                ((C22449B8h) this.A02).C3t(a7b, (AnonymousClass9NV) null);
                return;
            case 3:
                return;
            case 4:
                super.A04(a7b);
                ((C22451B8j) this.A02).Bzl(a7b);
                return;
            case 5:
                super.A04(a7b);
                ((C175788zH) this.A01).A02.A02.A01(a7b, (Integer) this.A03, "upi-send-to-vpa");
                ((C22452B8k) this.A02).C0D(a7b);
                return;
            default:
                super.A04(a7b);
                return;
        }
    }

    public void A05(A7B a7b) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(a7b, 0);
                super.A05(a7b);
                A02(a7b, this, AnonymousClass8BR.A0b(((C175708z9) this.A03).A0A), (Integer) this.A02);
                return;
            case 1:
                ((C175658z4) this.A01).A03.Bi4(a7b, 23);
                super.A05(a7b);
                ((C189679jd) this.A03).A00((AEC) this.A02, a7b);
                return;
            case 2:
                super.A05(a7b);
                AnonymousClass8BR.A0b(((C175698z8) this.A01).A08).A01(a7b, (Integer) this.A03, "upi-get-p2m-config");
                ((C22449B8h) this.A02).C3t(a7b, (AnonymousClass9NV) null);
                return;
            case 3:
                return;
            case 4:
                super.A05(a7b);
                ((C22451B8j) this.A02).Bzl(a7b);
                return;
            case 5:
                super.A05(a7b);
                ((C175788zH) this.A01).A02.A02.A01(a7b, (Integer) this.A03, "upi-send-to-vpa");
                ((C22452B8k) this.A02).C0D(a7b);
                return;
            default:
                super.A05(a7b);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v36, types: [X.9NV, java.lang.Object] */
    public void A06(C29621ca r28) {
        String str;
        Throwable th;
        C29621ca A0K;
        C29621ca r3 = r28;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r3, 0);
                super.A06(r3);
                try {
                    C175708z9 r6 = (C175708z9) this.A03;
                    ArrayList A04 = r6.A06.A04((C21522AlV) null, r3);
                    if (A04 == null || A04.size() <= 0) {
                        AnonymousClass8BR.A0b(r6.A0A).A02((Integer) this.A02, "get-order-transaction", 2);
                        ((AnonymousClass9YQ) this.A01).A00.CEx();
                        return;
                    }
                    C176028zf r2 = new C176028zf();
                    r2.A01 = A04;
                    r6.A05.A03(r2);
                    AnonymousClass8BR.A0b(r6.A0A).A02((Integer) this.A02, "get-order-transaction", 2);
                    AnonymousClass9YQ r7 = (AnonymousClass9YQ) this.A01;
                    Object obj = A04.get(0);
                    if (obj != null) {
                        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = r7.A00;
                        indiaUpiCheckOrderDetailsActivity.A04.A00(indiaUpiCheckOrderDetailsActivity.A09.A06, new C20873Aap(obj, 3), indiaUpiCheckOrderDetailsActivity.A07);
                    }
                    r7.A00.CEx();
                    return;
                } catch (AnonymousClass1UI unused) {
                    Log.e("PAY: IndiaUpiP2mGetOrderTransactionAction/getOrderTransaction: invalid response message");
                    A02(A7B.A00(), this, AnonymousClass8BR.A0b(((C175708z9) this.A03).A0A), (Integer) this.A02);
                    return;
                }
            case 1:
                C175658z4 r5 = (C175658z4) this.A01;
                r5.A03.Bi4((A7B) null, 23);
                super.A06(r3);
                C29621ca A0j = AnonymousClass8BR.A0j(r3);
                if (A0j != null && (A0K = A0j.A0K("alias")) != null) {
                    C189679jd r22 = (C189679jd) this.A03;
                    try {
                        r22.A00(C175498yo.A00(A0K), (A7B) null);
                        return;
                    } catch (AnonymousClass1UI unused2) {
                        r5.A04.A05("onDeregisterVpaAlias/onResponseSuccess/corrupt stream exception");
                        r22.A00((AEC) null, new A7B(500));
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                try {
                    C29621ca A0L = r3.A0L("account");
                    String A0P = A0L.A0P("mcc");
                    String A0P2 = A0L.A0P("receiver-vpa");
                    String A0Q = A0L.A0Q("payee-name", (String) null);
                    String A0Q2 = A0L.A0Q("purpose-code", (String) null);
                    C175698z8 r32 = (C175698z8) this.A01;
                    C29621ca A0K2 = A0L.A0K("l2checkout");
                    if (A0K2 != null) {
                        str = A0K2.A0Q("merchant-public-key", (String) null);
                    } else {
                        str = null;
                    }
                    AnonymousClass8BR.A0b(r32.A08).A02((Integer) this.A03, "upi-get-p2m-config", 2);
                    ? obj2 = new Object();
                    obj2.A00 = A0P;
                    obj2.A04 = A0P2;
                    obj2.A02 = A0Q;
                    obj2.A03 = A0Q2;
                    obj2.A05 = null;
                    obj2.A01 = str;
                    ((C22449B8h) this.A02).C3t((A7B) null, obj2);
                    return;
                } catch (AnonymousClass1UI unused3) {
                    A7B A002 = A7B.A00();
                    AnonymousClass8BR.A0b(((C175698z8) this.A01).A08).A01(A002, (Integer) this.A03, "upi-get-p2m-config");
                    ((C22449B8h) this.A02).C3t(A002, (AnonymousClass9NV) null);
                    return;
                }
            case 3:
                try {
                    AnonymousClass9F6 r4 = (AnonymousClass9F6) this.A03;
                    int A0G = C72453Mb.A0G(r3, r4, 1);
                    C29621ca A003 = AnonymousClass9F6.A00(r3, r4);
                    C62672rm A0s = AnonymousClass8BR.A0s();
                    String[] strArr = new String[A0G];
                    strArr[0] = "account";
                    strArr[1] = "action";
                    Class<String> cls = String.class;
                    String[] strArr2 = new String[A0G];
                    strArr2[0] = "account";
                    Long A0Z = AnonymousClass8BW.A0Z("action", strArr2, 1);
                    Long A0j2 = AnonymousClass8BU.A0j();
                    Object A05 = A0s.A05(A003, cls, A0Z, A0j2, (Object) null, strArr2, false);
                    if (A05 != null) {
                        C62672rm r19 = A0s;
                        C29621ca r20 = r3;
                        Long l = A0Z;
                        Long l2 = A0j2;
                        if (r19.A05(r20, cls, l, l2, A05, strArr, true) != null) {
                            String[] strArr3 = new String[A0G];
                            strArr3[0] = "account";
                            strArr3[1] = "key-version";
                            Class cls2 = Long.TYPE;
                            Number number = (Number) r19.A05(r20, cls2, l, l2, (Object) null, strArr3, false);
                            if (number != null) {
                                long longValue = number.longValue();
                                String[] strArr4 = new String[A0G];
                                strArr4[0] = "account";
                                strArr4[1] = "expiry-ts";
                                Long A0L2 = C17890vO.A0L();
                                if (r19.A05(r20, cls2, A0L2, l2, (Object) null, strArr4, false) != null) {
                                    String[] strArr5 = new String[A0G];
                                    strArr5[0] = "account";
                                    strArr5[1] = "server-ts";
                                    Number number2 = (Number) r19.A05(r20, cls2, A0L2, l2, (Object) null, strArr5, false);
                                    if (number2 != null) {
                                        long longValue2 = number2.longValue();
                                        String[] strArr6 = new String[A0G];
                                        strArr6[0] = "account";
                                        strArr6[1] = "purpose-enc-certificate";
                                        Class<String> cls3 = cls;
                                        if (r19.A05(r20, cls3, C108975cc.A0X(), AnonymousClass8BV.A0l(), (Object) null, strArr6, false) != null) {
                                            String[] strArr7 = new String[A0G];
                                            strArr7[0] = "account";
                                            strArr7[1] = "data";
                                            Long l3 = A0Z;
                                            Long l4 = A0j2;
                                            String str2 = (String) r19.A05(r20, cls3, l3, l4, (Object) null, strArr7, false);
                                            if (str2 != null) {
                                                String[] strArr8 = new String[A0G];
                                                strArr8[0] = "account";
                                                strArr8[1] = PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
                                                if (r19.A05(r20, cls3, l3, l4, (Object) null, strArr8, false) == null) {
                                                    th = AnonymousClass1O9.A00(A0s);
                                                } else if (C21290Ahb.A00(A003, A5x.A00, 32).BCF(r3, A0s) != null) {
                                                    new AnonymousClass9SB
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ce: CONSTRUCTOR  (r1v44 ? I:X.9SB) =  call: X.9SB.<init>():void type: CONSTRUCTOR in method: X.8zZ.A06(X.1ca):void, dex: classes5.dex
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
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
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
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v44 ?
                                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                                        	... 81 more
                                                        */
                                                    /*
                                                        this = this;
                                                        r0 = r27
                                                        int r1 = r0.A00
                                                        r3 = r28
                                                        switch(r1) {
                                                            case 0: goto L_0x02be;
                                                            case 1: goto L_0x000d;
                                                            case 2: goto L_0x0244;
                                                            case 3: goto L_0x00eb;
                                                            case 4: goto L_0x004b;
                                                            case 5: goto L_0x0030;
                                                            default: goto L_0x0009;
                                                        }
                                                    L_0x0009:
                                                        super.A06(r3)
                                                    L_0x000c:
                                                        return
                                                    L_0x000d:
                                                        java.lang.Object r5 = r0.A01
                                                        X.8z4 r5 = (X.C175658z4) r5
                                                        X.AZ6 r2 = r5.A03
                                                        r1 = 23
                                                        r4 = 0
                                                        r2.Bi4(r4, r1)
                                                        super.A06(r3)
                                                        X.1ca r2 = X.AnonymousClass8BR.A0j(r3)
                                                        if (r2 == 0) goto L_0x000c
                                                        java.lang.String r1 = "alias"
                                                        X.1ca r1 = r2.A0K(r1)
                                                        if (r1 == 0) goto L_0x000c
                                                        java.lang.Object r2 = r0.A03
                                                        X.9jd r2 = (X.C189679jd) r2
                                                        goto L_0x0349
                                                    L_0x0030:
                                                        super.A06(r3)
                                                        java.lang.Object r1 = r0.A01
                                                        X.8zH r1 = (X.C175788zH) r1
                                                        X.90Z r3 = r1.A02
                                                        java.lang.Object r2 = r0.A03
                                                        java.lang.Integer r2 = (java.lang.Integer) r2
                                                        java.lang.String r1 = "upi-send-to-vpa"
                                                        r3.A04(r2, r1)
                                                        java.lang.Object r1 = r0.A02
                                                        X.B8k r1 = (X.C22452B8k) r1
                                                        r0 = 0
                                                        r1.C0D(r0)
                                                        return
                                                    L_0x004b:
                                                        super.A06(r3)
                                                        java.lang.Object r2 = r0.A03     // Catch:{ 1UI -> 0x00da }
                                                        X.9F5 r2 = (X.AnonymousClass9F5) r2     // Catch:{ 1UI -> 0x00da }
                                                        r1 = 8
                                                        X.9FP r5 = new X.9FP     // Catch:{ 1UI -> 0x00da }
                                                        r5.<init>((X.C29621ca) r3, (X.AnonymousClass9F5) r2, (int) r1)     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.Object r6 = r0.A02     // Catch:{ 1UI -> 0x00da }
                                                        X.B8j r6 = (X.C22451B8j) r6     // Catch:{ 1UI -> 0x00da }
                                                        X.91M r6 = (X.AnonymousClass91M) r6     // Catch:{ 1UI -> 0x00da }
                                                        X.8pN r4 = r6.A00     // Catch:{ 1UI -> 0x00da }
                                                        r3 = 0
                                                        r2 = 16
                                                        X.AZ6 r1 = r6.A0S     // Catch:{ 1UI -> 0x00da }
                                                        r1.A09(r4, r3, r2)     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r1 = X.AXS.A01(r6)     // Catch:{ 1UI -> 0x00da }
                                                        r6.A02 = r1     // Catch:{ 1UI -> 0x00da }
                                                        X.9ui r2 = r6.A04     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r1 = "upi-get-credential"
                                                        r2.A01(r1)     // Catch:{ 1UI -> 0x00da }
                                                        r6.CEx()     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r10 = r6.A02     // Catch:{ 1UI -> 0x00da }
                                                        boolean r1 = r6 instanceof com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity     // Catch:{ 1UI -> 0x00da }
                                                        if (r1 == 0) goto L_0x009a
                                                        com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r6 = (com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity) r6     // Catch:{ 1UI -> 0x00da }
                                                        X.AXS r1 = r6.A0N     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r8 = r1.A0I()     // Catch:{ 1UI -> 0x00da }
                                                        X.8pN r1 = r6.A05     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r9 = r1.A0B     // Catch:{ 1UI -> 0x00da }
                                                        X.8pb r7 = r1.A08     // Catch:{ 1UI -> 0x00da }
                                                        X.8pS r7 = (X.AnonymousClass8pS) r7     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.Object r11 = X.C20284AEs.A02(r1)     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r11 = (java.lang.String) r11     // Catch:{ 1UI -> 0x00da }
                                                        r12 = 1
                                                        r6.A5C(r7, r8, r9, r10, r11, r12)     // Catch:{ 1UI -> 0x00da }
                                                        return
                                                    L_0x009a:
                                                        com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r6 = (com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity) r6     // Catch:{ 1UI -> 0x00da }
                                                        X.AXS r1 = r6.A0N     // Catch:{ 1UI -> 0x00da }
                                                        r1.A0M()     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.Object r2 = r5.A01     // Catch:{ 1UI -> 0x00da }
                                                        X.9Ci r2 = (X.C178239Ci) r2     // Catch:{ 1UI -> 0x00da }
                                                        if (r2 == 0) goto L_0x00af
                                                        java.lang.String r1 = r2.A01     // Catch:{ 1UI -> 0x00da }
                                                        r6.A06 = r1     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r1 = r2.A02     // Catch:{ 1UI -> 0x00da }
                                                        r6.A07 = r1     // Catch:{ 1UI -> 0x00da }
                                                    L_0x00af:
                                                        X.AXS r1 = r6.A0N     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r8 = r1.A0I()     // Catch:{ 1UI -> 0x00da }
                                                        X.8pN r1 = r6.A02     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r2 = "bankAccount"
                                                        if (r1 == 0) goto L_0x00d6
                                                        java.lang.String r9 = r1.A0B     // Catch:{ 1UI -> 0x00da }
                                                        X.8pb r7 = r1.A08     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
                                                        X.C18070vi.A0z(r7, r1)     // Catch:{ 1UI -> 0x00da }
                                                        X.8pS r7 = (X.AnonymousClass8pS) r7     // Catch:{ 1UI -> 0x00da }
                                                        X.8pN r1 = r6.A02     // Catch:{ 1UI -> 0x00da }
                                                        if (r1 == 0) goto L_0x00d6
                                                        java.lang.Object r11 = X.C20284AEs.A02(r1)     // Catch:{ 1UI -> 0x00da }
                                                        java.lang.String r11 = (java.lang.String) r11     // Catch:{ 1UI -> 0x00da }
                                                        r12 = 1
                                                        r13 = r12
                                                        r6.A5D(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 1UI -> 0x00da }
                                                        return
                                                    L_0x00d6:
                                                        X.C18070vi.A11(r2)     // Catch:{ 1UI -> 0x00da }
                                                        throw r3     // Catch:{ 1UI -> 0x00da }
                                                    L_0x00da:
                                                        java.lang.String r1 = "PAY: IndiaUpiOtpAction: could not parse generate-otp response"
                                                        com.whatsapp.util.Log.e((java.lang.String) r1)
                                                        java.lang.Object r1 = r0.A02
                                                        X.B8j r1 = (X.C22451B8j) r1
                                                        X.A7B r0 = X.A7B.A00()
                                                        r1.Bzl(r0)
                                                        return
                                                    L_0x00eb:
                                                        r16 = 0
                                                        java.lang.Object r4 = r0.A03     // Catch:{ 1UI -> 0x023e }
                                                        X.9F6 r4 = (X.AnonymousClass9F6) r4     // Catch:{ 1UI -> 0x023e }
                                                        r2 = 1
                                                        int r1 = X.C72453Mb.A0G(r3, r4, r2)     // Catch:{ 1UI -> 0x023e }
                                                        X.1ca r12 = X.AnonymousClass9F6.A00(r3, r4)     // Catch:{ 1UI -> 0x023e }
                                                        X.2rm r11 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r18 = 0
                                                        java.lang.String r10 = "account"
                                                        r6[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r5 = "action"
                                                        r6[r2] = r5     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Class<java.lang.String> r13 = java.lang.String.class
                                                        java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r4[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Long r14 = X.AnonymousClass8BW.A0Z(r5, r4, r2)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Long r15 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x023e }
                                                        r17 = r4
                                                        java.lang.Object r24 = r11.A05(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 1UI -> 0x023e }
                                                        if (r24 == 0) goto L_0x0232
                                                        r19 = r11
                                                        r20 = r3
                                                        r21 = r13
                                                        r22 = r14
                                                        r23 = r15
                                                        r25 = r6
                                                        r26 = r2
                                                        java.lang.Object r4 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        if (r4 == 0) goto L_0x022d
                                                        java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r5[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r4 = "key-version"
                                                        r5[r2] = r4     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Class r21 = java.lang.Long.TYPE     // Catch:{ 1UI -> 0x023e }
                                                        r24 = r16
                                                        r25 = r5
                                                        r26 = r18
                                                        java.lang.Object r4 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ 1UI -> 0x023e }
                                                        if (r4 == 0) goto L_0x0228
                                                        long r7 = r4.longValue()     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r4[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r5 = "expiry-ts"
                                                        r4[r2] = r5     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Long r22 = X.C17890vO.A0L()     // Catch:{ 1UI -> 0x023e }
                                                        r25 = r4
                                                        java.lang.Object r4 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        if (r4 == 0) goto L_0x0223
                                                        java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r4[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r5 = "server-ts"
                                                        r4[r2] = r5     // Catch:{ 1UI -> 0x023e }
                                                        r25 = r4
                                                        java.lang.Object r4 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ 1UI -> 0x023e }
                                                        if (r4 == 0) goto L_0x021e
                                                        long r4 = r4.longValue()     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r6[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r9 = "purpose-enc-certificate"
                                                        r6[r2] = r9     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Long r22 = X.C108975cc.A0X()     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Long r23 = X.AnonymousClass8BV.A0l()     // Catch:{ 1UI -> 0x023e }
                                                        r21 = r13
                                                        r25 = r6
                                                        java.lang.Object r6 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        if (r6 == 0) goto L_0x0219
                                                        java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r6[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r9 = "data"
                                                        r6[r2] = r9     // Catch:{ 1UI -> 0x023e }
                                                        r22 = r14
                                                        r23 = r15
                                                        r25 = r6
                                                        java.lang.Object r6 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r6 = (java.lang.String) r6     // Catch:{ 1UI -> 0x023e }
                                                        if (r6 == 0) goto L_0x0214
                                                        java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x023e }
                                                        r1[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.String r9 = "signature"
                                                        r1[r2] = r9     // Catch:{ 1UI -> 0x023e }
                                                        r25 = r1
                                                        java.lang.Object r1 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x023e }
                                                        if (r1 == 0) goto L_0x020f
                                                        X.A5x r9 = X.A5x.A00     // Catch:{ 1UI -> 0x023e }
                                                        r1 = 32
                                                        X.Ahb r1 = X.C21290Ahb.A00(r12, r9, r1)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Object r1 = r1.BCF(r3, r11)     // Catch:{ 1UI -> 0x023e }
                                                        if (r1 == 0) goto L_0x020a
                                                        java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x023e }
                                                        r2[r18] = r10     // Catch:{ 1UI -> 0x023e }
                                                        X.9SB r1 = new X.9SB     // Catch:{ 1UI -> 0x023e }
                                                        r1.<init>()     // Catch:{ 1UI -> 0x023e }
                                                        X.AnonymousClass8BS.A1A(r3, r2)     // Catch:{ 1UI -> 0x023e }
                                                        int r2 = (int) r7     // Catch:{ 1UI -> 0x023e }
                                                        r1 = 8
                                                        byte[] r1 = android.util.Base64.decode(r6, r1)     // Catch:{ 1UI -> 0x023e }
                                                        X.9fg r6 = new X.9fg     // Catch:{ 1UI -> 0x023e }
                                                        r6.<init>(r1, r2, r4)     // Catch:{ 1UI -> 0x023e }
                                                        java.lang.Object r0 = r0.A02     // Catch:{ 1UI -> 0x023e }
                                                        X.9YY r0 = (X.AnonymousClass9YY) r0     // Catch:{ 1UI -> 0x023e }
                                                        com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r3 = r0.A00     // Catch:{ 1UI -> 0x023e }
                                                        X.AlV r2 = X.C21522AlV.A00()     // Catch:{ 1UI -> 0x023e }
                                                        java.util.concurrent.atomic.AtomicBoolean r1 = r2.A00     // Catch:{ 1UI -> 0x023e }
                                                        boolean r0 = r1.get()     // Catch:{ 1UI -> 0x023e }
                                                        if (r0 != 0) goto L_0x0203
                                                        byte[] r0 = r2.A02     // Catch:{ 1UI -> 0x023e }
                                                        r6.A01 = r0     // Catch:{ 1UI -> 0x023e }
                                                        boolean r0 = r1.get()     // Catch:{ 1UI -> 0x023e }
                                                        if (r0 != 0) goto L_0x0237
                                                        byte[] r0 = r2.A01     // Catch:{ 1UI -> 0x023e }
                                                        r6.A00 = r0     // Catch:{ 1UI -> 0x023e }
                                                        r3.A0F = r6     // Catch:{ 1UI -> 0x023e }
                                                        return
                                                    L_0x0203:
                                                        java.lang.String r0 = "key has been destroyed"
                                                        java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x020a:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x020f:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0214:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0219:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x021e:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0223:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0228:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x022d:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0232:
                                                        X.1UI r0 = X.AnonymousClass1O9.A00(r11)     // Catch:{ 1UI -> 0x023e }
                                                        goto L_0x023d
                                                    L_0x0237:
                                                        java.lang.String r0 = "key has been destroyed"
                                                        java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ 1UI -> 0x023e }
                                                    L_0x023d:
                                                        throw r0     // Catch:{ 1UI -> 0x023e }
                                                    L_0x023e:
                                                        java.lang.String r0 = "CorruptStreamException when parsing UPIGetPurposeLimitingKeyResponseSuccess"
                                                        com.whatsapp.util.Log.e((java.lang.String) r0)
                                                        return
                                                    L_0x0244:
                                                        java.lang.String r6 = "upi-get-p2m-config"
                                                        r5 = 0
                                                        java.lang.String r1 = "account"
                                                        X.1ca r2 = r3.A0L(r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.String r1 = "mcc"
                                                        java.lang.String r10 = r2.A0P(r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.String r1 = "receiver-vpa"
                                                        java.lang.String r9 = r2.A0P(r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.String r1 = "payee-name"
                                                        java.lang.String r8 = r2.A0Q(r1, r5)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.String r1 = "purpose-code"
                                                        java.lang.String r7 = r2.A0Q(r1, r5)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.Object r3 = r0.A01     // Catch:{ 1UI -> 0x02a1 }
                                                        X.8z8 r3 = (X.C175698z8) r3     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.String r1 = "l2checkout"
                                                        X.1ca r2 = r2.A0K(r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        if (r2 == 0) goto L_0x029e
                                                        java.lang.String r1 = "merchant-public-key"
                                                        java.lang.String r4 = r2.A0Q(r1, r5)     // Catch:{ 1UI -> 0x02a1 }
                                                    L_0x0277:
                                                        X.00H r1 = r3.A08     // Catch:{ 1UI -> 0x02a1 }
                                                        X.9r1 r3 = X.AnonymousClass8BR.A0b(r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.Object r2 = r0.A03     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ 1UI -> 0x02a1 }
                                                        r1 = 2
                                                        r3.A02(r2, r6, r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x02a1 }
                                                        X.B8h r2 = (X.C22449B8h) r2     // Catch:{ 1UI -> 0x02a1 }
                                                        X.9NV r1 = new X.9NV     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.<init>()     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A00 = r10     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A04 = r9     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A02 = r8     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A03 = r7     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A05 = r5     // Catch:{ 1UI -> 0x02a1 }
                                                        r1.A01 = r4     // Catch:{ 1UI -> 0x02a1 }
                                                        r2.C3t(r5, r1)     // Catch:{ 1UI -> 0x02a1 }
                                                        goto L_0x02a0
                                                    L_0x029e:
                                                        r4 = 0
                                                        goto L_0x0277
                                                    L_0x02a0:
                                                        return
                                                    L_0x02a1:
                                                        X.A7B r3 = X.A7B.A00()
                                                        java.lang.Object r1 = r0.A01
                                                        X.8z8 r1 = (X.C175698z8) r1
                                                        X.00H r1 = r1.A08
                                                        X.9r1 r2 = X.AnonymousClass8BR.A0b(r1)
                                                        java.lang.Object r1 = r0.A03
                                                        java.lang.Integer r1 = (java.lang.Integer) r1
                                                        r2.A01(r3, r1, r6)
                                                        java.lang.Object r0 = r0.A02
                                                        X.B8h r0 = (X.C22449B8h) r0
                                                        r0.C3t(r3, r5)
                                                        return
                                                    L_0x02be:
                                                        java.lang.String r5 = "get-order-transaction"
                                                        r8 = 0
                                                        X.C18070vi.A0d(r3, r8)
                                                        super.A06(r3)
                                                        java.lang.Object r6 = r0.A03     // Catch:{ 1UI -> 0x032e }
                                                        X.8z9 r6 = (X.C175708z9) r6     // Catch:{ 1UI -> 0x032e }
                                                        X.1em r2 = r6.A06     // Catch:{ 1UI -> 0x032e }
                                                        r1 = 0
                                                        java.util.ArrayList r4 = r2.A04(r1, r3)     // Catch:{ 1UI -> 0x032e }
                                                        r3 = 2
                                                        if (r4 == 0) goto L_0x0317
                                                        int r1 = r4.size()     // Catch:{ 1UI -> 0x032e }
                                                        if (r1 <= 0) goto L_0x0317
                                                        X.8zf r2 = new X.8zf     // Catch:{ 1UI -> 0x032e }
                                                        r2.<init>()     // Catch:{ 1UI -> 0x032e }
                                                        r2.A01 = r4     // Catch:{ 1UI -> 0x032e }
                                                        X.1jA r1 = r6.A05     // Catch:{ 1UI -> 0x032e }
                                                        r1.A03(r2)     // Catch:{ 1UI -> 0x032e }
                                                        X.00H r1 = r6.A0A     // Catch:{ 1UI -> 0x032e }
                                                        X.9r1 r2 = X.AnonymousClass8BR.A0b(r1)     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Object r1 = r0.A02     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x032e }
                                                        r2.A02(r1, r5, r3)     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Object r7 = r0.A01     // Catch:{ 1UI -> 0x032e }
                                                        X.9YQ r7 = (X.AnonymousClass9YQ) r7     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Object r6 = r4.get(r8)     // Catch:{ 1UI -> 0x032e }
                                                        if (r6 == 0) goto L_0x0311
                                                        com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r1 = r7.A00     // Catch:{ 1UI -> 0x032e }
                                                        X.9jf r5 = r1.A04     // Catch:{ 1UI -> 0x032e }
                                                        X.205 r4 = r1.A07     // Catch:{ 1UI -> 0x032e }
                                                        X.Aa6 r1 = r1.A09     // Catch:{ 1UI -> 0x032e }
                                                        X.8Gd r3 = r1.A06     // Catch:{ 1UI -> 0x032e }
                                                        r2 = 3
                                                        X.Aap r1 = new X.Aap     // Catch:{ 1UI -> 0x032e }
                                                        r1.<init>(r6, r2)     // Catch:{ 1UI -> 0x032e }
                                                        r5.A00(r3, r1, r4)     // Catch:{ 1UI -> 0x032e }
                                                    L_0x0311:
                                                        com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r1 = r7.A00     // Catch:{ 1UI -> 0x032e }
                                                        r1.CEx()     // Catch:{ 1UI -> 0x032e }
                                                        return
                                                    L_0x0317:
                                                        X.00H r1 = r6.A0A     // Catch:{ 1UI -> 0x032e }
                                                        X.9r1 r2 = X.AnonymousClass8BR.A0b(r1)     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Object r1 = r0.A02     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x032e }
                                                        r2.A02(r1, r5, r3)     // Catch:{ 1UI -> 0x032e }
                                                        java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x032e }
                                                        X.9YQ r1 = (X.AnonymousClass9YQ) r1     // Catch:{ 1UI -> 0x032e }
                                                        com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r1 = r1.A00     // Catch:{ 1UI -> 0x032e }
                                                        r1.CEx()     // Catch:{ 1UI -> 0x032e }
                                                        return
                                                    L_0x032e:
                                                        java.lang.String r1 = "PAY: IndiaUpiP2mGetOrderTransactionAction/getOrderTransaction: invalid response message"
                                                        com.whatsapp.util.Log.e((java.lang.String) r1)
                                                        X.A7B r3 = X.A7B.A00()
                                                        java.lang.Object r1 = r0.A03
                                                        X.8z9 r1 = (X.C175708z9) r1
                                                        X.00H r1 = r1.A0A
                                                        X.9r1 r2 = X.AnonymousClass8BR.A0b(r1)
                                                        java.lang.Object r1 = r0.A02
                                                        java.lang.Integer r1 = (java.lang.Integer) r1
                                                        A02(r3, r0, r2, r1)
                                                        return
                                                    L_0x0349:
                                                        X.AEC r0 = X.C175498yo.A00(r1)     // Catch:{ 1UI -> 0x0351 }
                                                        r2.A00(r0, r4)     // Catch:{ 1UI -> 0x0351 }
                                                        return
                                                    L_0x0351:
                                                        X.1QE r1 = r5.A04
                                                        java.lang.String r0 = "onDeregisterVpaAlias/onResponseSuccess/corrupt stream exception"
                                                        r1.A05(r0)
                                                        r1 = 500(0x1f4, float:7.0E-43)
                                                        X.A7B r0 = new X.A7B
                                                        r0.<init>((int) r1)
                                                        r2.A00(r4, r0)
                                                        return
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.C175968zZ.A06(X.1ca):void");
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C175968zZ(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C175618z0 r12, AnonymousClass9YY r13, AnonymousClass9F6 r14) {
                                                    super(context, r9, r10, r11, "get-purpose-limiting-key");
                                                    this.A00 = 3;
                                                    this.A01 = r12;
                                                    this.A02 = r13;
                                                    this.A03 = r14;
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C175968zZ(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C22449B8h b8h, C175698z8 r13, Integer num) {
                                                    super(context, r9, r10, r11, "upi-get-p2m-config");
                                                    this.A00 = 2;
                                                    this.A01 = r13;
                                                    this.A03 = num;
                                                    this.A02 = b8h;
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C175968zZ(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C22451B8j b8j, C175808zJ r13, AnonymousClass9F5 r14) {
                                                    super(context, r9, r10, r11, "upi-generate-otp");
                                                    this.A00 = 4;
                                                    this.A01 = r13;
                                                    this.A02 = b8j;
                                                    this.A03 = r14;
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C175968zZ(Context context, AnonymousClass1KB r9, C33711jG r10, C196259ui r11, C22452B8k b8k, C175788zH r13, Integer num) {
                                                    super(context, r9, r10, r11, "upi-send-to-vpa");
                                                    this.A00 = 5;
                                                    this.A01 = r13;
                                                    this.A02 = b8k;
                                                    this.A03 = num;
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C175968zZ(Context context, AnonymousClass1KB r9, AEC aec, C33711jG r11, C196259ui r12, C175658z4 r13, C189679jd r14) {
                                                    super(context, r9, r11, r12, "deregister-alias");
                                                    this.A00 = 1;
                                                    this.A01 = r13;
                                                    this.A03 = r14;
                                                    this.A02 = aec;
                                                }
                                            }
