package X;

/* renamed from: X.2Wk  reason: invalid class name and case insensitive filesystem */
public abstract class C50952Wk {
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
        A10.append(" FROM ");
        A10.append("message AS message");
        A10.append(" LEFT JOIN ");
        A10.append("message_ui_elements AS content");
        A10.append(" ON ");
        String A0Y = C17890vO.A0Y("message._id = content.message_row_id", A10);
        String A0X = C17890vO.A0X("content.element_type = ?", A10);
        A10.append("message.chat_row_id = ?");
        A10.append(A0X);
        A10.append("message.timestamp > ?");
        A10.append(" ORDER BY message.sort_id DESC ");
        A02 = AnonymousClass000.A0y(" LIMIT 100", A10);
        AnonymousClass1H2.A01("message", strArr);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message", strArr), " FROM ", "message AS message", A11);
        C17890vO.A10(" JOIN ", "message_ui_elements AS content", A0Y, A11);
        A11.append("content.message_row_id = message._id");
        A11.append(A0X);
        A11.append("message.from_me = 1 AND ");
        A11.append("content.element_type = 4");
        A11.append(" ORDER BY message.sort_id DESC ");
        A01 = AnonymousClass000.A0y("LIMIT ?, ?", A11);
        StringBuilder A112 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(AnonymousClass1H2.A01("message", strArr), " FROM ", "message AS message", " LEFT JOIN ", A112);
        C17900vP.A0c("message_ui_elements AS content", " ON ", "message._id = content.message_row_id", A0Y, A112);
        A112.append("content.element_type = 4");
        A04 = AnonymousClass001.A1H(" ORDER BY message.sort_id DESC ", " LIMIT 100", A112);
        StringBuilder A113 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message", strArr), " FROM ", "message", A113);
        A113.append(" AS message WHERE ");
        A113.append("key_id = ?");
        A113.append(A0X);
        A03 = AnonymousClass000.A0y("_id IN ( SELECT DISTINCT message_row_id FROM message_ui_elements WHERE element_type = 4)", A113);
        StringBuilder A114 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(AnonymousClass1H2.A01("message", strArr), " FROM ", "message", " AS message WHERE ", A114);
        A114.append("key_id = ?");
        A114.append(A0X);
        A00 = AnonymousClass000.A0y("_id IN ( SELECT DISTINCT message_row_id FROM message_ui_elements WHERE element_type = 9)", A114);
    }
}
