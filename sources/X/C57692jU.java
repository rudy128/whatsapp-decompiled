package X;

import java.util.Arrays;

/* renamed from: X.2jU  reason: invalid class name and case insensitive filesystem */
public final class C57692jU {
    public final AnonymousClass1BI A00;
    public final AnonymousClass1BI A01;
    public final Long[] A02;
    public final String[] A03;

    public C57692jU(AnonymousClass1BI r2, AnonymousClass1BI r3, Long[] lArr, String[] strArr) {
        C18070vi.A0f(lArr, 3, strArr);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = lArr;
        this.A03 = strArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("toJid=");
        A10.append(this.A01);
        A10.append("; participant=");
        A10.append(this.A00);
        A10.append("; rowIds=");
        String arrays = Arrays.toString(this.A02);
        C18070vi.A0X(arrays);
        A10.append(arrays);
        A10.append("; ids=");
        String arrays2 = Arrays.toString(this.A03);
        C18070vi.A0X(arrays2);
        return AnonymousClass000.A0y(arrays2, A10);
    }
}
