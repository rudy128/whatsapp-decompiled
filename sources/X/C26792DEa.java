package X;

import java.util.List;

/* renamed from: X.DEa  reason: case insensitive filesystem */
public final class C26792DEa implements E9B {
    public final C26544D3f A00;

    public C24907CPa BOy(C24331BzS bzS, C24331BzS bzS2, List list, List list2, List list3, int i, int i2) {
        C26544D3f d3f = this.A00;
        C26542D3d d3d = d3f.A01;
        C26132Csv csv = new C26132Csv(d3d.A01, d3d.A00);
        C26542D3d d3d2 = d3f.A00;
        return new C24907CPa(csv, new C26132Csv(d3d2.A01, d3d2.A00), (C26132Csv) null);
    }

    public C24907CPa BX5(List list, List list2, int i, int i2) {
        C26544D3f d3f = this.A00;
        C26542D3d d3d = d3f.A01;
        C26132Csv csv = new C26132Csv(d3d.A01, d3d.A00);
        C26542D3d d3d2 = d3f.A00;
        return new C24907CPa(csv, new C26132Csv(d3d2.A01, d3d2.A00), (C26132Csv) null);
    }

    public C24907CPa BXW(List list, int i, int i2) {
        throw BE6.A0v("Only photo mode is used");
    }

    public C24907CPa BbQ(List list, List list2, int i, int i2) {
        throw BE6.A0v("Only photo mode is used");
    }

    public C26792DEa(C26544D3f d3f) {
        this.A00 = d3f;
    }
}
