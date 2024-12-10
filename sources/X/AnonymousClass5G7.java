package X;

import android.graphics.Point;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.5G7  reason: invalid class name */
public final class AnonymousClass5G7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ConversationListView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5G7(ConversationListView conversationListView) {
        super(0);
        this.this$0 = conversationListView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Point point = new Point();
        C72463Mc.A0u(AnonymousClass3Ma.A05(this.this$0), point);
        return Integer.valueOf((point.y - (this.this$0.getResources().getDimensionPixelSize(2131166981) * 2)) / 5);
    }
}
