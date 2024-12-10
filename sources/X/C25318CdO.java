package X;

import android.util.Size;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CdO  reason: case insensitive filesystem */
public abstract class C25318CdO {
    static {
        new C26132Csv(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT);
        new C26132Csv(1920, 1080);
    }

    public static List A00(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList A0z = C17880vN.A0z(length);
        int i = 0;
        do {
            A0z.add(new C26132Csv(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            i++;
        } while (i < length);
        return Collections.unmodifiableList(A0z);
    }
}
