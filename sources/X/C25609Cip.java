package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cip  reason: case insensitive filesystem */
public final class C25609Cip {
    public final C25140CZq A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;

    public C25609Cip(C25140CZq cZq, List list, List list2, List list3, List list4, List list5, Map map, Map map2) {
        this.A05 = list == null ? Collections.emptyList() : list;
        this.A06 = map == null ? Collections.emptyMap() : map;
        this.A02 = list2 == null ? Collections.emptyList() : list2;
        this.A01 = list3 == null ? Collections.emptyList() : list3;
        this.A03 = list4 == null ? Collections.emptyList() : list4;
        this.A00 = cZq;
        this.A07 = map2 == null ? Collections.emptyMap() : map2;
        this.A04 = list5 == null ? Collections.emptyList() : list5;
    }

    public C25609Cip() {
        this((C25140CZq) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null);
    }
}
