package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Nq  reason: invalid class name and case insensitive filesystem */
public class C180719Nq {
    public int A00;
    public Bundle A01;
    public Boolean A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public HashMap A07;
    public JSONArray A08;
    public JSONArray A09;
    public JSONArray A0A;
    public JSONArray A0B;
    public JSONObject A0C;
    public JSONObject A0D;
    public JSONObject A0E;
    public JSONObject A0F;
    public AnonymousClass9Nz A0G;
    public C188559hc A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public boolean A00() {
        Boolean bool = this.A03;
        if (bool == null) {
            if (this.A08 != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (int i = 0; i < this.A08.length(); i++) {
                    try {
                        String string = this.A08.getJSONObject(i).getString("subtype");
                        if (string != null) {
                            A13.add(string);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (A13.contains("OTP") || A13.contains("SMS") || A13.contains("EMAIL") || A13.contains("HOTP") || A13.contains("AADHAAR") || (A13.contains("TOTP") && A13.contains("MPIN"))) {
                    bool = AnonymousClass000.A0i();
                    this.A03 = bool;
                }
            }
            bool = false;
            this.A03 = bool;
        }
        return bool.booleanValue();
    }
}
