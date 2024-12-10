package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.9kK  reason: invalid class name and case insensitive filesystem */
public class C190069kK {
    public final /* synthetic */ C20462ALz A00;
    public final /* synthetic */ C186749eh A01;

    public void A00(C198089xl r8) {
        C186749eh r4;
        C20462ALz aLz;
        C190599lD r2;
        Integer num = null;
        try {
            num = Integer.valueOf(r8.A01);
            aLz = this.A00;
            r4 = this.A01;
            aLz.A0F(r4, r8);
        } catch (JSONException e) {
            aLz = this.A00;
            String A0x = C108955ca.A0x(e);
            aLz.A0G(A0x);
            aLz.A02.A0G("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: Error while parsing the JSON: ", e.getMessage(), true);
            r4 = this.A01;
            r4.A00 = 2;
            r2 = new C190599lD(num, A0x, 7);
        } catch (Exception e2) {
            aLz = this.A00;
            String A0x2 = C108955ca.A0x(e2);
            aLz.A0G(A0x2);
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: generic error - ", e2);
            r4 = this.A01;
            r4.A00 = 3;
            r2 = new C190599lD(num, A0x2, 6);
        }
        C17890vO.A0D().post(new C146797Qq(aLz, r4, 26));
        r4.A01 = r2;
        C17890vO.A0D().post(new C146797Qq(aLz, r4, 26));
    }

    public C190069kK(C20462ALz aLz, C186749eh r2) {
        this.A00 = aLz;
        this.A01 = r2;
    }
}
