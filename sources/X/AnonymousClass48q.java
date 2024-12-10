package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.48q  reason: invalid class name */
public class AnonymousClass48q extends A34 {
    public final WeakReference A00;
    public final /* synthetic */ CallLogActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass48q(CallLogActivity callLogActivity, CallLogActivity callLogActivity2) {
        super(callLogActivity2, true);
        this.A01 = callLogActivity;
        this.A00 = AnonymousClass3MW.A0z(callLogActivity2);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap bitmap;
        CallLogActivity callLogActivity = this.A01;
        int dimensionPixelSize = callLogActivity.getResources().getDimensionPixelSize(2131167736);
        float dimension = callLogActivity.getResources().getDimension(2131167735);
        Context context = (Context) this.A00.get();
        if (context != null) {
            bitmap = callLogActivity.A0D.A04(context, callLogActivity.A0L, "CallLogActivity.doInBackground", dimension, dimensionPixelSize, false);
        } else {
            bitmap = null;
        }
        if (!this.A02.isCancelled()) {
            callLogActivity.A05.A0J(new C21431Ajy(this, bitmap, 14));
        }
        return null;
    }
}
