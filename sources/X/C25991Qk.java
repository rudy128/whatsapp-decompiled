package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1Qk  reason: invalid class name and case insensitive filesystem */
public class C25991Qk {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass1NJ A03;

    public int A02(AnonymousClass1BI r7) {
        Cursor A0A;
        int i = 0;
        String[] strArr = {String.valueOf(this.A00.A09(r7))};
        C28781at A04 = this.A02.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT COUNT(*) as count  FROM deleted_messages_ids_view WHERE chat_row_id = ? AND message_type != 8", "GET_MESSAGE_COUNT_JID_TO_DELETE_SQL", strArr);
            if (A0A.moveToNext()) {
                i = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/countmessagestodelete/count: ");
                sb.append(i);
                Log.i(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore/countmessagestodelete/db no message for ");
                sb2.append(r7);
                Log.i(sb2.toString());
            }
            A0A.close();
            A04.close();
            return i;
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

    public static C56192h3 A00(Cursor cursor, C25991Qk r22) {
        ArrayList arrayList;
        Cursor cursor2 = cursor;
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("chat_row_id"));
        AnonymousClass1BI A0B = r22.A00.A0B(j);
        if (A0B == null) {
            return null;
        }
        long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_message_row_id"));
        if (j2 == 0) {
            j2 = Long.MIN_VALUE;
        }
        long j3 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_starred_message_row_id"));
        if (j3 == 0) {
            j3 = Long.MIN_VALUE;
        }
        long j4 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_message_row_id"));
        if (j4 == 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_starred_message_row_id"));
        if (j5 == 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("block_size"));
        boolean z = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_messages_remove_files")) != 0) {
            z = true;
        }
        boolean z2 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("delete_files_singular_delete")) != 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_categories_remove_files")) != 0) {
            z3 = true;
        }
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("deleted_message_categories"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("singular_message_delete_rows_id"));
        if (string2 == null || string2.isEmpty()) {
            arrayList = null;
        } else {
            String[] split = string2.replace("\"", "").split(",");
            arrayList = new ArrayList();
            for (String valueOf : split) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return new C56192h3(A0B, string, arrayList, i, j6, j, j2, j3, j4, j5, z, z2, z3);
    }

