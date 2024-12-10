package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2k9  reason: invalid class name and case insensitive filesystem */
public class C58102k9 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public final DeviceJid A04;
    public final String A05;
    public final Map A06 = C17880vN.A11();
    public final Set A07;
    public final /* synthetic */ C35151lj A08;

    public C58102k9(C35151lj r2, DeviceJid deviceJid, String str, Set set) {
        this.A08 = r2;
        this.A05 = str;
        this.A04 = deviceJid;
        this.A07 = set;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.234, X.231, X.206, X.239] */
    public void A00(AnonymousClass9KN r21, C1418377d r22, String str, boolean z) {
        C23577Bm6 bm6;
        C1418377d r5 = r22;
        boolean A1W = AnonymousClass000.A1W(r5);
        Map map = this.A06;
        if (A1W) {
            C163808Wk r7 = (C163808Wk) C166218cX.DEFAULT_INSTANCE.A0N();
            if (!TextUtils.isEmpty(r5.A0I)) {
                String str2 = r5.A0I;
                C166218cX r1 = (C166218cX) C17880vN.A0G(r7);
                str2.getClass();
                r1.bitField0_ |= 1;
                r1.url_ = str2;
            }
            String str3 = r5.A0F;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode = Base64.decode(str3, 0);
                r7.A0G(DSQ.A01(decode, 0, decode.length));
            }
            String str4 = r5.A0A;
            if (!TextUtils.isEmpty(str4)) {
                byte[] decode2 = Base64.decode(str4, 0);
                C23581BmB A012 = DSQ.A01(decode2, 0, decode2.length);
                C166218cX r12 = (C166218cX) C17880vN.A0G(r7);
                r12.bitField0_ |= 4;
                r12.fileEncSha256_ = A012;
            }
            String str5 = r5.A0D;
            if (!TextUtils.isEmpty(str5)) {
                byte[] decode3 = Base64.decode(str5, 1);
                C23581BmB A013 = DSQ.A01(decode3, 0, decode3.length);
                C166218cX r13 = (C166218cX) C17880vN.A0G(r7);
                r13.bitField0_ |= 8;
                r13.mediaKey_ = A013;
            }
            String str6 = r5.A0E;
            if (!TextUtils.isEmpty(str6)) {
                C166218cX r14 = (C166218cX) C17880vN.A0G(r7);
                str6.getClass();
                r14.bitField0_ |= 16;
                r14.mimetype_ = str6;
            }
            int i = r5.A02;
            C166218cX r15 = (C166218cX) C17880vN.A0G(r7);
            r15.bitField0_ |= 32;
            r15.height_ = i;
            int i2 = r5.A03;
            C166218cX r16 = (C166218cX) C17880vN.A0G(r7);
            r16.bitField0_ |= 64;
            r16.width_ = i2;
            String str7 = r5.A08;
            if (!TextUtils.isEmpty(str7)) {
                C166218cX r17 = (C166218cX) C17880vN.A0G(r7);
                str7.getClass();
                r17.bitField0_ |= 128;
                r17.directPath_ = str7;
            }
            long j = (long) r5.A00;
            C166218cX r18 = (C166218cX) C17880vN.A0G(r7);
            r18.bitField0_ |= 256;
            r18.fileLength_ = j;
            bm6 = r7.A0C();
        } else {
            bm6 = null;
        }
        AnonymousClass9KN r52 = r21;
        map.put(str, new Pair(r52, bm6));
        Set set = this.A07;
        set.size();
        map.size();
        if (r52 == AnonymousClass9KN.SUCCESS) {
            if (z) {
                this.A03++;
            } else {
                this.A01++;
            }
        } else if (r52 == AnonymousClass9KN.GENERAL_ERROR) {
            this.A00++;
        } else {
            this.A02++;
        }
        if (map.size() == set.size()) {
            C35151lj r9 = this.A08;
            C34931lJ r11 = r9.A04;
            DeviceJid deviceJid = this.A04;
            String str8 = this.A05;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker stanzaId=");
            A10.append(str8);
            A10.append("; remoteDeviceJid");
            A10.append(deviceJid);
            A10.append("; stickerSize=");
            C17900vP.A0o(A10, map.size());
            if (map.isEmpty()) {
                Log.w("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker result is empty");
            } else {
                ? r8 = new AnonymousClass206(C17880vN.A0Z(AnonymousClass11S.A00(r11.A00), r11.A08), 76, AnonymousClass11P.A01(r11.A04));
                r8.A00 = str8;
                r8.A00 = C17880vN.A11();
                r8.A00 = deviceJid;
                r8.A00 = map;
                if (r11.A07.A01(r8) < 0) {
                    Log.e("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage unable to add sticker peer message");
                } else {
                    r11.A01.A01(new SendPeerMessageJob(deviceJid, r8));
                }
            }
            r9.A03.A04(str8, 0, set.size(), this.A03, this.A01, 0, this.A00, this.A02);
        }
    }
}
