package X;

import android.graphics.Bitmap;
import android.os.RemoteException;

public abstract class CFF {
    public static C28634EBo A00;

    public static CLL A00(Bitmap bitmap) {
        C18210vx.A02(bitmap, "image must not be null");
        try {
            C28634EBo eBo = A00;
            C18210vx.A02(eBo, "IBitmapDescriptorFactory is not initialized");
            C26399Cyz cyz = (C26399Cyz) eBo;
            return new CLL(C23331BfJ.A02(C26399Cyz.A01(bitmap, cyz), cyz, 6));
        } catch (RemoteException e) {
            throw C27226Da5.A00(e);
        }
    }
}
