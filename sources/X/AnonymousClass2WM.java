package X;

/* renamed from: X.2WM  reason: invalid class name */
public abstract class AnonymousClass2WM {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String str = C209514c.A00;
        A10.append(str);
        A01 = AnonymousClass000.A0y(", docid, content, fts_jid FROM message_newsletter_fts AS fts JOIN available_message_view AS message WHERE fts.docid = message._id AND message_newsletter_fts MATCH ? ", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        A11.append(str);
        A00 = AnonymousClass000.A0y(", docid, content, fts_jid FROM message_newsletter_fts AS fts JOIN available_message_view AS message ON fts.docid = message._id WHERE message_newsletter_fts MATCH ? ", A11);
    }
}
