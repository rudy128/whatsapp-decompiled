package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.3Qd  reason: invalid class name */
public class AnonymousClass3Qd extends LinearLayout implements AnonymousClass009 {
    public TextView A00;
    public AnonymousClass18O A01;
    public AnonymousClass031 A02;
    public boolean A03;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(String str) {
        String A07 = this.A01.A07(AnonymousClass18O.A1Z);
        if (TextUtils.isEmpty(A07) || !C20128A8n.A08(str)) {
            if (!TextUtils.isEmpty(A07)) {
                str = null;
            } else {
                setVisibility(8);
                return;
            }
        }
        setWhatsAppContactDetails(A07, str);
    }

    private void setWhatsAppContactDetails(String str, String str2) {
        int i;
        Object[] objArr;
        boolean A08 = C20128A8n.A08(str2);
        Context context = getContext();
        if (A08) {
            i = 2131888862;
            objArr = AnonymousClass3MX.A1b(str, 0);
            objArr[1] = str2;
        } else {
            i = 2131888863;
            objArr = new Object[]{str};
        }
        String string = context.getString(i, objArr);
        SpannableString spannableString = new SpannableString(string);
        URLSpan uRLSpan = new URLSpan(AnonymousClass001.A1H("tel:", str, AnonymousClass000.A10()));
        int indexOf = string.indexOf(str);
        spannableString.setSpan(uRLSpan, indexOf, indexOf + str.length(), 33);
        this.A00.setText(spannableString);
        this.A00.setVisibility(0);
    }
}
