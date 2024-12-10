package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1MX  reason: invalid class name */
public class AnonymousClass1MX {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final C18030ve A02;
    public final C24751Ln A03;

    public static ArrayList A00(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("group_jid_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("user_jid_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("is_leave");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("timestamp");
        while (cursor2.moveToNext()) {
            long j = cursor2.getLong(columnIndexOrThrow);
            long j2 = cursor2.getLong(columnIndexOrThrow2);
            boolean z = false;
            if (cursor2.getLong(columnIndexOrThrow3) != 0) {
                z = true;
            }
            arrayList.add(new C54812ek(j, j2, cursor2.getLong(columnIndexOrThrow4), z));
        }
        return arrayList;
    }

    public static HashMap A01(AnonymousClass1MX r11, List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54812ek r2 = (C54812ek) it.next();
            hashSet.add(Long.valueOf(r2.A00));
            hashSet2.add(Long.valueOf(r2.A02));
        }
        AnonymousClass1DL r1 = r11.A00;
        HashMap A0F = r1.A0F(AnonymousClass1E9.class, hashSet);
        HashMap A0F2 = r1.A0F(UserJid.class, hashSet2);
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C54812ek r5 = (C54812ek) it2.next();
            AnonymousClass1E9 r8 = (AnonymousClass1E9) A0F.get(Long.valueOf(r5.A00));
            UserJid userJid = (UserJid) A0F2.get(Long.valueOf(r5.A02));
            if (!(userJid == null || r8 == null)) {
                Object obj = hashMap.get(r8);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(r8, obj);
                }
                ((List) obj).add(new AnonymousClass4O4(r8, userJid, r5.A01, r5.A03));
            }
        }
        return hashMap;
    }

    public void A02(AnonymousClass1E9 r7) {
        String[] strArr = {String.valueOf(this.A00.A09(r7))};
        C28791au A05 = this.A01.A05();
        try {
            ((C28801av) A05).A02.A04("group_past_participant_user", "group_jid_row_id = ?", "deletePastParticipant/DELETE_PAST_PARTICIPANT_GROUP", strArr);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A04(AnonymousClass1E9 r9, UserJid userJid, long j, boolean z) {
        AnonymousClass1DL r0 = this.A00;
        long A09 = r0.A09(r9);
        long A092 = r0.A09(userJid);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("group_jid_row_id", Long.valueOf(A09));
        contentValues.put("user_jid_row_id", Long.valueOf(A092));
        contentValues.put("is_leave", Boolean.valueOf(z));
        contentValues.put("timestamp", Long.valueOf(j));
        C28791au A05 = this.A01.A05();
        try {
            ((C28801av) A05).A02.A09("group_past_participant_user", "insertOrUpdatePastParticipant/INSERT_PAST_PARTICIPANT_USER", contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1MX(AnonymousClass1DL r1, AnonymousClass1Cd r2, C24751Ln r3, C18030ve r4) {
        this.A02 = r4;
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
    }

    public void A03(AnonymousClass1E9 r10, UserJid userJid) {
        PhoneUserJid phoneUserJid;
        if (C22971Dz.A0X(userJid)) {
            phoneUserJid = (PhoneUserJid) userJid;
        } else if (userJid instanceof AnonymousClass1E1) {
            phoneUserJid = this.A03.A0D((AnonymousClass1E1) userJid);
        } else {
            phoneUserJid = null;
        }
        HashSet newHashSet = C63772tf.newHashSet(userJid);
        if (phoneUserJid != null) {
            newHashSet.add(phoneUserJid);
            newHashSet.addAll(this.A03.A0I(phoneUserJid));
        }
        int size = newHashSet.size();
        ArrayList arrayList = new ArrayList(size + 1);
        AnonymousClass1DL r3 = this.A00;
        arrayList.add(String.valueOf(r3.A09(r10)));
        Iterator it = newHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(r3.A09((Jid) it.next())));
        }
        C28791au A05 = this.A01.A05();
        try {
            C23141Ev r4 = ((C28801av) A05).A02;
            StringBuilder sb = new StringBuilder();
            sb.append("group_jid_row_id = ? AND ");
            sb.append("user_jid_row_id IN ");
            sb.append(AnonymousClass1H2.A00(size));
            r4.A04("group_past_participant_user", sb.toString(), "deletePastParticipant/DELETE_PAST_PARTICIPANT_USER", (String[]) arrayList.toArray(new String[0]));
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }
}
