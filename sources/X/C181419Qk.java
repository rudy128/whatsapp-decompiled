package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;

/* renamed from: X.9Qk  reason: invalid class name and case insensitive filesystem */
public abstract class C181419Qk {
    public static final String A00(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.e("findmissingpermissions/no-package-manager");
        } else {
            try {
                obj = packageManager.getPackageInfo("com.whatsapp", ZipDecompressor.UNZIP_BUFFER_SIZE);
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Throwable A00 = C30671eK.A00(obj);
            if (A00 == null) {
                C18070vi.A0a(obj);
                PackageInfo packageInfo = (PackageInfo) obj;
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    if (iArr != null) {
                        int length = iArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if ((iArr[i] & 2) == 0) {
                                if (A10.length() > 0) {
                                    A10.append(", ");
                                }
                                A10.append(strArr[i2]);
                            }
                            i++;
                            i2 = i3;
                        }
                    }
                    return C18070vi.A0H(A10);
                }
            } else {
                Log.e(A00);
                return "";
            }
        }
        return "";
    }
}
