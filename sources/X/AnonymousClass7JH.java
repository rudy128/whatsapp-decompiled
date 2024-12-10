package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.style.UnderlineSpan;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

/* renamed from: X.7JH  reason: invalid class name */
public final class AnonymousClass7JH implements AnonymousClass8BD {
    public int A00;
    public AnonymousClass87U A01;
    public TextEntryView A02;
    public final AnonymousClass7JF A03;
    public final C130396jM A04;
    public final boolean A05;

    public void BLM(CharSequence charSequence, int i) {
        float textSize;
        UnderlineSpan[] underlineSpanArr;
        C130396jM r5 = this.A04;
        String obj = charSequence.toString();
        C18070vi.A0d(obj, 0);
        r5.A04 = obj;
        TextEntryView textEntryView = this.A02;
        if (charSequence.length() == 0) {
            DoodleEditText doodleEditText = textEntryView.A05;
            if (doodleEditText != null) {
                textSize = doodleEditText.getTextSize();
            }
            C18070vi.A11("doodleEditText");
            throw null;
        }
        WaTextView waTextView = textEntryView.A01;
        if (waTextView != null) {
            waTextView.setText(charSequence);
            WaTextView waTextView2 = textEntryView.A01;
            if (waTextView2 != null) {
                textSize = waTextView2.getTextSize();
                DoodleEditText doodleEditText2 = textEntryView.A05;
                if (doodleEditText2 != null) {
                    doodleEditText2.setTextSize(0, textSize);
                }
                C18070vi.A11("doodleEditText");
                throw null;
            }
        }
        C18070vi.A11("textHolder");
        throw null;
        r5.A00 = textSize;
        r5.A02 = i;
        if (charSequence instanceof Editable) {
            Spannable spannable = (Spannable) charSequence;
            if (spannable != null && (underlineSpanArr = (UnderlineSpan[]) spannable.getSpans(0, charSequence.length(), UnderlineSpan.class)) != null) {
                for (UnderlineSpan removeSpan : underlineSpanArr) {
                    spannable.removeSpan(removeSpan);
                }
            }
        }
    }

    public void CQh(int i) {
        C130396jM r1 = this.A04;
        if (r1.A01 != i) {
            r1.A01 = i;
            TextEntryView textEntryView = this.A02;
            int i2 = r1.A06.A03;
            DoodleEditText doodleEditText = textEntryView.A05;
            if (doodleEditText != null) {
                doodleEditText.setFontStyle(i);
                DoodleEditText doodleEditText2 = textEntryView.A05;
                if (doodleEditText2 != null) {
                    doodleEditText2.A0L(i2);
                    this.A03.A02 = i;
                    return;
                }
            }
            C18070vi.A11("doodleEditText");
            throw null;
        }
    }

    public void dismiss() {
        AnonymousClass87U r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public AnonymousClass7JH(AnonymousClass7JF r1, C130396jM r2, TextEntryView textEntryView, boolean z) {
        this.A03 = r1;
        this.A02 = textEntryView;
        this.A04 = r2;
        this.A05 = z;
    }
}
