package X;

import com.whatsapp.WaTextView;
import com.whatsapp.conversation.comments.ui.CommentHeaderView;

/* renamed from: X.5GI  reason: invalid class name */
public final class AnonymousClass5GI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommentHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GI(CommentHeaderView commentHeaderView) {
        super(0);
        this.this$0 = commentHeaderView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WaTextView A0U = AnonymousClass3MW.A0U(this.this$0, 2131429208);
        int i = 3;
        if (AnonymousClass3MW.A1Z(A0U.getWhatsAppLocale())) {
            i = 5;
        }
        A0U.setGravity(i);
        return A0U;
    }
}
