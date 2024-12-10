package X;

/* renamed from: X.7Oy  reason: invalid class name and case insensitive filesystem */
public class C146397Oy implements AnonymousClass3LQ {
    public final int A00;
    public final Object A01;

    public C146397Oy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onError(int i) {
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            ((C132926ns) obj).A00(new AnonymousClass6OK(i));
        } else {
            ((C30391dr) obj).resumeWith(AnonymousClass6OB.A00(new C122846Sd(i)));
        }
    }
}
