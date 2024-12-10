package X;

import android.content.DialogInterface;

/* renamed from: X.753  reason: invalid class name */
public final /* synthetic */ class AnonymousClass753 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C126776dH A00;
    public final /* synthetic */ C128066fO A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.A02;
        C126776dH r2 = this.A00;
        boolean z = this.A03;
        C128066fO r3 = this.A01;
        C18070vi.A0d(r3, 3);
        boolean A18 = C18070vi.A18(str, "F");
        C59472mM r0 = r2.A00;
        if (A18) {
            r0.A01(z);
        } else {
            r0.A02(z);
        }
        C115575vO.A00(r3.A00.BM3(), r3.A01, C18070vi.A0M(Boolean.valueOf(z)));
    }

    public /* synthetic */ AnonymousClass753(C126776dH r1, C128066fO r2, String str, boolean z) {
        this.A02 = str;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
    }
}
