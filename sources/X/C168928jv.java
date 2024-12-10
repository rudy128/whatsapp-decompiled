package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8jv  reason: invalid class name and case insensitive filesystem */
public class C168928jv extends C65802x8 {
    public final C50422Uj A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r21, C25681CkC ckC, String str) {
        Throwable th;
        if (str.equals("bk.action.apt.PleEncrypt")) {
            HashMap A11 = C17880vN.A11();
            List list = r21.A00;
            DFL A0G = AnonymousClass8BR.A0G(list, 0);
            String A0D = A0G.A0D(41);
            String A0D2 = A0G.A0D(35);
            Long valueOf = Long.valueOf(A0G.A05(36, -1));
            Long valueOf2 = Long.valueOf(A0G.A05(38, -1));
            A11.put("purpose", A0D);
            A11.put("publicKey", A0D2);
            A11.put("serverTimestamp", valueOf);
            A11.put("validTilTimestamp", valueOf2);
            String A0w = C17880vN.A0w(list, 1);
            E8A A07 = AnonymousClass8BT.A07(list, 2);
            E8A A072 = AnonymousClass8BT.A07(list, 3);
            C25681CkC ckC2 = ckC;
            C18070vi.A0e(ckC2, 0, A0w);
            try {
                String A1G = C108945cZ.A1G("purpose", A11);
                if (A1G != null) {
                    byte[] decode = Base64.decode(C108945cZ.A1G("publicKey", A11), 8);
                    Long l = (Long) A11.get("serverTimestamp");
                    if (l != null) {
                        long longValue = l.longValue();
                        Long l2 = (Long) A11.get("validTilTimestamp");
                        if (l2 != null) {
                            long longValue2 = l2.longValue();
                            C18070vi.A0b(decode);
                            C186229dr r13 = new C186229dr(A1G, decode, longValue, longValue2);
                            SecureRandom secureRandom = C182109Tc.A00;
                            byte[] bArr = new byte[24];
                            C182109Tc.A00.nextBytes(bArr);
                            C53262cF A002 = C63962tz.A00();
                            byte[] A003 = C26098CsI.A00(r13.A00, A002.A00.A00);
                            Charset charset = C26571Sq.A05;
                            byte[] A02 = C25892Co3.A02(A003, bArr, C18070vi.A1A(A0w, charset));
                            byte[] bArr2 = A002.A01.A00;
                            int length = bArr2.length + 24 + A02.length;
                            String str2 = r13.A02;
                            ByteBuffer allocate = ByteBuffer.allocate(C18070vi.A1A(str2, charset).length + 5 + 8 + length + 16);
                            allocate.order(ByteOrder.BIG_ENDIAN);
                            allocate.put((byte) 4);
                            allocate.putInt(4);
                            allocate.putInt(0);
                            allocate.putInt(str2.length());
                            allocate.put(C18070vi.A1A(str2, charset));
                            allocate.putInt(8);
                            allocate.putLong(r13.A01);
                            allocate.putInt(length);
                            allocate.put(bArr2);
                            allocate.put(bArr);
                            allocate.put(A02);
                            if (!allocate.hasRemaining()) {
                                byte[] array = allocate.array();
                                C18070vi.A0X(array);
                                new C25974Cph(ALS.A06(ckC2)).A02(C20046A4p.A00(new C20046A4p(), Base64.encodeToString(array, 8), 0), A07);
                                return null;
                            }
                            th = AnonymousClass000.A0n("Ciphertext array not fully written");
                        } else {
                            th = AnonymousClass000.A0s("validTilTimestamp must not be null");
                        }
                    } else {
                        th = AnonymousClass000.A0s("serverTimestamp must not be null");
                    }
                } else {
                    th = AnonymousClass000.A0s("purpose must not be null");
                }
                throw th;
            } catch (RuntimeException unused) {
                new C25974Cph(ALS.A06(ckC2)).A02(C20046A4p.A00(new C20046A4p(), 0, 0), A072);
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168928jv(X.C50422Uj r4) {
        /*
            r3 = this;
            java.lang.String[] r2 = X.C17880vN.A1Y()
            r1 = 0
            java.lang.String r0 = "bk.action.apt.PleEncrypt"
            r2[r1] = r0
            r3.<init>(r2)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168928jv.<init>(X.2Uj):void");
    }
}
