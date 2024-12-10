package X;

import android.content.Context;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.9Nz  reason: invalid class name */
public class AnonymousClass9Nz {
    public Context A00;
    public C180709Np A01;
    public Locale A02;
    public Map A03;
    public Properties A04;
    public Properties A05;
    public Properties A06;
    public C192349oE A07;
    public C180799Ny A08;
    public C188559hc A09;
    public C180669Nl A0A;

    public Properties A00(String str) {
        Properties properties = new Properties();
        try {
            properties.load(this.A00.getAssets().open(str));
            return properties;
        } catch (IOException e) {
            e.toString();
            return properties;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Ny, java.lang.Object] */
    public C180799Ny A01() {
        C180799Ny r3 = this.A08;
        if (r3 != null) {
            return r3;
        }
        C188559hc r0 = this.A09;
        C180709Np r2 = r0.A00;
        this.A01 = r2;
        C192349oE r1 = r0.A0A;
        String str = r0.A01;
        ? obj = new Object();
        obj.A00 = r2;
        obj.A01 = str;
        obj.A02 = r1;
        this.A08 = obj;
        return obj;
    }
}
