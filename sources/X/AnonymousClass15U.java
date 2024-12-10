package X;

import android.util.Pair;

/* renamed from: X.15U  reason: invalid class name */
public class AnonymousClass15U implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r4) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        r4.CE6("suggest_as_you_type", obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        r4.CE8("suggest_as_you_type", "suggest_as_you_type_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggest_as_you_type_delete_oldest_trigger BEFORE INSERT ON suggest_as_you_type FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggest_as_you_type ) > 2000 BEGIN DELETE FROM suggest_as_you_type WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggest_as_you_type); END;");
        Pair A00 = C25061Ms.A00("suggest_as_you_type");
        r4.CE8("suggest_as_you_type", (String) A00.first, (String) A00.second);
    }
}
