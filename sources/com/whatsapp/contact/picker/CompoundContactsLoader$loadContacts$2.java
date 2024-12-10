package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1D7;
import X.AnonymousClass1EC;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1b2;
import X.AnonymousClass1b3;
import X.AnonymousClass4L7;
import X.AnonymousClass4TN;
import X.AnonymousClass4Z6;
import X.AnonymousClass5WN;
import X.C106095Un;
import X.C17880vN;
import X.C18600wl;
import X.C25691Pg;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99424sn;
import X.C99614tB;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2", f = "CompoundContactsLoader.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"resultMap"}, s = {"L$1"})
public final class CompoundContactsLoader$loadContacts$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $concurrentCapacity;
    public final /* synthetic */ C18600wl $dispatcher;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass4L7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompoundContactsLoader$loadContacts$2(AnonymousClass4L7 r2, AnonymousClass1EC r3, C30391dr r4, C18600wl r5, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$concurrentCapacity = i;
        this.$groupJid = r3;
        this.$dispatcher = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CompoundContactsLoader$loadContacts$2(this.this$0, this.$groupJid, r8, this.$dispatcher, this.$concurrentCapacity);
    }

    public final Object invokeSuspend(Object obj) {
        Map map;
        Iterator it;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1b3 A0C = AnonymousClass1b2.A0C(new C106095Un(this.$groupJid, this.$dispatcher), C29431cG.A0V(this.this$0.A00));
            int i2 = this.$concurrentCapacity;
            if (i2 > 0) {
                C99424sn r0 = new C99424sn(A0C, i2, i2);
                map = C17880vN.A13();
                it = r0.iterator();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("size ");
                A10.append(i2);
                throw AnonymousClass001.A12(" must be greater than zero.", A10);
            }
        } else if (i == 1) {
            map = (Map) this.L$1;
            it = (Iterator) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        while (it.hasNext()) {
            AnonymousClass4Z6 r02 = AnonymousClass4Z6.$redex_init_class;
            AnonymousClass5WN r1 = new AnonymousClass5WN((Iterable) it.next(), AnonymousClass1OR.A00, C25691Pg.SUSPEND, -2);
            C99614tB A00 = C99614tB.A00(map, 12);
            this.L$0 = it;
            this.L$1 = map;
            this.label = 1;
            if (r1.BFC(this, A00) == r4) {
                return r4;
            }
        }
        return new AnonymousClass4TN(AnonymousClass1D7.A0F(map));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CompoundContactsLoader$loadContacts$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
