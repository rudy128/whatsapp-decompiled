package com.whatsapp.lists.home;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C73693Wy;
import X.C96764oN;
import androidx.fragment.app.Fragment;
import com.whatsapp.lists.ListsRepository;
import com.whatsapp.lists.ListsRepository$reorderLists$2;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;
import com.whatsapp.lists.home.ui.main.ListsHomeViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.home.ListsHomeBottomSheet$handlePositiveTap$2", f = "ListsHomeBottomSheet.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class ListsHomeBottomSheet$handlePositiveTap$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ListsHomeBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsHomeBottomSheet$handlePositiveTap$2(ListsHomeBottomSheet listsHomeBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsHomeBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsHomeBottomSheet$handlePositiveTap$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsHomeBottomSheet$handlePositiveTap$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Fragment A0O = this.this$0.A1E().A0O(2131430999);
            C18070vi.A0z(A0O, "null cannot be cast to non-null type com.whatsapp.lists.home.ui.main.ListsHomeFragment");
            ListsHomeFragment listsHomeFragment = (ListsHomeFragment) A0O;
            this.label = 1;
            if (listsHomeFragment.A08) {
                ListsHomeViewModel A0q = AnonymousClass3MX.A0q(listsHomeFragment.A0A);
                C73693Wy r0 = listsHomeFragment.A03;
                if (r0 == null) {
                    C18070vi.A11("listsItemAdapter");
                    throw null;
                }
                List list = r0.A02;
                ArrayList<C96764oN> A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    if (next instanceof C96764oN) {
                        A13.add(next);
                    }
                }
                ArrayList A0D = C29351c6.A0D(A13);
                for (C96764oN r02 : A13) {
                    A0D.add(Long.valueOf(r02.A00.A03));
                }
                ListsRepository listsRepository = (ListsRepository) A0q.A0A.get();
                if (C30451dy.A00(this, listsRepository.A0B, new ListsRepository$reorderLists$2(listsRepository, A0D, (C30391dr) null)) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A28();
        return C27621Wu.A00;
    }
}
