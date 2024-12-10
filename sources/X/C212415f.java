package X;

/* renamed from: X.15f  reason: invalid class name and case insensitive filesystem */
public class C212415f implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "user_jid_row_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A02 = "raw_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "expected_timestamp";
        obj.A00 = r3;
        obj.A02 = "expected_ts_last_device_job_ts";
        obj.A00 = r3;
        obj.A02 = "expected_timestamp_update_ts";
        obj.A00 = r3;
        obj.A02 = "account_encryption_type";
        obj.A00 = r3;
        r7.CE6("user_device_info", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("user_device_info", "user_device_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS user_device_info_index ON user_device_info (user_jid_row_id)");
        r5.CDx("user_device_info", "user_device_info_account_type_index", "CREATE INDEX IF NOT EXISTS user_device_info_account_type_index ON user_device_info (account_encryption_type)");
    }
}
