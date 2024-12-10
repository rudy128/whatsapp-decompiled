package X;

import android.view.ViewGroup;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8jd  reason: invalid class name and case insensitive filesystem */
public abstract class C168758jd extends AnonymousClass8HZ implements C40391ud, C22536BBt {
    public AEW A00;
    public Boolean A01;
    public final AnonymousClass1L9 A02;
    public final AnonymousClass11S A03;
    public final CatalogManager A04;
    public final C20005A2v A05;
    public final C18030ve A06;
    public final UserJid A07;
    public final List A08 = AnonymousClass000.A13();

    public int BSO(int i) {
        while (-1 < i) {
            if (Bex(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public boolean CM0() {
        return true;
    }

    public static C168688jW A02(AnonymousClass8HZ r0, int i) {
        Object obj = r0.A00.get(i);
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.FooterDisplayItem");
        return (C168688jW) obj;
    }

    public final long A0U(C20287AEv aEv) {
        if (aEv == null) {
            return 0;
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A06, 4983);
        List list = this.A08;
        if (A052) {
            return C196479v8.A00(aEv, list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C194209rM A0J = AnonymousClass8BR.A0J(it);
            C20287AEv aEv2 = A0J.A01;
            long j = A0J.A00;
            if (C18070vi.A18(aEv2.A0H, aEv.A0H)) {
                return j;
            }
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.8IO, X.1xT] */
    public AnonymousClass8IO A0V(ViewGroup viewGroup, int i) {
        if (i == 9) {
            List list = C42011xT.A0I;
            return new C42011xT(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626623, false));
        }
        throw AnonymousClass000.A0n("product-list-base-adapter/onCreateViewHolder/unknown view type");
    }

    public void A0W() {
        boolean z = this instanceof AnonymousClass8l7;
        boolean A0Y = A0Y();
        if (z) {
            if (A0Y) {
                List list = this.A00;
                C18070vi.A0W(list);
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    if (next instanceof C168678jV) {
                        A13.add(next);
                    }
                }
                for (Object next2 : A13) {
                    int indexOf = list.indexOf(next2);
                    list.remove(next2);
                    A0I(indexOf);
                }
            }
        } else if (A0Y) {
            List list2 = this.A00;
            int size = list2.size() - 2;
            int i = (size - 3) + 1;
            if (i < 0) {
                Log.w("CollectionProductListBaseAdapter/hideLoadingView/hideLoadingView invalied end pos");
                i = 0;
            }
            if (i <= size) {
                while (true) {
                    Object obj = list2.get(size);
                    if (obj instanceof C168678jV) {
                        list2.remove(obj);
                        A0I(size);
                    }
                    if (size != i) {
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A0X() {
        if (!(this instanceof AnonymousClass8l7)) {
            List list = this.A00;
            if (list.size() != 0 && !A0Y()) {
                int i = 0;
                do {
                    int A012 = AnonymousClass3MX.A01(list);
                    list.add(A012, new C182999Wn(9));
                    A0H(A012);
                    i++;
                } while (i < 3);
            }
        } else if (!A0Y()) {
            int i2 = 0;
            do {
                List list2 = this.A00;
                int max = Math.max(0, AnonymousClass3MX.A01(list2));
                list2.add(max, new C182999Wn(9));
                A0H(max);
                i2++;
            } while (i2 < 3);
        }
    }

    public boolean A0Y() {
        if (this instanceof AnonymousClass8l7) {
            List list = this.A00;
            C18070vi.A0W(list);
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (next instanceof C168678jV) {
                    A13.add(next);
                }
            }
            return AnonymousClass000.A1a(A13);
        }
        List list2 = this.A00;
        if (list2.size() < 2) {
            return false;
        }
        return list2.get(AnonymousClass3MX.A02(list2, 2)) instanceof C168678jV;
    }

    public boolean BON() {
        return C72463Mc.A1Y(this.A01);
    }

    public C20287AEv BXb(int i) {
        Object obj = this.A00.get(i);
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.ProductDisplayItem");
        return ((C168738jb) obj).A01;
    }

    public boolean Bex(int i) {
        C182999Wn r0;
        List list = this.A00;
        if (i >= list.size() || i < 0 || (r0 = (C182999Wn) list.get(i)) == null || r0.A00 != 14) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        AnonymousClass8IO r32 = (AnonymousClass8IO) r3;
        C18070vi.A0d(r32, 0);
        if (getItemViewType(i) == 2) {
            ((C168828jk) r32).A00 = A02(this, i).A00;
        }
        r32.A0B((C182999Wn) this.A00.get(i));
    }

    public C168758jd(AnonymousClass1L9 r2, AnonymousClass11S r3, CatalogManager catalogManager, C20005A2v a2v, C18030ve r6, UserJid userJid) {
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = catalogManager;
        this.A05 = a2v;
        this.A07 = userJid;
    }

    public AEW BNr() {
        return this.A00;
    }

    public /* synthetic */ boolean Be5() {
        return false;
    }
}
