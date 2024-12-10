package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.3rl  reason: invalid class name and case insensitive filesystem */
public class C77903rl extends AnonymousClass3O6 {
    public int A00;
    public int A01;
    public final /* synthetic */ ConversationAttachmentContentView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77903rl(Context context, ConversationAttachmentContentView conversationAttachmentContentView) {
        super(context);
        this.A02 = conversationAttachmentContentView;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public int getBaseHeightPx() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A01, this.A00 + this.A02.A04);
    }

    public static void A00(ViewGroup viewGroup, ConversationAttachmentContentView conversationAttachmentContentView, int i, int i2) {
        C77903rl r0 = new C77903rl(conversationAttachmentContentView.getContext(), conversationAttachmentContentView);
        r0.A01 = i;
        r0.A00 = i2;
        viewGroup.addView(r0);
    }

    public void setBaseHeightPx(int i) {
        this.A00 = i;
    }

    public void setBaseWidthPx(int i) {
        this.A01 = i;
    }
}
