package X;

public final class DJL implements E7z {
    public final E7z[] A00;

    public DJL(E7z... e7zArr) {
        this.A00 = e7zArr;
    }

    public final C28453E1t CTD(Class cls) {
        E7z[] e7zArr = this.A00;
        int i = 0;
        do {
            E7z e7z = e7zArr[i];
            if (e7z.zzc(cls)) {
                return e7z.CTD(cls);
            }
            i++;
        } while (i < 2);
        throw BE6.A0v("No factory is available for message type: ".concat(BE7.A0l(cls)));
    }

    public final boolean zzc(Class cls) {
        E7z[] e7zArr = this.A00;
        int i = 0;
        while (!e7zArr[i].zzc(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
