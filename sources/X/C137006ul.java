package X;

import android.app.Notification;
import android.app.Person;

/* renamed from: X.6ul  reason: invalid class name and case insensitive filesystem */
public abstract class C137006ul {
    public static Notification.MessagingStyle A00(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static void A01(Notification.MessagingStyle messagingStyle, boolean z) {
        messagingStyle.setGroupConversation(z);
    }
}
