package X;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.widget.TextView;

public final class BTQ extends C3J {
    public final Rect A00;
    public final Typeface A01;
    public final TextView.OnEditorActionListener A02;
    public final C24274ByX A03;
    public final C24293Byq A04;
    public final C179669Iw A05;
    public final BTN A06;
    public final BTH A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final String A0I;
    public final C18090vk A0J;
    public final C18090vk A0K;
    public final C18090vk A0L;
    public final AnonymousClass1OS A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTQ) {
                BTQ btq = (BTQ) obj;
                if (!C18070vi.A18(this.A09, btq.A09) || !C18070vi.A18(this.A07, btq.A07) || !C18070vi.A18(this.A0F, btq.A0F) || !C18070vi.A18(this.A0G, btq.A0G) || !C18070vi.A18(this.A08, btq.A08) || !C18070vi.A18(this.A0E, btq.A0E) || !C18070vi.A18(this.A0D, btq.A0D) || !C18070vi.A18(this.A00, btq.A00) || !C18070vi.A18(this.A06, btq.A06) || !C18070vi.A18(this.A0A, btq.A0A) || !C18070vi.A18(this.A0B, btq.A0B) || !C18070vi.A18(this.A0C, btq.A0C) || this.A04 != btq.A04 || this.A05 != btq.A05 || this.A03 != btq.A03 || this.A0O != btq.A0O || !C18070vi.A18(this.A0H, btq.A0H) || this.A0N != btq.A0N || this.A0Q != btq.A0Q || !C18070vi.A18(this.A01, btq.A01) || !C18070vi.A18(this.A0J, btq.A0J) || !C18070vi.A18(this.A0K, btq.A0K) || !C18070vi.A18(this.A02, btq.A02) || !C18070vi.A18(this.A0M, btq.A0M) || this.A0P != btq.A0P || !C18070vi.A18(this.A0I, btq.A0I) || !C18070vi.A18(this.A0L, btq.A0L)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass0DV.A00((((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, (((((((BE6.A06((((((BE6.A06((BE6.A06((((AnonymousClass000.A0L(this.A09) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A0F)) * 31, AnonymousClass001.A0k(this.A0G)) + AnonymousClass001.A0k(this.A08)) * 31, AnonymousClass001.A0k(this.A0E)) + AnonymousClass001.A0k(this.A0D)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A06)) * 31, AnonymousClass001.A0k(this.A0A)) + AnonymousClass001.A0k(this.A0B)) * 31) + AnonymousClass001.A0k(this.A0C)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A05)) * 31), this.A0O) * 31) + C17900vP.A00(this.A0H)) * 31, this.A0N), this.A0Q) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A0J)) * 31) + AnonymousClass001.A0k(this.A0K)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A0M)) * 31, this.A0P) + C17900vP.A00(this.A0I)) * 31) + AnonymousClass001.A0k(this.A0L)) * 31;
    }

    public BTQ(Rect rect, Typeface typeface, TextView.OnEditorActionListener onEditorActionListener, C24274ByX byX, C24293Byq byq, C179669Iw r7, BTN btn, BTH bth, CharSequence charSequence, CharSequence charSequence2, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, C18090vk r21, C18090vk r22, C18090vk r23, AnonymousClass1OS r24, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A09 = charSequence;
        this.A07 = bth;
        this.A0F = num;
        this.A0G = num2;
        this.A08 = charSequence2;
        this.A0E = num3;
        this.A0D = num4;
        this.A00 = rect;
        this.A06 = btn;
        this.A0A = f;
        this.A0B = num5;
        this.A0C = num6;
        this.A04 = byq;
        this.A05 = r7;
        this.A03 = byX;
        this.A0O = z;
        this.A0H = str;
        this.A0N = z2;
        this.A0Q = z3;
        this.A01 = typeface;
        this.A0J = r21;
        this.A0K = r22;
        this.A02 = onEditorActionListener;
        this.A0M = r24;
        this.A0P = z4;
        this.A0I = str2;
        this.A0L = r23;
    }
}
