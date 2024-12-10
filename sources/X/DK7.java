package X;

public final class DK7 implements E81 {
    public E81[] A00;

    public final boolean CT4(Class cls) {
        E81[] e81Arr = this.A00;
        int i = 0;
        while (!e81Arr[i].CT4(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public final E29 CTG(Class cls) {
        E81[] e81Arr = this.A00;
        int i = 0;
        do {
            E81 e81 = e81Arr[i];
            if (e81.CT4(cls)) {
                return e81.CTG(cls);
            }
            i++;
        } while (i < 2);
        String A0l = BE7.A0l(cls);
        throw BE6.A0v(BE9.A0o("No factory is available for message type: ", A0l, A0l.length()));
    }
}
