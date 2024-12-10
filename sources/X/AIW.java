package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;

public class AIW implements C22532BBp {
    public final C162448Kt A00;

    public boolean BB0(A6K a6k, VersionedCapability versionedCapability) {
        return this.A00.A00(a6k, versionedCapability);
    }

    public boolean Bho(C199099zQ r3, VersionedCapability versionedCapability) {
        ModelPathsHolder modelPathsHolderForLastSavedVersion;
        C162448Kt r1 = this.A00;
        if (r1.A05 == null || (modelPathsHolderForLastSavedVersion = r1.A05.getModelPathsHolderForLastSavedVersion(versionedCapability)) == null) {
            return false;
        }
        r3.A00.put(versionedCapability, modelPathsHolderForLastSavedVersion);
        return true;
    }

    public boolean Bhq(C199099zQ r4, VersionedCapability versionedCapability, int i) {
        C162448Kt r1 = this.A00;
        if (r1.A05 == null) {
            return false;
        }
        try {
            ModelPathsHolder modelPathsHolder = r1.A05.getModelPathsHolder(versionedCapability, i);
            if (modelPathsHolder == null) {
                return false;
            }
            r4.A00.put(versionedCapability, modelPathsHolder);
            return true;
        } catch (EffectsFrameworkException e) {
            C26294Cx6.A0C("ModelCacheAssetStorage", "Failed call to ModelCache.getModelPathsHolder", e);
            return false;
        }
    }

    public AIW(C162448Kt r1) {
        this.A00 = r1;
    }
}
