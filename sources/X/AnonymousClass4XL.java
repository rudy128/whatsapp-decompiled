package X;

import com.whatsapp.WaTextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4XL  reason: invalid class name */
public final class AnonymousClass4XL {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C24751Ln A02;

    public static final void A00(WaTextView waTextView, AnonymousClass11P r13, long j) {
        long A012 = AnonymousClass11P.A01(r13);
        long j2 = j;
        if (j - A012 > 0) {
            waTextView.setText(C64052u8.A00(waTextView.getContext(), waTextView.getWhatsAppLocale(), j2, A012));
            waTextView.setVisibility(0);
            return;
        }
        waTextView.setVisibility(4);
    }

    public final String A01(List list) {
        AnonymousClass1E1 r1;
        PhoneUserJid A0D;
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (!(!(userJid instanceof AnonymousClass1E2) || (r1 = (AnonymousClass1E1) userJid) == null || (A0D = this.A02.A0D(r1)) == null)) {
                userJid = A0D;
            }
            A0D2.add(AnonymousClass3MY.A0q(this.A01, this.A00.A0H(userJid)));
        }
        return C17880vN.A0w(A0D2, 0);
    }

    public AnonymousClass4XL(AnonymousClass1M9 r1, C24921Me r2, C24751Ln r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
