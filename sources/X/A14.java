package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.util.Log;

public final class A14 {
    public final AnonymousClass118 A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C187009f7 A03;

    public final void A01(BroadcastReceiver broadcastReceiver, Bundle bundle, String str) {
        String str2 = str;
        if (A00()) {
            Intent A0A = C17880vN.A0A();
            A0A.setPackage("com.facebook.katana");
            A0A.setAction(str);
            Context context = this.A00.A00;
            C181759Rs.A00(context, A0A);
            context.sendOrderedBroadcast(A0A, (String) null, broadcastReceiver, (Handler) null, 1, (String) null, bundle);
        }
        C187009f7 r4 = this.A03;
        Context A0E = C108945cZ.A0E(this.A00);
        C19830z4 r7 = this.A02;
        Integer num = AnonymousClass00R.A00;
        AnonymousClass10I r0 = r4.A02;
        r0.CGF(new C21462AkT(r4, A0E, num, r7, str2, 12));
        r0.CGF(new C21462AkT(r4, A0E, AnonymousClass00R.A01, r7, str2, 12));
    }

    private final boolean A00() {
        String str;
        StringBuilder sb;
        String str2;
        Log.i("FoaBackupTokenInterAppCommunicationManager/isEligibleForFb");
        Context context = this.A00.A00;
        if (C24211Jh.A00(context, "com.facebook.katana") == -1) {
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/fb app not installed";
        } else {
            PackageManager packageManager = context.getPackageManager();
            C18070vi.A0X(packageManager);
            try {
                int i = 64;
                if (AnonymousClass112.A05()) {
                    i = 134217728;
                }
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", i);
                if (packageInfo != null) {
                    if (!AnonymousClass8BR.A12(C18070vi.A0M("ijxLJi1yGs1JpL-X1SExmchvork")).contains(C20070A5v.A01(packageInfo))) {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/fb app is not trusted";
                    } else if (C24211Jh.A00(context, "com.facebook.katana") >= 446613853) {
                        return true;
                    } else {
                        str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/fb app version is old";
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                sb = AnonymousClass000.A10();
                str2 = "FoaBackupTokenInterAppCommunicationManager/could not find package; packageName=";
                C17900vP.A0h(str2, "com.facebook.katana", sb, e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/package info is null";
                Log.i(str);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                sb = AnonymousClass000.A10();
                str2 = "FoaBackupTokenInterAppCommunicationManager/failed to get package info for packageName=";
                C17900vP.A0h(str2, "com.facebook.katana", sb, e);
                str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/package info is null";
                Log.i(str);
                return false;
            }
            str = "FoaBackupTokenInterAppCommunicationManager/isEligibleForFb/package info is null";
        }
        Log.i(str);
        return false;
    }

    public A14(AnonymousClass11P r1, AnonymousClass118 r2, C19830z4 r3, C187009f7 r4) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final boolean A02() {
        if (!A00()) {
            boolean A1O = AnonymousClass000.A1O((C24211Jh.A00(this.A00.A00, "com.instagram.android") > -1 ? 1 : (C24211Jh.A00(this.A00.A00, "com.instagram.android") == -1 ? 0 : -1)));
            C17900vP.A0n("FoaBackupTokenInterAppCommunicationManager/isEligibleForIg/is ig installed: ", AnonymousClass000.A10(), A1O);
            if (A1O) {
                return true;
            }
            return false;
        }
        return true;
    }
}
