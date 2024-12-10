package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

public class DKK implements E5W {
    public final View A00;
    public final /* synthetic */ LocationPicker2 A01;

    public DKK(LocationPicker2 locationPicker2) {
        this.A01 = locationPicker2;
        this.A00 = AnonymousClass3MX.A09(locationPicker2.getLayoutInflater(), (ViewGroup) null, 2131626473);
    }

    public View BSu(C25280Ccd ccd) {
        View view = this.A00;
        TextView A0E = C17880vN.A0E(view, 2131433872);
        TextView A0E2 = C17880vN.A0E(view, 2131433871);
        if (ccd.A01() instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) ccd.A01();
            A0E.setText(placeInfo.A06);
            A0E2.setText(placeInfo.A09);
        }
        return view;
    }
}
