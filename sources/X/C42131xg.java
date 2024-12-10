package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.1xg  reason: invalid class name and case insensitive filesystem */
public class C42131xg {
    public static Drawable A08;
    public Drawable A00 = null;
    public C109475dV A01;
    public Integer A02 = null;
    public final C42151xi A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final C42121xe A06;
    public final C24921Me A07;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r0.intValue() != r2) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00() {
        /*
            r4 = this;
            X.0ve r2 = r4.A05
            X.0vf r1 = X.C18040vf.A01
            r0 = 11039(0x2b1f, float:1.5469E-41)
            boolean r1 = X.C18020vd.A05(r1, r2, r0)
            X.1xe r0 = r4.A06
            if (r1 == 0) goto L_0x003b
            android.content.Context r3 = r0.getContext()
        L_0x0012:
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2130970830(0x7f0408ce, float:1.7550381E38)
            r0 = 2131102245(0x7f060a25, float:1.7816922E38)
            int r1 = X.AnonymousClass1YL.A00(r3, r1, r0)
            android.content.res.Resources$Theme r0 = r3.getTheme()
            int r2 = X.AnonymousClass1YH.A00(r0, r2, r1)
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0033
            int r0 = r0.intValue()
            r1 = 0
            if (r0 == r2) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.A02 = r0
            return r1
        L_0x003b:
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            android.content.Context r3 = r0.getContext()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42131xg.A00():boolean");
    }

    public void A01() {
        C42121xe r4 = this.A06;
        Context context = r4.getUnreadIndicatorView().getContext();
        if (A08 == null || A00()) {
            A08 = AnonymousClass4aX.A02(context, 2131231873, 2131102245);
        }
        Drawable drawable = A08;
        int dimensionPixelSize = r4.getContentView().getResources().getDimensionPixelSize(2131166018);
        C18000vb r6 = this.A04;
        C27641Ww.A07(r4.getUnreadIndicatorView(), r6, dimensionPixelSize, 0, 0, 0);
        WaTextView unreadIndicatorView = r4.getUnreadIndicatorView();
        if (C18000vb.A00(r6).A06) {
            unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds(new C74743cP(drawable, r6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    public void A02() {
        this.A06.getDateView().setVisibility(8);
        TextEmojiLabel textEmojiLabel = this.A03.A01;
        textEmojiLabel.setText("");
        textEmojiLabel.setPlaceholder(50);
    }

    public void A03(int i) {
        this.A06.getDateView().setVisibility(i);
    }

    public void A04(AnonymousClass1E7 r5, C43351zf r6, List list) {
        String A0K = this.A07.A0K(r5);
        C42151xi r2 = this.A03;
        r2.A01.setPlaceholder(0);
        r2.A0F(r6, A0K, list);
    }

    public void A06(CharSequence charSequence, CharSequence charSequence2) {
        C42121xe r1 = this.A06;
        r1.getDateView().setText(charSequence);
        r1.getDateView().setContentDescription(charSequence2);
    }

    public C42131xg(Context context, C19880zA r9, C24921Me r10, C18000vb r11, C18030ve r12, C42121xe r13) {
        this.A05 = r12;
        this.A06 = r13;
        this.A04 = r11;
        C24921Me r4 = r10;
        this.A07 = r10;
        TextEmojiLabel contactNameView = r13.getContactNameView();
        Context context2 = context;
        C19880zA r2 = r9;
        this.A03 = new C42151xi(context2, r2, contactNameView, r4, r11, r12);
    }

    public void A05(Boolean bool) {
        if (!bool.booleanValue() && !this.A06.getUnreadIndicatorInflated()) {
            if (C18020vd.A05(C18040vf.A01, this.A05, 11039)) {
                return;
            }
        }
        if (this.A01 == null || A00()) {
            C42121xe r0 = this.A06;
            this.A01 = new C109475dV(C19740yt.A00(r0.getContext(), AnonymousClass1YL.A00(r0.getContext(), 2130969232, 2131100229)));
        }
        C42121xe r2 = this.A06;
        r2.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        r2.getUnreadIndicatorView().setPadding(0, 0, 0, 0);
        r2.getUnreadIndicatorView().setBackground(this.A01);
    }
}
