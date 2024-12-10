package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.List;

/* renamed from: X.3XI  reason: invalid class name */
public final class AnonymousClass3XI extends C38391rD {
    public final LayoutInflater A00;
    public final C72043Kk A01;
    public final C24921Me A02;
    public final C37451pZ A03;
    public final AnonymousClass1CJ A04;
    public final C18030ve A05;
    public final C29681ch A06;
    public final NewsletterInfoActivity A07;
    public final List A08 = AnonymousClass000.A13();
    public final List A09 = AnonymousClass000.A13();
    public final AnonymousClass1LU A0A;

    public AnonymousClass3XI(LayoutInflater layoutInflater, C72043Kk r3, C24921Me r4, C37451pZ r5, AnonymousClass1CJ r6, C18030ve r7, AnonymousClass1LU r8, C29681ch r9, NewsletterInfoActivity newsletterInfoActivity) {
        C18070vi.A0d(r6, 5);
        C18070vi.A0q(r4, r3, r8);
        C18070vi.A0d(r7, 9);
        this.A07 = newsletterInfoActivity;
        this.A00 = layoutInflater;
        this.A03 = r5;
        this.A06 = r9;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A0A = r8;
        this.A05 = r7;
    }

    public long A0M(int i) {
        return (long) i;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            int i2 = 2131625857;
            if (AnonymousClass1J8.A05(this.A05)) {
                i2 = 2131625858;
            }
            List list = C42011xT.A0I;
            return new AnonymousClass43O(AnonymousClass3MX.A0B(this.A00, viewGroup, i2, false), this);
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            return new AnonymousClass43P(AnonymousClass3MX.A0B(this.A00, viewGroup, 2131626202, false), this);
        } else if (i == 2) {
            List list3 = C42011xT.A0I;
            return new AnonymousClass43N(AnonymousClass3MX.A0B(this.A00, viewGroup, 2131626190, false), this);
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("Unknown type: ", AnonymousClass000.A10(), i));
        }
    }

    public int A0Q() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r13, int i) {
        C73873Xq r132 = (C73873Xq) r13;
        C18070vi.A0d(r132, 0);
        C83304Ep r2 = (C83304Ep) this.A08.get(i);
        if (r132 instanceof AnonymousClass43O) {
            C18070vi.A0d(r2, 0);
            C17960vV.A0D(r2 instanceof AnonymousClass43R);
            View view = ((AnonymousClass43O) r132).A00;
            if (view instanceof WDSSectionHeader) {
                ((WDSSectionHeader) view).setHeaderText(((AnonymousClass43R) r2).A00);
            } else if (view instanceof WaTextView) {
                TextView textView = (TextView) view;
                textView.setText(((AnonymousClass43R) r2).A00);
                C43421zm.A04(textView);
            }
        } else if (r132 instanceof AnonymousClass43N) {
            AnonymousClass43N r133 = (AnonymousClass43N) r132;
            C18070vi.A0d(r2, 0);
            r133.A00.setText(2131895611);
            C28931bI A002 = C28931bI.A00(r133.A0H, 2131431791);
            AnonymousClass3XI r3 = r133.A01;
            C29691ci A0A2 = r3.A04.A0A(r3.A06);
            if ((A0A2 instanceof C46162Dk) && A0A2 != null) {
                A002.A04(0);
                A002.A05(new AnonymousClass787(r3, A0A2, 34));
            }
        } else {
            AnonymousClass43P r134 = (AnonymousClass43P) r132;
            C18070vi.A0d(r2, 0);
            C17960vV.A0D(r2 instanceof AnonymousClass43Q);
            AnonymousClass1E7 r8 = ((AnonymousClass43Q) r2).A00.A00;
            C42141xh r6 = r134.A01;
            TextEmojiLabel textEmojiLabel = r6.A01;
            textEmojiLabel.setText((CharSequence) null);
            AnonymousClass3XI r22 = r134.A03;
            NewsletterInfoActivity newsletterInfoActivity = r22.A07;
            C72463Mc.A0y(newsletterInfoActivity, textEmojiLabel, 2130970343, 2131101314);
            TextEmojiLabel textEmojiLabel2 = r134.A00;
            C72463Mc.A0y(newsletterInfoActivity, textEmojiLabel2, 2130970340, 2131101312);
            C42751yg A0D = r22.A02.A0D(r8, 2);
            r6.A04(A0D, r8, (List) null, 2, r8.A0P());
            r22.A03.A07(r134.A02, r8);
            if (r8.A0Z != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0S(r8.A0Z, (List) null, 0, false);
            } else {
                textEmojiLabel2.setVisibility(8);
            }
            View view2 = r134.A0H;
            view2.setBackgroundResource(2131232942);
            AnonymousClass3Ma.A1F(view2, r22, r8, A0D, 18);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.get(i);
        if (obj instanceof AnonymousClass43R) {
            return 0;
        }
        return C72453Mb.A04(obj instanceof AnonymousClass43Q ? 1 : 0);
    }
}
