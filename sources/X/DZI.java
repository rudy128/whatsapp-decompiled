package X;

import java.security.Provider;
import java.security.Security;

public class DZI implements E3R {
    public static volatile Provider A01;
    public final Provider A00;

    public DZI() {
        Provider provider;
        synchronized (DZI.class) {
            provider = Security.getProvider("SC");
            if (!(provider instanceof AnonymousClass1Bl)) {
                if (A01 != null) {
                    provider = A01;
                } else {
                    A01 = new AnonymousClass1Bl();
                    provider = A01;
                }
            }
        }
        this.A00 = provider;
    }
}
