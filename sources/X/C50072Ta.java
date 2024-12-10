package X;

import android.content.ContentValues;

/* renamed from: X.2Ta  reason: invalid class name and case insensitive filesystem */
public abstract class C50072Ta {
    public static final void A00(ContentValues contentValues, String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        contentValues.put(str, i);
    }
}
