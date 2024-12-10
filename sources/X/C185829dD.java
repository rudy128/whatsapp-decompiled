package X;

/* renamed from: X.9dD  reason: invalid class name and case insensitive filesystem */
public class C185829dD {
    public final C186689eb A00;
    public final C186689eb A01;
    public final boolean A02;

    public C185829dD(String str, boolean z) {
        this.A02 = z;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            C186689eb r0 = new C186689eb(str, z);
            this.A00 = r0;
            this.A01 = r0;
            return;
        }
        this.A01 = new C186689eb(AnonymousClass8BS.A0o(str, indexOf), z);
        this.A00 = new C186689eb(str.substring(indexOf + 1), z);
    }
}
