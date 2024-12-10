package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6z1  reason: invalid class name and case insensitive filesystem */
public final class C139546z1 {
    public final AnonymousClass00H A00;
    public final C18100vl A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass1KB A03;

    public final boolean A02(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        Iterable iterable = (Iterable) C18070vi.A0E(this.A00);
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C108145bC) it.next()).BgC(r3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!((C437220r) ((AnonymousClass20Z) this.A01.getValue()).A00(r3.A0u)).BgC(r3)) {
            return false;
        }
        return true;
    }

    public static final void A00(AnonymousClass206 r2, C139546z1 r3) {
        r3.A02.A0G("reply-subsytem-render-not-supported", String.valueOf(r2.A0u), false);
    }

    public final void A01(View view, AnonymousClass724 r21, AnonymousClass206 r22, C135486sH r23) {
        int i;
        View view2 = view;
        AnonymousClass206 r12 = r22;
        C18070vi.A0h(r12, view2);
        AnonymousClass724 r10 = r21;
        C18070vi.A0d(r10, 3);
        C437220r r3 = (C437220r) ((AnonymousClass20Z) this.A01.getValue()).A00(r12.A0u);
        if (!r3.BgB(r12)) {
            A00(r12, this);
            return;
        }
        C136606u5 A002 = AnonymousClass6WB.A00(view2);
        A002.A0A.setVisibility(0);
        A002.A00.setVisibility(0);
        TextEmojiLabel textEmojiLabel = A002.A09;
        textEmojiLabel.setVisibility(8);
        textEmojiLabel.setMaxLines(3);
        A002.A07.setVisibility(8);
        A002.A02.setVisibility(8);
        A002.A0B.setVisibility(8);
        A002.A01.setVisibility(8);
        A002.A06.setVisibility(8);
        A002.A03.setVisibility(8);
        A002.A05.setVisibility(8);
        A002.A08.setVisibility(8);
        A002.A04.setVisibility(8);
        AW0 A003 = AnonymousClass25B.A00(r12);
        if (A003 == null || C20128A8n.A07(A003) || (i = A003.A03) == 5 || i == 1000 || A003.A01 == 4) {
            r3.CFF(view2, r10, r12);
        } else {
            AW0 A004 = AnonymousClass25B.A00(r12);
            if (A004 != null) {
                C136606u5 A005 = AnonymousClass6WB.A00(view2);
                Context context = view2.getContext();
                TextView textView = A005.A06;
                View view3 = A005.A01;
                ImageView imageView = A005.A03;
                view3.setVisibility(0);
                textView.setVisibility(0);
                C18070vi.A0b(context);
                C18000vb r14 = r10.A09;
                AnonymousClass1KN r0 = A004.A09;
                if (r0 != null) {
                    AnonymousClass1KJ A012 = A004.A01();
                    C18070vi.A0X(A012);
                    textView.setText(A3U.A01(context, r14, A012, r0, 0, true));
                    C18030ve r9 = r10.A0B;
                    C18040vf r8 = C18040vf.A02;
                    if (C18020vd.A05(r8, r9, 605) || C18020vd.A05(r8, r9, 629)) {
                        AEX A04 = A004.A04();
                        if (A04 != null) {
                            imageView.setVisibility(0);
                            r10.A0C.A02(imageView, textView, A04);
                        } else {
                            imageView.setVisibility(8);
                            imageView.setImageDrawable((Drawable) null);
                            C72463Mc.A0y(context, textView, 2130970705, 2131102112);
                            textView.setTextSize(20.0f);
                        }
                    }
                } else {
                    throw C17880vN.A0g();
                }
            }
        }
        C135486sH r13 = r23;
        r3.CFE(view2, r10, r12, r13);
        CharSequence BXo = r3.BXo(AnonymousClass3MY.A04(view2), AnonymousClass6WB.A00(view2).A09.getPaint(), r12);
        if (BXo != null) {
            this.A03.CGP(new C21468AkZ(BXo, r10, view2, r12, r13, 28));
        }
    }

    public C139546z1(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r4, r3, r2, r5);
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r5;
        this.A01 = AnonymousClass1DF.A01(new C153307pJ(r4));
    }
}
