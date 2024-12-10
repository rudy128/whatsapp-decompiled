package X;

import android.os.Handler;
import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.7It  reason: invalid class name and case insensitive filesystem */
public final class C144807It implements BC9 {
    public final AnonymousClass1TJ A00 = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A01 = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A02 = new AnonymousClass1TJ();
    public final Executor A03;
    public final Handler A04 = C17890vO.A0D();

    public void BsA(long j) {
        this.A00.A04(Long.valueOf(j));
    }

    public void BsC(boolean z) {
        this.A01.A04(Boolean.valueOf(z));
    }

    public C144807It(Executor executor) {
        this.A03 = executor;
    }

    public static final void A00(C144807It r2, C18090vk r3) {
        if (C22781De.A03()) {
            r3.invoke();
        } else {
            r2.A04.post(new AnonymousClass7RA((Object) r3, 37));
        }
    }

    public void BsD(C1409173o r3, C136996uk r4) {
        C18070vi.A0h(r3, r4);
        this.A02.A04(Pair.create(r3, r4));
    }
}
