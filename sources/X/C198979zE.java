package X;

import android.view.View;

/* renamed from: X.9zE  reason: invalid class name and case insensitive filesystem */
public final class C198979zE {
    public final AnonymousClass1FU A00;

    public final C010105w A01(C18090vk r5) {
        C73203Rj A002 = AnonymousClass4a6.A00(this.A00);
        A002.A0E(2131893547);
        A002.A0D(2131893548);
        A002.A0T(false);
        A002.A0Z(new AnonymousClass4bB(r5, 43), 2131899286);
        return AnonymousClass3MY.A0L(A002);
    }

    public static final void A00(C198979zE r4, C18090vk r5, int i) {
        AnonymousClass1FU r2 = r4.A00;
        if (!AnonymousClass4Yv.A02(r2)) {
            View A08 = AnonymousClass3MX.A08(r2, 2131626311);
            C17880vN.A0E(A08, 2131433461).setText(i);
            C73203Rj A002 = AnonymousClass4a6.A00(r2);
            A002.A0c(A08);
            C010105w A0L = AnonymousClass3MY.A0L(A002);
            A0L.show();
            r2.A05.A0K(new AnonymousClass3C5(r4, A0L, r5, 33), 1000);
        }
    }

    public C198979zE(AnonymousClass1FU r1) {
        this.A00 = r1;
    }
}
