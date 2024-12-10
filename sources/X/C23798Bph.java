package X;

import com.whatsapp.location.LocationPicker;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.Bph  reason: case insensitive filesystem */
public abstract class C23798Bph extends AnonymousClass1FY {
    public boolean A00 = false;

    public static void A03(AnonymousClass10E r1, AnonymousClass10G r2, LocationPicker locationPicker, WhatsAppLibLoader whatsAppLibLoader) {
        locationPicker.A0R = whatsAppLibLoader;
        locationPicker.A0U = C000200d.A00(r2.A1c);
        locationPicker.A0C = (AnonymousClass1PM) r1.ABM.get();
        locationPicker.A0H = (C219217x) r1.ABj.get();
        locationPicker.A08 = (AnonymousClass1RB) r1.AUE.get();
        locationPicker.A0Y = C000200d.A00(r2.AD5);
        locationPicker.A0P = (C27131Uv) r1.A5p.get();
        locationPicker.A0S = (C18010vc) r1.A9s.get();
        locationPicker.A07 = (AnonymousClass195) r1.A0L.get();
        locationPicker.A0E = (C27191Vc) r1.A2i.get();
        locationPicker.A0V = C000200d.A00(r2.A1h);
        locationPicker.A0F = (C88184Yq) r2.A15.get();
        locationPicker.A0X = C000200d.A00(r1.A7f);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            LocationPicker locationPicker = (LocationPicker) this;
            AnonymousClass10E A0A = C109005cf.A0A((AnonymousClass1K1) ((C006602x) generatedComponent()), locationPicker);
            BEB.A10(A0A, locationPicker);
            AnonymousClass10G r1 = A0A.A00;
            BEB.A0x(A0A, r1, locationPicker);
            C109015cg.A03(A0A, r1, locationPicker, r1.A5A);
            locationPicker.A0G = BE9.A0Z(A0A);
            locationPicker.A0M = BE9.A0a(A0A);
            locationPicker.A0I = AnonymousClass8BV.A0C(A0A);
            locationPicker.A09 = (AnonymousClass181) A0A.AA9.get();
            locationPicker.A0K = AnonymousClass3Ma.A0g(A0A);
            locationPicker.A0A = (C33251iW) BE7.A0c(A0A);
            locationPicker.A0L = (AnonymousClass1D9) A0A.A0n.get();
            locationPicker.A0J = C108985cd.A0T(A0A);
            locationPicker.A0Q = (AnonymousClass689) A0A.A5q.get();
            locationPicker.A0B = BE9.A0W(A0A);
            locationPicker.A0T = C108975cc.A0O(A0A);
            locationPicker.A0W = C000200d.A00(A0A.A3w);
            locationPicker.A0D = (C25491Ok) A0A.A1F.get();
            A03(A0A, r1, locationPicker, (WhatsAppLibLoader) A0A.ABy.get());
        }
    }

    public C23798Bph() {
        C91044f3.A00(this, 4);
    }
}
