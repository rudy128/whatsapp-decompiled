package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.6Nr  reason: invalid class name */
public class AnonymousClass6Nr extends C115075tM {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public String A03;
    public final AnonymousClass74k A04;

    private void A01(String str) {
        String str2;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(str);
            this.A02.setVisibility(0);
        }
        ImageView imageView = this.A01;
        if (imageView != null && (str2 = this.A03) != null) {
            this.A04.A01((Rect) null, imageView, (C138146wb) null, str2, str2);
            this.A01.setVisibility(0);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_logo", this.A03);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public AnonymousClass6Nr(C18000vb r1, WaBloksActivity waBloksActivity, AnonymousClass74k r3) {
        super(r1, waBloksActivity);
        this.A04 = r3;
    }

    public void A03(Intent intent, Bundle bundle) {
        A02().A0S("");
        ViewGroup viewGroup = (ViewGroup) AnonymousClass3MX.A09(LayoutInflater.from(A02().A0A()), (ViewGroup) AnonymousClass3MY.A0H(this.A03, 2131428189), 2131624278);
        this.A00 = viewGroup;
        this.A01 = AnonymousClass3MW.A0H(viewGroup, 2131428190);
        TextView A0E = C17880vN.A0E(this.A00, 2131428191);
        this.A02 = A0E;
        C17960vV.A05(this.A00);
        C17960vV.A05(this.A01);
        C17960vV.A05(A0E);
        AnonymousClass1Y5.A0A(A0E, true);
        if (bundle != null) {
            this.A03 = bundle.getString("bk_navigation_bar_logo");
            A01(this.A01);
        }
        A02().A0G();
        A02().A0P(this.A00);
    }

    public void A04(AnonymousClass86W r4) {
        try {
            DFL dfl = new C126766dG(r4.BM2()).A00;
            this.A01 = dfl.A0D(36);
            String str = "";
            String A0D = dfl.A0D(45);
            if (A0D != null) {
                str = A0D;
            }
            this.A03 = str;
            A01(this.A01);
        } catch (ClassCastException e) {
            C17900vP.A0X(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A10());
        }
    }
}
