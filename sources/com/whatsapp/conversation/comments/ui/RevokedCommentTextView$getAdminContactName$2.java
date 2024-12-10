package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass23O;
import X.C220618l;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.comments.ui.RevokedCommentTextView$getAdminContactName$2", f = "RevokedCommentTextView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RevokedCommentTextView$getAdminContactName$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass23O $message;
    public int label;
    public final /* synthetic */ RevokedCommentTextView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokedCommentTextView$getAdminContactName$2(RevokedCommentTextView revokedCommentTextView, AnonymousClass23O r3, C30391dr r4) {
        super(2, r4);
        this.$message = r3;
        this.this$0 = revokedCommentTextView;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RevokedCommentTextView$getAdminContactName$2(this.this$0, this.$message, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UserJid userJid = this.$message.A00;
            int A0B = this.this$0.getWaContactNames().A0B(this.$message.A0v.A00);
            return this.this$0.getWhatsAppLocale().A0F(this.this$0.getWaContactNames().A0a(C220618l.newArrayList((Object[]) new UserJid[]{userJid}), A0B));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RevokedCommentTextView$getAdminContactName$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
