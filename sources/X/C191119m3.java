package X;

import com.whatsapp.util.Log;

/* renamed from: X.9m3  reason: invalid class name and case insensitive filesystem */
public class C191119m3 {
    public final /* synthetic */ C190719lP A00;
    public final /* synthetic */ C33351ig A01;
    public final /* synthetic */ C62212r1 A02;
    public final /* synthetic */ String A03;

    public C191119m3(C190719lP r1, C33351ig r2, C62212r1 r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
    }

    public void A00(A7B a7b) {
        C17900vP.A0X(a7b, "PAY: PaymentIncentiveManager/getIncentiveOfferInfo/getOfferDetails/onError : ", AnonymousClass000.A10());
        C190719lP r1 = this.A00;
        if (r1 != null) {
            Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
            r1.A00.Bsl();
        }
    }
}
