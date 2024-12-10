package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.39I  reason: invalid class name */
public final class AnonymousClass39I implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void BL9(AnonymousClass206 r15) {
        Cursor A0A;
        C18070vi.A0d(r15, 0);
        C25961Qh r11 = (C25961Qh) this.A02.get();
        AnonymousClass23S r152 = (AnonymousClass23S) r15;
        String[] A1Y = C17880vN.A1Y();
        C17880vN.A1U(A1Y, 0, r152.A0x);
        C28781at A04 = r11.A01.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , expired , group_type FROM message_group_invite WHERE message_row_id = ?", "GET_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL", A1Y);
            if (A0A.moveToNext()) {
                long A06 = C17890vO.A06(A0A, "expiration");
                long A062 = C17890vO.A06(A0A, "group_jid_row_id");
                long A063 = C17890vO.A06(A0A, "admin_jid_row_id");
                String A0S = C17890vO.A0S(A0A, "group_name");
                String A0S2 = C17890vO.A0S(A0A, "invite_code");
                int A012 = C17890vO.A01(A0A, "expired");
                int A013 = C17890vO.A01(A0A, "group_type");
                AnonymousClass1DL r112 = r11.A00;
                AnonymousClass1EC r6 = (AnonymousClass1EC) r112.A0E(AnonymousClass1EC.class, A062);
                UserJid userJid = (UserJid) r112.A0E(UserJid.class, A063);
                if (r6 == null || userJid == null) {
                    Log.e("GroupInviteMessageStore/fillGroupInviteInfo/could not fill group invite data as groupJid and/or adminJid are null");
                } else {
                    boolean A1O = AnonymousClass000.A1O(A012);
                    r152.A02 = r6;
                    r152.A03 = userJid;
                    r152.A05 = A0S;
                    r152.A06 = A0S2;
                    r152.A01 = A06;
                    r152.A07 = A1O;
                    r152.A00 = A013;
                }
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
        throw th;
    }

    public void BdY(AnonymousClass206 r6) {
        long A022;
        AnonymousClass23S r2;
        C18070vi.A0d(r6, 0);
        AnonymousClass23S r62 = (AnonymousClass23S) r6;
        if (!r62.A07) {
            AnonymousClass205 r4 = r62.A0v;
            boolean z = r4.A02;
            C25961Qh r22 = (C25961Qh) this.A02.get();
            AnonymousClass1EC r1 = r62.A02;
            if (!z) {
                A022 = r22.A01(r1, r62.A03);
            } else {
                C22941Dw r0 = UserJid.Companion;
                A022 = r22.A02(r1, C22941Dw.A01(r4.A00));
            }
            if (!(A022 == -1 || (r2 = (AnonymousClass23S) AnonymousClass1W2.A02(this.A01, A022)) == null)) {
                r2.A07 = true;
                ((AnonymousClass121) this.A00.get()).CQx(r2, 21);
            }
        }
        ((C25961Qh) this.A02.get()).A03(r62);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C25961Qh) this.A02.get()).A03((AnonymousClass23S) r2);
    }

    public AnonymousClass39I(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
