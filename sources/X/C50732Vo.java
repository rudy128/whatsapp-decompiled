package X;

/* renamed from: X.2Vo  reason: invalid class name and case insensitive filesystem */
public abstract class C50732Vo {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        A0e.append(C209514c.A00);
        A0e.append(" FROM ");
        A0e.append("message_edit_info");
        A0e.append(" JOIN message ON ");
        C17890vO.A18(A0e, "message._id = message_edit_info.message_row_id");
        A0e.append("original_key_id = ? AND ");
        A0e.append("chat_row_id = ? AND ");
        A00 = AnonymousClass000.A0y("from_me = ?", A0e);
    }
}
