package X;

/* renamed from: X.155  reason: invalid class name */
public class AnonymousClass155 implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r8) {
        ? obj = new Object();
        obj.A02 = "_id";
        obj.A00 = C25041Mq.INTEGER;
        obj.A05 = true;
        obj.A03 = true;
        C25041Mq r3 = C25041Mq.TEXT;
        obj.A02 = "content";
        obj.A00 = r3;
        obj.A04 = true;
        r8.CE6("quick_replies", obj.A0B(), new C25031Mp(r3, "title", "UNIQUE NOT NULL"), obj.A0B());
    }
}
