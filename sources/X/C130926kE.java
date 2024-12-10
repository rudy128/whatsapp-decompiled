package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.status.ContactStatusThumbnail;

/* renamed from: X.6kE  reason: invalid class name and case insensitive filesystem */
public final class C130926kE {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final TextView A04;
    public final WaTextView A05;
    public final SelectionCheckView A06;
    public final ContactStatusThumbnail A07;
    public final View A08;
    public final LinearLayout A09;
    public final /* synthetic */ C110235f9 A0A;

    public C130926kE(View view, C110235f9 r6) {
        this.A0A = r6;
        this.A00 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) AnonymousClass3MX.A0C(view, 2131429433);
        this.A07 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View A0C = AnonymousClass3MX.A0C(view, 2131429455);
        this.A08 = A0C;
        A0C.setClickable(false);
        this.A04 = C72453Mb.A0W(view, 2131429798);
        ImageView A0B = C108975cc.A0B(view, 2131433360);
        this.A02 = A0B;
        C18030ve r3 = r6.A07;
        if (C18020vd.A05(C18040vf.A02, r3, 6685)) {
            A0B.setColorFilter(C108985cd.A03(A0B), PorterDuff.Mode.SRC_IN);
        }
        AnonymousClass6LG.A00(A0B, r6, 7);
        WaTextView A0g = C72453Mb.A0g(view, 2131436831);
        this.A05 = A0g;
        View A0C2 = AnonymousClass3MX.A0C(view, 2131434675);
        this.A01 = A0C2;
        AnonymousClass6LG.A00(A0C2, r6, 8);
        this.A03 = (ProgressBar) AnonymousClass3MX.A0C(view, 2131434180);
        this.A06 = (SelectionCheckView) AnonymousClass3MX.A0C(view, 2131435130);
        this.A09 = (LinearLayout) AnonymousClass3MX.A0C(view, 2131436225);
        if (!AnonymousClass1J8.A09(r3)) {
            C43421zm.A04(A0g);
        }
    }
}
