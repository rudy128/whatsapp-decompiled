package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1M3  reason: invalid class name */
public class AnonymousClass1M3 extends C24861Ly {
    public static HashSet A04(Cursor cursor, String str) {
        HashSet hashSet = new HashSet();
        if (cursor == null) {
            C17960vV.A0F(false, str);
        } else {
            while (cursor.moveToNext()) {
                UserJid A04 = UserJid.Companion.A04(cursor.getString(0));
                if (A04 != null) {
                    hashSet.add(A04);
                }
            }
        }
        return hashSet;
    }

    public static void A06(AnonymousClass1M3 r7, String str, Set set) {
        C41851xA BD0;
        C28791au A06 = r7.A00.A06();
        try {
            BD0 = A06.BD0();
            C24861Ly.A02(A06, str, (String) null, (String[]) null);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                C24861Ly.A00(contentValues, A06, str);
            }
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1M3(C24811Lt r1) {
        super(r1);
    }
}
