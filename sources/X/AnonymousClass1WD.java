package X;

import android.content.ContentValues;

/* renamed from: X.1WD  reason: invalid class name */
public class AnonymousClass1WD {
    public final AnonymousClass1Cd A00;

    public static void A00(C28791au r4, AnonymousClass227 r5, long j) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("message_add_on_row_id", Long.valueOf(j));
        contentValues.put("reaction", r5.A01);
        contentValues.put("sender_timestamp", Long.valueOf(r5.A00));
        ((C28801av) r4).A02.A06("message_add_on_reaction", "MessageAddOnReactionStore/insertMessageAddOnReaction", contentValues);
    }

    public AnonymousClass1WD(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
