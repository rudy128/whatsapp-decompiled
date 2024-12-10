package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5lD  reason: invalid class name and case insensitive filesystem */
public final class C112275lD extends C38391rD {
    public C140066zt A00;
    public C116705yU A01;
    public List A02 = C18460wS.A00;
    public WeakReference A03 = AnonymousClass3MW.A0z((Object) null);
    public final C34801l6 A04;
    public final AnonymousClass2Z4 A05;
    public final C131376kz A06;
    public final C131386l0 A07;
    public final C37451pZ A08;
    public final C34551kg A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final AnonymousClass2Z5 A0D;

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A03 = AnonymousClass3MW.A0z(recyclerView);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r2;
        C42011xT A002;
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        int i2 = 2131626134;
        if (i != 2) {
            i2 = 2131627082;
            if (i != 3) {
                i2 = 2131627077;
                if (i != 4) {
                    i2 = 2131627012;
                    if (i == 5) {
                        i2 = 2131627081;
                    }
                }
            }
        }
        View inflate = A0K.inflate(i2, viewGroup, false);
        if (i == 0) {
            C34801l6 r1 = this.A04;
            C18070vi.A0b(inflate);
            C37451pZ r7 = this.A08;
            C34551kg r10 = this.A09;
            List list = C42011xT.A0I;
            AnonymousClass10E r22 = r1.A00.A00;
            AnonymousClass1VW A0e = AnonymousClass3MZ.A0e(r22);
            AnonymousClass10G r12 = r22.A00;
            C24921Me A0g = AnonymousClass3MZ.A0g(r22);
            C18000vb A6Q = AnonymousClass10E.A6Q(r22);
            A002 = new C121406Jn(inflate, AnonymousClass3MZ.A0T(r12), A0e, A0g, r7, A6Q, (AQC) r12.A0z.get(), r10);
        } else if (i == 1) {
            AnonymousClass2Z4 r13 = this.A05;
            C18070vi.A0b(inflate);
            C37451pZ r5 = this.A08;
            C34551kg r9 = this.A09;
            List list2 = C42011xT.A0I;
            AnonymousClass10E r14 = r13.A00.A00;
            AnonymousClass1VW A0e2 = AnonymousClass3MZ.A0e(r14);
            C24641Lc A0X = C108965cb.A0X(r14);
            AnonymousClass1DC A13 = AnonymousClass3MZ.A13(r14);
            A002 = new C121426Jp(inflate, A0e2, r5, AnonymousClass3Ma.A0c(r14), (AQC) r14.A00.A0z.get(), A0X, r9, A13);
        } else if (i == 2) {
            C18070vi.A0b(inflate);
            A002 = new AnonymousClass6K3(inflate, this.A09);
        } else {
            if (i == 5) {
                List list3 = C42011xT.A0I;
                C18070vi.A0b(inflate);
                r2 = new AnonymousClass6KS(inflate, this.A00, this.A09, false);
            } else if (i == 4) {
                C131386l0 r23 = this.A07;
                C18070vi.A0b(inflate);
                A002 = r23.A00(inflate, this.A08, this.A00, this.A09, false);
            } else if (i == 3) {
                C131376kz r24 = this.A06;
                C18070vi.A0b(inflate);
                A002 = r24.A00(inflate, this.A08, this.A00, this.A09, false);
            } else if (i == 6) {
                List list4 = C42011xT.A0I;
                C18070vi.A0b(inflate);
                r2 = new AnonymousClass6KT(inflate, this.A00, true);
            } else {
                throw AnonymousClass000.A0k("View type not supported");
            }
            C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.StatusComponentDataItem>");
            return r2;
        }
        r2 = A002;
        C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.StatusComponentDataItem>");
        return r2;
    }

    public static final List A00(C112275lD r1) {
        if (!C72453Mb.A1a(r1.A0C)) {
            return r1.A02;
        }
        List list = ((C40431uh) r1.A0A.getValue()).A02;
        C18070vi.A0X(list);
        return list;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        C113585nK r22 = (C113585nK) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B();
    }

    public void A0V(C140066zt r5, List list) {
        C116705yU r3;
        C37471pb r2;
        int i;
        if (C72453Mb.A1a(this.A0C)) {
            if (!C18070vi.A18(r5, this.A00)) {
                Log.i("StatusAdapter/updateAsyncDifferList updating tile spec and emptying list");
                ((C40431uh) this.A0A.getValue()).A00((Runnable) null, C18460wS.A00);
                this.A00 = r5;
            }
            C108995ce.A1S(list, this.A0A);
            return;
        }
        C108955ca.A1O(this.A01);
        if (!C18070vi.A18(r5, this.A00)) {
            this.A00 = r5;
            this.A02 = C18460wS.A00;
        }
        List list2 = this.A02;
        C18070vi.A0d(list2, 0);
        AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf((Collection) list2);
        C18070vi.A0X(copyOf);
        if (this.A00 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A14("StatusAdapter/createDiffUtilTask updating list from size: ", A10, copyOf);
            A10.append(" to size: ");
            C17900vP.A0o(A10, list.size());
            r3 = new C116705yU(copyOf, list);
            r2 = (C37471pb) this.A0B.getValue();
            i = 3;
        } else {
            r3 = new C116705yU(copyOf, list);
            r2 = (C37471pb) this.A0B.getValue();
            i = 4;
        }
        r2.A00(new C143627Ed(this, list, i), r3);
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C113585nK r32 = (C113585nK) r3;
        C18070vi.A0d(r32, 0);
        List A002 = A00(this);
        if (r32 instanceof AnonymousClass88I) {
            ((AnonymousClass88I) r32).BDF(this.A00, (AnonymousClass6JD) A002.get(i));
            return;
        }
        List list = C42011xT.A0I;
        r32.A0C((AnonymousClass6U0) A002.get(i));
    }

    public C112275lD(C34801l6 r3, AnonymousClass2Z4 r4, AnonymousClass2Z5 r5, C131376kz r6, C131386l0 r7, C37451pZ r8, C24641Lc r9, C140066zt r10, C34551kg r11, AnonymousClass10I r12) {
        C18070vi.A0w(r12, r3, r4, r5, r6);
        C18070vi.A0q(r7, r9, r8);
        this.A04 = r3;
        this.A05 = r4;
        this.A0D = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = r11;
        this.A00 = r10;
        this.A0B = AnonymousClass1DF.A01(new C154347qz(r12));
        Integer num = AnonymousClass00R.A0C;
        this.A0A = AnonymousClass1DF.A00(num, new C154337qy(this));
        this.A0C = AnonymousClass1DF.A00(num, new C154357r0(r9));
    }

    public int A0Q() {
        return A00(this).size();
    }

    public final void A0U(AnonymousClass206 r6, int i) {
        Object obj;
        C42011xT r1;
        C121456Js r12;
        int size = A00(this).size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                RecyclerView recyclerView = (RecyclerView) this.A03.get();
                obj = null;
                if (recyclerView != null) {
                    r1 = recyclerView.A0O(i2);
                } else {
                    r1 = null;
                }
                if ((r1 instanceof C121456Js) && (r12 = (C121456Js) r1) != null) {
                    r12.ByX(r6, i);
                    obj = C27621Wu.A00;
                }
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Throwable A002 = C30671eK.A00(obj);
            if (A002 != null) {
                C108995ce.A1M("StatusAdapter/onMessageUpdated/failed: ", AnonymousClass000.A10(), A002);
            }
        }
    }

    public int getItemViewType(int i) {
        Integer num;
        Object obj = A00(this).get(i);
        if (obj instanceof AnonymousClass6JB) {
            if (this.A00 != null) {
                num = AnonymousClass00R.A0N;
            } else {
                num = AnonymousClass00R.A00;
            }
        } else if (obj instanceof AnonymousClass6JC) {
            if (this.A00 != null) {
                num = AnonymousClass00R.A0Y;
            } else {
                num = AnonymousClass00R.A01;
            }
        } else if (obj instanceof AnonymousClass6J9) {
            if (this.A00 != null) {
                num = AnonymousClass00R.A0j;
            } else {
                num = AnonymousClass00R.A0C;
            }
        } else if (obj instanceof AnonymousClass6JA) {
            num = AnonymousClass00R.A0u;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return num.intValue();
    }
}
