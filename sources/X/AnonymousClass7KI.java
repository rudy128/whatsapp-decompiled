package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7KI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7KI implements C1601087d {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass749 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public final void BzB(Integer num, boolean z) {
        WeakReference weakReference = this.A04;
        AnonymousClass749 r3 = this.A01;
        String str = this.A02;
        int i = this.A00;
        String str2 = this.A03;
        AnonymousClass1FU r2 = (AnonymousClass1FU) C108975cc.A0Z(weakReference);
        if (r2 != null) {
            r3.A03.A0J(new AnonymousClass7R3(r2, r3, str, str2, i));
        }
    }

    public /* synthetic */ AnonymousClass7KI(AnonymousClass749 r1, String str, String str2, WeakReference weakReference, int i) {
        this.A04 = weakReference;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }
}