    public static C56192h3 A01(C25991Qk r6, long j) {
        Cursor A0A;
        C28781at A04 = r6.A02.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1", "GET_DELETED_CHAT_JOBS_LATEST_SQL", new String[]{Long.toString(j)});
            if (A0A.moveToFirst()) {
                C56192h3 A002 = A00(A0A, r6);
                A0A.close();
                A04.close();
                return A002;
            }
            A0A.close();
            A04.close();
            return null;
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

    public C56192h3 A03(AnonymousClass1BI r49, Long l, List list, boolean z, boolean z2, boolean z3) {
        long j;
        long max;
        boolean z4;
        long j2;
        long j3;
        long j4;
        C41851xA BD0;
        String str;
        boolean z5 = z2;
        C56192h3 r25 = null;
        AnonymousClass1Cd r7 = this.A02;
        C28791au A05 = r7.A05();
        try {
            C41851xA BD02 = A05.BD0();
            try {
                AnonymousClass1LW r6 = this.A00;
                AnonymousClass1BI r5 = r49;
                long A09 = r6.A09(r5);
                if (l != null) {
                    max = l.longValue();
                } else {
                    C29691ci A002 = AnonymousClass1CJ.A00(this.A01, r5);
                    long A06 = this.A03.A06(r5);
                    if (A002 != null) {
                        j = A002.A0Q;
                    } else {
                        j = Long.MIN_VALUE;
                    }
                    max = Math.max(A06, j);
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    if (z) {
                        j4 = max;
                    } else {
                        j4 = Long.MIN_VALUE;
                    }
                    j3 = Long.MIN_VALUE;
                    j2 = Long.MIN_VALUE;
                    z4 = false;
                } else {
                    if (z) {
                        j2 = max;
                    } else {
                        j2 = Long.MIN_VALUE;
                    }
                    z4 = z5;
                    j3 = max;
                    z5 = false;
                    max = Long.MIN_VALUE;
                    j4 = Long.MIN_VALUE;
                }
                C56192h3 r23 = new C56192h3(r5, (String) null, list, 100, -1, A09, max, j4, j3, j2, z5, z3, z4);
                C28791au A052 = r7.A05();
                try {
                    BD0 = A052.BD0();
                    long j5 = r23.A01;
                    long j6 = j5;
                    AnonymousClass1BI A0B = r6.A0B(j5);
                    if (A0B != null) {
                        C29691ci A003 = AnonymousClass1CJ.A00(this.A01, A0B);
                        C56192h3 A012 = A01(this, j6);
                        if (A012 == null || TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                            long j7 = r23.A04;
                            long j8 = r23.A05;
                            boolean z6 = r23.A0C;
                            long j9 = r23.A02;
                            long j10 = r23.A03;
                            boolean z7 = r23.A0A;
                            String str2 = null;
                            List list2 = r23.A09;
                            List list3 = list2;
                            if (list2 == null) {
                                str = null;
                            } else {
                                String[] strArr = new String[list3.size()];
                                for (int i = 0; i < list3.size(); i++) {
                                    strArr[i] = ((Long) list3.get(i)).toString();
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("\"");
                                sb.append(AnonymousClass1EG.A08("\",\"", strArr));
                                sb.append("\"");
                                str = sb.toString();
                            }
                            boolean z8 = r23.A0B;
                            if (A012 != null) {
                                if (TextUtils.isEmpty((CharSequence) null) || TextUtils.isEmpty(A012.A08)) {
                                    str2 = A012.A08;
                                    if (!TextUtils.isEmpty(str2)) {
                                        z7 = A012.A0A;
                                    } else {
                                        str2 = null;
                                    }
                                    j7 = Math.max(j7, A012.A04);
                                    j8 = Math.max(j8, A012.A05);
                                    j9 = Math.max(j9, A012.A02);
                                    j10 = Math.max(j10, A012.A03);
                                } else {
                                    BD0.close();
                                    A052.close();
                                    BD02.close();
                                    A05.close();
                                    return r25;
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("chat_row_id", Long.valueOf(j6));
                            contentValues.put("block_size", 100);
                            contentValues.put("deleted_message_row_id", Long.valueOf(j7));
                            contentValues.put("deleted_starred_message_row_id", Long.valueOf(j8));
                            contentValues.put("deleted_messages_remove_files", Boolean.valueOf(z6));
                            contentValues.put("deleted_categories_message_row_id", Long.valueOf(j9));
                            contentValues.put("deleted_categories_starred_message_row_id", Long.valueOf(j10));
                            contentValues.put("deleted_message_categories", str2);
                            contentValues.put("deleted_categories_remove_files", Boolean.valueOf(z7));
                            contentValues.put("delete_files_singular_delete", Boolean.valueOf(z8));
                            C63432t4.A01(contentValues, "singular_message_delete_rows_id", str);
                            C23141Ev r13 = ((C28801av) A052).A02;
                            long A053 = r13.A05("deleted_chat_job", "markChatForDeletion/INSERT_DELETED_CHAT_JOB", contentValues);
                            if (A012 != null) {
                                r13.A04("deleted_chat_job", "_id = ?", "markChatForDeletion/DELETE_DELETED_CHAT_JOB", new String[]{Long.toString(A012.A06)});
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgstore/deletemsgs/mark jid:");
                            sb2.append(A0B);
                            sb2.append(" lastDeletedMessageSortId:");
                            sb2.append(j7);
                            sb2.append(" lastDeletedStarredMessageSortId:");
                            sb2.append(j8);
                            sb2.append(" jobId: ");
                            sb2.append(A053);
                            Log.i(sb2.toString());
                            if (A053 > 0 && A003 != null) {
                                A003.A0J(str2, j7, j8, j9, j10);
                            }
                            BD0.A00();
                            r25 = new C56192h3(A0B, str2, list3, 100, A053, j6, j7, j8, j9, j10, z6, z8, z7);
                            BD0.close();
                            A052.close();
                            BD02.A00();
                            BD02.close();
                            A05.close();
                            return r25;
                        }
                    }
                    BD0.close();
                    A052.close();
                    BD02.close();
                    A05.close();
                    return r25;
                } catch (Throwable th) {
                    A052.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A05.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public HashSet A04() {
        Cursor A0A;
        HashSet hashSet = new HashSet();
        C28781at A04 = this.A02.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT DISTINCT chat_row_id FROM deleted_chat_job", "GET_DELETED_CHATS_SQL", (String[]) null);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("chat_row_id");
            while (A0A.moveToNext()) {
                AnonymousClass1BI A0B = this.A00.A0B(A0A.getLong(columnIndexOrThrow));
                if (A0B != null) {
                    hashSet.add(A0B);
                }
            }
            A0A.close();
            A04.close();
            return hashSet;
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

    public void A05(C56192h3 r21) {
        AnonymousClass1CJ r0 = this.A01;
        C56192h3 r9 = r21;
        AnonymousClass1BI r3 = r9.A07;
        C29691ci A0A = r0.A0A(r3);
        C28791au A05 = this.A02.A05();
        try {
            ((C28801av) A05).A02.A04("deleted_chat_job", "_id = ?", "unmarkJidForDeletionInChats/DELETE_DELETED_CHAT_JOB", new String[]{String.valueOf(r9.A06)});
            if (A0A != null && A01(this, r9.A01) == null) {
                A0A.A0J((String) null, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/deletemsgs/unmark jid:");
            sb.append(r3);
            Log.i(sb.toString());
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C25991Qk(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1Cd r3, AnonymousClass1NJ r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
