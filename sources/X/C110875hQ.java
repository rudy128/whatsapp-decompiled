package X;

import android.os.Bundle;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5hQ  reason: invalid class name and case insensitive filesystem */
public class C110875hQ extends C123426Uk {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ AnonymousClass6A9 A01;

    public C110875hQ(Bundle bundle, AnonymousClass6A9 r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public void A02(List list, Map map) {
        ArrayList<String> stringArrayList;
        PhotoView A28;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01.A00;
        Object A2B = mediaViewBaseFragment.A2B(mediaViewBaseFragment.A09.getCurrentItem());
        if (A2B != null && (stringArrayList = this.A00.getStringArrayList("visible_shared_elements")) != null && stringArrayList.contains(AnonymousClass001.A1H("thumb-transition-", A2B.toString(), AnonymousClass000.A10())) && (A28 = mediaViewBaseFragment.A28(A2B)) != null) {
            Object A2A = mediaViewBaseFragment.A2A();
            C17960vV.A07(A2A);
            list.remove(AnonymousClass001.A1H("thumb-transition-", A2A.toString(), AnonymousClass000.A10()));
            list.add(AnonymousClass001.A1H("thumb-transition-", A2B.toString(), AnonymousClass000.A10()));
            map.put(AnonymousClass001.A1H("thumb-transition-", A2B.toString(), AnonymousClass000.A10()), A28);
        }
    }
}
