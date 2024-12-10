package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.5nl  reason: invalid class name and case insensitive filesystem */
public class C113795nl extends AnonymousClass1b8 {
    public final /* synthetic */ PopupNotification A00;

    public C113795nl(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public int A0E() {
        return C72463Mc.A0C(this.A00.A1L);
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        PopupNotification popupNotification = this.A00;
        RelativeLayout relativeLayout = new RelativeLayout(popupNotification);
        ScrollView scrollView = new ScrollView(popupNotification);
        AnonymousClass206 A0k = AnonymousClass3MW.A0k(popupNotification.A1L, i);
        View A03 = PopupNotification.A03(popupNotification, A0k);
        relativeLayout.setTag(A0k.A0v);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        scrollView.addView(A03);
        relativeLayout.addView(scrollView, layoutParams);
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass000.A1Z(view, obj);
    }
}
