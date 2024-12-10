package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3WS  reason: invalid class name */
public final class AnonymousClass3WS extends C38391rD {
    public final List A00 = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C18070vi.A0d(r9, 0);
        C445823z r6 = ((C80793y6) this.A00.get(i)).A01;
        View view = r9.A0H;
        C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoUpcomingEventView");
        C80803y7 r7 = (C80803y7) view;
        r7.setEventName(r6);
        long j = r6.A00;
        r7.A09.setText(((AnonymousClass4S4) C18070vi.A0E(r7.getEventTimeUtils())).A01(AnonymousClass00R.A01, r6.A03, j));
        r7.A00(r6, true);
        r7.setAbbreviatedDate(r6.A00);
        r7.setEventType(C82944Ct.UPCOMING);
        r7.setOnClickListener(r6, C82984Cx.NONE);
        r7.setResponseStatus(r6);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        Context A05 = AnonymousClass3MY.A05(viewGroup);
        C80803y7 r5 = new C80803y7(A05);
        AnonymousClass3MY.A0v(A05, r5, 2131232910);
        C27641Ww.A06(r5, r5.getWhatsAppLocale(), 0, 0, A05.getResources().getDimensionPixelSize(2131168776), 0);
        TypedValue typedValue = new TypedValue();
        A05.getTheme().resolveAttribute(16843868, typedValue, true);
        r5.A08.setBackgroundResource(typedValue.resourceId);
        return new C42011xT(r5);
    }

    public int A0Q() {
        return this.A00.size();
    }
}
