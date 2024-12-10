package com.whatsapp.newsletter.ui.reactions.viewmodel;

import X.AnonymousClass1OS;
import X.C130126iv;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1", f = "GetReactionSendersUseCase.kt", i = {0, 0}, l = {76}, m = "invokeSuspend", n = {"$this$launch", "sortIdToReactionsMap"}, s = {"L$0", "L$1"})
public final class GetReactionSendersUseCase$invoke$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $messageList;
    public final /* synthetic */ C22821Di $onComplete;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ C130126iv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetReactionSendersUseCase$invoke$1(C130126iv r2, List list, C30391dr r4, C22821Di r5) {
        super(2, r4);
        this.$messageList = list;
        this.this$0 = r2;
        this.$onComplete = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        GetReactionSendersUseCase$invoke$1 getReactionSendersUseCase$invoke$1 = new GetReactionSendersUseCase$invoke$1(this.this$0, this.$messageList, r6, this.$onComplete);
        getReactionSendersUseCase$invoke$1.L$0 = obj;
        return getReactionSendersUseCase$invoke$1;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        r16 = r1.A0y;
        r1 = X.AnonymousClass1CJ.A00(r5.A01, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if ((r1 instanceof X.C46162Dk) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r1 = (X.C46162Dk) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r1 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r1.A0P() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r6.invoke(X.AnonymousClass1D7.A0I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r12 = X.C18070vi.A0H(r2);
        r8.L$0 = r3;
        r8.L$1 = r4;
        r8.L$2 = r5;
        r8.L$3 = r6;
        r8.L$4 = r10;
        r8.L$5 = r4;
        r8.L$6 = r12;
        r8.label = 1;
        r11 = X.C108975cc.A0k(r8);
        r15 = new java.lang.Object();
        r14 = new X.AnonymousClass7KK(r5, r11, r15);
        r2 = X.C98494rF.A00();
        r21 = r16;
        r15 = r13;
        r16 = r14;
        r5.A03.CGN(new X.AnonymousClass7QK(r15, r16, r5, r11, r15, r2, r21));
        X.C30551e8.A02(r5.A05.getCoroutineContext()).Bdy(new X.C1583080e(r2));
        r1 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ba, code lost:
        if (r1 != r9) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bc, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[EDGE_INSN: B:28:0x0063->B:18:0x0063 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r24
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            r8 = r23
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L_0x00c0
            if (r0 != r7) goto L_0x00d5
            java.lang.Object r12 = r8.L$6
            java.lang.Object r0 = r8.L$5
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r10 = r8.L$4
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r6 = r8.L$3
            X.1Di r6 = (X.C22821Di) r6
            java.lang.Object r5 = r8.L$2
            X.6iv r5 = (X.C130126iv) r5
            java.lang.Object r4 = r8.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r8.L$0
            X.C30691eM.A01(r1)
        L_0x0028:
            r0.put(r12, r1)
            r6.invoke(r4)
        L_0x002e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0063
            X.206 r1 = X.C17880vN.A0Y(r10)
            X.205 r2 = r1.A0v
            X.1BI r13 = r2.A00
            boolean r0 = r13 instanceof X.C29681ch
            if (r0 == 0) goto L_0x002e
            X.1ch r13 = (X.C29681ch) r13
            if (r13 == 0) goto L_0x002e
            long r0 = r1.A0y
            r16 = r0
            X.1CJ r0 = r5.A01
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r13)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0066
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.A0P()
            if (r0 != 0) goto L_0x0066
            X.1CQ r0 = X.AnonymousClass1D7.A0I()
            r6.invoke(r0)
        L_0x0063:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0066:
            java.lang.String r12 = X.C18070vi.A0H(r2)
            r8.L$0 = r3
            r8.L$1 = r4
            r8.L$2 = r5
            r8.L$3 = r6
            r8.L$4 = r10
            r8.L$5 = r4
            r8.L$6 = r12
            r8.label = r7
            X.3Dp r11 = X.C108975cc.A0k(r8)
            X.1Dh r15 = new X.1Dh
            r15.<init>()
            X.7KK r14 = new X.7KK
            r14.<init>(r5, r11, r15)
            X.4rF r2 = X.C98494rF.A00()
            X.10I r1 = r5.A03
            X.7QK r0 = new X.7QK
            r21 = r16
            r19 = r15
            r20 = r2
            r17 = r5
            r18 = r11
            r15 = r13
            r16 = r14
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.CGN(r0)
            X.1OX r0 = r5.A05
            X.0wh r0 = r0.getCoroutineContext()
            X.1OB r1 = X.C30551e8.A02(r0)
            X.80e r0 = new X.80e
            r0.<init>(r2)
            r1.Bdy(r0)
            java.lang.Object r1 = r11.A00()
            if (r1 != r9) goto L_0x00bd
            return r9
        L_0x00bd:
            r0 = r4
            goto L_0x0028
        L_0x00c0:
            X.C30691eM.A01(r1)
            java.lang.Object r3 = r8.L$0
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.List r0 = r8.$messageList
            X.6iv r5 = r8.this$0
            X.1Di r6 = r8.$onComplete
            java.util.Iterator r10 = r0.iterator()
            goto L_0x002e
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetReactionSendersUseCase$invoke$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
