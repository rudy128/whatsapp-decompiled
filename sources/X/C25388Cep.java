package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Map;

/* renamed from: X.Cep  reason: case insensitive filesystem */
public abstract class C25388Cep {
    public static final Map A00 = C17880vN.A11();

    public static CameraCharacteristics A00(CameraManager cameraManager, String str) {
        Map map = A00;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) map.get(str);
        if (cameraCharacteristics != null) {
            return cameraCharacteristics;
        }
        try {
            C28111Yx.A02(cameraManager);
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            map.put(str, cameraCharacteristics2);
            return cameraCharacteristics2;
        } catch (CameraAccessException e) {
            throw new C27223Da2(AnonymousClass001.A1H("Could not get Camera Characteristics for Camera ID: ", str, AnonymousClass000.A10()), e);
        }
    }
}
