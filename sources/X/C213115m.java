package X;

import android.util.Pair;

/* renamed from: X.15m  reason: invalid class name and case insensitive filesystem */
public class C213115m implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_add_on_poll_vote_selected_option", "message_add_on_poll_vote_selected_option_message_add_on_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_poll_vote_selected_option_message_add_on_row_id_index ON message_add_on_poll_vote_selected_option (message_add_on_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_add_on_row_id";
        obj.A00 = r3;
        obj.A02 = "message_poll_option_id";
        obj.A00 = r3;
        r7.CE6("message_add_on_poll_vote_selected_option", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        Pair A01 = C25071Mt.A01("message_add_on", "message_add_on_poll_vote_selected_option", (String) null, "message_add_on_row_id=old._id");
        r5.CE8("message_add_on_poll_vote_selected_option", (String) A01.first, (String) A01.second);
    }
}
