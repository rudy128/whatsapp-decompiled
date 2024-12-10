package X;

import android.os.Handler;

public abstract class C8P {
    public static final Handler A00(C28592E9h e9h) {
        String str;
        Handler handler = (Handler) e9h.BPA(EBD.A0G);
        if (handler != null) {
            return handler;
        }
        EDI edi = (EDI) e9h.BP8(EDI.A00);
        Object BPA = e9h.BPA(EBD.A0I);
        Boolean A0i = AnonymousClass000.A0i();
        if (C18070vi.A18(BPA, A0i)) {
            str = "Lite-Urgent-SurfacePipe-Thread";
            C22889BUa.A00().A00(str, -8);
        } else {
            str = "Lite-SurfacePipe-Thread";
        }
        if (C18070vi.A18(e9h.BPA(EBD.A0K), A0i)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("OC-");
            str = C17880vN.A0t(A10, e9h.hashCode());
            C22889BUa.A00().A00(str, 0);
        }
        Handler BSH = edi.BSH(str);
        C18070vi.A0X(BSH);
        return BSH;
    }
}
