package X;

import java.util.List;

public final class DSF implements Comparable {
    public static final DSF A01;
    public static final DSF A02;
    public static final DSF A03;
    public static final DSF A04;
    public static final DSF A05;
    public static final DSF A06;
    public static final DSF A07;
    public static final DSF A08;
    public static final DSF A09;
    public static final DSF A0A;
    public static final DSF A0B;
    public static final DSF A0C;
    public static final DSF A0D;
    public static final DSF A0E;
    public static final DSF A0F;
    public static final DSF A0G;
    public static final DSF A0H;
    public static final DSF A0I;
    public static final List A0J;
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DSF) && this.A00 == ((DSF) obj).A00);
    }

    static {
        DSF dsf = new DSF(100);
        A0B = dsf;
        DSF dsf2 = new DSF(200);
        A0C = dsf2;
        DSF dsf3 = new DSF(300);
        A0D = dsf3;
        DSF dsf4 = new DSF(400);
        A0E = dsf4;
        DSF dsf5 = new DSF(500);
        A0F = dsf5;
        DSF dsf6 = new DSF(600);
        A04 = dsf6;
        DSF dsf7 = new DSF(700);
        A0G = dsf7;
        DSF dsf8 = new DSF(800);
        A0H = dsf8;
        DSF dsf9 = new DSF(900);
        A0I = dsf9;
        A0A = dsf;
        A07 = dsf2;
        A08 = dsf3;
        A03 = dsf4;
        A02 = dsf5;
        A09 = dsf6;
        A01 = dsf7;
        A06 = dsf8;
        A05 = dsf9;
        DSF[] dsfArr = new DSF[9];
        C17900vP.A0O(dsf, dsf2, dsf3, dsf4, dsfArr);
        C17900vP.A0P(dsf5, dsf6, dsf7, dsf8, dsfArr);
        A0J = C18070vi.A0O(dsf9, dsfArr, 8);
    }

    public final int A00() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C18070vi.A00(this.A00, ((DSF) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public DSF(int i) {
        this.A00 = i;
        if (1 > i || i >= 1001) {
            throw AnonymousClass001.A13("Font weight can be in range [1, 1000]. Current value: ", AnonymousClass000.A10(), i);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FontWeight(weight=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
