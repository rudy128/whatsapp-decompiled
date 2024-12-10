package X;

import com.google.firebase.components.Qualified$Unqualified;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Set;

/* renamed from: X.2wc  reason: invalid class name and case insensitive filesystem */
public class C65512wc implements C18360wH {
    public final int A00;

    public C65512wc(int i) {
        this.A00 = i;
    }

    public final Object BGj(C18400wL r5) {
        C18320wC r0;
        switch (this.A00) {
            case 0:
                r0 = ExecutorsRegistrar.A00;
                break;
            case 1:
                r0 = ExecutorsRegistrar.A01;
                break;
            case 2:
                r0 = ExecutorsRegistrar.A02;
                break;
            case 3:
                return C18310w8.A02;
            case 4:
                return TransportRegistrar.lambda$getComponents$0(r5);
            case 5:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(r5);
            case 6:
                return r5.BMD(C18650wv.class);
            default:
                Set CJd = r5.CJd(new C18350wG(Qualified$Unqualified.class, C18530wc.class));
                C19700yp r2 = C19700yp.A01;
                if (r2 == null) {
                    synchronized (C19700yp.class) {
                        r2 = C19700yp.A01;
                        if (r2 == null) {
                            r2 = new C19700yp();
                            C19700yp.A01 = r2;
                        }
                    }
                }
                return new C18660ww(r2, CJd);
        }
        return r0.get();
    }
}
