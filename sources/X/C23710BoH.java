package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: X.BoH  reason: case insensitive filesystem */
public class C23710BoH extends BV6 {
    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        int i;
        int i2;
        int i3;
        GradientDrawable gradientDrawable;
        SeekBar seekBar = (SeekBar) view;
        DOZ doz2 = doz;
        DFL dfl2 = dfl;
        CUL cul = (CUL) C26272CwJ.A04(doz, dfl2);
        if (cul != null) {
            cul.A0C = seekBar;
            seekBar.setIndeterminate(false);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setEnabled(dfl2.A0I(50, true));
            seekBar.setMax(Integer.MAX_VALUE);
            seekBar.setProgress(cul.A01);
            if (dfl2.A06.indexOfKey(40) >= 0 || ((SparseArray) dfl2.A07.A00()).indexOfKey(40) >= 0) {
                seekBar.setProgress((int) (dfl2.A03(40, 0.0f) * 2.14748365E9f));
            } else if (!cul.A0F) {
                seekBar.setProgress(cul.A0G);
                cul.A0F = true;
            }
            E8A A0A = dfl2.A0A(38);
            E8A A0A2 = dfl2.A0A(42);
            E8A A0A3 = dfl2.A0A(41);
            if (cul.A08 == null) {
                cul.A08 = seekBar.getThumb();
                LayerDrawable layerDrawable = (LayerDrawable) seekBar.getProgressDrawable();
                if (layerDrawable != null) {
                    GradientDrawable A00 = C25901CoD.A00(layerDrawable.findDrawableByLayerId(16908288));
                    GradientDrawable A002 = C25901CoD.A00(layerDrawable.findDrawableByLayerId(16908301));
                    GradientDrawable A003 = C25901CoD.A00(layerDrawable.findDrawableByLayerId(16908303));
                    if (A00 == null || A002 == null || A003 == null) {
                        throw AnonymousClass000.A0n("Track is not using the default Drawable");
                    }
                    cul.A09 = A00;
                    cul.A0A = A002;
                    cul.A0B = A003;
                    Context context = doz.A00;
                    DisplayMetrics A08 = C108965cb.A08(context);
                    Resources.Theme theme = context.getTheme();
                    cul.A03 = (int) ((float) BE6.A04(18.0f, ((float) A08.densityDpi) / 160.0f));
                    cul.A02 = BEA.A07(theme, 16843818, -16776961);
                    cul.A05 = (int) ((float) BE6.A04(2.0f, ((float) A08.densityDpi) / 160.0f));
                    cul.A04 = BEA.A07(theme, 16843818, -16776961);
                    cul.A06 = BEA.A07(theme, 16843817, -7829368);
                    int i4 = cul.A03;
                    int i5 = cul.A02;
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(1);
                    gradientDrawable2.setSize(i4, i4);
                    gradientDrawable2.setColor(i5);
                    seekBar.setThumb(gradientDrawable2);
                    seekBar.setThumbOffset(0);
                    C25901CoD.A01(cul, cul.A05);
                    int i6 = cul.A04;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    GradientDrawable gradientDrawable3 = cul.A0A;
                    if (gradientDrawable3 != null) {
                        BE8.A0x(mode, gradientDrawable3, i6);
                    }
                    int i7 = cul.A06;
                    GradientDrawable gradientDrawable4 = cul.A09;
                    if (gradientDrawable4 != null) {
                        BE8.A0x(mode, gradientDrawable4, i7);
                    }
                } else {
                    throw AnonymousClass000.A0n("Track drawable is null");
                }
            }
            DFL A09 = dfl2.A09(43);
            if (A09 != null) {
                i = C25340Cdz.A01(doz, A09, 0);
            } else {
                i = cul.A04;
            }
            DFL A092 = dfl2.A09(48);
            if (A092 != null) {
                i2 = C25340Cdz.A01(doz, A092, 0);
            } else {
                i2 = cul.A06;
            }
            int i8 = cul.A05;
            try {
                String A0D = dfl2.A0D(46);
                float f = (float) i8;
                if (A0D != null) {
                    f = A90.A01(A0D);
                }
                i8 = (int) f;
            } catch (AnonymousClass9HX unused) {
                C25913CoX.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider track height");
            }
            if (i8 != cul.A05) {
                C25901CoD.A01(cul, i8);
            }
            if (i != cul.A04) {
                PorterDuff.Mode mode2 = PorterDuff.Mode.SRC;
                GradientDrawable gradientDrawable5 = cul.A0A;
                if (gradientDrawable5 != null) {
                    BE8.A0x(mode2, gradientDrawable5, i);
                }
            }
            if (i2 != cul.A06) {
                PorterDuff.Mode mode3 = PorterDuff.Mode.SRC;
                GradientDrawable gradientDrawable6 = cul.A09;
                if (gradientDrawable6 != null) {
                    BE8.A0x(mode3, gradientDrawable6, i2);
                }
            }
            int i9 = cul.A03;
            try {
                String A0D2 = dfl2.A0D(45);
                float f2 = (float) i9;
                if (A0D2 != null) {
                    f2 = A90.A01(A0D2);
                }
                i9 = (int) f2;
            } catch (AnonymousClass9HX unused2) {
                C25913CoX.A01("BKBloksComponentsSliderBinderUtil", "Error while parsing slider thumb diameter");
            }
            DFL A093 = dfl2.A09(44);
            if (A093 != null) {
                i3 = C25340Cdz.A01(doz, A093, 0);
            } else {
                i3 = cul.A02;
            }
            if (i9 != cul.A00) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(i9, i9);
            } else {
                gradientDrawable = (GradientDrawable) seekBar.getThumb();
            }
            gradientDrawable.setColor(i3);
            seekBar.setThumb(gradientDrawable);
            seekBar.setThumbOffset(0);
            cul.A00 = i9;
            seekBar.setSplitTrack(false);
            seekBar.setPadding(0, 0, 0, 0);
            seekBar.refreshDrawableState();
            if (A0A == null && A0A2 == null && A0A3 == null) {
                cul.A0E = null;
                cul.A0D = null;
                return null;
            }
            cul.A0E = dfl2;
            cul.A0D = doz;
            seekBar.setOnSeekBarChangeListener(new D5W(this, cul, doz2, dfl2, A0A2, A0A3));
            return null;
        }
        throw AnonymousClass8BR.A0w("SliderController is null even though a controller is defined");
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        SeekBar seekBar = (SeekBar) view;
        CUL cul = (CUL) C26272CwJ.A04(doz, dfl);
        if (cul != null) {
            C25901CoD.A00.removeMessages(0, cul);
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            cul.A01 = seekBar.getProgress();
            cul.A0C = null;
            seekBar.setProgress(0);
            seekBar.setEnabled(true);
            GradientDrawable gradientDrawable = cul.A09;
            if (!(gradientDrawable == null || cul.A0A == null || cul.A0B == null)) {
                gradientDrawable.clearColorFilter();
                cul.A0A.clearColorFilter();
                cul.A0B.clearColorFilter();
            }
            C25901CoD.A01(cul, cul.A05);
            if (Build.VERSION.SDK_INT >= 26) {
                seekBar.setMin(0);
            }
            seekBar.setMax(0);
            return;
        }
        throw AnonymousClass8BR.A0w("SliderController is null even though a controller is defined");
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return new SeekBar(context);
    }

    public C23710BoH(DOZ doz, DFL dfl) {
        super(doz, dfl);
    }
}
