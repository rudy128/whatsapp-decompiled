package X;

import android.view.TextureView;
import java.util.Map;

public abstract class C8J {
    public static final C25511Ch9 A00(TextureView textureView, E49 e49, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        C22889BUa bUa = new C22889BUa();
        String A0y = AnonymousClass000.A0y(" Render Thread", AnonymousClass000.A11(str));
        C22889BUa.A00().A00(A0y, 0);
        boolean z13 = false;
        Boolean bool = null;
        if (z) {
            bool = false;
        }
        if ((C18070vi.A18(str, "whatsapp_camera") || C18070vi.A18(str, "whatsapp_qr_code")) && bool == null) {
            z13 = true;
        }
        C25481Cgc cgc = new C25481Cgc(str);
        C25313CdJ cdJ = ED5.A00;
        Map map = cgc.A00;
        map.put(cdJ, true);
        C25313CdJ cdJ2 = EBD.A0F;
        map.put(cdJ2, false);
        C25313CdJ cdJ3 = ED8.A00;
        map.put(cdJ3, true);
        map.put(EBD.A0D, e49);
        map.put(C24700CGm.A01, textureView);
        map.put(EB9.A01, true);
        map.put(EB9.A0A, bool);
        BE7.A1J(EB9.A06, map, z2);
        BE7.A1J(EB9.A08, map, z3);
        BE7.A1J(EB9.A04, map, z5);
        BE7.A1J(EB9.A07, map, z6);
        BE7.A1J(EB9.A05, map, z7);
        BE7.A1J(EB9.A03, map, z8);
        map.put(cdJ2, false);
        map.put(cdJ3, true);
        map.put(ED4.A00, true);
        map.put(EBD.A08, true);
        map.put(C24701CGn.A01, false);
        map.put(EBD.A0G, bUa.BSH(A0y));
        map.put(EBD.A0H, A0y);
        BE7.A1J(EB0.A01, map, z13);
        BE7.A1J(EDF.A00, map, z4);
        BE7.A1J(EB9.A02, map, z9);
        BE7.A1J(EBD.A0I, map, z10);
        BE7.A1J(C24701CGn.A00, map, z11);
        if (z12) {
            map.put(EBD.A02, C17880vN.A0p());
        }
        return new C25511Ch9(cgc);
    }
}
