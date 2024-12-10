package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import java.util.HashMap;

public class AP8 implements C22425B7h {
    public final int A00;
    public final Object A01;

    public AP8(DirectorySetLocationMapActivity directorySetLocationMapActivity, int i) {
        this.A00 = i;
        this.A01 = directorySetLocationMapActivity;
    }

    public void Bv5(int i, int i2) {
        String str;
        if (this.A00 != 0) {
            DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A01;
            C20151A9n a9n = new C20151A9n(this, 25);
            directorySetLocationMapActivity.CEx();
            if (i != -1) {
                directorySetLocationMapActivity.CEx();
                C108965cb.A18(directorySetLocationMapActivity, 2131887042, 2131887040);
            } else {
                directorySetLocationMapActivity.CEx();
                C73203Rj A002 = AnonymousClass4a6.A00(directorySetLocationMapActivity);
                A002.A0E(2131887042);
                A002.A0D(2131887050);
                A002.A0Z(a9n, 2131887092);
                AnonymousClass8BU.A1A(A002);
                A002.A0C();
            }
            AM7 am7 = (AM7) directorySetLocationMapActivity.A0J.get();
            HashMap A11 = C17880vN.A11();
            if (i != -1) {
                if (i == 3) {
                    if (i2 == 1) {
                        A11.put("error_type", "geocoder_error");
                        str = "Geocoder's addresses list response is either null or empty";
                    } else if (i2 == 0) {
                        A11.put("error_type", "geocoder_error");
                        str = "Geocoder's address string is empty or null";
                    }
                }
                am7.BiG(A11, 7, 26);
                return;
            }
            A11.put("error_type", "network_error");
            str = "Network error is identified by location picker client code before calling the GeoCoder API";
            A11.put("error_description", str);
            am7.BiG(A11, 7, 26);
            return;
        }
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = (DirectorySetLocationMapActivity) this.A01;
        directorySetLocationMapActivity2.A0A.A06.setVisibility(8);
        directorySetLocationMapActivity2.A0A.A00();
    }
}
