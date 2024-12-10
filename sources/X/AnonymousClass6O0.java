package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6O0  reason: invalid class name */
public class AnonymousClass6O0 extends C24861Ly {
    public Cursor A0I() {
        C28781at A05 = this.A00.get();
        try {
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = C29671cg.A00.getRawString();
            Cursor A03 = C24861Ly.A03(A05, "SELECT jid, conversation_size, conversation_message_count FROM wa_contact_storage_usage WHERE jid != ? ORDER BY conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES", A1Y);
            A05.close();
            return A03;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0J(AnonymousClass7PZ r11) {
        C41851xA BD0;
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                String rawString = r11.A01().getRawString();
                ContentValues A08 = C17880vN.A08();
                C17880vN.A19(A08, "conversation_size", r11.A00.A0I);
                C17880vN.A18(A08, "conversation_message_count", r11.A00.A06);
                if (C24861Ly.A01(A08, A06, "wa_contact_storage_usage", "jid = ?", C108975cc.A1b(rawString)) == 0) {
                    A08.put("jid", rawString);
                    C24861Ly.A05(A08, A06, "wa_contact_storage_usage");
                }
                BD0.A00();
                BD0.close();
                A06.close();
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C17960vV.A09("contact-mgr-db/unable to update batch on storage usage table", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public void A0K(List list) {
        C41851xA BD0;
        ContentValues A08 = C17880vN.A08();
        try {
            C28791au A06 = this.A00.A06();
            try {
                BD0 = A06.BD0();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                    if (A0Q != null) {
                        A08.put("jid", A0Q.getRawString());
                        A08.put("conversation_size", 0);
                        A08.put("conversation_message_count", 0);
                        C24861Ly.A05(A08, A06, "wa_contact_storage_usage");
                    }
                }
                BD0.A00();
                BD0.close();
                A06.close();
                return;
            } catch (Throwable th) {
                A06.close();
                throw th;
            }
            throw th;
        } catch (IllegalArgumentException e) {
            C17960vV.A09("contact-mgr-db/unable to insert batch to storage usage table", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public AnonymousClass6O0(C24811Lt r1) {
        super(r1);
    }
}
