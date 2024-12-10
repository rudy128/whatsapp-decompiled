package X;

import java.util.HashMap;

/* renamed from: X.4Wq  reason: invalid class name and case insensitive filesystem */
public final class C87704Wq {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final HashMap A02;
    public final AnonymousClass00H A03;

    public C87704Wq(C80663xk r7, C80653xj r8, C80673xl r9, C18030ve r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        int A0G = C72453Mb.A0G(r10, r11, 1);
        C18070vi.A0d(r12, 6);
        this.A00 = r10;
        this.A01 = r11;
        this.A03 = r12;
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[3];
        C72463Mc.A1H(1, r8, r1);
        AnonymousClass1D6.A03(3, r9, r1, 1);
        AnonymousClass1D6.A03(4, r7, r1, A0G);
        this.A02 = AnonymousClass1D7.A07(r1);
    }

    public static AnonymousClass4S3 A00(C87704Wq r1, int i) {
        return (AnonymousClass4S3) r1.A02.get(Integer.valueOf(i));
    }
}
