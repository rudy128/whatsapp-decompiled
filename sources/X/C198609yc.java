package X;

/* renamed from: X.9yc  reason: invalid class name and case insensitive filesystem */
public class C198609yc {
    public final AnonymousClass1KB A00;
    public final AnonymousClass118 A01;
    public final C24751Ln A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1KI A06;

    public static final ARR A00(C198609yc r5, AnonymousClass9DD r6) {
        String str = r6.A04;
        String str2 = r6.A03;
        AnonymousClass1KJ A012 = r5.A06.A01(r6.A02);
        Long valueOf = Long.valueOf(str);
        C18070vi.A0X(valueOf);
        long longValue = valueOf.longValue();
        Integer valueOf2 = Integer.valueOf(str2);
        C18070vi.A0X(valueOf2);
        int intValue = valueOf2.intValue();
        if (intValue <= 0) {
            intValue = 1;
        }
        C17960vV.A07(A012);
        return C196669vR.A00(A012, intValue, longValue);
    }

    public C198609yc(AnonymousClass1KB r1, AnonymousClass118 r2, C24751Ln r3, AnonymousClass1KI r4, C18030ve r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r2, r1, r6, r3);
        C18070vi.A0l(r4, r7);
        this.A03 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r6;
        this.A02 = r3;
        this.A06 = r4;
        this.A05 = r7;
    }
}
