package X;

/* renamed from: X.2WP  reason: invalid class name */
public abstract class AnonymousClass2WP {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DROP TRIGGER IF EXISTS ");
        A01 = AnonymousClass000.A0y("peer_messages_bi_for_fanout_backfill_messages_trigger", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("DROP INDEX IF EXISTS ");
        A00 = AnonymousClass000.A0y("peer_messages_message_key_index", A102);
    }
}
