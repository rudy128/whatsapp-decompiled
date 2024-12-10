package X;

import android.database.AbstractCursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.5dG  reason: invalid class name and case insensitive filesystem */
public class C109325dG extends AbstractCursor {
    public static final String[] A03;
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C25161Nd A02;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public long getLong(int i) {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public boolean isNull(int i) {
        return false;
    }

    public int getCount() {
        return this.A02.A03();
    }

    public String getString(int i) {
        String A0p;
        if (i == 0) {
            ArrayList A06 = this.A02.A06();
            int position = getPosition();
            if (A06.size() > position) {
                return ((Jid) A06.get(position)).getRawString();
            }
        } else if (i != 1) {
            return "";
        }
        ArrayList A062 = this.A02.A06();
        int position2 = getPosition();
        if (A062.size() <= position2 || (A0p = AnonymousClass3MY.A0p(this.A00, this.A01, (AnonymousClass1BI) A062.get(position2))) == null) {
            return "";
        }
        return A0p;
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "jid";
        A1Z[1] = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        A03 = A1Z;
    }

    public C109325dG(AnonymousClass1M9 r1, C24921Me r2, C25161Nd r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String[] getColumnNames() {
        return A03;
    }
}
