package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5yX  reason: invalid class name and case insensitive filesystem */
public final class C116735yX extends C42601yR {
    public final C139186yN A00;
    public final C139116yF A01;
    public final boolean A02;

    public C116735yX(C139186yN r2, C139116yF r3, boolean z) {
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = z;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        List<C63372sx> list = this.A00.A01;
        ArrayList A13 = AnonymousClass000.A13();
        for (C63372sx A012 : list) {
            AnonymousClass6JB A013 = this.A01.A01(A012, true, false, this.A02, false, false);
            if (A013 != null) {
                A13.add(A013);
            }
        }
        return A13;
    }
}
