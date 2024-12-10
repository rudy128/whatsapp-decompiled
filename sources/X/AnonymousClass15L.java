package X;

import android.util.Pair;

/* renamed from: X.15L  reason: invalid class name */
public final class AnonymousClass15L implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("reporting_info", "reporting_info_receive_timestamp_index", "CREATE INDEX IF NOT EXISTS reporting_info_receive_timestamp_index ON reporting_info (receive_timestamp)");
        r5.CDx("reporting_info", "reporting_info_send_timestamp_index", "CREATE INDEX IF NOT EXISTS reporting_info_send_timestamp_index ON reporting_info (send_timestamp)");
        r5.CDx("reporting_info", "reporting_info_message_row_id_index", "CREATE INDEX IF NOT EXISTS reporting_info_message_row_id_index ON reporting_info (message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_row_id";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "reporting_tag";
        obj.A00 = C25041Mq.BLOB;
        obj.A04 = true;
        obj.A02 = "stanza_id";
        obj.A00 = C25041Mq.STRING;
        obj.A02 = "send_timestamp";
        C25041Mq r22 = C25041Mq.LONG;
        obj.A00 = r22;
        obj.A02 = "receive_timestamp";
        obj.A00 = r22;
        obj.A02 = "stanza_id_text";
        obj.A00 = C25041Mq.TEXT;
        r7.CE6("reporting_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("reporting_info");
        r4.CE8("reporting_info", (String) A00.first, (String) A00.second);
    }
}
