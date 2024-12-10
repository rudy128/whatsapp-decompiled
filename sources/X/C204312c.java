package X;

/* renamed from: X.12c  reason: invalid class name and case insensitive filesystem */
public final class C204312c implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDt("lid_display_name", "lid_display_name_upper_username_index", "\n            CREATE INDEX IF NOT EXISTS lid_display_name_upper_username_index\n            ON lid_display_name (UPPER(username), lid_row_id)\n            ");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        C18070vi.A0d(r6, 0);
        ? obj = new Object();
        obj.A02 = "lid_row_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A04 = true;
        obj.A02 = "display_name";
        C25041Mq r1 = C25041Mq.TEXT;
        obj.A00 = r1;
        obj.A04 = true;
        obj.A02 = "username";
        obj.A00 = r1;
        r6.CE6("lid_display_name", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
