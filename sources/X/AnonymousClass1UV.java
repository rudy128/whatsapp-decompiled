package X;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1UV  reason: invalid class name */
public final class AnonymousClass1UV {
    public final byte[] A00(AnonymousClass1E7 r10, C166438ct r11) {
        AnonymousClass2R6 r0;
        C23577Bm6 A0C;
        AnonymousClass2R6 r02;
        C18070vi.A0d(r10, 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(r11.clientSecretKeyData_.A06(), "AES-GCM");
        int i = (int) r11.keyId_;
        C23624Bmt A0N = AnonymousClass2BE.DEFAULT_INSTANCE.A0N();
        C23624Bmt A0N2 = AnonymousClass2BO.DEFAULT_INSTANCE.A0N();
        String str = r10.A0T;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String A0Q = C29361c9.A0Q(str, 40);
        A0N2.A0E();
        AnonymousClass2BO r1 = (AnonymousClass2BO) A0N2.A00;
        r1.bitField0_ |= 1;
        r1.firstName_ = A0Q;
        String str3 = r10.A0S;
        if (str3 == null) {
            str3 = str2;
        }
        String A0Q2 = C29361c9.A0Q(str3, 40);
        A0N2.A0E();
        AnonymousClass2BO r12 = (AnonymousClass2BO) A0N2.A00;
        r12.bitField0_ |= 2;
        r12.lastName_ = A0Q2;
        String str4 = r10.A0Q;
        if (str4 != null) {
            str2 = str4;
        }
        String A0Q3 = C29361c9.A0Q(str2, 75);
        A0N2.A0E();
        AnonymousClass2BO r13 = (AnonymousClass2BO) A0N2.A00;
        r13.bitField0_ |= 4;
        r13.businessName_ = A0Q3;
        if (r10.A09 == 0) {
            r0 = AnonymousClass2R6.SYNC_TO_DEVICE;
        } else {
            r0 = AnonymousClass2R6.NOT_SYNC_TO_DEVICE;
        }
        A0N2.A0E();
        AnonymousClass2BO r14 = (AnonymousClass2BO) A0N2.A00;
        r14.syncPolicy_ = r0.BVW();
        r14.bitField0_ |= 8;
        AnonymousClass2BO r8 = (AnonymousClass2BO) A0N2.A0C();
        C18070vi.A0b(r8);
        int max = Math.max(165 - r8.A0M().length, 0);
        if (max > 0) {
            C23624Bmt A0N3 = AnonymousClass2BO.DEFAULT_INSTANCE.A0N();
            String str5 = r8.firstName_;
            A0N3.A0E();
            AnonymousClass2BO r15 = (AnonymousClass2BO) A0N3.A00;
            str5.getClass();
            r15.bitField0_ |= 1;
            r15.firstName_ = str5;
            String str6 = r8.lastName_;
            A0N3.A0E();
            AnonymousClass2BO r16 = (AnonymousClass2BO) A0N3.A00;
            str6.getClass();
            r16.bitField0_ |= 2;
            r16.lastName_ = str6;
            String str7 = r8.businessName_;
            A0N3.A0E();
            AnonymousClass2BO r17 = (AnonymousClass2BO) A0N3.A00;
            str7.getClass();
            r17.bitField0_ |= 4;
            r17.businessName_ = str7;
            int i2 = r8.syncPolicy_;
            if (i2 == 0) {
                r02 = AnonymousClass2R6.SYNC_TO_DEVICE;
            } else if (i2 != 1) {
                r02 = AnonymousClass2R6.UNRECOGNIZED;
            } else {
                r02 = AnonymousClass2R6.NOT_SYNC_TO_DEVICE;
            }
            A0N3.A0E();
            AnonymousClass2BO r18 = (AnonymousClass2BO) A0N3.A00;
            r18.syncPolicy_ = r02.BVW();
            r18.bitField0_ |= 8;
            byte[] bArr = new byte[max];
            int i3 = 0;
            do {
                bArr[i3] = 0;
                i3++;
            } while (i3 < max);
            C23581BmB A01 = DSQ.A01(bArr, 0, max);
            A0N3.A0E();
            AnonymousClass2BO r19 = (AnonymousClass2BO) A0N3.A00;
            r19.bitField0_ |= 16;
            r19.padding_ = A01;
            A0C = A0N3.A0C();
        } else {
            A0C = A0N2.A0C();
        }
        byte[] A0M = A0C.A0M();
        byte[] bArr2 = new byte[12];
        C22691Cv.A00().nextBytes(bArr2);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        C18070vi.A0X(instance);
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        AnonymousClass1D6 r03 = new AnonymousClass1D6(instance.doFinal(A0M), bArr2);
        byte[] bArr3 = (byte[]) r03.first;
        byte[] bArr4 = (byte[]) r03.second;
        A0N.A0E();
        AnonymousClass2BE r110 = (AnonymousClass2BE) A0N.A00;
        r110.bitField0_ |= 2;
        r110.keyId_ = i;
        C23581BmB A012 = DSQ.A01(bArr4, 0, bArr4.length);
        A0N.A0E();
        AnonymousClass2BE r111 = (AnonymousClass2BE) A0N.A00;
        r111.bitField0_ |= 1;
        r111.iv_ = A012;
        C23581BmB A013 = DSQ.A01(bArr3, 0, bArr3.length);
        A0N.A0E();
        AnonymousClass2BE r112 = (AnonymousClass2BE) A0N.A00;
        r112.bitField0_ |= 4;
        r112.contactMetadataEncrypted_ = A013;
        return A0N.A0C().A0M();
    }
}
