package X;

import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.4ZH  reason: invalid class name */
public final class AnonymousClass4ZH {
    public AnonymousClass4TK A00;
    public Set A01 = C17880vN.A12();
    public final C25231Nk A02 = new C95444mF(this, 8);
    public final AnonymousClass1NN A03;
    public final C41111vp A04;
    public final C41111vp A05;
    public final C22821Di A06;

    public AnonymousClass4ZH(AnonymousClass1NN r4, C22821Di r5) {
        C18070vi.A0d(r4, 1);
        this.A03 = r4;
        this.A06 = r5;
        AnonymousClass4TK r0 = new AnonymousClass4TK(C17880vN.A12(), new AnonymousClass5Af(this, 14));
        this.A00 = r0;
        C41111vp A0n = AnonymousClass3MW.A0n(r0);
        this.A05 = A0n;
        this.A04 = A0n;
    }

    public static final void A00(AnonymousClass4ZH r3) {
        if (!r3.A00.A00.isEmpty()) {
            AnonymousClass4TK r1 = new AnonymousClass4TK(C17880vN.A14(), r3.A00.A01);
            r3.A00 = r1;
            r3.A05.A0E(r1);
        }
    }

    public static final void A01(AnonymousClass4ZH r3, GroupJid groupJid) {
        Set set = r3.A00.A00;
        if (set.contains(groupJid)) {
            set.remove(groupJid);
        } else {
            set.add(groupJid);
        }
        AnonymousClass4TK r1 = new AnonymousClass4TK(set, r3.A00.A01);
        r3.A00 = r1;
        r3.A05.A0E(r1);
    }
}
