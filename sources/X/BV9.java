package X;

import android.content.Context;
import android.util.AttributeSet;

public class BV9 extends AnonymousClass0C5 {
    public int A00 = 0;
    public DFL A01;
    public COI A02 = new Object();
    public final DOZ A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, X.BV1, java.lang.Object, X.0Bz] */
    public /* bridge */ /* synthetic */ Object BHD(Context context) {
        C18070vi.A0d(context, 1);
        ? r1 = new C01930Bz(context, (AttributeSet) null);
        r1.A00 = new CUC(r1);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.COI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.0tO, java.lang.Object] */
    public BV9(DOZ doz, long j, boolean z) {
        super(j);
        this.A03 = doz;
        AnonymousClass0Ij[] r4 = {new AnonymousClass0Ij(new C23686Bnt(doz, this.A07), this), new AnonymousClass0Ij(new Object(), this)};
        int i = 0;
        do {
            A0L(r4[i]);
            i++;
        } while (i < 2);
        if (!z) {
            BE7.A1A(new C26827DFj(this), this);
        }
    }
}
