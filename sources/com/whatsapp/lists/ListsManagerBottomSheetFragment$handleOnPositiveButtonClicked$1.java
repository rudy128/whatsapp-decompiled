package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass5T3;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C38501rO;
import X.C83274Em;
import androidx.fragment.app.Fragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1", f = "ListsManagerBottomSheetFragment.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsManagerBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1(ListsManagerBottomSheetFragment listsManagerBottomSheetFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsManagerBottomSheetFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ListsManagerFragment listsManagerFragment;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Fragment A0O = this.this$0.A1E().A0O(2131430999);
            if (A0O instanceof ListsManagerFragment) {
                listsManagerFragment = (ListsManagerFragment) A0O;
            } else {
                listsManagerFragment = null;
            }
            C18600wl r2 = this.this$0.A08;
            if (r2 != null) {
                ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1 listsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1 = new ListsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1(listsManagerFragment, (C30391dr) null);
                this.label = 1;
                obj = C30451dy.A00(this, r2, listsManagerBottomSheetFragment$handleOnPositiveButtonClicked$1$updateResult$1);
                if (obj == r5) {
                    return r5;
                }
            } else {
                str = "ioDispatcher";
                C18070vi.A11(str);
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C83274Em r7 = (C83274Em) obj;
        AnonymousClass00H r0 = this.this$0.A05;
        if (r0 != null) {
            ListsManagerBottomSheetFragment listsManagerBottomSheetFragment = this.this$0;
            ((C38501rO) r0.get()).A03(listsManagerBottomSheetFragment, r7, new AnonymousClass5T3(listsManagerBottomSheetFragment));
            return C27621Wu.A00;
        }
        str = "listsUtil";
        C18070vi.A11(str);
        throw null;
    }
}
