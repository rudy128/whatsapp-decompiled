package X;

/* renamed from: X.1e0  reason: invalid class name and case insensitive filesystem */
public abstract class C30471e0 {
    public static final C18560wh A00(C18560wh r2, C18560wh r3) {
        if (!((Boolean) r3.fold(false, C30491e2.A00)).booleanValue()) {
            return r2.plus(r3);
        }
        return A01(r2, r3, false);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.4rF] */
    public static final C18560wh A01(C18560wh r4, C18560wh r5, boolean z) {
        C30491e2 r1 = C30491e2.A00;
        boolean booleanValue = ((Boolean) r4.fold(false, r1)).booleanValue();
        boolean booleanValue2 = ((Boolean) r5.fold(false, r1)).booleanValue();
        if (booleanValue || booleanValue2) {
            ? obj = new Object();
            obj.element = r5;
            AnonymousClass1OR r2 = AnonymousClass1OR.A00;
            r4 = (C18560wh) r4.fold(r2, new AnonymousClass3J7(obj, z));
            if (booleanValue2) {
                obj.element = ((C18560wh) obj.element).fold(r2, AnonymousClass3J9.A00);
            }
            r5 = (C18560wh) obj.element;
        }
        return r4.plus(r5);
    }

    public static final C41641wp A03(Object obj, C30391dr r3, C18560wh r4) {
        C41641wp r1 = null;
        if ((r3 instanceof C30401ds) && r4.get(C41651wq.A00) != null) {
            C30401ds r32 = (C30401ds) r3;
            while (true) {
                if ((r32 instanceof C41591wi) || (r32 = r32.getCallerFrame()) == null) {
                    break;
                } else if (r32 instanceof C41641wp) {
                    C41641wp r33 = (C41641wp) r32;
                    r1 = r33;
                    if (r33 != null) {
                        r33.A14(obj, r4);
                    }
                }
            }
        }
        return r1;
    }

    public static final C18560wh A02(C18560wh r2, AnonymousClass1OX r3) {
        C18560wh A01 = A01(r3.getCoroutineContext(), r2, true);
        C18600wl r1 = C23871Hy.A00;
        if (A01 == r1 || A01.get(C18590wk.A00) != null) {
            return A01;
        }
        return A01.plus(r1);
    }
}
