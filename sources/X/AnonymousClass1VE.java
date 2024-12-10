package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.H26xSupportResult;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1VE  reason: invalid class name */
public class AnonymousClass1VE {
    public SharedPreferences A00;
    public final C18030ve A01;
    public final AnonymousClass1DC A02;
    public final C18010vc A03;

    public static synchronized SharedPreferences A00(AnonymousClass1VE r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A03.A05("voip_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(int i, int i2) {
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip_camera_info_");
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip_camera_info_");
        sb2.append(i);
        sb2.append("_api_");
        sb2.append(i2);
        return sb2.toString();
    }

    public String A03() {
        String A012 = C18020vd.A01(C18040vf.A02, this.A01, 151);
        if (TextUtils.isEmpty(A012)) {
            return A00(this).getString("camera2_required_hardware_support_level", (String) null);
        }
        return A012;
    }

    public AnonymousClass1VE(C18030ve r1, C18010vc r2, AnonymousClass1DC r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public UserJid A02(String str) {
        SharedPreferences A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("ad_hoc_call_invitor_");
        sb.append(str);
        return UserJid.Companion.A04(A002.getString(sb.toString(), (String) null));
    }

    public ArrayList A04() {
        Map<String, ?> all = A00(this).getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith("joinable_")) {
                arrayList.add(next.substring(9));
            }
        }
        return arrayList;
    }

    public void A05(long j) {
        A00(this).edit().putInt("ar_tooltip_show_count", A00(this).getInt("ar_tooltip_show_count", 0) + 1).putLong("tooltip_last_shown_ms", j).apply();
    }

    public void A06(UserJid userJid, String str) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("ad_hoc_call_invitor_");
        sb.append(str);
        edit.putString(sb.toString(), userJid.getRawString()).apply();
    }

    public void A07(H26xSupportResult h26xSupportResult) {
        A00(this).edit().putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported).putBoolean("video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported).apply();
    }

    public void A08(String str) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("joinable_");
        sb.append(str);
        edit.remove(sb.toString()).apply();
    }

    public boolean A09() {
        SharedPreferences A002 = A00(this);
        if (A00(this).getBoolean("permanently_hide_return_to_call_text", false) || A002.getBoolean("hide_return_to_call_text_for_call", false)) {
            return true;
        }
        return false;
    }
}
