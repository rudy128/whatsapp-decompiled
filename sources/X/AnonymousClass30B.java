package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.30B  reason: invalid class name */
public class AnonymousClass30B implements C72113Kr {
    public final AnonymousClass11P A00;
    public final C27081Uq A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void Bqf() {
        Cursor A0A;
        C27081Uq r3 = this.A01;
        ArrayList A13 = AnonymousClass000.A13();
        String[] strArr = new String[3];
        C17890vO.A1F(strArr, 1);
        C17880vN.A1V(strArr, 1, 0);
        C17880vN.A1V(strArr, 2, System.currentTimeMillis() - 900000);
        AnonymousClass1Cd r5 = r3.A03;
        C28781at A04 = r5.get();
        try {
            A0A = ((C28801av) A04).A02.A0A(" SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = ?  AND scheduled_timestamp > ?  AND scheduled_timestamp <= ? ", "ScheduledCallsStoreSELECT_UPCOMING_SCHEDULED_CALLS_IN_TIMERANGE", strArr);
            while (A0A.moveToNext()) {
                C59822mw A002 = C27081Uq.A00(A0A, r3);
                if (A002 != null) {
                    A13.add(A002);
                }
            }
            A0A.close();
            A04.close();
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                long j = ((C59822mw) it.next()).A02;
                C17880vN.A1R(A132, j);
                ((C35311m1) this.A02.get()).A00(j);
            }
            if (A132.size() > 0) {
                AnonymousClass2FD r1 = new AnonymousClass2FD();
                r1.A00 = Long.valueOf((long) A132.size());
                ((C52602bB) this.A03.get()).A00.CC7(r1);
            }
            int size = A132.size();
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                strArr2[i] = String.valueOf(A132.get(i));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("creation_message_row_id IN ");
            String A0y = AnonymousClass000.A0y(AnonymousClass1H2.A00(size), A10);
            C28791au A05 = r5.A05();
            try {
                ContentValues A09 = C17880vN.A09(1);
                A09.put("is_upcoming", false);
                if (((C28801av) A05).A02.A02(A09, "scheduled_calls", A0y, "ScheduledCallsStore/UPDATE_LIST_OF_SCHEDULED_CALLS_IS_UPCOMING_TO_FALSE", strArr2) == 0) {
                    Log.w("ScheduledCallsStore/updateListOfScheduledCallsIsUpcomingToFalse (by row ID) failed to update");
                }
                A05.close();
                C17880vN.A0L(r3.A04).A01(new C70573Bq(r3, 37), 67);
                return;
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A04.close();
            throw th;
        }
        throw th;
    }

    public AnonymousClass30B(AnonymousClass11P r1, C27081Uq r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
