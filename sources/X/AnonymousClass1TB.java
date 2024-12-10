package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1TB  reason: invalid class name */
public class AnonymousClass1TB {
    public final AnonymousClass1T9 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1LY A03;
    public final AnonymousClass1DL A04;
    public final AnonymousClass1TA A05;
    public final AnonymousClass1Cd A06;
    public final C18030ve A07;

    public static void A03(C28791au r3, String[] strArr) {
        int length = strArr.length;
        C23141Ev r32 = ((C28801av) r3).A02;
        StringBuilder sb = new StringBuilder();
        sb.append("_id IN ");
        sb.append(AnonymousClass1H2.A00(length));
        r32.A04("call_log_participant_v2", sb.toString(), "insertOrUpdateOrDeleteCallLogParticipants/DELETE_CALL_LOG_PARTICIPANT", strArr);
    }

    public synchronized void A07(C178119Bw r9) {
        String str;
        C28791au A052 = this.A06.A05();
        try {
            C23141Ev r5 = ((C28801av) A052).A02;
            String[] strArr = new String[4];
            AnonymousClass1DL r1 = this.A04;
            C89444cT r6 = r9.A04;
            strArr[0] = Long.toString(r1.A09(r6.A01));
            if (r6.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[1] = str;
            strArr[2] = r6.A02;
            strArr[3] = Integer.toString(r6.A00);
            int A042 = r5.A04("call_log", "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?", "deleteCallLog/DELETE_CALL_LOG", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("CallLogStore/deleteCallLog/rowId=");
            sb.append(r9.A01());
            sb.append("; count=");
            sb.append(A042);
            Log.i(sb.toString());
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        return;
        throw th;
    }

    public static ContentValues A00(AnonymousClass1TB r5, C178119Bw r6, C89444cT r7) {
        long j;
        long j2;
        String str;
        ContentValues contentValues = new ContentValues();
        AnonymousClass1DL r52 = r5.A04;
        contentValues.put("jid_row_id", Long.valueOf(r52.A09(r7.A01)));
        contentValues.put("from_me", Integer.valueOf(r7.A03 ? 1 : 0));
        contentValues.put("call_id", r7.A02);
        contentValues.put("transaction_id", Integer.valueOf(r7.A00));
        contentValues.put("timestamp", Long.valueOf(r6.A01));
        contentValues.put("video_call", Boolean.valueOf(r6.A0J));
        contentValues.put("duration", Integer.valueOf(r6.A08));
        contentValues.put("call_result", Integer.valueOf(r6.A06));
        contentValues.put("is_dnd_mode_on", Integer.valueOf(r6.A0A().databaseValue));
        contentValues.put("bytes_transferred", Long.valueOf(r6.A0A));
        long j3 = 0;
        if (r6.A0C != null) {
            j = r52.A09(r6.A0C);
        } else {
            j = 0;
        }
        contentValues.put("group_jid_row_id", Long.valueOf(j));
        contentValues.put("is_joinable_group_call", Boolean.valueOf(r6.A0I));
        DeviceJid deviceJid = r6.A02;
        if (deviceJid != null) {
            j2 = r52.A09(deviceJid);
        } else {
            j2 = 0;
        }
        contentValues.put("call_creator_device_jid_row_id", Long.valueOf(j2));
        contentValues.put("call_random_id", r6.A0G);
        C178119Bw.A00(r6);
        contentValues.put("offer_silence_reason", Integer.valueOf(r6.A09));
        if (r6.A0B != null) {
            j3 = r6.A0B.A00;
        }
        contentValues.put("call_link_row_id", Long.valueOf(j3));
        contentValues.put("call_type", Integer.valueOf(r6.A07));
        if (r6.A0F != null) {
            str = r6.A0F.A00;
        } else {
            str = null;
        }
        contentValues.put("scheduled_id", str);
        return contentValues;
    }

    public static C178119Bw A01(Cursor cursor, Cursor cursor2, AnonymousClass1TB r43) {
        int i;
        int i2;
        String string;
        C58332kW r5;
        Cursor cursor3 = cursor;
        long j = cursor3.getLong(cursor3.getColumnIndexOrThrow("_id"));
        String string2 = cursor3.getString(cursor3.getColumnIndexOrThrow("call_id"));
        long j2 = cursor3.getLong(cursor3.getColumnIndexOrThrow("jid_row_id"));
        AnonymousClass1TB r13 = r43;
        AnonymousClass1DL r2 = r13.A04;
        Jid A0B = r2.A0B(j2);
        C22941Dw r1 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(A0B);
        if (!C22971Dz.A0d(A012)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=");
            sb.append(j2);
            Log.e(sb.toString());
            return null;
        }
        boolean z = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        C89444cT r12 = new C89444cT(cursor3.getInt(cursor3.getColumnIndexOrThrow("transaction_id")), A012, string2, z);
        long j3 = cursor3.getLong(cursor3.getColumnIndexOrThrow("timestamp"));
        boolean z2 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("video_call")) > 0) {
            z2 = true;
        }
        int i3 = cursor3.getInt(cursor3.getColumnIndexOrThrow("duration"));
        int i4 = cursor3.getInt(cursor3.getColumnIndexOrThrow("call_result"));
        int i5 = cursor3.getInt(cursor3.getColumnIndexOrThrow("is_dnd_mode_on"));
        long j4 = cursor3.getLong(cursor3.getColumnIndexOrThrow("bytes_transferred"));
        int i6 = cursor3.getInt(cursor3.getColumnIndexOrThrow("group_jid_row_id"));
        boolean z3 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
            z3 = true;
        }
        int columnIndexOrThrow = cursor3.getColumnIndexOrThrow("offer_silence_reason");
        if (cursor3.isNull(columnIndexOrThrow)) {
            i = 0;
        } else {
            i = cursor3.getInt(columnIndexOrThrow);
        }
        long j5 = cursor3.getLong(cursor3.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
        int columnIndexOrThrow2 = cursor3.getColumnIndexOrThrow("call_type");
        if (cursor3.isNull(columnIndexOrThrow2)) {
            i2 = 0;
        } else {
            i2 = cursor3.getInt(columnIndexOrThrow2);
        }
        int columnIndexOrThrow3 = cursor3.getColumnIndexOrThrow("scheduled_id");
        if (cursor3.isNull(columnIndexOrThrow3)) {
            string = null;
        } else {
            string = cursor3.getString(columnIndexOrThrow3);
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor4 = cursor2;
        if (cursor2 != null) {
            while (cursor4.moveToNext()) {
                try {
                    long j6 = cursor4.getLong(cursor4.getColumnIndexOrThrow("_id"));
                    int i7 = cursor4.getInt(cursor4.getColumnIndexOrThrow("jid_row_id"));
                    UserJid A013 = C22941Dw.A01(r2.A0B((long) i7));
                    if (C22971Dz.A0d(A013)) {
                        arrayList.add(new C178109Bv(A013, cursor4.getInt(cursor4.getColumnIndexOrThrow("call_result")), j6));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=");
                        sb2.append(i7);
                        Log.e(sb2.toString());
                    }
                } catch (RuntimeException e) {
                    Log.e("CallLogStore/readCallLogFromCursors/exception", e);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CallLogStore/readCallLogFromCursors/exception logCursorCount");
                    sb3.append(cursor3.getCount());
                    sb3.append(" position:");
                    sb3.append(cursor3.getPosition());
                    Log.e(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("CallLogStore/readCallLogFromCursors/exception participantsCursorCount");
                    sb4.append(cursor4.getCount());
                    sb4.append(" position:");
                    sb4.append(cursor4.getPosition());
                    Log.e(sb4.toString());
                    throw e;
                }
            }
        }
        String string3 = cursor3.getString(cursor3.getColumnIndexOrThrow("call_random_id"));
        if (string != null) {
            r5 = new C58332kW(string);
        } else {
            r5 = null;
        }
        C179559Il r14 = C179559Il.A04;
        C179559Il A002 = C181809Rx.A00(i5);
        Jid A0B2 = r2.A0B((long) i6);
        C36321nh r15 = GroupJid.Companion;
        GroupJid A003 = C36321nh.A00(A0B2);
        return new C178119Bw(r13.A00.A01(cursor3), DeviceJid.Companion.A02(r2.A0B(j5)), A003, (AnonymousClass22J) null, r12, A002, r13.A05.A01(cursor3), r5, string3, arrayList, i3, i4, i, i2, j, j3, j4, z2, false, z3);
    }

    public static void A02(AnonymousClass1TB r21, C178119Bw r22) {
        int i;
        boolean A042;
        int i2;
        C178119Bw r4 = r22;
        int i3 = 0;
        boolean z = false;
        if (r4.A01() != -1) {
            z = true;
        }
        C17960vV.A0G(z, "CallLog row_id is not set");
        AnonymousClass1TB r8 = r21;
        C28791au A052 = r8.A06.A05();
        try {
            C41851xA BD0 = A052.BD0();
            try {
                Iterator it = r4.A0B().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C178109Bv r5 = (C178109Bv) next;
                    synchronized (next) {
                        A042 = r5.A04();
                        i2 = r5.A01;
                    }
                    if (A042) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("call_log_row_id", Long.valueOf(r4.A01()));
                        contentValues.put("jid_row_id", Long.valueOf(r8.A04.A09(r5.A00)));
                        contentValues.put("call_result", Integer.valueOf(r5.A01));
                        if (r5.A01() != -1) {
                            ((C28801av) A052).A02.A02(contentValues, "call_log_participant_v2", "_id = ?", "insertOrUpdateOrDeleteCallLogParticipants/UPDATE_CALL_LOG_PARTICIPANT", new String[]{Long.toString(r5.A01())});
                        } else {
                            r5.A03(((C28801av) A052).A02.A08("call_log_participant_v2", "insertOrUpdateOrDeleteCallLogParticipants/REPLACE_CALL_LOG_PARTICIPANT", contentValues));
                        }
                        synchronized (next) {
                            int i4 = r5.A01;
                            if (i2 == i4) {
                                r5.A02 = false;
                                r5.A01 = i4 + 1;
                            }
                        }
                    }
                }
                if (!r4.A0D().isEmpty()) {
                    int size = r4.A0D().size();
                    String[] strArr = new String[Math.min(size, 975)];
                    while (i3 < r4.A0D().size() && i3 < size) {
                        if (i3 == 975) {
                            A03(A052, strArr);
                            strArr = new String[(size - 975)];
                        } else {
                            i = i3;
                            if (i3 < 975) {
                                strArr[i] = Long.toString(((C178109Bv) r4.A0D().get(i3)).A01());
                                i3++;
                            }
                        }
                        i = i3 - 975;
                        strArr[i] = Long.toString(((C178109Bv) r4.A0D().get(i3)).A01());
                        i3++;
                    }
                    A03(A052, strArr);
                    r4.A0D().size();
                }
                synchronized (r4) {
                    try {
                        r4.A0K.clear();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                synchronized (r4) {
                }
                BD0.A00();
                BD0.close();
                A052.close();
            } catch (Throwable th2) {
                BD0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public C178119Bw A04(long j) {
        Cursor A0A;
        C28781at A042 = this.A06.get();
        try {
            C23141Ev r7 = ((C28801av) A042).A02;
            String l = Long.toString(j);
            Cursor A0A2 = r7.A0A("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log._id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{l});
            try {
                if (A0A2.moveToLast()) {
                    A0A = r7.A0A("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", new String[]{l});
                    C178119Bw A012 = A01(A0A2, A0A, this);
                    if (A0A != null) {
                        A0A.close();
                    }
                    A0A2.close();
                    A042.close();
                    return A012;
                }
                A0A2.close();
                A042.close();
                return null;
            } catch (Throwable th) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public C178119Bw A05(C89444cT r46) {
        String str;
        Cursor A0A;
        int i;
        int i2;
        String str2;
        C28781at A042 = this.A06.get();
        try {
            C23141Ev r8 = ((C28801av) A042).A02;
            String[] strArr = new String[4];
            C89444cT r13 = r46;
            strArr[0] = r13.A02;
            AnonymousClass1DL r4 = this.A04;
            strArr[1] = Long.toString(r4.A09(r13.A01));
            if (r13.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            strArr[3] = Integer.toString(r13.A00);
            Cursor A0A2 = r8.A0A("SELECT call_log._id, call_log.call_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ? AND jid_row_id = ? AND from_me = ? AND transaction_id = ?", "GET_CALL_LOG_BY_KEY", strArr);
            try {
                if (A0A2.moveToLast()) {
                    A0A = r8.A0A("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_KEY", new String[]{Long.toString(A0A2.getLong(A0A2.getColumnIndexOrThrow("_id")))});
                    long j = A0A2.getLong(A0A2.getColumnIndexOrThrow("_id"));
                    long j2 = A0A2.getLong(A0A2.getColumnIndexOrThrow("timestamp"));
                    boolean z = false;
                    if (A0A2.getInt(A0A2.getColumnIndexOrThrow("video_call")) > 0) {
                        z = true;
                    }
                    int i3 = A0A2.getInt(A0A2.getColumnIndexOrThrow("duration"));
                    int i4 = A0A2.getInt(A0A2.getColumnIndexOrThrow("call_result"));
                    int i5 = A0A2.getInt(A0A2.getColumnIndexOrThrow("is_dnd_mode_on"));
                    long j3 = A0A2.getLong(A0A2.getColumnIndexOrThrow("bytes_transferred"));
                    int i6 = A0A2.getInt(A0A2.getColumnIndexOrThrow("group_jid_row_id"));
                    boolean z2 = false;
                    if (A0A2.getInt(A0A2.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
                        z2 = true;
                    }
                    long j4 = A0A2.getLong(A0A2.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
                    int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("call_type");
                    if (A0A2.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A0A2.getInt(columnIndexOrThrow);
                    }
                    int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("offer_silence_reason");
                    if (A0A2.isNull(columnIndexOrThrow2)) {
                        i2 = 0;
                    } else {
                        i2 = A0A2.getInt(columnIndexOrThrow2);
                    }
                    int columnIndexOrThrow3 = A0A2.getColumnIndexOrThrow("scheduled_id");
                    C58332kW r14 = null;
                    if (A0A2.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = A0A2.getString(columnIndexOrThrow3);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (A0A.moveToNext()) {
                        long j5 = A0A.getLong(A0A.getColumnIndexOrThrow("_id"));
                        int i7 = A0A.getInt(A0A.getColumnIndexOrThrow("jid_row_id"));
                        Jid A0B = r4.A0B((long) i7);
                        C22941Dw r0 = UserJid.Companion;
                        UserJid A012 = C22941Dw.A01(A0B);
                        if (C22971Dz.A0d(A012)) {
                            arrayList.add(new C178109Bv(A012, A0A.getInt(A0A.getColumnIndexOrThrow("call_result")), j5));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=");
                            sb.append(i7);
                            Log.e(sb.toString());
                        }
                    }
                    String string = A0A2.getString(A0A2.getColumnIndexOrThrow("call_random_id"));
                    if (str2 != null) {
                        r14 = new C58332kW(str2);
                    }
                    C179559Il r02 = C179559Il.A04;
                    C179559Il A002 = C181809Rx.A00(i5);
                    Jid A0B2 = r4.A0B((long) i6);
                    C36321nh r03 = GroupJid.Companion;
                    C178119Bw r21 = new C178119Bw(this.A00.A01(A0A2), DeviceJid.Companion.A02(r4.A0B(j4)), C36321nh.A00(A0B2), (AnonymousClass22J) null, r13, A002, this.A05.A01(A0A2), r14, string, arrayList, i3, i4, i2, i, j, j2, j3, z, false, z2);
                    A0A.close();
                    A0A2.close();
                    A042.close();
                    return r21;
                }
                A0A2.close();
                A042.close();
                return null;
            } catch (Throwable th) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public C178119Bw A06(String str) {
        Cursor A0A;
        C28781at A042 = this.A06.get();
        try {
            C23141Ev r7 = ((C28801av) A042).A02;
            Cursor A0A2 = r7.A0A("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{str});
            try {
                C178119Bw r1 = null;
                if (A0A2.moveToLast()) {
                    int columnIndex = A0A2.getColumnIndex("_id");
                    if (columnIndex < 0) {
                        C17960vV.A0F(false, "CallLogStore/getColumnIndexOrThrow _id column not found");
                    } else {
                        A0A = r7.A0A("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", new String[]{Long.toString((long) A0A2.getInt(columnIndex))});
                        r1 = A01(A0A2, A0A, this);
                        if (A0A != null) {
                            A0A.close();
                        }
                    }
                }
                A0A2.close();
                A042.close();
                return r1;
            } catch (Throwable th) {
                if (A0A2 != null) {
                    A0A2.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public AnonymousClass1TB(AnonymousClass1T9 r1, AnonymousClass11P r2, AnonymousClass1LW r3, AnonymousClass1LY r4, AnonymousClass1DL r5, AnonymousClass1TA r6, AnonymousClass1Cd r7, C18030ve r8) {
        this.A01 = r2;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
    }
}
