package X;

/* renamed from: X.0gb  reason: invalid class name and case insensitive filesystem */
public final class C09370gb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C17330uU $magnifierSize$delegate;
    public final /* synthetic */ C05120Qm $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09370gb(C05120Qm r2, C17330uU r3) {
        super(0);
        this.$manager = r2;
        this.$magnifierSize$delegate = r3;
    }

    public static final long A00(C05120Qm r10, long j) {
        AnonymousClass0CM r1;
        int ordinal;
        long A01;
        AnonymousClass0NM A02;
        C04940Pp r0;
        C27069DRu A04;
        AnonymousClass0QY r02 = (AnonymousClass0QY) r10.A0G.getValue();
        if (r02 != null) {
            long j2 = r02.A00;
            C27069DRu A0C = r10.A0C();
            if (!(A0C == null || A0C.length() == 0 || (r1 = (AnonymousClass0CM) r10.A0H.getValue()) == null || (ordinal = r1.ordinal()) == -1)) {
                if (ordinal == 0 || ordinal == 1) {
                    A01 = r10.A0E().A01() >> 32;
                } else if (ordinal == 2) {
                    A01 = r10.A0E().A01() & 4294967295L;
                } else {
                    throw new AnonymousClass3EW();
                }
                int i = (int) A01;
                C04940Pp r03 = r10.A03;
                if (!(r03 == null || (A02 = C04940Pp.A02(r03)) == null || (r0 = r10.A03) == null || (A04 = r0.A00.A04()) == null)) {
                    int A03 = C28851b7.A03(r10.A0D().CB1(i), 0, A04.length());
                    float A012 = AnonymousClass0QY.A01(A02.A02(j2));
                    C26227CvJ A032 = A02.A03();
                    int A0E = A032.A0E(A03);
                    float A07 = A032.A07(A0E);
                    float A08 = A032.A08(A0E);
                    float A022 = C28851b7.A02(A012, Math.min(A07, A08), Math.max(A07, A08));
                    if (Math.abs(A012 - A022) <= ((float) (AnonymousClass000.A0G(j) / 2))) {
                        float A09 = A032.A09(A0E);
                        return AnonymousClass001.A0p(A022, ((A032.A06(A0E) - A09) / 2.0f) + A09);
                    }
                }
            }
        }
        return AnonymousClass0QY.A02;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return AnonymousClass000.A0e(A00(this.$manager, C15240qJ.A00(this.$magnifierSize$delegate)));
    }
}
