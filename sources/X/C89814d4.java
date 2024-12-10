package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;

/* renamed from: X.4d4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89814d4 implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass1L9 A01;
    public final /* synthetic */ BusinessProfileFieldView A02;
    public final /* synthetic */ AnonymousClass72R A03;
    public final /* synthetic */ C1417376t A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onClick(View view) {
        AnonymousClass72R r5 = this.A03;
        String str = this.A06;
        Integer num = this.A05;
        boolean z = this.A07;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        C1417376t r4 = this.A04;
        AnonymousClass1L9 r3 = this.A01;
        BusinessProfileFieldView businessProfileFieldView = this.A02;
        Uri uri = this.A00;
        r5.A07((Integer) null, num, str, 6, z, z2);
        if (z3) {
            r5.A03(r4, 9);
        }
        Context context = businessProfileFieldView.getContext();
        C18070vi.A0b(uri);
        r3.A08(context, AnonymousClass1LU.A1p(uri));
    }

    public /* synthetic */ C89814d4(Uri uri, AnonymousClass1L9 r2, BusinessProfileFieldView businessProfileFieldView, AnonymousClass72R r4, C1417376t r5, Integer num, String str, boolean z, boolean z2, boolean z3) {
        this.A03 = r4;
        this.A06 = str;
        this.A05 = num;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = businessProfileFieldView;
        this.A00 = uri;
    }
}
