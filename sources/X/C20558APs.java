package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.APs  reason: case insensitive filesystem */
public final class C20558APs implements C22438B7u {
    public final C184399at A00;
    public final C26191Re A01;

    public C20558APs(C184399at r2, C26191Re r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public Object CGG(C198589ya r7, C179319Hm r8, BCS bcs, String str, C30391dr r11) {
        Cursor A03;
        C184399at r4 = this.A00;
        AnonymousClass1PL r0 = r4.A00.A03;
        HashSet A12 = C17880vN.A12();
        C28781at A05 = r0.A00.get();
        try {
            A03 = C24861Ly.A03(A05, "SELECT jid FROM wa_vnames WHERE issuer LIKE 'smb:%'", "GET_SMB_JIDS", (String[]) null);
            int columnIndexOrThrow = A03.getColumnIndexOrThrow("jid");
            while (A03.moveToNext()) {
                UserJid A02 = C22941Dw.A02(A03.getString(columnIndexOrThrow));
                if (A02 != null) {
                    A12.add(A02);
                }
            }
            A03.close();
            A05.close();
            LinkedHashSet A14 = C17880vN.A14();
            Iterator it = A12.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (r4.A01.A0P(A0Q)) {
                    C18070vi.A0b(A0Q);
                    A14.add(A0Q);
                }
            }
            A14.size();
            if (!A14.isEmpty()) {
                this.A01.A01((UserJid[]) A14.toArray(new UserJid[0]), 3);
            }
            return new C184379ar(AnonymousClass9I9.UNKNOWN, true);
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
}
