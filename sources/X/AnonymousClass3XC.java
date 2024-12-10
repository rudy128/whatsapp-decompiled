package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3XC  reason: invalid class name */
public final class AnonymousClass3XC extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final C37451pZ A01;

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        C18070vi.A0d(r3, 0);
        if (r3 instanceof C80853yC) {
            View view = r3.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.events.EventResponseUserView");
            C30551e8.A04(((AnonymousClass3R9) view).A0G.getCoroutineContext());
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C18070vi.A0d(r6, 0);
        if (r6 instanceof C80853yC) {
            Object obj = this.A00.get(i);
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.UserItem");
            C80893yG r3 = (C80893yG) obj;
            C37451pZ r2 = this.A01;
            C18070vi.A0h(r3, r2);
            View view = r6.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.events.EventResponseUserView");
            ((AnonymousClass3R9) view).A02(r2, r3);
        } else if (r6 instanceof C80843yB) {
            List list = this.A00;
            Object obj2 = list.get(i);
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.HeaderItem");
            String str = ((C80883yF) obj2).A01;
            Object obj3 = list.get(i);
            C18070vi.A0z(obj3, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.HeaderItem");
            int i2 = ((C80883yF) obj3).A00;
            View view2 = r6.A0H;
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.events.EventResponseHeaderView");
            AnonymousClass3Q4 r1 = (AnonymousClass3Q4) view2;
            r1.A01.setText(str);
            r1.A00.setText(C72473Md.A0k(AnonymousClass000.A0Y(r1), i2, 2131755136));
        } else if (r6 instanceof C80823y9) {
            Object obj4 = this.A00.get(i);
            C18070vi.A0z(obj4, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.EventAdditionalInfo");
            C445823z r22 = ((C80863yD) obj4).A00;
            View view3 = r6.A0H;
            C18070vi.A0z(view3, "null cannot be cast to non-null type com.whatsapp.events.EventAdditionalInfoView");
            ((AnonymousClass3R7) view3).A01(r22);
        } else if (r6 instanceof C80833yA) {
            List list2 = this.A00;
            Object obj5 = list2.get(i);
            C18070vi.A0z(obj5, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.EventNameAndDescription");
            C445823z r4 = ((C80873yE) obj5).A00;
            C37451pZ r32 = this.A01;
            Object obj6 = list2.get(i);
            C18070vi.A0z(obj6, "null cannot be cast to non-null type com.whatsapp.events.EventInfoAndResponsesAdapter.Item.EventNameAndDescription");
            C82984Cx r23 = ((C80873yE) obj6).A01;
            C18070vi.A0d(r32, 1);
            View view4 = r6.A0H;
            C18070vi.A0z(view4, "null cannot be cast to non-null type com.whatsapp.events.EventDetailsView");
            ((AnonymousClass3R3) view4).A00(r4, r32, r23);
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new C80853yC(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 2) {
            return new C80843yB(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 4) {
            return new C80823y9(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 3) {
            return new C80833yA(AnonymousClass3MY.A05(viewGroup));
        }
        return new AnonymousClass3YZ(viewGroup);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        Integer num;
        C84914Li r0 = (C84914Li) C29431cG.A0f(this.A00, i);
        if (r0 != null) {
            num = r0.A00;
        } else {
            num = AnonymousClass00R.A00;
        }
        return num.intValue();
    }

    public AnonymousClass3XC(C37451pZ r2) {
        this.A01 = r2;
    }
}
