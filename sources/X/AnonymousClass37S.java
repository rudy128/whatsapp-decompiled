package X;

/* renamed from: X.37S  reason: invalid class name */
public final class AnonymousClass37S implements AnonymousClass3M6 {
    public /* synthetic */ B5K CBD(C194979sb r2, C29621ca r3) {
        return null;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public void CB9(C63362sw r5, C29621ca r6) {
        int A15 = C18070vi.A15(r6, r5);
        String A02 = C29621ca.A02(r6, "edit");
        if (!(A02 == null || A02.length() == 0)) {
            C17960vV.A07(A02);
            A15 = Integer.parseInt(A02);
            if (!(A15 == 8 || A15 == 7 || A15 == 3 || A15 == 2 || A15 == 1)) {
                throw AnonymousClass1UI.A01(AnonymousClass001.A1H("EditInfoMessageStanzaParser/parseAttributes unrecognizededit ", A02, AnonymousClass000.A10()));
            }
        }
        r5.A01 = A15;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
