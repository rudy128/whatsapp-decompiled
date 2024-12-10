package com.whatsapp.contact.extensions;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1M9;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C17880vN;
import X.C197009w0;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2", f = "ContactManagerExt.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
public final class ContactManagerExtKt$asWaContacts$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ List $this_asWaContacts;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactManagerExtKt$asWaContacts$2(AnonymousClass1M9 r2, List list, C30391dr r4) {
        super(2, r4);
        this.$this_asWaContacts = list;
        this.$contactManager = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        ContactManagerExtKt$asWaContacts$2 contactManagerExtKt$asWaContacts$2 = new ContactManagerExtKt$asWaContacts$2(this.$contactManager, this.$this_asWaContacts, r5);
        contactManagerExtKt$asWaContacts$2.L$0 = obj;
        return contactManagerExtKt$asWaContacts$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
            List list = this.$this_asWaContacts;
            AnonymousClass1M9 r5 = this.$contactManager;
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContactManagerExtKt$asWaContacts$2$1$1 contactManagerExtKt$asWaContacts$2$1$1 = new ContactManagerExtKt$asWaContacts$2$1$1(r5, C17880vN.A0Q(it), (C30391dr) null);
                A0D.add(C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, contactManagerExtKt$asWaContacts$2$1$1, r6));
            }
            this.label = 1;
            obj = C197009w0.A00(A0D, this);
            if (obj == r8) {
                return r8;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContactManagerExtKt$asWaContacts$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
