package X;

/* renamed from: X.13E  reason: invalid class name */
public final class AnonymousClass13E implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("jid_map", "jid_lid_map_jid_index", "CREATE INDEX IF NOT EXISTS jid_lid_map_jid_index\nON jid_map (jid_row_id)");
        r5.CDt("jid_map", "jid_map_sort_id_index", "CREATE INDEX IF NOT EXISTS jid_map_sort_id_index\nON jid_map (jid_row_id, sort_id)");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "lid_row_id";
        C25041Mq r2 = C25041Mq.INTEGER;
        obj.A00 = r2;
        obj.A05 = true;
        obj.A04 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "sort_id";
        obj.A00 = r2;
        r7.CE6("jid_map", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }
}
