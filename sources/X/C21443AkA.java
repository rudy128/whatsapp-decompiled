package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AkA  reason: case insensitive filesystem */
public class C21443AkA implements Runnable {
    public final int A00 = 0;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C21443AkA(C186739eg r2, Jid jid, Integer num, Integer num2, String str, String str2, String str3, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A07 = str;
        this.A03 = num;
        this.A04 = jid;
        this.A05 = r2;
        this.A06 = num2;
        this.A08 = str2;
        this.A09 = str3;
    }

    public final void run() {
        String str;
        C186749eh r3;
        int i;
        if (this.A00 != 0) {
            C191659mx r4 = (C191659mx) this.A03;
            C190069kK r32 = (C190069kK) this.A04;
            int i2 = this.A01;
            JSONObject jSONObject = (JSONObject) this.A05;
            try {
                r32.A00(r4.A00((C20462ALz) this.A06, this.A07, this.A08, this.A09, jSONObject, i2, this.A02));
            } catch (Exception e) {
                C20462ALz aLz = r32.A00;
                aLz.A0G(C108955ca.A0x(e));
                if (e instanceof JSONException) {
                    AnonymousClass8BS.A17(aLz.A02, "GraphApiACSNetworkRequest/createResponseCallback/onError: Error while parsing the JSON: ", e, true);
                    r3 = r32.A01;
                    i = 2;
                } else if (e instanceof IOException) {
                    Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError", e);
                    r3 = r32.A01;
                    r3.A00 = 1;
                    C17890vO.A0D().post(new C146797Qq(aLz, r3, 26));
                } else {
                    Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError: generic error - ", e);
                    r3 = r32.A01;
                    i = 3;
                }
                r3.A00 = i;
                C17890vO.A0D().post(new C146797Qq(aLz, r3, 26));
            }
        } else {
            int i3 = this.A01;
            int i4 = this.A02;
            String str2 = this.A07;
            Jid jid = (Jid) this.A04;
            C186739eg r7 = (C186739eg) this.A05;
            Integer num = (Integer) this.A06;
            String str3 = this.A08;
            String str4 = this.A09;
            C171438ri r33 = new C171438ri();
            r33.A02 = Integer.valueOf(i3);
            r33.A03 = Integer.valueOf(i4);
            r33.A07 = str2;
            r33.A00 = (Integer) this.A03;
            if (jid != null) {
                str = r7.A02.A00(jid);
            } else {
                str = null;
            }
            r33.A04 = str;
            if (C18020vd.A05(C18040vf.A02, r7.A00, 6381)) {
                if (num != null && num.intValue() == 2) {
                    num = AnonymousClass3MY.A0f();
                }
                r33.A01 = num;
                r33.A06 = str3;
                r33.A05 = str4;
            }
            r7.A01.CC4(r33);
        }
    }

    public C21443AkA(C190069kK r2, C20462ALz aLz, C191659mx r4, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        this.A03 = r4;
        this.A04 = r2;
        this.A01 = i;
        this.A05 = jSONObject;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A02 = i2;
        this.A06 = aLz;
    }
}
