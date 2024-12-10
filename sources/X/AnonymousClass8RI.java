package X;

import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.8RI  reason: invalid class name */
public class AnonymousClass8RI extends D4J {
    public Runnable A00;
    public final ADU A01;
    public final TextInputLayout A02;
    public final Runnable A03;
    public final String A04;
    public final DateFormat A05;
    public final /* synthetic */ C180749Nt A06;
    public final /* synthetic */ AJN A07;
    public final /* synthetic */ TextInputLayout A08;

    public AnonymousClass8RI(ADU adu, C180749Nt r4, AJN ajn, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, String str, DateFormat dateFormat) {
        this.A07 = ajn;
        this.A06 = r4;
        this.A08 = textInputLayout2;
        this.A05 = dateFormat;
        this.A02 = textInputLayout;
        this.A01 = adu;
        this.A04 = textInputLayout.getContext().getString(2131899221);
        this.A03 = new C21452AkJ(9, str, this);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextInputLayout textInputLayout = this.A02;
        Runnable runnable = this.A03;
        textInputLayout.removeCallbacks(runnable);
        textInputLayout.removeCallbacks(this.A00);
        textInputLayout.setError((CharSequence) null);
        AJN ajn = this.A07;
        ajn.A01 = null;
        ajn.A00 = null;
        C180749Nt r7 = this.A06;
        r7.A01((Object) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.A05.parse(charSequence.toString());
                textInputLayout.setError((CharSequence) null);
                long time = parse.getTime();
                ADU adu = this.A01;
                if (adu.A04.Bgw(time)) {
                    Calendar A062 = A8Y.A06(adu.A06.A06);
                    A062.set(5, 1);
                    if (A062.getTimeInMillis() <= time) {
                        C21349Aie aie = adu.A05;
                        int i4 = aie.A01;
                        Calendar A063 = A8Y.A06(aie.A06);
                        A063.set(5, i4);
                        if (time <= A063.getTimeInMillis()) {
                            Long A0m = AnonymousClass8BU.A0m(parse);
                            if (A0m == null) {
                                A0m = null;
                            }
                            ajn.A01 = A0m;
                            ajn.A00 = null;
                            r7.A01(A0m);
                            return;
                        }
                    }
                }
                C146487Ph r2 = new C146487Ph(this, time, 2);
                this.A00 = r2;
                textInputLayout.postDelayed(r2, 1000);
            } catch (ParseException unused) {
                textInputLayout.postDelayed(runnable, 1000);
            }
        }
    }
}
