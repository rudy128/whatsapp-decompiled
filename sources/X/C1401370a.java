package X;

import android.app.Notification;

/* renamed from: X.70a  reason: invalid class name and case insensitive filesystem */
public abstract class C1401370a {
    public static Notification.MessagingStyle A00(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    public static void A01(Notification.MessagingStyle.Message message, Notification.MessagingStyle messagingStyle) {
        messagingStyle.addMessage(message);
    }

    public static void A02(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        messagingStyle.setConversationTitle(charSequence);
    }
}
