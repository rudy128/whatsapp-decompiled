package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CXc  reason: case insensitive filesystem */
public final class C25091CXc {
    public C26050CrK A00;
    public CFu A01;
    public final C25062CVu A02;
    public final CQH A03;
    public final CQH A04;
    public final C25416CfO A05;
    public final HashMap A06 = C17880vN.A11();
    public final List A07 = AnonymousClass000.A13();
    public final List A08 = AnonymousClass000.A13();
    public final Map A09 = C17880vN.A11();
    public final Map A0A;
    public final Map A0B;
    public final Map A0C = C17880vN.A11();
    public final Set A0D;
    public final C22415B6x A0E;
    public final String A0F;

    public C23736Boh A00(DFL dfl, C24807CLa cLa, E8A e8a) {
        List list = dfl.A0A;
        Map map = this.A09;
        C26050CrK crK = this.A00;
        Map map2 = this.A0C;
        C22415B6x b6x = this.A0E;
        CFu cFu = this.A01;
        String str = this.A0F;
        return new C23736Boh((E9O) null, (DOZ) null, (DOZ) null, crK, cLa, cFu, C199029zJ.A01, e8a, b6x, AnonymousClass00R.A00, str, (String) null, list, map, map2);
    }

    public C25091CXc(C26050CrK crK, C25062CVu cVu, C25011CTl cTl, CFu cFu, C25416CfO cfO, C22415B6x b6x, String str, Map map) {
        this.A0E = b6x;
        this.A0A = map;
        this.A01 = cFu;
        this.A0F = str;
        this.A00 = crK;
        this.A02 = cVu;
        this.A05 = cfO;
        if (cTl != null) {
            CQH cqh = cTl.A00;
            this.A04 = new CQH(cqh);
            this.A03 = cqh;
            this.A0B = cTl.A07;
            this.A0D = C17880vN.A12();
            Iterator A15 = AnonymousClass000.A15(cTl.A06);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                if (!C25337Cdw.A00(A16.getValue(), crK.A08.get(key))) {
                    this.A0D.add(key);
                }
            }
            return;
        }
        this.A04 = new CQH((CQH) null);
        this.A03 = new CQH((CQH) null);
        this.A0B = Collections.emptyMap();
    }
}
