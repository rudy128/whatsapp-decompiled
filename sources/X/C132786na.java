package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.6na  reason: invalid class name and case insensitive filesystem */
public final class C132786na {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final Set A02 = C17880vN.A14();
    public final C18600wl A03;
    public final AnonymousClass1OX A04;

    public final List A00() {
        List A0t;
        Set set = this.A02;
        synchronized (set) {
            A0t = C29431cG.A0t(set);
        }
        return A0t;
    }

    public C132786na(AnonymousClass00H r2, AnonymousClass00H r3, C18600wl r4, AnonymousClass1OX r5) {
        C18070vi.A0s(r2, r3, r5, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }
}
