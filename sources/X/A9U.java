package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;

public class A9U implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public A9U(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                ((Fragment) this.A01).A1k(new Intent("android.intent.action.VIEW", Uri.parse(this.A02)));
                return;
            case 1:
                Fragment fragment = (Fragment) this.A01;
                fragment.A1k(AnonymousClass1LU.A1N(fragment.A1n(), this.A02));
                return;
            case 2:
                C1763090o r5 = (C1763090o) this.A01;
                String str = this.A02;
                AnonymousClass91y r3 = r5.A04;
                r3.CNA(2131895077);
                ((C1763291s) r3).A4f(new AnonymousClass93D(r5, r3, str), r3.A04.A0A, str);
                return;
            case 3:
                String str2 = this.A02;
                AnonymousClass8BU.A1C(((A5F) this.A01).A0H, C17880vN.A0j(), "prompt_warn_setup_without_recover", str2);
                return;
            default:
                AnonymousClass99S r2 = (AnonymousClass99S) this.A01;
                String str3 = this.A02;
                AnonymousClass4Yv.A00(r2, 22);
                r2.A0B.A01(r2, str3);
                return;
        }
    }
}
