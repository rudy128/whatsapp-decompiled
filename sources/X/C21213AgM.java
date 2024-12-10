package X;

/* renamed from: X.AgM  reason: case insensitive filesystem */
public final class C21213AgM implements C22470B9c {
    public static final C21213AgM A00 = new C21213AgM();

    public final Object BCF(C29621ca r15, C62672rm r16) {
        C29621ca r7 = r15;
        C62672rm r6 = r16;
        boolean A17 = C18070vi.A17(r15, r6);
        if (!r6.A09(r15, "picture") || !r6.A09(r15, "picture")) {
            return null;
        }
        String str = (String) r6.A05(r7, String.class, C17890vO.A0L(), AnonymousClass8BV.A0e(), (Object) null, AnonymousClass8BS.A1W(A17 ? 1 : 0, 0), false);
        if (str == null) {
            return null;
        }
        AnonymousClass9CY r4 = new AnonymousClass9CY(r15, str);
        if (!r6.A09(r15, "picture")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "image";
        String A07 = r6.A07(r15, C18070vi.A0O("preview", strArr, A17), AnonymousClass8BS.A1a(A17, 0));
        if (A07 == null) {
            return null;
        }
        AnonymousClass9CY r3 = new AnonymousClass9CY(r15, A07);
        C22470B9c[] b9cArr = new C22470B9c[2];
        b9cArr[0] = C21215AgO.A00;
        return new AnonymousClass9E7(r15, r4, r3, (B6P) r6.A06(r15, "ProfilePictureUrlResponse|ProfilePictureBlobResponse", C18070vi.A0O(C21216AgP.A00, b9cArr, A17), new String[0]));
    }
}
