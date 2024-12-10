package X;

import java.io.File;

/* renamed from: X.9g6  reason: invalid class name and case insensitive filesystem */
public final class C187619g6 {
    public AnonymousClass4VT A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1D9 A04;
    public final AnonymousClass10I A05;

    public C187619g6(AnonymousClass1KB r9, AnonymousClass181 r10, AnonymousClass118 r11, AnonymousClass1D9 r12, AnonymousClass10I r13) {
        C18070vi.A0w(r11, r9, r13, r10, r12);
        this.A03 = r11;
        this.A01 = r9;
        this.A05 = r13;
        this.A02 = r10;
        this.A04 = r12;
        File A0e = C17880vN.A0e(C108945cZ.A16(r11), "bloks_images");
        C86284Ra r1 = new C86284Ra(this.A01, this.A02, this.A04, this.A05, A0e, "bloks-bridge-manager");
        r1.A00 = Integer.MAX_VALUE;
        r1.A05 = true;
        this.A00 = r1.A00();
    }
}
