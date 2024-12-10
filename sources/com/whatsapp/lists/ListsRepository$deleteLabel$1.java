package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$deleteLabel$1", f = "ListsRepository.kt", i = {}, l = {354, 358}, m = "invokeSuspend", n = {}, s = {})
public final class ListsRepository$deleteLabel$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$deleteLabel$1(ListsRepository listsRepository, Integer num, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = listsRepository;
        this.$entryPoint = num;
        this.$type = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsRepository$deleteLabel$1(this.this$0, this.$entryPoint, r6, this.$type);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0020
            if (r0 != r4) goto L_0x0073
            X.C30691eM.A01(r14)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r14)
            com.whatsapp.lists.ListsRepository r0 = r13.this$0
            r13.label = r1
            java.lang.Object r14 = r0.A08(r13)
            if (r14 != r3) goto L_0x0023
            return r3
        L_0x0020:
            X.C30691eM.A01(r14)
        L_0x0023:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            int r6 = r13.$type
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r14.iterator()
        L_0x002f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.1x1 r0 = (X.C41761x1) r0
            int r0 = r0.A02
            if (r0 != r6) goto L_0x002f
            r2.add(r1)
            goto L_0x002f
        L_0x0044:
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x0068
            com.whatsapp.lists.ListsRepository r1 = r13.this$0
            r0 = 0
            java.lang.Object r6 = r2.get(r0)
            X.1x1 r6 = (X.C41761x1) r6
            java.lang.Integer r8 = r13.$entryPoint
            X.00H r0 = r1.A07
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.4Pp r5 = (X.C85964Pp) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x0068:
            com.whatsapp.lists.ListsRepository r0 = r13.this$0
            r13.label = r4
            java.lang.Object r0 = r0.A06(r2, r13)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository$deleteLabel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$deleteLabel$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
