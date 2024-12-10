package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass4Z9;
import X.C18070vi;
import X.C19740yt;
import X.C27621Wu;
import X.C28271Zs;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity$initObservables$1$1$1$2", f = "FavoriteCallListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListActivity$initObservables$1$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ FavoriteCallListActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListActivity$initObservables$1$1$1$2(FavoriteCallListActivity favoriteCallListActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteCallListActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        FavoriteCallListActivity$initObservables$1$1$1$2 favoriteCallListActivity$initObservables$1$1$1$2 = new FavoriteCallListActivity$initObservables$1$1$1$2(this.this$0, r4);
        favoriteCallListActivity$initObservables$1$1$1$2.Z$0 = AnonymousClass000.A1Y(obj);
        return favoriteCallListActivity$initObservables$1$1$1$2;
    }

    public final Object invokeSuspend(Object obj) {
        int A01;
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean z = this.Z$0;
            FavoriteCallListActivity favoriteCallListActivity = this.this$0;
            favoriteCallListActivity.A0C = !z;
            Toolbar toolbar = favoriteCallListActivity.A02;
            if (toolbar != null) {
                int i = 2131887799;
                if (z) {
                    i = 2131899154;
                }
                toolbar.setTitle(i);
            }
            FavoriteCallListActivity favoriteCallListActivity2 = this.this$0;
            if (z) {
                A01 = AnonymousClass1YL.A00(favoriteCallListActivity2, 2130968626, 2131099689);
            } else {
                C18070vi.A0d(favoriteCallListActivity2, 0);
                A01 = AnonymousClass4Z9.A01(favoriteCallListActivity2, false);
            }
            Window window = favoriteCallListActivity2.getWindow();
            C18070vi.A0X(window);
            C28271Zs.A00(window, C19740yt.A00(favoriteCallListActivity2, A01), true);
            WDSToolbar wDSToolbar = favoriteCallListActivity2.A05;
            if (wDSToolbar == null) {
                C18070vi.A11("wdsToolBar");
                throw null;
            }
            AnonymousClass3MX.A1A(favoriteCallListActivity2, wDSToolbar, A01);
            this.this$0.invalidateOptionsMenu();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListActivity$initObservables$1$1$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
