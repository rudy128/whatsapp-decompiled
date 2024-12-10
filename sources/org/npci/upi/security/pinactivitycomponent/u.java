package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass9ZM;
import X.C108945cZ;
import X.C190839lb;
import X.C192349oE;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u {
    public Context A00;
    public List A01;
    public JSONArray A02 = AnonymousClass8BR.A1A();
    public AnonymousClass9ZM A03;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9lb, java.lang.Object] */
    public C190839lb A01(String str, String str2, int i) {
        String str3;
        C192349oE r3;
        String str4;
        int i2 = 0;
        while (true) {
            try {
                JSONArray jSONArray = this.A02;
                if (i2 >= jSONArray.length()) {
                    return null;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("sender");
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.length()) {
                            continue;
                            break;
                        } else if (!Pattern.compile(jSONArray2.getString(i3), 2).matcher(str).find()) {
                            i3++;
                        } else if (!Pattern.compile(jSONObject.getString("message"), 2).matcher(str2).find()) {
                            continue;
                        } else {
                            if (i != 0) {
                                StringBuilder A10 = AnonymousClass000.A10();
                                A10.append("\\d{");
                                A10.append(i);
                                str3 = AnonymousClass000.A0y("}", A10);
                            } else {
                                str3 = (String) jSONObject.get("otp");
                            }
                            Matcher A0z = AnonymousClass8BU.A0z(str2, str3);
                            ? obj = new Object();
                            obj.A00 = str2;
                            if (A0z.find() && A0z.groupCount() >= 0) {
                                obj.A01 = A0z.group(0);
                                if (str2.contains("Aadhaar") || str2.contains("AADHAAR")) {
                                    r3 = new C192349oE(this.A00);
                                    str4 = "otp_type_aadhaar";
                                } else {
                                    r3 = new C192349oE(this.A00);
                                    str4 = "otp_type_bank";
                                }
                                String str5 = obj.A01;
                                SharedPreferences.Editor edit = r3.A01.edit();
                                edit.putString(str4, str5);
                                edit.commit();
                                return obj;
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
                i2++;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public u(Context context) {
        this.A00 = context;
        this.A03 = new AnonymousClass9ZM(context);
        try {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            InputStream open = context.getAssets().open(AnonymousClass001.A1H("npci/", "npci_otp_rules.json", AnonymousClass000.A10()));
            byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                A15.write(bArr, 0, read);
            }
            A15.close();
            open.close();
            byte[] byteArray = A15.toByteArray();
            if (byteArray != null) {
                try {
                    this.A02 = new JSONArray(new String(byteArray));
                } catch (Exception unused) {
                }
            }
        } catch (FileNotFoundException e) {
            throw AnonymousClass8BR.A0x(e);
        } catch (IOException e2) {
            throw AnonymousClass8BR.A0x(e2);
        } catch (Exception e3) {
            throw AnonymousClass8BR.A0x(e3);
        }
    }

    public static String A00(String str) {
        String lowerCase = str.toLowerCase();
        try {
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(lowerCase.getBytes(), 0, lowerCase.length());
            String bigInteger = new BigInteger(1, A1I.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = AnonymousClass001.A1H("0", bigInteger, AnonymousClass000.A10());
            }
            return bigInteger;
        } catch (Exception unused) {
            return null;
        }
    }
}
