package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3WO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$onViewCreated$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$onViewCreated$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$onViewCreated$3(CommentsBottomSheet commentsBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = commentsBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CommentsBottomSheet$onViewCreated$3 commentsBottomSheet$onViewCreated$3 = new CommentsBottomSheet$onViewCreated$3(this.this$0, r4);
        commentsBottomSheet$onViewCreated$3.L$0 = obj;
        return commentsBottomSheet$onViewCreated$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass3WO r1 = this.this$0.A06;
            if (r1 == null) {
                AnonymousClass3MW.A1B();
                throw null;
            }
            C18070vi.A0d(obj2, 0);
            int indexOf = r1.A00.A02.indexOf(obj2);
            if (indexOf >= 0) {
                r1.A0G(indexOf);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsBottomSheet$onViewCreated$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
