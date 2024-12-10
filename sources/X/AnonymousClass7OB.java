package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7OB  reason: invalid class name */
public class AnonymousClass7OB implements AnonymousClass8AX {
    public final int A00;
    public final Object A01;

    public AnonymousClass7OB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C5D() {
        if (this.A00 != 0) {
            MessageReplyActivity.A13((MessageReplyActivity) this.A01, false);
        } else {
            PopupNotification.A0q((PopupNotification) this.A01);
        }
    }

    public void CAK() {
        if (this.A00 != 0) {
            MessageReplyActivity.A0x((MessageReplyActivity) this.A01);
        } else {
            PopupNotification.A0c((PopupNotification) this.A01);
        }
    }

    public /* synthetic */ void C6Q() {
    }

    public /* synthetic */ void C77() {
    }

    public /* synthetic */ void BsH(C46212Dp r1) {
    }
}
