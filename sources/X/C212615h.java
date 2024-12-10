package X;

/* renamed from: X.15h  reason: invalid class name and case insensitive filesystem */
public class C212615h implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("message_vcard_jid", "message_vcard_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index ON message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "vcard_jid_row_id";
        obj.A00 = r3;
        obj.A02 = "vcard_row_id";
        obj.A00 = r3;
        obj.A02 = "message_row_id";
        obj.A00 = r3;
        r7.CE6("message_vcard_jid", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        r5.CE9(C25071Mt.A01("message_vcard", "message_vcard_jid", (String) null, "vcard_row_id=old._id"), "message_vcard_jid");
        r5.CE9(C25061Ms.A00("message_vcard_jid"), "message_vcard_jid");
    }
}
