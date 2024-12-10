package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.PlaceInfo;

public class DA6 implements E43 {
    public final View A00;
    public final /* synthetic */ LocationPicker A01;

    public DA6(LocationPicker locationPicker) {
        this.A01 = locationPicker;
        this.A00 = AnonymousClass3MX.A09(locationPicker.getLayoutInflater(), (ViewGroup) null, 2131626473);
    }

    public View BSt(BPT bpt) {
        View view = this.A00;
        TextView A0E = C17880vN.A0E(view, 2131433872);
        TextView A0E2 = C17880vN.A0E(view, 2131433871);
        Object obj = bpt.A0F;
        if (obj instanceof PlaceInfo) {
            PlaceInfo placeInfo = (PlaceInfo) obj;
            A0E.setText(placeInfo.A06);
            A0E2.setText(placeInfo.A09);
        }
        return view;
    }
}
