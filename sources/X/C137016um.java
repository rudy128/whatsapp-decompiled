package X;

import android.app.Notification;
import android.net.Uri;

/* renamed from: X.6um  reason: invalid class name and case insensitive filesystem */
public abstract class C137016um {
    public static Notification.MessagingStyle.Message A00(CharSequence charSequence, CharSequence charSequence2, long j) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static void A01(Notification.MessagingStyle.Message message, Uri uri, String str) {
        message.setData(str, uri);
    }
}
