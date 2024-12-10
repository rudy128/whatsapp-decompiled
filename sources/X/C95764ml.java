package X;

import android.content.res.Resources;
import android.os.Handler;

/* renamed from: X.4ml  reason: invalid class name and case insensitive filesystem */
public class C95764ml implements C72233Ld {
    public final Resources A00;
    public final Handler A01 = C17890vO.A0D();
    public final int[] A02;
    public final /* synthetic */ C95924n1 A03;

    public /* bridge */ /* synthetic */ void C2Y(Object obj) {
        C117025z5 r3 = new C117025z5(this.A02);
        long A002 = C43291zZ.A00(r3, false);
        this.A01.post(new AnonymousClass3C3(this, this.A03.A0C.A06(this.A00, (C72233Ld) null, r3, A002), 13, A002));
    }

    public C95764ml(Resources resources, C95924n1 r3, int[] iArr) {
        this.A03 = r3;
        this.A02 = iArr;
        this.A00 = resources;
    }

    public void Bsl() {
    }
}
