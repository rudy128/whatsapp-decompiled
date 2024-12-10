package X;

import android.util.Pair;

/* renamed from: X.15R  reason: invalid class name */
public class AnonymousClass15R implements AnonymousClass12T {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "status_message_row_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A02 = "crossposting_session_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "crossposting_status_unique_id";
        obj.A00 = r2;
        obj.A02 = "state";
        obj.A00 = r6;
        obj.A02 = "media_path";
        obj.A00 = r2;
        r8.CE6("status_crossposting", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("status_crossposting", "crossposting_session_id_index", "CREATE INDEX IF NOT EXISTS crossposting_session_id_index ON status_crossposting(crossposting_session_id)");
        r5.CDx("status_crossposting", "crossposting_state_index", "CREATE INDEX IF NOT EXISTS crossposting_state_index ON status_crossposting(state)");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message", "status_crossposting", (String) null, "status_message_row_id=old._id");
        r5.CE8("status_crossposting", (String) A01.first, (String) A01.second);
    }
}
