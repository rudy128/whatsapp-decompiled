package X;

public final class A0Z {
    public static final A0Z A00 = new A0Z();

    public A0Z() {
        if (!C181859Sc.A00("")) {
            C181859Sc.A00("");
        }
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        C17890vO.A10("suffix = \"", "", "\",", sb);
        sb.append(10);
        sb.append(str);
        C108975cc.A15(sb, "removeLeadingZeros = ");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NumberHexFormat(");
        A10.append(10);
        A00(A10, "    ");
        A10.append(10);
        String A0q = AnonymousClass8BU.A0q(A10);
        C18070vi.A0X(A0q);
        return A0q;
    }
}
