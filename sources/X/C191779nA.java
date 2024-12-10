package X;

/* renamed from: X.9nA  reason: invalid class name and case insensitive filesystem */
public class C191779nA {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C191779nA(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.A07 = str;
        this.A02 = str2;
        this.A06 = str4;
        this.A01 = str3;
        this.A04 = str5;
        this.A03 = str6;
        this.A00 = i;
        this.A08 = z;
        this.A05 = str7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectedRoute{authority='");
        A10.append(this.A02);
        A10.append("' authorityType='");
        A10.append(this.A00);
        A10.append("'");
        return C17890vO.A0b(A10);
    }
}
