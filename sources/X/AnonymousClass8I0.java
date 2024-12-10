package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8I0  reason: invalid class name */
public final class AnonymousClass8I0 extends C38391rD implements C22536BBt {
    public AHM A00;
    public AEW A01;
    public boolean A02;
    public final C18030ve A03;
    public final List A04 = AnonymousClass000.A13();
    public final List A05 = AnonymousClass000.A13();
    public final C56412hQ A06;
    public final AnonymousClass11S A07;
    public final C22369B4x A08;
    public final UserJid A09;

    public AnonymousClass8I0(C56412hQ r2, AnonymousClass11S r3, C22369B4x b4x, C18030ve r5, UserJid userJid) {
        C72473Md.A1M(r5, r3, r2, 3);
        this.A08 = b4x;
        this.A09 = userJid;
        this.A03 = r5;
        this.A07 = r3;
        this.A06 = r2;
    }

    public void A0R(C42011xT r2) {
        C18070vi.A0d(r2, 0);
        if (r2 instanceof C168778jf) {
            AnonymousClass8IO r22 = (AnonymousClass8IO) r2;
            if (r22 instanceof C168778jf) {
                r22.A0H.clearAnimation();
            }
        }
    }

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A00 = new AHM(recyclerView, this);
    }

    public void Bmc(C42011xT r7, int i) {
        long j;
        C18070vi.A0d(r7, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            C20287AEv BXb = BXb(i);
            C168858jn r72 = (C168858jn) r7;
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A03, 4983);
            List list = this.A04;
            if (!A052) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j = 0;
                        break;
                    }
                    C194209rM A0J = AnonymousClass8BR.A0J(it);
                    C20287AEv aEv = A0J.A01;
                    j = A0J.A00;
                    if (C18070vi.A18(aEv.A0H, BXb.A0H)) {
                        break;
                    }
                }
            } else {
                j = C196479v8.A00(BXb, list);
            }
            r72.A0C(new C168738jb(BXb, j));
        } else if (itemViewType == 1) {
            Object obj = this.A05.get(i);
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.model.product.ProductListHeaderItemModel");
            String str = ((ANL) obj).A00;
            WaTextView waTextView = ((C168788jg) r7).A00;
            waTextView.setText(str);
            waTextView.setContentDescription(C17890vO.A0R(waTextView.getContext(), str, 1, 0, 2131894785));
        } else if (itemViewType != 2) {
            List list2 = C42011xT.A0I;
        } else {
            new C182999Wn(9);
            ((C168778jf) r7).A0C();
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            C56412hQ r1 = this.A06;
            List list = C42011xT.A0I;
            View A002 = AnonymousClass9PR.A00(viewGroup);
            UserJid userJid = this.A09;
            return r1.A00(A002, new C182919Wf(897460699), this, (B7L) null, (B7Q) null, this.A08, userJid);
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            return new C168788jg(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626625, false));
        } else if (i == 2) {
            List list3 = C42011xT.A0I;
            return new C42011xT(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626623, false));
        } else if (i == 3) {
            return new C42011xT(C108955ca.A0G(LayoutInflater.from(AnonymousClass3MY.A05(viewGroup)), viewGroup, 2131624378, false));
        } else {
            throw AnonymousClass8BX.A0W("Unsupported view type - ", AnonymousClass000.A10(), i);
        }
    }

    public int A0Q() {
        return this.A05.size();
    }

    public final boolean A0U() {
        List list = this.A05;
        if (list.size() <= 0 || !(list.get(0) instanceof ANJ)) {
            return false;
        }
        return true;
    }

    public C20287AEv BXb(int i) {
        Object obj = this.A05.get(i);
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.model.product.ProductListProductItemModel");
        return ((ANM) obj).A00;
    }

    public int getItemViewType(int i) {
        return ((B7D) this.A05.get(i)).getType();
    }

    public AEW BNr() {
        return this.A01;
    }

    public boolean BON() {
        return this.A02;
    }
}
