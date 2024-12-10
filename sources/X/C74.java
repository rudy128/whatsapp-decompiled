package X;

import android.view.inputmethod.ExtractedText;

public abstract class C74 {
    public static final ExtractedText A00(C26224CvE cvE) {
        ExtractedText extractedText = new ExtractedText();
        String str = cvE.A01.A00;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = cvE.A00;
        extractedText.selectionStart = C26260Cw5.A02(j);
        extractedText.selectionEnd = C26260Cw5.A01(j);
        extractedText.flags = AnonymousClass000.A1Q(AnonymousClass1YF.A0C(str, 10, 0, false)) ^ true ? 1 : 0;
        return extractedText;
    }
}
