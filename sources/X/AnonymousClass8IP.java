package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8IP  reason: invalid class name */
public abstract class AnonymousClass8IP extends C42011xT {
    public void A0B(AnonymousClass9XB r13) {
        C20324AGg aGg;
        UserJid userJid;
        AEI aei;
        C22821Di ayd;
        C18090vk au3;
        C18090vk au4;
        if (this instanceof C169458lg) {
            C169458lg r4 = (C169458lg) this;
            C18070vi.A0d(r13, 0);
            C169428ld r5 = (C169428ld) r13;
            C195139sr r3 = r5.A00;
            ((TextView) r4.A02.getValue()).setText(r3.A02);
            View view = r4.A0H;
            view.setOnClickListener(new C90004dN(r4, r13, 1));
            C42491yG.A02(view);
            C20324AGg aGg2 = r4.A00;
            UserJid userJid2 = r5.A01;
            aGg2.A00(r3.A00, userJid2, new C21889AuF(r4), new C21890AuG(r4), new C22163Ayf(r4));
        } else if (this instanceof C169478li) {
            ((ShimmerFrameLayout) ((C169478li) this).A00.getValue()).A03();
        } else if (this instanceof C169488lj) {
            C169488lj r42 = (C169488lj) this;
            C18070vi.A0d(r13, 0);
            ((TextView) r42.A01.getValue()).setText(((C169418lc) r13).A00.A02);
            View view2 = r42.A0H;
            view2.setOnClickListener(new C90004dN(r42, r13, 0));
            ((WaImageView) r42.A00.getValue()).A01 = true;
            C42491yG.A02(view2);
        } else if (!(this instanceof C169438le)) {
            if (this instanceof C169498lk) {
                C169498lk r32 = (C169498lk) this;
                C18070vi.A0d(r13, 0);
                AnonymousClass8lb r132 = (AnonymousClass8lb) r13;
                C195139sr r1 = r132.A00;
                ((TextView) r32.A03.getValue()).setText(r1.A02);
                aGg = r32.A00;
                userJid = r132.A01;
                aei = r1.A00;
                ayd = new C22162Aye(r32);
                au3 = new C21881Au7(r32);
                au4 = new C21882Au8(r32);
            } else {
                C169448lf r33 = (C169448lf) this;
                C18070vi.A0d(r13, 0);
                AnonymousClass8la r133 = (AnonymousClass8la) r13;
                C195139sr r12 = r133.A00;
                ((TextView) r33.A02.getValue()).setText(r12.A02);
                C42491yG.A02(r33.A0H);
                aGg = r33.A00;
                userJid = r133.A01;
                aei = r12.A00;
                ayd = new C22161Ayd(r33);
                au3 = new C21877Au3(r33);
                au4 = new C21878Au4(r33);
            }
            aGg.A00(aei, userJid, au3, au4, ayd);
        }
    }
}
