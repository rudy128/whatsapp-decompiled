package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

public class CXC {
    public Map A00;
    public final C24461C5b A01;
    public final C36 A02;
    public final ProductFeatureConfig A03;
    public final CN0 A04;
    public final NetworkPolicyConfiguration A05;
    public final HashMap A06;

    public C24472C5m A00(C25480Cgb cgb) {
        C24472C5m c5m = (C24472C5m) this.A06.get(cgb);
        if (c5m != null) {
            return c5m;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Invalid configuration key: ");
        A10.append(cgb);
        throw AnonymousClass001.A12(" Please use hasConfiguration() to check if the configuration is available.", A10);
    }

    public CXC(C25602Cih cih) {
        HashMap A11 = C17880vN.A11();
        this.A06 = A11;
        A11.putAll(cih.A06);
        this.A01 = cih.A00;
        this.A00 = cih.A05;
        this.A02 = cih.A01;
        this.A03 = cih.A02;
        this.A04 = cih.A03;
        this.A05 = cih.A04;
    }
}
