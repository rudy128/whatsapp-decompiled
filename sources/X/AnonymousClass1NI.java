package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1NI  reason: invalid class name */
public class AnonymousClass1NI {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1DL A04;
    public final C22611Cn A05;

    public void A02(AnonymousClass1BI r4, int i) {
        C29691ci A0A = this.A01.A0A(r4);
        if (A0A == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("groupchatstore/updateGroupChatInfoGroupTypeIfExist/chat does not exist: ");
            sb.append(r4);
            Log.i(sb.toString());
            return;
        }
        Log.i("groupchatstore/updateGroupChatInfoGroupTypeInBackgroundIfExist/update group type");
        A0A.A03 = i;
        A00(A0A, this, r4, (Long) null);
    }

    public static void A00(C29691ci r7, AnonymousClass1NI r8, AnonymousClass1BI r9, Long l) {
        ContentValues contentValues;
        try {
            C28791au A052 = r8.A02.A05();
            try {
                C41851xA BD0 = A052.BD0();
                try {
                    AnonymousClass1LW r4 = r8.A00;
                    synchronized (r7) {
                        contentValues = new ContentValues(3);
                        if (l != null) {
                            contentValues.put("created_timestamp", l);
                        }
                        contentValues.put("subject", r7.A0k);
                        contentValues.put("group_type", Integer.valueOf(r7.A03));
                        C29741cn r0 = r7.A0h;
                        if (r0 != null) {
                            contentValues.put("growth_lock_level", Integer.valueOf(r0.A00));
                            contentValues.put("growth_lock_expiration_ts", Long.valueOf(r7.A0h.A01));
                        }
                    }
                    if (!r4.A0M(contentValues, r7)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/addmsg/chatlist/insert/failed jid=");
                        sb.append(r9);
                        Log.e(sb.toString());
                    }
                    BD0.A00();
                    BD0.close();
                    A052.close();
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A052.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r8.A05.A03();
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }

    public UserJid A01(AnonymousClass1EC r7) {
        Cursor A0A;
        try {
            C28781at A042 = this.A02.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT sender_jid_row_id FROM message_system_group AS system_group JOIN message_system AS message_system JOIN available_message_view AS message WHERE message_system.message_row_id = system_group.message_row_id AND message_system.message_row_id = message._id AND message.chat_row_id = ? AND message.message_type = '7' AND message.from_me = 1 AND (message_system.action_type = 12 OR message_system.action_type = 124 OR message_system.action_type = 144 OR message_system.action_type = 127) AND system_group.is_me_joined = 1 ORDER BY _id DESC LIMIT 1", "GET_GROUP_ADDER_JID_SQL", new String[]{String.valueOf(this.A00.A09(r7))});
                if (A0A != null) {
                    if (A0A.moveToNext()) {
                        int columnIndexOrThrow = A0A.getColumnIndexOrThrow("sender_jid_row_id");
                        if (!A0A.isNull(columnIndexOrThrow)) {
                            Jid A0B = this.A04.A0B(A0A.getLong(columnIndexOrThrow));
                            C22941Dw r0 = UserJid.Companion;
                            UserJid A012 = C22941Dw.A01(A0B);
                            A0A.close();
                            A042.close();
                            return A012;
                        }
                    }
                    A0A.close();
                }
                A042.close();
                return null;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A05.A03();
            return null;
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A03(AnonymousClass1BI r4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchatsubject/");
        sb.append(r4);
        Log.i(sb.toString());
        ((C31931gM) this.A03.get()).A01(new C21467AkY(this, r4, str, 25), 37);
    }

    public void A04(AnonymousClass1EC r12, C29741cn r13, String str, int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/updategroupchat/");
        sb.append(r12);
        sb.append(" creation=");
        long j2 = j;
        sb.append(j2);
        sb.append(" groupType='");
        sb.append(i);
        sb.append("'");
        Log.i(sb.toString());
        ((C31931gM) this.A03.get()).A01(new AnonymousClass3CN(this, r12, r13, str, i, 1, j2), 38);
    }

    public AnonymousClass1NI(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1DL r3, C22611Cn r4, AnonymousClass1Cd r5, AnonymousClass00H r6) {
        this.A04 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r4;
    }
}
