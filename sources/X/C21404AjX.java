package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AjX  reason: case insensitive filesystem */
public final /* synthetic */ class C21404AjX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C35151lj A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ Set A08;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.234, X.235, X.231, X.206] */
    public final void run() {
        C23577Bm6 bm6;
        C35151lj r12 = this.A03;
        List<C185799dA> list = this.A06;
        Map map = this.A07;
        DeviceJid deviceJid = this.A04;
        String str = this.A05;
        Set set = this.A08;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = 0;
        for (C185799dA r0 : list) {
            if (r0 != null) {
                String str2 = r0.A02;
                AnonymousClass9KN r13 = r0.A01;
                C198659yh r7 = r0.A00;
                if (r7 != null) {
                    C23624Bmt A0N = C165898bw.DEFAULT_INSTANCE.A0N();
                    String str3 = r7.A06;
                    C165898bw A0I = AnonymousClass8BV.A0I(A0N, str3);
                    A0I.bitField0_ |= 1;
                    A0I.url_ = str3;
                    String str4 = r7.A05;
                    if (!TextUtils.isEmpty(str4)) {
                        C165898bw A0I2 = AnonymousClass8BV.A0I(A0N, str4);
                        A0I2.bitField0_ |= 2;
                        A0I2.title_ = str4;
                    }
                    String str5 = r7.A02;
                    if (!TextUtils.isEmpty(str5)) {
                        C165898bw A0I3 = AnonymousClass8BV.A0I(A0N, str5);
                        A0I3.bitField0_ |= 4;
                        A0I3.description_ = str5;
                    }
                    byte[] bArr = r7.A07;
                    if (bArr != null) {
                        C23581BmB A032 = C17900vP.A03(A0N, bArr);
                        C165898bw r1 = (C165898bw) A0N.A00;
                        r1.bitField0_ |= 8;
                        r1.thumbData_ = A032;
                    }
                    String str6 = r7.A01;
                    if (!TextUtils.isEmpty(str6)) {
                        C165898bw A0I4 = AnonymousClass8BV.A0I(A0N, str6);
                        A0I4.bitField0_ |= 16;
                        A0I4.canonicalUrl_ = str6;
                    }
                    String str7 = r7.A03;
                    if (!TextUtils.isEmpty(str7)) {
                        C165898bw A0I5 = AnonymousClass8BV.A0I(A0N, str7);
                        A0I5.bitField0_ |= 32;
                        A0I5.matchText_ = str7;
                    }
                    String str8 = r7.A04;
                    if (!TextUtils.isEmpty(str8)) {
                        C165898bw A0I6 = AnonymousClass8BV.A0I(A0N, str8);
                        A0I6.bitField0_ |= 64;
                        A0I6.previewType_ = str8;
                    }
                    C187919ga r5 = r7.A00;
                    if (r5 != null) {
                        C23624Bmt A0N2 = C165808bn.DEFAULT_INSTANCE.A0N();
                        String str9 = r5.A03;
                        C165808bn r14 = (C165808bn) C17880vN.A0G(A0N2);
                        str9.getClass();
                        r14.bitField0_ |= 1;
                        r14.directPath_ = str9;
                        String str10 = r5.A05;
                        C165808bn r15 = (C165808bn) C17880vN.A0G(A0N2);
                        str10.getClass();
                        r15.bitField0_ |= 2;
                        r15.thumbHash_ = str10;
                        String str11 = r5.A04;
                        C165808bn r16 = (C165808bn) C17880vN.A0G(A0N2);
                        str11.getClass();
                        r16.bitField0_ |= 4;
                        r16.encThumbHash_ = str11;
                        C23581BmB A033 = C17900vP.A03(A0N2, r5.A06);
                        C165808bn r17 = (C165808bn) A0N2.A00;
                        r17.bitField0_ |= 8;
                        r17.mediaKey_ = A033;
                        long j = r5.A02;
                        C165808bn r18 = (C165808bn) C17880vN.A0G(A0N2);
                        r18.bitField0_ |= 16;
                        r18.mediaKeyTimestampMs_ = j;
                        int i5 = r5.A01;
                        C165808bn r19 = (C165808bn) C17880vN.A0G(A0N2);
                        r19.bitField0_ |= 32;
                        r19.thumbWidth_ = i5;
                        int i6 = r5.A00;
                        C165808bn r110 = (C165808bn) C17880vN.A0G(A0N2);
                        r110.bitField0_ |= 64;
                        r110.thumbHeight_ = i6;
                        C165898bw r111 = (C165898bw) C17880vN.A0G(A0N);
                        C165808bn r02 = (C165808bn) A0N2.A0C();
                        r02.getClass();
                        r111.hqThumbnail_ = r02;
                        r111.bitField0_ |= 128;
                    }
                    bm6 = A0N.A0C();
                } else {
                    bm6 = null;
                }
                map.put(str2, C108945cZ.A0N(r13, bm6));
                if (r7 != null && r7.A00 == null) {
                    i4++;
                }
            }
        }
        C34931lJ r6 = r12.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview stanzaId=");
        A10.append(str);
        A10.append("; remoteDeviceJid");
        A10.append(deviceJid);
        A10.append("; linkPreviewSize=");
        C17900vP.A0o(A10, map.size());
        if (map.isEmpty()) {
            Log.w("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview result is empty");
        } else {
            ? r3 = new AnonymousClass206(C17880vN.A0Z(AnonymousClass11S.A00(r6.A00), r6.A08), 75, AnonymousClass11P.A01(r6.A04));
            r3.A00 = str;
            r3.A00 = C17880vN.A11();
            r3.A00 = deviceJid;
            r3.A00 = map;
            if (r6.A07.A01(r3) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage unable to add link preview peer message");
            } else {
                r6.A01.A01(new SendPeerMessageJob(deviceJid, r3));
            }
        }
        r12.A03.A04(str, 2, set.size(), i, i2, i4, 0, i3);
    }

    public /* synthetic */ C21404AjX(C35151lj r1, DeviceJid deviceJid, String str, List list, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = list;
        this.A07 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A08 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
