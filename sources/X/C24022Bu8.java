package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.Bu8  reason: case insensitive filesystem */
public final class C24022Bu8 extends C24023Bu9 {
    public Picture A00;
    public C26262Cw7 A01;
    public final float A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public void A0M(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Picture picture = this.A00;
        if (picture != null) {
            RectF rectF = this.A06;
            rectF.sort();
            canvas.save();
            canvas.drawPicture(picture, rectF);
            canvas.restore();
        }
    }

    public void A0N(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        A0M(canvas);
    }

    public void A0Q(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0Q(jSONObject);
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A04);
        jSONObject.put("fileName", this.A03);
        jSONObject.put("alpha", Float.valueOf(this.A02));
    }

    public boolean A0S() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24022Bu8(Context context, JSONObject jSONObject) {
        super(context);
        C26262Cw7 cw7;
        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C18070vi.A0X(optString);
        String optString2 = jSONObject.optString("fileName");
        C18070vi.A0X(optString2);
        this.A04 = optString;
        this.A03 = optString2;
        this.A02 = (float) jSONObject.optDouble("alpha", 1.0d);
        try {
            cw7 = C26262Cw7.A02(this.A00.getAssets(), C17890vO.A0Z(optString2, AnonymousClass000.A11("mediatemplate"), '/'));
        } catch (E05 | IOException e) {
            Log.e(C17900vP.A0A("failed to load SVG from ", optString2), e);
            cw7 = null;
        }
        this.A01 = cw7;
        A00();
        C17960vV.A0F(AnonymousClass000.A1W(this.A00), AnonymousClass001.A1H("Unable to load svg ", optString2, AnonymousClass000.A10()));
        this.A05 = "template-background";
        A0R(jSONObject);
    }

    public String A0D() {
        return this.A05;
    }

    public boolean A0W() {
        return false;
    }

    public boolean A0X() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.Cvz] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.CnG, X.BO4] */
    private final void A00() {
        Picture picture;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('#');
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, 16777215 & this.A05.getColor());
        String A0y = AnonymousClass000.A0y(C108955ca.A12(locale, "%06X", Arrays.copyOf(A1a, 1)), A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("path, rect { fill-opacity: ");
        A102.append(this.A02);
        A102.append("; fill: ");
        A102.append(A0y);
        String A0y2 = AnonymousClass000.A0y(" }", A102);
        C26262Cw7 cw7 = this.A01;
        if (cw7 != null) {
            CSD csd = new CSD();
            Integer num = AnonymousClass00R.A01;
            C24303Bz0 bz0 = C24303Bz0.screen;
            ? obj = new Object();
            obj.A02 = false;
            obj.A00 = bz0;
            obj.A01 = num;
            ? cnG = new C25854CnG(A0y2.replaceAll("(?s)/\\*.*?\\*/", ""));
            cnG.A0D();
            csd.A00 = C26255Cvz.A01(cnG, obj);
            picture = cw7.A07(csd);
        } else {
            picture = null;
        }
        this.A00 = picture;
    }

    public void A0K(int i) {
        super.A0K(i);
        A00();
    }

    public String A0E(Context context) {
        return this.A04;
    }
}
