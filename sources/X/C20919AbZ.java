package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.AbZ  reason: case insensitive filesystem */
public final class C20919AbZ implements C22522BBf {
    public final C24921Me A00;
    public final C27191Vc A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1QS A03;

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        AnonymousClass8pI A06;
        AnonymousClass1E7 r4 = (AnonymousClass1E7) obj;
        C179889Kh r9 = (C179889Kh) enumR;
        boolean A17 = C18070vi.A17(r4, r9);
        int ordinal = r9.ordinal();
        if (ordinal == 0) {
            return this.A00.A0I(r4);
        }
        if (ordinal == A17) {
            C27191Vc r2 = this.A01;
            Context context = this.A02.A00;
            Bitmap BX4 = r2.BX4(context, r4, "ContactResolver.resolve", context.getResources().getDimension(2131168737), context.getResources().getDimensionPixelSize(2131168739));
            if (BX4 == null) {
                BX4 = BitmapFactory.decodeResource(context.getResources(), 2131231047);
            }
            return AnonymousClass204.A0E(BX4);
        } else if (ordinal == 2) {
            UserJid A0x = AnonymousClass3MZ.A0x(r4);
            if (A0x == null) {
                return null;
            }
            AnonymousClass1KH A0R = AnonymousClass8BR.A0R(this.A03);
            synchronized (A0R) {
                A06 = A0R.A06(A0x, (UserJid) null);
            }
            return A06;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }

    public C20919AbZ(C24921Me r1, C27191Vc r2, AnonymousClass118 r3, AnonymousClass1QS r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public Class BL8() {
        return C179889Kh.class;
    }
}
