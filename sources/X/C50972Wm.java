package X;

/* renamed from: X.2Wm  reason: invalid class name and case insensitive filesystem */
public abstract class C50972Wm {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String str = C209514c.A00;
        A10.append(str);
        A10.append(" FROM ");
        String A0Y = C17890vO.A0Y("message", A10);
        String A0X = C17890vO.A0X("chat_row_id = ?", A10);
        A10.append("sort_id > ?");
        A10.append(A0X);
        A10.append("sort_id <= ?");
        A10.append("ORDER BY ");
        A10.append("sort_id");
        A00 = AnonymousClass000.A0y(" ASC LIMIT 1024", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message", A102);
        A01 = AnonymousClass001.A1H(A0Y, "chat_row_id = ?", A102);
        StringBuilder A103 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message", A103);
        A103.append(A0Y);
        A103.append("chat_row_id = ?");
        A103.append(A0X);
        A03 = AnonymousClass000.A0y("sender_jid_row_id = ?", A103);
        StringBuilder A104 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message", A104);
        C17900vP.A0c(A0Y, "chat_row_id = ?", A0X, "sender_jid_row_id = ?", A104);
        A04 = A104.toString();
        StringBuilder A105 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message", A105);
        A105.append(A0Y);
        C17890vO.A10("from_me = 1", A0X, "chat_row_id = ?", A105);
        A05 = A105.toString();
        StringBuilder A106 = AnonymousClass000.A10();
        C17900vP.A0c("SELECT ", str, " FROM ", "message", A106);
        C17900vP.A0c(A0Y, "chat_row_id = ?", A0X, "sort_id > ?", A106);
        A106.append(" ORDER BY ");
        A02 = AnonymousClass000.A0y("sort_id ASC", A106);
    }
}
