package com.whatsapp.migration.transferinfra.connection;

import X.AnonymousClass000;
import X.AnonymousClass112;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C18600wl;
import X.C21528Alb;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1", f = "WifiDirectScannerConnectionHandler.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class WifiDirectScannerConnectionHandler$connectToHotspot$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $ipAddress;
    public final /* synthetic */ String $password;
    public final /* synthetic */ String $ssid;
    public int label;
    public final /* synthetic */ WifiDirectScannerConnectionHandler this$0;

    @DebugMetadata(c = "com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1$1", f = "WifiDirectScannerConnectionHandler.kt", i = {}, l = {128, 130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.migration.transferinfra.connection.WifiDirectScannerConnectionHandler$connectToHotspot$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r8) {
            return new AnonymousClass1(str, str2, str3, r8);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                boolean A06 = AnonymousClass112.A06();
                WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = WifiDirectScannerConnectionHandler.this;
                String str = str;
                String str2 = str2;
                if (A06) {
                    this.label = 1;
                    obj = WifiDirectScannerConnectionHandler.A00(wifiDirectScannerConnectionHandler, str, str2, this);
                } else {
                    this.label = 2;
                    obj = WifiDirectScannerConnectionHandler.A01(wifiDirectScannerConnectionHandler, str, str2, this);
                }
                if (obj == r6) {
                    return r6;
                }
            } else if (i == 1 || i == 2) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            if (C18070vi.A19(obj, true)) {
                Log.i("p2p/WifiDirectScannerConnectionHandler/ connectToHotspot/success");
                WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler2 = WifiDirectScannerConnectionHandler.this;
                Runnable runnable = wifiDirectScannerConnectionHandler2.A04;
                if (runnable != null) {
                    wifiDirectScannerConnectionHandler2.A09.CEz(runnable);
                }
                WifiDirectScannerConnectionHandler.this.A08.A00(str3, 1);
            } else {
                Log.i("p2p/WifiDirectScannerConnectionHandler/ Unable to connect to hotspot, falling back to service discovery");
                WifiDirectScannerConnectionHandler.A02(WifiDirectScannerConnectionHandler.this);
                WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler3 = WifiDirectScannerConnectionHandler.this;
                WifiDirectScannerConnectionHandler.A04(wifiDirectScannerConnectionHandler3, new C21528Alb(wifiDirectScannerConnectionHandler3, 32));
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirectScannerConnectionHandler$connectToHotspot$1(WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler, String str, String str2, String str3, C30391dr r6) {
        super(2, r6);
        this.this$0 = wifiDirectScannerConnectionHandler;
        this.$ssid = str;
        this.$password = str2;
        this.$ipAddress = str3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new WifiDirectScannerConnectionHandler$connectToHotspot$1(this.this$0, this.$ssid, this.$password, this.$ipAddress, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final WifiDirectScannerConnectionHandler wifiDirectScannerConnectionHandler = this.this$0;
            C18600wl r0 = wifiDirectScannerConnectionHandler.A0B;
            final String str = this.$ssid;
            final String str2 = this.$password;
            final String str3 = this.$ipAddress;
            AnonymousClass1 r3 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WifiDirectScannerConnectionHandler$connectToHotspot$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
