package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

public final class D6P implements E9N {
    public final ContentInfo.Builder A00;

    public C25997CqD BDP() {
        return new C25997CqD(new D6Q(this.A00.build()));
    }

    public void CII(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    public void CIu(int i) {
        this.A00.setFlags(i);
    }

    public void CJK(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public D6P(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }

    public D6P(C25997CqD cqD) {
        this.A00 = new ContentInfo.Builder(cqD.A02());
    }
}
