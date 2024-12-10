package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.95K  reason: invalid class name */
public class AnonymousClass95K extends AnonymousClass8IJ {
    public final AnonymousClass4RR A00;
    public final C32091gc A01;
    public final ReadMoreTextView A02;
    public final AnonymousClass1KB A03;
    public final C36361nl A04;
    public final AnonymousClass11C A05;

    public AnonymousClass95K(View view, AnonymousClass1KB r3, C36361nl r4, AnonymousClass4RR r5, AnonymousClass11C r6, C32091gc r7) {
        super(view);
        this.A03 = r3;
        this.A01 = r7;
        this.A04 = r4;
        this.A00 = r5;
        this.A05 = r6;
        this.A02 = (ReadMoreTextView) AnonymousClass1HF.A06(view, 2131433605);
    }

    public static void A00(Spannable spannable, TextEmojiLabel textEmojiLabel, AnonymousClass95K r15, boolean z) {
        Context context = textEmojiLabel.getContext();
        ArrayList A0H = C26302CxJ.A0H(spannable);
        if (A0H != null && !A0H.isEmpty()) {
            Iterator it = A0H.iterator();
            int i = 0;
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                String url = uRLSpan.getURL();
                spannable.setSpan(new C74703cE(context, r15.A04, r15.A03, r15.A05, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i++;
            }
            Iterator it2 = A0H.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
            if (i > 0) {
                if (textEmojiLabel.A01 == null) {
                    AnonymousClass3Ma.A1K(textEmojiLabel, r15.A05);
                }
                textEmojiLabel.A0R(spannable);
            }
        }
        if (textEmojiLabel.A01 != null) {
            textEmojiLabel.setFocusable(false);
            textEmojiLabel.setImportantForAccessibility(0);
        }
        textEmojiLabel.setAccessibilityHelper((C39401t1) null);
        if (!z) {
            return;
        }
        textEmojiLabel.A0R(spannable);
    }
}
