package com.whatsapp.migration.transferinfra.connection;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108935cY;
import X.C199209zc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.EEF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectCreatorManager$createGroup$2$result$1", f = "WifiDirectCreatorManager.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class WifiDirectCreatorManager$createGroup$2$result$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108935cY $ipAddress;
    public final /* synthetic */ C108935cY $passphrase;
    public final /* synthetic */ C108935cY $ssid;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirectCreatorManager$createGroup$2$result$1(C30391dr r2, C108935cY r3, C108935cY r4, C108935cY r5) {
        super(2, r2);
        this.$ssid = r3;
        this.$passphrase = r4;
        this.$ipAddress = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WifiDirectCreatorManager$createGroup$2$result$1(r6, this.$ssid, this.$passphrase, this.$ipAddress);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EEF[] eefArr = {this.$ssid, this.$passphrase, this.$ipAddress};
            this.label = 1;
            obj = new C199209zc(eefArr).A00(this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WifiDirectCreatorManager$createGroup$2$result$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
