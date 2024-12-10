package X;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.components.SuspiciousLinkView;
import com.whatsapp.conversation.comments.ui.CommentTextView;

/* renamed from: X.4ke  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94454ke implements AnonymousClass5ZA {
    public final /* synthetic */ CommentTextView A00;
    public final /* synthetic */ AnonymousClass206 A01;
    public final /* synthetic */ boolean A02;

    public final void CF8(SpannableStringBuilder spannableStringBuilder) {
        String url;
        CommentTextView commentTextView = this.A00;
        AnonymousClass206 r13 = this.A01;
        boolean z = this.A02;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        C18070vi.A0d(spannableStringBuilder2, 3);
        long A002 = (long) ((AnonymousClass4Qh) commentTextView.getSuspiciousLinkHelper().get()).A00(AnonymousClass3MY.A04(commentTextView), spannableStringBuilder2, r13);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), URLSpan.class)) {
            if (!(uRLSpan == null || (url = uRLSpan.getURL()) == null)) {
                int spanStart = spannableStringBuilder2.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder2.getSpanEnd(uRLSpan);
                int spanFlags = spannableStringBuilder2.getSpanFlags(uRLSpan);
                C74703cE A012 = ((C139386yk) commentTextView.getPhoneLinkHelper().get()).A01(commentTextView.getContext(), r13, url);
                if (A012 == null) {
                    A012 = ((AnonymousClass4RL) commentTextView.getGroupLinkHelper().get()).A00(AnonymousClass3MY.A04(commentTextView), r13, url);
                }
                commentTextView.getLinkifierUtils().get();
                Object[] spans = spannableStringBuilder2.getSpans(spanStart, spanEnd, AnonymousClass48p.class);
                C18070vi.A0X(spans);
                AnonymousClass48p[] r15 = (AnonymousClass48p[]) spans;
                int length = r15.length;
                int i = 0;
                if (length != 0) {
                    A012.A03 = true;
                    do {
                        r15[i].A02 = true;
                        i++;
                    } while (i < length);
                }
                spannableStringBuilder2.setSpan(A012, spanStart, spanEnd, spanFlags);
            }
        }
        if (r8 != 0 && !z) {
            AnonymousClass1Y5.A0C(commentTextView, commentTextView.getSystemServices(), commentTextView.getAbProps());
        }
        C28931bI r1 = commentTextView.A09;
        if (r1 != null) {
            if (A002 > 0) {
                ((SuspiciousLinkView) C72463Mc.A0N(r1)).A0M(r8, A002);
            } else {
                r1.A04(8);
            }
        }
        commentTextView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
    }

    public /* synthetic */ C94454ke(CommentTextView commentTextView, AnonymousClass206 r2, boolean z) {
        this.A00 = commentTextView;
        this.A01 = r2;
        this.A02 = z;
    }
}
