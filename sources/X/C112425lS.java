package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.5lS  reason: invalid class name and case insensitive filesystem */
public final class C112425lS extends C38391rD implements AnonymousClass8AU, C161008Az {
    public C140066zt A00;
    public WeakReference A01 = AnonymousClass3MW.A0z((Object) null);
    public final C131376kz A02;
    public final C131386l0 A03;
    public final C37451pZ A04;
    public final C34551kg A05;
    public final AnonymousClass00H A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C153817q8(this));
    public final C200710s A08;

    public C112425lS(C131376kz r3, C131386l0 r4, C37451pZ r5, C140066zt r6, C34551kg r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0p(r4, r9, r8);
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r9;
        this.A04 = r5;
        this.A05 = r7;
        this.A00 = r6;
        this.A08 = new C200710s(r8, true);
    }

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A01 = AnonymousClass3MW.A0z(recyclerView);
    }

    public void BIZ() {
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r1;
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        int i2 = 2131627077;
        if (i != 1) {
            i2 = 2131627081;
            if (i != 2) {
                i2 = 2131627078;
                if (i != 3) {
                    i2 = 2131627079;
                    if (i != 4) {
                        i2 = 2131627082;
                        if (i == 5) {
                            i2 = 2131627080;
                        }
                    }
                }
            }
        }
        View inflate = A0K.inflate(i2, viewGroup, false);
        if (i == 2) {
            List list = C42011xT.A0I;
            C18070vi.A0b(inflate);
            r1 = new AnonymousClass6KS(inflate, this.A00, this.A05, false);
        } else if (i == 1) {
            C131386l0 r2 = this.A03;
            C18070vi.A0b(inflate);
            r1 = r2.A00(inflate, this.A04, this.A00, this.A05, false);
        } else if (i == 3) {
            List list2 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            r1 = new AnonymousClass6KT(inflate, this.A00, true);
        } else if (i == 4 || i == 5) {
            List list3 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            r1 = new AnonymousClass6KT(inflate, (C140066zt) null, false);
        } else {
            C131376kz r22 = this.A02;
            C18070vi.A0b(inflate);
            r1 = r22.A00(inflate, this.A04, this.A00, this.A05, false);
        }
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.StatusComponentDataItem>");
        return r1;
    }

    public void BwL(int i) {
    }

    public void ByX(AnonymousClass206 r6, int i) {
        Object obj;
        C121456Js r1;
        C18070vi.A0d(r6, 0);
        RecyclerView recyclerView = (RecyclerView) this.A01.get();
        if (recyclerView != null) {
            try {
                int A0Q = A0Q();
                for (int i2 = 0; i2 < A0Q; i2++) {
                    C42011xT A0O = recyclerView.A0O(i2);
                    if ((A0O instanceof C121456Js) && (r1 = (C121456Js) A0O) != null) {
                        r1.ByX(r6, i);
                    }
                }
                obj = C27621Wu.A00;
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Throwable A002 = C30671eK.A00(obj);
            if (A002 != null) {
                C108995ce.A1M("StatusGridOptimizedAdapter/onMessageUpdated/failed: ", AnonymousClass000.A10(), A002);
            }
        }
    }

    public void CRO(C140066zt r2, List list) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        A01(this, list);
    }

    public static final void A00(C112425lS r1, int i) {
        GridLayoutManager gridLayoutManager;
        RecyclerView recyclerView = (RecyclerView) r1.A01.get();
        C38251qy r12 = null;
        if (recyclerView != null) {
            r12 = recyclerView.getLayoutManager();
        }
        if ((r12 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) r12) != null) {
            gridLayoutManager.A1g(i);
        }
    }

    public int A0Q() {
        return ((C40431uh) this.A07.getValue()).A02.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C113585nK r22 = (C113585nK) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B();
    }

    public List BTZ() {
        List list = ((C40431uh) this.A07.getValue()).A02;
        C18070vi.A0X(list);
        return list;
    }

    public void BjN(C140066zt r1, List list) {
        this.A00 = r1;
        A01(this, list);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        AnonymousClass88I r32;
        C113585nK r33 = (C113585nK) r3;
        C18070vi.A0d(r33, 0);
        if ((r33 instanceof AnonymousClass88I) && (r32 = (AnonymousClass88I) r33) != null) {
            r32.BDF(this.A00, (AnonymousClass6JD) ((C40431uh) this.A07.getValue()).A02.get(i));
        }
    }

    public int getItemViewType(int i) {
        Integer num;
        List list = ((C40431uh) this.A07.getValue()).A02;
        C18070vi.A0X(list);
        AnonymousClass6JD r1 = (AnonymousClass6JD) C29431cG.A0f(list, i);
        if (r1 instanceof AnonymousClass6JC) {
            num = AnonymousClass00R.A01;
        } else if (r1 instanceof AnonymousClass6J9) {
            num = AnonymousClass00R.A0C;
        } else if (r1 instanceof AnonymousClass6JA) {
            int intValue = ((AnonymousClass6JA) r1).A01.intValue();
            if (intValue == 0) {
                num = AnonymousClass00R.A0N;
            } else if (intValue == 1) {
                num = AnonymousClass00R.A0Y;
            } else if (intValue == 2) {
                num = AnonymousClass00R.A0j;
            } else {
                throw AnonymousClass3MW.A14();
            }
        } else {
            num = AnonymousClass00R.A00;
        }
        return num.intValue();
    }

    public static final void A01(C112425lS r3, List list) {
        if (list.size() <= r3.A00.A00) {
            ((C40431uh) r3.A07.getValue()).A00(AnonymousClass7RI.A00(r3, 5), list);
            return;
        }
        A00(r3, 2);
        r3.A08.execute(new AnonymousClass7RQ(r3, list, 10));
    }

    public C140066zt BTV() {
        return this.A00;
    }
}
