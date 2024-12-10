package X;

import android.util.Pair;

/* renamed from: X.13U  reason: invalid class name */
public final class AnonymousClass13U implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_bot_feedback", "message_bot_feedback_index", "CREATE INDEX IF NOT EXISTS message_bot_feedback_index ON message_bot_feedback (bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r9) {
        C18070vi.A0d(r9, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "bot_feedback_kind";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "bot_feedback_text";
        C25041Mq r7 = C25041Mq.TEXT;
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "bot_feedback_key_remote_jid";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "bot_feedback_key_from_me";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A02 = "bot_feedback_key_id";
        obj.A00 = r7;
        obj.A04 = true;
        obj.A02 = "bot_feedback_kind_positive";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "bot_feedback_kind_negative";
        obj.A00 = r4;
        obj.A04 = true;
        obj.A0E(0);
        r9.CE6("message_bot_feedback", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("message_bot_feedback");
        r4.CE8("message_bot_feedback", (String) A00.first, (String) A00.second);
    }
}
