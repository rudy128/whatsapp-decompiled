package X;

import com.whatsapp.util.Log;

/* renamed from: X.2tr  reason: invalid class name and case insensitive filesystem */
public abstract class C63892tr {
    public static final int A00(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        AnonymousClass22C r0 = (AnonymousClass22C) C18070vi.A09(r1, AnonymousClass22C.class).A02;
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public static final AnonymousClass8BG A01(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        return (AnonymousClass8BG) C18070vi.A09(r1, AnonymousClass8BG.class).A02;
    }

    public static final AnonymousClass22A A02(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        return (AnonymousClass22A) AnonymousClass206.A01(r1, AnonymousClass22A.class);
    }

    public static final AnonymousClass22C A03(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        return (AnonymousClass22C) AnonymousClass206.A01(r1, AnonymousClass22C.class);
    }

    public static final void A06(AnonymousClass206 r1, AnonymousClass22C r2) {
        C18070vi.A0d(r1, 0);
        AnonymousClass206.A05(r1, r2, AnonymousClass22C.class);
    }

    public static final boolean A07(AnonymousClass8BG r3, AnonymousClass206 r4) {
        if (A01(r4) != null) {
            Log.e("FMessage/setMessageReactions re-assigning messageReactions");
            return false;
        }
        C18070vi.A0d(r4, 0);
        C18070vi.A09(r4, AnonymousClass8BG.class).A02(r3);
        return true;
    }

    public static final void A05(AnonymousClass206 r1, AnonymousClass22A r2) {
        AnonymousClass206.A05(r1, r2, AnonymousClass22A.class);
        if (r2 != null) {
            r1.A07 = r2.A01;
        }
    }

    public static final String A04(AnonymousClass11S r4, AnonymousClass206 r5) {
        C18070vi.A0h(r5, r4);
        AnonymousClass8BG A01 = A01(r5);
        if (A01 == null) {
            return null;
        }
        if (!r5.A0w()) {
            return A01.BXu(AnonymousClass11S.A01(r4), r5.A0x);
        }
        C691336a A00 = C50382Uf.A00(r5);
        if (A00 != null) {
            return A00.A05;
        }
        return null;
    }
}
