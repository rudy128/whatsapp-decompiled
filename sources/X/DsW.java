package X;

import java.util.Arrays;

public final class DsW extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsW(C26256Cw0 cw0) {
        super(2);
        this.this$0 = cw0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        C25527ChP chP = (C25527ChP) obj2;
        C18070vi.A0d(chP, 1);
        C26294Cx6.A06("LinkManagerImpl", "Received from service");
        try {
            obj3 = new C27807Dlj(this.this$0, chP).invoke();
        } catch (Throwable th) {
            obj3 = C108945cZ.A1J(th);
        }
        Throwable A00 = C30671eK.A00(obj3);
        if (A00 != null) {
            C26294Cx6.A0D("LinkManagerImpl", "Error occurred", A00, Arrays.copyOf(new Object[0], 0));
        }
        return C27621Wu.A00;
    }
}
