package X;

/* renamed from: X.A5k  reason: case insensitive filesystem */
public abstract class C20061A5k {
    public static final Object A01(C1418477e r0) {
        if (r0 != null) {
            Object obj = r0.A00;
            C17960vV.A07(obj);
            return obj;
        }
        throw C17880vN.A0g();
    }

    public static final boolean A02(C1418477e r1) {
        if (r1 == null || r1.A00()) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C1418477e r1) {
        if (r1 == null || r1.A00 == null) {
            return true;
        }
        return false;
    }

    public static final C1418477e A00(Object obj, String str) {
        C144717Ik A0Z = AnonymousClass8BR.A0Z();
        if (obj != null) {
            Class<?> cls = obj.getClass();
            C18070vi.A0z(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.loggingpolicy.PrivacyItemValueUtils.wrap>");
            return AnonymousClass8BR.A0Y(A0Z, cls, obj, str);
        }
        throw C17880vN.A0g();
    }
}
