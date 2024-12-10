package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public class Bq8 extends DL5 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Resources A03;
    public final View A04;
    public final ViewGroup.LayoutParams A05;
    public final ViewGroup.LayoutParams A06;
    public final ViewGroup.LayoutParams A07;
    public final TextView A08;
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
    public final C23731Hk A0J;
    public final C23731Hk A0K;
    public final C23731Hk A0L;
    public final C23731Hk A0M;
    public final C23731Hk A0N;

    public Bq8(View view, View view2, TextView textView, TextEmojiLabel textEmojiLabel, C18000vb r27) {
        View view3 = view2;
        Resources resources = view3.getResources();
        this.A03 = resources;
        this.A04 = view3;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        this.A09 = textEmojiLabel2;
        TextView textView2 = textView;
        this.A08 = textView2;
        this.A07 = textEmojiLabel2.getLayoutParams();
        this.A01 = textEmojiLabel2.getTextSize();
        this.A06 = textView2.getLayoutParams();
        this.A05 = view3.getLayoutParams();
        this.A00 = textView2.getTextSize();
        this.A02 = resources.getDimensionPixelSize(2131169038);
        this.A0F = DL5.A08(view3, 41);
        this.A0H = DL5.A08(textEmojiLabel2, 41);
        this.A0G = DL5.A08(textView2, 41);
        C23731Hk A082 = DL5.A08(this, 39);
        this.A0B = A082;
        C23731Hk A083 = DL5.A08(this, 40);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165995);
        View view4 = view;
        C23731Hk A002 = DWQ.A00(view3, C23731Hk.A00(new DWP(view4, dimensionPixelSize, 0)), 5);
        this.A0C = A002;
        this.A0A = DWQ.A00(view3, A002, 4);
        C18000vb r12 = r27;
        C18000vb r19 = r12;
        this.A0D = C23731Hk.A00(new DWO(view3, view4, this, r19, 1));
        this.A0E = C23731Hk.A00(new DWP(view3, dimensionPixelSize, 1));
        C23731Hk A003 = DWQ.A00(textEmojiLabel2, A082, 5);
        this.A0L = A003;
        this.A0N = C23731Hk.A00(new DWP(textEmojiLabel2, dimensionPixelSize));
        C23731Hk A004 = DWQ.A00(textEmojiLabel2, A003, 4);
        C23731Hk A005 = DWQ.A00(textView2, A083, 5);
        this.A0I = A005;
        C23731Hk A006 = DWQ.A00(textView2, A005, 4);
        this.A0M = C23731Hk.A00(new C70973Df(view4, textEmojiLabel2, this, r12, A004, 0));
        this.A0J = C23731Hk.A00(new C70973Df(view4, textView2, this, r19, A006, 0));
        this.A0K = C23731Hk.A00(new DWL(textView2, this, dimensionPixelSize));
    }

    public static void A00(View view, ViewGroup.LayoutParams layoutParams, C23731Hk r4) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setLayoutParams(layoutParams);
        view.setX((float) ((Rect) r4.get()).left);
        view.setY((float) ((Rect) r4.get()).top);
    }

    public static void A01(View view, C23731Hk r7, C23731Hk r8, C23731Hk r9, float f, int i) {
        float A032 = 1.0f - (BE9.A03(r9) * f);
        view.setScaleX(A032);
        view.setScaleY(A032);
        float A033 = ((float) (-i)) + (BE9.A03(r8) * f);
        float f2 = 1.0f - A032;
        view.setTranslationX((BE9.A03(r7) * f) - ((C108945cZ.A03(view) / 2.0f) * f2));
        view.setTranslationY(A033 - ((C108945cZ.A04(view) / 2.0f) * f2));
    }
}
