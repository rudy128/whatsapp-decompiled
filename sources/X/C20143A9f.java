package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.A9f  reason: case insensitive filesystem */
public final /* synthetic */ class C20143A9f implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ A5F A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        A5F a5f = this.A01;
        AnonymousClass1FY r6 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        boolean z = this.A04;
        A5F.A00(r6, a5f);
        AnonymousClass8BU.A1C(a5f.A0H, 160, "prompt_warn_setup_without_recover", str);
        Intent A032 = AnonymousClass8BS.A03(r6);
        A032.putExtra("screen_name", "brpay_p_tos");
        AnonymousClass8k7.A03(A032, "referral_screen", str);
        AnonymousClass8k7.A03(A032, "onboarding_context", str2);
        r6.A3q(A032, z);
    }

    public /* synthetic */ C20143A9f(AnonymousClass1FY r1, A5F a5f, String str, String str2, boolean z) {
        this.A01 = a5f;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }
}
