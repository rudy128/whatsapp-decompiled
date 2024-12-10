package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;

public class AIX implements C22532BBp {
    public final C162438Ks A00;

    public boolean Bho(C199099zQ r6, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        try {
            C20369AIa aIa = (C20369AIa) this.A00.A00(versionedCapability);
            if (aIa.A05 == null || (modelPathsHolderForLastSavedVersion = aIa.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null) {
                return false;
            }
            r6.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
            return true;
        } catch (IllegalArgumentException e) {
            C26294Cx6.A0E("SingleARModelLoader", "Failed to get model storage for capability: %s", e, versionedCapability.name());
            return false;
        }
    }

    public boolean Bhq(C199099zQ r7, VersionedCapability versionedCapability, int i) {
        try {
            C20369AIa aIa = (C20369AIa) this.A00.A00(versionedCapability);
            if (aIa.A05 != null) {
                try {
                    ModelPathsHolder modelPathsHolder = aIa.A05.getModelPathsHolder(versionedCapability, i);
                    if (modelPathsHolder != null) {
                        r7.A00.put(versionedCapability, modelPathsHolder);
                        return true;
                    }
                } catch (EffectsFrameworkException e) {
                    C26294Cx6.A0C("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            C26294Cx6.A0E("SingleARModelLoader", "Failed to get model storage for capability: %s", e2, versionedCapability.name());
            return false;
        }
    }

    public boolean BB0(A6K a6k, VersionedCapability versionedCapability) {
        try {
            return ((C20369AIa) this.A00.A00(versionedCapability)).A00(a6k, versionedCapability);
        } catch (IllegalArgumentException e) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = versionedCapability.name();
            C26294Cx6.A0E("SingleARModelLoader", "Failed to get model storage for capability %s", e, A1a);
            return false;
        }
    }

    public AIX(C162438Ks r1) {
        this.A00 = r1;
    }
}
