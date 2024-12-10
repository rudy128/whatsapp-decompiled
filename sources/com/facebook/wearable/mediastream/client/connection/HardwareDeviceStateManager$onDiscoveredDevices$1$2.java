package com.facebook.wearable.mediastream.client.connection;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C26153CtL;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.CXV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$onDiscoveredDevices$1$2", f = "HardwareDeviceStateManager.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
public final class HardwareDeviceStateManager$onDiscoveredDevices$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ CXV $newDevice;
    public int label;
    public final /* synthetic */ C26153CtL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HardwareDeviceStateManager$onDiscoveredDevices$1$2(CXV cxv, C26153CtL ctL, C30391dr r4) {
        super(2, r4);
        this.this$0 = ctL;
        this.$newDevice = cxv;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new HardwareDeviceStateManager$onDiscoveredDevices$1$2(this.$newDevice, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G3 A00 = this.this$0.A02;
            CXV cxv = this.$newDevice;
            this.label = 1;
            if (A00.BJt(cxv, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HardwareDeviceStateManager$onDiscoveredDevices$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
