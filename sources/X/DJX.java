package X;

public final class DJX implements E80 {
    public E80[] A00;

    public final boolean CT4(Class cls) {
        E80[] e80Arr = this.A00;
        int i = 0;
        while (!e80Arr[i].CT4(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public final E1z CTF(Class cls) {
        E80[] e80Arr = this.A00;
        int i = 0;
        do {
            E80 e80 = e80Arr[i];
            if (e80.CT4(cls)) {
                return e80.CTF(cls);
            }
            i++;
        } while (i < 2);
        String A0l = BE7.A0l(cls);
        throw BE6.A0v(BE9.A0o("No factory is available for message type: ", A0l, A0l.length()));
    }
}
