package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class D6Q implements E9Z {
    public final ContentInfo A00;

    public ClipData BOm() {
        return this.A00.getClip();
    }

    public int BRq() {
        return this.A00.getFlags();
    }

    public int BZT() {
        return this.A00.getSource();
    }

    public ContentInfo Bbu() {
        return this.A00;
    }

    public Bundle getExtras() {
        return this.A00.getExtras();
    }

    public Uri getLinkUri() {
        return this.A00.getLinkUri();
    }

    public D6Q(ContentInfo contentInfo) {
        C28111Yx.A02(contentInfo);
        this.A00 = contentInfo;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContentInfoCompat{");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
