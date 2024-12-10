package X;

/* renamed from: X.6nH  reason: invalid class name */
public class AnonymousClass6nH {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public final AEX A03;

    public AnonymousClass6nH(AEX aex) {
        this.A03 = aex;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExpressiveBackgroundData{backgroundMetaData=");
        A10.append(this.A03);
        A10.append(", isAssetDownloaded=");
        A10.append(this.A00);
        A10.append(", isDownloadFailed=");
        A10.append(this.A01);
        A10.append(", isSelected=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }
}
