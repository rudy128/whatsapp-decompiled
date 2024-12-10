package X;

import java.io.File;

/* renamed from: X.9y0  reason: invalid class name and case insensitive filesystem */
public final class C198229y0 {
    public static final String A03;
    public final C002100z A00 = new C002100z(50);
    public final AnonymousClass118 A01;
    public final AnonymousClass10I A02;

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("downloadable");
        String str = File.separator;
        A10.append(str);
        A10.append("bloks_pay");
        A10.append(str);
        A03 = AnonymousClass000.A0y("image", A10);
    }

    public C198229y0(AnonymousClass118 r3, AnonymousClass10I r4) {
        C18070vi.A0j(r3, r4);
        this.A01 = r3;
        this.A02 = r4;
    }
}
