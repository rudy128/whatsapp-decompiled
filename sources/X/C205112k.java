package X;

import android.util.Pair;

/* renamed from: X.12k  reason: invalid class name and case insensitive filesystem */
public class C205112k implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("bot_message_info", "bot_message_info_target_id_index", " CREATE INDEX IF NOT EXISTS bot_message_info_target_id_index ON bot_message_info(target_id);");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A02 = "target_id";
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A00 = r3;
        obj.A02 = "message_state";
        obj.A00 = r5;
        obj.A0E(0);
        obj.A02 = "invoker_jid_row_id";
        obj.A00 = r5;
        obj.A02 = "model_type";
        obj.A00 = r5;
        obj.A02 = "message_disclaimer";
        obj.A00 = r3;
        obj.A02 = "keyword_json";
        obj.A00 = r3;
        r8.CE6("bot_message_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        Pair A00 = C25061Ms.A00("bot_message_info");
        r4.CE8("bot_message_info", (String) A00.first, (String) A00.second);
    }
}
