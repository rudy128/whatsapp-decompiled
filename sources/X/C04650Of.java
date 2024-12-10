package X;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* renamed from: X.0Of  reason: invalid class name and case insensitive filesystem */
public final class C04650Of {
    public static final C04260Mm A0N = new Object();
    public static final WeakHashMap A0O = new WeakHashMap();
    public int A00;
    public final C05610Ux A01;
    public final boolean A02;
    public final C05610Ux A03 = new C05610Ux(4, "captionBar");
    public final C05610Ux A04;
    public final C05610Ux A05;
    public final C05610Ux A06;
    public final C05610Ux A07;
    public final C05610Ux A08;
    public final C05610Ux A09;
    public final C05610Ux A0A;
    public final AnonymousClass0Bk A0B;
    public final C05600Uw A0C;
    public final C05600Uw A0D;
    public final C05600Uw A0E;
    public final C05600Uw A0F;
    public final C05600Uw A0G;
    public final C05600Uw A0H;
    public final C05600Uw A0I;
    public final C05600Uw A0J;
    public final C17100tk A0K;
    public final C17100tk A0L;
    public final C17100tk A0M;

    public final void A01(View view) {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            AnonymousClass1HF.A0g(view, (AnonymousClass1HE) null);
            AnonymousClass1HF.A0k(view, (C25247Cbm) null);
            view.removeOnAttachStateChangeListener(this.A0B);
        }
    }

    public final void A02(View view) {
        if (this.A00 == 0) {
            AnonymousClass0Bk r1 = this.A0B;
            AnonymousClass1HF.A0g(view, r1);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(r1);
            AnonymousClass1HF.A0k(view, r1);
        }
        this.A00++;
    }

    public final void A03(AnonymousClass1HO r4) {
        this.A03.A01(r4);
        this.A05.A01(r4);
        this.A04.A01(r4);
        this.A07.A01(r4);
        this.A08.A01(r4);
        this.A01.A01(r4);
        this.A09.A01(r4);
        this.A0A.A01(r4);
        this.A06.A01(r4);
        C05600Uw r2 = this.A0C;
        r2.A00.setValue(AnonymousClass0L3.A00(r4.A08(4)));
        C05600Uw r22 = this.A0F;
        r22.A00.setValue(AnonymousClass0L3.A00(r4.A08(2)));
        C05600Uw r23 = this.A0G;
        r23.A00.setValue(AnonymousClass0L3.A00(r4.A08(1)));
        C05600Uw r24 = this.A0H;
        r24.A00.setValue(AnonymousClass0L3.A00(r4.A08(7)));
        C05600Uw r25 = this.A0I;
        r25.A00.setValue(AnonymousClass0L3.A00(r4.A08(64)));
        Cn4 A092 = r4.A09();
        if (A092 != null) {
            C33321id A052 = A092.A05();
            C05600Uw r0 = this.A0J;
            r0.A00.setValue(AnonymousClass0L3.A00(A052));
        }
        C04790Ov.A03();
    }

    public final void A04(AnonymousClass1HO r4) {
        C05600Uw r2 = this.A0D;
        r2.A00.setValue(AnonymousClass0L3.A00(r4.A07(8)));
    }

    public final void A05(AnonymousClass1HO r4) {
        C05600Uw r2 = this.A0E;
        r2.A00.setValue(AnonymousClass0L3.A00(r4.A07(8)));
    }

    public C04650Of(View view) {
        boolean z;
        Boolean bool;
        View view2;
        C05610Ux r7 = new C05610Ux(128, "displayCutout");
        this.A04 = r7;
        C05610Ux r8 = new C05610Ux(8, "ime");
        this.A05 = r8;
        C05610Ux r6 = new C05610Ux(32, "mandatorySystemGestures");
        this.A06 = r6;
        this.A07 = new C05610Ux(2, "navigationBars");
        this.A08 = new C05610Ux(1, "statusBars");
        C05610Ux r2 = new C05610Ux(7, "systemBars");
        this.A01 = r2;
        C05610Ux r5 = new C05610Ux(16, "systemGestures");
        this.A09 = r5;
        C05610Ux r4 = new C05610Ux(64, "tappableElement");
        this.A0A = r4;
        C05600Uw A012 = AnonymousClass0L3.A01(C33321id.A04, "waterfall");
        this.A0J = A012;
        C05590Uv r22 = new C05590Uv(new C05590Uv(r2, r8), r7);
        this.A0L = r22;
        C05590Uv r1 = new C05590Uv(new C05590Uv(new C05590Uv(r4, r6), r5), A012);
        this.A0M = r1;
        this.A0K = new C05590Uv(r22, r1);
        this.A0C = C04260Mm.A00("captionBarIgnoringVisibility");
        this.A0F = C04260Mm.A00("navigationBarsIgnoringVisibility");
        this.A0G = C04260Mm.A00("statusBarsIgnoringVisibility");
        this.A0H = C04260Mm.A00("systemBarsIgnoringVisibility");
        this.A0I = C04260Mm.A00("tappableElementIgnoringVisibility");
        this.A0E = C04260Mm.A00("imeAnimationTarget");
        this.A0D = C04260Mm.A00("imeAnimationSource");
        ViewParent parent = view.getParent();
        Object obj = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            obj = view2.getTag(2131429386);
        }
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.A02 = z;
        this.A0B = new AnonymousClass0Bk(this);
    }
}
