package X;

/* renamed from: X.2WN  reason: invalid class name */
public abstract class AnonymousClass2WN {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SELECT ");
        String[] strArr = C209514c.A01;
        AnonymousClass1H2.A02("available_message_view", A10, strArr);
        A00 = AnonymousClass000.A0y(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ? AND available_message_view.message_type != 15", A10);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        AnonymousClass1H2.A02("available_message_view", A11, strArr);
        A01 = AnonymousClass000.A0y(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ?", A11);
    }
}
