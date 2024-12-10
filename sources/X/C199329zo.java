package X;

/* renamed from: X.9zo  reason: invalid class name and case insensitive filesystem */
public final class C199329zo {
    public static final C199329zo A03;
    public static final C199329zo A04;
    public final C19952A0j A00;
    public final A0Z A01;
    public final boolean A02;

    static {
        C19952A0j a0j = C19952A0j.A02;
        A0Z a0z = A0Z.A00;
        A03 = new C199329zo(a0j, a0z, false);
        A04 = new C199329zo(a0j, a0z, true);
    }

    public C199329zo(C19952A0j a0j, A0Z a0z, boolean z) {
        C18070vi.A0k(a0j, a0z);
        this.A02 = z;
        this.A00 = a0j;
        this.A01 = a0z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HexFormat(");
        A10.append(10);
        A10.append("    upperCase = ");
        A10.append(this.A02);
        A10.append(",");
        A10.append(10);
        A10.append("    bytes = BytesHexFormat(");
        A10.append(10);
        this.A00.A00(A10, "        ");
        A10.append(10);
        A10.append("    ),");
        A10.append(10);
        A10.append("    number = NumberHexFormat(");
        A10.append(10);
        this.A01.A00(A10, "        ");
        A10.append(10);
        A10.append("    )");
        A10.append(10);
        String A0q = AnonymousClass8BU.A0q(A10);
        C18070vi.A0X(A0q);
        return A0q;
    }
}
