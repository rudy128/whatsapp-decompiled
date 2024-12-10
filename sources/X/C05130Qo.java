package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;

/* renamed from: X.0Qo  reason: invalid class name and case insensitive filesystem */
public abstract class C05130Qo {
    public static final FillElement A00 = new FillElement(AnonymousClass00R.A0C, 1.0f);
    public static final FillElement A01 = new FillElement(AnonymousClass00R.A01, 1.0f);
    public static final WrapContentElement A02 = A01(AnonymousClass0MX.A03);
    public static final WrapContentElement A03 = A01(AnonymousClass0MX.A04);
    public static final WrapContentElement A04 = A02(AnonymousClass0MX.A05);
    public static final WrapContentElement A05 = A02(AnonymousClass0MX.A08);
    public static final WrapContentElement A06 = A00(AnonymousClass0MX.A00);
    public static final WrapContentElement A07 = A00(AnonymousClass0MX.A02);

    public static final WrapContentElement A00(C16330s5 r3) {
        return new WrapContentElement(AnonymousClass00R.A01, r3, new C13000mf(r3));
    }

    public static final WrapContentElement A01(C16340s6 r3) {
        return new WrapContentElement(AnonymousClass00R.A00, r3, new C12980md(r3));
    }

    public static final WrapContentElement A02(Alignment alignment) {
        return new WrapContentElement(AnonymousClass00R.A0C, alignment, new C12990me(alignment));
    }

    public static final C17090tj A03(C16340s6 r1, C17090tj r2) {
        WrapContentElement A012;
        if (C18070vi.A18(r1, AnonymousClass0MX.A03)) {
            A012 = A02;
        } else if (C18070vi.A18(r1, AnonymousClass0MX.A04)) {
            A012 = A03;
        } else {
            A012 = A01(r1);
        }
        return r2.CP5(A012);
    }

    public static final C17090tj A04(Alignment alignment, C17090tj r2) {
        WrapContentElement A022;
        if (C18070vi.A18(alignment, AnonymousClass0MX.A05)) {
            A022 = A04;
        } else if (C18070vi.A18(alignment, AnonymousClass0MX.A08)) {
            A022 = A05;
        } else {
            A022 = A02(alignment);
        }
        return r2.CP5(A022);
    }

    public static final C17090tj A05(C17090tj r8) {
        return r8.CP5(new SizeElement(AnonymousClass0O1.A01(), (AnonymousClass1Y1) null, 52.0f, 32.0f, 52.0f, 32.0f, false));
    }

    public static final C17090tj A06(C17090tj r7, float f) {
        return r7.CP5(new SizeElement(AnonymousClass0O1.A01(), 0.0f, f, 0.0f, f, 5));
    }

    public static final C17090tj A07(C17090tj r8, float f) {
        return r8.CP5(new SizeElement(AnonymousClass0O1.A01(), (AnonymousClass1Y1) null, f, f, f, f, false));
    }

    public static final C17090tj A08(C17090tj r8, float f) {
        return r8.CP5(new SizeElement(AnonymousClass0O1.A01(), (AnonymousClass1Y1) null, f, f, f, f, true));
    }

    public static final C17090tj A09(C17090tj r7, float f) {
        return r7.CP5(new SizeElement(AnonymousClass0O1.A01(), f, 0.0f, f, 0.0f, 10));
    }

    public static final C17090tj A0A(C17090tj r7, float f, float f2) {
        return r7.CP5(new SizeElement(AnonymousClass0O1.A01(), 0.0f, f, 0.0f, f2, 5));
    }

    public static final C17090tj A0B(C17090tj r8, float f, float f2) {
        return r8.CP5(new SizeElement(AnonymousClass0O1.A01(), (AnonymousClass1Y1) null, f, f2, f, f2, true));
    }
}
