package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.util.HashSet;

/* renamed from: X.2Jz  reason: invalid class name and case insensitive filesystem */
public final class C47792Jz extends AnonymousClass4VM {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void A03() {
        Cursor A002;
        if (!C17880vN.A0H(this.A02).A0N()) {
            AnonymousClass1LW r5 = (AnonymousClass1LW) this.A00.get();
            HashSet A12 = C17880vN.A12();
            C28781at A04 = r5.A03.get();
            try {
                A002 = C23141Ev.A00(((C28801av) A04).A02, "SELECT\n    jid.raw_string \nFROM chat as chat  \nLEFT JOIN jid AS jid\n    ON jid._id = chat.jid_row_id\nWHERE\n    chat.account_jid_row_id IS NULL \n    AND jid.type = 0\n    AND \n  (\n    ( \n      jid.user < 13135550000 OR \n      jid.user > 13135559999\n    ) \n    AND\n    (\n      jid.user < 13165550000 OR \n      jid.user > 13165550099\n    )\n  )\n", "Chat/FETCH_PN_JIDS_WITH_MISSING_LIDS");
                int columnIndexOrThrow = A002.getColumnIndexOrThrow("raw_string");
                while (A002.moveToNext()) {
                    Jid A022 = Jid.Companion.A02(A002.getString(columnIndexOrThrow));
                    if (A022 instanceof PhoneUserJid) {
                        PhoneUserJid phoneUserJid = (PhoneUserJid) A022;
                        if (!C17880vN.A0H(r5.A07).A0O(phoneUserJid) && !C42701yb.A01(phoneUserJid) && phoneUserJid != null && !C22971Dz.A0Z(phoneUserJid)) {
                            A12.add(phoneUserJid);
                        }
                    }
                }
                A002.close();
                A04.close();
                if (!A12.isEmpty()) {
                    ((C62082ql) this.A01.get()).A00(A12);
                    return;
                }
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47792Jz(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        super(r1, r4);
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r5;
    }

    public int A00() {
        return 11812;
    }

    public String A01() {
        return "assign_client_generated_lid_to_out_contacts";
    }
}
