package X;

import android.net.Uri;
import java.util.Map;

/* renamed from: X.DBy  reason: case insensitive filesystem */
public final class C26745DBy implements E13 {
    public final Uri A00;
    public final Uri A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.SingleImageSourceImpl");
        C26745DBy dBy = (C26745DBy) obj;
        return C18070vi.A18(this.A00, dBy.A00) && C18070vi.A18(this.A02, dBy.A02);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0L(this.A00));
    }

    public C26745DBy(Uri uri, Map map) {
        this.A01 = uri;
        this.A02 = map;
        this.A00 = uri;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SingleImageSourceImpl(uri=");
        A10.append(this.A01);
        A10.append(", extras=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
