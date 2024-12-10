package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass23O;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.RevokedCommentTextView$setAdminRevokeText$1", f = "RevokedCommentTextView.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class RevokedCommentTextView$setAdminRevokeText$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass23O $msg;
    public int label;
    public final /* synthetic */ RevokedCommentTextView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokedCommentTextView$setAdminRevokeText$1(RevokedCommentTextView revokedCommentTextView, AnonymousClass23O r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = revokedCommentTextView;
        this.$msg = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RevokedCommentTextView$setAdminRevokeText$1(this.this$0, this.$msg, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            RevokedCommentTextView revokedCommentTextView = this.this$0;
            AnonymousClass23O r0 = this.$msg;
            this.label = 1;
            obj = RevokedCommentTextView.A0F(revokedCommentTextView, r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        RevokedCommentTextView revokedCommentTextView2 = this.this$0;
        revokedCommentTextView2.A0S(C17880vN.A0q(revokedCommentTextView2.getContext(), obj, new Object[1], 0, 2131886553), (List) null, 0, false);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RevokedCommentTextView$setAdminRevokeText$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
