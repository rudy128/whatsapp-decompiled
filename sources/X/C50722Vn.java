package X;

/* renamed from: X.2Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C50722Vn {
    public static final String A00;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n        SELECT\n            ");
        AnonymousClass1H2.A02("available_message_view", A10, C209514c.A01);
        A00 = AnonymousClass1Y7.A01(AnonymousClass000.A0y("\n        FROM message_association\n        JOIN available_message_view \n        WHERE\n            message_association.child_message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n            AND\n            association_type = ?\n        ORDER BY sort_id\n        ASC\n        ", A10));
    }
}
