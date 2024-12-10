package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.5gO  reason: invalid class name and case insensitive filesystem */
public class C110635gO extends LinearLayout implements AnonymousClass009 {
    public ImageView A00;
    public TextView A01;
    public AnonymousClass1QD A02;
    public AnonymousClass031 A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(C20284AEs aEs, String str, String str2) {
        if (aEs == null || TextUtils.isEmpty(str) || !C20128A8n.A08(str2)) {
            setVisibility(8);
        } else {
            setBankContactDetails(aEs, str2, str);
        }
    }

    private void setBankContactDetails(C20284AEs aEs, String str, String str2) {
        Context context = getContext();
        Object[] objArr = new Object[3];
        objArr[0] = aEs.A0B;
        objArr[1] = str2;
        String A0q = C17880vN.A0q(context, str, objArr, 2, 2131897426);
        SpannableString spannableString = new SpannableString(A0q);
        URLSpan uRLSpan = new URLSpan(AnonymousClass001.A1H("tel:", str2, AnonymousClass000.A10()));
        int indexOf = A0q.indexOf(str2);
        spannableString.setSpan(uRLSpan, indexOf, indexOf + str2.length(), 33);
        this.A01.setText(spannableString);
        Bitmap A06 = aEs.A06();
        if (A06 != null) {
            this.A00.setImageBitmap(A06);
            this.A00.setVisibility(0);
        }
        this.A01.setVisibility(0);
    }
}
