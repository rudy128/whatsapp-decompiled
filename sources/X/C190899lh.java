package X;

/* renamed from: X.9lh  reason: invalid class name and case insensitive filesystem */
public class C190899lh {
    public int A00;
    public int A01;
    public boolean A02;
    public final C20282AEq A03;

    public C190899lh(C20282AEq aEq) {
        this.A03 = aEq;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternalLoadRequest{mRequestAsset=");
        A10.append(this.A03);
        A10.append(", mPrefetchReferences=");
        A10.append(this.A01);
        A10.append(", mNonPrefetchReferences=");
        A10.append(this.A00);
        A10.append(", mDownloadedOrDownloading=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }
}
