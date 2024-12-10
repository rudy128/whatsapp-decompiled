package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass4L7;
import X.C23761Hn;
import X.C23771Ho;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3", f = "CompoundContactsLoader.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class CompoundContactsLoader$loadContacts$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public int label;
    public final /* synthetic */ AnonymousClass4L7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$3(AnonymousClass4L7 r2, AnonymousClass1EC r3, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupJid = r3;
        this.$concurrentCapacity = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CompoundContactsLoader$loadContacts$3(this.this$0, this.$groupJid, r6, this.$concurrentCapacity);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4L7 r4 = this.this$0;
            AnonymousClass1EC r5 = this.$groupJid;
            int i2 = this.$concurrentCapacity;
            C23771Ho r7 = C23761Hn.A01;
            this.label = 1;
            obj = C30451dy.A00(this, r7, new CompoundContactsLoader$loadContacts$2(r4, r5, (C30391dr) null, r7, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
