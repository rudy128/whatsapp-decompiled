package X;

/* renamed from: X.14n  reason: invalid class name and case insensitive filesystem */
public final class C210614n implements AnonymousClass12T, AnonymousClass137 {
    public void BHt(C23141Ev r3) {
        C18070vi.A0d(r3, 0);
        String A00 = C28331Zy.A00(r3, "table", "message_newsletter_fts");
        C18070vi.A0X(A00);
        if (A00.length() == 0) {
            r3.A0E("CREATE VIRTUAL TABLE message_newsletter_fts USING FTS4(content, fts_jid, fts_namespace)", "CREATE_MESSAGE_NEWSLETTER_FTS_TABLE");
        }
    }

    public /* synthetic */ void BLp(AnonymousClass1F1 r1, AnonymousClass1F5 r2) {
    }

    public /* bridge */ /* synthetic */ void BLt(AnonymousClass1F3 r2) {
        C18070vi.A0d(r2, 0);
        r2.CE7(this, "message_newsletter_fts");
    }

    public /* bridge */ /* synthetic */ void BLv(AnonymousClass1F4 r5) {
        C18070vi.A0d(r5, 0);
        r5.CE9(C25071Mt.A01("message", "message_newsletter_fts", (String) null, "docid=old._id"), "message_newsletter_fts");
    }
}
