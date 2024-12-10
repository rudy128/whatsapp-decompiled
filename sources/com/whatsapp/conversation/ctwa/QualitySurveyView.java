package com.whatsapp.conversation.ctwa;

import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L8;
import X.AnonymousClass1Y1;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C36361nl;
import X.C39401t1;
import X.C72453Mb;
import X.C72473Md;
import X.C74703cE;
import X.C89914dE;
import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

public final class QualitySurveyView extends WaFrameLayout {
    public AnonymousClass1KB A00;
    public C36361nl A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QualitySurveyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A04();
        LayoutInflater.from(context).inflate(2131627377, this, true);
        setBackgroundResource(2131232852);
        AnonymousClass1HF.A0W(this, AnonymousClass3MW.A00(getResources(), 2131168397));
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setFooter(String str) {
        C18070vi.A0d(str, 0);
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(this, 2131434267);
        AnonymousClass3Ma.A1L(getAbProps(), A0W);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) A09.getSpans(0, A09.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                C72473Md.A0x(A09, uRLSpan, new C74703cE(AnonymousClass3MY.A04(this), (AnonymousClass1L8) getLinkLauncher(), getGlobalUI(), getSystemServices(), (AnonymousClass206) null, uRLSpan.getURL()));
            }
        }
        Rect rect = C39401t1.A0A;
        AnonymousClass3Ma.A1K(A0W, getSystemServices());
        A0W.setText(A09, TextView.BufferType.SPANNABLE);
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setNegativeButtonTitle(String str) {
        C18070vi.A0d(str, 0);
        C72453Mb.A1F(this, str, 2131434269);
    }

    public final void setOnDismissClickedListener(C18090vk r3) {
        C18070vi.A0d(r3, 0);
        C89914dE.A00(findViewById(2131434268), r3, 24);
    }

    public final void setOnNegativeClickedListener(C18090vk r3) {
        C18070vi.A0d(r3, 0);
        C89914dE.A00(findViewById(2131434269), r3, 26);
    }

    public final void setOnPositiveClickedListener(C18090vk r3) {
        C18070vi.A0d(r3, 0);
        C89914dE.A00(findViewById(2131434270), r3, 25);
    }

    public final void setPositiveButtonTitle(String str) {
        C18070vi.A0d(str, 0);
        C72453Mb.A1F(this, str, 2131434270);
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setTitle(String str) {
        C18070vi.A0d(str, 0);
        C72453Mb.A1F(this, str, 2131434271);
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public static final void setOnDismissClickedListener$lambda$3(C18090vk r0, View view) {
        AnonymousClass3Ma.A1Q(r0);
    }

    public static final void setOnNegativeClickedListener$lambda$2(C18090vk r0, View view) {
        AnonymousClass3Ma.A1Q(r0);
    }

    public static final void setOnPositiveClickedListener$lambda$1(C18090vk r0, View view) {
        AnonymousClass3Ma.A1Q(r0);
    }

    public QualitySurveyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A04();
    }

    public /* synthetic */ QualitySurveyView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QualitySurveyView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
