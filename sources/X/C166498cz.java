package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/* renamed from: X.8cz  reason: invalid class name and case insensitive filesystem */
public final class C166498cz extends BV6 {
    public final DOZ A00;
    public final DFL A01;

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        int A002;
        int A003;
        int A004;
        C18070vi.A0d(context, 0);
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "createContent");
        DFL dfl = this.A01;
        DOZ doz = this.A00;
        C18070vi.A0e(dfl, 0, doz);
        DFL A09 = dfl.A09(41);
        DFL A092 = dfl.A09(35);
        DFL A093 = dfl.A09(43);
        if (A09 != null) {
            A002 = C25340Cdz.A01(doz, A09, C19740yt.A00(context, 2131099902));
        } else {
            A002 = C19740yt.A00(context, 2131099902);
        }
        if (A092 != null) {
            A003 = C25340Cdz.A01(doz, A092, C19740yt.A00(context, 2131099902));
        } else {
            A003 = C19740yt.A00(context, 2131099902);
        }
        if (A093 != null) {
            A004 = C25340Cdz.A01(doz, A093, C19740yt.A00(context, 2131099901));
        } else {
            A004 = C19740yt.A00(context, 2131099901);
        }
        return new AnonymousClass3P8(context, new AnonymousClass4UQ(dfl.A03(46, 0.0f), A002, A003, A004));
    }

    public static final void A00(SeekBar seekBar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Object systemService = seekBar.getContext().getSystemService(Vibrator.class);
            C18070vi.A0z(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(VibrationEffect.createPredefined(2));
        } else if (i >= 26) {
            seekBar.performHapticFeedback(4);
        }
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        Float f;
        Float f2;
        ViewGroup viewGroup = (ViewGroup) view;
        C18070vi.A0n(viewGroup, doz, dfl);
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "bind");
        if (viewGroup.getChildCount() > 0) {
            boolean z = false;
            if (C60242nd.A00(viewGroup) instanceof SeekBar) {
                View A002 = C60242nd.A00(viewGroup);
                C18070vi.A0z(A002, "null cannot be cast to non-null type android.widget.SeekBar");
                SeekBar seekBar = (SeekBar) A002;
                C183639Za r4 = (C183639Za) C26272CwJ.A04(doz, dfl);
                float A03 = dfl.A03(46, 0.0f);
                float A032 = dfl.A03(44, 0.0f);
                if (r4 == null || (f = r4.A01) == null || f.floatValue() != A03 || (f2 = r4.A00) == null || f2.floatValue() != A032) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("setting the progress, currentValue:");
                    A10.append(A032);
                    C26294Cx6.A04("BodyParametricSliderPreviewUnit", A10.toString());
                    if (r4 != null) {
                        r4.A01 = Float.valueOf(A03);
                        r4.A00 = Float.valueOf(A032);
                    }
                    int i = 100;
                    if (A03 > 0.0f) {
                        i = (int) (1.0f / A03);
                    }
                    seekBar.setMax(i);
                    float f3 = 100.0f;
                    if (A03 > 0.0f) {
                        f3 = 1.0f / A03;
                    }
                    ((AnonymousClass3Re) seekBar).setInitialProgress((int) (A032 * f3));
                }
                if (C19740yt.A01(viewGroup.getContext(), "android.permission.VIBRATE") == 0 && A03 > 0.0f) {
                    z = true;
                }
                C26294Cx6.A04("BodyParametricSliderPreviewUnit", "addSliderListener");
                seekBar.setOnSeekBarChangeListener(new AG9(this, doz, dfl, z));
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0N(View view, DOZ doz, DFL dfl) {
        ViewGroup viewGroup = (ViewGroup) view;
        C18070vi.A0d(viewGroup, 0);
        C18070vi.A0j(doz, dfl);
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "onFinalUnmount");
        if (viewGroup.getChildCount() > 0 && (C60242nd.A00(viewGroup) instanceof SeekBar)) {
            View A002 = C60242nd.A00(viewGroup);
            C18070vi.A0z(A002, "null cannot be cast to non-null type android.widget.SeekBar");
            ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            viewGroup.setTag(2131427334, false);
        }
    }

    public C166498cz(DOZ doz, DFL dfl) {
        super(doz, dfl);
        this.A01 = dfl;
        this.A00 = doz;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        C18070vi.A0j(doz, dfl);
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "unbind");
        C183639Za r1 = (C183639Za) C26272CwJ.A04(doz, dfl);
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }
}
