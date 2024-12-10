package com.whatsapp.contact.contactform.viewcontrollers.privacy;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C139626zB;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.contactform.viewcontrollers.privacy.ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1", f = "ContactFormSaveNativeContactController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C139626zB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1(C139626zB r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ContactFormSaveNativeContactController$addContactCreatedWithinWaId$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C139626zB r0 = this.this$0;
            r0.A03.A00(r0.A06.A05());
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
