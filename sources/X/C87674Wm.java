package X;

import com.whatsapp.infra.graphql.generated.username.UsernamePinSetResponseImpl;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.4Wm  reason: invalid class name and case insensitive filesystem */
public final class C87674Wm {
    public final AnonymousClass1PY A00;
    public final C108425bg A01;
    public final AnonymousClass4bI A02;

    public static final Object A00(C87674Wm r6, String str, C30391dr r8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r4 = new C31781g7(1, C30581eB.A02(r8));
        r4.A0F();
        A7K a7k = new A7K();
        a7k.A07("pin", str);
        r6.A00.A01(new AIj(a7k, UsernamePinSetResponseImpl.class, "UsernamePinSet")).A04(new C99214sS(r6, str, r4, 1));
        return r4.A0C();
    }

    public C87674Wm(AnonymousClass1PY r1, C108425bg r2, AnonymousClass4bI r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
