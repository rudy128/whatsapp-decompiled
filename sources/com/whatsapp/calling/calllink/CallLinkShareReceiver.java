package com.whatsapp.calling.calllink;

import X.A4u;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1EG;
import X.AnonymousClass74H;
import X.C17880vN;
import X.C17960vV;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

public class CallLinkShareReceiver extends BroadcastReceiver {
    public A4u A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    AnonymousClass10G.AVU(AnonymousClass10E.A10(context), this);
                    this.A02 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!AnonymousClass1EG.A0H(packageName)) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString();
                    if (charSequence != null) {
                        packageName = charSequence;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                if (!intent.hasExtra("extra_entry_point")) {
                    str = "CallLinkShareReceiver/onReceive entryPoint extra not available";
                } else if (!intent.hasExtra("extra_is_video")) {
                    str = "CallLinkShareReceiver/onReceive isVideo extra not available";
                } else {
                    boolean booleanExtra = intent.getBooleanExtra("extra_is_video", false);
                    this.A00.A03(AnonymousClass74H.A02(packageName, 2, intent.getIntExtra("extra_entry_point", 0), booleanExtra));
                    return;
                }
                C17960vV.A0F(false, str);
            }
        }
    }

    public CallLinkShareReceiver(int i) {
        this.A02 = false;
        this.A01 = C17880vN.A0p();
    }

    public CallLinkShareReceiver() {
        this(0);
    }
}
