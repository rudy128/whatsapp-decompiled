package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Chr  reason: case insensitive filesystem */
public final class C25553Chr {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final E53[] A01;
    public final boolean[] A02;

    public static final void A00(C25553Chr chr) {
        for (C0O ordinal : CEW.A00) {
            int ordinal2 = ordinal.ordinal();
            E53[] e53Arr = chr.A01;
            if (e53Arr[ordinal2] != null && chr.A00.get() && chr.A02[ordinal2]) {
                E53 e53 = e53Arr[ordinal2];
                C18070vi.A0b(e53);
                e53.BJu();
            }
        }
    }

    public C25553Chr() {
        C19810z2 r1 = CEW.A00;
        this.A01 = new E53[r1.size()];
        this.A02 = new boolean[r1.size()];
    }
}
