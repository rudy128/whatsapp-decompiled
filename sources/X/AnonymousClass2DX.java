package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2DX  reason: invalid class name */
public final class AnonymousClass2DX extends AnonymousClass8oT {
    public static final long A05 = TimeUnit.DAYS.toMillis(7);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2DX(UserJid userJid, String str, String str2, long j, long j2, boolean z) {
        super(userJid, 2);
        C18070vi.A0d(str, 2);
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
        this.A02 = str2;
    }

    public void A00(AnonymousClass8S3 r5, long j, boolean z) {
        C18070vi.A0d(r5, 0);
        try {
            String str = this.A03;
            if (str.length() > 0) {
                C166278cd r2 = (C166278cd) C17880vN.A0G(r5);
                int i = C166278cd.ACTION_LINK_FIELD_NUMBER;
                r2.bitField0_ |= 32768;
                r2.entryPointConversionSource_ = str;
            }
            String str2 = this.A02;
            if (!(str2 == null || str2.length() == 0)) {
                C166278cd r22 = (C166278cd) C17880vN.A0G(r5);
                int i2 = C166278cd.ACTION_LINK_FIELD_NUMBER;
                r22.bitField0_ |= 65536;
                r22.entryPointConversionApp_ = str2;
            }
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j - this.A00);
            C166278cd r23 = (C166278cd) C17880vN.A0G(r5);
            int i3 = C166278cd.ACTION_LINK_FIELD_NUMBER;
            r23.bitField0_ |= A7Y.A0F;
            r23.entryPointConversionDelaySeconds_ = seconds;
        } catch (Exception e) {
            Log.e("OrganicEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception=", e);
        }
    }

    public boolean A01() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            AnonymousClass2DX r7 = (AnonymousClass2DX) obj;
            if (!(this.A00 == r7.A00 && C18070vi.A18(this.A00.getRawString(), r7.A00.getRawString()) && C18070vi.A18(this.A03, r7.A03) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A04 == r7.A04 && C18070vi.A18(this.A02, r7.A02))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A03;
        C17890vO.A1O(objArr, this.A00);
        C17890vO.A1P(objArr, this.A01);
        objArr[5] = Boolean.valueOf(this.A04);
        return AnonymousClass000.A0P(this.A02, objArr, 6);
    }

    public final JSONObject A02() {
        JSONObject A15 = C17880vN.A15();
        A15.put("uj", this.A00.getRawString());
        A15.put("s", this.A03);
        String str = this.A02;
        if (!(str == null || str.length() == 0)) {
            A15.put("a", str);
        }
        A15.put("ct", this.A00);
        long j = this.A01;
        if (j != -1) {
            A15.put("fmts", j);
        }
        A15.put("wdtb", this.A04);
        return A15;
    }
}
