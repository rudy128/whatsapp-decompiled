package X;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ANe  reason: case insensitive filesystem */
public final /* synthetic */ class C20493ANe implements B7H {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8J4 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        AnonymousClass8J4 r2 = this.A02;
        Map map = this.A04;
        String str = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        List list = C42011xT.A0I;
        AnonymousClass8BU.A1H(map, 1, bitmap);
        AnonymousClass8J4.A00(bitmap, r2, str, map, i, i2, z2);
    }

    public /* synthetic */ C20493ANe(AnonymousClass8J4 r1, String str, Map map, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A04 = map;
        this.A03 = str;
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
    }
}
