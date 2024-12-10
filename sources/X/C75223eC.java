package X;

import com.whatsapp.gallerypicker.MediaPicker;

/* renamed from: X.3eC  reason: invalid class name and case insensitive filesystem */
public abstract class C75223eC extends AnonymousClass1FY {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            MediaPicker mediaPicker = (MediaPicker) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0O = AnonymousClass3MZ.A0O(r4, mediaPicker);
            C72483Me.A0q(A0O, mediaPicker);
            AnonymousClass10G r1 = A0O.A00;
            AnonymousClass1FB.A0K(A0O, r1, mediaPicker, r1.A45);
            AnonymousClass1FB.A0L(A0O, r1, mediaPicker, r1.A5A);
            mediaPicker.A00 = C000200d.A00(r4.A5b);
            mediaPicker.A01 = C000200d.A00(r1.ADC);
            mediaPicker.A02 = C000200d.A00(r1.AId);
        }
    }

    public C75223eC() {
        C91014f0.A00(this, 11);
    }
}
