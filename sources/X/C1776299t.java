package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.99t  reason: invalid class name and case insensitive filesystem */
public class C1776299t extends AnonymousClass4VZ {
    public static int A0E;
    public static String A0F;
    public static String A0G;
    public static String A0H;
    public ObjectAnimator A00;
    public ObjectAnimator A01;
    public ObjectAnimator A02;
    public ObjectAnimator A03;
    public TextView A04;
    public TextView A05;
    public SearchView A06;
    public final View A07;
    public final AccelerateInterpolator A08 = new AccelerateInterpolator();
    public final DecelerateInterpolator A09 = new DecelerateInterpolator();
    public final int[] A0A;
    public final int[] A0B;
    public final Activity A0C;
    public final Toolbar A0D;

    public void A02() {
        Activity activity = this.A0C;
        A0G = activity.getString(2131887066);
        A0H = "";
        A0F = "";
        View view = this.A07;
        this.A04 = AnonymousClass3MW.A0J(view, 2131434895);
        this.A05 = AnonymousClass3MW.A0J(view, 2131434896);
        SearchView searchView = (SearchView) AnonymousClass1HF.A06(view, 2131434976);
        this.A06 = searchView;
        if (TextUtils.equals(searchView.getQueryHint(), activity.getString(2131895489))) {
            this.A06.setQueryHint("");
        }
        C72463Mc.A0y(activity, this.A04, 2130970055, 2131101191);
        C72463Mc.A0y(activity, this.A05, 2130970055, 2131101191);
        this.A04.setHint("");
        this.A05.setHint("");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A05, "translationY", new float[]{0.0f, 50.0f});
        this.A03 = ofFloat;
        ofFloat.setDuration(300);
        this.A03.setStartDelay(700);
        this.A03.addListener(new C161018Ba(this, 1));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A04, "translationY", new float[]{-50.0f, 0.0f});
        this.A01 = ofFloat2;
        ofFloat2.setDuration(300);
        this.A01.setStartDelay(700);
        this.A01.addListener(new C161018Ba(this, 2));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A04, "alpha", new float[]{0.0f, 1.0f});
        this.A00 = ofFloat3;
        ofFloat3.setInterpolator(this.A08);
        this.A00.setDuration(300);
        this.A00.setStartDelay(700);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A05, "alpha", new float[]{1.0f, 0.0f});
        this.A02 = ofFloat4;
        ofFloat4.setInterpolator(this.A09);
        this.A02.setDuration(300);
        this.A02.setStartDelay(700);
    }

    public C1776299t(Activity activity, View view, C16560sd r7, Toolbar toolbar, C18000vb r9) {
        super(activity, view, r7, toolbar, r9);
        this.A0D = toolbar;
        this.A07 = view;
        this.A0C = activity;
        int[] iArr = new int[2];
        this.A0B = iArr;
        iArr[0] = -1;
        int[] iArr2 = new int[2];
        this.A0A = iArr2;
        iArr2[0] = -1;
    }

    public void A01() {
        if (!A0C()) {
            this.A0D.setVisibility(0);
        }
    }

    public int A07() {
        return 2131624362;
    }
}
