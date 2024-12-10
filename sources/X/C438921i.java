package X;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: X.21i  reason: invalid class name and case insensitive filesystem */
public class C438921i extends AnonymousClass21V {
    public int A00;
    public String A01;

    public String A1G() {
        if (TextUtils.isEmpty(this.A01)) {
            return A19();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append(A19());
        return sb.toString();
    }

    public void A1H(String str) {
        this.A01 = AnonymousClass1EG.A0E(str, 65536);
    }

    public C693336u A0O() {
        C693336u A0O = super.A0O();
        C17960vV.A07(A0O);
        return A0O;
    }

    public void A1A(Cursor cursor, C62572rc r3) {
        super.A1A(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
        A1H(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
    }

    public void A1B(Cursor cursor, C62572rc r3) {
        super.A1B(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
        A1H(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
    }
}
