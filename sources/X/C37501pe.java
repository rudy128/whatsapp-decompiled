package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1pe  reason: invalid class name and case insensitive filesystem */
public class C37501pe extends C24861Ly {
    public boolean A0K(UserJid userJid, boolean z) {
        C28791au A06;
        try {
            A06 = this.A00.A06();
            if (z) {
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("jid", userJid.getRawString());
                C24861Ly.A05(contentValues, A06, "wa_block_list");
            } else {
                C24861Ly.A02(A06, "wa_block_list", "jid = ?", new String[]{userJid.getRawString()});
            }
            A06.close();
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("contact-mgr-db/unable to update blocked state  ");
            sb.append(userJid);
            sb.append(", ");
            sb.append(z);
            C17960vV.A09(sb.toString(), e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public HashSet A0I() {
        Cursor A03;
        HashSet hashSet = new HashSet();
        C28781at A05 = this.A00.get();
        try {
            A03 = C24861Ly.A03(A05, "SELECT jid FROM wa_block_list", "CONTACT_BLOCK_LIST", (String[]) null);
            int columnIndexOrThrow = A03.getColumnIndexOrThrow("jid");
            while (A03.moveToNext()) {
                UserJid A04 = UserJid.Companion.A04(A03.getString(columnIndexOrThrow));
                if (A04 != null) {
                    hashSet.add(A04);
                }
            }
            A03.close();
            A05.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C37501pe(C24811Lt r1) {
        super(r1);
    }

    public void A0J(Set set) {
        C41851xA BD0;
        AnonymousClass1Ez r6 = new AnonymousClass1Ez(true);
        r6.A04();
        C28791au A06 = this.A00.A06();
        try {
            BD0 = A06.BD0();
            C24861Ly.A02(A06, "wa_block_list", (String) null, (String[]) null);
            ContentValues contentValues = new ContentValues(1);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                C24861Ly.A00(contentValues, A06, "wa_block_list");
            }
            BD0.A00();
            BD0.close();
            A06.close();
            r6.A01();
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
}
