package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.8Cz  reason: invalid class name and case insensitive filesystem */
public class C161388Cz extends ClickableSpan {
    public final /* synthetic */ C161168Cb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C161388Cz(C161168Cb r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void onClick(View view) {
        RegisterPhone registerPhone = (RegisterPhone) this.A00.A01;
        AnonymousClass1LA r1 = registerPhone.A04;
        String str = this.A01;
        String str2 = this.A02;
        registerPhone.A0L.A03.setText(A9B.A0D(r1, str, str2).substring(str.length() + 2));
        EditText editText = registerPhone.A0L.A03;
        editText.setSelection(AnonymousClass3Ma.A03(editText));
        registerPhone.A4n();
        registerPhone.A05.A08(2131895000, 1);
        C17900vP.A0f("RegisterPhone/suggested/tapped ", str2, AnonymousClass000.A10());
        registerPhone.A14 = true;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
