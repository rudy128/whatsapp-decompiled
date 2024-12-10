package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.7Lr  reason: invalid class name and case insensitive filesystem */
public class C145547Lr implements C437220r {
    public final AnonymousClass190 A00;

    public C145547Lr(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean BgC(AnonymousClass206 r2) {
        return false;
    }

    private final void A00(AnonymousClass206 r4, String str) {
        if (!(this instanceof C48572Mz)) {
            this.A00.A0G(str, String.valueOf(r4.A0u), false);
        }
    }

    public CharSequence BXo(Context context, Paint paint, AnonymousClass206 r4) {
        if (this instanceof C48572Mz) {
            return null;
        }
        C18070vi.A0d(r4, 2);
        A00(r4, "reply-unsupported-render-text");
        return null;
    }

    public boolean BgB(AnonymousClass206 r2) {
        if (this instanceof C48572Mz) {
            return true;
        }
        return false;
    }

    public void CFE(View view, AnonymousClass724 r11, AnonymousClass206 r12, C135486sH r13) {
        int A002;
        if (this instanceof C48572Mz) {
            C18070vi.A0o(view, r13, r11);
            if (r12 instanceof AnonymousClass23W) {
                Context context = view.getContext();
                C136606u5 A003 = AnonymousClass6WB.A00(view);
                C72043Kk r2 = r11.A01;
                TextEmojiLabel textEmojiLabel = A003.A0A;
                C42141xh BGE = r2.BGE(textEmojiLabel.getContext(), textEmojiLabel);
                AnonymousClass205 r22 = r12.A0v;
                if (r22.A02) {
                    C18070vi.A0b(context);
                    A002 = AnonymousClass724.A00(context);
                    BGE.A02();
                } else {
                    A002 = AnonymousClass3Ma.A00(context, 2130968814, 2131099894);
                    BGE.A01.A0N();
                    BGE.A0B((List) null, r11.A08.A00.getString(2131890864));
                }
                C18070vi.A0b(context);
                int A05 = AnonymousClass1Z2.A05(AnonymousClass3Ma.A00(context, 2130971964, 2131103119), A002);
                BGE.A01.setTextColor(A05);
                AnonymousClass1M9 r4 = r11.A04;
                AnonymousClass1BI r7 = r22.A00;
                if (r7 != null) {
                    AnonymousClass1E7 A0H = r4.A0H(r7);
                    if (AnonymousClass724.A01(r11, A0H)) {
                        TextView textView = A003.A05;
                        textView.setVisibility(0);
                        textView.setTextColor(A05);
                        TextEmojiLabel textEmojiLabel2 = A003.A08;
                        textEmojiLabel2.setVisibility(0);
                        textEmojiLabel2.setTextColor(A05);
                        textEmojiLabel2.A0S(r11.A05.A0I(A0H), (List) null, 0, false);
                    }
                    AnonymousClass3MX.A1A(context, A003.A00, AnonymousClass1YL.A00(context, 2130968813, 2131099893));
                    if (!AnonymousClass724.A01(r11, r4.A0H(r7))) {
                        C136606u5 A004 = AnonymousClass6WB.A00(view);
                        String str = ((AnonymousClass23W) r12).A00;
                        if (str == null || str.length() == 0) {
                            view.setVisibility(8);
                            return;
                        }
                        TextEmojiLabel textEmojiLabel3 = A004.A08;
                        textEmojiLabel3.A0S(str, (List) null, 0, false);
                        textEmojiLabel3.setVisibility(0);
                        view.setVisibility(0);
                        return;
                    }
                    return;
                }
                throw C17880vN.A0g();
            }
            return;
        }
        A00(r12, "reply-unsupported-render-content");
    }

    public void CFF(View view, AnonymousClass724 r3, AnonymousClass206 r4) {
        if (!(this instanceof C48572Mz)) {
            C18070vi.A0d(r4, 0);
            A00(r4, "reply-unsupported-render-thumb");
        }
    }
}
