package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9ts  reason: invalid class name and case insensitive filesystem */
public final class C195769ts {
    public final long A00;
    public final ARR A01;
    public final AES A02;
    public final UserJid A03;
    public final C20266ADy A04;
    public final C20931Abl A05;
    public final AnonymousClass205 A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195769ts) {
                C195769ts r8 = (C195769ts) obj;
                if (!C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A09, r8.A09) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A06, r8.A06) || this.A00 != r8.A00 || this.A0A != r8.A0A || this.A07 != r8.A07 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A022 = C17890vO.A02(this.A09, C17890vO.A02(this.A08, AnonymousClass000.A0L(this.A03)));
        int A002 = AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A00, (AnonymousClass000.A0N(this.A01, A022) + AnonymousClass001.A0k(this.A06)) * 31), this.A0A);
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 0:
                str = "P2M_HYBRID_V1";
                break;
            case 1:
                str = "P2M_HYBRID_V2";
                break;
            default:
                str = "DYNAMIC_VPA";
                break;
        }
        return ((((AnonymousClass8BW.A03(str, intValue, A002) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + C17880vN.A02(this.A05);
    }

    public C195769ts(ARR arr, AES aes, UserJid userJid, C20266ADy aDy, C20931Abl abl, AnonymousClass205 r7, Integer num, String str, String str2, long j, boolean z) {
        C18070vi.A0s(userJid, str, str2, arr);
        C18070vi.A0d(num, 8);
        this.A03 = userJid;
        this.A08 = str;
        this.A09 = str2;
        this.A01 = arr;
        this.A06 = r7;
        this.A00 = j;
        this.A0A = z;
        this.A07 = num;
        this.A02 = aes;
        this.A04 = aDy;
        this.A05 = abl;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutRequestObject(receiverJid=");
        A10.append(this.A03);
        A10.append(", orderId=");
        A10.append(this.A08);
        A10.append(", paymentConfigId=");
        A10.append(this.A09);
        A10.append(", paymentMoney=");
        A10.append(this.A01);
        A10.append(", messageKey=");
        A10.append(this.A06);
        A10.append(", orderExpiryTsInSec=");
        A10.append(this.A00);
        A10.append(", isP2mHybridV2Flow=");
        A10.append(this.A0A);
        A10.append(", p2mProduct=");
        switch (this.A07.intValue()) {
            case 0:
                str = "P2M_HYBRID_V1";
                break;
            case 1:
                str = "P2M_HYBRID_V2";
                break;
            default:
                str = "DYNAMIC_VPA";
                break;
        }
        A10.append(str);
        A10.append(", shippingInfo=");
        A10.append(this.A02);
        A10.append(", coupon=");
        A10.append(this.A04);
        A10.append(", dynamicVpaInternalMetadata=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
