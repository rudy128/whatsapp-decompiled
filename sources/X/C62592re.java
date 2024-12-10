package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2re  reason: invalid class name and case insensitive filesystem */
public class C62592re {
    public int A00 = 0;
    public Integer A01;
    public boolean A02;
    public final AnonymousClass2R1 A03;
    public final List A04 = AnonymousClass000.A13();
    public final List A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public void A02(AnonymousClass2P4 r3) {
        List list = this.A04;
        synchronized (list) {
            list.add(r3);
        }
    }

    public boolean A03() {
        List<AnonymousClass2P4> list = this.A04;
        synchronized (list) {
            for (AnonymousClass2P4 r0 : list) {
                if (r0.A00) {
                    return true;
                }
            }
            return false;
        }
    }

    public C62592re(C63212sh r4) {
        this.A03 = r4.A06;
        this.A02 = r4.A03;
        this.A08 = r4.A04;
        this.A09 = r4.A05;
        Integer num = r4.A01;
        this.A01 = num;
        this.A07 = r4.A02;
        this.A05 = r4.A07;
        this.A06 = r4.A08;
        C62132qq r1 = r4.A00;
        this.A0C = r1.A02;
        this.A0I = r1.A08;
        this.A0J = r1.A09;
        this.A0H = r1.A07;
        this.A0B = r1.A01;
        this.A0D = r1.A03;
        this.A0G = r1.A06;
        this.A0E = r1.A04;
        this.A0F = r1.A05;
        this.A0A = r1.A00;
        this.A0L = r1.A0B;
        this.A0K = r1.A0A;
        this.A01 = num;
    }

    public static C62592re A00(String str) {
        JSONObject A16 = C17880vN.A16(str);
        ArrayList A13 = AnonymousClass000.A13();
        if (A16.has("sync_jid_hash")) {
            JSONArray jSONArray = A16.getJSONArray("sync_jid_hash");
            for (int i = 0; i < jSONArray.length(); i++) {
                A13.add(Base64.decode((String) jSONArray.get(i), 0));
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        if (A16.has("sync_jid")) {
            JSONArray jSONArray2 = A16.getJSONArray("sync_jid");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                UserJid A022 = C22941Dw.A02((String) jSONArray2.get(i2));
                if (A022 != null) {
                    A132.add(A022);
                }
            }
        }
        int i3 = A16.getInt("sync_type_code");
        for (AnonymousClass2R1 r1 : AnonymousClass2R1.values()) {
            if (r1.code == i3) {
                C63212sh A002 = C63212sh.A00(r1);
                A002.A03 = A16.getBoolean("sync_is_urgent");
                A002.A04 = A16.getBoolean("sync_only_if_changed");
                A002.A05 = A16.getBoolean("sync_only_if_registered");
                A002.A02 = A16.getBoolean("sync_clear_whatsapp_sync_data");
                A002.A00 = new C62132qq(A16.optBoolean("sync_sidelist", true), A16.optBoolean("sync_status", true), A16.optBoolean("sync_picture", true), A16.optBoolean("sync_business", true), A16.optBoolean("sync_devices", true), A16.optBoolean("sync_payment", true), A16.optBoolean("sync_disappearing_mode", true), A16.optBoolean("sync_lid", true), A16.optBoolean("sync_contact", true), A16.optBoolean("sync_bot"), A16.optBoolean("sync_username", true), A16.optBoolean("sync_text_status", true));
                C63212sh.A01(A002, A13);
                A002.A08.addAll(A132);
                C62592re A023 = A002.A02();
                A023.A00 = A16.getInt("sync_retry_count");
                if (A16.getBoolean("sync_should_retry")) {
                    A023.A02(new AnonymousClass2P4(true));
                }
                return A023;
            }
        }
        return null;
    }

    public String A01() {
        JSONObject A15 = C17880vN.A15();
        A15.put("sync_type_code", this.A03.code);
        A15.put("sync_is_urgent", this.A02);
        A15.put("sync_only_if_changed", this.A08);
        A15.put("sync_only_if_registered", this.A09);
        A15.put("sync_clear_whatsapp_sync_data", this.A07);
        A15.put("sync_should_retry", A03());
        A15.put("sync_retry_count", this.A00);
        A15.put("sync_contact", this.A0C);
        A15.put("sync_sidelist", this.A0I);
        A15.put("sync_status", this.A0J);
        A15.put("sync_picture", this.A0H);
        A15.put("sync_disappearing_mode", this.A0E);
        A15.put("sync_lid", this.A0F);
        A15.put("sync_devices", this.A0D);
        A15.put("sync_bot", this.A0A);
        A15.put("sync_username", this.A0L);
        A15.put("sync_text_status", this.A0K);
        List<byte[]> list = this.A05;
        if (!list.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            for (byte[] encodeToString : list) {
                A13.add(Base64.encodeToString(encodeToString, 0));
            }
            A15.put("sync_jid_hash", new JSONArray(A13));
        }
        Set set = this.A06;
        if (!set.isEmpty()) {
            ArrayList A132 = AnonymousClass000.A13();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Jid A0S = C17880vN.A0S(it);
                if (A0S != null) {
                    A132.add(A0S.getRawString());
                }
            }
            A15.put("sync_jid", new JSONArray(A132));
        }
        return A15.toString();
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncRequest, mode=");
        AnonymousClass2R1 r1 = this.A03;
        A10.append(r1.mode.modeString);
        A10.append(", context=");
        A10.append(r1.context.contextString);
        A10.append(", protocols=");
        String str11 = "";
        if (this.A0H) {
            str = "A";
        } else {
            str = str11;
        }
        A10.append(str);
        if (this.A0C) {
            str2 = "C";
        } else {
            str2 = str11;
        }
        A10.append(str2);
        if (this.A0I) {
            str3 = "I";
        } else {
            str3 = str11;
        }
        A10.append(str3);
        if (this.A0J) {
            str4 = "S";
        } else {
            str4 = str11;
        }
        A10.append(str4);
        if (this.A0B) {
            str5 = "B";
        } else {
            str5 = str11;
        }
        A10.append(str5);
        if (this.A0D) {
            str6 = "D";
        } else {
            str6 = str11;
        }
        A10.append(str6);
        if (this.A0G) {
            str7 = "P";
        } else {
            str7 = str11;
        }
        A10.append(str7);
        if (this.A0E) {
            str8 = "M";
        } else {
            str8 = str11;
        }
        A10.append(str8);
        if (this.A0F) {
            str9 = "L";
        } else {
            str9 = str11;
        }
        A10.append(str9);
        if (this.A0A) {
            str10 = "T";
        } else {
            str10 = str11;
        }
        A10.append(str10);
        if (this.A0K) {
            str11 = "E";
        }
        return AnonymousClass000.A0y(str11, A10);
    }
}
