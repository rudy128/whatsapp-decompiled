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

@DebugMetadata(c = "com.whatsapp.favorites.FavoriteBottomSheetFragment$initObservables$1$1$1$1", f = "FavoriteBottomSheetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteBottomSheetFragment$initObservables$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FavoriteBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteBottomSheetFragment$initObservables$1$1$1$1(FavoriteBottomSheetFragment favoriteBottomSheetFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteBottomSheetFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FavoriteBottomSheetFragment$initObservables$1$1$1$1 favoriteBottomSheetFragment$initObservables$1$1$1$1 = new FavoriteBottomSheetFragment$initObservables$1$1$1$1(this.this$0, r4);
        favoriteBottomSheetFragment$initObservables$1$1$1$1.L$0 = obj;
        return favoriteBottomSheetFragment$initObservables$1$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Collection collection = (Collection) this.L$0;
            FavoriteBottomSheetFragment favoriteBottomSheetFragment = this.this$0;
            AnonymousClass3XF r1 = favoriteBottomSheetFragment.A02;
            if (r1 != null) {
                C18070vi.A0d(collection, 0);
                C72453Mb.A1J(r1, collection, r1.A04);
            } else {
                AnonymousClass4PZ r12 = favoriteBottomSheetFragment.A01;
                if (r12 != null) {
                    favoriteBottomSheetFragment.A02 = r12.A00(favoriteBottomSheetFragment, C29431cG.A0m(collection));
                    FavoriteBottomSheetFragment favoriteBottomSheetFragment2 = this.this$0;
                    RecyclerView recyclerView = favoriteBottomSheetFragment2.A00;
                    if (recyclerView != null) {
                        AnonymousClass3XF r0 = favoriteBottomSheetFragment2.A02;
                        if (r0 == null) {
                            C18070vi.A11("adapter");
                        } else {
                            recyclerView.setAdapter(r0);
                        }
                    }
                } else {
                    C18070vi.A11("adapterFactory");
                }
                throw null;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteBottomSheetFragment$initObservables$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
