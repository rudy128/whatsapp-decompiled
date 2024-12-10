package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5gQ  reason: invalid class name and case insensitive filesystem */
public class C110645gQ extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public AnonymousClass190 A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass11C A05;
    public C18000vb A06;
    public AnonymousClass1KW A07;
    public C18010vc A08;
    public AnonymousClass031 A09;
    public boolean A0A;
    public final C37471pb A0B;

    public void setMessage(AnonymousClass22H r9, List list) {
        int i;
        String str;
        if (r9 == null) {
            this.A02.A0G("fmessagepoll-null", "fMessagePoll null on search", true);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A03;
        if (list == null || list.isEmpty()) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        String str2 = r9.A05;
        C18000vb r7 = this.A06;
        CharSequence A022 = C43351zf.A02(context, r7, str2, list);
        StringBuilder A10 = AnonymousClass000.A10();
        boolean z = false;
        for (A18 a18 : r9.A07) {
            if (z) {
                str = ", ";
            } else {
                str = "";
            }
            A10.append(str);
            A10.append(a18.A04);
            z = true;
        }
        A00(this.A04, C43351zf.A02(getContext(), r7, A10, list), list);
        A00(textEmojiLabel, A022, list);
    }

    private void A00(TextEmojiLabel textEmojiLabel, CharSequence charSequence, List list) {
        Context context = getContext();
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        TextPaint paint = textEmojiLabel2.getPaint();
        int maxLines = textEmojiLabel2.getMaxLines();
        int measuredWidth = ((View) textEmojiLabel2.getParent()).getMeasuredWidth();
        AnonymousClass1KW r4 = this.A07;
        AnonymousClass11C r2 = this.A05;
        CharSequence charSequence2 = charSequence;
        AnonymousClass11C r16 = r2;
        AnonymousClass2DC r13 = new AnonymousClass2DC(context, paint, r16, this.A06, r4, this.A08, charSequence2, list, maxLines, measuredWidth);
        C143617Ec r11 = new C143617Ec(textEmojiLabel2, 1);
        if (charSequence2.length() <= 768) {
            C43281zY r12 = new C43281zY(charSequence2);
            int length = charSequence2.length();
            int i = 0;
            while (i < length) {
                r12.A00 = i;
                long A002 = C43291zZ.A00(r12, false);
                int A022 = r12.A02(A002, i);
                if (A002 == -1) {
                    i += A022;
                }
            }
            try {
                r11.BpK(r13.call());
                return;
            } catch (AnonymousClass1QC unused) {
                return;
            }
        }
        textEmojiLabel2.setPlaceholder(80);
        this.A0B.A00(r11, r13);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public C110645gQ(Context context, C37471pb r8) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A02 = AnonymousClass3MY.A0N(A0O);
            this.A07 = AnonymousClass3Ma.A0f(A0O);
            this.A05 = AnonymousClass3Ma.A0a(A0O);
            this.A06 = AnonymousClass10E.A6Q(A0O);
            this.A08 = AnonymousClass3Ma.A0r(A0O);
        }
        this.A0B = r8;
        setOrientation(1);
        setGravity(16);
        View.inflate(context, 2131626774, this);
        this.A03 = AnonymousClass3MX.A0V(this, 2131434964);
        this.A04 = AnonymousClass3MX.A0V(this, 2131434965);
        setBackground(AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, 2131232919), AnonymousClass3MZ.A02(getContext(), getContext(), 2130971095, 2131102422)));
        this.A00 = AnonymousClass3Ma.A00(context, 2130970340, 2131101312);
        this.A01 = AnonymousClass3Ma.A00(context, 2130970343, 2131101314);
        C43421zm.A04(this.A03);
        this.A03.setMaxLines(2);
        this.A04.setMaxLines(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168555);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131168556);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }
}
