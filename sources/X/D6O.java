package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

public final class D6O implements E9N {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public C25997CqD BDP() {
        return new C25997CqD(new D6R(this));
    }

    public void CII(ClipData clipData) {
        this.A02 = clipData;
    }

    public void CIu(int i) {
        this.A00 = i;
    }

    public void CJK(Uri uri) {
        this.A03 = uri;
    }

    public void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
