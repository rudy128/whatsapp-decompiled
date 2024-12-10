package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.79K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass79K implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ AnonymousClass75M A01;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PlaceInfo placeInfo;
        AnonymousClass75M r1 = this.A01;
        AnonymousClass01E r2 = this.A00;
        int headerViewsCount = i - r1.A0L.getHeaderViewsCount();
        if (!r1.A0d || headerViewsCount != -1) {
            C20283AEr aEr = r1.A0V;
            if (aEr != null && headerViewsCount < aEr.A0D.size()) {
                placeInfo = (PlaceInfo) r1.A0V.A0D.get(headerViewsCount);
            } else {
                return;
            }
        } else if (r1.A0e || !r1.A1C.A06(r2)) {
            placeInfo = r1.A1D;
        } else {
            AnonymousClass75M.A08(r1);
            return;
        }
        AnonymousClass75M.A0D(r1, placeInfo);
    }

    public /* synthetic */ AnonymousClass79K(AnonymousClass01E r1, AnonymousClass75M r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
