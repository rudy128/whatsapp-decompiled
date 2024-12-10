package X;

/* renamed from: X.2Vl  reason: invalid class name and case insensitive filesystem */
public abstract class C50702Vl {
    public static final String A00;

    static {
        StringBuilder A0e = C17890vO.A0e();
        A0e.append(C209514c.A00);
        A0e.append(", deleted_msg.remove_files AS remove_files FROM ");
        A0e.append("deleted_messages_view");
        A0e.append(" AS deleted_msg  WHERE ");
        A0e.append("chat_row_id");
        A0e.append(" = ? AND ");
        A0e.append("message_type");
        A0e.append(" != ");
        A0e.append(8);
        A0e.append(" ORDER BY sort_id ASC");
        A00 = AnonymousClass000.A0y(" LIMIT ?", A0e);
    }
}
