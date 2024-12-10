package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* renamed from: X.AZi  reason: case insensitive filesystem */
public class C20805AZi implements BDE {
    public final C22464B8w A00;
    public final C37451pZ A01;
    public final AnonymousClass1E7 A02;
    public final AnonymousClass8pQ A03;
    public final ARR A04;
    public final ARR A05;
    public final C1418477e A06;
    public final AZ6 A07;
    public final A1F A08;
    public final WeakReference A09;
    public final WeakReference A0A;

    public /* synthetic */ void Blj(ViewGroup viewGroup) {
    }

    public boolean CMG(C20284AEs aEs) {
        return true;
    }

    public /* synthetic */ void CMg(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
    }

    public void BCl(ViewGroup viewGroup) {
        Object obj = this.A09.get();
        ARR arr = this.A05;
        AnonymousClass1KN r9 = arr.A02;
        if (r9.A00.compareTo(BigDecimal.ZERO) > 0) {
            ARR arr2 = this.A04;
            A1F a1f = this.A08;
            C17960vV.A07(obj);
            Activity activity = (Activity) obj;
            ViewGroup viewGroup2 = viewGroup;
            if (arr2 != null) {
                a1f.A02(activity, viewGroup2, arr.A01, r9, arr2.A02, this.A03);
                return;
            }
            AnonymousClass1KJ r4 = arr.A01;
            AnonymousClass8pQ r3 = this.A03;
            View A0A2 = AnonymousClass3MX.A0A(activity.getLayoutInflater(), viewGroup, 2131624626);
            AnonymousClass3MW.A0J(A0A2, 2131427786).setText(r4.BLc(a1f.A01, r9));
            A1F.A00(activity, A0A2, r3, a1f);
        }
    }

    public int BPB(C20284AEs aEs) {
        if ("other".equals(((AnonymousClass8pQ) aEs).A00.A00)) {
            return 0;
        }
        return 2131232150;
    }

    public String BPC(C20284AEs aEs, int i) {
        Context context = (Context) this.A09.get();
        if (context == null) {
            return "";
        }
        AnonymousClass8pQ r5 = (AnonymousClass8pQ) aEs;
        if ("other".equals(r5.A00.A00)) {
            return context.getString(2131888312);
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        C1418477e r0 = r5.A09;
        C17960vV.A07(r0);
        return C108975cc.A0b(context, r0.A00, A1a, 2131893594);
    }

    public void Blk(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A09.get();
        Fragment fragment = (Fragment) this.A0A.get();
        if (activity != null && fragment != null) {
            ImageView A0E = AnonymousClass8BY.A0E(activity.getLayoutInflater(), viewGroup, 2131627282);
            int i = 2131231675;
            if (fragment.A1E().A0K() <= 1) {
                i = 2131231814;
            }
            A0E.setImageResource(i);
            C20112A7u A082 = this.A07.A08(this.A03, (C20112A7u) null);
            AnonymousClass3Ma.A1F(A0E, this, A082, fragment, 25);
            this.A00.BiK(A082, AnonymousClass3MY.A0f(), (Integer) null, "payment_confirm_prompt");
        }
    }

    public void Blm(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A09.get();
        if (activity != null) {
            ViewGroup viewGroup2 = viewGroup;
            this.A08.A01(activity, (View.OnClickListener) null, viewGroup2, this.A01, this.A02, (C1418477e) null, this.A06, false, false);
        }
    }

    public void Bus(ViewGroup viewGroup, C20284AEs aEs) {
        Activity activity = (Activity) this.A09.get();
        if (activity != null) {
            activity.getLayoutInflater().inflate(2131625629, viewGroup, true);
        }
    }

    public C20805AZi(Activity activity, C37451pZ r3, AnonymousClass1E7 r4, AnonymousClass8pQ r5, ARR arr, ARR arr2, C1418477e r8, AZ6 az6, C22464B8w b8w, PaymentBottomSheet paymentBottomSheet, A1F a1f) {
        this.A07 = az6;
        this.A08 = a1f;
        this.A09 = AnonymousClass3MW.A0z(activity);
        this.A0A = AnonymousClass3MW.A0z(paymentBottomSheet);
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = arr;
        this.A04 = arr2;
        this.A03 = r5;
        this.A00 = b8w;
    }

    public int BQA() {
        return 2131894029;
    }

    public /* synthetic */ String BQB(C20284AEs aEs) {
        return null;
    }

    public /* synthetic */ String BUs() {
        return null;
    }

    public /* synthetic */ String Bae() {
        return null;
    }

    public /* synthetic */ boolean Bfm() {
        return false;
    }

    public /* synthetic */ boolean CLs(C20284AEs aEs, String str, int i) {
        return false;
    }

    public /* synthetic */ boolean CMH() {
        return false;
    }

    public /* synthetic */ boolean CN3() {
        return true;
    }

    public /* synthetic */ int BR6(C20284AEs aEs, int i) {
        return 0;
    }
}
