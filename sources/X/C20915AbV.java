package X;

import java.util.Map;

/* renamed from: X.AbV  reason: case insensitive filesystem */
public final class C20915AbV implements C22522BBf {
    public final C18000vb A00;

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        int i;
        ARR arr = (ARR) obj;
        C179909Kj r5 = (C179909Kj) enumR;
        boolean A17 = C18070vi.A17(arr, r5);
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            return AnonymousClass8BU.A0n(arr);
        }
        if (ordinal == A17) {
            i = (int) (arr.A02.A00.doubleValue() * ((double) arr.A00));
        } else if (ordinal == 2) {
            i = arr.A00;
        } else if (ordinal == 3) {
            return arr.A01.BLb(this.A00, arr.A02.A00);
        } else {
            if (ordinal == 4) {
                return arr.A01.BLd(this.A00, arr.A02.A00);
            }
            throw AnonymousClass3MW.A14();
        }
        return Integer.valueOf(i);
    }

    public C20915AbV(C18000vb r1) {
        this.A00 = r1;
    }

    public Class BL8() {
        return C179909Kj.class;
    }
}
