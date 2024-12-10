package X;

import android.content.Context;

/* renamed from: X.A0o  reason: case insensitive filesystem */
public final class C19957A0o {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1PM A01;
    public final C24921Me A02;

    public static final void A00(Context context) {
        C18070vi.A0d(context, 0);
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0D(2131887004);
        A002.A0E(2131887005);
        A002.A0Z(new A9R(1), 2131893145);
        AnonymousClass3MY.A1G(A002);
    }

    public final void A02(Context context, String str) {
        C18070vi.A0d(context, 1);
        A01(context, (B7S) null, str);
    }

    public final void A01(Context context, B7S b7s, String str) {
        int i;
        int i2;
        if (C18070vi.A18(str, "PERMANENT")) {
            i = 2131887122;
        } else if (C18070vi.A18(str, "TEMPORARY")) {
            i = 2131887149;
        } else {
            return;
        }
        if (C18070vi.A18(str, "PERMANENT")) {
            i2 = 2131887121;
        } else if (C18070vi.A18(str, "TEMPORARY")) {
            i2 = 2131887148;
        } else {
            return;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0D(i2);
        A002.A0E(i);
        C20153A9p.A00(A002, b7s, this, 4, 2131899286);
        A9Q.A00(A002, b7s, 6);
        AnonymousClass3MY.A1G(A002);
    }

    public C19957A0o(AnonymousClass1M9 r1, AnonymousClass1PM r2, C24921Me r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
