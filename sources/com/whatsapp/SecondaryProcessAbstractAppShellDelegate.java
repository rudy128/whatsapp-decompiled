package com.whatsapp;

import X.AnonymousClass00E;
import X.AnonymousClass10C;
import X.AnonymousClass10E;
import X.AnonymousClass114;
import X.AnonymousClass198;
import X.AnonymousClass1A4;
import X.C17960vV;
import X.C22461Ab;
import X.C70713Cf;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.whatsapp.util.Log;

public class SecondaryProcessAbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_WHATSAPP_LIB_NAME = "whatsapp";
    public static final String TAG = "SecondaryProcessAbstractAppShellDelegate";
    public final Context appContext;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
        Log.i("SecondaryProcessAbstractAppShellDelegate/onCreate");
        AnonymousClass114.A01((Application) this.appContext);
        AnonymousClass10C r1 = (AnonymousClass10C) AnonymousClass00E.A00(this.appContext, AnonymousClass10C.class);
        C22461Ab.A01(r1.CGT(), new C70713Cf(this, r1, 47), "anr_detector_secondary_process", true);
        C17960vV.A0E(false);
    }

    public SecondaryProcessAbstractAppShellDelegate(Context context) {
        this.appContext = context;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installAnrDetector(X.C22471Ac r4, X.AnonymousClass1A4 r5, X.AnonymousClass198 r6, X.C22481Ad r7, X.C17930vS r8, com.whatsapp.nativelibloader.WhatsAppLibLoader r9) {
        /*
            r3 = this;
            java.lang.String r2 = "whatsapp"
            java.lang.String r1 = "SecondaryProcessAbstractAppShellDelegate/installAnrDetector/exception"
            java.util.concurrent.CountDownLatch r0 = r6.A01     // Catch:{ IOException -> 0x001d }
            r0.countDown()     // Catch:{ IOException -> 0x001d }
            r6.A00()     // Catch:{ IOException -> 0x001d }
            boolean r0 = X.C224319w.A03(r8, r2)     // Catch:{  }
            if (r0 != 0) goto L_0x0016
            r9.A01(r2)     // Catch:{  }
        L_0x0016:
            r4.A00()
            com.whatsapp.wamsys.JniBridge.setDependencies(r7)
            return
        L_0x001d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SecondaryProcessAbstractAppShellDelegate.installAnrDetector(X.1Ac, X.1A4, X.198, X.1Ad, X.0vS, com.whatsapp.nativelibloader.WhatsAppLibLoader):void");
    }

    /* renamed from: lambda$onCreate$0$com-whatsapp-SecondaryProcessAbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m34lambda$onCreate$0$comwhatsappSecondaryProcessAbstractAppShellDelegate(AnonymousClass10C r9) {
        AnonymousClass10E r1 = (AnonymousClass10E) r9;
        installAnrDetector(r9.BCA(), (AnonymousClass1A4) r1.AAm.get(), (AnonymousClass198) r1.AC0.get(), r9.BhA(), r9.BIa(), r9.CS8());
    }
}
