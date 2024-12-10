package X;

/* renamed from: X.12o  reason: invalid class name and case insensitive filesystem */
public class C205512o implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("call_link", "call_link_token_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_link_token_index ON call_link(token)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r3 = C25041Mq.INTEGER;
        obj.A00 = r3;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "token";
        obj.A00 = C25041Mq.TEXT;
        obj.A04 = true;
        obj.A02 = "creator_jid_row_id";
        obj.A00 = r3;
        obj.A04 = true;
        obj.A01 = "0";
        r7.CE6("call_link", obj.A0B(), obj.A0B(), obj.A0B());
    }
}
