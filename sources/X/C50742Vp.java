package X;

/* renamed from: X.2Vp  reason: invalid class name and case insensitive filesystem */
public abstract class C50742Vp {
    public static final String A00;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n        SELECT \n        ");
        AnonymousClass1H2.A02("message", A10, C209514c.A01);
        A00 = AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        , jid.raw_string AS raw_string\n        , 1 AS remove_files\n        FROM newsletter_message AS newsletter_message\n        JOIN available_message_view AS message\n        JOIN newsletter AS newsletter \n        JOIN chat_view AS chat\n        LEFT JOIN jid jid \n          ON jid._id = chat.jid_row_id\n        JOIN message_media AS media_message \n        WHERE newsletter_message.message_row_id = message._id \n        AND newsletter_message.chat_row_id = newsletter.chat_row_id \n        AND newsletter_message.chat_row_id = chat._id \n        AND newsletter_message.message_row_id = media_message.message_row_id \n        AND newsletter_message.is_autodelete_eligible = 1 \n        AND newsletter.membership = ? \n        AND message_type = 3\n        AND timestamp > ?\n        AND media_message.transferred = 1\n        ", A10));
    }
}
