package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3VA;
import X.AnonymousClass4UD;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3VA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(AnonymousClass3VA r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommentsBottomSheetViewModel$1$2$onMessagesDeleted$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r2 = this.this$0.A0J;
            AnonymousClass4UD r0 = new AnonymousClass4UD((Integer) null, (Integer) null, true);
            this.label = 1;
            if (r2.CHH(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
