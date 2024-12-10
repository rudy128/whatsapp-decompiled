package X;

import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.4rd  reason: invalid class name and case insensitive filesystem */
public final class C98734rd implements Runnable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ ReadMoreTextView A04;

    public void run() {
        CharSequence charSequence;
        CharSequence A002;
        ReadMoreTextView readMoreTextView = this.A04;
        if (readMoreTextView.A00 != 0 && !readMoreTextView.A0T()) {
            int A07 = C72473Md.A07(readMoreTextView, readMoreTextView.getWidth());
            boolean z = false;
            if (A07 < 0) {
                A07 = 0;
            }
            int A042 = C72473Md.A04(readMoreTextView);
            if (A042 < 0) {
                A042 = 0;
            }
            int i = readMoreTextView.getResources().getConfiguration().orientation;
            if ((this.A01 != A07 || this.A00 != A042) && readMoreTextView.getLayout() != null) {
                if (this.A02 == 0 || i != this.A03) {
                    this.A02 = A07;
                }
                this.A01 = A07;
                this.A00 = A042;
                this.A03 = i;
                int i2 = (readMoreTextView.A00 + 3) * 150;
                if (readMoreTextView.A04.length() > i2) {
                    CharSequence charSequence2 = readMoreTextView.A04;
                    charSequence = charSequence2.subSequence(0, AnonymousClass1EG.A00(charSequence2, i2));
                } else {
                    charSequence = readMoreTextView.A04;
                }
                C18070vi.A0b(charSequence);
                StaticLayout BHV = ReadMoreTextView.A0C.BHV(readMoreTextView, charSequence, this.A02);
                if (BHV.getLineCount() > readMoreTextView.A00) {
                    z = true;
                }
                readMoreTextView.A06 = z;
                if (!z) {
                    A002 = readMoreTextView.A04;
                } else if (readMoreTextView.A05 != null) {
                    SpannableStringBuilder append = AnonymousClass3MW.A09("... ").append(readMoreTextView.A05);
                    append.setSpan(new C74683cC(readMoreTextView.getContext(), readMoreTextView, this, readMoreTextView.A01, 0), 4, append.length(), 18);
                    if (readMoreTextView.A07) {
                        append.setSpan(new StyleSpan(1), 4, append.length(), 18);
                    }
                    TextAppearanceSpan textAppearanceSpan = readMoreTextView.A02;
                    if (textAppearanceSpan != null) {
                        append.setSpan(textAppearanceSpan, 4, append.length(), 18);
                    }
                    int lineEnd = BHV.getLineEnd(readMoreTextView.A00 - 1);
                    C18070vi.A0d(charSequence, 0);
                    A002 = A00(append, charSequence, readMoreTextView.A00, lineEnd);
                    if (A002 == null) {
                        A002 = A00(append, charSequence, readMoreTextView.A00, Math.max(0, lineEnd - append.length()));
                        if (A002 == null) {
                            int i3 = readMoreTextView.A00;
                            A002 = A00(append, charSequence, i3, BHV.getLineStart(i3 - 1));
                        }
                    }
                } else {
                    throw AnonymousClass000.A0s("You must specify an rmtvText attribute");
                }
                readMoreTextView.setVisibleText(A002);
            }
        }
    }

    public C98734rd(ReadMoreTextView readMoreTextView) {
        this.A04 = readMoreTextView;
    }

    private final SpannableStringBuilder A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        if (i2 == 0) {
            charSequence2 = "";
        } else {
            int i3 = 0;
            CharSequence subSequence = charSequence.subSequence(0, AnonymousClass1EG.A00(charSequence, i2));
            charSequence2 = "";
            if (!(subSequence == null || subSequence.length() == 0)) {
                int length = subSequence.length();
                int i4 = length - 1;
                while (i3 < length && Character.isWhitespace(subSequence.charAt(i3))) {
                    i3++;
                }
                while (i4 > 0 && Character.isWhitespace(subSequence.charAt(i4))) {
                    i4--;
                }
                if (i4 > i3) {
                    charSequence2 = subSequence.subSequence(i3, i4 + 1);
                }
            }
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(charSequence2);
        A09.append(spannableStringBuilder);
        if (ReadMoreTextView.A0C.BHV(this.A04, A09, this.A02).getLineCount() > i) {
            return null;
        }
        return A09;
    }
}
