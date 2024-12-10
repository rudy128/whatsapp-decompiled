package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r3) {
        super(3, r3);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 = new AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(this.this$0, (C30391dr) obj3);
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$0 = obj;
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$1 = obj2;
        return avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r7 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r7) goto L_0x010f
            X.C30691eM.A01(r16)
        L_0x000c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x000f:
            X.C30691eM.A01(r16)
            java.lang.Object r5 = r15.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            java.lang.Object r9 = r15.L$1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            X.6cM[] r9 = (X.C126206cM[]) r9
            int r0 = r9.length
            int r1 = X.C200610r.A03(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0027
            r1 = 16
        L_0x0027:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r1)
            int r4 = r9.length
            r3 = 0
        L_0x002e:
            if (r3 >= r4) goto L_0x005a
            r2 = r9[r3]
            boolean r0 = r2 instanceof X.C120486Dw
            if (r0 == 0) goto L_0x004a
            r0 = r2
            X.6Dw r0 = (X.C120486Dw) r0
            X.6Tc r1 = r0.A00
        L_0x003b:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandSearchType.AvatarStickerCategory"
            X.C18070vi.A0z(r1, r0)
            X.6Ds r1 = (X.C120446Ds) r1
            X.6UV r0 = r1.A00
            r8.put(r0, r2)
            int r3 = r3 + 1
            goto L_0x002e
        L_0x004a:
            boolean r0 = r2 instanceof X.C120466Du
            if (r0 == 0) goto L_0x0054
            r0 = r2
            X.6Du r0 = (X.C120466Du) r0
            X.6Tc r1 = r0.A00
            goto L_0x003b
        L_0x0054:
            r0 = r2
            X.6Dv r0 = (X.C120476Dv) r0
            X.6Tc r1 = r0.A00
            goto L_0x003b
        L_0x005a:
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r15.this$0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r14 = r0.iterator()
        L_0x0066:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r10 = r14.next()
            X.6UV r10 = (X.AnonymousClass6UV) r10
            java.lang.Object r1 = r8.get(r10)
            X.6cM r1 = (X.C126206cM) r1
            if (r1 == 0) goto L_0x0066
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r15.this$0
            X.00H r0 = r0.A04
            java.lang.Object r9 = r0.get()
            X.72p r9 = (X.C1406972p) r9
            X.C18070vi.A0d(r10, r7)
            java.lang.String r0 = r10.toString()
            X.612 r3 = new X.612
            r3.<init>(r10, r0)
            boolean r0 = r1 instanceof X.C120486Dw
            if (r0 == 0) goto L_0x00ee
            X.6Dw r1 = (X.C120486Dw) r1
            java.util.List r0 = r1.A01
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x00a0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r1 = r13.next()
            X.6Td r1 = (X.C123106Td) r1
            boolean r0 = r1 instanceof X.C120506Dy
            if (r0 == 0) goto L_0x00c2
            java.lang.String r12 = X.C1406972p.A00(r10, r1)
            X.6Dy r1 = (X.C120506Dy) r1
            X.77d r11 = r1.A00
        L_0x00b8:
            r0 = 0
            X.60s r1 = new X.60s
            r1.<init>(r3, r11, r12, r0)
        L_0x00be:
            r2.add(r1)
            goto L_0x00a0
        L_0x00c2:
            boolean r0 = r1 instanceof X.C120496Dx
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = X.C1406972p.A00(r10, r1)
            X.60r r1 = new X.60r
            r1.<init>(r3, r0)
            goto L_0x00be
        L_0x00d0:
            boolean r0 = r1 instanceof X.C120516Dz
            if (r0 == 0) goto L_0x0114
            java.lang.String r12 = X.C1406972p.A00(r10, r1)
            X.6Dz r1 = (X.C120516Dz) r1
            X.77d r11 = r1.A00
            goto L_0x00b8
        L_0x00dd:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x00fd
            X.C138756xd.A01(r9, r3, r10, r1)
            r1.addAll(r2)
            goto L_0x00fd
        L_0x00ee:
            boolean r0 = r1 instanceof X.C120476Dv
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r1 instanceof X.C120466Du
            if (r0 != 0) goto L_0x00fb
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00fb:
            X.0wS r1 = X.C18460wS.A00
        L_0x00fd:
            r4.add(r1)
            goto L_0x0066
        L_0x0102:
            java.util.ArrayList r0 = X.C29351c6.A0F(r4)
            r15.label = r7
            java.lang.Object r0 = r5.BJt(r0, r15)
            if (r0 != r6) goto L_0x000c
            return r6
        L_0x010f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0114:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
