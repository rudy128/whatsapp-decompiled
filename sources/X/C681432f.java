package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.32f  reason: invalid class name and case insensitive filesystem */
public final class C681432f implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681432f(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof C444323k) || !r3.A10(16)) {
            return false;
        }
        return true;
    }

    public Set BZv() {
        return C18070vi.A0P(C693136s.class);
    }

    public void Bhl(AnonymousClass25F r6) {
        AnonymousClass206 A08 = C18070vi.A08(r6);
        C18070vi.A0z(A08, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageScheduledCall");
        C444323k r4 = (C444323k) A08;
        ArrayList A0D = ((AnonymousClass1WM) this.A00.get()).A0D(r4, 86);
        if (A0D.isEmpty()) {
            r6.A00();
            return;
        }
        boolean z = true;
        if (A0D.size() > 1) {
            z = false;
        }
        C17960vV.A0F(z, "Multiple ScheduledCallEdit add-on message linked to a parent message");
        Iterator it = A0D.iterator();
        while (it.hasNext()) {
            AnonymousClass212 r2 = (AnonymousClass212) it.next();
            if (r2 instanceof C444923q) {
                r4.A00.A02(new C693136s(r2));
            }
        }
    }
}
