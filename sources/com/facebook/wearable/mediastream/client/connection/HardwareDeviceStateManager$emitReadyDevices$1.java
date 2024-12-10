package com.facebook.wearable.mediastream.client.connection;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C26153CtL;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.connection.HardwareDeviceStateManager$emitReadyDevices$1", f = "HardwareDeviceStateManager.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
public final class HardwareDeviceStateManager$emitReadyDevices$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C26153CtL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HardwareDeviceStateManager$emitReadyDevices$1(C26153CtL ctL, C30391dr r3) {
        super(2, r3);
        this.this$0 = ctL;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new HardwareDeviceStateManager$emitReadyDevices$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HardwareDeviceStateManager$emitReadyDevices$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Iterator it;
        C26153CtL ctL;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List A04 = this.this$0.A04();
            ctL = this.this$0;
            it = A04.iterator();
        } else if (i == 1) {
            it = (Iterator) this.L$1;
            ctL = (C26153CtL) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        while (it.hasNext()) {
            Object next = it.next();
            AnonymousClass1G3 A00 = ctL.A02;
            this.L$0 = ctL;
            this.L$1 = it;
            this.label = 1;
            if (A00.BJt(next, this) == r5) {
                return r5;
            }
        }
        return C27621Wu.A00;
    }
}
