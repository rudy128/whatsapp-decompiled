package X;

import android.content.ContentValues;
import java.util.List;

/* renamed from: X.1Qa  reason: invalid class name and case insensitive filesystem */
public class C25891Qa {
    public final AnonymousClass11S A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1DL A02;
    public final AnonymousClass1Cd A03;

    public void A00(AnonymousClass206 r9) {
        C41851xA BD0;
        List<C70503Bi> list = r9.A0h;
        if (list != null && !list.isEmpty()) {
            C28791au A05 = this.A03.A05();
            try {
                BD0 = A05.BD0();
                for (C70503Bi r3 : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(r9.A0x));
                    contentValues.put("jid_row_id", Long.valueOf(this.A02.A09(r3.A00)));
                    contentValues.put("display_name", r3.A01);
                    ((C28801av) A05).A02.A09("message_mentions", "INSERT_TABLE_MESSAGE_MENTIONS", contentValues, 4);
                }
                BD0.A00();
                BD0.close();
                A05.close();
                return;
            } catch (Throwable th) {
                try {
                    A05.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C25891Qa(AnonymousClass11S r1, AnonymousClass1LW r2, AnonymousClass1DL r3, AnonymousClass1Cd r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }
}
