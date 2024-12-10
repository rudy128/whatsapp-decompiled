package X;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: X.AwP  reason: case insensitive filesystem */
public final class C22023AwP extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C188599hg $linkedDeviceManager;
    public final /* synthetic */ UUID $uuid;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22023AwP(Cw1 cw1, C188599hg r3, UUID uuid) {
        super(0);
        this.$uuid = uuid;
        this.$linkedDeviceManager = r3;
        this.this$0 = cw1;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Cleaning up linkedDeviceManager for uuid=");
        C26294Cx6.A06("lam:LinkedAppManager", C17890vO.A0V(this.$uuid, A10));
        C188599hg r3 = this.$linkedDeviceManager;
        ArrayDeque arrayDeque = r3.A06;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            try {
                ((C18090vk) it.next()).invoke();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
        }
        arrayDeque.clear();
        r3.A04.A00(C22291B1u.A00);
        this.this$0.A0F.remove(this.$uuid);
        return C27621Wu.A00;
    }
}
