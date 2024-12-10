package X;

import android.view.ViewTreeObserver;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4e4  reason: invalid class name and case insensitive filesystem */
public class C90434e4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AnonymousClass4aY A02;

    public C90434e4(AnonymousClass4aY r3) {
        this.A02 = r3;
        this.A01 = C72463Mc.A0I(r3).getDimensionPixelOffset(2131168784);
    }

    public void onGlobalLayout() {
        int displayingHeight;
        AnonymousClass4aY r5 = this.A02;
        if (r5.A2F.getVisibility() == 8) {
            displayingHeight = 0;
        } else {
            displayingHeight = r5.A2F.getDisplayingHeight();
        }
        int i = displayingHeight - this.A00;
        this.A00 = displayingHeight;
        if (i > 0) {
            int i2 = this.A01;
            ConversationListView conversationListView = r5.A2B;
            if (conversationListView != null && conversationListView.A0D(i2)) {
                int i3 = r5.A2F.A01;
                ConversationListView conversationListView2 = r5.A2B;
                if (i3 > 0) {
                    conversationListView2.scrollListBy(i);
                } else {
                    conversationListView2.smoothScrollBy(displayingHeight, 0);
                }
            }
        }
    }
}
