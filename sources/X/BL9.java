package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

public class BL9 extends C39401t1 {
    public AnonymousClass1XU A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BL9(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    public int A1b(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A03;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A06;
                if (i >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A002 = RCTextView.A00(rCTextView, (int) f, (int) f2);
                if (A002 >= spanStart && A002 <= spanEnd) {
                    return i;
                }
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void A1f(int i, boolean z) {
        RCTextView rCTextView = this.A01;
        if (rCTextView.A06[i] instanceof BGV) {
            rCTextView.invalidate();
        }
    }

    public void A1h(C26228CvK cvK, int i) {
        int lineVisibleEnd;
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A03;
        Rect A07 = AnonymousClass3MW.A07();
        ClickableSpan[] clickableSpanArr = rCTextView.A06;
        if (clickableSpanArr == null || i >= clickableSpanArr.length) {
            cvK.A0X("");
            cvK.A02.setBoundsInParent(A07);
            return;
        }
        ClickableSpan clickableSpan = clickableSpanArr[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A02.getLineForOffset(spanStart);
        int lineForOffset2 = rCTextView.A02.getLineForOffset(spanEnd);
        Path A0L = C108945cZ.A0L();
        RectF A08 = AnonymousClass3MW.A08();
        if (lineForOffset == lineForOffset2) {
            lineVisibleEnd = spanEnd;
        } else {
            lineVisibleEnd = rCTextView.A02.getLineVisibleEnd(lineForOffset);
        }
        rCTextView.A02.getSelectionPath(spanStart, lineVisibleEnd, A0L);
        A0L.computeBounds(A08, true);
        A08.offset(rCTextView.A00, rCTextView.A01);
        A08.round(A07);
        cvK.A02.setBoundsInParent(A07);
        cvK.A0f(true);
        cvK.A0i(true);
        cvK.A0h(true);
        cvK.A0s(true);
        cvK.A0X(spanned.subSequence(spanStart, spanEnd));
        cvK.A0O("android.widget.Button");
        if (clickableSpan instanceof BGV) {
            BGV bgv = (BGV) clickableSpan;
            String str = bgv.A00;
            String str2 = bgv.A01;
            if (str2 == null) {
                str2 = "Link";
            }
            if (str != null) {
                cvK.A0Q(str);
            }
            C24566C9n.A00(rCTextView.getContext(), (View) null, cvK, str2);
        }
    }

    public void A1i(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A06;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                BE7.A11(i, list);
            }
        }
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        RCTextView rCTextView = this.A01;
        rCTextView.A06[i].onClick(rCTextView);
        return true;
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        super.A1U(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A03)) {
            accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
        }
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        CharSequence A012 = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(A012)) {
            cvK.A0X(A012);
            cvK.A0A(256);
            cvK.A0A(512);
            cvK.A0B(31);
            cvK.A0A(A7Y.A0F);
        }
        AnonymousClass1XU r0 = this.A00;
        if (r0 != null) {
            r0.A1Z(view, cvK);
        }
    }
}
