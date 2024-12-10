package X;

/* renamed from: X.3JQ  reason: invalid class name */
public final class AnonymousClass3JQ extends C25701Ph implements AnonymousClass1G1 {
    public /* bridge */ /* synthetic */ Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(AnonymousClass000.A0M(A00(this)));
        }
        return valueOf;
    }

    public static Object A00(C25701Ph r7) {
        Object[] objArr = r7.A04;
        C18070vi.A0b(objArr);
        long j = r7.A03;
        return objArr[(objArr.length - 1) & ((int) ((j + ((long) ((int) ((Math.min(r7.A02, j) + ((long) r7.A00)) - j)))) - 1))];
    }
}
