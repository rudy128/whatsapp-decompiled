package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.8cv  reason: invalid class name and case insensitive filesystem */
public class C166458cv extends BV6 {
    public final /* synthetic */ DFL A00;
    public final /* synthetic */ C26025Cqj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166458cv(DOZ doz, DFL dfl, DFL dfl2, C26025Cqj cqj) {
        super(doz, dfl);
        this.A01 = cqj;
        this.A00 = dfl2;
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, DOZ doz, DFL dfl, Object obj) {
        Number number;
        Number number2;
        String str;
        String str2;
        DOZ doz2 = doz;
        Context context = doz2.A00;
        DFL dfl2 = this.A00;
        String A0D = dfl2.A0D(40);
        String A0D2 = dfl2.A0D(35);
        long A05 = dfl2.A05(48, 0);
        int A04 = dfl2.A04(43, 0);
        Boolean bool = Boolean.FALSE;
        boolean z = !bool.equals(Boolean.valueOf(dfl2.A0I(38, true)));
        boolean equals = true ^ bool.equals(Boolean.valueOf(dfl2.A0I(46, false)));
        String A0D3 = dfl2.A0D(41);
        String A0D4 = dfl2.A0D(45);
        String A0D5 = dfl2.A0D(50);
        C190459ky r4 = new C190459ky(doz2, dfl2, this);
        C26025Cqj cqj = this.A01;
        View view2 = view;
        TextInputEditText textInputEditText = (TextInputEditText) AnonymousClass1HF.A06(view2, 2131431461);
        TextInputLayout textInputLayout = (TextInputLayout) AnonymousClass1HF.A06(view2, 2131431644);
        if (A0D != null) {
            textInputLayout.setHint((CharSequence) A0D);
            if ("wa_flows".equals(A0D5)) {
                boolean BgG = AnonymousClass1X4.A01.BgG(A0D, A0D.length());
                int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
                if (!BgG ? layoutDirectionFromLocale == 1 : layoutDirectionFromLocale != 1) {
                    textInputEditText.setGravity(8388613);
                }
            }
        }
        Calendar instance = Calendar.getInstance();
        if (!TextUtils.isEmpty(A0D2)) {
            Date A012 = A3L.A01(A0D2);
            if (A012 != null) {
                C17960vV.A07(A012);
                textInputEditText.setText(DateFormat.getDateInstance(1).format(A012));
                instance.setTime(A012);
            }
        } else if (A05 > 0) {
            Date date = new Date(A05);
            C17960vV.A07(date);
            textInputEditText.setText(DateFormat.getDateInstance(1).format(date));
            instance.setTime(date);
        } else if (A04 != 0) {
            instance.set(1, instance.get(1) + A04);
        }
        A9H a9h = new A9H(r4, 0);
        textInputLayout.setEnabled(z);
        textInputEditText.setEnabled(z);
        textInputEditText.setClickable(z);
        try {
            str2 = A0D3;
            Number valueOf = Long.valueOf(Long.parseLong(A0D3));
            str2 = valueOf;
            number = valueOf;
        } catch (NumberFormatException unused) {
            C17900vP.A0e("WaBkComponentConfiguratorImpl/WaDatePicker/bind Max date is not a valid date format", str2, AnonymousClass000.A10());
            number = null;
        }
        try {
            str = A0D4;
            Number valueOf2 = Long.valueOf(Long.parseLong(A0D4));
            str = valueOf2;
            number2 = valueOf2;
        } catch (NumberFormatException unused2) {
            C17900vP.A0e("WaBkComponentConfiguratorImpl/WaDatePicker/bind Min date is not a valid date format", str, AnonymousClass000.A10());
            number2 = null;
        }
        if (z) {
            C26025Cqj.A00(textInputEditText, textInputLayout, equals);
            AnonymousClass8Dv r14 = new AnonymousClass8Dv(a9h, context, (Calendar) null, 2132083202, instance.get(1), instance.get(2), AnonymousClass8BT.A02(instance));
            if (number != null) {
                r14.A01.setMaxDate(number.longValue());
            }
            if (number2 != null) {
                r14.A01.setMinDate(number2.longValue());
            }
            AnonymousClass3MZ.A1I(textInputEditText, r14, 31);
            textInputEditText.addTextChangedListener(new AF6(textInputEditText, textInputLayout, cqj, equals));
            textInputLayout.setEndIconOnClickListener(new AFB(r4, 32));
            return null;
        }
        textInputEditText.setOnClickListener((View.OnClickListener) null);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, DOZ doz, DFL dfl) {
        TextView A0J = AnonymousClass3MW.A0J(view, 2131431461);
        A0J.setOnClickListener((View.OnClickListener) null);
        A0J.setText("");
        A0J.setEnabled(false);
        A0J.setClickable(false);
        ((TextInputLayout) AnonymousClass1HF.A06(view, 2131431644)).setHint((CharSequence) "");
    }

    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        return AnonymousClass3MX.A08(context, 2131625055);
    }
}
