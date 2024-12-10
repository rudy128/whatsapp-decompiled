package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.35C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35C implements C1601087d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C29681ch A02;
    public final /* synthetic */ C36341nj A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ WeakReference A07;

    public final void BzB(Integer num, boolean z) {
        WeakReference weakReference = this.A07;
        C36341nj r3 = this.A03;
        String str = this.A06;
        C29681ch r2 = this.A02;
        long j = this.A01;
        Integer num2 = this.A04;
        Long l = this.A05;
        int i = this.A00;
        C18070vi.A0d(weakReference, 0);
        Context context = (Context) weakReference.get();
        if (context != null) {
            C36341nj.A00(context, r2, r3, num2, num, l, str, i, j);
        }
    }

    public /* synthetic */ AnonymousClass35C(C29681ch r1, C36341nj r2, Integer num, Long l, String str, WeakReference weakReference, int i, long j) {
        this.A07 = weakReference;
        this.A03 = r2;
        this.A06 = str;
        this.A02 = r1;
        this.A01 = j;
        this.A04 = num;
        this.A05 = l;
        this.A00 = i;
    }
}
