package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.8Hj  reason: invalid class name and case insensitive filesystem */
public class C161698Hj extends C38391rD {
    public String A00 = "WhatsappPay";
    public final AnonymousClass11C A01;
    public final C18030ve A02;
    public final List A03 = AnonymousClass000.A13();

    public int A0Q() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        String str;
        String str2;
        SpannableString spannableString;
        C162088Ix r82 = (C162088Ix) r8;
        C187439fo r3 = (C187439fo) this.A03.get(i);
        r82.A02.setChecked(r3.A00);
        AEZ aez = r3.A03;
        C194039r4 r1 = aez.A03;
        if (r1.A01) {
            r82.A01.setVisibility(0);
            SpannableString spannableString2 = r1.A00;
            if (!TextUtils.isEmpty(spannableString2)) {
                r82.A05.setText(spannableString2);
            }
        }
        int i2 = aez.A00;
        if (i2 != 0) {
            r82.A06.setImageResource(i2);
            View view = r82.A00;
            view.setVisibility(0);
            if (aez.A0C) {
                view.setBackground((Drawable) null);
            }
        }
        C28931bI r2 = r82.A07;
        r2.A04(8);
        C194019r2 r12 = aez.A01;
        if (r12.A01 && (spannableString = r12.A00) != null) {
            ((TextView) AnonymousClass3MY.A0I(r2, 0)).setText(spannableString);
        }
        A2H a2h = r3.A02;
        if (a2h != null) {
            str = A2H.A00(a2h, aez.A09, aez.A08);
            str2 = A2H.A00(a2h, aez.A07, aez.A06);
        } else {
            str = aez.A08;
            str2 = aez.A06;
        }
        if (!TextUtils.isEmpty(str)) {
            r82.A04.setText(str);
        }
        C194029r3 r13 = aez.A02;
        if (r13.A01) {
            SpannableString spannableString3 = r13.A00;
            TextEmojiLabel textEmojiLabel = r82.A03;
            textEmojiLabel.setText(spannableString3);
            textEmojiLabel.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel2 = r82.A03;
            textEmojiLabel2.setText(str2);
            textEmojiLabel2.setVisibility(0);
        }
        AFT.A00(r82.A0H, r82, r3, 32);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 0 || i == 1) {
            List list = C42011xT.A0I;
            C18030ve r3 = this.A02;
            return new C162088Ix(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626338), this.A01, r3);
        }
        throw AnonymousClass000.A0n("PaymentOptionsBottomSheetAdapter/onCreateViewHolder/unhandled view type");
    }

    public int getItemViewType(int i) {
        return ((C187439fo) this.A03.get(i)).A01;
    }

    public C161698Hj(AnonymousClass11C r2, C18030ve r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
