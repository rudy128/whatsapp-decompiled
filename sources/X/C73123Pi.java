package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.3Pi  reason: invalid class name and case insensitive filesystem */
public class C73123Pi extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public AnonymousClass1M9 A01;
    public AnonymousClass11C A02;
    public AnonymousClass1E7 A03;
    public AnonymousClass1KW A04;
    public C18030ve A05;
    public GroupJid A06;
    public C18010vc A07;
    public C36401np A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public AnonymousClass031 A0B;
    public boolean A0C;
    public CharSequence A0D;
    public final ReadMoreTextView A0E;
    public final AnonymousClass3L6 A0F;
    public final C28931bI A0G;
    public final C28931bI A0H;

    public static void A00(C73123Pi r3) {
        C42661yX r0;
        AnonymousClass1E7 r02 = r3.A03;
        if (r02 == null || (r0 = r02.A0M) == null || TextUtils.isEmpty(r0.A03)) {
            r3.A0E.setVisibility(8);
            r3.A0H.A04(8);
            r3.A0G.A04(8);
            return;
        }
        String str = r3.A03.A0M.A03;
        r3.A0E.setVisibility(0);
        r3.A0G.A04(0);
        r3.setDescription(str);
    }

    private int getEnhancedDescriptionCollapsedLineLimit() {
        return C18020vd.A00(C18040vf.A02, this.A05, 3259);
    }

    private void setDescription(CharSequence charSequence) {
        if (!charSequence.equals(this.A0D)) {
            this.A0D = charSequence;
            AnonymousClass11C r5 = this.A02;
            C18010vc r4 = this.A07;
            Context context = getContext();
            ReadMoreTextView readMoreTextView = this.A0E;
            SpannableStringBuilder A0J = C72483Me.A0J(readMoreTextView.getPaint(), r5, r4, C43251zV.A03(context, readMoreTextView.getPaint(), this.A04, charSequence));
            this.A08.A08(readMoreTextView.getContext(), A0J);
            readMoreTextView.A0R(A0J);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public C73123Pi(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass10E.A8r(A0O);
            this.A00 = AnonymousClass10E.A12(A0O);
            this.A08 = AnonymousClass3MY.A0e(A0O.A00);
            this.A09 = AnonymousClass10E.AL1(A0O);
            this.A04 = AnonymousClass3Ma.A0f(A0O);
            this.A01 = AnonymousClass10E.A4z(A0O);
            this.A02 = AnonymousClass3Ma.A0a(A0O);
            this.A0A = C000200d.A00(A0O.A4m);
            this.A07 = AnonymousClass3Ma.A0r(A0O);
        }
        View.inflate(getContext(), 2131624570, this);
        this.A0H = C28931bI.A00(this, 2131429231);
        this.A0G = C28931bI.A00(this, 2131429228);
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) AnonymousClass1HF.A06(this, 2131429230);
        this.A0E = readMoreTextView;
        AnonymousClass3Ma.A1K(readMoreTextView, this.A02);
        readMoreTextView.setLinesLimit(getEnhancedDescriptionCollapsedLineLimit());
        this.A0F = new C96294nc(this, 6);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass3MW.A0e(this.A0A).A00(this.A0F);
        this.A0E.requestLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass3MW.A0e(this.A0A).A01(this.A0F);
    }
}
