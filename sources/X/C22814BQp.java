package X;

import java.util.Map;

/* renamed from: X.BQp  reason: case insensitive filesystem */
public abstract class C22814BQp extends DTQ {
    public final C25268CcD A00;
    public final ECs A01;
    public final C28605E9w A02;
    public final String A03;

    public void A01() {
        C28605E9w e9w = this.A02;
        ECs eCs = this.A01;
        String str = this.A03;
        e9w.CFc(eCs, str);
        e9w.C1o(eCs, str);
        this.A00.A04();
    }

    public void A02(Exception exc) {
        C28605E9w e9w = this.A02;
        ECs eCs = this.A01;
        String str = this.A03;
        e9w.CFc(eCs, str);
        e9w.C1p(eCs, str, exc, (Map) null);
        this.A00.A08(exc);
    }

    public void A04(Object obj) {
        Map map;
        C28605E9w e9w = this.A02;
        ECs eCs = this.A01;
        String str = this.A03;
        if (e9w.CFc(eCs, str)) {
            map = A05(obj);
        } else {
            map = null;
        }
        e9w.C1q(eCs, str, map);
        this.A00.A07(obj, 1);
    }

    public Map A05(Object obj) {
        String bool;
        if (this instanceof C22865BSt) {
            if (((C22865BSt) this).A00 != 0) {
                return null;
            }
            bool = String.valueOf(AnonymousClass000.A1W(obj));
        } else if (!(this instanceof C22862BSq)) {
            return null;
        } else {
            bool = Boolean.toString(AnonymousClass000.A1W(obj));
        }
        return C27311Dbi.A00("createdThumbnail", bool);
    }

    public C22814BQp(C25268CcD ccD, ECs eCs, C28605E9w e9w, String str) {
        C18070vi.A0j(ccD, e9w);
        this.A00 = ccD;
        this.A02 = e9w;
        this.A01 = eCs;
        this.A03 = str;
        e9w.C1r(eCs, str);
    }
}
