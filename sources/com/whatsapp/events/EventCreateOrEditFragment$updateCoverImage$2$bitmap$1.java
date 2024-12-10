package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C86784Tb;
import android.graphics.BitmapFactory;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$updateCoverImage$2$bitmap$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$updateCoverImage$2$bitmap$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C86784Tb $state;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditFragment$updateCoverImage$2$bitmap$1(C86784Tb r2, C30391dr r3) {
        super(2, r3);
        this.$state = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new EventCreateOrEditFragment$updateCoverImage$2$bitmap$1(this.$state, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventCreateOrEditFragment$updateCoverImage$2$bitmap$1(this.$state, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return BitmapFactory.decodeFile(this.$state.A00.getPath());
        }
        throw AnonymousClass000.A0l();
    }
}
