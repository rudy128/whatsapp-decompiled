package X;

/* renamed from: X.12w  reason: invalid class name and case insensitive filesystem */
public final class C206312w implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("composition_mention", "composition_mention_unique_composition_row_id_index", "\n        CREATE UNIQUE INDEX IF NOT EXISTS\n        composition_mention_unique_composition_row_id_index on composition_mention (composition_row_id, jid_row_id)\n        ");
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
        obj.A02 = "composition_row_id";
        obj.A00 = r2;
        obj.A04 = true;
        obj.A02 = "jid_row_id";
        obj.A00 = r2;
        obj.A04 = true;
        r7.CE6("composition_mention", obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("composition", "composition_mention", (String) null, "composition_row_id=old._id"), "composition_mention");
    }
}
