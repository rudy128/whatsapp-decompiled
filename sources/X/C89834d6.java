package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.biz.profile.TrustSignalItem;

/* renamed from: X.4d6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89834d6 implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AnonymousClass1L9 A01;
    public final /* synthetic */ TrustSignalItem A02;
    public final /* synthetic */ AnonymousClass72R A03;
    public final /* synthetic */ C1417376t A04;
    public final /* synthetic */ AEB A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public final void onClick(View view) {
        Uri uri = this.A00;
        AnonymousClass1L9 r5 = this.A01;
        TrustSignalItem trustSignalItem = this.A02;
        AEB aeb = this.A05;
        AnonymousClass72R r7 = this.A03;
        String str = this.A07;
        Integer num = this.A06;
        boolean z = this.A08;
        boolean z2 = this.A09;
        C1417376t r2 = this.A04;
        Context A042 = AnonymousClass3MY.A04(trustSignalItem);
        r7.A06(num, Integer.valueOf(aeb.A00), str, 15, trustSignalItem.A00, z);
        r5.A08(A042, AnonymousClass1LU.A1p(uri));
        if (z2) {
            r7.A03(r2, 11);
        }
    }

    public /* synthetic */ C89834d6(Uri uri, AnonymousClass1L9 r2, TrustSignalItem trustSignalItem, AnonymousClass72R r4, C1417376t r5, AEB aeb, Integer num, String str, boolean z, boolean z2) {
        this.A00 = uri;
        this.A01 = r2;
        this.A02 = trustSignalItem;
        this.A05 = aeb;
        this.A03 = r4;
        this.A07 = str;
        this.A06 = num;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = r5;
    }
}
