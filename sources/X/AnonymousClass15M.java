package X;

import android.util.Pair;

@Deprecated
/* renamed from: X.15M  reason: invalid class name */
public final class AnonymousClass15M implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("reporting_token", "reporting_token_timestamp_index", "CREATE INDEX IF NOT EXISTS reporting_token_timestamp_index ON reporting_token (timestamp)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "message_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A02 = "reporting_tag";
        C25041Mq r1 = C25041Mq.BLOB;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "reporting_token_content";
        obj.A00 = r1;
        obj.A02 = "version";
        obj.A00 = r4;
        obj.A02 = "timestamp";
        obj.A00 = r4;
        r7.CE6("reporting_token", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r4) {
        C18070vi.A0d(r4, 0);
        Pair A00 = C25061Ms.A00("reporting_token");
        r4.CE8("reporting_token", (String) A00.first, (String) A00.second);
    }
}
