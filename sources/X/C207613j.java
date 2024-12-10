package X;

/* renamed from: X.13j  reason: invalid class name and case insensitive filesystem */
public final class C207613j implements AnonymousClass12T {
    public /* bridge */ /* synthetic */ void BLp(AnonymousClass1F1 r4, AnonymousClass1F5 r5) {
        C18070vi.A0d(r5, 0);
        r5.CDx("message_media_interactive_annotation_vertex", "message_media_interactive_annotation_vertex_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_vertex_index ON message_media_interactive_annotation_vertex (message_media_interactive_annotation_row_id, sort_order)");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Mo, java.lang.Object] */
    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r7) {
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        obj.A02 = "_id";
        C25041Mq r4 = C25041Mq.INTEGER;
        obj.A00 = r4;
        obj.A05 = true;
        obj.A03 = true;
        obj.A02 = "message_media_interactive_annotation_row_id";
        obj.A00 = r4;
        obj.A02 = "x";
        C25041Mq r2 = C25041Mq.REAL;
        obj.A00 = r2;
        obj.A02 = "y";
        obj.A00 = r2;
        obj.A02 = "sort_order";
        obj.A00 = r4;
        r7.CE6("message_media_interactive_annotation_vertex", obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B(), obj.A0B());
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message_media_interactive_annotation", "message_media_interactive_annotation_vertex", (String) null, "message_media_interactive_annotation_row_id=old._id"), "message_media_interactive_annotation_vertex");
    }
}
