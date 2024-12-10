package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.6Ba  reason: invalid class name and case insensitive filesystem */
public final class C120016Ba extends C111895kb {
    public final C40431uh A00 = new C40431uh((C40411uf) new C111565jv(6), (C38391rD) this);
    public final AnonymousClass1L9 A01;
    public final C24921Me A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120016Ba(AnonymousClass1F9 r9, AnonymousClass1L9 r10, C24921Me r11, C37451pZ r12, C132806nc r13, C111205iq r14, boolean z) {
        super(r9, r12, r13, r14, z);
        C18070vi.A0d(r13, 5);
        this.A02 = r11;
        this.A01 = r10;
    }

    public void Bmc(C42011xT r11, int i) {
        String str;
        AnonymousClass1BI r0;
        AnonymousClass1E7 r02;
        AnonymousClass1E7 r9;
        C18070vi.A0d(r11, 0);
        C126166cI r1 = (C126166cI) this.A00.A02.get(i);
        if ((r1 instanceof AnonymousClass6BW) && (r11 instanceof C113365my)) {
            C135836sq r4 = ((AnonymousClass6BW) r1).A00;
            C113365my r112 = (C113365my) r11;
            C134826rD r2 = r4.A00;
            AnonymousClass78A r5 = null;
            if (r2 != null) {
                AnonymousClass1E7 r6 = r2.A00;
                if (r6 == null) {
                    String str2 = r2.A01;
                    if (str2 != null) {
                        r112.A04.A02.A00(r112.A03, str2);
                    }
                } else {
                    r112.A04.A01.A07(r112.A03, r6);
                }
            }
            TextEmojiLabel textEmojiLabel = r112.A02;
            textEmojiLabel.A0S(r4.A03, (List) null, 0, false);
            TextView textView = r112.A01;
            if (r2 == null || (r9 = r2.A00) == null) {
                str = null;
            } else {
                str = r112.A04.A02.A0F(r9, -1, false, true).A01;
            }
            textView.setText(str);
            View view = r112.A0H;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(textEmojiLabel.getText());
            A10.append(' ');
            view.setContentDescription(C17890vO.A0V(textView.getText(), A10));
            if (r2 == null || (r02 = r2.A00) == null) {
                r0 = null;
            } else {
                r0 = r02.A0J;
            }
            UserJid A002 = C22941Dw.A00(r0);
            if (A002 != null) {
                r5 = new AnonymousClass78A(r112.A04, r112, A002, 21);
            }
            view.setOnClickListener(r5);
            if (this.A04) {
                C111205iq r03 = this.A03;
                ImageView imageView = r112.A00;
                AnonymousClass206 r42 = r4.A01;
                C18070vi.A0d(imageView, 0);
                AnonymousClass1DT A0S = C108945cZ.A0S();
                r03.A08.A0D(imageView, r42, new AnonymousClass7NG(imageView, A0S, 1));
                AnonymousClass7AS.A00(this.A00, A0S, new C1582680a(r112), 3);
            }
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            i2 = 2131626238;
        } else {
            List list2 = C42011xT.A0I;
            i2 = 2131626237;
            if (i != 2) {
                return new C113365my(C108995ce.A0K(2131626236, viewGroup), this);
            }
        }
        return new C112995mN(C108995ce.A0K(i2, viewGroup), this);
    }

    public int getItemViewType(int i) {
        return ((C126166cI) this.A00.A02.get(i)).A00.intValue();
    }
}
