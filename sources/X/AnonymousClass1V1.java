package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1V1  reason: invalid class name */
public class AnonymousClass1V1 {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public static C54252dq A00(AnonymousClass1V1 r12, AnonymousClass1EC r13) {
        Cursor A0A;
        C54252dq r6;
        C54252dq r0;
        Map map = r12.A02;
        synchronized (map) {
            String[] strArr = {Long.toString(r12.A00.A09(r13))};
            C28781at A04 = r12.A01.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT subject_timestamp, announcement_version, group_join_request_timestamp FROM group_notification_version WHERE group_jid_row_id = ?", "GET_GROUP_NOTIFICATION_VERSION_SQL", strArr);
                if (A0A == null || !A0A.moveToNext()) {
                    r6 = new C54252dq(0, 0, 0);
                } else {
                    r6 = new C54252dq(A0A.getLong(A0A.getColumnIndexOrThrow("subject_timestamp")), A0A.getLong(A0A.getColumnIndexOrThrow("announcement_version")), AnonymousClass1Eu.A02(A0A, A0A.getColumnIndexOrThrow("group_join_request_timestamp"), 0));
                }
                map.put(r13, r6);
                if (A0A != null) {
                    A0A.close();
                }
                A04.close();
                r0 = (C54252dq) map.get(r13);
                C17960vV.A07(r0);
            } catch (Throwable th) {
                try {
                    A04.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw th;
            }
        }
        return r0;
        throw th;
    }

    public static void A01(AnonymousClass1V1 r7, AnonymousClass1EC r8, long j, long j2, long j3) {
        C28791au A05 = r7.A01.A05();
        try {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("group_jid_row_id", Long.valueOf(r7.A00.A09(r8)));
            contentValues.put("subject_timestamp", Long.valueOf(j));
            contentValues.put("announcement_version", Long.valueOf(j2));
            contentValues.put("participant_version", 0L);
            contentValues.put("group_join_request_timestamp", Long.valueOf(j3));
            ((C28801av) A05).A02.A05("group_notification_version", "INSERT_GROUP_NOTIFICATION_VERSION", contentValues);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1V1(AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
