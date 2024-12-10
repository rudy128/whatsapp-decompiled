package X;

/* renamed from: X.AgW  reason: case insensitive filesystem */
public final class C21223AgW implements C22470B9c {
    public static final C21223AgW A00 = new C21223AgW();

    public final Object BCF(C29621ca r8, C62672rm r9) {
        char A17 = C18070vi.A17(r8, r9);
        if (!r9.A09(r8, "participant")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "admin";
        if (r9.A07(r8, C18070vi.A0O("superadmin", strArr, A17), AnonymousClass8BS.A1a(A17, 0)) == null) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[4];
        b9cArr[0] = C21219AgS.A00;
        b9cArr[A17] = C21220AgT.A00;
        b9cArr[2] = C21221AgU.A00;
        Object A06 = r9.A06(r8, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJidAndPn|ParticipantWithJid", C18070vi.A0O(C21222AgV.A00, b9cArr, 3), new String[0]);
        if (A06 != null) {
            return new AnonymousClass9E3(r8, (B6L) A06);
        }
        return null;
    }
}
