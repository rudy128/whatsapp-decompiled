package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1;
import com.whatsapp.biz.BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1;

/* renamed from: X.4d8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89854d8 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass1L9 A00;
    public final /* synthetic */ BusinessProfileFieldView A01;
    public final /* synthetic */ AnonymousClass72R A02;
    public final /* synthetic */ C1417376t A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void onClick(View view) {
        AnonymousClass72R r13 = this.A02;
        String str = this.A05;
        boolean z = this.A07;
        Integer num = this.A04;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        boolean z4 = this.A0A;
        C1417376t r3 = this.A03;
        String str2 = this.A06;
        BusinessProfileFieldView businessProfileFieldView = this.A01;
        AnonymousClass1L9 r7 = this.A00;
        r13.A07(Integer.valueOf(C72453Mb.A03(z ? 1 : 0)), num, str, 2, z2, z3);
        if (z4) {
            r13.A03(r3, 10);
        }
        Context A042 = AnonymousClass3MY.A04(businessProfileFieldView);
        Context applicationContext = A042.getApplicationContext();
        C18070vi.A0X(applicationContext);
        AnonymousClass10D r8 = (AnonymousClass10D) AnonymousClass00E.A00(applicationContext, AnonymousClass10D.class);
        C18030ve BAL = r8.BAL();
        AnonymousClass10E r2 = (AnonymousClass10E) r8;
        r2.ABd.get();
        if (C18020vd.A05(C18040vf.A02, BAL, 11977)) {
            if (str == null || str.length() == 0) {
                ((C26031Qo) r2.A32.get()).A00(C80453xC.A00, "bizJid is null");
            } else {
                AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r2);
                C23771Ho A002 = C27011Uj.A00();
                C18600wl A1C = AnonymousClass3MZ.A1C(r2);
                AnonymousClass1FY r0 = (AnonymousClass1FY) AnonymousClass1L9.A01(A042, AnonymousClass1FY.class);
                C37581pm A003 = AnonymousClass2SS.A00(r0);
                BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1 businessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1 = new BusinessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1(r0, (C30391dr) null);
                AnonymousClass1OR r1 = AnonymousClass1OR.A00;
                Integer num2 = AnonymousClass00R.A00;
                C30451dy.A02(num2, A002, new BusinessProfileLinkifier$fetchAndOpenShimmedUrl$1(A042, r7, r8, (C26031Qo) r2.A32.get(), A0Z, str, str2, (C30391dr) null, A1C, C30451dy.A02(num2, r1, businessProfileLinkifier$fetchAndOpenShimmedUrl$loadingJob$1, A003)), A003);
                return;
            }
        }
        r7.A08(A042, AnonymousClass1LU.A1p(C87364Vh.A00(C87364Vh.A01(str2))));
    }

    public /* synthetic */ C89854d8(AnonymousClass1L9 r1, BusinessProfileFieldView businessProfileFieldView, AnonymousClass72R r3, C1417376t r4, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = r3;
        this.A05 = str;
        this.A07 = z;
        this.A04 = num;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = r4;
        this.A06 = str2;
        this.A01 = businessProfileFieldView;
        this.A00 = r1;
    }
}
