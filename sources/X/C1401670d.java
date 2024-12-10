package X;

import android.app.Notification;

/* renamed from: X.70d  reason: invalid class name and case insensitive filesystem */
public abstract class C1401670d {
    public static void A00(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void A01(Notification.BubbleMetadata bubbleMetadata, Notification.Builder builder) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void A02(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }
}
