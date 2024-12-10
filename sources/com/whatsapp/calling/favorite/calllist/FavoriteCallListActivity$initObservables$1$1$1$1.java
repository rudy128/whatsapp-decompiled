package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1K2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MZ;
import X.AnonymousClass3XD;
import X.C000500i;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C84544Jx;
import X.C84554Jy;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1$1$1", f = "FavoriteCallListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListActivity$initObservables$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FavoriteCallListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListActivity$initObservables$1$1$1$1(FavoriteCallListActivity favoriteCallListActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteCallListActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FavoriteCallListActivity$initObservables$1$1$1$1 favoriteCallListActivity$initObservables$1$1$1$1 = new FavoriteCallListActivity$initObservables$1$1$1$1(this.this$0, r4);
        favoriteCallListActivity$initObservables$1$1$1$1.L$0 = obj;
        return favoriteCallListActivity$initObservables$1$1$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            Collection collection = (Collection) this.L$0;
            FavoriteCallListActivity favoriteCallListActivity = this.this$0;
            AnonymousClass3XD r1 = favoriteCallListActivity.A03;
            if (r1 != null) {
                C18070vi.A0d(collection, 0);
                r1.A00 = C17880vN.A10(collection);
                r1.notifyDataSetChanged();
            } else {
                C84544Jx r0 = favoriteCallListActivity.A02;
                if (r0 != null) {
                    ArrayList A0m = C29431cG.A0m(collection);
                    AnonymousClass1K2 r2 = r0.A00;
                    AnonymousClass10E r12 = r2.A01;
                    favoriteCallListActivity.A03 = new AnonymousClass3XD(C000500i.A00(r12.Ao9), (C84554Jy) r2.A00.A3u.get(), favoriteCallListActivity, AnonymousClass3MZ.A0i(r12), A0m);
                    FavoriteCallListActivity favoriteCallListActivity2 = this.this$0;
                    RecyclerView recyclerView = favoriteCallListActivity2.A01;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        AnonymousClass3XD r02 = favoriteCallListActivity2.A03;
                        if (r02 == null) {
                            C18070vi.A11("adapter");
                            throw null;
                        }
                        recyclerView.setAdapter(r02);
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
        return ((FavoriteCallListActivity$initObservables$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
