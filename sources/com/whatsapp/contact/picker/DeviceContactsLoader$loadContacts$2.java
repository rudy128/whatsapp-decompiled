package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.DeviceContactsLoader$loadContacts$2", f = "DeviceContactsLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceContactsLoader$loadContacts$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DeviceContactsLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceContactsLoader$loadContacts$2(DeviceContactsLoader deviceContactsLoader, C30391dr r3) {
        super(2, r3);
        this.this$0 = deviceContactsLoader;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DeviceContactsLoader$loadContacts$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DeviceContactsLoader$loadContacts$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A13 = AnonymousClass000.A13();
            this.this$0.A00.A0m(A13);
            return C29431cG.A12(A13);
        }
        throw AnonymousClass000.A0l();
    }
}
