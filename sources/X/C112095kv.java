package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.5kv  reason: invalid class name and case insensitive filesystem */
public final class C112095kv extends C38391rD {
    public int A00;
    public final C20245ADd A01;
    public final AnonymousClass86T A02;
    public final AnonymousClass77B A03;
    public final C123706Vn A04;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A0G = C108955ca.A0G(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131627322, false);
        C147977gh A1K = C108945cZ.A1K(this, 2);
        C18070vi.A0d(A0G, 0);
        return new C113325mu(A0G, A1K);
    }

    public /* bridge */ /* synthetic */ void A0P(C42011xT r4, List list, int i) {
        View view;
        C113325mu r42 = (C113325mu) r4;
        C18070vi.A0i(r42, list);
        Object A0c = C29431cG.A0c(list);
        if (A0c instanceof Boolean) {
            boolean A1Y = AnonymousClass000.A1Y(A0c);
            boolean z = false;
            View view2 = r42.A00;
            if (A1Y) {
                C18070vi.A0W(view2);
                view2.setVisibility(0);
                view = r42.A0H;
                z = true;
            } else {
                C18070vi.A0W(view2);
                view2.setVisibility(4);
                view = r42.A0H;
            }
            view.setSelected(z);
            return;
        }
        Bmc(r42, i);
    }

    public int A0Q() {
        return this.A03.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        Boolean bool;
        Context context;
        Context context2;
        int i2;
        int i3;
        int i4;
        View view;
        C113325mu r102 = (C113325mu) r10;
        C18070vi.A0d(r102, 0);
        AnonymousClass77B r4 = this.A03;
        String str = ((C168168iQ) r4.A01.get(i)).A00;
        C20256ADo A002 = C196499vA.A00(C196499vA.A01(r4, i), this.A01, r4.A02);
        if (A002 != null) {
            bool = Boolean.valueOf(A002.A02);
        } else {
            bool = null;
        }
        boolean A1T = AnonymousClass000.A1T(i, this.A00);
        Boolean A0i = AnonymousClass000.A0i();
        boolean A18 = C18070vi.A18(bool, A0i);
        TextView textView = r102.A02;
        if (A18) {
            textView.setText(str);
            context = textView.getContext();
            context2 = textView.getContext();
            i2 = 2130970831;
            i3 = 2131102246;
        } else {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            textView.setText(spannableString);
            context = textView.getContext();
            context2 = textView.getContext();
            i2 = 2130969369;
            i3 = 2131100372;
        }
        C72463Mc.A0w(context2, context, textView, i2, i3);
        TextView textView2 = r102.A01;
        C18070vi.A0W(textView2);
        textView2.setVisibility(C72453Mb.A01(C18070vi.A18(bool, A0i) ? 1 : 0));
        if (C18070vi.A18(bool, A0i)) {
            textView2.setText((CharSequence) null);
        } else {
            if (C18070vi.A19(bool, false)) {
                i4 = 2131894798;
            } else if (bool == null) {
                i4 = 2131887981;
            }
            textView2.setText(i4);
        }
        boolean z = false;
        View view2 = r102.A00;
        if (A1T) {
            C18070vi.A0W(view2);
            view2.setVisibility(0);
            view = r102.A0H;
            z = true;
        } else {
            C18070vi.A0W(view2);
            view2.setVisibility(4);
            view = r102.A0H;
        }
        view.setSelected(z);
    }

    public C112095kv(C20245ADd aDd, C123706Vn r2, AnonymousClass86T r3, AnonymousClass77B r4, int i) {
        this.A03 = r4;
        this.A01 = aDd;
        this.A02 = r3;
        this.A04 = r2;
        this.A00 = i;
    }
}
