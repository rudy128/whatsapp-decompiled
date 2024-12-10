package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$deleteLabels$2", f = "ListsRepository.kt", i = {0}, l = {392}, m = "invokeSuspend", n = {"customLists"}, s = {"L$0"})
public final class ListsRepository$deleteLabels$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $labelInfos;
    public int I$0;
    public int I$1;
    public Object L$0;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$deleteLabels$2(ListsRepository listsRepository, Collection collection, C30391dr r4) {
        super(2, r4);
        this.$labelInfos = collection;
        this.this$0 = listsRepository;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ListsRepository$deleteLabels$2(this.this$0, this.$labelInfos, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            r5 = r18
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r4) goto L_0x0136
            int r3 = r5.I$1
            int r11 = r5.I$0
            java.lang.Object r2 = r5.L$0
            long[] r2 = (long[]) r2
            X.C30691eM.A01(r19)
        L_0x0016:
            int r11 = r11 + 1
        L_0x0018:
            if (r11 >= r3) goto L_0x0141
            r0 = r2[r11]
            com.whatsapp.lists.ListsRepository r10 = r5.this$0
            r5.L$0 = r2
            r5.I$0 = r11
            r5.I$1 = r3
            r5.label = r4
            X.0wl r9 = r10.A0B
            r8 = 0
            com.whatsapp.lists.ListsRepository$removeFromJidsFromCache$2 r7 = new com.whatsapp.lists.ListsRepository$removeFromJidsFromCache$2
            r7.<init>(r10, r8, r0)
            java.lang.Object r0 = X.C30451dy.A00(r5, r9, r7)
            if (r0 != r6) goto L_0x0016
            return r6
        L_0x0035:
            X.C30691eM.A01(r19)
            java.util.Collection r0 = r5.$labelInfos
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1x1 r0 = (X.C41761x1) r0
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0042
            r3.add(r1)
            goto L_0x0042
        L_0x0057:
            java.util.ArrayList r7 = X.C29351c6.A0E(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x005f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r3.next()
            X.1x1 r0 = (X.C41761x1) r0
            long r1 = r0.A03
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x005f
        L_0x0076:
            long[] r2 = X.C29431cG.A1C(r7)
            java.util.Collection r0 = r5.$labelInfos
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0084:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.1x1 r0 = (X.C41761x1) r0
            int r0 = r0.A02
            if (r0 == 0) goto L_0x0084
            r7.add(r1)
            goto L_0x0084
        L_0x0099:
            java.util.ArrayList r8 = X.C29351c6.A0E(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x00a1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r7.next()
            X.1x1 r0 = (X.C41761x1) r0
            long r0 = r0.A03
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            r8.add(r3)
            goto L_0x00a1
        L_0x00b8:
            long[] r7 = X.C29431cG.A1C(r8)
            com.whatsapp.lists.ListsRepository r0 = r5.this$0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.1NH r0 = (X.AnonymousClass1NH) r0
            java.util.List r11 = r0.A03(r2)
            X.C18070vi.A0X(r11)
            com.whatsapp.lists.ListsRepository r0 = r5.this$0
            X.00H r0 = r0.A03
            java.lang.Object r10 = r0.get()
            X.2rX r10 = (X.C62522rX) r10
            java.util.HashSet r9 = X.C17880vN.A12()
            int r3 = r2.length
            r8 = 0
        L_0x00dd:
            if (r8 >= r3) goto L_0x00e7
            r0 = r2[r8]
            X.C17880vN.A1R(r9, r0)
            int r8 = r8 + 1
            goto L_0x00dd
        L_0x00e7:
            X.2LO r1 = r10.A01
            r0 = 16
            X.C17890vO.A0r(r1, r9, r0)
            X.1NA r0 = r10.A00
            boolean r8 = r0.A0C(r2)
            r0 = 15
            X.C17890vO.A0q(r1, r0)
            com.whatsapp.lists.ListsRepository r0 = r5.this$0
            X.00H r0 = r0.A03
            java.lang.Object r12 = r0.get()
            X.2rX r12 = (X.C62522rX) r12
            int r1 = r7.length
            r0 = 0
        L_0x0105:
            if (r0 >= r1) goto L_0x0113
            r13 = r7[r0]
            r15 = 0
            r17 = r4
            r12.A00(r13, r15, r17)
            int r0 = r0 + 1
            goto L_0x0105
        L_0x0113:
            if (r8 == 0) goto L_0x013b
            com.whatsapp.lists.ListsRepository r0 = r5.this$0
            X.00H r0 = r0.A05
            java.lang.Object r8 = r0.get()
            X.1NH r8 = (X.AnonymousClass1NH) r8
            java.util.Iterator r7 = r11.iterator()
        L_0x0123:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r1 = r7.next()
            java.util.Map r0 = r8.A09
            r0.remove(r1)
            goto L_0x0123
        L_0x0133:
            r11 = 0
            goto L_0x0018
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x013b:
            java.lang.String r0 = "ListsRepository/deleteLabels/failed to delete labels"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0151
        L_0x0141:
            com.whatsapp.lists.ListsRepository r4 = r5.this$0
            X.1KB r3 = r4.A01
            java.util.Collection r2 = r5.$labelInfos
            r1 = 41
            X.7Pj r0 = new X.7Pj
            r0.<init>(r4, r2, r1)
            r3.A0J(r0)
        L_0x0151:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsRepository$deleteLabels$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsRepository$deleteLabels$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
