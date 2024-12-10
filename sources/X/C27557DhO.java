package X;

import android.os.Handler;
import java.util.UUID;

/* renamed from: X.DhO  reason: case insensitive filesystem */
public final class C27557DhO extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26127Csp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27557DhO(C26127Csp csp) {
        super(0);
        this.this$0 = csp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UUID randomUUID;
        C24374C0r c0r;
        boolean A1Z = AnonymousClass8BV.A1Z(this.this$0.A0E);
        C26193CuL cuL = this.this$0.A02;
        if (A1Z) {
            if (cuL != null) {
                randomUUID = UUID.randomUUID();
                C18070vi.A0X(randomUUID);
                c0r = C24374C0r.MAIN;
            }
            return C27621Wu.A00;
        }
        if (cuL != null) {
            randomUUID = UUID.randomUUID();
            C18070vi.A0X(randomUUID);
            c0r = C24374C0r.READY;
        }
        return C27621Wu.A00;
        if (cuL.A0D.get()) {
            cuL.A0G.invoke(new BWK("Unable to set link, link setup has been detached"));
        } else {
            Handler handler = cuL.A03;
            if (handler != null) {
                handler.postDelayed(cuL.A0C, 10000);
            }
            cuL.A05.A08(new C28078Dqs(cuL, c0r, randomUUID));
        }
        return C27621Wu.A00;
    }
}
