package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8IO  reason: invalid class name */
public abstract class AnonymousClass8IO extends C42011xT {
    public void A0B(C182999Wn r16) {
        Context context;
        int i;
        View view;
        int i2;
        C194819sL r1;
        C182999Wn r4 = r16;
        if (this instanceof C168658jQ) {
            ((C168858jn) this).A0C((C168738jb) r4);
        } else if (this instanceof C168778jf) {
            ((C168778jf) this).A0C();
        } else if (this instanceof C168788jg) {
            C18070vi.A0d((Object) null, 0);
            throw AnonymousClass000.A0s("title");
        } else if (this instanceof C168808ji) {
            C168808ji r6 = (C168808ji) this;
            C168698jX r42 = (C168698jX) r4;
            C18070vi.A0d(r42, 0);
            String A0x = AnonymousClass3MW.A0x(AnonymousClass000.A0Y(r6.A0H), r42.A01, AnonymousClass3MW.A1a(), 0, 2131887985);
            C18070vi.A0X(A0x);
            r6.A01.setText(A0x);
            r6.A00.setText(r42.A00);
        } else if (this instanceof C168818jj) {
            C168818jj r7 = (C168818jj) this;
            C168718jZ r43 = (C168718jZ) r4;
            C18070vi.A0d(r43, 0);
            List list = r43.A00;
            if (!list.isEmpty()) {
                LinkedList A14 = AnonymousClass8BR.A14();
                int i3 = 0;
                while (i3 < list.size()) {
                    C195139sr r0 = (C195139sr) list.get(i3);
                    A14.add(new C194819sL((Drawable) null, new C20506ANr(r0, r7, i3), new AnonymousClass9a3(r0, r7), r0.A02));
                    i3++;
                    if (i3 >= 6) {
                        break;
                    }
                }
                if (list.size() > 6) {
                    CategoryMediaCard categoryMediaCard = r7.A01;
                    r1 = new C194819sL(C24261Jm.A00(categoryMediaCard.getContext(), 2131231213), new C20505ANq(r7), (AnonymousClass9a3) null, C18070vi.A0F(categoryMediaCard.getContext(), 2131887969));
                } else {
                    r1 = null;
                }
                CategoryMediaCard categoryMediaCard2 = r7.A01;
                categoryMediaCard2.setup(A14, r1);
                categoryMediaCard2.setVisibility(0);
            }
        } else if (this instanceof C168798jh) {
            C18070vi.A0d(r4, 0);
            ((C168798jh) this).A00.setVisibility(0);
        } else if (this instanceof C168768je) {
        } else {
            if (this instanceof C168838jl) {
                C168838jl r44 = (C168838jl) this;
                AnonymousClass11S r3 = r44.A03;
                UserJid userJid = r44.A08;
                if (r3.A0O(userJid)) {
                    C167938i1 r02 = r44.A04;
                    if (AnonymousClass9PM.A00(r3, r02.A0B, r02.A00, userJid)) {
                        AnonymousClass1GP r8 = r44.A02;
                        View A05 = C18070vi.A05(r44.A01, 2131428893);
                        C18030ve r72 = r44.A06;
                        C36401np r9 = r44.A09;
                        AnonymousClass18K r32 = r44.A07;
                        AnonymousClass11C r5 = r44.A05;
                        TextView A0E = AnonymousClass3Ma.A0E(A05, 2131432045);
                        C21424Ajr ajr = new C21424Ajr(r8, 40);
                        Context A04 = AnonymousClass3MY.A04(A0E);
                        SpannableStringBuilder A06 = r9.A06(A04, new C21424Ajr(ajr, 41), C18070vi.A0F(A0E.getContext(), 2131891650), "linked-catalog-banner-learn-more", AnonymousClass1YL.A00(A04, 2130971981, 2131103159));
                        AnonymousClass3Ma.A1I(A0E, r72);
                        AnonymousClass3MZ.A1Q(A0E, r5);
                        A0E.setText(A06);
                        C825248h.A00(AnonymousClass1HF.A06(A05, 2131432041), ajr, r32, 9);
                        view = r44.A00;
                        i2 = 0;
                        view.setVisibility(i2);
                        return;
                    }
                }
                view = r44.A00;
                i2 = 8;
                view.setVisibility(i2);
                return;
            }
            C168828jk r73 = (C168828jk) this;
            View view2 = r73.A0H;
            view2.setVisibility(0);
            LinearLayout linearLayout = r73.A02;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            Button button = r73.A01;
            if (button != null) {
                button.setVisibility(8);
            }
            TextView textView = r73.A03;
            if (textView != null) {
                textView.setVisibility(8);
            }
            int i4 = r73.A00;
            String str = null;
            if (i4 != 1) {
                if (i4 == 2) {
                    context = view2.getContext();
                    i = 2131888010;
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        C72453Mb.A1D(linearLayout);
                        return;
                    } else {
                        context = view2.getContext();
                        i = 2131887975;
                    }
                }
                String string = context.getString(i);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (string != null && textView != null) {
                    textView.setVisibility(0);
                    textView.setText(string);
                    return;
                }
                return;
            }
            AnonymousClass11S r03 = r73.A05;
            UserJid userJid2 = r73.A09;
            if (!r03.A0O(userJid2)) {
                C42741yf A02 = r73.A07.A02(userJid2);
                if (A02 != null) {
                    str = A02.A08;
                }
                Context context2 = view2.getContext();
                Object[] objArr = new Object[1];
                if (AnonymousClass1EG.A0H(str)) {
                    str = r73.A08.A0I(r73.A06.A0H(userJid2));
                }
                String A10 = AnonymousClass3Ma.A10(context2, str, objArr, 0, 2131887568);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(A10);
                }
                if (button != null) {
                    button.setText(2131887567);
                    button.setVisibility(0);
                    AnonymousClass3Ma.A1C(button, r73, 29);
                }
            }
        }
    }
}
