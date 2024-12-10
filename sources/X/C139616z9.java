package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;

/* renamed from: X.6z9  reason: invalid class name and case insensitive filesystem */
public class C139616z9 {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03 = false;
    public int A04 = 0;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass87P A08;
    public final C139256yX A09;
    public final C133396og A0A;
    public final C132036m4 A0B;

    public static void A00(C139616z9 r6, boolean z) {
        Interpolator r0;
        C133396og r1 = r6.A0A;
        boolean A1a = AnonymousClass000.A1a(r6.A0B.A01.A03.A00);
        C109205cz r5 = r1.A00;
        WaImageView waImageView = r5.A06;
        if (waImageView != null) {
            int i = 4;
            boolean z2 = true;
            boolean A1T = AnonymousClass000.A1T(waImageView.getVisibility(), 4);
            WaImageView waImageView2 = r5.A06;
            if (waImageView2 != null) {
                if (waImageView2.getVisibility() != 0) {
                    z2 = false;
                }
                if (!A1a) {
                    if (A1T) {
                        return;
                    }
                } else if (z2) {
                    return;
                }
                WaImageView waImageView3 = r5.A06;
                if (waImageView3 != null) {
                    if (A1a) {
                        i = 0;
                    }
                    waImageView3.setVisibility(i);
                    if (z) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(A1a ^ true ? 1.0f : 0.0f, A1a ? 1.0f : 0.0f);
                        if (A1a) {
                            r0 = new C23621Gz();
                        } else {
                            r0 = new AnonymousClass1YY();
                        }
                        C108985cd.A13(alphaAnimation, r0);
                        WaImageView waImageView4 = r5.A06;
                        if (waImageView4 != null) {
                            waImageView4.startAnimation(alphaAnimation);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C18070vi.A11("undoButton");
        throw null;
    }

    public void A01(int i, int i2) {
        int i3;
        this.A00 = i2;
        this.A0A.A01(i2);
        if (this.A01 != i || this.A03) {
            if (this.A03) {
                i3 = this.A04;
            } else {
                i3 = 0;
            }
            A02(i3, i);
        }
    }

    public void A02(int i, int i2) {
        if (!this.A02) {
            C133396og r2 = this.A0A;
            r2.A00(i);
            this.A04 = i;
            this.A01 = i2;
            ColorPickerComponent colorPickerComponent = r2.A00.A07;
            if (colorPickerComponent == null) {
                C18070vi.A11("colorPicker");
                throw null;
            }
            colorPickerComponent.setSizeAndInvalidate((float) i2);
            if (this.A03) {
                r2.A01(this.A00);
                this.A03 = false;
            }
        }
    }

    public C139616z9(AnonymousClass87P r2, C139256yX r3, C133396og r4, C132036m4 r5, int i, int i2, int i3) {
        this.A05 = i;
        this.A07 = i2;
        this.A06 = i3;
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = r2;
        this.A0A = r4;
        r3.A02 = true;
        r3.A00 = new AnonymousClass7J7(this);
    }
}
