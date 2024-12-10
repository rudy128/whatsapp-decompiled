package com.whatsapp.favorites;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3XF;
import X.AnonymousClass4PZ;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.FavoritesActivity$initObservables$1$1$1$1", f = "FavoritesActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoritesActivity$initObservables$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FavoritesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesActivity$initObservables$1$1$1$1(FavoritesActivity favoritesActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoritesActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FavoritesActivity$initObservables$1$1$1$1 favoritesActivity$initObservables$1$1$1$1 = new FavoritesActivity$initObservables$1$1$1$1(this.this$0, r4);
        favoritesActivity$initObservables$1$1$1$1.L$0 = obj;
        return favoritesActivity$initObservables$1$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Collection collection = (Collection) this.L$0;
            FavoritesActivity favoritesActivity = this.this$0;
            AnonymousClass3XF r1 = favoritesActivity.A02;
            if (r1 != null) {
                C18070vi.A0d(collection, 0);
                C72453Mb.A1J(r1, collection, r1.A04);
            } else {
                AnonymousClass4PZ r12 = favoritesActivity.A01;
                if (r12 != null) {
                    favoritesActivity.A02 = r12.A00(favoritesActivity, C29431cG.A0m(collection));
                    FavoritesActivity favoritesActivity2 = this.this$0;
                    RecyclerView recyclerView = favoritesActivity2.A00;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        AnonymousClass3XF r0 = favoritesActivity2.A02;
                        if (r0 == null) {
                            C18070vi.A11("adapter");
                            throw null;
                        }
                        recyclerView.setAdapter(r0);
                    }
                } else {
                    str = "adapterFactory";
                }
                C18070vi.A11(str);
                throw null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritesActivity$initObservables$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
