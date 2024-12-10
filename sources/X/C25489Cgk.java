package X;

/* renamed from: X.Cgk  reason: case insensitive filesystem */
public class C25489Cgk {
    public final CYQ A00;

    public C25489Cgk(String str, E6J[] e6jArr) {
        this.A00 = C26182Cu5.A01(str, e6jArr);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Du6, X.CtO] */
    public static C25654Cjk A00(String str) {
        C25670Ck0 A002 = C25670Ck0.A00();
        if (str == null || str.length() == 0) {
            throw AnonymousClass000.A0k("json string can not be null or empty");
        }
        try {
            return new C25654Cjk(A002, new C26156CtO(-1).A0D(str, ((DOV) A002.A00).A00));
        } catch (C2P e) {
            throw new C23740Bol(e);
        }
    }
}
