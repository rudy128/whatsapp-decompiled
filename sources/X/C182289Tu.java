package X;

/* renamed from: X.9Tu  reason: invalid class name and case insensitive filesystem */
public abstract class C182289Tu {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n      SELECT\n        id,\n        backup_id,\n        name,\n        upload_title,\n        mime_type,\n        md5_hash,\n        size_bytes,\n        upload_time,\n        state,\n        transaction_id,\n        metadata\n      FROM remote_files\n      WHERE backup_id = ?\n      AND state in (");
        A10.append(C179529Ii.TO_REMOVE.value);
        A10.append(", ");
        A10.append(C179529Ii.REMOVED.value);
        A00 = AnonymousClass8BW.A0k(")\n      ", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("\n      SELECT\n        id,\n        backup_id,\n        name,\n        upload_title,\n        mime_type,\n        md5_hash,\n        size_bytes,\n        upload_time,\n        state,\n        transaction_id,\n        metadata\n      FROM remote_files\n      WHERE backup_id = ?\n      AND state = ");
        A102.append(C179529Ii.UPLOADED.value);
        A01 = AnonymousClass8BW.A0k("\n      AND transaction_id = ?\n      ", A102);
    }
}
