package com.whatsapp.corruptinstallation;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass770;
import X.C132216mP;
import X.C18070vi;
import X.C40751vD;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C72683Nc;
import X.C89924dF;
import X.C91004ez;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class CorruptInstallationActivity extends AnonymousClass1FY {
    public C132216mP A00;
    public C40751vD A01;
    public boolean A02;

    public CorruptInstallationActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (C132216mP) r1.A4S.get();
            this.A01 = C72453Mb.A0d(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624042);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131429676);
        Spanned fromHtml = Html.fromHtml(getString(2131889060));
        C18070vi.A0X(fromHtml);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] A1b = C72473Md.A1b(fromHtml, 0);
        if (A1b != null) {
            int length = A1b.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                URLSpan uRLSpan = A1b[i];
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = A09.getSpanStart(uRLSpan);
                    int spanEnd = A09.getSpanEnd(uRLSpan);
                    int spanFlags = A09.getSpanFlags(uRLSpan);
                    A09.removeSpan(uRLSpan);
                    C132216mP r0 = this.A00;
                    if (r0 == null) {
                        str = "sendFeedback";
                        break;
                    }
                    A09.setSpan(new C72683Nc(r0.A00.A00((Bundle) null, (AnonymousClass770) null, (Integer) null, "corrupt-install", (String) null, (ArrayList) null, (ArrayList) null, false)), spanStart, spanEnd, spanFlags);
                }
                i++;
            }
        }
        A0L.setText(A09);
        A0L.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.A01 != null) {
            View findViewById = findViewById(2131428457);
            TextView A0L2 = AnonymousClass3MX.A0L(this, 2131429677);
            A0L2.setMovementMethod(LinkMovementMethod.getInstance());
            AnonymousClass3MY.A1X(AnonymousClass3Ma.A10(this, "https://www.whatsapp.com/android/", AnonymousClass3MW.A1a(), 0, 2131889062), A0L2);
            C89924dF.A00(findViewById, this, 28);
            AnonymousClass3MX.A1H(this, 2131433892, 8);
            return;
        }
        str = "upgrade";
        C18070vi.A11(str);
        throw null;
    }

    public CorruptInstallationActivity(int i) {
        this.A02 = false;
        C91004ez.A00(this, 42);
    }
}
