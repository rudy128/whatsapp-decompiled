package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.99k  reason: invalid class name and case insensitive filesystem */
public final class C1775999k extends AUL {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;

    public void BDZ(C195629te r4, AnonymousClass8X1 r5, AnonymousClass206 r6) {
        AnonymousClass23O r2;
        String rawString;
        C18070vi.A0d(r6, 0);
        C18070vi.A0j(r5, r4);
        if (!(r6 instanceof AnonymousClass23O) || (r2 = (AnonymousClass23O) r6) == null) {
            throw AnonymousClass8BW.A0S(0);
        }
        super.BDZ(r4, r5, r6);
        r5.A0I(C179859Ke.A01);
        String str = r2.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r5.A0J(str);
        UserJid userJid = r2.A00;
        if (!(userJid == null || (rawString = userJid.getRawString()) == null)) {
            str2 = rawString;
        }
        r5.A0J(str2);
    }

    public /* bridge */ /* synthetic */ AnonymousClass206 CBA(C166388co r6) {
        C179859Ke A0R = r6.A0R();
        if (A0R == C179859Ke.A01) {
            AnonymousClass23O r4 = new AnonymousClass23O(C20106A7k.A02(r6, this.A01), C20106A7k.A00(r6));
            r4.A0a(5);
            r4.A0H = r4.A0I;
            r4.A00 = r6.revokeMessageTimestamp_;
            if (AnonymousClass8BR.A03(r6) > 1) {
                String A0w = C17880vN.A0w(r6.messageStubParameters_, 0);
                if (C108955ca.A05(A0w) > 0) {
                    r4.A01 = A0w;
                }
                UserJid A02 = C22941Dw.A02(C17880vN.A0w(r6.messageStubParameters_, 1));
                if (A02 != null) {
                    r4.A00 = A02;
                } else {
                    AnonymousClass190 r2 = this.A00;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("build=");
                    r2.A0G("FMessageAdminRevokedHistorySync/nullAdminJid", AnonymousClass000.A0y("release", A10), true);
                    return r4;
                }
            }
            return r4;
        }
        throw AnonymousClass8BR.A0p(AnonymousClass001.A1E(A0R, "Unexpected stub type: ", AnonymousClass000.A10()), 0);
    }

    public Set BSF() {
        return C18070vi.A0P(C179859Ke.A01);
    }

    public C1775999k(AnonymousClass190 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
