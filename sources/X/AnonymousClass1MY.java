package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1MY  reason: invalid class name */
public class AnonymousClass1MY {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;

    public synchronized void A01(AnonymousClass1EC r14, List list) {
        C28791au A05 = this.A01.A05();
        try {
            AnonymousClass1DL r5 = this.A00;
            long A09 = r5.A09(r14);
            Long valueOf = Long.valueOf(A09);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long A092 = r5.A09((UserJid) it.next());
                Long valueOf2 = Long.valueOf(A092);
                if (!(A09 == -1 || A092 == -1)) {
                    ((C28801av) A05).A02.A04("parent_group_participants", "parent_group_jid_row_id = ? AND user_jid_row_id = ?", "parent_group_participants_store/DELETE_OLD_PARTICIPANT", new String[]{String.valueOf(valueOf), String.valueOf(valueOf2)});
                }
            }
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        return;
        throw th;
    }

    public synchronized void A02(AnonymousClass1EC r11, List list, boolean z) {
        HashSet hashSet;
        HashSet hashSet2 = new HashSet(A00(this, r11));
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet3.add(Long.valueOf(this.A00.A09((UserJid) it.next())));
        }
        HashSet hashSet4 = new HashSet(hashSet3);
        Iterator it2 = hashSet4.iterator();
        while (it2.hasNext()) {
            if (hashSet2.contains(it2.next())) {
                it2.remove();
            }
        }
        if (z) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(hashSet2);
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            if (hashSet3.contains(it3.next())) {
                it3.remove();
            }
        }
        if (hashSet4.size() != 0 || hashSet.size() != 0) {
            C28791au A05 = this.A01.A05();
            try {
                Long valueOf = Long.valueOf(this.A00.A09(r11));
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("parent_group_jid_row_id", valueOf);
                    contentValues.put("user_jid_row_id", (Long) it4.next());
                    ((C28801av) A05).A02.A09("parent_group_participants", "parent_group_participants_store/INSERT_NEW_PARTICIPANT", contentValues, 5);
                }
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    ((C28801av) A05).A02.A04("parent_group_participants", "parent_group_jid_row_id = ? AND user_jid_row_id = ?", "parent_group_participants_store/DELETE_OLD_PARTICIPANT", new String[]{String.valueOf(valueOf), String.valueOf((Long) it5.next())});
                }
                A05.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return;
        throw th;
    }

    public static ArrayList A00(AnonymousClass1MY r9, AnonymousClass1EC r10) {
        Cursor A0A;
        long A09 = r9.A00.A09(r10);
        try {
            C28781at A04 = r9.A01.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT user_jid_row_id FROM parent_group_participants WHERE parent_group_jid_row_id= ?", "linkedGroupParticipantsStore/getParticipantsForParentGroupJid", new String[]{String.valueOf(A09)});
                ArrayList arrayList = new ArrayList();
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("user_jid_row_id");
                while (A0A.moveToNext()) {
                    arrayList.add(Long.valueOf(A0A.getLong(columnIndexOrThrow)));
                }
                A0A.close();
                A04.close();
                return arrayList;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("linkedGroupParticipantsStore/getParticipantsForParentGroupJid", e);
            return new ArrayList();
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public AnonymousClass1MY(AnonymousClass1DL r1, AnonymousClass1Cd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
