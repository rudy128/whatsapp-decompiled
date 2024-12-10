package com.whatsapp.contact.extensions;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2$1$1", f = "ContactManagerExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ AnonymousClass1BI $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2$1$1(AnonymousClass1M9 r2, AnonymousClass1BI r3, C30391dr r4) {
        super(2, r4);
        this.$contactManager = r2;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ContactManagerExtKt$asWaContacts$2$1$1(this.$contactManager, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.$contactManager.A0H(this.$it);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactManagerExtKt$asWaContacts$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
