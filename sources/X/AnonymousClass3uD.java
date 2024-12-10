package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.3uD  reason: invalid class name */
public class AnonymousClass3uD extends C78173sM {
    public AnonymousClass1VW A00;
    public C27131Uv A01;
    public final ImageView A02 = AnonymousClass3MW.A0H(this, 2131436123);
    public final View A03;
    public final View A04 = findViewById(2131429544);
    public final View A05 = findViewById(2131432139);
    public final View A06;
    public final View A07 = findViewById(2131434181);
    public final View A08;
    public final View A09;
    public final View A0A = findViewById(2131436129);
    public final FrameLayout A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F = C17880vN.A0E(this, 2131429541);
    public final TextView A0G = C17880vN.A0E(this, 2131432138);
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final ThumbnailButton A0J;
    public final C37451pZ A0K;
    public final WaMapView A0L;

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A00();
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    private void A00() {
        long A0I2;
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int A022;
        Resources resources;
        int i;
        int dimensionPixelSize3;
        AnonymousClass1E7 A012;
        AnonymousClass219 r10 = (AnonymousClass219) this.A0I;
        View view2 = this.A0A;
        View.OnLongClickListener onLongClickListener = this.A2t;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0I;
        C825248h.A00(textEmojiLabel, this, r10, 41);
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A04;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A09;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view4);
            A0B2.topMargin = 0;
            A0B2.bottomMargin = 0;
        }
        this.A0B.setVisibility(0);
        long A013 = AnonymousClass11P.A01(this.A0u);
        C27131Uv r1 = this.A01;
        C17960vV.A07(r1);
        boolean z = r10.A0v.A02;
        if (z) {
            A0I2 = r1.A0J(r10);
        } else {
            A0I2 = r1.A0I(r10);
        }
        boolean A023 = C88254Yy.A02(this.A0u, r10, A0I2);
        boolean A0N = this.A0U.A0N();
        View view5 = this.A06;
        if (view5 != null) {
            view5.setMinimumHeight(getResources().getDimensionPixelSize(2131167694));
        }
        if (!A023 || A0N) {
            this.A0C.setVisibility(8);
            imageView = this.A0D;
            imageView.setVisibility(8);
            imageView2 = this.A0E;
            imageView2.setVisibility(8);
        } else {
            this.A0C.setVisibility(0);
            imageView = this.A0D;
            imageView.setVisibility(0);
            imageView2 = this.A0E;
            imageView2.setVisibility(0);
        }
        imageView.clearAnimation();
        imageView2.clearAnimation();
        if (A023 && A0I2 > A013 && !A0N) {
            Boolean bool = C17970vW.A03;
            AlphaAnimation A0Q = C72463Mc.A0Q();
            C72463Mc.A17(A0Q, 1000);
            A0Q.setRepeatCount(-1);
            A0Q.setRepeatMode(2);
            C74613c2.A00(A0Q, this, 5);
            AlphaAnimation A0Q2 = C72463Mc.A0Q();
            A0Q2.setDuration(1000);
            A0Q2.setStartOffset(300);
            A0Q2.setInterpolator(new DecelerateInterpolator());
            A0Q2.setRepeatCount(-1);
            A0Q2.setRepeatMode(2);
            imageView.startAnimation(A0Q);
            imageView2.startAnimation(A0Q2);
        }
        Context A042 = AnonymousClass3MX.A04(this.A05, this, 0);
        AnonymousClass11S r2 = this.A0U;
        AnonymousClass689 r12 = this.A0G;
        C17960vV.A07(r12);
        View.OnClickListener A002 = C88254Yy.A00(A042, r2, r12, r10, A023);
        if (!A023 || A0N) {
            view = this.A08;
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
        } else {
            view = this.A08;
            view.setVisibility(0);
            textEmojiLabel.setVisibility(0);
        }
        view2.setOnClickListener(A002);
        String A014 = C88254Yy.A01(getContext(), this.A0U, this.A0u, this.A0D, this.A01, r10, A023);
        TextView textView = this.A0G;
        TextView textView2 = textView;
        textView.setText(A014);
        textView.setTextColor(getSecondaryTextColor());
        View view6 = this.A03;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        WaMapView waMapView = this.A0L;
        WaMapView waMapView2 = waMapView;
        AnonymousClass689 r122 = this.A0G;
        C17960vV.A07(r122);
        waMapView.A03(r122, r10, A023);
        if (waMapView2.getVisibility() == 0) {
            ThumbnailButton thumbnailButton = this.A0J;
            AnonymousClass11S r13 = this.A0U;
            AnonymousClass1VW r14 = this.A00;
            C17960vV.A07(r14);
            C37451pZ r123 = this.A0K;
            C25181Nf r15 = this.A0w;
            if (z) {
                A012 = AnonymousClass3MZ.A0Q(r13);
            } else {
                UserJid A0I3 = r10.A0I();
                if (A0I3 != null) {
                    A012 = r15.A01(A0I3);
                } else {
                    r14.A09(thumbnailButton, 2131231047);
                }
            }
            r123.A07(thumbnailButton, A012);
        }
        if (!TextUtils.isEmpty(r10.A03)) {
            setMessageText(r10.A03, this.A0H, r10);
            view.setVisibility(C72453Mb.A07(A023 ? 1 : 0));
            i = 2131166203;
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166203);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166205);
            A022 = AnonymousClass3Ma.A02(this, 2131166203);
            resources = getResources();
        } else {
            setMessageText("", this.A0H, r10);
            view.setVisibility(8);
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166203);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166206);
            A022 = AnonymousClass3Ma.A02(this, 2131166203);
            resources = getResources();
            i = 2131166204;
        }
        textEmojiLabel.setPadding(dimensionPixelSize, dimensionPixelSize2, A022, resources.getDimensionPixelSize(i));
        if (view4 != null) {
            boolean isEmpty = TextUtils.isEmpty(r10.A03);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (isEmpty) {
                layoutParams.addRule(11);
                layoutParams.addRule(8, 2131432137);
                view4.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.A06;
                C72463Mc.A12(viewGroup);
                dimensionPixelSize3 = AnonymousClass3MX.A00(getResources(), 2131166207, viewGroup.getMeasuredWidth());
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(3, 2131432137);
                view4.setLayoutParams(layoutParams);
                dimensionPixelSize3 = getResources().getDimensionPixelSize(2131166207);
            }
            boolean A1b = AnonymousClass3MY.A1b(this.A0D);
            ViewGroup.MarginLayoutParams A0B3 = AnonymousClass3MW.A0B(textView2);
            if (A1b) {
                A0B3.rightMargin = dimensionPixelSize3;
            } else {
                A0B3.leftMargin = dimensionPixelSize3;
            }
        }
        TextView textView3 = this.A0F;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        int i2 = r10.A02;
        if (i2 == 1) {
            View view7 = this.A07;
            if (z) {
                view7.setVisibility(0);
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                view2.setOnClickListener((View.OnClickListener) null);
            } else {
                view7.setVisibility(0);
            }
        } else if (!z || i2 == 2 || !A023) {
            View view8 = this.A07;
            if (view8 != null) {
                view8.setVisibility(8);
            }
        } else {
            View view9 = this.A07;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            if (textView3 != null && !this.A0U.A0N()) {
                textView3.setVisibility(0);
                textView3.setText(2131895332);
                C825048f.A00(textView3, this, 7);
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
            if (!this.A0U.A0N()) {
                C825048f.A00(view2, this, 7);
            }
        }
        if (waMapView2.getVisibility() == 8) {
            this.A1S.A0E(this.A02, r10, new C98114qb(this, 4));
        }
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public void A2I(AnonymousClass1BI r4) {
        AnonymousClass206 r1 = this.A0I;
        if (!r1.A0v.A02) {
            UserJid A0I2 = r1.A0I();
            if (r4.equals(A0I2)) {
                this.A0K.A07(this.A0J, this.A0w.A01(A0I2));
            }
        } else if (this.A0U.A0O(r4)) {
            this.A0K.A07(this.A0J, AnonymousClass3MZ.A0Q(this.A0U));
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A00();
        }
    }

    public AnonymousClass219 getFMessage() {
        return (AnonymousClass219) this.A0I;
    }

    public Drawable getLiveLocationFrameForegroundDrawable() {
        return this.A09.BS0(AnonymousClass00R.A00, C72453Mb.A05(this.A0I.A0v.A02 ? 1 : 0), isPressed());
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass219);
        this.A0I = r2;
    }

    public AnonymousClass3uD(Context context, C37451pZ r5, C108875cR r6, AnonymousClass219 r7) {
        super(context, r6, r7);
        A1M();
        this.A0K = r5;
        FrameLayout frameLayout = (FrameLayout) findViewById(2131432277);
        this.A0B = frameLayout;
        this.A0J = (ThumbnailButton) findViewById(2131429463);
        this.A03 = findViewById(2131429464);
        this.A06 = findViewById(2131432678);
        this.A09 = findViewById(2131436057);
        this.A08 = findViewById(2131428438);
        this.A0I = AnonymousClass3MX.A0W(this, 2131435805);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(this, 2131432129);
        this.A0H = A0W;
        this.A0C = AnonymousClass3MW.A0H(this, 2131432133);
        this.A0D = AnonymousClass3MW.A0H(this, 2131432134);
        this.A0E = AnonymousClass3MW.A0H(this, 2131432135);
        this.A0L = (WaMapView) findViewById(2131432278);
        A0W.setLongClickable(C72483Me.A1A(A0W, this.A0F));
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
        A00();
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        FrameLayout frameLayout = this.A0B;
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
    }

    public int getMainChildMaxWidth() {
        if (C79103uS.A1H(this)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166243);
    }

    public int getCenteredLayoutId() {
        return 2131624856;
    }

    public int getIncomingLayoutId() {
        return 2131624856;
    }

    public int getOutgoingLayoutId() {
        return 2131624858;
    }
}
