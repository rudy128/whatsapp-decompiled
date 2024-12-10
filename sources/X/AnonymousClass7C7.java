package X;

import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.7C7  reason: invalid class name */
public final class AnonymousClass7C7 implements C108745cE, E8B {
    public final int A00;
    public final int A01;
    public final View.OnClickListener A02;
    public final ImageView.ScaleType A03;
    public final C122636Rd A04;
    public final C107345Zi A05;
    public final AnonymousClass4ZN A06;
    public final AnonymousClass4ZN A07;
    public final AnonymousClass4ZN A08;
    public final AnonymousClass4ZN A09;
    public final Long A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final int A0H;
    public final View.OnClickListener A0I;
    public final C107345Zi A0J;
    public final AnonymousClass4ZN A0K;

    public AnonymousClass7C7(View.OnClickListener onClickListener, ImageView.ScaleType scaleType, C122636Rd r5, C107345Zi r6, AnonymousClass4ZN r7, AnonymousClass4ZN r8, AnonymousClass4ZN r9, AnonymousClass4ZN r10, Long l, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(list, 4);
        this.A04 = r5;
        this.A09 = r7;
        this.A08 = r8;
        this.A0B = list;
        this.A05 = r6;
        this.A00 = i;
        this.A03 = scaleType;
        this.A0F = z;
        this.A0G = z2;
        this.A0C = z3;
        this.A06 = r9;
        this.A07 = r10;
        this.A02 = onClickListener;
        this.A0A = l;
        this.A0D = z4;
        this.A0J = r6;
        this.A0K = r10;
        this.A0I = onClickListener;
        this.A0H = z4 ? 2131167055 : 2131165623;
        boolean z5 = true;
        if (z && !AnonymousClass000.A1a(list)) {
            z5 = false;
        }
        C17960vV.A0F(z5, "User JIDs should not be empty if shouldShowAvatar is true");
        this.A01 = r5.priority;
        this.A0E = r5.isPersistent;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7C7) {
                AnonymousClass7C7 r5 = (AnonymousClass7C7) obj;
                if (this.A04 != r5.A04 || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A05, r5.A05) || this.A00 != r5.A00 || this.A03 != r5.A03 || this.A0F != r5.A0F || this.A0G != r5.A0G || this.A0C != r5.A0C || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A0A, r5.A0A) || this.A0D != r5.A0D) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass7C7 A00(boolean z) {
        C122636Rd r3 = this.A04;
        AnonymousClass4ZN r5 = this.A09;
        AnonymousClass4ZN r6 = this.A08;
        List list = this.A0B;
        C107345Zi r4 = this.A05;
        int i = this.A00;
        ImageView.ScaleType scaleType = this.A03;
        boolean z2 = this.A0F;
        boolean z3 = this.A0G;
        boolean z4 = this.A0C;
        return new AnonymousClass7C7(this.A02, scaleType, r3, r4, r5, r6, this.A06, this.A07, this.A0A, list, i, z2, z3, z4, z);
    }

    public Integer BUN() {
        return Integer.valueOf(this.A0H);
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A04);
        List list = this.A0B;
        return C17880vN.A01((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, (((AnonymousClass000.A0N(list, (AnonymousClass000.A0N(this.A09, A0L) + AnonymousClass001.A0k(this.A08)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + this.A00) * 31), this.A0F), this.A0G), this.A0C) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A0A)) * 31, this.A0D);
    }

    public AnonymousClass4ZN BMJ() {
        return this.A06;
    }

    public AnonymousClass4ZN BMQ() {
        return this.A0K;
    }

    public View.OnClickListener BO5() {
        return this.A0I;
    }

    public Long BQw() {
        return this.A0A;
    }

    public C107345Zi BSd() {
        return this.A0J;
    }

    public int BXa() {
        return this.A01;
    }

    public AnonymousClass4ZN BaT() {
        return this.A09;
    }

    public boolean isPersistent() {
        return this.A0E;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InCallBannerViewState(bannerType=");
        A10.append(this.A04);
        A10.append(", title=");
        A10.append(this.A09);
        A10.append(", subTitle=");
        A10.append(this.A08);
        A10.append(", userJids=");
        A10.append(this.A0B);
        A10.append(", leftIcon=");
        A10.append(this.A05);
        A10.append(", backgroundColorRes=");
        A10.append(this.A00);
        A10.append(", scaleType=");
        A10.append(this.A03);
        A10.append(", shouldShowAvatar=");
        A10.append(this.A0F);
        A10.append(", shouldShowRingingDots=");
        A10.append(this.A0G);
        A10.append(", clickable=");
        A10.append(this.A0C);
        A10.append(", accessibilityLabel=");
        A10.append(this.A06);
        A10.append(", buttonText=");
        A10.append(this.A07);
        A10.append(", buttonOnClick=");
        A10.append(this.A02);
        A10.append(", duration=");
        A10.append(this.A0A);
        A10.append(", isFullWidth=");
        return C17900vP.A0F(A10, this.A0D);
    }
}
