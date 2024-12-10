package X;

import com.whatsapp.qrcode.DevicePairQrScannerActivity;

/* renamed from: X.6xH  reason: invalid class name and case insensitive filesystem */
public class C138556xH {
    public int A00;
    public C129996ii A01;
    public String A02;
    public final AnonymousClass190 A03;
    public final BCS A04;
    public final C108555bt A05;
    public final C57652jQ A06;

    public static BCS A00(DevicePairQrScannerActivity devicePairQrScannerActivity) {
        BCS bcs = devicePairQrScannerActivity.A08.A00().A05.A04;
        devicePairQrScannerActivity.A0C.get();
        return bcs;
    }

    public C138556xH(AnonymousClass190 r7, C57652jQ r8, C130006ij r9, C108555bt r10) {
        Object obj;
        this.A05 = r10;
        this.A03 = r7;
        this.A06 = r8;
        if (r9.A02.A0B()) {
            AnonymousClass11P r2 = r9.A01;
            C18030ve r3 = r9.A03;
            AnonymousClass10I r5 = r9.A05;
            obj = new C143397Df(r9.A00, r2, r3, r9.A04, r5);
        } else {
            obj = new Object();
        }
        this.A04 = (BCS) obj;
    }
}
