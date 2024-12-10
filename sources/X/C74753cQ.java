package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.3cQ  reason: invalid class name and case insensitive filesystem */
public class C74753cQ extends C161028Bb {
    public final /* synthetic */ AnonymousClass1L9 A00;
    public final /* synthetic */ AnonymousClass194 A01;
    public final /* synthetic */ C40751vD A02;
    public final /* synthetic */ C36531o3 A03;
    public final /* synthetic */ AnonymousClass18K A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DateFormat dateInstance = DateFormat.getDateInstance(2, this.A02.A0N());
        Activity activity = this.A00;
        AnonymousClass194 r11 = this.A01;
        ((TextView) findViewById(2131435513)).setText(AnonymousClass1EG.A01(activity, new Object[]{activity.getString(2131899103), dateInstance.format(r11.A00()), activity.getString(2131887592)}, 2131896258));
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass1EG.A01(activity, new Object[]{dateInstance.format(new Date()), activity.getString(2131899103)}, 2131896255));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = valueOf.getSpanStart(uRLSpan);
                    int spanEnd = valueOf.getSpanEnd(uRLSpan);
                    int spanFlags = valueOf.getSpanFlags(uRLSpan);
                    valueOf.removeSpan(uRLSpan);
                    valueOf.setSpan(new C72693Nd(this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(2131429743);
        textView.setText(valueOf);
        textView.setMovementMethod(new LinkMovementMethod());
        C18030ve r1 = this.A03;
        AnonymousClass18K r10 = this.A04;
        C137096uu.A01(r1, r10, (Integer) null, 0, r11.A00().getTime());
        AnonymousClass78H r8 = new AnonymousClass78H(this, r10, r11, this.A02, this.A03, 0);
        findViewById(2131430155).setOnClickListener(r8);
        findViewById(2131436547).setOnClickListener(r8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74753cQ(Activity activity, AnonymousClass1L9 r10, AnonymousClass194 r11, C40751vD r12, C36531o3 r13, AnonymousClass11C r14, AnonymousClass11P r15, C18000vb r16, C18030ve r17, AnonymousClass18K r18) {
        super(activity, r14, r15, r16, r17, 2131626978);
        this.A01 = r11;
        this.A00 = r10;
        this.A04 = r18;
        this.A02 = r12;
        this.A03 = r13;
    }
}
