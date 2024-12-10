package X;

import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.8Hd  reason: invalid class name */
public final class AnonymousClass8Hd extends C38391rD {
    public int A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final List A03 = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C162028Ir(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626333, false), this.A01, this.A02);
    }

    public int A0Q() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        AnonymousClass1KN r0;
        C162028Ir r102 = (C162028Ir) r10;
        C18070vi.A0d(r102, 0);
        AnonymousClass9NL r5 = (AnonymousClass9NL) this.A03.get(i);
        C18070vi.A0d(r5, 0);
        C20264ADw aDw = r5.A01;
        ARR arr = aDw.A01;
        String str = null;
        if (!(arr == null || (r0 = arr.A02) == null)) {
            BigDecimal bigDecimal = r0.A00;
            AnonymousClass1KJ r1 = AnonymousClass1KL.A0A;
            C17960vV.A07(r1);
            str = r1.BLd(r102.A03, bigDecimal);
        }
        TextEmojiLabel textEmojiLabel = r102.A01;
        AnonymousClass118 r3 = r102.A02;
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, aDw.A00, 0);
        textEmojiLabel.setText(AnonymousClass8BS.A0f(r3, str, A1b, 1, 2131891367));
        r102.A00.setChecked(r5.A02);
        AFT.A00(r102.A0H, r5, r102, 31);
    }

    public AnonymousClass8Hd(AnonymousClass118 r2, C18000vb r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
