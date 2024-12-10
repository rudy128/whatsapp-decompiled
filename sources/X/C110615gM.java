package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout;

/* renamed from: X.5gM  reason: invalid class name and case insensitive filesystem */
public abstract class C110615gM extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ReactionsBubbleLayout reactionsBubbleLayout = (ReactionsBubbleLayout) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            reactionsBubbleLayout.A04 = AnonymousClass10E.A8r(r1);
            reactionsBubbleLayout.A03 = AnonymousClass10E.A6Q(r1);
            reactionsBubbleLayout.A05 = C000200d.A00(r1.A00.A3O);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C110615gM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
