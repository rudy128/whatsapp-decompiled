package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1PL  reason: invalid class name */
public class AnonymousClass1PL extends C24861Ly {
    public final AnonymousClass1M2 A00;
    public final C24851Lx A01;
    public final AnonymousClass00H A02;

    public C42741yf A0I(UserJid userJid) {
        Cursor A03;
        C42741yf r7 = null;
        if (userJid == null) {
            Log.w("contact-mgr-db/cannot get verified name details by null jid");
            return null;
        }
        C28781at A05 = this.A00.get();
        try {
            A03 = C24861Ly.A03(A05, AnonymousClass2WV.A01, "CONTACT_VNAMES", new String[]{this.A01.A00(userJid).getRawString()});
            if (!A03.isClosed() && A03.moveToNext()) {
                r7 = AnonymousClass2T3.A00(A03);
            }
            A03.close();
            A05.close();
            return r7;
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

    public static void A04(AnonymousClass1PL r7, C41851xA r8, UserJid userJid) {
        C17960vV.A0D(r8.A01());
        String A06 = C22971Dz.A06(r7.A01.A00(userJid));
        C17960vV.A07(A06);
        C28791au A062 = r7.A00.A06();
        try {
            C24861Ly.A02(A062, "wa_vnames", "jid = ?", new String[]{A06});
            C24861Ly.A02(A062, "wa_vnames_localized", "jid = ?", new String[]{A06});
            A062.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass1PL(AnonymousClass1M2 r1, C24851Lx r2, C24811Lt r3, AnonymousClass00H r4) {
        super(r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r4;
    }
}
