package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import java.util.Map;

/* renamed from: X.9zQ  reason: invalid class name and case insensitive filesystem */
public class C199099zQ {
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();

    public static ModelPathsHolder A00(C199099zQ r0, Object obj) {
        return (ModelPathsHolder) r0.A00.get(obj);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ARModelPaths{mModelPathsByCapabilityMap=");
        A10.append(this.A00);
        A10.append("}\nSparkVisionModelPaths{mSparkVisionModelPathsByName=");
        return AnonymousClass8BX.A0c(this.A01, A10);
    }
}
