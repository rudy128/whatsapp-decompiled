package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.1GG  reason: invalid class name */
public abstract class AnonymousClass1GG {
    public static final AnonymousClass1GH A00 = new C65092vp(0);
    public static final AnonymousClass1GH A01 = new C65092vp(1);
    public static final AnonymousClass1GH A02 = new C65092vp(2);

    public static final C37361pP A00(C24091Iv r7) {
        AnonymousClass1GJ r3;
        C18070vi.A0d(r7, 0);
        AnonymousClass1FE r1 = (AnonymousClass1FE) r7.A00(A01);
        if (r1 != null) {
            AnonymousClass1FD r6 = (AnonymousClass1FD) r7.A00(A02);
            if (r6 != null) {
                Bundle bundle = (Bundle) r7.A00(A00);
                String str = (String) r7.A00(C24121Iy.A01);
                if (str != null) {
                    AnonymousClass1GI A012 = r1.BYX().A01();
                    if (!(A012 instanceof AnonymousClass1GJ) || (r3 = (AnonymousClass1GJ) A012) == null) {
                        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    }
                    Map map = ((C29571cV) new C24071It(new C65052vl(1), r6).A01(C29571cV.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).A00;
                    C37361pP r0 = (C37361pP) map.get(str);
                    if (r0 != null) {
                        return r0;
                    }
                    C37361pP A002 = C37371pQ.A00(r3.A00(str), bundle);
                    map.put(str, A002);
                    return A002;
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void A01(AnonymousClass1FE r4) {
        C23401Fx r1 = ((C23391Fw) r4.getLifecycle()).A02;
        if (r1 != C23401Fx.INITIALIZED && r1 != C23401Fx.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (r4.BYX().A01() == null) {
            AnonymousClass1GJ r2 = new AnonymousClass1GJ((AnonymousClass1FD) r4, r4.BYX());
            r4.BYX().A03(r2, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            r4.getLifecycle().A05(new AnonymousClass1GL(r2));
        }
    }
}
