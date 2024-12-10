package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.70B  reason: invalid class name */
public abstract class AnonymousClass70B {
    public Canvas A00;
    public final Paint A01;
    public final List A02 = AnonymousClass000.A13();
    public final float A03;

    public void A04(Canvas canvas) {
        C1196869l r2 = (C1196869l) this;
        for (PointF pointF : r2.A02) {
            Canvas canvas2 = canvas;
            r2.A08(canvas2, r2.A01, pointF.x, pointF.y, (int) r2.A01);
        }
    }

    public void A06(PointF pointF, long j) {
        C1196869l r2 = (C1196869l) this;
        List list = r2.A02;
        if (list.isEmpty() || !list.get(AnonymousClass3MX.A01(list)).equals(pointF)) {
            list.add(pointF);
            Canvas canvas = r2.A00;
            if (canvas != null) {
                r2.A08(canvas, r2.A01, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public static ArrayList A00(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("points");
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            A13.add(new PointF(((float) jSONArray.getInt(i)) / 100.0f, ((float) jSONArray.getInt(i + 1)) / 100.0f));
        }
        return A13;
    }

    public void A07(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        for (PointF pointF : this.A02) {
            jSONArray.put((int) (pointF.x * 100.0f));
            jSONArray.put((int) (pointF.y * 100.0f));
        }
        jSONObject.put("points", jSONArray);
        jSONObject.put("width", (int) (this.A03 * 100.0f));
    }

    public AnonymousClass70B(Bitmap bitmap, Paint paint, PointF pointF, float f, int i) {
        if (bitmap != null) {
            Canvas A0I = C108945cZ.A0I(bitmap);
            float f2 = (float) i;
            A0I.scale(f2, f2);
            if (pointF != null) {
                A0I.translate(-pointF.x, -pointF.y);
            }
            this.A00 = A0I;
        }
        this.A03 = f;
        this.A01 = paint;
    }

    public void A03(Bitmap bitmap, PointF pointF, int i) {
        Canvas A0I = C108945cZ.A0I(bitmap);
        float f = (float) i;
        A0I.scale(f, f);
        if (pointF != null) {
            A0I.translate(-pointF.x, -pointF.y);
        }
        this.A00 = A0I;
    }

    public void A05(PointF pointF, long j) {
    }
}
