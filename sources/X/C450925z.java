package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.whatsapp.phoneid.PhoneIdRequestReceiver;

/* renamed from: X.25z  reason: invalid class name and case insensitive filesystem */
public abstract class C450925z extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        boolean z;
        Bundle A0D;
        String str;
        PhoneIdRequestReceiver phoneIdRequestReceiver = (PhoneIdRequestReceiver) this;
        C57082iV BX3 = phoneIdRequestReceiver.A01.BX3();
        C57082iV BX32 = phoneIdRequestReceiver.A02.BX3();
        if (C17890vO.A1S(intent, "com.facebook.GET_PHONE_ID")) {
            boolean z2 = true;
            PendingIntent pendingIntent = (PendingIntent) C24141Ja.A00(getResultExtras(true), PendingIntent.class, "auth");
            String packageName = context.getPackageName();
            boolean A01 = C20013A3d.A01(context);
            if (pendingIntent != null) {
                String creatorPackage = pendingIntent.getCreatorPackage();
                try {
                    PackageManager packageManager = context.getPackageManager();
                    int i = 64;
                    if (AnonymousClass112.A05()) {
                        i = 134217728;
                    }
                    z = true;
                    if (!C20070A5v.A03(packageManager.getPackageInfo(creatorPackage, i))) {
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C17900vP.A0h("cannot find package; packageName=", creatorPackage, AnonymousClass000.A10(), e);
                }
                boolean A02 = C20013A3d.A02(context, packageName);
                C18030ve r2 = phoneIdRequestReceiver.A00;
                if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 3651)) {
                    z2 = false;
                }
                if (!z || !A01) {
                    A0D = C17880vN.A0D();
                    A0D.putLong("timestamp", BX3.A00);
                    str = BX3.A01;
                } else if (z2 && !A02) {
                    A0D = C17880vN.A0D();
                    A0D.putLong("timestamp", BX32.A00);
                    str = BX32.A01;
                } else {
                    return;
                }
                setResult(-1, str, A0D);
            }
            z = false;
            boolean A022 = C20013A3d.A02(context, packageName);
            C18030ve r22 = phoneIdRequestReceiver.A00;
            z2 = false;
            if (!z) {
            }
            A0D = C17880vN.A0D();
            A0D.putLong("timestamp", BX3.A00);
            str = BX3.A01;
            setResult(-1, str, A0D);
        }
    }
}
