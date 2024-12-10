package X;

/* renamed from: X.084  reason: invalid class name */
public final class AnonymousClass084 extends C07340am<AnonymousClass0OI<Object>, C16300s2<? extends Object>> implements C17350uW {
    public static final AnonymousClass084 A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0am, X.084] */
    static {
        C05180Qv r2 = C05180Qv.A04;
        C18070vi.A0z(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        A00 = new C07340am(r2, 0);
    }

    public /* bridge */ /* synthetic */ C07370ap A04() {
        return new AnonymousClass08B(this);
    }

    public AnonymousClass08B A06() {
        return new AnonymousClass08B(this);
    }

    public /* bridge */ /* synthetic */ C17340uV BDd() {
        return new AnonymousClass08B(this);
    }

    public /* bridge */ /* synthetic */ C17830vI BDe() {
        return new AnonymousClass08B(this);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C16300s2)) {
            return false;
        }
        return A07((C16300s2) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AnonymousClass0OI)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public AnonymousClass084(C05180Qv r1, int i) {
        super(r1, i);
    }

    public /* bridge */ boolean A07(C16300s2 r2) {
        return super.containsValue(r2);
    }

    public Object BMA(AnonymousClass0OI r2) {
        return C04450Nl.A01(r2, this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.0am, X.084] */
    public AnonymousClass084 CD5(AnonymousClass0OI r4, C16300s2 r5) {
        AnonymousClass0HQ A0P = A05().A0P(r4, r5, r4.hashCode(), 0);
        if (A0P == null) {
            return this;
        }
        return new C07340am(A0P.A00, size() + A0P.A01);
    }
}
