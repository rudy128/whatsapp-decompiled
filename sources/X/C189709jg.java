package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9jg  reason: invalid class name and case insensitive filesystem */
public final class C189709jg {
    public final C20130A8q A00;

    public C189709jg(C56582hh r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2.A00((C193199ph) null);
    }

    public final void A00(AES aes, BCF bcf, String str) {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put("action", "start");
        C194579rx r9 = new C194579rx("address_message", (String) null, A13);
        LinkedHashMap A132 = C17880vN.A13();
        C63572tK r0 = C63572tK.A0E;
        A132.put("country", "IN");
        A132.put("has_validation_errors", false);
        A132.put("business_info", C108975cc.A0h("business_name", str));
        A132.put("supported_actions", C17880vN.A13());
        AES aes2 = aes;
        if (aes != null) {
            List<AEV> list = aes2.A04;
            A132.put("has_saved_addresses", C108945cZ.A1A(C137476vW.A00(list)));
            ArrayList A133 = AnonymousClass000.A13();
            if (list != null) {
                int i = 0;
                for (AEV aev : list) {
                    int i2 = i + 1;
                    LinkedHashMap A134 = C17880vN.A13();
                    A134.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(i));
                    LinkedHashMap A135 = C17880vN.A13();
                    A135.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, aev.A07.A00);
                    A135.put("in_pin_code", aev.A05.A00);
                    A135.put("phone_number", aev.A08.A00);
                    A135.put("address", aev.A00.A00);
                    A135.put("city", aev.A02.A00);
                    C170388pm r1 = aev.A06;
                    if (r1.A01()) {
                        A135.put("landmark_area", r1.A00);
                    }
                    C170418pp r12 = aev.A09;
                    if (r12.A01()) {
                        A135.put("state", r12.A00);
                    }
                    C170368pk r13 = aev.A04;
                    if (r13.A01()) {
                        A135.put("house_number", r13.A00);
                    }
                    C170358pj r14 = aev.A03;
                    if (r14.A01()) {
                        A135.put("floor_number", r14.A00);
                    }
                    C170338ph r15 = aev.A01;
                    if (r15.A01()) {
                        A135.put("building_name", r15.A00);
                    }
                    C170428pq r16 = aev.A0A;
                    if (r16.A01()) {
                        A135.put("tower_number", r16.A00);
                    }
                    A134.put("value", A135);
                    A133.add(A134);
                    i = i2;
                }
            }
            AnonymousClass1D6[] r17 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("saved_addresses", A133, r17, 0);
            AnonymousClass1D6.A03("country", "IN", r17, 1);
            A132.put("address_message", AnonymousClass1D7.A0B(r17));
        } else {
            A132.put("has_saved_addresses", false);
        }
        this.A00.A0B((B9G) null, new C20904AbK(this, bcf, 1), r9, "order_details", (String) null, A132);
    }
}
