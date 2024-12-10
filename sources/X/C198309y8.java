package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9y8  reason: invalid class name and case insensitive filesystem */
public final class C198309y8 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass00H A01 = C201811d.A00(49515);
    public final C18100vl A02;
    public final C198579yZ A03;

    public static final void A00(C179309Hl r7, C198309y8 r8, UserJid userJid, String str) {
        C193739qa r3 = new C193739qa(userJid, str);
        C22251B0f b0f = new C22251B0f(r7, r8);
        ArrayList A13 = AnonymousClass000.A13();
        ((AnonymousClass9XD) r8.A01.get()).A00.get();
        int i = 0;
        do {
            A13.add(AnonymousClass8m0.A00);
            i++;
        } while (i < 3);
        Object r5 = new AnonymousClass8m8(A13);
        Object r2 = new AnonymousClass8m7(A13);
        int ordinal = r7.ordinal();
        if (ordinal != 0) {
            r5 = r2;
        }
        C108945cZ.A0Q(r8.A02).A0F(r5);
        if (ordinal != 0) {
            C198579yZ.A00(r8.A03, r3, b0f);
            return;
        }
        C198579yZ r22 = r8.A03;
        C184299aj r1 = (C184299aj) r22.A05.get();
        r1.A00 = null;
        ((AtomicReference) r1.A01.getValue()).set(r3);
        C198579yZ.A00(r22, r3, b0f);
    }

    public C198309y8(C198579yZ r2) {
        this.A03 = r2;
        C18110vm A012 = AnonymousClass1DF.A01(C22056Aww.A00);
        this.A02 = A012;
        this.A00 = (AnonymousClass1DS) A012.getValue();
    }
}
