package X;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.227  reason: invalid class name */
public class AnonymousClass227 extends AnonymousClass212 implements AnonymousClass226 {
    public long A00;
    public String A01;
    public transient byte[] A02;

    public void A1E(String str) {
        this.A01 = str;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            i = 7;
        }
        this.A01 = i;
    }

    public void A1B(Cursor cursor, AnonymousClass1DL r5, HashMap hashMap) {
        super.A1B(cursor, r5, hashMap);
        int A012 = AnonymousClass1Eu.A01("reaction", hashMap);
        int A013 = AnonymousClass1Eu.A01("sender_timestamp", hashMap);
        String string = cursor.getString(A012);
        long j = cursor.getLong(A013);
        A1E(string);
        this.A00 = j;
    }

    public String BUl() {
        return "inactive";
    }
}
