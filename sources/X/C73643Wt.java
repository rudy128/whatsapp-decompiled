package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3Wt  reason: invalid class name and case insensitive filesystem */
public final class C73643Wt extends C38391rD {
    public final List A00 = AnonymousClass000.A13();
    public final C82984Cx A01;

    public C73643Wt(C82984Cx r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public void Bmc(C42011xT r11, int i) {
        C18070vi.A0d(r11, 0);
        if (r11 instanceof AnonymousClass3YY) {
            List list = this.A00;
            Object obj = list.get(i);
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.EventItem");
            C445823z r7 = ((C80793y6) obj).A01;
            Object obj2 = list.get(i);
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.EventItem");
            C82944Ct r8 = ((C80793y6) obj2).A00;
            C82984Cx r6 = this.A01;
            View view = r11.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.event.EventView");
            C80803y7 r9 = (C80803y7) view;
            r9.setEventName(r7);
            long j = r7.A00;
            r9.A09.setText(((AnonymousClass4S4) C18070vi.A0E(r9.getEventTimeUtils())).A01(AnonymousClass00R.A01, r7.A03, j));
            r9.A00(r7, false);
            r9.setAbbreviatedDate(r7.A00);
            r9.setEventType(r8);
            r9.setOnClickListener(r7, r6);
            r9.setResponseStatus(r7);
        } else if (r11 instanceof AnonymousClass3YX) {
            Object obj3 = this.A00.get(i);
            C18070vi.A0z(obj3, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.HeaderItem");
            String str = ((C80783y5) obj3).A00;
            View view2 = r11.A0H;
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.event.EventHeaderView");
            ((AnonymousClass3P5) view2).A00.setText(str);
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass3YY(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass3YX(AnonymousClass3MY.A05(viewGroup));
        }
        return new AnonymousClass3YZ(viewGroup);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        Integer num;
        C84904Lh r0 = (C84904Lh) C29431cG.A0f(this.A00, i);
        if (r0 != null) {
            num = r0.A00;
        } else {
            num = AnonymousClass00R.A00;
        }
        return num.intValue();
    }
}
