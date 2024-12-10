package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2sb  reason: invalid class name and case insensitive filesystem */
public final class C63152sb {
    public final AnonymousClass00H A00;

    public C63152sb(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final Integer A01(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 8;
                break;
            case 2:
            case 6:
                i2 = 6;
                break;
            case 3:
                i2 = 7;
                break;
            case 4:
                i2 = 5;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public static final int A00(AnonymousClass1BI r1) {
        if (C22971Dz.A0e(r1)) {
            return 1;
        }
        if (C22971Dz.A0a(r1)) {
            return 4;
        }
        if (C22971Dz.A0N(r1)) {
            return 2;
        }
        if (C22971Dz.A0V(r1)) {
            return 5;
        }
        return 3;
    }

    public final int A02(AnonymousClass1BI r3) {
        int A002 = A00(r3);
        if (A002 != 1) {
            return A002;
        }
        C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
        Integer A01 = A01(((AnonymousClass1CJ) this.A00.get()).A06((GroupJid) r3));
        if (A01 != null) {
            return A01.intValue();
        }
        return A002;
    }
}
