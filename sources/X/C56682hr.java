package X;

import com.whatsapp.avatar.init.AvatarStickerPackWorker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2hr  reason: invalid class name and case insensitive filesystem */
public final class C56682hr {
    public final AnonymousClass19K A00;

    public C56682hr(AnonymousClass19K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(int i, String str, boolean z) {
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A01 = a1b.A01();
        C192939pH r3 = new C192939pH();
        Map map = r3.A00;
        map.put("origin", str);
        C17880vN.A1P("origin_type", r3.A00, i);
        map.put("cancel_ongoing", Boolean.valueOf(z));
        A6Y A002 = r3.A00();
        C196269uj r4 = new C196269uj(AvatarStickerPackWorker.class);
        r4.A03(A01);
        Integer num = AnonymousClass00R.A00;
        r4.A06(num, TimeUnit.SECONDS, 10);
        r4.A04(A002);
        ((A7W) this.A00.get()).A03((C162248Jv) r4.A00(), num, "tag.whatsapp.avatar.init.download").A02();
    }
}
