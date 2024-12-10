package X;

import android.database.Cursor;

/* renamed from: X.22g  reason: invalid class name and case insensitive filesystem */
public class C441322g extends AnonymousClass21V {
    public C1418377d A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public transient long A04;
    public transient AnonymousClass73B A05;
    public transient Integer A06;

    public boolean A1G() {
        AnonymousClass73B r0 = this.A05;
        if ((r0 == null || !r0.A0B) && !this.A02) {
            return false;
        }
        return true;
    }

    public boolean A1H() {
        Integer num = this.A01;
        if (num == null || (num.intValue() & 4) == 0) {
            return false;
        }
        return true;
    }

    public boolean A1I() {
        Integer num = this.A01;
        if (num == null || (num.intValue() & 1) == 0) {
            return false;
        }
        return true;
    }

    public void A1A(Cursor cursor, C62572rc r5) {
        Integer valueOf;
        super.A1A(cursor, r5);
        boolean A062 = AnonymousClass1Eu.A06(cursor, cursor.getColumnIndexOrThrow("is_animated_sticker"));
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sticker_flags");
        if (cursor.isNull(columnIndexOrThrow)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(cursor.getInt(columnIndexOrThrow));
        }
        this.A01 = valueOf;
        this.A03 = A062;
    }
}
