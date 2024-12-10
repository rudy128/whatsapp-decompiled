package X;

import java.util.List;

/* renamed from: X.380  reason: invalid class name */
public class AnonymousClass380 implements C1602687u {
    public final int A00;
    public final Object A01;

    public AnonymousClass380(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C143667Eh BGg(List list) {
        AnonymousClass10E r1;
        C18030ve A8r;
        AnonymousClass00S r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((AnonymousClass10H) obj).A00;
            A8r = AnonymousClass10E.A8r(r1);
            r0 = r1.A00.A2w;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            r1 = r02.A01;
            A8r = AnonymousClass10E.A8r(r1);
            r0 = r02.A00.A4W;
        }
        AnonymousClass1M9 A4z = AnonymousClass10E.A4z(r1);
        return new C143667Eh(AnonymousClass10E.A17(r1), A4z, (C24921Me) r1.ABX.get(), A8r, (C52682bJ) r0.get(), list);
    }
}
