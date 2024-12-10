package X;

/* renamed from: X.AgN  reason: case insensitive filesystem */
public final class C21214AgN implements C22470B9c {
    public static final C21214AgN A00 = new C21214AgN();

    public final Object BCF(C29621ca r5, C62672rm r6) {
        char A17 = C18070vi.A17(r5, r6);
        if (!r6.A09(r5, "picture")) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[4];
        b9cArr[0] = C21207AgG.A00;
        b9cArr[A17] = C21208AgH.A00;
        b9cArr[2] = C21209AgI.A00;
        return new AnonymousClass9E6(r5, (C178279Cm) r6.A06(r5, "PictureDidNotChange|PictureNotFound|BadServerProfilePictureError|BadLinkedGroupProfilePictureError", C18070vi.A0O(C21210AgJ.A00, b9cArr, 3), new String[0]));
    }
}
