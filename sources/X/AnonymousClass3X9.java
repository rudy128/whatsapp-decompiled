package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.3X9  reason: invalid class name */
public final class AnonymousClass3X9 extends C38391rD {
    public List A00 = AnonymousClass000.A13();

    public void Bmc(C42011xT r6, int i) {
        C18070vi.A0d(r6, 0);
        if (r6 instanceof C73993Yc) {
            Object obj = ((C86874Tk) this.A00.get(i)).A01;
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.group.newgroup.AddParticipantButtonView.UiState");
            C18070vi.A0d(obj, 0);
            C90044dR.A00(((C73993Yc) r6).A00, obj, 21);
        } else if (r6 instanceof C74003Yd) {
            Object obj2 = ((C86874Tk) this.A00.get(i)).A01;
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.group.newgroup.GroupParticipantView.UiState");
            C87094Ug r4 = (C87094Ug) obj2;
            C18070vi.A0d(r4, 0);
            AnonymousClass3Qf r3 = ((C74003Yd) r6).A00;
            C37451pZ r1 = r4.A00;
            AnonymousClass1E7 r2 = r4.A01;
            r1.A07(r3.A04, r2);
            r3.A05.setText(r3.getWaContactNames().A0I(r2));
            if (r4.A03) {
                C90044dR.A00(r3, r4, 22);
            } else {
                r3.A03.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3Q1, android.widget.LinearLayout, android.view.ViewGroup] */
    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            Context A05 = AnonymousClass3MY.A05(viewGroup);
            ? linearLayout = new LinearLayout(A05, (AttributeSet) null, 0, 0);
            View inflate = View.inflate(A05, 2131624638, linearLayout);
            linearLayout.setGravity(17);
            AnonymousClass3MW.A0H(inflate, 2131427497).setImageResource(2131232176);
            AnonymousClass1Y5.A04(inflate, 2131899257);
            AnonymousClass3MW.A1Q(inflate);
            return new C73993Yc(linearLayout);
        } else if (i == 2) {
            return new C74003Yd(new AnonymousClass3Qf(AnonymousClass3MY.A05(viewGroup)));
        } else {
            View view = viewGroup;
            if (i == 3) {
                List list = C42011xT.A0I;
                view = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625296, false);
            }
            return new C42011xT(view);
        }
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C86874Tk r0 = (C86874Tk) C29431cG.A0f(this.A00, i);
        if (r0 != null) {
            return r0.A00;
        }
        return 0;
    }

    public long A0M(int i) {
        AnonymousClass1E7 r1;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            return -1;
        }
        if (itemViewType == 2) {
            Object obj = ((C86874Tk) this.A00.get(i)).A01;
            if (!(obj instanceof AnonymousClass1E7) || (r1 = (AnonymousClass1E7) obj) == null) {
                return -2;
            }
            return r1.A0J();
        } else if (itemViewType == 3) {
            return -3;
        } else {
            return -2;
        }
    }
}
