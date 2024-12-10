package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.json.JSONObject;

/* renamed from: X.69V  reason: invalid class name */
public final class AnonymousClass69V extends C1409773u {
    public int A00 = 1;
    public Bitmap A01;
    public PointF A02;
    public AnonymousClass69K A03;
    public AnonymousClass70B A04;
    public C138456x7 A05;
    public boolean A06;
    public final float A07;

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        AnonymousClass70B r0 = this.A04;
        if (r0 != null) {
            r0.A07(jSONObject);
        }
    }

    public final void A0a(C138456x7 r3) {
        C1196869l r1;
        this.A05 = r3;
        AnonymousClass70B r12 = this.A04;
        if ((r12 instanceof C1196869l) && (r1 = (C1196869l) r12) != null) {
            r1.A00 = r3;
        }
    }

    public AnonymousClass69V(float f) {
        this.A07 = f;
        AnonymousClass3MW.A1P(this.A05);
    }
}
