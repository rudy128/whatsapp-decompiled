package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1", f = "ListsManagerBottomSheetFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ ListsManagerFragment $listManagerFragment;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1(ListsManagerFragment listsManagerFragment, C30391dr r3) {
        super(2, r3);
        this.$listManagerFragment = listsManagerFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1(this.$listManagerFragment, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1(this.$listManagerFragment, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsManagerFragment listsManagerFragment = this.$listManagerFragment;
            if (listsManagerFragment == null) {
                return null;
            }
            this.label = 1;
            obj = listsManagerFragment.A25(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
