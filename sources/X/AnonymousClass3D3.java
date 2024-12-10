package X;

import java.util.Comparator;

/* renamed from: X.3D3  reason: invalid class name */
public class AnonymousClass3D3 implements Comparator {
    public final int A00;
    public final Object A01;

    public AnonymousClass3D3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C23281Fk r3 = (C23281Fk) this.A01;
            return AnonymousClass1XO.A00(r3.A06.A03(((Number) obj).intValue()), r3.A06.A03(((Number) obj2).intValue()));
        }
        float A04 = AnonymousClass000.A04(((C19760yx) obj).A01);
        float A042 = AnonymousClass000.A04(((C19760yx) obj2).A01);
        if (A042 > A04) {
            return 1;
        }
        if (A04 > A042) {
            return -1;
        }
        return 0;
    }
}
