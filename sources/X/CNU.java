package X;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONException;
import org.json.JSONObject;

public final class CNU {
    public final JSONObject A00;
    public final /* synthetic */ C25120CYt A01;

    public CNU(C25120CYt cYt, float f) {
        this.A01 = cYt;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        JSONObject A15 = C17880vN.A15();
        this.A00 = A15;
        try {
            A15.put("cropped_bitmap_info", BigDecimal.valueOf((double) f).setScale(3, roundingMode));
        } catch (JSONException unused) {
        }
    }
}
