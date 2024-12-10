package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CmP  reason: case insensitive filesystem */
public class C25812CmP {
    public static final C27220DZz A0A = new C27220DZz();
    public int A00 = 0;
    public final C25670Ck0 A01;
    public final CYQ A02;
    public final Object A03;
    public final Object A04;
    public final HashMap A05 = C17880vN.A11();
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final Object A09;

    public Object A00() {
        CYQ cyq = this.A02;
        if (!cyq.A00.A06()) {
            return this.A09;
        }
        if (this.A00 != 0) {
            EBZ ebz = this.A01.A00;
            Object obj = this.A09;
            int BhV = ebz.BhV(obj);
            if (BhV <= 0) {
                return null;
            }
            return ((List) obj).get(BhV - 1);
        } else if (this.A08) {
            return null;
        } else {
            throw new C23737Boi(BEA.A0j(cyq, "No results for path: ", AnonymousClass000.A10()));
        }
    }

    public void A02(DSB dsb, Object obj, String str) {
        if (this.A07) {
            this.A06.add(dsb);
        }
        C25670Ck0 ck0 = this.A01;
        EBZ ebz = ck0.A00;
        ebz.CHv(this.A09, this.A00, obj);
        ebz.CHv(this.A03, this.A00, str);
        this.A00++;
        Collection collection = ck0.A02;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("resultFound");
            }
        }
    }

    public C25812CmP(C25670Ck0 ck0, CYQ cyq, Object obj, boolean z) {
        if (obj == null) {
            throw AnonymousClass000.A0k("root can not be null");
        } else if (ck0 != null) {
            this.A07 = z;
            this.A02 = cyq;
            this.A04 = obj;
            this.A01 = ck0;
            C25769Clg clg = ((DOV) ck0.A00).A00;
            this.A09 = clg.A01();
            this.A03 = clg.A01();
            this.A06 = AnonymousClass000.A13();
            this.A08 = ck0.A03.contains(C24287Byk.SUPPRESS_EXCEPTIONS);
        } else {
            throw AnonymousClass000.A0k("configuration can not be null");
        }
    }

    public ArrayList A01() {
        ArrayList A13 = AnonymousClass000.A13();
        if (this.A00 > 0) {
            Iterator it = this.A01.A00.CPI(this.A03).iterator();
            while (it.hasNext()) {
                BE7.A1R(A13, it);
            }
        }
        return A13;
    }
}
