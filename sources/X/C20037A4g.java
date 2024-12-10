package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.A4g  reason: case insensitive filesystem */
public class C20037A4g {
    public final AnonymousClass1QS A00;
    public final AnonymousClass93V A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C31061ex A06;
    public final AnonymousClass00H A07;

    public static void A00(Drawable drawable, ImageView imageView, C20284AEs aEs, C20037A4g a4g, boolean z) {
        AnonymousClass8pY r2 = (AnonymousClass8pY) aEs.A08;
        ImageView imageView2 = imageView;
        if (r2 == null || TextUtils.isEmpty(r2.A0E)) {
            Log.w(C17900vP.A0D("PAY: Failed to display card art, card art url missing, re-fetch: ", AnonymousClass000.A10(), z));
            if (z) {
                A01(imageView, aEs, a4g);
                return;
            }
            return;
        }
        AnonymousClass93V r1 = a4g.A01;
        String str = r2.A0E;
        C21068Ady ady = new C21068Ady(imageView, aEs, a4g, z);
        C18070vi.A0d(str, 0);
        AnonymousClass4VT A002 = r1.A00();
        if (A002 != null) {
            A002.A00(drawable, drawable, imageView2, ady, str);
        }
    }

    public static void A01(ImageView imageView, C20284AEs aEs, C20037A4g a4g) {
        C20284AEs aEs2 = aEs;
        AnonymousClass8pT r2 = (AnonymousClass8pT) aEs2.A08;
        if (r2 == null || TextUtils.isEmpty(r2.A0C)) {
            C17900vP.A0Z(r2, "PAY: fetchCardArtImageContentDetails card method data invalid: ", AnonymousClass000.A10());
            return;
        }
        C20037A4g a4g2 = a4g;
        AnonymousClass11P r11 = a4g2.A04;
        Context context = a4g2.A05.A00;
        AnonymousClass1KB r9 = a4g2.A02;
        AnonymousClass11S r10 = a4g2.A03;
        C31061ex r13 = a4g2.A06;
        C188369hJ r7 = new C188369hJ(context, r9, r10, r11, AnonymousClass8BR.A0a(a4g2.A07), r13, new C191139m5(imageView, aEs2, r2, a4g2), aEs2.A0A, r2.A0C);
        String str = r7.A07;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r7.A08;
            if (!TextUtils.isEmpty(str2)) {
                String A002 = AnonymousClass1PP.A00(r7.A02, r7.A03, false);
                C31061ex r92 = r7.A05;
                AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
                C17880vN.A1Q("action", "get-image-content", r22, 0);
                AnonymousClass8BV.A1N("credential-id", str, r22);
                C17890vO.A12("image-content-id", str2, r22);
                AnonymousClass8BV.A1O("nonce", A002, r22);
                r92.A0I(new C175408yf(r7.A00, r7.A04, r7.A01, r7, 3), AnonymousClass8BR.A0k("account", r22), "get", C20113A7w.A0L);
                return;
            }
        }
        r7.A06.A00(A7B.A00(), str);
    }

    public C20037A4g(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass118 r4, C31061ex r5, AnonymousClass1QS r6, AnonymousClass93V r7, AnonymousClass00H r8) {
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r6;
        this.A01 = r7;
        this.A06 = r5;
        this.A07 = r8;
    }

    public void A02(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        A8e.A07(aEs, paymentMethodRow);
        A00(AnonymousClass3MW.A05(this.A05).getDrawable(A8e.A00(((AnonymousClass8pK) aEs).A01)), paymentMethodRow.A00, aEs, this, false);
    }
}
