package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.30s  reason: invalid class name and case insensitive filesystem */
public final class C677530s implements AnonymousClass1WS {
    public final AnonymousClass11S A00;
    public final C26911Ty A01;
    public final AnonymousClass1M9 A02;
    public final C19830z4 A03;
    public final AnonymousClass4S5 A04;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r9, int i) {
        AnonymousClass1BI r2;
        AnonymousClass1E7 A0E;
        AEW A08;
        String str;
        C18070vi.A0d(r9, 0);
        AnonymousClass205 r22 = r9.A0v;
        if (r22.A02 && r9.A0u != 7) {
            C26911Ty r1 = this.A01;
            if (r1.A0J() && (r2 = r22.A00) != null && (A0E = this.A02.A0E(r2)) != null && A0E.A0C() && (A08 = r1.A08(C22941Dw.A00(r2))) != null && A08.A0Y) {
                PhoneUserJid A002 = AnonymousClass11S.A00(this.A00);
                if (A002 != null) {
                    str = A002.getRawString();
                } else {
                    str = null;
                }
                AnonymousClass4S5 r12 = this.A04;
                if (r2 instanceof UserJid) {
                    r2 = r12.A00((UserJid) r2);
                }
                String rawString = r2.getRawString();
                synchronized (this) {
                    if (str != null) {
                        C19830z4 r3 = this.A03;
                        if (!r3.A2c(str, rawString)) {
                            SharedPreferences.Editor A003 = C19830z4.A00(r3);
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("dc_customer_sent_message_");
                            A10.append(str);
                            C17880vN.A1F(A003, C17890vO.A0Z(rawString, A10, '_'), true);
                            r3.A1S(rawString);
                            r3.A1T(rawString);
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public C677530s(AnonymousClass11S r1, C26911Ty r2, AnonymousClass1M9 r3, C19830z4 r4, AnonymousClass4S5 r5) {
        C18070vi.A0w(r2, r1, r4, r3, r5);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }
}
