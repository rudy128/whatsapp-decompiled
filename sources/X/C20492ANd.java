package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ANd  reason: case insensitive filesystem */
public class C20492ANd implements B7H {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C20492ANd(B7H b7h, C20005A2v a2v, UserJid userJid, Integer num, int i) {
        this.A00 = i;
        this.A01 = a2v;
        this.A02 = userJid;
        this.A03 = num;
        this.A04 = b7h;
    }

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        C20005A2v a2v = (C20005A2v) this.A01;
        UserJid userJid = (UserJid) this.A02;
        Number number = (Number) this.A03;
        B7H b7h = (B7H) this.A04;
        if (!z) {
            a2v.A02.remove(aMe);
        }
        if (!(userJid == null || number == null)) {
            C190299kh r5 = a2v.A01;
            int intValue = number.intValue();
            Number number2 = (Number) AnonymousClass8BT.A0r(r5.A01, intValue);
            if (number2 != null) {
                ((C63252sl) r5.A00.get()).A04(new C55062f9(userJid, (String) null, z, false), number2.intValue(), intValue);
            }
        }
        b7h.Bx5(bitmap, aMe, z);
    }
}
