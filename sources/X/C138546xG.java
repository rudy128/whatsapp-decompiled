package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.suggestions.SuggestionsEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6xG  reason: invalid class name and case insensitive filesystem */
public final class C138546xG {
    public final C18030ve A00;
    public final SuggestionsEngine A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass00H A05;

    public C138546xG(AnonymousClass1M9 r2, C18030ve r3, SuggestionsEngine suggestionsEngine, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r5, suggestionsEngine, r6);
        C18070vi.A0d(r7, 6);
        this.A00 = r3;
        this.A04 = r2;
        this.A05 = r5;
        this.A01 = suggestionsEngine;
        this.A02 = r6;
        this.A03 = r7;
    }

    public static final List A00(C138546xG r6, String str, Set set) {
        List A0c = C108995ce.A0c(str);
        ArrayList A0D = C29351c6.A0D(A0c);
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            A0D.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = A0D.iterator();
        while (it2.hasNext()) {
            UserJid A022 = C22941Dw.A02(C17880vN.A0v(it2));
            if (A022 != null) {
                A13.add(A022);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it3 = A13.iterator();
        while (it3.hasNext()) {
            AnonymousClass1E7 A0E = r6.A04.A0E(C17880vN.A0Q(it3));
            if (A0E != null) {
                A132.add(A0E);
            }
        }
        ArrayList A133 = AnonymousClass000.A13();
        for (Object next : A132) {
            AnonymousClass1E7 r2 = (AnonymousClass1E7) next;
            if (set.contains(r2) && !AnonymousClass3MW.A0V(r6.A05).A0P(AnonymousClass3MZ.A0x(r2))) {
                A133.add(next);
            }
        }
        return A133;
    }
}
