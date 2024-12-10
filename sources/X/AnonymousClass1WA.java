package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1WA  reason: invalid class name */
public class AnonymousClass1WA {
    public final AnonymousClass1Cd A00;

    public ArrayList A00(long j) {
        Cursor A0A;
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT _id, message_poll_option_id FROM message_add_on_poll_vote_selected_option WHERE message_add_on_row_id = ?", "GET_MESSAGE_ADD_ON_POLL_VOTE_SELECTED_OPTION_SQL", new String[]{Long.toString(j)});
            ArrayList arrayList = new ArrayList();
            if (A0A.moveToFirst()) {
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("message_poll_option_id");
                do {
                    arrayList.add(Long.valueOf(A0A.getLong(columnIndexOrThrow)));
                } while (A0A.moveToNext());
            }
            A0A.close();
            A04.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1WA(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
