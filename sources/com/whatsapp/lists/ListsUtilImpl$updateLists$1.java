package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C38501rO;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsUtilImpl$updateLists$1", f = "ListsUtilImpl.kt", i = {}, l = {194, 196}, m = "invokeSuspend", n = {}, s = {})
public final class ListsUtilImpl$updateLists$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $addLists;
    public final /* synthetic */ List $chatJids;
    public final /* synthetic */ List $removeLists;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C38501rO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsUtilImpl$updateLists$1(C38501rO r2, List list, List list2, List list3, C30391dr r6) {
        super(2, r6);
        this.$addLists = list;
        this.$removeLists = list2;
        this.this$0 = r2;
        this.$chatJids = list3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new ListsUtilImpl$updateLists$1(this.this$0, this.$addLists, this.$removeLists, this.$chatJids, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r8 = 2
            r10 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r10) goto L_0x003e
            if (r0 != r8) goto L_0x009f
            java.lang.Object r4 = r11.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r3 = r11.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r11.L$0
            X.1rO r2 = (X.C38501rO) r2
            X.C30691eM.A01(r12)
        L_0x001b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r1 = r4.next()
            X.1x1 r1 = (X.C41761x1) r1
            X.00H r0 = r2.A06
            java.lang.Object r0 = r0.get()
            com.whatsapp.lists.ListsRepository r0 = (com.whatsapp.lists.ListsRepository) r0
            r11.L$0 = r2
            r11.L$1 = r3
            r11.L$2 = r4
            r11.label = r8
            java.lang.Object r0 = r0.A02(r1, r3, r11)
            if (r0 != r9) goto L_0x001b
            return r9
        L_0x003e:
            java.lang.Object r7 = r11.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r6 = r11.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r11.L$0
            X.1rO r5 = (X.C38501rO) r5
            X.C30691eM.A01(r12)
            goto L_0x005b
        L_0x004e:
            X.C30691eM.A01(r12)
            java.util.List r0 = r11.$addLists
            X.1rO r5 = r11.this$0
            java.util.List r6 = r11.$chatJids
            java.util.Iterator r7 = r0.iterator()
        L_0x005b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r4 = r7.next()
            X.1x1 r4 = (X.C41761x1) r4
            X.00H r0 = r5.A06
            java.lang.Object r3 = r0.get()
            com.whatsapp.lists.ListsRepository r3 = (com.whatsapp.lists.ListsRepository) r3
            r11.L$0 = r5
            r11.L$1 = r6
            r11.L$2 = r7
            r11.label = r10
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0084
            r1 = -3
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
        L_0x0081:
            if (r0 != r9) goto L_0x005b
            return r9
        L_0x0084:
            X.0wl r2 = r3.A0B
            r1 = 0
            com.whatsapp.lists.ListsRepository$updateListChatJids$2 r0 = new com.whatsapp.lists.ListsRepository$updateListChatJids$2
            r0.<init>(r4, r3, r6, r1)
            java.lang.Object r0 = X.C30451dy.A00(r11, r2, r0)
            goto L_0x0081
        L_0x0091:
            java.util.List r0 = r11.$removeLists
            X.1rO r2 = r11.this$0
            java.util.List r3 = r11.$chatJids
            java.util.Iterator r4 = r0.iterator()
            goto L_0x001b
        L_0x009c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsUtilImpl$updateLists$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsUtilImpl$updateLists$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
