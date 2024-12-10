package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.CmR  reason: case insensitive filesystem */
public final class C25814CmR {
    public JSONArray A00;
    public JSONArray A01;
    public JSONArray A02;
    public JSONArray A03;
    public JSONObject A04;
    public JSONObject A05;
    public JSONObject A06;
    public JSONObject A07;
    public boolean A08;
    public boolean A09;
    public final AtomicBoolean A0A;
    public final AnonymousClass11P A0B;

    public void A02(BTZ btz) {
        boolean z;
        String str;
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject A15 = C17880vN.A15();
        A15.put("codec", C25331Cdc.A01(btz.A06));
        A15.put("width", btz.A05);
        A15.put("height", btz.A03);
        A15.put("frame_rate", btz.A02);
        A15.put("i_frame_interval", btz.A04);
        A15.put("bitrate", btz.A00);
        A15.put("start_time_ms", currentTimeMillis);
        A15.put("end_time_ms", -1);
        synchronized (this) {
            z = this.A08;
        }
        if (z) {
            str = "call";
        } else {
            str = "ringing";
        }
        A15.put("call_stage", str);
        synchronized (this) {
            z2 = this.A09;
        }
        if (z2) {
            if (this.A01.length() > 0) {
                BE9.A11(this.A01).put("end_time_ms", currentTimeMillis);
            }
            this.A01.put(A15);
            return;
        }
        this.A05 = A15;
    }

    public void A01() {
        JSONArray jSONArray = this.A01;
        if (jSONArray.length() <= 0) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            JSONObject A11 = BE9.A11(jSONArray);
            A11.put("end_time_ms", -1);
            this.A05 = A11;
        } else {
            this.A05 = null;
        }
        JSONArray jSONArray2 = this.A03;
        if (jSONArray2.length() > 0) {
            JSONObject A112 = BE9.A11(jSONArray2);
            A112.put("end_time_ms", -1);
            this.A07 = A112;
        } else {
            this.A07 = null;
        }
        JSONArray jSONArray3 = this.A00;
        if (jSONArray3.length() > 0) {
            JSONObject A113 = BE9.A11(jSONArray3);
            A113.put("end_time_ms", -1);
            this.A04 = A113;
        } else {
            this.A04 = null;
        }
        JSONArray jSONArray4 = this.A02;
        if (jSONArray4.length() > 0) {
            JSONObject A114 = BE9.A11(jSONArray4);
            A114.put("end_time_ms", -1);
            this.A06 = A114;
        } else {
            this.A06 = null;
        }
        A00();
    }

    public C25814CmR(AnonymousClass11P r2) {
        this();
        this.A0B = r2;
        this.A01 = AnonymousClass8BR.A1A();
        this.A03 = AnonymousClass8BR.A1A();
        this.A00 = AnonymousClass8BR.A1A();
        this.A02 = AnonymousClass8BR.A1A();
    }

    public void A00() {
        this.A01 = AnonymousClass8BR.A1A();
        this.A03 = AnonymousClass8BR.A1A();
        this.A00 = AnonymousClass8BR.A1A();
        this.A02 = AnonymousClass8BR.A1A();
        this.A0A.set(false);
    }

    public C25814CmR() {
        this.A0A = C108965cb.A0w();
    }
}
