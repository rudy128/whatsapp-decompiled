package com.whatsapp.calling.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37551pj;
import X.C72453Mb;
import X.C87374Vi;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1", f = "FavoritePicker.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritePicker$onBlockedItemPressed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public int label;
    public final /* synthetic */ FavoritePicker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePicker$onBlockedItemPressed$1(FavoritePicker favoritePicker, AnonymousClass1E7 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoritePicker;
        this.$contact = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoritePicker$onBlockedItemPressed$1(this.this$0, this.$contact, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoritePicker favoritePicker = this.this$0;
            C18600wl r2 = favoritePicker.A01;
            if (r2 != null) {
                FavoritePicker$onBlockedItemPressed$1$name$1 favoritePicker$onBlockedItemPressed$1$name$1 = new FavoritePicker$onBlockedItemPressed$1$name$1(favoritePicker, this.$contact, (C30391dr) null);
                this.label = 1;
                obj = C30451dy.A00(this, r2, favoritePicker$onBlockedItemPressed$1$name$1);
                if (obj == r6) {
                    return r6;
                }
            } else {
                AnonymousClass3MW.A1K();
                throw null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String A0q = C17880vN.A0q(this.this$0, obj, new Object[1], 0, 2131897277);
        FavoritePicker favoritePicker2 = this.this$0;
        Jid A0m = C72453Mb.A0m(this.$contact);
        C18070vi.A0X(A0m);
        AnonymousClass3MY.A1H(C87374Vi.A01(C87374Vi.A00(favoritePicker2, (C37551pj) C18070vi.A0E(favoritePicker2.A0J), (UserJid) A0m), A0q, 2131887212, false), this.this$0, (String) null);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePicker$onBlockedItemPressed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
