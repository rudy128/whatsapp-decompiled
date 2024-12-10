package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.8dH  reason: invalid class name and case insensitive filesystem */
public final class C166638dH extends C161028Bb {
    public final AnonymousClass1L9 A00;
    public final C18030ve A01;
    public final C195429tK A02;
    public final C36401np A03;
    public final AnonymousClass1LU A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166638dH(Activity activity, AnonymousClass1L9 r10, AnonymousClass11C r11, AnonymousClass11P r12, C18000vb r13, C18030ve r14, AnonymousClass1LU r15, C195429tK r16, C36401np r17) {
        super(activity, r11, r12, r13, r14, 2131626978);
        C18070vi.A0p(r12, r11, r13);
        C18070vi.A0d(r14, 5);
        C36401np r0 = r17;
        C18070vi.A0q(r0, r15, r10);
        this.A01 = r14;
        this.A03 = r0;
        this.A04 = r15;
        this.A00 = r10;
        this.A02 = r16;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C195429tK r0 = this.A02;
        String str = r0.A03;
        String str2 = r0.A00;
        boolean z = r0.A04;
        String str3 = r0.A02;
        String str4 = r0.A01;
        View A002 = C123576Uz.A00(this, 2131435515);
        C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        TextView textView = (TextView) A002;
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        View A003 = C123576Uz.A00(this, 2131435513);
        C18070vi.A0z(A003, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        TextView textView2 = (TextView) A003;
        if (str2 == null || str2.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.A03.A03(textView2.getContext(), str2), TextView.BufferType.SPANNABLE);
            textView2.setMovementMethod(new LinkMovementMethod());
            AnonymousClass3MZ.A1Q(textView2, this.A01);
        }
        if (z) {
            C123576Uz.A00(this, 2131429743).setVisibility(8);
        } else {
            DateFormat dateInstance = DateFormat.getDateInstance(2, this.A02.A0N());
            Activity activity = this.A00;
            Object[] objArr = new Object[2];
            objArr[0] = dateInstance.format(new Date());
            String A10 = AnonymousClass3Ma.A10(activity, activity.getString(2131899103), objArr, 1, 2131896255);
            View A004 = C123576Uz.A00(this, 2131429743);
            C18070vi.A0z(A004, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            TextView textView3 = (TextView) A004;
            textView3.setText(this.A03.A05(textView3.getContext(), new C21428Ajv(this, 16), A10, "date-settings"));
            AnonymousClass3Ma.A1I(textView3, this.A01);
            AnonymousClass3MZ.A1Q(textView3, this.A01);
        }
        View A005 = C123576Uz.A00(this, 2131430155);
        C18070vi.A0z(A005, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        TextView textView4 = (TextView) A005;
        textView4.setText(str3);
        AFV afv = new AFV(22, str4, this);
        textView4.setOnClickListener(afv);
        C123576Uz.A00(this, 2131436547).setOnClickListener(afv);
        C123576Uz.A00(this, 2131428108).setVisibility(8);
        C123576Uz.A00(this, 2131428107).setVisibility(8);
        setOnCancelListener(new A9Q(this, 31));
    }
}
