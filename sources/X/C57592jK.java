package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2jK  reason: invalid class name and case insensitive filesystem */
public class C57592jK {
    public final AnonymousClass190 A00;
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;

    public void A00(AnonymousClass23N r9) {
        Long l;
        UserJid userJid;
        boolean z = false;
        boolean A1R = AnonymousClass000.A1R((r9.A0x > 0 ? 1 : (r9.A0x == 0 ? 0 : -1)));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RevokedMessageStore/insertOrUpdateRevokedMessage/message must have row_id set; key=");
        AnonymousClass205 r3 = r9.A0v;
        C17960vV.A0G(A1R, C17890vO.A0V(r3, A10));
        C17960vV.A0G(AnonymousClass000.A1T(r9.A0E(), 1), AnonymousClass001.A1E(r3, "RevokedMessageStore/insertOrUpdateRevokedMessage/message in main storage; key=", AnonymousClass000.A10()));
        C28791au A05 = this.A02.A05();
        try {
            ContentValues A08 = C17880vN.A08();
            A08.put("message_row_id", Long.valueOf(r9.A0x));
            C63432t4.A01(A08, "revoked_key_id", r9.A01);
            if (!(r9 instanceof AnonymousClass23O) || (userJid = ((AnonymousClass23O) r9).A00) == null) {
                l = null;
            } else {
                l = AnonymousClass1DL.A04(this.A01, userJid);
            }
            C63432t4.A00(A08, l, "admin_jid_row_id");
            A08.put("revoke_timestamp", Long.valueOf(r9.A00));
            if (((C28801av) A05).A02.A09("message_revoked", "INSERT_MESSAGE_REVOKED_SQL", A08, 5) == r9.A0x) {
                z = true;
            }
            C17960vV.A0H(z, "RevokedMessageStore/insertOrUpdateRevokedMessage/inserted row should have same row_id");
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C57592jK(AnonymousClass190 r1, AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
