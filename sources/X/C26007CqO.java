package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.CqO  reason: case insensitive filesystem */
public class C26007CqO {
    public C26007CqO A00;
    public byte[] A01;
    public final String A02;

    public final int A02(C26280Cwb cwb) {
        int i = 0;
        for (C26007CqO cqO = this; cqO != null; cqO = cqO.A00) {
            cwb.A0A(cqO.A02);
            i += cqO.A01.length + 6;
        }
        return i;
    }

    public final void A03(C26151CtI ctI, C26280Cwb cwb) {
        for (C26007CqO cqO = this; cqO != null; cqO = cqO.A00) {
            byte[] bArr = cqO.A01;
            int length = bArr.length;
            C26280Cwb.A07(cqO.A02, ctI, cwb);
            ctI.A04(length);
            ctI.A0A(bArr, 0, length);
        }
    }

    public static int A00(C26280Cwb cwb, int i, int i2) {
        int i3;
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || cwb.A03 >= 49) {
            i3 = 0;
        } else {
            cwb.A0A("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            cwb.A0A("Signature");
            i3 += 8;
        }
        if ((i & A7Y.A0F) == 0) {
            return i3;
        }
        cwb.A0A("Deprecated");
        return i3 + 6;
    }

    public static void A01(C26151CtI ctI, C26280Cwb cwb, int i, int i2) {
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && cwb.A03 < 49) {
            C26280Cwb.A07("Synthetic", ctI, cwb);
            ctI.A04(0);
        }
        if (i2 != 0) {
            C26280Cwb.A07("Signature", ctI, cwb);
            ctI.A04(2);
            ctI.A05(i2);
        }
        if ((i & A7Y.A0F) != 0) {
            C26280Cwb.A07("Deprecated", ctI, cwb);
            ctI.A04(0);
        }
    }

    public C26007CqO(String str) {
        this.A02 = str;
    }
}
