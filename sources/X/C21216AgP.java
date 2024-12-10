package X;

/* renamed from: X.AgP  reason: case insensitive filesystem */
public final class C21216AgP implements C22470B9c {
    public static final C21216AgP A00 = new C21216AgP();

    public final Object BCF(C29621ca r10, C62672rm r11) {
        C29621ca r3 = r10;
        C62672rm r2 = r11;
        boolean A17 = C18070vi.A17(r10, r11);
        if (!r11.A09(r10, "picture")) {
            return null;
        }
        Class<byte[]> cls = byte[].class;
        byte[] bArr = (byte[]) r2.A04(r3, cls, C108975cc.A0X(), AnonymousClass8BU.A0j(), (Object) null, AnonymousClass8BS.A1V(A17 ? 1 : 0));
        if (bArr != null) {
            return new AnonymousClass9ED(r10, bArr);
        }
        return null;
    }
}
