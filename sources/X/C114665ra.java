package X;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.5ra  reason: invalid class name and case insensitive filesystem */
public class C114665ra extends AnonymousClass3RR implements C1601487h {
    public int A00;
    public Handler A01;
    public View A02;
    public TextView A03;
    public ConstraintLayout A04;
    public RecyclerView A05;
    public ShimmerFrameLayout A06;
    public AEX A07;
    public C112125ky A08;
    public WDSButton A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final C132646nG A0E;
    public final AnonymousClass72F A0F;
    public final PaymentAmountInputField A0G;
    public final AQ4 A0H;
    public final C188639hk A0I;
    public final List A0J = AnonymousClass000.A13();
    public final AnonymousClass1YQ A0K;

    public C114665ra(Activity activity, ImageView imageView, TextView textView, TextView textView2, TextView textView3, AnonymousClass1YQ r14, AnonymousClass190 r15, AnonymousClass5YX r16, AnonymousClass11C r17, C19830z4 r18, C132646nG r19, AnonymousClass72F r20, PaymentAmountInputField paymentAmountInputField, AQ4 aq4, C188639hk r23, AnonymousClass1L4 r24) {
        super(activity, r15, r16, r17, r18, r24);
        this.A0F = r20;
        this.A0E = r19;
        this.A0K = r14;
        this.A0H = aq4;
        this.A0G = paymentAmountInputField;
        this.A0B = textView;
        this.A0C = textView2;
        this.A0I = r23;
        this.A0D = textView3;
        this.A0A = imageView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (java.lang.System.currentTimeMillis() < r9.A0W("payment_backgrounds_backoff_timestamp")) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C114665ra r8, boolean r9) {
        /*
            androidx.constraintlayout.widget.ConstraintLayout r1 = r8.A04
            r0 = 8
            r1.setVisibility(r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r8.A06
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r8.A03
            r0 = 2131891795(0x7f121653, float:1.941832E38)
            r1.setText(r0)
            X.72F r5 = r8.A0F
            X.7Kh r4 = new X.7Kh
            r4.<init>(r8)
            X.6wW r3 = r5.A0A
            if (r9 != 0) goto L_0x0051
            X.0z4 r9 = r3.A01
            java.lang.String r8 = "payment_backgrounds_last_fetch_timestamp"
            long r6 = r9.A0W(r8)
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            long r0 = X.C138096wW.A02
            boolean r0 = r9.A2b(r8, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            long r6 = java.lang.System.currentTimeMillis()
            long r1 = r9.A0W(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
        L_0x0044:
            X.10I r2 = r5.A0C
            r1 = 36
            X.3Bz r0 = new X.3Bz
            r0.<init>(r5, r4, r1)
            r2.CGF(r0)
            return
        L_0x0051:
            X.11E r0 = r3.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0044
            X.0z4 r8 = r3.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r8)
            java.lang.String r7 = "payment_background_backoff_attempt"
            int r0 = X.C17890vO.A00(r0, r7)
            int r6 = r0 + 1
            r2 = 720(0x2d0, double:3.557E-321)
            r0 = 1
            X.1Kj r9 = new X.1Kj
            r9.<init>(r0, r2)
            long r0 = (long) r6
            r9.A03(r0)
            long r2 = r9.A01()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            X.C17900vP.A0M(r8, r7, r6)
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            r8.A1q(r0, r2)
            X.6oI r2 = r5.A09
            r0 = 0
            X.7G3 r1 = new X.7G3
            r1.<init>(r4, r5, r0)
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114665ra.A03(X.5ra, boolean):void");
    }

    public void C8Z(AEX aex) {
        this.A07 = aex;
        ImageView imageView = this.A0A;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        AEX aex2 = this.A07;
        if (aex2 != null) {
            layoutParams.height = (int) (((float) layoutParams.width) / (((float) aex2.A0D) / ((float) aex2.A09)));
            String str = aex2.A01;
            if (!TextUtils.isEmpty(str)) {
                imageView.setContentDescription(str);
            }
            this.A0E.A00(imageView, this.A07, layoutParams.width, layoutParams.height);
            PaymentAmountInputField paymentAmountInputField = this.A0G;
            paymentAmountInputField.setTextColor(this.A07.A0C);
            int i = this.A07.A0C;
            paymentAmountInputField.setHintTextColor(Color.argb((int) (((float) Color.alpha(i)) * 0.3f), (int) ((float) Color.red(i)), (int) ((float) Color.green(i)), (int) ((float) Color.blue(i))));
            this.A0B.setTextColor(this.A07.A0C);
            this.A0C.setTextColor(this.A07.A0C);
            TextView textView = this.A0D;
            textView.setTextColor(this.A07.A0B);
            textView.setBackgroundColor(this.A07.A0A);
        } else {
            imageView.setImageResource(2131232784);
            PaymentAmountInputField paymentAmountInputField2 = this.A0G;
            C188639hk r10 = this.A0I;
            C29261bv.A08(paymentAmountInputField2, r10.A00);
            TextView textView2 = this.A0B;
            Pair pair = r10.A02;
            C29261bv.A08(textView2, C108965cb.A01(pair));
            TextView textView3 = this.A0C;
            int[] iArr = (int[]) pair.second;
            textView3.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            Pair pair2 = r10.A01;
            C29261bv.A08(textView3, C108965cb.A01(pair2));
            int[] iArr2 = (int[]) pair2.second;
            textView3.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            TextView textView4 = this.A0D;
            Activity activity = this.A03;
            textView4.setTextColor(AnonymousClass3Ma.A01(activity, activity.getResources(), 2130970705, 2131102112));
            textView4.setBackgroundColor(0);
        }
        imageView.setTag(2131435108, this.A07);
    }

    public void dismiss() {
        this.A0K.A05(true);
        AQ4 aq4 = this.A0H;
        aq4.A03.setVisibility(0);
        View view = aq4.A02;
        if (view != null) {
            view.setVisibility(0);
        }
        super.dismiss();
    }

    public static void A02(C114665ra r6) {
        r6.A07();
        if (r6.A02 == null) {
            Activity activity = r6.A03;
            LinearLayout linearLayout = new LinearLayout(activity);
            View inflate = activity.getLayoutInflater().inflate(2131625291, linearLayout, true);
            r6.A02 = inflate;
            AnonymousClass1HF.A06(inflate, 2131429138).setOnClickListener(new AFQ(r6, 34));
            r6.A03 = AnonymousClass3MW.A0J(r6.A02, 2131436111);
            r6.A05 = C108945cZ.A0U(r6.A02, 2131430753);
            C112125ky r1 = new C112125ky(r6.A0E, r6.A0F, r6);
            r6.A08 = r1;
            r6.A05.setAdapter(r1);
            r6.A06 = (ShimmerFrameLayout) AnonymousClass1HF.A06(r6.A02, 2131430750);
            ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass1HF.A06(r6.A02, 2131428023);
            r6.A04 = constraintLayout;
            r6.A09 = AnonymousClass3MW.A0q(constraintLayout, 2131434674);
            r6.setContentView(linearLayout);
            r6.setTouchable(true);
            r6.setOutsideTouchable(true);
            r6.setInputMethodMode(2);
            r6.setAnimationStyle(0);
            r6.setBackgroundDrawable(new ColorDrawable(AnonymousClass3Ma.A01(activity, activity.getResources(), 2130970830, 2131102245)));
            r6.A02.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            r6.A00 = r6.A02.getMeasuredHeight();
            r6.A01 = new Handler();
            r6.setTouchInterceptor(new C1422478s(7));
        }
        r6.setHeight(r6.A00);
        r6.setWidth(-1);
        AnonymousClass5YX r4 = r6.A04;
        r4.setKeyboardPopup(r6);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r4;
        if (keyboardPopupLayout.A09) {
            View view = (View) r4;
            AnonymousClass793.A00(view.getViewTreeObserver(), r6, 15);
            keyboardPopupLayout.A09 = false;
            view.requestLayout();
        } else if (!r6.isShowing()) {
            r6.showAtLocation((View) r4, 48, 0, 1000000);
            AQ4 aq4 = r6.A0H;
            aq4.A03.setVisibility(8);
            View view2 = aq4.A02;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        r6.A0K.A04(true);
        A03(r6, false);
    }

    public void A0D() {
        if (!isShowing()) {
            super.A0D();
            AQ4 aq4 = this.A0H;
            if (AnonymousClass1L4.A00(aq4.A0B)) {
                AnonymousClass5YX r7 = this.A04;
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r7;
                keyboardPopupLayout.A09 = true;
                InputMethodManager A0N = this.A05.A0N();
                C17960vV.A07(A0N);
                if (!A0N.hideSoftInputFromWindow(aq4.A0B.getWindowToken(), 0, new AnonymousClass3NV(C17890vO.A0D(), new C21427Aju(this, 23), this.A09))) {
                    keyboardPopupLayout.A09 = false;
                    ((View) r7).requestLayout();
                    return;
                }
                return;
            }
            A02(this);
        }
    }

    public int A0B(int i) {
        return this.A00;
    }
}
