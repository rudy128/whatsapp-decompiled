package X;

/* renamed from: X.2Wl  reason: invalid class name and case insensitive filesystem */
public abstract class C50962Wl {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String[] A04;

    static {
        String[] strArr = {"message_id", "sync_type", "chunk_order", "media_key", "media_hash", "media_enc_hash", "file_size", "direct_path", "local_path", "start_time", "inline_payload", "enc_handle"};
        A04 = strArr;
        String A0I = C200410p.A0I(", ", "", "", strArr);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("INSERT INTO history_sync_companion (");
        A10.append(A0I);
        A00 = AnonymousClass000.A0y(") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("UPDATE history_sync_companion SET ");
        A102.append(C200410p.A0I(" = ?,", "", " = ? ", strArr));
        A03 = AnonymousClass000.A0y(" WHERE message_id = ?", A102);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("SELECT ");
        A103.append(A0I);
        A01 = AnonymousClass000.A0y(" FROM history_sync_companion WHERE sync_type IN (?, ?, ?, ?) AND chunk_order = ? ORDER BY sync_type ASC", A103);
        StringBuilder A11 = AnonymousClass000.A11("SELECT ");
        A11.append(A0I);
        A02 = AnonymousClass000.A0y(" FROM history_sync_companion WHERE sync_type=? AND chunk_order=?", A11);
    }
}
