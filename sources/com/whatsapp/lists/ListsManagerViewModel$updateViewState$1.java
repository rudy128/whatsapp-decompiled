package com.whatsapp.lists;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerViewModel$updateViewState$1", f = "ListsManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerViewModel$updateViewState$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $conversations;
    public final /* synthetic */ boolean $isEdit;
    public final /* synthetic */ boolean $isManage;
    public final /* synthetic */ String $listName;
    public final /* synthetic */ List $uiConfig;
    public int label;
    public final /* synthetic */ ListsManagerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerViewModel$updateViewState$1(ListsManagerViewModel listsManagerViewModel, String str, List list, List list2, C30391dr r6, boolean z, boolean z2) {
        super(2, r6);
        this.this$0 = listsManagerViewModel;
        this.$isEdit = z;
        this.$isManage = z2;
        this.$listName = str;
        this.$uiConfig = list;
        this.$conversations = list2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new ListsManagerViewModel$updateViewState$1(this.this$0, this.$listName, this.$uiConfig, this.$conversations, r10, this.$isEdit, this.$isManage);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r0 = r1.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2[2] = r0;
        r10 = X.C200410p.A0P(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r5 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            if (r0 != 0) goto L_0x00e1
            X.C30691eM.A01(r15)
            com.whatsapp.lists.ListsManagerViewModel r0 = r14.this$0
            X.1G4 r0 = r0.A0B
            r0.getValue()
            boolean r12 = r14.$isEdit
            boolean r13 = r14.$isManage
            java.lang.String r9 = r14.$listName
            java.util.List r10 = r14.$uiConfig
            if (r10 != 0) goto L_0x0057
            com.whatsapp.lists.ListsManagerViewModel r4 = r14.this$0
            X.1x1 r6 = r4.A00
            r8 = 0
            if (r6 == 0) goto L_0x00cc
            int r0 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0025:
            r7 = 2
            r2 = 3
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x009b
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L_0x0092
            X.5Y3[] r2 = new X.AnonymousClass5Y3[r2]
            r1 = 2131891744(0x7f121620, float:1.9418217E38)
            X.4oC r0 = new X.4oC
            r0.<init>(r1)
            r2[r5] = r0
            X.4oB r0 = new X.4oB
            r0.<init>()
            r2[r3] = r0
            boolean r0 = r4.A04
            r0 = r0 ^ 1
            X.5QF r1 = X.AnonymousClass5QF.A00
            if (r0 == 0) goto L_0x00ca
        L_0x004d:
            java.lang.Object r0 = r1.invoke()
        L_0x0051:
            r2[r7] = r0
            java.util.List r10 = X.C200410p.A0P(r2)
        L_0x0057:
            java.util.List r11 = r14.$conversations
            if (r11 != 0) goto L_0x00cf
            com.whatsapp.lists.ListsManagerViewModel r0 = r14.this$0
            java.util.List r0 = r0.A09
            X.C18070vi.A0X(r0)
            com.whatsapp.lists.ListsManagerViewModel r6 = r14.this$0
            boolean r5 = r14.$isEdit
            java.util.ArrayList r11 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x006e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00cf
            X.1BI r3 = X.C17880vN.A0Q(r4)
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r2 = r0.A0H(r3)
            X.5O4 r1 = new X.5O4
            r1.<init>(r3, r6)
            X.4oE r0 = new X.4oE
            r0.<init>(r2, r1, r5)
            r11.add(r0)
            goto L_0x006e
        L_0x0092:
            if (r1 == r2) goto L_0x0096
            if (r1 != r3) goto L_0x009b
        L_0x0096:
            java.util.List r10 = r4.A0V()
            goto L_0x0057
        L_0x009b:
            X.5Y3[] r2 = new X.AnonymousClass5Y3[r2]
            boolean r0 = X.AnonymousClass000.A1X(r6)
            X.4oH r1 = new X.4oH
            r1.<init>(r0)
            boolean r0 = r4.A05
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ad
            r8 = r1
        L_0x00ad:
            r2[r5] = r8
            boolean r1 = r4.A04
            if (r1 != 0) goto L_0x00c8
            if (r6 == 0) goto L_0x00c8
            X.4oB r0 = new X.4oB
            r0.<init>()
        L_0x00ba:
            r2[r3] = r0
            if (r1 != 0) goto L_0x00c3
            X.1x1 r0 = r4.A00
            if (r0 == 0) goto L_0x00c3
            r5 = 1
        L_0x00c3:
            X.5QG r1 = X.AnonymousClass5QG.A00
            if (r5 == 0) goto L_0x00ca
            goto L_0x004d
        L_0x00c8:
            r0 = 0
            goto L_0x00ba
        L_0x00ca:
            r0 = 0
            goto L_0x0051
        L_0x00cc:
            r0 = r8
            goto L_0x0025
        L_0x00cf:
            X.C18070vi.A0k(r9, r10)
            X.4Zg r8 = new X.4Zg
            r8.<init>(r9, r10, r11, r12, r13)
            com.whatsapp.lists.ListsManagerViewModel r0 = r14.this$0
            X.1G4 r0 = r0.A0B
            r0.setValue(r8)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.ListsManagerViewModel$updateViewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsManagerViewModel$updateViewState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
