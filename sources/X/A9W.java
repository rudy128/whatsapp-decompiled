package X;

import android.content.DialogInterface;
import android.os.Bundle;

public final /* synthetic */ class A9W implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass91T A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass91T r5 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        dialogInterface.dismiss();
        AnonymousClass10I r1 = r5.A05;
        AnonymousClass6MW r0 = r5.A0T;
        if (r0 != null && r0.A09() == 1) {
            r5.A0T.A0B(false);
        }
        Bundle A0D = C17880vN.A0D();
        A0D.putString("com.whatsapp.support.DescribeProblemActivity.from", str);
        AnonymousClass1LU r13 = r5.A0E;
        AnonymousClass181 r8 = r5.A05;
        AnonymousClass6MW r3 = new AnonymousClass6MW(A0D, r5, r5.A04, r5.A06, r8, r5.A00, (C20284AEs) null, (AW0) null, r5.A0D, r13, r5.A0O, str);
        r5.A0T = r3;
        C17890vO.A0u(r3, r1);
        r5.A0S.BiL(26, str2, (String) null, 1);
    }

    public /* synthetic */ A9W(AnonymousClass91T r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
