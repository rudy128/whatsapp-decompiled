package X;

/* renamed from: X.CwA  reason: case insensitive filesystem */
public abstract class C26265CwA {
    public static EAY A00 = DBE.A00;

    public static void A00(Class cls, Object obj, Object obj2, Object obj3, String str) {
        if (A00.BfN(2)) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass8BW.A1K(obj, obj2, obj3, A1a);
            String A0o = BE7.A0o(str, A1a);
            EAY eay = A00;
            if (eay.BfN(2)) {
                eay.CRf(cls.getSimpleName(), A0o);
            }
        }
    }

    public static void A01(Class cls, Object obj, Object obj2, String str) {
        EAY eay = A00;
        if (eay.BfN(2)) {
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[2];
            AnonymousClass001.A1Q(obj, obj2, objArr);
            eay.CRf(simpleName, BE7.A0o(str, objArr));
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        EAY eay = A00;
        if (eay.BfN(2)) {
            eay.CRf(cls.getSimpleName(), BE7.A0o(str, AnonymousClass8BV.A1b(obj)));
        }
    }

    public static void A03(Class cls, String str) {
        EAY eay = A00;
        if (eay.BfN(6)) {
            eay.BJn(cls.getSimpleName(), str);
        }
    }

    public static void A04(Class cls, String str, Throwable th) {
        EAY eay = A00;
        if (eay.BfN(5)) {
            eay.CRv(cls.getSimpleName(), str, th);
        }
    }

    public static void A05(String str, String str2, Throwable th) {
        EAY eay = A00;
        if (eay.BfN(6)) {
            eay.BJo(str, str2, th);
        }
    }

    public static void A06(String str, String str2, Object... objArr) {
        EAY eay = A00;
        if (eay.BfN(5)) {
            eay.CRu(str, BE7.A0o(str2, objArr));
        }
    }

    public static void A07(String str, Throwable th, Object... objArr) {
        Class<C25680CkB> cls = C25680CkB.class;
        if (A00.BfN(5)) {
            A04(cls, BE7.A0o(str, objArr), th);
        }
    }
}
