package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.4nI  reason: invalid class name and case insensitive filesystem */
public class C96094nI implements AnonymousClass891 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8B2 A01;
    public final /* synthetic */ AnonymousClass47X A02;

    public C96094nI(AnonymousClass8B2 r1, AnonymousClass47X r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public String Ba8() {
        return "MY_PHOTOS_VIEW_HOLDER_TAG";
    }

    public Bitmap BhZ() {
        AnonymousClass47X r1 = this.A02;
        List list = C42011xT.A0I;
        if (r1.A05.getTag() != this) {
            return null;
        }
        Bitmap CP6 = this.A01.CP6(this.A00);
        if (CP6 == null) {
            return AnonymousClass6YZ.A00;
        }
        return CP6;
    }
}
