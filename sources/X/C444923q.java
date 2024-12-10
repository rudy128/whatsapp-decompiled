package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.23q  reason: invalid class name and case insensitive filesystem */
public class C444923q extends AnonymousClass212 {
    public int A00 = 0;

    public C444923q(AnonymousClass205 r3, A51 a51, long j, long j2) {
        super(r3, 86, j);
        this.A05 = a51;
        this.A04 = null;
        this.A02 = j2;
        this.A01 = a51.A01.A02 ? 7 : 8;
        this.A00 = 1;
    }

    public void A1B(Cursor cursor, AnonymousClass1DL r7, HashMap hashMap) {
        int i;
        super.A1B(cursor, r7, hashMap);
        int A01 = AnonymousClass1Eu.A01("edit_type", hashMap);
        int A012 = AnonymousClass1Eu.A01("message_edit_version", hashMap);
        int i2 = cursor.getInt(A01);
        int i3 = 0;
        if (cursor.isNull(A012)) {
            i = 0;
        } else {
            i = cursor.getInt(A012);
        }
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessageScheduledCallEdit/fillMessageAddOn unknown edit type: ");
            sb.append(i2);
            Log.e(sb.toString());
            i2 = 0;
        }
        if (i == 7 || i == 8) {
            i3 = i;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FMessageScheduledCallEdit/fillMessageAddOn unknown edit version: ");
            sb2.append(i);
            Log.e(sb2.toString());
        }
        this.A00 = i2;
        this.A01 = i3;
    }
}
