package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aaz  reason: case insensitive filesystem */
public class C20883Aaz implements C22547BCe {
    public final long A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass22E A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final Long A06;

    public int Bbd() {
        return 2;
    }

    public Jid BTc() {
        AnonymousClass1E7 r0 = this.A01;
        if (r0 != null) {
            return r0.A0J;
        }
        return null;
    }

    public long BYQ() {
        AnonymousClass22E r0 = this.A02;
        if (r0 != null) {
            return r0.A0x;
        }
        Long l = this.A06;
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    public boolean Bef(C22547BCe bCe) {
        AnonymousClass1BI r1;
        if (bCe instanceof C20883Aaz) {
            C20883Aaz aaz = (C20883Aaz) bCe;
            if (AnonymousClass1EG.A0I(this.A03, aaz.A03) && AnonymousClass1EG.A0I(this.A04, aaz.A04) && BYQ() == aaz.BYQ() && C18070vi.A18(BTc(), aaz.BTc())) {
                AnonymousClass1E7 r0 = this.A01;
                AnonymousClass1BI r2 = null;
                if (r0 != null) {
                    r1 = r0.A0J;
                } else {
                    r1 = null;
                }
                AnonymousClass1E7 r02 = aaz.A01;
                if (r02 != null) {
                    r2 = r02.A0J;
                }
                if (!C18070vi.A18(r1, r2) || !C18070vi.A18(this.A06, aaz.A06) || this.A00 != aaz.A00) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C20883Aaz(AnonymousClass1E7 r1, AnonymousClass22E r2, Long l, String str, String str2, long j, boolean z) {
        this.A02 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = z;
        this.A01 = r1;
        this.A06 = l;
    }
}
