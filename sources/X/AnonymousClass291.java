package X;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.291  reason: invalid class name */
public class AnonymousClass291 extends AnonymousClass1b8 {
    public final AnonymousClass1b8 A00;

    public void A09(ViewGroup viewGroup, Object obj, int i) {
        this.A00.A09(viewGroup, obj, i);
    }

    public Parcelable A0B() {
        return this.A00.A0B();
    }

    public void A0D(ViewGroup viewGroup) {
        this.A00.A0D(viewGroup);
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        AnonymousClass1b8 r1 = this.A00;
        if (r1.A0E() > 0) {
            return r1.A0F(viewGroup, i % r1.A0E());
        }
        Log.i("infinitepageadapter/instantiateitem/count is zero");
        return null;
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass1b8 r1 = this.A00;
        if (r1.A0E() <= 0) {
            Log.i("infinitepageadapter/destroyitem/count is zero");
        } else {
            r1.A0G(viewGroup, obj, i % r1.A0E());
        }
    }

    public AnonymousClass291(AnonymousClass1b8 r1) {
        this.A00 = r1;
    }
}
