package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Qh  reason: invalid class name and case insensitive filesystem */
public class C25961Qh {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1LW A02;

    public static ContentValues A00(C25961Qh r4, AnonymousClass23S r5, long j) {
        String l;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.toString(j));
        AnonymousClass1EC r1 = r5.A02;
        String str = null;
        if (r1 == null) {
            l = null;
        } else {
            l = Long.toString(r4.A00.A09(r1));
        }
        contentValues.put("group_jid_row_id", l);
        UserJid userJid = r5.A03;
        if (userJid != null) {
            str = Long.toString(r4.A00.A09(userJid));
        }
        contentValues.put("admin_jid_row_id", str);
        contentValues.put("group_name", r5.A05);
        contentValues.put("invite_code", r5.A06);
        contentValues.put("expiration", Long.valueOf(r5.A01));
        contentValues.put("invite_time", Long.valueOf(r5.A0I));
        contentValues.put("expired", Integer.valueOf(r5.A07 ? 1 : 0));
        contentValues.put("group_type", Integer.valueOf(r5.A00));
        return contentValues;
    }

    public long A01(AnonymousClass1EC r8, UserJid userJid) {
        Cursor A0A;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        AnonymousClass1DL r2 = this.A00;
        String[] strArr = {Long.toString(r2.A09(r8)), Long.toString(r2.A09(userJid))};
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC", "GET_LAST_GROUP_INVITE_MESSAGE_BY_GROUP_AND_ADMIN_SQL", strArr);
            if (A0A.moveToNext()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("message_row_id"));
            }
            A0A.close();
            A04.close();
            return j;
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

    public long A02(AnonymousClass1EC r8, UserJid userJid) {
        Cursor A0A;
        long j = -1;
        if (r8 == null || userJid == null) {
            return -1;
        }
        String[] strArr = {Long.toString(this.A00.A09(r8)), Long.toString(this.A02.A09(userJid))};
        C28781at A04 = this.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC", "GET_LAST_SENT_GROUP_INVITE_MESSAGE_BY_GROUP_AND_REMOTE_SQL", strArr);
            if (A0A.moveToNext()) {
                j = A0A.getLong(A0A.getColumnIndexOrThrow("message_row_id"));
            }
            A0A.close();
            A04.close();
            return j;
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

    public void A03(AnonymousClass23S r7) {
        C28791au A05 = this.A01.A05();
        try {
            ((C28801av) A05).A02.A09("message_group_invite", "INSERT_GROUP_INVITE_MESSAGE_SQL", A00(this, r7, r7.A0x), 5);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C25961Qh(AnonymousClass1LW r1, AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
