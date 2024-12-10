package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.1qx  reason: invalid class name and case insensitive filesystem */
public final class C38241qx implements C38231qw {
    public View A00;
    public C37911qO A01;
    public final RecyclerView A02;
    public final C38221qv A03;

    public C38241qx(RecyclerView recyclerView, C38221qv r5) {
        C18070vi.A0d(recyclerView, 1);
        this.A02 = recyclerView;
        this.A03 = r5;
        if (!C18020vd.A05(C18040vf.A01, r5.A07, 9737)) {
            recyclerView.setItemAnimator((C37961qT) null);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public void BBD(View view, boolean z) {
        C38421rG r1;
        C18070vi.A0d(view, 0);
        C38391rD r12 = this.A02.A0B;
        if ((r12 instanceof C38431rH) && (r1 = (C38421rG) r12) != null) {
            List list = r1.A02;
            list.add(view);
            r1.A0H(list.size() - 1);
        }
    }

    public void CHn(C38361rA r15) {
        RecyclerView recyclerView = this.A02;
        C38221qv r0 = this.A03;
        C18030ve r11 = r0.A07;
        C18000vb r10 = r0.A06;
        AnonymousClass1DC r12 = r0.A08;
        C37471pb r7 = r0.A04;
        recyclerView.setAdapter(new C38431rH(new C38401rE(r0.A00, r0.A01, r0.A02, r0.A03, r7, (C38371rB) r15, r0.A05, r10, r11, r12, r0.A09)));
    }

    public void CIr() {
    }

    public void CJ4() {
    }

    public void CKZ() {
    }

    public void CKh() {
        this.A02.A0f(0);
    }

    public void CNT() {
        this.A02.A0g(0);
    }

    public void BBC(View view, boolean z) {
        C38421rG r3;
        C38391rD r32 = this.A02.A0B;
        if ((r32 instanceof C38431rH) && (r3 = (C38421rG) r32) != null) {
            List list = r3.A01;
            list.add(view);
            r3.A0H(((r3.A02.size() + r3.A00.A0Q()) + list.size()) - 1);
        }
    }

    public C38361rA BMX() {
        C38391rD r1 = this.A02.A0B;
        if (r1 instanceof C38361rA) {
            return (C38361rA) r1;
        }
        return null;
    }

    public int BRo() {
        RecyclerView recyclerView = this.A02;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return C42181xl.A00(recyclerView);
        }
        return 0;
    }

    public int BSQ() {
        C38421rG r1;
        C38391rD r12 = this.A02.A0B;
        if (!(r12 instanceof C38431rH) || (r1 = (C38421rG) r12) == null) {
            return 0;
        }
        return r1.A02.size();
    }

    public int BTt() {
        C38251qy layoutManager = this.A02.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).A1Q();
        }
        return 0;
    }

    public void C04() {
        C38391rD r0;
        C37911qO r1 = this.A01;
        if (r1 != null && (r0 = this.A02.A0B) != null) {
            r0.A01.unregisterObserver(r1);
        }
    }

    public void CEk(View view) {
        C38421rG r3;
        if (view != null) {
            C38391rD r32 = this.A02.A0B;
            if ((r32 instanceof C38431rH) && (r3 = (C38421rG) r32) != null) {
                List list = r3.A02;
                int indexOf = list.indexOf(view);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf >= 0 && valueOf != null) {
                    list.remove(indexOf);
                    r3.A0I(indexOf);
                }
            }
        }
    }

    public void CIn(View view) {
        this.A00 = view;
        if (this.A01 == null) {
            AnonymousClass28K r1 = new AnonymousClass28K(this, 6);
            this.A01 = r1;
            C38391rD r0 = this.A02.A0B;
            if (r0 != null) {
                r0.CDq(r1);
            }
        }
        C37911qO r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
    }

    public void CJi(AbsListView.OnScrollListener onScrollListener) {
        RecyclerView recyclerView = this.A02;
        List list = recyclerView.A0L;
        if (list != null) {
            list.clear();
        }
        recyclerView.A0t(new C39721tX(onScrollListener));
    }

    public Context getContext() {
        Context context = this.A02.getContext();
        C18070vi.A0X(context);
        return context;
    }

    public int getCount() {
        C38391rD r0 = this.A02.A0B;
        if (r0 != null) {
            return r0.A0Q();
        }
        return 0;
    }

    public ViewGroup BbU() {
        return this.A02;
    }
}
