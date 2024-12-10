package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.2PK  reason: invalid class name */
public class AnonymousClass2PK extends A34 {
    public final /* synthetic */ C40971vb A00;

    public AnonymousClass2PK(C40971vb r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A0A;
        C59822mw r7;
        Cursor A0A2;
        int i;
        C27081Uq r72 = this.A00.A0J;
        AnonymousClass1Cd r8 = r72.A03;
        C28781at A04 = r8.get();
        try {
            C23141Ev r6 = ((C28801av) A04).A02;
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = Long.toString(System.currentTimeMillis() - 900000);
            A0A = r6.A0A("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC  LIMIT 1", "ScheduledCallsStore/GET_NEAREST_UPCOMING_CALL", A1Y);
            if (!A0A.moveToFirst()) {
                A0A.close();
                A04.close();
                r7 = null;
            } else {
                r7 = C27081Uq.A00(A0A, r72);
                A0A.close();
                A04.close();
            }
            C28781at A042 = r8.get();
            try {
                C23141Ev r62 = ((C28801av) A042).A02;
                String[] A1Y2 = C17880vN.A1Y();
                A1Y2[0] = Long.toString(System.currentTimeMillis() - 900000);
                A0A2 = r62.A0A("SELECT COUNT(*) as count FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/GET_NUM_UPCOMING_CALLS", A1Y2);
                if (A0A2.moveToNext()) {
                    i = C17890vO.A01(A0A2, "count");
                    A0A2.close();
                    A042.close();
                } else {
                    A0A2.close();
                    A042.close();
                    i = 0;
                }
                return C17890vO.A0E(r7, i);
            } catch (Throwable th) {
                th = th;
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A04.close();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C40971vb r3 = this.A00;
        r3.A05 = null;
        Object obj2 = pair.first;
        if (obj2 != null || AnonymousClass000.A0M(pair.second) <= 0) {
            C59822mw r2 = (C59822mw) obj2;
            int A0M = AnonymousClass000.A0M(pair.second);
            C41031vh r0 = r3.A07;
            if (r0 != null) {
                CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
                callsHistoryFragmentViewModel.A01 = A0M;
                CallsHistoryFragmentViewModel.A07(callsHistoryFragmentViewModel, r2);
                CallsHistoryFragmentViewModel.A06(callsHistoryFragmentViewModel);
                return;
            }
            return;
        }
        Log.w("CallsHistoryDataSource/RefreshScheduledCallsTask/onPostExecute mismatch between data");
    }
}
