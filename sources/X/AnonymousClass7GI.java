package X;

import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.7GI  reason: invalid class name */
public class AnonymousClass7GI implements C1605488x {
    public final int A00;
    public final Object A01;

    public AnonymousClass7GI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bvc() {
        if (this.A00 != 0) {
            KeyboardPopupLayout keyboardPopupLayout = ((TextStatusComposerFragment) this.A01).A0L;
            if (keyboardPopupLayout != null) {
                keyboardPopupLayout.setPadding(0, 0, 0, 0);
                return;
            }
            return;
        }
        AnonymousClass7JF r2 = (AnonymousClass7JF) this.A01;
        r2.A0W.A07(0);
        AnonymousClass7JF.A05(r2);
        r2.A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C5V() {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r3.A01
            com.whatsapp.statuscomposer.composer.TextStatusComposerFragment r0 = (com.whatsapp.statuscomposer.composer.TextStatusComposerFragment) r0
            com.whatsapp.KeyboardPopupLayout r2 = r0.A0L
            if (r2 == 0) goto L_0x0027
            X.1FL r0 = r0.A1D()
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r0)
            X.1HO r1 = X.AnonymousClass1HF.A0C(r0)
            if (r1 == 0) goto L_0x0028
            r0 = 7
            X.1id r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0028
            int r1 = r0.A03
        L_0x0023:
            r0 = 0
            r2.setPadding(r0, r0, r0, r1)
        L_0x0027:
            return
        L_0x0028:
            r1 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GI.C5V():void");
    }
}
