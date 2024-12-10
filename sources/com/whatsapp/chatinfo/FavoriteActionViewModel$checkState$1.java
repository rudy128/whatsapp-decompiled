package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.FavoriteActionViewModel$checkState$1", f = "FavoriteActionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteActionViewModel$checkState$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public int label;
    public final /* synthetic */ FavoriteActionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteActionViewModel$checkState$1(FavoriteActionViewModel favoriteActionViewModel, AnonymousClass1BI r3, C30391dr r4) {
        super(2, r4);
        this.$chatJid = r3;
        this.this$0 = favoriteActionViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoriteActionViewModel$checkState$1(this.this$0, this.$chatJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r2;
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Set A0P = C18070vi.A0P(this.$chatJid);
            this.this$0.A01.A07.getValue();
            boolean A08 = this.this$0.A01.A08(A0P);
            FavoriteActionViewModel favoriteActionViewModel = this.this$0;
            if (A08) {
                r2 = favoriteActionViewModel.A00;
                i = 2;
            } else {
                boolean A09 = favoriteActionViewModel.A01.A09(A0P);
                r2 = this.this$0.A00;
                i = 1;
                if (A09) {
                    i = 3;
                }
            }
            r2.A0E(AnonymousClass3MW.A0v(i));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteActionViewModel$checkState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
