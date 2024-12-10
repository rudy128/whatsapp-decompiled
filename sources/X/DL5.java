package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.TextEmojiLabel;

public abstract class DL5 implements C28664EDb {
    public float A00 = 0.0f;
    public int A01 = 0;

    public static C23731Hk A08(Object obj, int i) {
        return C23731Hk.A00(new DWR(obj, i));
    }

    public static void A09(View view, float f) {
        view.setPivotX(f / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
    }

    public static void A0A(Bq8 bq8, float f, int i) {
        float f2 = f;
        int i2 = i;
        Bq8.A01(bq8.A04, bq8.A0D, bq8.A0E, bq8.A0C, f2, i2);
        Bq8.A01(bq8.A09, bq8.A0M, bq8.A0N, bq8.A0L, f2, i2);
        Bq8.A01(bq8.A08, bq8.A0J, bq8.A0K, bq8.A0I, f2, i2);
    }

    public void A0B(int i, float f) {
        if (this instanceof Bq8) {
            Bq8 bq8 = (Bq8) this;
            View view = bq8.A04;
            A09(view, C108945cZ.A03(view));
            TextEmojiLabel textEmojiLabel = bq8.A09;
            A09(textEmojiLabel, C108945cZ.A03(textEmojiLabel));
            TextView textView = bq8.A08;
            A09(textView, C108945cZ.A03(textView));
            return;
        }
        Bq9 bq9 = (Bq9) this;
        View view2 = bq9.A04;
        A09(view2, C108945cZ.A03(view2));
        TextEmojiLabel textEmojiLabel2 = bq9.A09;
        A09(textEmojiLabel2, C108945cZ.A03(textEmojiLabel2));
        TextView textView2 = bq9.A07;
        A09(textView2, C108945cZ.A03(textView2));
        bq9.A08.A0F(new AnonymousClass4N5(0, f, i));
    }

    public void A0C(AppBarLayout appBarLayout, int i) {
        if (!(this instanceof Bq8)) {
            Bq9 bq9 = (Bq9) this;
            View view = bq9.A03;
            int height = view.getHeight();
            bq9.A0E.A00 = null;
            bq9.A0C.A00 = null;
            if (view.getLayoutParams().height != height) {
                view.getLayoutParams().height = height;
            }
            if (i == 2) {
                bq9.A0I.get();
                bq9.A0H.get();
                Bq9.A04(appBarLayout, bq9);
                Bq9.A03(appBarLayout, bq9);
            }
        }
    }

    public void BzS(AppBarLayout appBarLayout, int i) {
        AnonymousClass1DT r1;
        AnonymousClass4N5 r0;
        float A04 = ((float) i) / (C108945cZ.A04(appBarLayout) - ((float) appBarLayout.getMinimumHeight()));
        if (!Float.isNaN(A04) && !Float.isInfinite(A04)) {
            float f = this.A00;
            if (A04 != f) {
                if (f == 0.0f) {
                    A0B(2, f);
                } else if (f == -1.0f) {
                    A0B(1, -f);
                }
                if (A04 == 0.0f) {
                    if (this instanceof Bq8) {
                        Bq8 bq8 = (Bq8) this;
                        Bq8.A00(bq8.A04, bq8.A05, bq8.A0F);
                        TextEmojiLabel textEmojiLabel = bq8.A09;
                        Bq8.A00(textEmojiLabel, bq8.A07, bq8.A0H);
                        textEmojiLabel.setTextSize(0, bq8.A01);
                        C29261bv.A04(textEmojiLabel, 0);
                        TextView textView = bq8.A08;
                        Bq8.A00(textView, bq8.A06, bq8.A0G);
                        C29261bv.A04(textView, 0);
                        textView.setTextSize(0, bq8.A00);
                    } else {
                        Bq9 bq9 = (Bq9) this;
                        View view = bq9.A04;
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        TextEmojiLabel textEmojiLabel2 = bq9.A09;
                        textEmojiLabel2.setScaleX(1.0f);
                        textEmojiLabel2.setScaleY(1.0f);
                        textEmojiLabel2.setTranslationY(0.0f);
                        textEmojiLabel2.setAlpha(1.0f);
                        textEmojiLabel2.setMaxLines(3);
                        textEmojiLabel2.setTextSize(0, bq9.A01);
                        textEmojiLabel2.A0R(textEmojiLabel2.getText());
                        textEmojiLabel2.setLayoutParams(bq9.A06);
                        textEmojiLabel2.setGravity(1);
                        TextView textView2 = bq9.A07;
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setAlpha(1.0f);
                        textView2.setMaxLines(3);
                        C29261bv.A04(textView2, 0);
                        textView2.setLayoutParams(bq9.A05);
                        textView2.setTextSize(0, bq9.A00);
                        textView2.setGravity(1);
                        r1 = bq9.A08;
                        r0 = new AnonymousClass4N5(2, A04, 1);
                    }
                } else {
                    float f2 = -A04;
                    boolean z = this instanceof Bq8;
                    if (A04 == -1.0f) {
                        if (z) {
                            A0A((Bq8) this, f2, i);
                        } else {
                            Bq9 bq92 = (Bq9) this;
                            Bq9.A07(bq92, f2, i);
                            Bq9.A06(appBarLayout, bq92, f2, i);
                            Bq9.A05(appBarLayout, bq92, f2, i);
                            r1 = bq92.A08;
                            r0 = new AnonymousClass4N5(2, f2, 2);
                        }
                    } else if (z) {
                        A0A((Bq8) this, f2, i);
                    } else {
                        Bq9 bq93 = (Bq9) this;
                        Bq9.A07(bq93, f2, i);
                        Bq9.A06(appBarLayout, bq93, f2, i);
                        Bq9.A05(appBarLayout, bq93, f2, i);
                        r1 = bq93.A08;
                        r0 = new AnonymousClass4N5(1, f2, 1);
                    }
                }
                r1.A0F(r0);
            }
            if (A04 == 0.0f) {
                A0C(appBarLayout, 1);
            } else if (A04 == -1.0f) {
                A0C(appBarLayout, 2);
            }
            this.A00 = A04;
            this.A01 = i;
        }
    }
}
