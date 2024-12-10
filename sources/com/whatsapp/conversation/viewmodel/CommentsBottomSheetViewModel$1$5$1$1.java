package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3VA;
import X.AnonymousClass4LF;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$5$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$1$5$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass4LF $updateCommentItem;
    public int label;
    public final /* synthetic */ AnonymousClass3VA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$1$5$1$1(AnonymousClass4LF r2, AnonymousClass3VA r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$updateCommentItem = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommentsBottomSheetViewModel$1$5$1$1(this.$updateCommentItem, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r1 = this.this$0.A0L;
            AnonymousClass4LF r0 = this.$updateCommentItem;
            this.label = 1;
            if (r1.CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheetViewModel$1$5$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
