package X;

import android.content.Context;
import android.graphics.Picture;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.Bu9  reason: case insensitive filesystem */
public abstract class C24023Bu9 extends AnonymousClass69a {
    public final Context A00;

    public boolean A0T() {
        return false;
    }

    public float A0a() {
        return 0.0f;
    }

    public final Picture A0b(String str) {
        try {
            C26262Cw7 A02 = C26262Cw7.A02(this.A00.getAssets(), C17890vO.A0Z(str, AnonymousClass000.A11("graphics"), '/'));
            if (A02 != null) {
                return A02.A07((CSD) null);
            }
            return null;
        } catch (E05 | IOException e) {
            Log.e(C17900vP.A0A("failed to load SVG from ", str), e);
            return null;
        }
    }

    public C24023Bu9(Context context) {
        this.A00 = context;
    }
}
