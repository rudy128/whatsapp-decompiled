package X;

/* renamed from: X.9Tv  reason: invalid class name and case insensitive filesystem */
public abstract class C182299Tv {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n           SELECT ");
        String[] strArr = C208113o.A00;
        AnonymousClass1H2.A02("message_orphan", A10, strArr);
        A00 = AnonymousClass000.A0y("\n           FROM message_orphan\n           WHERE \n              orphan_message_type = ? \n              AND _id > ?\n           ORDER BY _id ASC \n           LIMIT ?\n      ", A10);
        StringBuilder A11 = AnonymousClass000.A11("\n           SELECT ");
        AnonymousClass1H2.A02("message_orphan", A11, strArr);
        A01 = AnonymousClass000.A0y("\n           FROM message_orphan\n           WHERE \n              orphan_message_type = ? \n              AND _id > ?\n              AND parent_chat_row_id = ?\n              AND parent_from_me = ?\n              And parent_key_id = ?\n           ORDER BY _id ASC \n           LIMIT ?\n      ", A11);
        AnonymousClass1H2.A01("message_orphan", strArr);
    }
}
