package X;

/* renamed from: X.A0j  reason: case insensitive filesystem */
public final class C19952A0j {
    public static final C19952A0j A02 = new C19952A0j();
    public final boolean A00;
    public final boolean A01 = AnonymousClass000.A1P("".length());

    public C19952A0j() {
        boolean z = false;
        this.A00 = (C181859Sc.A00("  ") || C181859Sc.A00("") || C181859Sc.A00("") || C181859Sc.A00("")) ? true : z;
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append(10);
        sb.append(str);
        AnonymousClass000.A1E("bytesPerGroup = ", ",", sb, Integer.MAX_VALUE);
        sb.append(10);
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        C17890vO.A10("bytePrefix = \"", "", "\",", sb);
        sb.append(10);
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BytesHexFormat(");
        A10.append(10);
        A00(A10, "    ");
        A10.append(10);
        String A0q = AnonymousClass8BU.A0q(A10);
        C18070vi.A0X(A0q);
        return A0q;
    }
}
