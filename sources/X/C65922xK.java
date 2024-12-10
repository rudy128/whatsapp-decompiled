package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2xK  reason: invalid class name and case insensitive filesystem */
public final class C65922xK implements C22416B6y {
    public final AnonymousClass190 A00;
    public final C56022gm A01;
    public final C18030ve A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass1OX A04;

    public final String A00(C54112dc r6) {
        byte[] bArr;
        try {
            byte[] A1A = C18070vi.A1A("", C26571Sq.A05);
            byte[] bArr2 = r6.A02;
            if (bArr2 != null) {
                bArr = AnonymousClass9QC.A00(A1A, bArr2);
                if (bArr != null) {
                    return Base64.encodeToString(bArr, 10);
                }
                return null;
            }
            throw C17880vN.A0g();
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/computeHMAC Failed to compute HMAC");
            this.A00.A0G("ACSTokenProviderImpl/computeHMAC", "Failed to compute HMAC", true);
            bArr = null;
        }
    }

    public void BLo(C72353Lp r32, C55882gW r33, String str) {
        int i;
        byte[] decode;
        C54112dc r4;
        int i2;
        C55882gW r7 = r33;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        C72353Lp r30 = r32;
        C57432j4 r1 = new C57432j4(r30, this, str2, this.A04);
        if (r33 == null) {
            try {
                C18030ve r5 = this.A02;
                C18040vf r42 = C18040vf.A02;
                r7 = new C55882gW(C18020vd.A00(r42, r5, 966), C18020vd.A00(r42, r5, 965), C18020vd.A00(r42, r5, 967), C18020vd.A00(r42, r5, 968), C18020vd.A00(r42, r5, 969), C18020vd.A00(r42, r5, 970), C18020vd.A00(r42, r5, 971), C18020vd.A00(r42, r5, 972));
            } catch (Exception unused) {
                Log.e("ACSTokenProviderImpl/generateACSToken Exception while generating ACS token");
                this.A00.A0G("ACSTokenProviderImpl/generateACSToken", "Exception while generating ACS token", true);
                r30.C8m(5);
                r1.A00(str2);
                return;
            }
        }
        C56022gm r9 = this.A01;
        if (!r9.A07.contains(str2)) {
            this.A00.A0G("ACSTokenProviderImpl/generateACSToken", AnonymousClass000.A0y(" is not registered with ACSTokenManager", AnonymousClass000.A11(str2)), false);
            r30.C8m(0);
            return;
        }
        Map map = r9.A09;
        if (!map.containsKey(str2)) {
            C63732tb r11 = new C63732tb(r9.A04, str2);
            AnonymousClass37D r14 = new AnonymousClass37D(C17880vN.A0U(r9.A06));
            AnonymousClass11P r13 = r9.A02;
            C18030ve r12 = r9.A03;
            AnonymousClass10I r52 = r9.A05;
            C63512tE r21 = new C63512tE(r9.A00, r9.A01, r11, r14, r13, r12, r52, str2);
            C63732tb.A01(r11, "token_length", r7.A06);
            C63732tb.A01(r11, "shared_secret_length", r7.A04);
            C63732tb.A02(r11, "max_time_to_live_in_sec", (long) r7.A07);
            C63732tb.A01(r11, "max_redeem_count", r7.A03);
            C63732tb.A01(r11, "lead_time_to_prefetch_sec", r7.A01);
            C63732tb.A01(r11, "lead_redeem_count_to_prefetch", r7.A00);
            C63732tb.A01(r11, "max_sign_retry_count", r7.A02);
            C63732tb.A02(r11, "sign_retry_interval_sec", (long) r7.A05);
            map.put(str2, r21);
            r9.A08.put(str2, r11);
            r21.A08.execute(new C70613Bu(r21, 34));
        }
        if (map.containsKey(str2)) {
            ((C63512tE) map.get(str2)).A0A.add(r1);
        }
        if (map.containsKey(str2) && r9.A08.get(str2) != null) {
            C63512tE r122 = (C63512tE) map.get(str2);
            C63732tb r92 = r122.A04;
            String string = C63732tb.A00(r92).getString("original_token_string", (String) null);
            long A002 = AnonymousClass11P.A00(r122.A06) - C17890vO.A05(C63732tb.A00(r92), "base_timestamp");
            byte[] bArr = null;
            if (string != null) {
                if (C63732tb.A00(r92).getInt("redeem_count", -1) >= C63732tb.A00(r92).getInt("max_redeem_count", -1) || A002 >= C63732tb.A00(r92).getLong("max_time_to_live_in_sec", 0)) {
                    decode = Base64.decode(string, 8);
                    if (!r122.A0E) {
                        r122.A08.execute(new C70613Bu(r122, 32));
                        i2 = C63732tb.A00(r92).getInt("token_not_ready_reason", 0);
                    } else {
                        r4 = new C54112dc(decode, (byte[]) null, 13);
                    }
                } else {
                    int i3 = C63732tb.A00(r92).getInt("redeem_count", -1) + 1;
                    C63732tb.A01(r92, "redeem_count", i3);
                    int i4 = C63732tb.A00(r92).getInt("lead_redeem_count_to_prefetch", 0);
                    int i5 = C63732tb.A00(r92).getInt("lead_time_to_prefetch_sec", 0);
                    if (i3 >= i4 || (A002 > C17890vO.A05(C63732tb.A00(r92), "max_time_to_live_in_sec") - ((long) i5) && !r122.A0E)) {
                        r122.A08.execute(new C70613Bu(r122, 33));
                    }
                    decode = Base64.decode(string, 8);
                    String string2 = C63732tb.A00(r92).getString("shared_secret_string", (String) null);
                    if (string2 != null) {
                        bArr = Base64.decode(string2, 8);
                    }
                    i2 = 0;
                    r92.A04(0);
                }
                r4 = new C54112dc(decode, bArr, i2);
            } else if (!r122.A0E) {
                r122.A08.execute(new C70613Bu(r122, 31));
                r92.A04(13);
                r4 = new C54112dc((byte[]) null, (byte[]) null, 13);
            } else {
                r4 = new C54112dc((byte[]) null, (byte[]) null, C63732tb.A00(r92).getInt("token_not_ready_reason", 0));
            }
            byte[] bArr2 = r4.A01;
            if (!(bArr2 == null || r4.A02 == null)) {
                String A003 = A00(r4);
                if (A003 == null || A003.length() == 0) {
                    i = 2;
                    r30.C8m(i);
                    r1.A00(str2);
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(Base64.encodeToString(bArr2, 10));
                r30.C8n(C17890vO.A0Z(A003, A10, '+'));
                r1.A00(str2);
            }
        }
        if (!this.A03.A09()) {
            i = 4;
            r30.C8m(i);
            r1.A00(str2);
        }
    }

    public C65922xK(AnonymousClass190 r1, C56022gm r2, AnonymousClass11E r3, C18030ve r4, AnonymousClass1OX r5) {
        C18070vi.A0w(r4, r1, r2, r3, r5);
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A04 = r5;
    }
}
