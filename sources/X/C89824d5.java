package X;

import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.4d5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89824d5 implements View.OnClickListener {
    public final /* synthetic */ BusinessProfileFieldView A00;
    public final /* synthetic */ AnonymousClass72R A01;
    public final /* synthetic */ C1417376t A02;
    public final /* synthetic */ AnonymousClass689 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onClick(View view) {
        AnonymousClass72R r4 = this.A01;
        String str = this.A05;
        Integer num = this.A04;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        C1417376t r2 = this.A02;
        AnonymousClass689 r11 = this.A03;
        BusinessProfileFieldView businessProfileFieldView = this.A00;
        String str2 = this.A06;
        r4.A07((Integer) null, num, str, 3, z, z2);
        if (z3) {
            r4.A03(r2, 8);
        }
        r11.A09(businessProfileFieldView.getContext(), (String) null, str2, 0.0d, 0.0d);
    }

    public /* synthetic */ C89824d5(BusinessProfileFieldView businessProfileFieldView, AnonymousClass72R r2, C1417376t r3, AnonymousClass689 r4, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A05 = str;
        this.A04 = num;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = businessProfileFieldView;
        this.A06 = str2;
    }
}
