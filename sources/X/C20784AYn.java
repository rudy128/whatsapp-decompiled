package X;

import android.content.DialogInterface;

/* renamed from: X.AYn  reason: case insensitive filesystem */
public class C20784AYn implements BBH {
    public final /* synthetic */ AnonymousClass1FY A00;
    public final /* synthetic */ A5F A01;
    public final /* synthetic */ boolean A02;

    public C20784AYn(AnonymousClass1FY r1, A5F a5f, boolean z) {
        this.A01 = a5f;
        this.A00 = r1;
        this.A02 = z;
    }

    public void Bst(C199169zY r5) {
        A7B a7b = r5.A00;
        if (a7b == null) {
            a7b = A7B.A00();
        }
        int i = a7b.A00;
        A5F a5f = this.A01;
        AnonymousClass1FY r2 = this.A00;
        if (i == 25554) {
            a5f.A04(r2, this.A02);
        } else {
            C20110A7s.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(2131894963)).show();
        }
    }

    public void C3u() {
        this.A01.A04(this.A00, this.A02);
    }
}
