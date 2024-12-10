package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ANb  reason: case insensitive filesystem */
public final /* synthetic */ class C20490ANb implements B7H {
    public final /* synthetic */ AnonymousClass8J4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        AnonymousClass8J4 r1 = this.A00;
        Map map = this.A02;
        String str = this.A01;
        List list = C42011xT.A0I;
        C18070vi.A0f(map, 1, bitmap);
        AnonymousClass8J4.A00(bitmap, r1, str, map, bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public /* synthetic */ C20490ANb(AnonymousClass8J4 r1, String str, Map map) {
        this.A00 = r1;
        this.A02 = map;
        this.A01 = str;
    }
}
