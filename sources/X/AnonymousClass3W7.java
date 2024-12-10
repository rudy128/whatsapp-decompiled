package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$updateFavoritesOrder$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3W7  reason: invalid class name */
public final class AnonymousClass3W7 extends C25848Cn6 {
    public final C107195Yt A00;

    public void A03(C42011xT r3, int i) {
        View view;
        if (i == 2 && r3 != null && (view = r3.A0H) != null) {
            view.setAlpha(0.8f);
        }
    }

    public void A04(C42011xT r8, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        super.A04(r8, recyclerView);
        r8.A0H.setAlpha(1.0f);
        FavoriteCallListActivity favoriteCallListActivity = (FavoriteCallListActivity) this.A00;
        FavoriteCallListViewModel favoriteCallListViewModel = (FavoriteCallListViewModel) favoriteCallListActivity.A0F.getValue();
        AnonymousClass3XD r0 = favoriteCallListActivity.A03;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        List list = r0.A00;
        C18070vi.A0d(list, 0);
        ArrayList<C93564jB> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof C93564jB) {
                A13.add(next);
            }
        }
        ArrayList A0E = C29351c6.A0E(A13);
        for (C93564jB r02 : A13) {
            A0E.add(r02.A01);
        }
        AnonymousClass1G4 r1 = favoriteCallListViewModel.A0E;
        do {
        } while (!r1.BFK(r1.getValue(), A0E));
        AnonymousClass3MW.A1X(favoriteCallListViewModel.A0B, new FavoriteCallListViewModel$updateFavoritesOrder$1(favoriteCallListViewModel, A0E, (C30391dr) null), C41561wd.A00(favoriteCallListViewModel));
        favoriteCallListViewModel.A02.A01(10, 44, 15);
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return false;
    }

    public boolean A07(C42011xT r4, C42011xT r5, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        C18070vi.A0e(r4, 1, r5);
        return !(r5 instanceof C76243mx);
    }

    public boolean A08(C42011xT r7, C42011xT r8, RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        C38391rD r0 = recyclerView.A0B;
        if (r0 != null) {
            int A0Q = r0.A0Q();
            int A05 = r7.A05();
            int A052 = r8.A05();
            if (A052 < A0Q && A052 >= 0 && A05 < A0Q && A05 >= 0) {
                AnonymousClass3XD r2 = ((FavoriteCallListActivity) this.A00).A03;
                if (r2 == null) {
                    AnonymousClass3MW.A1B();
                    throw null;
                }
                r2.A00.add(A052, r2.A00.remove(A05));
                r2.A01.A01(A05, A052);
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3W7(C107195Yt r1) {
        this.A00 = r1;
    }

    public int A01(C42011xT r2, RecyclerView recyclerView) {
        return C72483Me.A01();
    }
}
