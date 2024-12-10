package X;

/* renamed from: X.AmV  reason: case insensitive filesystem */
public final class C21581AmV extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21581AmV(String str) {
        super(str);
        C18070vi.A0d(str, 1);
    }

    public static C21581AmV A00(String str, StringBuilder sb) {
        sb.append(str);
        return new C21581AmV(sb.toString());
    }
}
