package X;

/* renamed from: X.2Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C50752Vq {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        AnonymousClass1H2.A02("message", A0e, C209514c.A01);
        A0e.append(" FROM ");
        A0e.append("message AS message");
        A0e.append(" JOIN ");
        C17890vO.A17(A0e, "status AS status_list");
        C17890vO.A18(A0e, "status_list.jid_row_id = message.sender_jid_row_id");
        String A0X = C17890vO.A0X("message.chat_row_id = ?", A0e);
        A0e.append("message.from_me = 0");
        A0e.append(A0X);
        A0e.append("status_list.last_read_message_table_id >= message._id");
        A0e.append(A0X);
        A0e.append("status_list.last_read_receipt_sent_message_table_id < message._id");
        A0e.append(A0X);
        A0e.append("status_list.last_read_receipt_sent_message_table_id > 0");
        A0e.append(A0X);
        A0e.append("message.message_type != 15");
        A0e.append(" ORDER BY message.");
        A0e.append("_id");
        A00 = AnonymousClass000.A0y(" DESC LIMIT 4096", A0e);
    }
}
