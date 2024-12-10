package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.22C  reason: invalid class name */
public final class AnonymousClass22C extends AnonymousClass212 implements AnonymousClass226, AnonymousClass229 {
    public int A00;
    public long A01;

    public void A1B(Cursor cursor, AnonymousClass1DL r5, HashMap hashMap) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(cursor, 1);
        C18070vi.A0d(hashMap, 2);
        super.A1B(cursor, r5, hashMap);
        int A012 = AnonymousClass1Eu.A01("sender_timestamp", hashMap);
        int A013 = AnonymousClass1Eu.A01("pin_in_chat_state", hashMap);
        this.A01 = cursor.getLong(A012);
        this.A00 = cursor.getInt(A013);
    }

    public AnonymousClass22C(AnonymousClass205 r2, long j) {
        super(r2, 79, j);
        this.A01 = 2;
    }

    public String BUl() {
        return "inactive";
    }
}
