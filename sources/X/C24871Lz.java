package X;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1Lz  reason: invalid class name and case insensitive filesystem */
public class C24871Lz extends C24861Ly {
    public final C18000vb A00;

    public void A0I(AnonymousClass1E7 r2) {
        if (r2 != null) {
            A04(r2, this.A00.A0N());
        }
    }

    public void A0J(Collection collection) {
        Locale A0N = this.A00.A0N();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A04((AnonymousClass1E7) it.next(), A0N);
        }
    }

    public C24871Lz(C18000vb r1, C24811Lt r2) {
        super(r2);
        this.A00 = r1;
    }

    private void A04(AnonymousClass1E7 r10, Locale locale) {
        Cursor A03;
        if (r10.A0O()) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            AnonymousClass1BI r1 = r10.A0J;
            C28781at A05 = this.A00.get();
            try {
                String A06 = C22971Dz.A06(r1);
                C17960vV.A07(A06);
                A03 = C24861Ly.A03(A05, "SELECT lc, verified_name FROM wa_vnames_localized WHERE jid = ? AND lg = ?", "CONTACT_VNAMES_LOCALIZED", new String[]{A06, language});
                int columnIndexOrThrow = A03.getColumnIndexOrThrow("lc");
                int columnIndexOrThrow2 = A03.getColumnIndexOrThrow("verified_name");
                String str = null;
                while (true) {
                    if (!A03.moveToNext()) {
                        break;
                    }
                    String string = A03.getString(columnIndexOrThrow);
                    String string2 = A03.getString(columnIndexOrThrow2);
                    if (TextUtils.isEmpty(string)) {
                        str = string2;
                    } else if (string.equals(country)) {
                        str = string2;
                        break;
                    }
                }
                if (str != null) {
                    r10.A0N(str);
                }
                r10.A0d = locale;
                A03.close();
                A05.close();
                return;
            } catch (Throwable th) {
                try {
                    A05.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }
}
