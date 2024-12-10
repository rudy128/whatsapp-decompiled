package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3se  reason: invalid class name and case insensitive filesystem */
public class C78343se extends AnonymousClass3uP {
    public TextEmojiLabel A00;
    public boolean A01;

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public static void A01(C78343se r6) {
        if (((C438721g) r6.A0I).A00 != null) {
            r6.A00.setText(A00(r6.getContext(), r6.A00.getPaint(), ((C438721g) r6.A0I).A00.A05, AnonymousClass1YL.A00(r6.getContext(), 2130971114, 2131102444), AnonymousClass3MW.A1Z(r6.A0D)));
        }
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A01(this);
        }
    }

    public C438721g getFMessage() {
        return (C438721g) this.A0I;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof C438721g);
        this.A0I = r2;
    }

    public static SpannableStringBuilder A00(Context context, Paint paint, String str, int i, boolean z) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166837);
        Paint paint2 = paint;
        if (z) {
            return C72813Np.A00(paint, AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233239), i), str, dimensionPixelSize);
        }
        String A0y = AnonymousClass000.A0y("  ", AnonymousClass000.A11(str));
        Drawable A05 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131233239), i);
        int length = A0y.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0y);
        C72813Np.A04(paint2, A05, spannableStringBuilder, dimensionPixelSize, length - 1, length);
        return spannableStringBuilder;
    }

    public void A1u() {
        A01(this);
        AnonymousClass3uP.A0h(this, false);
    }

    public int getCenteredLayoutId() {
        return 2131624824;
    }

    public int getIncomingLayoutId() {
        return 2131624824;
    }

    public int getOutgoingLayoutId() {
        return 2131624825;
    }
}
