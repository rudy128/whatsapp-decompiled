package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;

public class Bq9 extends DL5 {
    public final float A00;
    public final float A01;
    public final Resources A02;
    public final View A03;
    public final View A04;
    public final ViewGroup.LayoutParams A05;
    public final ViewGroup.MarginLayoutParams A06;
    public final TextView A07;
    public final AnonymousClass1DT A08 = new AnonymousClass1DT();
    public final TextEmojiLabel A09;
    public final C23731Hk A0A;
    public final C23731Hk A0B;
    public final C23731Hk A0C;
    public final C23731Hk A0D;
    public final C23731Hk A0E;
    public final C23731Hk A0F;
    public final C23731Hk A0G;
    public final C23731Hk A0H;
    public final C23731Hk A0I;
    public final TextView A0J;
    public final TextEmojiLabel A0K;
    public final C18000vb A0L;
    public final C23731Hk A0M;
    public final C23731Hk A0N;
    public final C23731Hk A0O;
    public final C23731Hk A0P;
    public final C23731Hk A0Q;
    public final C23731Hk A0R;

    public Bq9(View view, View view2, TextView textView, TextView textView2, TextEmojiLabel textEmojiLabel, TextEmojiLabel textEmojiLabel2, C18000vb r15) {
        this.A0L = r15;
        this.A03 = (View) view2.getParent();
        this.A02 = view2.getResources();
        this.A04 = view2;
        this.A09 = textEmojiLabel;
        this.A0K = textEmojiLabel2;
        this.A07 = textView;
        this.A0J = textView2;
        this.A06 = AnonymousClass3MW.A0B(textEmojiLabel);
        this.A01 = textEmojiLabel.getTextSize();
        this.A05 = textView.getLayoutParams();
        this.A00 = textView.getTextSize();
        this.A0A = DWQ.A00(this, view, 0);
        this.A0G = DWQ.A00(this, view2, 1);
        this.A0B = DWQ.A00(this, view2, 2);
        this.A0M = C23731Hk.A00(new DWO(view2, view, this, r15, 0));
        this.A0N = DWQ.A00(this, view2, 3);
        this.A0I = DL5.A08(textEmojiLabel, 31);
        this.A0F = DL5.A08(this, 32);
        this.A0E = C23731Hk.A00(new DWM(view, this, r15, 0));
        this.A0Q = DL5.A08(this, 33);
        this.A0R = DL5.A08(this, 34);
        this.A0H = DL5.A08(textView, 35);
        this.A0D = DL5.A08(this, 36);
        this.A0C = C23731Hk.A00(new DWM(view, this, r15, 1));
        this.A0O = DL5.A08(this, 37);
        this.A0P = DL5.A08(this, 38);
    }

