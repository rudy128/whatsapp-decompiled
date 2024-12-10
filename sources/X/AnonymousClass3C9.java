package X;

import com.whatsapp.labelitem.view.AddToListViewModel;

/* renamed from: X.3C9  reason: invalid class name */
public class AnonymousClass3C9 implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass3C9(Object obj, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = j;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.2lb] */
    public final void run() {
        int i = this.A00;
        Object obj = this.A03;
        if (i != 0) {
            long j = this.A02;
            AnonymousClass35V.A00(C17880vN.A0V(((AddToListViewModel) obj).A0H), new C41761x1(this.A04, 0, this.A01, -1, j, 0, j, false), 0);
            return;
        }
        String str = this.A04;
        long j2 = this.A02;
        int i2 = this.A01;
        ? obj2 = new Object();
        obj2.A01 = j2;
        obj2.A00 = i2;
        ((C52132aQ) ((C26141Qz) obj).A0C.get()).A00.put(str, obj2);
    }
}
