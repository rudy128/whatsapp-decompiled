package X;

/* renamed from: X.2WL  reason: invalid class name */
public abstract class AnonymousClass2WL {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String str = C209514c.A00;
        A10.append(str);
        A10.append(" FROM ");
        A10.append("message_ephemeral ephemeral");
        A10.append(" JOIN ");
        C17890vO.A17(A10, "message messages");
        String A0Y = C17890vO.A0Y("ephemeral.message_row_id = messages._id", A10);
        String A0X = C17890vO.A0X("ephemeral.keep_in_chat != 1", A10);
        A10.append("ephemeral.expire_timestamp < ?");
        A00 = AnonymousClass000.A0y(" LIMIT ?", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message_ephemeral ephemeral", A102);
        A102.append(" JOIN ");
        C17900vP.A0c("available_message_view messages", A0Y, "ephemeral.message_row_id = messages._id", A0X, A102);
        C17900vP.A0c("ephemeral.keep_in_chat != 1", A0X, "ephemeral.expire_timestamp < ?", " LIMIT ?", A102);
        A01 = A102.toString();
    }
}
