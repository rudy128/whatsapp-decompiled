package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: X.D4d  reason: case insensitive filesystem */
public final class C26563D4d implements OnReceiveContentListener {
    public final E3a A00;

    public C26563D4d(E3a e3a) {
        this.A00 = e3a;
    }

    public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C25997CqD A01 = C25997CqD.A01(contentInfo);
        C25997CqD C2a = this.A00.C2a(view, A01);
        if (C2a == null) {
            return null;
        }
        if (C2a == A01) {
            return contentInfo;
        }
        return C2a.A02();
    }
}
