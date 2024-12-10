package X;

/* renamed from: X.12f  reason: invalid class name and case insensitive filesystem */
public class C204612f implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r6 = C25041Mq.INTEGER;
        obj.A00 = r6;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "session_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A06 = true;
        obj.A04 = true;
        obj.A02 = "media_type";
        obj.A00 = r6;
        obj.A04 = true;
        obj.A02 = "caption";
        obj.A00 = r2;
        obj.A02 = "master_key";
        obj.A00 = C25041Mq.BLOB;
        obj.A04 = true;
        r8.CE6("bcall_session", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }
}
