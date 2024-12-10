package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.22A  reason: invalid class name */
public class AnonymousClass22A extends AnonymousClass212 implements AnonymousClass229 {
    public int A00;
    public int A01;
    public long A02;

    public void A1B(Cursor cursor, AnonymousClass1DL r6, HashMap hashMap) {
        super.A1B(cursor, r6, hashMap);
        int A012 = AnonymousClass1Eu.A01("sender_timestamp", hashMap);
        int A013 = AnonymousClass1Eu.A01("keep_in_chat_state", hashMap);
        int A014 = AnonymousClass1Eu.A01("keep_count", hashMap);
        long j = cursor.getLong(A012);
        int i = cursor.getInt(A013);
        int i2 = cursor.getInt(A014);
        this.A02 = j;
        this.A01 = i;
        this.A00 = i2;
    }
}
