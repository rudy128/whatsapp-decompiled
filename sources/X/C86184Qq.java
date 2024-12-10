package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.4Qq  reason: invalid class name and case insensitive filesystem */
public class C86184Qq {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1QY A02;
    public final AnonymousClass1W6 A03;

    /* JADX INFO: finally extract failed */
    public ArrayList A00(UserJid userJid) {
        Throwable th;
        boolean z;
        UserJid A0I;
        if (userJid == null) {
            return AnonymousClass000.A13();
        }
        AnonymousClass1QY r1 = this.A02;
        TreeSet treeSet = new TreeSet(Collections.reverseOrder());
        long A09 = r1.A04.A09(userJid);
        C28781at A04 = r1.A06.get();
        try {
            C23141Ev r6 = ((C28801av) A04).A02;
            String l = Long.toString(A09);
            Cursor A0A = r6.A0A("SELECT message_row_id FROM message_vcard WHERE _id IN (SELECT vcard_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?)", "GET_VCARDS_BY_JID_SQL", new String[]{l});
            try {
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("message_row_id");
                while (A0A.moveToNext()) {
                    treeSet.add(Long.valueOf(A0A.getLong(columnIndexOrThrow)));
                }
                A0A.close();
                Cursor A0A2 = r6.A0A("SELECT message_row_id FROM message_vcard_jid WHERE vcard_jid_row_id = ?", "GET_VCARD_MESSAGE_ROW_ID_BY_JID_ROW_ID", new String[]{l});
                try {
                    int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("message_row_id");
                    while (A0A2.moveToNext()) {
                        long j = A0A2.getLong(columnIndexOrThrow2);
                        if (j != 0) {
                            treeSet.add(Long.valueOf(j));
                        }
                    }
                    A0A2.close();
                    A04.close();
                    ArrayList A10 = C17880vN.A10(treeSet);
                    ArrayList A13 = AnonymousClass000.A13();
                    Iterator it = A10.iterator();
                    while (it.hasNext()) {
                        long A07 = C17890vO.A07(it);
                        AnonymousClass206 A032 = this.A03.A01.A03(A07);
                        C1417076q r4 = null;
                        if (!(A032 == null || (A0I = A032.A0I()) == null)) {
                            r4 = new C1417076q(A07, userJid.getRawString(), A0I.getRawString());
                        }
                        if (r4 != null) {
                            A13.add(r4);
                        }
                    }
                    if (A13.isEmpty()) {
                        return A13;
                    }
                    ArrayList A0z = C17880vN.A0z(A13.size());
                    HashMap A11 = C17880vN.A11();
                    Iterator it2 = A13.iterator();
                    while (it2.hasNext()) {
                        C1417076q r3 = (C1417076q) it2.next();
                        UserJid A022 = C22941Dw.A02(r3.A02);
                        if (A022 != null) {
                            if (A11.containsKey(A022)) {
                                Object obj = A11.get(A022);
                                C17960vV.A07(obj);
                                z = AnonymousClass000.A1Y(obj);
                            } else {
                                AnonymousClass1E7 A0E = this.A01.A0E(A022);
                                if (A0E == null || (!AnonymousClass3Ma.A1V(this.A00, A0E) && A0E.A0H == null)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                A11.put(A022, Boolean.valueOf(z));
                            }
                            if (z) {
                                A0z.add(r3);
                            }
                        }
                    }
                    return A0z;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            } catch (Throwable th3) {
                th = th3;
                if (A0A != null) {
                    A0A.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            try {
                A04.close();
                throw th4;
            } catch (Throwable th5) {
                AnonymousClass0DT.A00(th4, th5);
                throw th4;
            }
        }
    }

    public C86184Qq(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass1QY r3, AnonymousClass1W6 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
