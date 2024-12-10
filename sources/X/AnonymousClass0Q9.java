package X;

/* renamed from: X.0Q9  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass0Q9 {
    public static final C05740Vn A00() {
        C05740Vn r1 = C05740Vn.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return r1;
    }

    public static final C05750Vo A05() {
        C05750Vo r1 = C05750Vo.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return r1;
    }

    public static final C05760Vp A06() {
        C05760Vp r1 = C05760Vp.A00;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return r1;
    }

    public static AnonymousClass08V A01(Object obj) {
        return new AnonymousClass08V(A06(), obj);
    }

    public static AnonymousClass08V A02(Object obj) {
        C05760Vp A06 = A06();
        C18100vl r0 = AnonymousClass0GU.A01;
        return new AnonymousClass08V(A06, obj);
    }

    public static AnonymousClass08V A03(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C05760Vp A06 = A06();
        C18100vl r0 = AnonymousClass0GU.A01;
        return new AnonymousClass08V(A06, valueOf);
    }

    public static AnonymousClass08V A04(boolean z) {
        return new AnonymousClass08V(A06(), Boolean.valueOf(z));
    }
}
