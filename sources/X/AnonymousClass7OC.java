package X;

import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7OC  reason: invalid class name */
public class AnonymousClass7OC implements AnonymousClass88Y {
    public final int A00;
    public final Object A01;

    public AnonymousClass7OC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpG() {
        if (this.A00 != 0) {
            MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A01;
            messageReplyActivity.A14.A0X(true);
            MessageReplyActivity.A0x(messageReplyActivity);
            return;
        }
        ((AnonymousClass4aY) this.A01).A4h.A0X(true);
    }
}
