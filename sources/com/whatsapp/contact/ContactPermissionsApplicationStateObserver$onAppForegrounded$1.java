package com.whatsapp.contact;

import X.AnonymousClass1OS;
import X.C26301Rp;
import X.C27621Wu;
import X.C30201dY;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.ContactPermissionsApplicationStateObserver$onAppForegrounded$1", f = "ContactPermissionsApplicationStateObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactPermissionsApplicationStateObserver$onAppForegrounded$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C30201dY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactPermissionsApplicationStateObserver$onAppForegrounded$1(C30201dY r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ContactPermissionsApplicationStateObserver$onAppForegrounded$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ContactPermissionsApplicationStateObserver$onAppForegrounded$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean A00 = this.this$0.A01.A00();
            if (A00 != this.this$0.A02.A0O("CONTACT_PERMISSION_APPLICATION_STATE_OBSERVER_OS_AB_ADDRESS_BOOK_PERMISSION")) {
                C26301Rp.A04(this.this$0.A02, "CONTACT_PERMISSION_APPLICATION_STATE_OBSERVER_OS_AB_ADDRESS_BOOK_PERMISSION", String.valueOf(A00));
                this.this$0.A00.A0G();
                this.this$0.A00.A0I();
            }
            return C27621Wu.A00;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
