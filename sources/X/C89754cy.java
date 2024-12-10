package X;

import android.view.View;

/* renamed from: X.4cy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89754cy implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C74193Yw A02;
    public final /* synthetic */ AnonymousClass3X1 A03;

    public final void onClick(View view) {
        C74193Yw r0 = this.A02;
        float f = this.A00;
        r0.A0H.postDelayed(new AnonymousClass7RP(this.A03, this.A01, 44), (long) f);
    }

    public /* synthetic */ C89754cy(C74193Yw r1, AnonymousClass3X1 r2, float f, int i) {
        this.A02 = r1;
        this.A00 = f;
        this.A03 = r2;
        this.A01 = i;
    }
}
