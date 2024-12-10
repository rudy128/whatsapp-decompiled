package X;

import android.view.View;

/* renamed from: X.4Ym  reason: invalid class name and case insensitive filesystem */
public final class C88144Ym {
    public final View.OnClickListener A00;
    public final View.OnLongClickListener A01;
    public final View.OnTouchListener A02;
    public final AnonymousClass21X A03;
    public final C32021gV A04;
    public final AnonymousClass88S A05;
    public final Runnable A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C88144Ym() {
        this((View.OnClickListener) null, (View.OnLongClickListener) null, (View.OnTouchListener) null, (AnonymousClass21X) null, (C32021gV) null, (AnonymousClass88S) null, (Runnable) null, false, false, false, false, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88144Ym) {
                C88144Ym r5 = (C88144Ym) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || this.A08 != r5.A08 || this.A0B != r5.A0B || this.A07 != r5.A07 || this.A0A != r5.A0A || this.A09 != r5.A09 || this.A0C != r5.A0C || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00(C18030ve r3) {
        if (!this.A0A || !this.A0B || !this.A07 || this.A09) {
            return false;
        }
        if (this.A08) {
            return this.A0C;
        }
        return C18020vd.A05(C18040vf.A02, r3, 3482);
    }

    public int hashCode() {
        return ((((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A03) * 31, this.A08), this.A0B), this.A07), this.A0A), this.A09), this.A0C) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(message=");
        A10.append(this.A03);
        A10.append(", isActive=");
        A10.append(this.A08);
        A10.append(", isMediaTransferSuccessful=");
        A10.append(this.A0B);
        A10.append(", canPlayPtv=");
        A10.append(this.A07);
        A10.append(", isAttached=");
        A10.append(this.A0A);
        A10.append(", isAnimating=");
        A10.append(this.A09);
        A10.append(", playWhenReadyAndActive=");
        A10.append(this.A0C);
        A10.append(", messageThumbCache=");
        A10.append(this.A04);
        A10.append(", onFileReadError=");
        A10.append(this.A06);
        A10.append(", onClickListener=");
        A10.append(this.A00);
        A10.append(", onLongClickListener=");
        A10.append(this.A01);
        A10.append(", onTouchListener=");
        A10.append(this.A02);
        A10.append(", playerStateChangedListener=");
        return AnonymousClass001.A1F(this.A05, A10);
    }

    public C88144Ym(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, AnonymousClass21X r4, C32021gV r5, AnonymousClass88S r6, Runnable runnable, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = r4;
        this.A08 = z;
        this.A0B = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A04 = r5;
        this.A06 = runnable;
        this.A00 = onClickListener;
        this.A01 = onLongClickListener;
        this.A02 = onTouchListener;
        this.A05 = r6;
    }
}
