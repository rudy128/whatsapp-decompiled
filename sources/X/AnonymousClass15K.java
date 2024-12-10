package X;

/* renamed from: X.15K  reason: invalid class name */
public final class AnonymousClass15K implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("reporting_info_content", "reporting_info_row_id_index", "CREATE INDEX IF NOT EXISTS reporting_info_row_id_index ON reporting_info_content (reporting_info_row_id)");
        r5.CDx("reporting_info_content", "reporting_info_content_receive_timestamp_index", "CREATE INDEX IF NOT EXISTS reporting_info_content_receive_timestamp_index ON reporting_info_content (receive_timestamp)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r5 = C25041Mq.INTEGER;
        obj.A00 = r5;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "reporting_info_row_id";
        obj.A00 = r5;
        obj.A04 = true;
        obj.A06 = true;
        obj.A02 = "reporting_token";
        C25041Mq r3 = C25041Mq.BLOB;
        obj.A00 = r3;
        obj.A02 = "reporting_token_content";
        obj.A00 = r3;
        obj.A02 = "reporting_token_version";
        obj.A00 = r5;
        obj.A02 = "receive_timestamp";
        obj.A00 = C25041Mq.LONG;
        obj.A02 = "reporting_token_key";
        obj.A00 = r3;
        r7.CE6("reporting_info_content", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("reporting_info", "reporting_info_content", (String) null, "reporting_info_row_id=old._id"), "reporting_info_content");
    }
}
