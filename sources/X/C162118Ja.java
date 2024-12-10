package X;

/* renamed from: X.8Ja  reason: invalid class name and case insensitive filesystem */
public class C162118Ja extends C188939iF {
    public C188649hl A00;
    public final A6D A01;

    public static final void A00(BE3 be3) {
        be3.BKj("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        A10.append("7d73d21f1bd82c9e5268b6dcf9fde2cb");
        be3.BKj(AnonymousClass000.A0y("')", A10));
    }

    public C162118Ja(C188649hl r1, A6D a6d) {
        this.A00 = r1;
        this.A01 = a6d;
    }
}
