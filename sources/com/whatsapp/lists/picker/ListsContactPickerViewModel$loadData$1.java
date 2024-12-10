package com.whatsapp.lists.picker;

import X.AnonymousClass1OS;
import X.AnonymousClass4CZ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C41761x1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.picker.ListsContactPickerViewModel$loadData$1", f = "ListsContactPickerViewModel.kt", i = {}, l = {76, 77}, m = "invokeSuspend", n = {}, s = {})
public final class ListsContactPickerViewModel$loadData$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ AnonymousClass4CZ $suggestionMode;
    public int label;
    public final /* synthetic */ ListsContactPickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsContactPickerViewModel$loadData$1(C41761x1 r2, AnonymousClass4CZ r3, ListsContactPickerViewModel listsContactPickerViewModel, C30391dr r5) {
        super(2, r5);
        this.this$0 = listsContactPickerViewModel;
        this.$labelInfo = r2;
        this.$suggestionMode = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ListsContactPickerViewModel$loadData$1(this.$labelInfo, this.$suggestionMode, this.this$0, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0022
            if (r0 != r3) goto L_0x0032
            X.C30691eM.A01(r6)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r6)
            com.whatsapp.lists.picker.ListsContactPickerViewModel r1 = r5.this$0
            X.1x1 r0 = r5.$labelInfo
            r5.label = r2
            java.lang.Object r0 = com.whatsapp.lists.picker.ListsContactPickerViewModel.A00(r0, r1, r5)
            if (r0 != r4) goto L_0x0025
            return r4
        L_0x0022:
            X.C30691eM.A01(r6)
        L_0x0025:
            com.whatsapp.lists.picker.ListsContactPickerViewModel r1 = r5.this$0
            X.4CZ r0 = r5.$suggestionMode
            r5.label = r3
            java.lang.Object r0 = com.whatsapp.lists.picker.ListsContactPickerViewModel.A03(r0, r1, r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.picker.ListsContactPickerViewModel$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ListsContactPickerViewModel$loadData$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
