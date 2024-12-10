package X;

import com.whatsapp.location.LocationPicker2;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.Bpj  reason: case insensitive filesystem */
public abstract class C23799Bpj extends AnonymousClass1FY {
    public boolean A00 = false;

    public static Object A03(AnonymousClass10E r1, AnonymousClass10G r2, C24921Me r3, LocationPicker2 locationPicker2) {
        locationPicker2.A0D = r3;
        locationPicker2.A0d = C000200d.A00(r1.A3w);
        locationPicker2.A0E = (C25491Ok) r1.A1F.get();
        locationPicker2.A0Y = (WhatsAppLibLoader) r1.ABy.get();
        locationPicker2.A0b = C000200d.A00(r2.A1c);
        locationPicker2.A0C = (AnonymousClass1PM) r1.ABM.get();
        locationPicker2.A0M = (C219217x) r1.ABj.get();
        return r1.AUE.get();
    }

    public static void A0Q(AnonymousClass10E r1, AnonymousClass10G r2, LocationPicker2 locationPicker2, Object obj) {
        locationPicker2.A07 = (AnonymousClass1RB) obj;
        locationPicker2.A0f = C000200d.A00(r2.AD5);
        locationPicker2.A0W = (C27131Uv) r1.A5p.get();
        locationPicker2.A0Z = (C18010vc) r1.A9s.get();
        locationPicker2.A06 = (AnonymousClass195) r1.A0L.get();
        locationPicker2.A0J = (C134196qC) r2.A38.get();
        locationPicker2.A0H = (C27191Vc) r1.A2i.get();
        locationPicker2.A0K = (C31131f4) r1.A6M.get();
        locationPicker2.A0c = C000200d.A00(r2.A1h);
        locationPicker2.A0g = C000200d.A00(r2.A3f);
        locationPicker2.A0h = C000200d.A00(r2.A4T);
        locationPicker2.A0I = (C88184Yq) r2.A15.get();
        locationPicker2.A0e = C000200d.A00(r1.A7f);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            LocationPicker2 locationPicker2 = (LocationPicker2) this;
            AnonymousClass10E A0A = C109005cf.A0A((AnonymousClass1K1) ((C006602x) generatedComponent()), locationPicker2);
            BEB.A10(A0A, locationPicker2);
            AnonymousClass10G r1 = A0A.A00;
            BEB.A0x(A0A, r1, locationPicker2);
            C109015cg.A03(A0A, r1, locationPicker2, r1.A5A);
            locationPicker2.A0Q = (AnonymousClass736) A0A.AUc.get();
            locationPicker2.A0L = BE9.A0Z(A0A);
            locationPicker2.A0S = BE9.A0a(A0A);
            locationPicker2.A0N = AnonymousClass8BV.A0C(A0A);
            locationPicker2.A08 = (AnonymousClass181) A0A.AA9.get();
            locationPicker2.A0P = AnonymousClass3Ma.A0g(A0A);
            locationPicker2.A09 = (C33251iW) BE7.A0c(A0A);
            locationPicker2.A0R = (AnonymousClass1D9) A0A.A0n.get();
            locationPicker2.A0O = C108985cd.A0T(A0A);
            locationPicker2.A0G = BE9.A0Y(A0A);
            locationPicker2.A0X = (AnonymousClass689) A0A.A5q.get();
            locationPicker2.A0A = BE9.A0W(A0A);
            locationPicker2.A0B = AnonymousClass10E.A50(A0A);
            locationPicker2.A0a = C108975cc.A0O(A0A);
            A0Q(A0A, r1, locationPicker2, A03(A0A, r1, C108985cd.A0R(A0A), locationPicker2));
        }
    }

    public C23799Bpj() {
        C91044f3.A00(this, 5);
    }
}
