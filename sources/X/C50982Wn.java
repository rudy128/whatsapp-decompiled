package X;

/* renamed from: X.2Wn  reason: invalid class name and case insensitive filesystem */
public abstract class C50982Wn {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = C209514c.A01;
        AnonymousClass1H2.A02("message_view", A10, strArr);
        A10.append(" FROM ");
        A10.append("message_view_once_media view_once ");
        A10.append(" JOIN message message_view  ON view_once.message_row_id=message_view._id");
        String A0Y = C17890vO.A0Y(" JOIN message_media message_media  ON message_media.message_row_id =  message_view._id", A10);
        A10.append("message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ");
        A04 = AnonymousClass000.A0y(" LIMIT ?", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A11);
        A11.append(" JOIN message message_view  JOIN message_media message_media  WHERE view_once.message_row_id=message_view._id AND message_media.message_row_id =  message_view._id");
        C17890vO.A10(" AND ", "message_media.file_size != 0 AND message_view.from_me = 0  AND view_once.state IN (1, 2) ", " LIMIT ?", A11);
        A05 = A11.toString();
        StringBuilder A112 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A112);
        A112.append(" JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id");
        A112.append(A0Y);
        A112.append("view_once.state = 0");
        A112.append(" AND ");
        A02 = AnonymousClass000.A0y("message_view.from_me = 0", A112);
        StringBuilder A113 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A113);
        C17890vO.A10(" JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id", " AND ", "view_once.state = 0", A113);
        A03 = AnonymousClass001.A1H(" AND ", "message_view.from_me = 0", A113);
        StringBuilder A114 = AnonymousClass000.A11("SELECT ");
        C17900vP.A0c(AnonymousClass1H2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", " JOIN message message_view  ON view_once.message_row_id=message_view._id", A114);
        A114.append(A0Y);
        A00 = AnonymousClass001.A1H("message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A114);
        StringBuilder A115 = AnonymousClass000.A11("SELECT ");
        C17890vO.A10(AnonymousClass1H2.A01("message_view", strArr), " FROM ", "message_view_once_media view_once ", A115);
        C17900vP.A0c(" JOIN message message_view  WHERE view_once.message_row_id=message_view._id", " AND ", "message_view.timestamp <= ?  AND view_once.state = 0", " LIMIT ?", A115);
        A01 = A115.toString();
    }
}
