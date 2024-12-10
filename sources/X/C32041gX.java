package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.1gX  reason: invalid class name and case insensitive filesystem */
public final class C32041gX implements C25341Nv {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public C32041gX(C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean Bca(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        if (!(r4 instanceof AnonymousClass21V)) {
            return false;
        }
        AnonymousClass21V r42 = (AnonymousClass21V) r4;
        if (r42.A17() == null || r42.A0C.A03) {
            return false;
        }
        return true;
    }

    public void Bhl(AnonymousClass25F r7) {
        C18070vi.A0d(r7, 0);
        AnonymousClass206 r1 = r7.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia");
        C693436v A17 = ((AnonymousClass21V) r1).A17();
        if (A17 != null) {
            synchronized (this) {
                AnonymousClass21V r3 = A17.A03;
                C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia");
                AnonymousClass25F r2 = r3.A0C;
                if (!r2.A03) {
                    C53802d7 A002 = ((AnonymousClass1SX) this.A01.get()).A00(r3.A0v);
                    if (A002 != null) {
                        A17.A03(A002.A00, A002.A01);
                        A17.A04 = C63652tT.A01(this.A00, r3);
                    }
                    r2.A00();
                }
            }
        }
        r7.A00();
    }

    public Set BZv() {
        Set<C693436v> singleton = Collections.singleton(C693436v.class);
        C18070vi.A0X(singleton);
        return singleton;
    }
}
