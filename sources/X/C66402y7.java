package X;

import android.content.Intent;

/* renamed from: X.2y7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66402y7 implements C1598386b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ C25721Pj A02;
    public final /* synthetic */ Integer A03;

    public final void BzV(boolean z) {
        AnonymousClass1FU r6 = this.A01;
        Integer num = this.A03;
        int i = this.A00;
        C25721Pj r3 = this.A02;
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(r6.getPackageName(), "com.whatsapp.bot.home.AIHomeActivity");
        if (num != null) {
            A0A.putExtra("bonsaiDiscoveryEntryPoint", num.intValue());
        }
        r6.startActivityForResult(A0A, i);
        r3.A04(num, z);
    }

    public /* synthetic */ C66402y7(AnonymousClass1FU r1, C25721Pj r2, Integer num, int i) {
        this.A01 = r1;
        this.A03 = num;
        this.A00 = i;
        this.A02 = r2;
    }
}
