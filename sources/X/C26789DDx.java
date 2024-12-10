package X;

/* renamed from: X.DDx  reason: case insensitive filesystem */
public class C26789DDx implements C28495E4a {
    public E9R BHP(EAJ eaj, int i, int i2, boolean z) {
        boolean z2 = false;
        try {
            if ((eaj.BR3().A00 & 32) != 0) {
                z2 = true;
            }
        } catch (UnsupportedOperationException unused) {
        }
        C26775DDe dDe = new C26775DDe(i, i2, z2);
        if (z) {
            dDe.A00.A00();
        }
        return dDe;
    }
}
