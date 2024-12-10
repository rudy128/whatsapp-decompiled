package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.3XK  reason: invalid class name */
public final class AnonymousClass3XK extends C38391rD {
    public final LayoutInflater A00;
    public final C85874Pb A01;
    public final C72043Kk A02;
    public final C37451pZ A03;
    public final NewsletterInfoActivity A04;
    public final List A05 = AnonymousClass000.A13();
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5JH(this));
    public final boolean A07;

    public long A0M(int i) {
        return (long) i;
    }

    public final void A0U(List list) {
        List list2 = this.A05;
        list2.clear();
        if (this.A07 || list.size() <= 10) {
            list2.addAll(list);
        } else {
            list2.addAll(list.subList(0, 10));
            list2.add(C822043r.A00);
        }
        notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            return new C822243t(AnonymousClass3MX.A0B(this.A00, viewGroup, 2131626202, false), this);
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            return new C822143s(AnonymousClass3MX.A0B(this.A00, viewGroup, 2131626201, false), this);
        } else {
            throw AnonymousClass001.A13("View type not supported ", AnonymousClass000.A10(), i);
        }
    }

    public int A0Q() {
        return this.A05.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        C73883Xr r102 = (C73883Xr) r10;
        C18070vi.A0d(r102, 0);
        C83324Er r1 = (C83324Er) this.A05.get(i);
        if (r102 instanceof C822243t) {
            C822243t r103 = (C822243t) r102;
            C18070vi.A0d(r1, 0);
            C17960vV.A0D(r1 instanceof C821943q);
            AnonymousClass1E7 r4 = ((C821943q) r1).A00;
            C42141xh r7 = r103.A01;
            TextEmojiLabel textEmojiLabel = r7.A01;
            textEmojiLabel.setText((CharSequence) null);
            AnonymousClass3XK r3 = r103.A04;
            NewsletterInfoActivity newsletterInfoActivity = r3.A04;
            C72463Mc.A0y(newsletterInfoActivity, textEmojiLabel, 2130970343, 2131101314);
            TextEmojiLabel textEmojiLabel2 = r103.A00;
            C72463Mc.A0y(newsletterInfoActivity, textEmojiLabel2, 2130970340, 2131101312);
            C28931bI r6 = r103.A03;
            AnonymousClass3MX.A1C(newsletterInfoActivity, AnonymousClass3MX.A0M(r6), 2131101148);
            r6.A02().setBackgroundResource(2131231561);
            AnonymousClass3MX.A0D(r6).setVisibility(0);
            AnonymousClass3MX.A0M(r6).setText(2131894264);
            r7.A05(r4);
            r3.A03.A07(r103.A02, r4);
            if (r4.A0Z != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0S(r4.A0Z, (List) null, 0, false);
            } else {
                textEmojiLabel2.setVisibility(8);
            }
            View view = r103.A0H;
            view.setClickable(true);
            view.setOnCreateContextMenuListener(new C90124dZ(r4, r3, 3));
            AnonymousClass3Ma.A19(view, r103, 4);
            view.setBackgroundResource(2131232942);
            return;
        }
        C822143s r104 = (C822143s) r102;
        AnonymousClass3Ma.A1D(r104.A00, r104.A01, 20);
    }

    public int getItemViewType(int i) {
        Object obj = this.A05.get(i);
        if (obj instanceof C821943q) {
            return 0;
        }
        if (obj instanceof C822043r) {
            return 1;
        }
        throw AnonymousClass3MW.A14();
    }

    public AnonymousClass3XK(LayoutInflater layoutInflater, C85874Pb r3, C72043Kk r4, C37451pZ r5, NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        C18070vi.A0o(r4, r3, newsletterInfoActivity);
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = newsletterInfoActivity;
        this.A00 = layoutInflater;
        this.A03 = r5;
        this.A07 = z;
    }
}
