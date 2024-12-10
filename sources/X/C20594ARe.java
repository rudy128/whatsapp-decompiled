package X;

/* renamed from: X.ARe  reason: case insensitive filesystem */
public class C20594ARe implements AnonymousClass12T {
    public /* synthetic */ void BLv(AnonymousClass1F4 r1) {
    }

    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        r5.CDx("wa_biz_category_service_offerings", "biz_category_id_service_offerings_index", " CREATE UNIQUE INDEX IF NOT EXISTS biz_category_id_service_offerings_index ON wa_biz_category_service_offerings(_id, category_id);");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r6) {
        ? obj = new Object();
        C25031Mp[] r3 = new C25031Mp[4];
        obj.A02 = "_id";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A0D();
        obj.A04 = true;
        r3[0] = obj.A0B();
        obj.A02 = "category_id";
        obj.A00 = r2;
        C25021Mo.A07(obj, r3);
        obj.A02 = "category_name";
        C25021Mo.A04(obj, r2, r3);
        AnonymousClass8BR.A1F(obj, r2, "offering_name");
        C25021Mo.A08(obj, r3);
        r6.CE6("wa_biz_category_service_offerings", r3);
    }
}
