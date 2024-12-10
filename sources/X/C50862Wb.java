package X;

/* renamed from: X.2Wb  reason: invalid class name and case insensitive filesystem */
public abstract class C50862Wb {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        String[] strArr = C209514c.A01;
        String A012 = AnonymousClass1H2.A01("available_message_view", strArr);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n              SELECT ");
        A10.append(A012);
        A02 = AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n              FROM message_comment\n              JOIN available_message_view\n              WHERE message_comment.message_row_id = available_message_view._id\n                AND\n                parent_message_row_id = ?\n                AND\n                sort_id < ?\n              ORDER BY sort_id DESC\n              LIMIT ?\n          ", A10));
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("\n        SELECT\n            ");
        AnonymousClass1H2.A02("available_message_view", A102, strArr);
        A00 = AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        FROM message_comment\n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC\n        ", A102));
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("\n        SELECT \n            ");
        AnonymousClass1H2.A02("available_message_view", A103, strArr);
        A01 = AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        FROM message_comment \n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC \n        LIMIT ?\n        ", A103));
    }
}
