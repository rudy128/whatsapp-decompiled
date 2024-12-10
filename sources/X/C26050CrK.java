package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CrK  reason: case insensitive filesystem */
public class C26050CrK {
    public final C25140CZq A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public static C26050CrK A00(C26050CrK crK, Map map, Map map2, Map map3, Map map4) {
        return new C26050CrK(crK.A00, map, map2, map3, map4, crK.A02, crK.A05, crK.A06, crK.A01);
    }

    public C26050CrK A01(C25140CZq cZq) {
        if (cZq != null) {
            Map map = cZq.A00;
            if (!map.isEmpty()) {
                C25140CZq cZq2 = this.A00;
                C18070vi.A0d(cZq2, 0);
                return new C26050CrK(new C25140CZq(AnonymousClass1D7.A09(cZq2.A00, map)), this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, this.A01);
            }
        }
        return this;
    }

    public C26050CrK A03(List list) {
        if (list == null || list.isEmpty()) {
            return this;
        }
        HashMap A10 = BE6.A10(this.A06);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CQM cqm = (CQM) it.next();
            A10.put(cqm.A02, cqm);
        }
        return new C26050CrK(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, A10, this.A01);
    }

    public C26050CrK A06(Map map) {
        if (map == null || map.isEmpty()) {
            return this;
        }
        HashMap A10 = BE6.A10(this.A05);
        A10.putAll(map);
        return new C26050CrK(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, A10, this.A06, this.A01);
    }

    public C26050CrK A07(Map map) {
        HashMap A10 = BE6.A10(this.A08);
        A10.putAll(map);
        return A00(this, this.A07, this.A04, A10, this.A03);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26050CrK)) {
            return false;
        }
        C26050CrK crK = (C26050CrK) obj;
        if (this.A04 == crK.A04 && this.A03 == crK.A03 && this.A07 == crK.A07 && this.A08.equals(crK.A08) && this.A02.equals(crK.A02) && this.A00.equals(crK.A00) && this.A05 == crK.A05 && this.A06 == crK.A06 && this.A01 == crK.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A07;
        objArr[1] = this.A04;
        objArr[2] = this.A08;
        objArr[3] = this.A03;
        objArr[4] = this.A02;
        objArr[5] = this.A00;
        objArr[6] = this.A05;
        objArr[7] = this.A06;
        return AnonymousClass000.A0P(this.A01, objArr, 8);
    }

    public C26050CrK(C25140CZq cZq, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8) {
        this.A07 = map;
        this.A04 = map2;
        this.A08 = map3;
        this.A03 = map4;
        this.A02 = map5;
        this.A00 = cZq;
        this.A05 = map6;
        this.A06 = map7;
        this.A01 = map8;
    }

    public C26050CrK A02(List list) {
        if (list.isEmpty()) {
            return this;
        }
        HashMap A10 = BE6.A10(this.A02);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            COG cog = (COG) it.next();
            A10.put(cog.A01, cog);
        }
        return new C26050CrK(this.A00, this.A07, this.A04, this.A08, this.A03, A10, this.A05, this.A06, this.A01);
    }

    public C26050CrK A04(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap A10 = BE6.A10(this.A01);
        A10.putAll(map);
        return new C26050CrK(this.A00, this.A07, this.A04, this.A08, this.A03, this.A02, this.A05, this.A06, A10);
    }

    public C26050CrK A05(Map map) {
        if (map.isEmpty()) {
            return this;
        }
        HashMap A10 = BE6.A10(this.A04);
        A10.putAll(map);
        return A00(this, this.A07, A10, this.A08, this.A03);
    }

    public C26050CrK() {
        this.A07 = Collections.emptyMap();
        this.A04 = Collections.emptyMap();
        this.A08 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A00 = CCE.A00(Collections.emptyMap());
        this.A05 = Collections.emptyMap();
        this.A06 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
    }
}
