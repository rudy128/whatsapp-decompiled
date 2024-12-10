package X;

/* renamed from: X.12x  reason: invalid class name and case insensitive filesystem */
public final class C206412x implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("composition", "composition_chat_row_id_message_type_composition_type_index", "\n        CREATE INDEX IF NOT EXISTS\n        composition_chat_row_id_message_type_composition_type_index ON composition \n        (chat_row_id, message_type, composition_type)\n        ");
        r5.CDx("composition", "composition_timestamp_composition_type_index", "\n        CREATE INDEX IF NOT EXISTS\n        composition_timestamp_composition_type_index ON composition \n        (composition_type, timestamp)\n        ");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        C18070vi.A0d(r8, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "chat_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "quoted_message_row_id";
        obj.A00 = r3;
        obj.A02 = "timestamp";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "message_type";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "composition_type";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A02 = "text";
        obj.A00 = C25041Mq.TEXT;
        obj.A02 = "lookup_tables";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A0E(0);
        obj.A02 = "last_seen_timestamp";
        obj.A00 = r3;
        r8.CE6("composition", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("chat", "composition", (String) null, "chat_row_id=old._id"), "composition");
    }
}
