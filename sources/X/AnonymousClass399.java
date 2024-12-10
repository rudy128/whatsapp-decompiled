package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.399  reason: invalid class name */
public final class AnonymousClass399 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass399(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BL9(AnonymousClass206 r10) {
        Cursor A0A;
        C18070vi.A0d(r10, 0);
        if (r10 instanceof AnonymousClass23N) {
            C57592jK r6 = (C57592jK) this.A00.get();
            AnonymousClass23N r102 = (AnonymousClass23N) r10;
            C17960vV.A0G(AnonymousClass000.A1R((r102.A0x > 0 ? 1 : (r102.A0x == 0 ? 0 : -1))), AnonymousClass206.A03(r102, "RevokedMessageStore/fillRevokedInfo/message must have row_id set; key=", AnonymousClass000.A10()));
            String[] strArr = new String[1];
            C17880vN.A1U(strArr, 0, r102.A0x);
            C28781at A04 = r6.A02.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT revoked_key_id,admin_jid_row_id,revoke_timestamp FROM message_revoked WHERE message_row_id = ?", "GET_REVOKED_MESSAGE_BY_ROW_ID_SQL", strArr);
                if (A0A.moveToNext()) {
                    r102.A01 = C17890vO.A0S(A0A, "revoked_key_id");
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("admin_jid_row_id");
                    if (!A0A.isNull(columnIndexOrThrow)) {
                        long j = A0A.getLong(columnIndexOrThrow);
                        if (Long.valueOf(j) != null) {
                            if (r102 instanceof AnonymousClass23O) {
                                UserJid userJid = (UserJid) r6.A01.A0E(UserJid.class, j);
                                C17960vV.A07(userJid);
                                ((AnonymousClass23O) r102).A00 = userJid;
                            } else {
                                r6.A00.A0G("RevokedMessageStore/fillRevokedInfo invalid cast", Integer.toString(r102.A0u), true);
                            }
                        }
                    }
                    r102.A00 = C17890vO.A06(A0A, "revoke_timestamp");
                }
                A0A.close();
                A04.close();
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57592jK) this.A00.get()).A00((AnonymousClass23N) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57592jK) this.A00.get()).A00((AnonymousClass23N) r2);
    }
}
