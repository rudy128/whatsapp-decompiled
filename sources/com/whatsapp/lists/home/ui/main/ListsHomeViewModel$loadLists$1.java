package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.home.ui.main.ListsHomeViewModel$loadLists$1", f = "ListsHomeViewModel.kt", i = {1, 2, 2}, l = {75, 76, 77}, m = "invokeSuspend", n = {"staticRows", "staticRows", "listsRows"}, s = {"L$0", "L$0", "L$1"})
public final class ListsHomeViewModel$loadLists$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Integer $updateEntryPoint;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ListsHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsHomeViewModel$loadLists$1(ListsHomeViewModel listsHomeViewModel, Integer num, C30391dr r4) {
        super(2, r4);
        this.this$0 = listsHomeViewModel;
        this.$updateEntryPoint = num;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsHomeViewModel$loadLists$1(this.this$0, this.$updateEntryPoint, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r13 == r4) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r1) goto L_0x005e
            if (r0 == r2) goto L_0x0040
            if (r0 != r6) goto L_0x009d
            java.lang.Object r8 = r12.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r5 = r12.L$0
            java.util.List r5 = (java.util.List) r5
            X.C30691eM.A01(r13)
        L_0x001a:
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel r6 = r12.this$0
            java.lang.Integer r4 = r12.$updateEntryPoint
            java.util.ArrayList r9 = X.C29351c6.A0D(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r2 = r3.next()
            X.1x1 r2 = (X.C41761x1) r2
            X.5Ux r1 = new X.5Ux
            r1.<init>(r6, r4)
            X.4oK r0 = new X.4oK
            r0.<init>(r2, r1)
            r9.add(r0)
            goto L_0x0026
        L_0x0040:
            java.lang.Object r5 = r12.L$0
            java.util.List r5 = (java.util.List) r5
            X.C30691eM.A01(r13)
            goto L_0x0079
        L_0x0048:
            X.C30691eM.A01(r13)
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel r0 = r12.this$0
            X.00H r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            com.whatsapp.lists.ListsRepository r0 = (com.whatsapp.lists.ListsRepository) r0
            r12.label = r1
            java.lang.Object r13 = r0.A07(r12)
            if (r13 != r4) goto L_0x0061
        L_0x005d:
            return r4
        L_0x005e:
            X.C30691eM.A01(r13)
        L_0x0061:
            java.util.List r13 = (java.util.List) r13
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel r0 = r12.this$0
            X.00H r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            com.whatsapp.lists.ListsRepository r0 = (com.whatsapp.lists.ListsRepository) r0
            r12.L$0 = r13
            r12.label = r2
            java.lang.Object r0 = r0.A08(r12)
            if (r0 == r4) goto L_0x005d
            r5 = r13
            r13 = r0
        L_0x0079:
            java.util.List r13 = (java.util.List) r13
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel r3 = r12.this$0
            X.0wl r2 = r3.A0D
            r1 = 0
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel$loadLists$1$1 r0 = new com.whatsapp.lists.home.ui.main.ListsHomeViewModel$loadLists$1$1
            r0.<init>(r3, r13, r5, r1)
            r12.L$0 = r5
            r12.L$1 = r13
            r12.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r12, r2, r0)
            if (r0 == r4) goto L_0x005d
            r8 = r13
            goto L_0x001a
        L_0x0093:
            java.lang.Integer r7 = r12.$updateEntryPoint
            r10 = 2
            r11 = 0
            com.whatsapp.lists.home.ui.main.ListsHomeViewModel.A04(r6, r7, r8, r9, r10, r11)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.home.ui.main.ListsHomeViewModel$loadLists$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsHomeViewModel$loadLists$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
