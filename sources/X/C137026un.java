package X;

import android.app.Notification;
import android.app.Person;

/* renamed from: X.6un  reason: invalid class name and case insensitive filesystem */
public abstract class C137026un {
    public static void A00(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static void A01(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }
}
