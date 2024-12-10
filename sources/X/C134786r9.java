package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.6r9  reason: invalid class name and case insensitive filesystem */
public final class C134786r9 {
    public final PhotoView A00;
    public final AnonymousClass21V A01;

    public C134786r9(PhotoView photoView, AnonymousClass21V r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = photoView;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134786r9) {
                C134786r9 r5 = (C134786r9) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessagePhotoItem(message=");
        A10.append(this.A01);
        A10.append(", photoView=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
