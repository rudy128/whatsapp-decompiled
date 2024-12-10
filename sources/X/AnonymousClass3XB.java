package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.3XB  reason: invalid class name */
public final class AnonymousClass3XB extends C38391rD {
    public final C40431uh A00 = new C40431uh((C40411uf) new AnonymousClass3W0(1), (C38391rD) this);
    public final C37451pZ A01;

    public AnonymousClass3XB(C37451pZ r3) {
        this.A01 = r3;
        A0K(true);
    }

    public void Bmc(C42011xT r10, int i) {
        C18070vi.A0d(r10, 0);
        AnonymousClass5XE r1 = ((AnonymousClass4N6) this.A00.A02.get(i)).A01;
        if (r10 instanceof C74143Yr) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.Header");
            C94014ju r12 = (C94014ju) r1;
            C18070vi.A0d(r12, 0);
            ((C74143Yr) r10).A00.setText(r12.A00);
        } else if (r10 instanceof C74133Yq) {
            C74133Yq r102 = (C74133Yq) r10;
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.Group");
            C94064jz r13 = (C94064jz) r1;
            C18070vi.A0d(r13, 0);
            r102.A00.A07(r13, r102.A01);
        } else if (r10 instanceof AnonymousClass3YO) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.Message");
            C94054jy r14 = (C94054jy) r1;
            C18070vi.A0d(r14, 0);
            ((AnonymousClass3YO) r10).A00.setText(r14.A00.A0v.A01);
        } else if (r10 instanceof AnonymousClass3YN) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.MediaMessage<*>");
            C108855cP r15 = (C108855cP) r1;
            C18070vi.A0d(r15, 0);
            C110855hG r2 = ((AnonymousClass3YN) r10).A00;
            C135666sZ BUk = r15.BUk();
            C22821Di BVf = r15.BVf();
            C22821Di BVi = r15.BVi();
            r2.A07(BUk, r15.BOV(), r15.BSU(), BVf, BVi, r15.BgO());
        } else if (r10 instanceof AnonymousClass3YM) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.MediaFilterTokenList");
            C94044jx r16 = (C94044jx) r1;
            C18070vi.A0d(r16, 0);
            ((AnonymousClass3YM) r10).A00.A01(r16.A00, C104915Pz.A00, r16.A01, false);
        } else if (r10 instanceof AnonymousClass661) {
            C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.communitymedia.CommunityMediaAdapter.UiState.ViewMore");
            C135676sa r17 = ((C94034jw) r1).A00;
            C18070vi.A0d(r17, 0);
            ((AnonymousClass661) r10).A00.A00(r17);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6FB, X.5g6, X.6FA, android.view.View] */
    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 3) {
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624588);
            C18070vi.A0X(A09);
            return new C74143Yr(A09);
        } else if (i == 4) {
            View A092 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624587);
            C18070vi.A0X(A092);
            return new AnonymousClass3YK(A092);
        } else if (i == 12) {
            List list = C42011xT.A0I;
            View A0R = C72453Mb.A0R(viewGroup);
            A0R.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            return new AnonymousClass3YQ(A0R);
        } else if (i == 5) {
            List list2 = C42011xT.A0I;
            C37451pZ r2 = this.A01;
            C18070vi.A0d(r2, 1);
            return new C74133Yq(new AnonymousClass3SD(AnonymousClass3MY.A04(viewGroup)), r2);
        } else if (i == 6) {
            return new AnonymousClass3YO(new WaTextView(AnonymousClass3MY.A05(viewGroup)));
        } else {
            if (i == 7 || i == 8 || i == 9 || i == 10) {
                return new AnonymousClass3YN(new C110855hG(AnonymousClass3MY.A05(viewGroup)));
            }
            if (i == 2) {
                View A093 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624590);
                C18070vi.A0X(A093);
                return new AnonymousClass3YP(A093);
            } else if (i == 1) {
                View A094 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624589);
                C18070vi.A0X(A094);
                return new AnonymousClass3YL(A094);
            } else if (i == 11) {
                ? r22 = new AnonymousClass6FB(AnonymousClass3MY.A05(viewGroup));
                r22.A00();
                AnonymousClass3Ma.A18(r22, -1, -2);
                return new AnonymousClass3YM(r22);
            } else if (i == 13) {
                return new AnonymousClass661(new C110545gC(AnonymousClass3MY.A05(viewGroup)));
            } else {
                throw AnonymousClass000.A0k("Unknown view type");
            }
        }
    }

    public long A0M(int i) {
        return (long) this.A00.A02.get(i).hashCode();
    }

    public int A0Q() {
        return this.A00.A02.size();
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass4N6) this.A00.A02.get(i)).A00.ordinal();
    }
}
