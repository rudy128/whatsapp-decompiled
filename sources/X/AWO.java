package X;

import android.content.Context;

public final /* synthetic */ class AWO implements B8N {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8F9 A01;
    public final /* synthetic */ AF0 A02;

    public final void C4B(Context context) {
        AnonymousClass8F9 r7 = this.A01;
        int i = this.A00;
        AF0 af0 = this.A02;
        if (r7.A09.A00(r7.A0H)) {
            A17 a17 = r7.A0E;
            C171608rz r1 = new C171608rz();
            r1.A01 = C17880vN.A0l();
            r1.A09 = Long.valueOf((long) i);
            r1.A04 = 0;
            A17.A00(r1, a17);
        }
        r7.A0C.A01(AnonymousClass1L9.A00(context), af0);
    }

    public /* synthetic */ AWO(AnonymousClass8F9 r1, AF0 af0, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = af0;
    }
}
