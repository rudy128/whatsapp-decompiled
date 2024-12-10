package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;

/* renamed from: X.2sT  reason: invalid class name and case insensitive filesystem */
public final class C63082sT {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final long A00(C63082sT r2, C47712Jo r3) {
        C199410f A09 = ((AnonymousClass1MZ) r2.A02.get()).A08.A0B(r3).A09();
        C18070vi.A0X(A09);
        ArrayList A10 = C17880vN.A10(A09);
        PhoneUserJid A002 = AnonymousClass11S.A00(C17880vN.A0H(r2.A03));
        if (A002 != null) {
            A10.remove(A002);
        }
        return (long) A10.size();
    }

    public static final void A01(C63082sT r2, int i, long j) {
        AnonymousClass2F0 r1 = new AnonymousClass2F0();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Long.valueOf(j);
        ((AnonymousClass18K) r2.A01.get()).CC7(r1);
    }

    public C63082sT(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
