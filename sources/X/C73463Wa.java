package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3Wa  reason: invalid class name and case insensitive filesystem */
public final class C73463Wa extends C38391rD {
    public Bitmap A00;
    public List A01;
    public final C106615Wn A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3Z4(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624306));
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        AnonymousClass3Z4 r62 = (AnonymousClass3Z4) r6;
        C18070vi.A0d(r62, 0);
        C446124c r3 = (C446124c) this.A01.get(i);
        Bitmap bitmap = this.A00;
        C106615Wn r2 = this.A02;
        StringBuilder A19 = AnonymousClass3MZ.A19(r3, 0);
        A19.append('/');
        r62.A01.setText(AnonymousClass000.A0y(r3.A02, A19));
        r62.A02.setText(r3.A01);
        if (r3.A00 != null) {
            r62.A00.setImageResource(2131232384);
        } else {
            r62.A00.setImageBitmap(bitmap);
        }
        C90084dV.A00(r62.A0H, r2, r62, r3, 15);
    }

    public C73463Wa(Bitmap bitmap, C106615Wn r2, List list) {
        this.A01 = list;
        this.A00 = bitmap;
        this.A02 = r2;
    }
}
