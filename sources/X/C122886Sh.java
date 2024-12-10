package X;

/* renamed from: X.6Sh  reason: invalid class name and case insensitive filesystem */
public final class C122886Sh extends Exception {
    public final int downloadStatus;

    public C122886Sh(int i) {
        this.downloadStatus = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DownloadResultException{downloadStatus=");
        A10.append(C1409173o.A01(this.downloadStatus));
        return C17890vO.A0b(A10);
    }
}
