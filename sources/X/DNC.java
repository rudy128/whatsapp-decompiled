package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class DNC implements C28668EDk {
    public int memoizedHashCode = 0;

    public int A0J(EAO eao) {
        int i;
        C23577Bm6 bm6 = (C23577Bm6) this;
        if (AnonymousClass000.A1O(bm6.memoizedSerializedSize & Integer.MIN_VALUE)) {
            if (eao == null) {
                eao = BE9.A0U(bm6);
            }
            i = eao.BZ1(bm6);
            if (i < 0) {
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), i);
            }
        } else {
            i = bm6.memoizedSerializedSize & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                if (eao == null) {
                    eao = BE9.A0U(bm6);
                }
                int BZ1 = eao.BZ1(bm6);
                if (BZ1 >= 0) {
                    bm6.memoizedSerializedSize = (Integer.MAX_VALUE & BZ1) | (bm6.memoizedSerializedSize & Integer.MIN_VALUE);
                    return BZ1;
                }
                throw AnonymousClass8BX.A0W("serialized size must be non-negative, was ", AnonymousClass000.A10(), BZ1);
            }
        }
        return i;
    }

    public C23581BmB A0K() {
        try {
            int A0J = A0J((EAO) null);
            E67 e67 = DSQ.A01;
            byte[] bArr = new byte[A0J];
            C23586BmG bmG = new C23586BmG(bArr, A0J);
            CSU(bmG);
            bmG.A05();
            return new C23581BmB(bArr);
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Serializing ");
            AnonymousClass8BW.A1M(this, A10);
            A10.append(" to a ");
            A10.append("ByteString");
            throw BE6.A0o(AnonymousClass000.A0y(" threw an IOException (should never happen).", A10), e);
        }
    }

    public void A0L(OutputStream outputStream) {
        int A0J = A0J((EAO) null);
        boolean z = CodedOutputStream.A01;
        int A02 = BEB.A02(A0J) + A0J;
        if (A02 > 4096) {
            A02 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        C23587BmH bmH = new C23587BmH(outputStream, A02);
        bmH.A08(A0J);
        CSU(bmH);
        if (bmH.A00 > 0) {
            C23587BmH.A00(bmH);
        }
    }

    public byte[] A0M() {
        try {
            int A0J = A0J((EAO) null);
            byte[] bArr = new byte[A0J];
            C23586BmG bmG = new C23586BmG(bArr, A0J);
            CSU(bmG);
            bmG.A05();
            return bArr;
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Serializing ");
            AnonymousClass8BW.A1M(this, A10);
            A10.append(" to a ");
            A10.append("byte array");
            throw BE6.A0o(AnonymousClass000.A0y(" threw an IOException (should never happen).", A10), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        int A0J = A0J((EAO) null);
        if (A0J > 4096) {
            A0J = ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        C23587BmH bmH = new C23587BmH(outputStream, A0J);
        CSU(bmH);
        if (bmH.A00 > 0) {
            C23587BmH.A00(bmH);
        }
    }

    public static C23577Bm6 A0I(C23577Bm6 bm6) {
        return (C23577Bm6) bm6.A0P(AnonymousClass00R.A0N, (Object) null);
    }
}
