package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Hi  reason: invalid class name and case insensitive filesystem */
public class C161688Hi extends C38391rD {
    public final Map A00 = C17880vN.A11();
    public final C20005A2v A01;
    public final C18000vb A02;
    public final C20279AEn A03;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C162038Is(AnonymousClass3MY.A0B(viewGroup).inflate(2131626335, viewGroup, false), this.A01);
        }
        if (i == 1) {
            return new AnonymousClass8J5(AnonymousClass3MY.A0B(viewGroup).inflate(2131626325, viewGroup, false));
        }
        throw AnonymousClass8BX.A0W("Unsupported view type - ", AnonymousClass000.A10(), i);
    }

    public int A0Q() {
        return this.A03.A0D.A09.size() + 1;
    }

    public void Bmc(C42011xT r22, int i) {
        String str;
        String str2;
        C42011xT r9 = r22;
        C20279AEn aEn = this.A03;
        AEU aeu = aEn.A0D;
        List list = aeu.A09;
        int i2 = i;
        if (i2 < list.size()) {
            AET aet = (AET) list.get(i2);
            C162038Is r92 = (C162038Is) r9;
            C18000vb r8 = this.A02;
            AEI aei = (AEI) this.A00.get(aet.A00());
            AE1 ae1 = aet.A02;
            long j = ae1.A01;
            int i3 = aet.A01;
            String A07 = aEn.A07(r8, new AE1(j * ((long) i3), ae1.A00, ae1.A02));
            WaImageView waImageView = r92.A00;
            Resources A0Y = AnonymousClass000.A0Y(waImageView);
            r92.A03.setText(aet.A04);
            WaTextView waTextView = r92.A02;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, i3);
            waTextView.setText(A0Y.getString(2131893277, A1a));
            r92.A01.setText(A07);
            if (aei == null) {
                waImageView.setImageDrawable(new ColorDrawable(A0Y.getColor(2131103220)));
            } else {
                r92.A04.A04(waImageView, aei, (B7F) null, new ANY(3), 2);
            }
        } else {
            AnonymousClass8J5 r93 = (AnonymousClass8J5) r9;
            C18000vb r82 = this.A02;
            C18070vi.A0d(r82, 0);
            AE1 ae12 = aeu.A06;
            String A072 = aEn.A07(r82, ae12);
            AE1 ae13 = aeu.A03;
            String A073 = aEn.A07(r82, ae13);
            AE1 ae14 = aeu.A04;
            String A074 = aEn.A07(r82, ae14);
            String A075 = aEn.A07(r82, aeu.A05);
            String A06 = aEn.A06(r82);
            String str3 = null;
            if (ae12 == null) {
                str = null;
            } else {
                str = ae12.A02;
            }
            if (ae13 == null) {
                str2 = null;
            } else {
                str2 = ae13.A02;
            }
            if (ae14 != null) {
                str3 = ae14.A02;
            }
            if (!TextUtils.isEmpty(A072) || !TextUtils.isEmpty(A073) || !TextUtils.isEmpty(A074)) {
                AnonymousClass8J5.A01(r93, 0);
                AnonymousClass8J5.A00(r93.A04, r93.A05, r82, r93, (String) null, A075, 2131893254);
                AnonymousClass8J5.A00(r93.A06, r93.A07, r82, r93, str, A072, 2131893255);
                AnonymousClass8J5.A00(r93.A00, r93.A01, r82, r93, str2, A073, 2131893190);
                AnonymousClass8J5.A00(r93.A02, r93.A03, r82, r93, str3, A074, 2131893232);
            } else {
                AnonymousClass8J5.A01(r93, 8);
            }
            r93.A08.setText(A06);
        }
    }

    public int getItemViewType(int i) {
        return AnonymousClass000.A1T(i, this.A03.A0D.A09.size()) ? 1 : 0;
    }

    public C161688Hi(C20005A2v a2v, C18000vb r3, C20279AEn aEn) {
        this.A03 = aEn;
        this.A02 = r3;
        this.A01 = a2v;
    }
}