    public static void A05(AppBarLayout appBarLayout, Bq9 bq9, float f, int i) {
        int i2 = (((double) f) > 0.5d ? 1 : (((double) f) == 0.5d ? 0 : -1));
        TextView textView = bq9.A0J;
        if (i2 < 0) {
            textView.setVisibility(8);
            float A032 = 1.0f - (BE9.A03(bq9.A0O) * f);
            TextView textView2 = bq9.A07;
            A02(textView2, C108945cZ.A03(textView2) / 2.0f, C108945cZ.A04(textView2) / 2.0f, 0.0f, ((float) (-i)) + (BE9.A03(bq9.A0P) * f), A032);
            textView2.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        textView.setVisibility(0);
        TextView textView3 = bq9.A07;
        textView3.setAlpha(0.0f);
        A03(appBarLayout, bq9);
        C18000vb r4 = bq9.A0L;
        int i3 = 51;
        if (AnonymousClass3MW.A1Z(r4)) {
            i3 = 53;
        }
        textView.setGravity(i3);
        int i4 = -1;
        if (AnonymousClass3MW.A1Z(r4)) {
            i4 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textView.setTranslationX((((float) (i4 * textView3.getLeft())) / 4.0f) * (1.0f - f2));
        textView.setTranslationY((float) (-i));
        textView.setAlpha(f2);
    }

    public static void A06(AppBarLayout appBarLayout, Bq9 bq9, float f, int i) {
        int i2 = (((double) f) > 0.5d ? 1 : (((double) f) == 0.5d ? 0 : -1));
        TextEmojiLabel textEmojiLabel = bq9.A0K;
        if (i2 < 0) {
            textEmojiLabel.setVisibility(8);
            float A032 = 1.0f - (BE9.A03(bq9.A0Q) * f);
            TextEmojiLabel textEmojiLabel2 = bq9.A09;
            A02(textEmojiLabel2, C108945cZ.A03(textEmojiLabel2) / 2.0f, C108945cZ.A04(textEmojiLabel2) / 2.0f, 0.0f, ((float) (-i)) + (BE9.A03(bq9.A0R) * f), A032);
            textEmojiLabel2.setAlpha(1.0f - (f * 2.0f));
            return;
        }
        textEmojiLabel.setVisibility(0);
        bq9.A09.setAlpha(0.0f);
        A04(appBarLayout, bq9);
        C18000vb r4 = bq9.A0L;
        int i3 = 51;
        if (AnonymousClass3MW.A1Z(r4)) {
            i3 = 53;
        }
        textEmojiLabel.setGravity(i3);
        int i4 = -1;
        if (AnonymousClass3MW.A1Z(r4)) {
            i4 = 1;
        }
        float f2 = (f - 0.5f) * 2.0f;
        textEmojiLabel.setTranslationX((((float) (i4 * textEmojiLabel.getLeft())) / 4.0f) * (1.0f - f2));
        textEmojiLabel.setTranslationY((float) (-i));
        textEmojiLabel.setAlpha(f2);
    }

    private ViewGroup.MarginLayoutParams A00(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A06;
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            return new RelativeLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof BI7) {
            return new BI7(i, i2);
        }
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        throw AnonymousClass000.A0n("Title view parent is of an unsupported type. Provide a custom LayoutParams factory.");
    }

    private void A01(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams, AppBarLayout appBarLayout) {
        if (AnonymousClass3MY.A1b(this.A0L)) {
            marginLayoutParams.leftMargin = rect.left;
        } else {
            marginLayoutParams.rightMargin = appBarLayout.getWidth() - rect.right;
        }
        marginLayoutParams.topMargin = rect.top;
    }

    public static void A03(AppBarLayout appBarLayout, Bq9 bq9) {
        Rect rect = (Rect) bq9.A0C.get();
        ViewGroup.MarginLayoutParams A002 = bq9.A00(rect.width(), rect.height());
        bq9.A01(rect, A002, appBarLayout);
        TextView textView = bq9.A0J;
        if (textView.getWidth() != rect.width()) {
            textView.setLayoutParams(A002);
        }
    }

    public static void A04(AppBarLayout appBarLayout, Bq9 bq9) {
        Rect rect = (Rect) bq9.A0E.get();
        ViewGroup.MarginLayoutParams A002 = bq9.A00(rect.width(), rect.height());
        bq9.A01(rect, A002, appBarLayout);
        TextEmojiLabel textEmojiLabel = bq9.A0K;
        if (textEmojiLabel.getWidth() != rect.width()) {
            textEmojiLabel.setLayoutParams(A002);
        }
    }

    public static void A07(Bq9 bq9, float f, int i) {
        A02(bq9.A04, 0.0f, 0.0f, BE9.A03(bq9.A0M) * f, ((float) (-i)) + (BE9.A03(bq9.A0N) * f), 1.0f - (BE9.A03(bq9.A0G) * f));
    }

    public static void A02(View view, float f, float f2, float f3, float f4, float f5) {
        view.setScaleX(f5);
        view.setScaleY(f5);
        float f6 = 1.0f - f5;
        view.setTranslationX(f3 - (((C108945cZ.A03(view) / 2.0f) - f) * f6));
        view.setTranslationY(f4 - (((C108945cZ.A04(view) / 2.0f) - f2) * f6));
    }
}
