package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.collections.ObservableRecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6KR  reason: invalid class name */
public final class AnonymousClass6KR extends C113585nK implements C161008Az {
    public int A00 = -1;
    public long A01;
    public long A02;
    public AnonymousClass6JP A03;
    public boolean A04;
    public final Handler A05 = C17890vO.A0D();
    public final ViewTreeObserver.OnDrawListener A06 = new C1422978x(this);
    public final C22710BLv A07 = new C22710BLv(this, 3);
    public final TabLayout A08;
    public final ObservableRecyclerView A09;
    public final AnonymousClass8AU A0A;
    public final C112695lt A0B;
    public final C126516cr A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final Runnable A0G = AnonymousClass7RI.A00(this, 6);
    public final C18100vl A0H;
    public final C18100vl A0I;
    public final C18100vl A0J = AnonymousClass1DF.A01(new C153837qA(this));
    public final AnonymousClass11P A0K;
    public final C113785nk A0L = new C113785nk(this);
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KR(View view, AnonymousClass11P r7, AnonymousClass8AU r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        super(view);
        C18070vi.A0d(view, 1);
        C72473Md.A1M(r7, r9, r10, 3);
        C18070vi.A0d(r11, 6);
        C108965cb.A1P(r12, 7, r13);
        this.A0A = r8;
        this.A0K = r7;
        this.A0N = r9;
        this.A0M = r10;
        this.A0D = r11;
        this.A0F = r12;
        this.A0E = r13;
        this.A0I = AnonymousClass1DF.A01(new C153827q9(view));
        this.A0C = new C126516cr(this);
        this.A0B = new C112695lt(this);
        this.A08 = (TabLayout) AnonymousClass3MX.A0C(view, 2131435662);
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass7vM(view, this));
        ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) view.findViewById(2131435657);
        observableRecyclerView.A12.add(new C142657Ah(AnonymousClass00R.A00));
        observableRecyclerView.setLayoutDirection(AnonymousClass3MW.A1Z((C18000vb) this.A0F.get()) ? 1 : 0);
        observableRecyclerView.setLayoutManager((C38251qy) this.A0H.getValue());
        AnonymousClass8AU r1 = this.A0A;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.status.tiles.StatusGridOptimizedAdapter");
        observableRecyclerView.setAdapter((C38391rD) r1);
        observableRecyclerView.A0r(new C112565lg(this, AnonymousClass3MW.A01(AnonymousClass000.A0Y(observableRecyclerView), 2131168774)));
        observableRecyclerView.A00 = C18020vd.A05(C18040vf.A02, C17880vN.A0P(r10), 9640);
        if (!C72453Mb.A1a(C108945cZ.A0v(r9).A04)) {
            observableRecyclerView.setItemAnimator((C37961qT) null);
        }
        this.A09 = observableRecyclerView;
    }

    public void ByX(AnonymousClass206 r3, int i) {
        C161008Az r1;
        C18070vi.A0d(r3, 0);
        AnonymousClass8AU r12 = this.A0A;
        if ((r12 instanceof C161008Az) && (r1 = (C161008Az) r12) != null) {
            r1.ByX(r3, i);
        }
    }

    public static final void A01(AnonymousClass6KR r12) {
        C110595gJ r0;
        C113785nk r11 = r12.A0L;
        int A0E2 = r11.A0E();
        TabLayout tabLayout = r12.A08;
        ArrayList arrayList = tabLayout.A0h;
        int size = arrayList.size();
        boolean A1S = AnonymousClass000.A1S(A0E2, size);
        int i = size - 1;
        C17900vP.A0n("StatusGridOptimizedViewHolder/updateTabsIfNeeded tabs changed: ", AnonymousClass000.A10(), A1S);
        if (A1S) {
            boolean A1U = AnonymousClass000.A1U(A0E2, size);
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C136836uU A082 = tabLayout.A08(i3);
                if (A082 != null && A082.A03()) {
                    i2 = i3;
                }
            }
            tabLayout.A0D(r11, false);
            if (size == 0) {
                int ceil = (int) ((float) Math.ceil((double) (((float) ((LinearLayoutManager) r12.A0H.getValue()).A1O()) / ((float) C140066zt.A00(r12)))));
                C108985cd.A16(tabLayout, ceil);
                C17900vP.A0j("StatusGridOptimizedViewHolder/Updating selected tab to index: ", AnonymousClass000.A10(), ceil);
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C136836uU A083 = tabLayout.A08(i4);
                if (!(A083 == null || (r0 = A083.A02) == null)) {
                    r0.setClickable(false);
                }
            }
            if (A1U) {
                if (i2 == i) {
                    List BTZ = r12.A0A.BTZ();
                    if (AnonymousClass000.A1a(BTZ)) {
                        BTZ.size();
                    }
                }
                i2 = AnonymousClass000.A0Q(arrayList);
            }
            C17900vP.A0j("StatusGridOptimizedViewHolder/ Last selected index : ", AnonymousClass000.A10(), i2);
            C108985cd.A16(tabLayout, i2);
        }
        int i5 = 0;
        if (arrayList.size() <= 1) {
            i5 = 8;
        }
        tabLayout.setVisibility(i5);
    }

    public void BIZ() {
        this.A09.setAdapter((C38391rD) null);
        ((BM9) this.A0J.getValue()).A08((RecyclerView) null);
    }
}
