package X;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.8zT  reason: invalid class name and case insensitive filesystem */
public final class C175908zT extends C175498yo {
    public final /* synthetic */ C22449B8h A00;
    public final /* synthetic */ C175738zC A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public void A04(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        super.A04(a7b);
        AnonymousClass8BR.A0b(this.A01.A00).A01(a7b, this.A02, "upi-get-p2m-encrypted-data");
        this.A00.C3t(a7b, (AnonymousClass9NV) null);
    }

    public void A05(A7B a7b) {
        C18070vi.A0d(a7b, 0);
        super.A05(a7b);
        AnonymousClass8BR.A0b(this.A01.A00).A01(a7b, this.A02, "upi-get-p2m-config");
        this.A00.C3t(a7b, (AnonymousClass9NV) null);
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.9NV, java.lang.Object] */
    public void A06(C29621ca r10) {
        C20118A8b A012;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C18070vi.A0d(r10, 0);
        String A0P = r10.A0L("account").A0P("encrypted_data");
        String str6 = this.A04;
        AnonymousClass8BR.A0b(this.A01.A00).A02(this.A02, "upi-get-p2m-encrypted-data", 2);
        byte[] decode = Base64.decode(str6, 2);
        Charset charset = C26571Sq.A05;
        byte[] A002 = C20058A5h.A00(decode, C18070vi.A1A("", charset), 112);
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[32];
        System.arraycopy(A002, 0, bArr, 0, 16);
        System.arraycopy(A002, 16, bArr2, 0, 32);
        try {
            byte[] decode2 = Base64.decode(A0P, 2);
            byte[] A1Q = AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(bArr2), AnonymousClass8BR.A19(bArr), Cipher.getInstance("AES/CBC/PKCS5Padding"), decode2, 2);
            C18070vi.A0b(A1Q);
            String str7 = new String(A1Q, charset);
            if (str7.length() != 0) {
                String str8 = this.A03;
                C22449B8h b8h = this.A00;
                if (C18070vi.A18(str8, "upi_merchant_vpa")) {
                    Map A032 = C20064A5n.A03(str7);
                    str2 = AnonymousClass8BU.A0p("merchant_vpa", A032);
                    str3 = AnonymousClass8BU.A0p("merchant_name", A032);
                    str = AnonymousClass8BU.A0p("merchant_category_code", A032);
                    str4 = AnonymousClass8BU.A0p("purpose_code", A032);
                    str5 = AnonymousClass8BU.A0p("tr", A032);
                } else if (C18070vi.A18(str8, "upi_intent_link") && (A012 = C20118A8b.A01(AnonymousClass8BU.A0p("link", C20064A5n.A03(str7)), "DEEP_LINK")) != null) {
                    str = A012.A06;
                    if (str == null || (str2 = A012.A0O) == null || (str3 = A012.A09) == null || (str4 = A012.A0C) == null) {
                        b8h.C3t(A7B.A00(), (AnonymousClass9NV) null);
                        return;
                    } else {
                        C18070vi.A0z(str3, "null cannot be cast to non-null type kotlin.String");
                        str5 = A012.A0K;
                    }
                } else {
                    return;
                }
                ? obj = new Object();
                obj.A00 = str;
                obj.A04 = str2;
                obj.A02 = str3;
                obj.A03 = str4;
                obj.A05 = str5;
                obj.A01 = null;
                b8h.C3t((A7B) null, obj);
                return;
            }
        } catch (Exception e) {
            if ((e instanceof InvalidKeyException) || (e instanceof NoSuchPaddingException) || (e instanceof NoSuchAlgorithmException) || (e instanceof BadPaddingException) || (e instanceof IllegalBlockSizeException) || (e instanceof InvalidAlgorithmParameterException)) {
                C17900vP.A0X(e, "IndiaUpiHybridDecryptionUtil/decryptMerchantInformation decryption exception ", AnonymousClass000.A10());
            } else {
                throw e;
            }
        }
        this.A00.C3t(A7B.A00(), (AnonymousClass9NV) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175908zT(Context context, AnonymousClass1KB r8, C33711jG r9, C196259ui r10, C22449B8h b8h, C175738zC r12, Integer num, String str, String str2) {
        super(context, r8, r9, r10, "upi-get-p2m-encrypted-data");
        this.A01 = r12;
        this.A02 = num;
        this.A00 = b8h;
        this.A04 = str;
        this.A03 = str2;
    }
}
