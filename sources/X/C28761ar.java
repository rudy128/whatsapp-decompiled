package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.1ar  reason: invalid class name and case insensitive filesystem */
public class C28761ar {
    public final C25891Qa A00;
    public final AnonymousClass125 A01;

    public int A00(AnonymousClass1BI r9, long j) {
        HashSet hashSet;
        Cursor A0A;
        Cursor A0A2;
        AnonymousClass125 r7 = this.A01;
        HashSet hashSet2 = new HashSet();
        try {
            C28781at A04 = r7.A0B.get();
            try {
                A0A2 = ((C28801av) A04).A02.A0A("SELECT message._id as _id FROM message_quoted JOIN message AS message ON message_quoted.message_row_id = message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message.message_type <> 15 AND message_quoted.from_me = 1 LIMIT 100", "GET_QUOTED_ME_MESSAGES_NEWER_THAN_REF_SQL", new String[]{String.valueOf(j), String.valueOf(r7.A02.A09(r9))});
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("_id");
                while (A0A2.moveToNext()) {
                    hashSet2.add(Long.valueOf(A0A2.getLong(columnIndexOrThrow)));
                }
                A0A2.close();
                A04.close();
                C25891Qa r6 = this.A00;
                AnonymousClass11S r0 = r6.A00;
                r0.A0I();
                PhoneUserJid phoneUserJid = r0.A0E;
                if (phoneUserJid != null) {
                    hashSet = new HashSet();
                    String[] strArr = {String.valueOf(j), String.valueOf(r6.A01.A09(r9)), String.valueOf(r6.A02.A09(phoneUserJid))};
                    try {
                        C28781at A042 = r6.A03.get();
                        try {
                            A0A = ((C28801av) A042).A02.A0A("SELECT message._id AS _id FROM message_mentions JOIN message AS message ON message_mentions.message_row_id == message._id WHERE message.sort_id > ? AND message.chat_row_id = ? AND message_mentions.jid_row_id = ? AND message.message_type <> 15 LIMIT 100", "GET_MENTIONED_ME_MESSAGES_NEWER_THAN_REF_SQL", strArr);
                            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("_id");
                            while (A0A.moveToNext()) {
                                hashSet.add(Long.valueOf(A0A.getLong(columnIndexOrThrow2)));
                            }
                            A0A.close();
                            A042.close();
                        } catch (Throwable th) {
                            A042.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        Log.e("MentionMessageStore/getMentionImportantMessagesNewerThanCount", e);
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                }
                hashSet2.addAll(hashSet);
                return hashSet2.size();
                throw th;
                throw th;
            } catch (Throwable th3) {
                A04.close();
                throw th3;
            }
        } catch (Exception e2) {
            Log.e("QuotedMessageStore/getQuotedImportantMessagesNewerThanCount", e2);
        } catch (Throwable th4) {
            AnonymousClass0DT.A00(th3, th4);
        }
    }

    public C28761ar(C25891Qa r1, AnonymousClass125 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
