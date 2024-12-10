package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1$name$1", f = "FavoritePicker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$onBlockedItemPressed$1$name$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$onBlockedItemPressed$1$name$1(FavoritePicker favoritePicker, AnonymousClass1E7 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritePicker$onBlockedItemPressed$1$name$1(this.this$0, this.$contact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A08.A0I(this.$contact);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$onBlockedItemPressed$1$name$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
