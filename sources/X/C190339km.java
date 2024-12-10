package X;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;

/* renamed from: X.9km  reason: invalid class name and case insensitive filesystem */
public class C190339km {
    public final PackageManager A00;
    public final C37001oo A01;

    public boolean A00(String str) {
        boolean z;
        try {
            z = this.A01.A01(str).A03;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        if (z) {
            PackageManager packageManager = this.A00;
            if (packageManager.checkPermission("com.apple.movetoios.ACCESS", str) == 0) {
                try {
                    PermissionInfo permissionInfo = packageManager.getPermissionInfo("com.apple.movetoios.ACCESS", 0);
                    if ((permissionInfo.protectionLevel & 15) == 2) {
                        return C20070A5v.A00(packageManager, permissionInfo.packageName).equals(C20070A5v.A00(packageManager, str));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    return false;
                }
            }
        }
        return false;
    }

    public C190339km(AnonymousClass118 r2, C37001oo r3) {
        this.A00 = r2.A00.getPackageManager();
        this.A01 = r3;
    }
}
