package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.ClippingLayout;

/* renamed from: X.7Ld  reason: invalid class name and case insensitive filesystem */
public class C145407Ld implements C160858Af {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass1FL A01;
    public final /* synthetic */ AnonymousClass3V4 A02;
    public final /* synthetic */ AnonymousClass11C A03;
    public final /* synthetic */ AnonymousClass74M A04;

    public void CAI(float f, boolean z) {
        ClippingLayout clippingLayout;
        AnonymousClass74M r5 = this.A04;
        Rect rect = r5.A0S;
        if (z) {
            clippingLayout = r5.A10;
            rect.set(0, 0, r5.A0W.getWidth() + ((int) f), clippingLayout.getHeight());
        } else {
            clippingLayout = r5.A10;
            rect.set((int) f, 0, clippingLayout.getWidth(), clippingLayout.getHeight());
        }
        if (r5.A0X.getVisibility() == 0) {
            clippingLayout = r5.A11;
        }
        clippingLayout.setClipBounds(rect);
    }

    public C145407Ld(View view, AnonymousClass1FL r2, AnonymousClass3V4 r3, AnonymousClass11C r4, AnonymousClass74M r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
    }

    public void Bve() {
        this.A04.A0k.A0T();
    }

    public void BxN(boolean z) {
        this.A04.A0Y(z, false);
    }

    public void C3Z() {
        AnonymousClass1HF.A06(this.A00, 2131430949).setClipBounds((Rect) null);
        this.A04.A11.setClipBounds((Rect) null);
    }

    public void C5a() {
        AnonymousClass74M r2 = this.A04;
        r2.A0Y.findViewById(2131428625).setVisibility(0);
        r2.A0W.requestFocus();
    }

    public void C5d() {
        AnonymousClass1FL r2 = this.A01;
        String string = r2.getString(2131898062);
        if (this.A04.A0J == null) {
            AnonymousClass1Y5.A00(r2, this.A03, string);
        }
        this.A02.A0V(3);
    }

    public void C5o(float f) {
        C122956So r3 = this.A04.A0b;
        r3.A00.set(Double.doubleToRawLongBits((double) f));
    }

    public void C75(boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass74M.A0L(this.A04, z, z2, z3, z4);
    }
}
