package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.6BR  reason: invalid class name */
public final class AnonymousClass6BR extends C112945mI {
    public AnonymousClass85Y A00;
    public final WaTextView A01;

    public /* bridge */ /* synthetic */ void A0B(AnonymousClass6TV r9, int i) {
        WaTextView waTextView = this.A01;
        SpannableString spannableString = new SpannableString(waTextView.getContext().getString(2131888018));
        int A0E = AnonymousClass1YF.A0E(spannableString, "\n", spannableString.length() - 1);
        int length = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(AnonymousClass3MZ.A02(waTextView.getContext(), waTextView.getContext(), 2130968627, 2131099690)), A0E, length, 33);
        waTextView.getContext();
        spannableString.setSpan(new C22628BGo(), A0E, length, 33);
        waTextView.setText(spannableString);
        AnonymousClass3Ma.A19(this.A0H, this, 13);
    }

    public AnonymousClass6BR(View view, AnonymousClass85Y r3) {
        super(view);
        this.A00 = r3;
        this.A01 = AnonymousClass3MW.A0U(view, 2131432664);
    }
}
