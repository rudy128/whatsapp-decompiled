package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Ux  reason: invalid class name and case insensitive filesystem */
public class C27151Ux {
    public final AnonymousClass122 A00;
    public final C25961Qh A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11S A04;

    public ArrayList A00(AnonymousClass1EC r8, long j) {
        List<Number> list;
        Cursor A0A;
        AnonymousClass11S r0 = this.A04;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        if (phoneUserJid != null) {
            C25961Qh r4 = this.A01;
            ArrayList arrayList = new ArrayList();
            AnonymousClass1DL r2 = r4.A00;
            String[] strArr = {Long.toString(r2.A09(r8)), Long.toString(r2.A09(phoneUserJid)), Long.toString(j)};
            C28781at A042 = r4.A01.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT chat_row_id, message_row_id FROM message_group_invite invite INNER JOIN message message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND invite.admin_jid_row_id = ? AND invite.expiration > ? AND invite.expired = 0", "GET_UNEXPIRED_INVITE_MESSAGES_FOR_GROUP_SQL", strArr);
                while (A0A.moveToNext()) {
                    arrayList.add(Long.valueOf(A0A.getLong(A0A.getColumnIndexOrThrow("message_row_id"))));
                }
                A0A.close();
                A042.close();
                list = arrayList;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            list = Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Number longValue : list) {
            AnonymousClass206 A032 = ((AnonymousClass1W6) this.A03.get()).A01.A03(longValue.longValue());
            if (A032 != null) {
                arrayList2.add(A032);
            }
        }
        return arrayList2;
        throw th;
    }

    public C27151Ux(AnonymousClass11S r1, AnonymousClass122 r2, C25961Qh r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A04 = r1;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
