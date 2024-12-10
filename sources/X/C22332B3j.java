package X;

/* renamed from: X.B3j  reason: case insensitive filesystem */
public final class C22332B3j extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C22332B3j A00 = new C22332B3j();

    public C22332B3j() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass9DO r8 = (AnonymousClass9DO) obj;
        AnonymousClass9DO r9 = (AnonymousClass9DO) obj2;
        boolean A17 = C18070vi.A17(r8, r9);
        long j = ((C178409Cz) r8.A01).A01;
        long j2 = ((C178409Cz) r9.A01).A01;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return Integer.valueOf(A17 ? 1 : 0);
        }
        return 0;
    }
}
