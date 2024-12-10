package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Cih  reason: case insensitive filesystem */
public final class C25602Cih {
    public C24461C5b A00;
    public C36 A01;
    public ProductFeatureConfig A02;
    public CN0 A03;
    public NetworkPolicyConfiguration A04;
    public Map A05;
    public final HashMap A06;

    public C25602Cih(CXC cxc) {
        HashMap A11 = C17880vN.A11();
        this.A06 = A11;
        this.A05 = C17880vN.A11();
        A11.putAll(cxc.A06);
        this.A00 = cxc.A01;
        this.A05 = cxc.A00;
        this.A01 = cxc.A02;
        this.A02 = cxc.A03;
        this.A03 = cxc.A04;
        this.A04 = cxc.A05;
    }

    public C25602Cih() {
        this.A06 = C17880vN.A11();
        this.A05 = C17880vN.A11();
    }
}
