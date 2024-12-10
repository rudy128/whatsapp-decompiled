package X;

/* renamed from: X.12v  reason: invalid class name and case insensitive filesystem */
public final class C206212v implements AnonymousClass12T {
    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "composition_row_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A04 = true;
        obj.A02 = "media_uri";
        C25041Mq r2 = C25041Mq.TEXT;
        obj.A00 = r2;
        obj.A02 = "media_duration_in_seconds";
        obj.A00 = r4;
        obj.A02 = "media_name";
        obj.A00 = r2;
        obj.A02 = "file_length";
        obj.A00 = r4;
        r7.CE6("composition_media", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("composition", "composition_media", (String) null, "composition_row_id=old._id"), "composition_media");
    }
}
