package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.72F  reason: invalid class name */
public class AnonymousClass72F {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final C19830z4 A02;
    public final C18000vb A03;
    public final AnonymousClass1QQ A04;
    public final C18030ve A05;
    public final C130836k5 A06;
    public final C133086o9 A07;
    public final C132646nG A08;
    public final C133176oI A09;
    public final C138096wW A0A;
    public final C62542rZ A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;

    public void A03(ImageView imageView, AEX aex, int i, int i2, boolean z) {
        AEX aex2 = aex;
        ImageView imageView2 = imageView;
        int i3 = i;
        int i4 = i2;
        if (aex.A01(this.A00.A0H()).exists()) {
            this.A08.A00(imageView, aex, i, i2);
        } else if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A05, 1084)) {
                this.A0B.A03(aex, (AnonymousClass2L3) this.A0D.get());
                return;
            }
            C145207Kj r2 = new C145207Kj(imageView2, aex2, this, i3, i4);
            C17890vO.A0u(new AnonymousClass6MS(r2, this), this.A0C);
        } else {
            C17880vN.A1F(C19830z4.A00(this.A02), "payment_background_batch_require_fetch", true);
        }
    }

    public static void A00(AEX aex, C1601387g r27, AnonymousClass72F r28) {
        C1409173o r1;
        StringBuilder A10;
        AnonymousClass72F r14 = r28;
        C218617r r12 = r14.A00;
        AEX aex2 = aex;
        boolean exists = aex2.A01(r12.A0H()).exists();
        String str = aex2.A0G;
        File file = null;
        if (!"image/webp".equals(str)) {
            A10 = AnonymousClass000.A10();
            A10.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/unsupported mimetype=");
            A10.append(str);
        } else {
            File A012 = aex2.A01(r12.A0H());
            if (!A012.exists()) {
                if (TextUtils.isEmpty(aex2.A05)) {
                    A10 = AnonymousClass000.A10();
                    A10.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/missing url for background id=");
                    A10.append(aex2.A0F);
                } else {
                    C130836k5 r0 = r14.A06;
                    AnonymousClass11P r6 = r0.A03;
                    C18030ve r9 = r0.A05;
                    C1194968j r3 = new C1194968j(r0.A00, r0.A02, r6, r0.A04, aex2, r9, r0.A06, r0.A07, r0.A08, A012);
                    C32431hB r2 = r3.A01;
                    C144807It r13 = r3.A01;
                    String str2 = r3.A00.A05;
                    C17960vV.A07(str2);
                    if (r2.A0F(r13, r3, (C139666zF) null, (AnonymousClass21V) null, str2, false)) {
                        try {
                            r1 = (C1409173o) r3.A02.get();
                        } catch (InterruptedException | ExecutionException e) {
                            Log.e("DuplicatePaymentBackgroundDownloadListener/waitForResult ", e);
                            r1 = new C1409173o(1);
                        }
                    } else {
                        r3.BB6(r3);
                        r1 = r3.A03().A00;
                    }
                    if (!r1.A03()) {
                        A012 = null;
                    }
                }
            }
            file = A012;
            r14.A01.A0J(new C21437Ak4(r14, r27, aex2, file, 17, exists));
        }
        C17890vO.A0w(A10);
        r14.A01.A0J(new C21437Ak4(r14, r27, aex2, file, 17, exists));
    }

    public static void A01(AnonymousClass72F r4, C145187Kh r5) {
        AnonymousClass1QQ r2 = r4.A04;
        Log.i("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker");
        ArrayList A012 = AnonymousClass1QQ.A01(r2, "SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background INNER JOIN payment_background_order ON payment_background_order.background_id=payment_background.background_id ORDER BY payment_background_order.background_order ASC", "payments/QUERY_PAYMENT_BACKGROUNDS_FOR_PICKER");
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker/result size=");
        C17900vP.A0o(A10, A012.size());
        r4.A01.A0J(new C21435Ak2(r4, A012, r5, 27));
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            A00((AEX) it.next(), r5, r4);
        }
    }

    public void A02(ImageView imageView, TextView textView, AEX aex) {
        C29261bv.A09(textView, 4, 20, 2, 2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = textView.getResources().getDimensionPixelSize(2131168410);
        textView.setLayoutParams(layoutParams);
        AEX aex2 = aex;
        textView.setTextColor(aex.A0C);
        textView.requestLayout();
        ImageView imageView2 = imageView;
        imageView.setBackgroundColor(aex.A0A);
        if (!TextUtils.isEmpty(aex.A01)) {
            imageView.setContentDescription(aex.A01);
        }
        A03(imageView2, aex2, imageView.getLayoutParams().width, imageView.getLayoutParams().height, false);
    }

    public void A04(AEX aex) {
        if (!aex.A01(this.A00.A0H()).exists()) {
            if (C18020vd.A05(C18040vf.A02, this.A05, 1084)) {
                this.A0B.A03(aex, (AnonymousClass2L3) this.A0D.get());
                return;
            }
            C17890vO.A0u(new AnonymousClass6MS((C145207Kj) null, this), this.A0C);
        }
    }

    public AnonymousClass72F(C218617r r1, AnonymousClass1KB r2, C19830z4 r3, C18000vb r4, AnonymousClass1QQ r5, C18030ve r6, C130836k5 r7, C133086o9 r8, C132646nG r9, C133176oI r10, C138096wW r11, C62542rZ r12, AnonymousClass10I r13, AnonymousClass00H r14) {
        this.A05 = r6;
        this.A01 = r2;
        this.A0C = r13;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A0D = r14;
        this.A0B = r12;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A0A = r11;
    }
}
