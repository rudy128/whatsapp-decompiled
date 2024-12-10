package X;

import java.util.Set;

/* renamed from: X.32k  reason: invalid class name and case insensitive filesystem */
public final class C681932k implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681932k(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (!(r4 instanceof C441822l) || r4.A0E() == 2) {
            return false;
        }
        return r4.A11(32768);
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass7LG.class);
    }

    public void Bhl(AnonymousClass25F r3) {
        AnonymousClass206 A08 = C18070vi.A08(r3);
        C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAudio");
        ((CY4) this.A00.get()).A01((C441822l) A08);
    }
}
