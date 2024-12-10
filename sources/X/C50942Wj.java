package X;

/* renamed from: X.2Wj  reason: invalid class name and case insensitive filesystem */
public abstract class C50942Wj {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = C209514c.A01;
        AnonymousClass1H2.A02("message", A10, strArr);
        A10.append(", ");
        A10.append("file_size");
        A10.append(" FROM ");
        A10.append("message_media AS message_media");
        A10.append(" JOIN ");
        A10.append("available_message_view AS message");
        A10.append(" ON message_media.message_row_id = message._id");
        A10.append(" JOIN ");
        A10.append("message_forwarded AS message_forwarded");
        A10.append(" ON message_forwarded.message_row_id = message_media.message_row_id");
        A10.append(" LEFT JOIN ");
        A10.append("chat_view");
        A10.append(" AS chat ON message.");
        A10.append("chat_row_id");
        A10.append(" = chat.");
        String A0Y = C17890vO.A0Y("_id", A10);
        String A0X = C17890vO.A0X("message_forwarded.forward_score > ?", A10);
        A10.append("message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '105', '26')");
        A10.append(" AND (chat.chat_lock = 0");
        A10.append(" OR chat.chat_lock is NULL)");
        A01 = AnonymousClass000.A0y(" ORDER BY file_size DESC", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(AnonymousClass1H2.A01("message", strArr), ", ", "file_size", " FROM ", A11);
        A11.append("message_media AS message_media");
        A11.append(" JOIN ");
        C17900vP.A0c("available_message_view AS message", " JOIN ", "message_forwarded AS message_forwarded", " LEFT JOIN ", A11);
        A11.append("chat_view AS chat");
        A11.append(" WHERE message_media.message_row_id = message._id");
        A11.append(" AND message_forwarded.message_row_id = message_media.message_row_id");
        A11.append(" AND message.chat_row_id = chat._id");
        A11.append(A0X);
        C17900vP.A0c("message_forwarded.forward_score > ?", A0X, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '105', '26')", " AND (chat.chat_lock = 0", A11);
        A02 = AnonymousClass001.A1H(" OR chat.chat_lock is NULL)", " ORDER BY file_size DESC", A11);
        StringBuilder A112 = AnonymousClass000.A11("SELECT ");
        AnonymousClass1H2.A02("message", A112, strArr);
        A112.append(", ");
        C17900vP.A0c("message_forwarded.forward_score", " FROM ", "available_message_view AS message", " JOIN ", A112);
        A112.append("message_forwarded AS message_forwarded");
        C17900vP.A0c(" ON message_forwarded.message_row_id = message._id", " LEFT JOIN ", "chat_view", " AS chat ON message.", A112);
        C17900vP.A0c("chat_row_id", " = chat.", "_id", A0Y, A112);
        C17900vP.A0c("message_forwarded.forward_score >= ?", A0X, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '105', '26')", " AND (chat.chat_lock = 0", A112);
        String A0y = AnonymousClass000.A0y(" OR chat.chat_lock is NULL)", A112);
        A04 = AnonymousClass000.A0y(" ORDER BY sort_id DESC", AnonymousClass000.A11(A0y));
        A03 = AnonymousClass000.A0y(" ORDER BY sort_id ASC", AnonymousClass000.A11(A0y));
        A00 = AnonymousClass000.A0y(" ORDER BY message_forwarded.forward_score DESC", AnonymousClass000.A11(A0y));
    }
}
