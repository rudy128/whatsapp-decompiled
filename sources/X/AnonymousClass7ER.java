package X;

import android.view.KeyEvent;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.7ER  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7ER implements AnonymousClass5Z5 {
    public final /* synthetic */ MessageReplyActivity A00;

    public final void BwT(KeyEvent keyEvent, int i) {
        MessageReplyActivity messageReplyActivity = this.A00;
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1) {
            messageReplyActivity.A4b(1);
            MessageReplyActivity.A0z(messageReplyActivity);
            MessageReplyActivity.A0w(messageReplyActivity);
        }
    }

    public /* synthetic */ AnonymousClass7ER(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }
}
