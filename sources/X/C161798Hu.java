package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import java.util.List;

/* renamed from: X.8Hu  reason: invalid class name and case insensitive filesystem */
public class C161798Hu extends C38391rD {
    public final C184869be A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiProfileDetailsActivity A02;

    public C161798Hu(C184869be r1, IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity, List list) {
        this.A02 = indiaUpiProfileDetailsActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public static void A00(AEC aec, AnonymousClass8JA r2) {
        ImageView imageView;
        int i;
        String str = aec.A03;
        if (str.equals("numeric_id")) {
            imageView = r2.A00;
            i = 2131232374;
        } else if (str.equals("mobile_number")) {
            imageView = r2.A00;
            i = 2131231742;
        } else {
            return;
        }
        imageView.setImageResource(i);
    }

    private void A01(AnonymousClass8JA r6) {
        r6.A0H.setEnabled(true);
        TextView textView = r6.A02;
        AnonymousClass8BW.A0z(textView.getContext(), this.A02.getResources(), textView, 2130970831, 2131102246);
    }

    public int A0Q() {
        return this.A01.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r1.setText(r0);
        r6.A0H.setEnabled(false);
        r6.A00.setImageResource(2131232345);
        X.AnonymousClass8BW.A0z(r4.getContext(), r5.A02.getResources(), r4, 2130971113, 2131102439);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bmc(X.C42011xT r6, int r7) {
        /*
            r5 = this;
            X.8JA r6 = (X.AnonymousClass8JA) r6
            java.util.List r0 = r5.A01
            java.lang.Object r2 = r0.get(r7)
            X.AEC r2 = (X.AEC) r2
            android.widget.TextView r4 = r6.A02
            X.77e r0 = r2.A00
            java.lang.Object r0 = r0.A00
            X.AnonymousClass8BR.A1E(r4, r0)
            java.lang.String r1 = r2.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case -1422950650: goto L_0x001d;
                case -733902135: goto L_0x0031;
                case -591705762: goto L_0x003f;
                case 24665195: goto L_0x004d;
                case 681442075: goto L_0x0064;
                case 1073361059: goto L_0x0072;
                case 2076720286: goto L_0x0080;
                default: goto L_0x001c;
            }
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = "active"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            A00(r2, r6)
            r5.A01(r6)
            android.widget.TextView r1 = r6.A01
            r0 = 2131897582(0x7f122cee, float:1.9430058E38)
            goto L_0x0060
        L_0x0031:
            java.lang.String r0 = "available"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r6.A01
            r0 = 2131897590(0x7f122cf6, float:1.9430074E38)
            goto L_0x008d
        L_0x003f:
            java.lang.String r0 = "active_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r6.A01
            r0 = 2131897583(0x7f122cef, float:1.943006E38)
            goto L_0x008d
        L_0x004d:
            java.lang.String r0 = "inactive"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            A00(r2, r6)
            r5.A01(r6)
            android.widget.TextView r1 = r6.A01
            r0 = 2131897588(0x7f122cf4, float:1.943007E38)
        L_0x0060:
            r1.setText(r0)
            return
        L_0x0064:
            java.lang.String r0 = "deregistered_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r6.A01
            r0 = 2131897591(0x7f122cf7, float:1.9430076E38)
            goto L_0x008d
        L_0x0072:
            java.lang.String r0 = "active_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r6.A01
            r0 = 2131897581(0x7f122ced, float:1.9430056E38)
            goto L_0x008d
        L_0x0080:
            java.lang.String r0 = "inactive_status_pending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r1 = r6.A01
            r0 = 2131897585(0x7f122cf1, float:1.9430064E38)
        L_0x008d:
            r1.setText(r0)
            android.view.View r1 = r6.A0H
            r0 = 0
            r1.setEnabled(r0)
            android.widget.ImageView r1 = r6.A00
            r0 = 2131232345(0x7f080659, float:1.8080797E38)
            r1.setImageResource(r0)
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r0 = r5.A02
            android.content.res.Resources r3 = r0.getResources()
            android.content.Context r2 = r4.getContext()
            r1 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.AnonymousClass8BW.A0z(r2, r3, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161798Hu.Bmc(X.1xT, int):void");
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        List list = C42011xT.A0I;
        return new AnonymousClass8JA(AnonymousClass3MX.A09(this.A02.getLayoutInflater(), viewGroup, 2131625641), this.A00);
    }
}
