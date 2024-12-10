package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.protobuf.CodedOutputStream;

public final class DNF implements EAO {
    public final C24609CBn A00;
    public final C28668EDk A01;
    public final C25096CXo A02;

    public boolean BKS(Object obj, Object obj2) {
        return BE8.A1S(((C23577Bm6) obj).unknownFields.equals(((C23577Bm6) obj2).unknownFields) ? 1 : 0);
    }

    public int BZ1(Object obj) {
        C26042Cr6 cr6 = ((C23577Bm6) obj).unknownFields;
        int i = cr6.A00;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < cr6.count; i2++) {
                int i3 = cr6.A02[i2] >>> 3;
                boolean z = CodedOutputStream.A01;
                int A022 = 2 + 1 + BEB.A02(i3);
                int A05 = C25878Cnp.A05(3);
                int A023 = ((DSQ) cr6.A03[i2]).A02();
                i += A022 + A05 + BEB.A02(A023) + A023;
            }
            cr6.A00 = i;
        }
        return i;
    }

    public int Bcu(Object obj) {
        return ((C23577Bm6) obj).unknownFields.hashCode();
    }

    public final boolean Bf7(Object obj) {
        throw AnonymousClass000.A0s(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void Bih(Object obj) {
        ((C23577Bm6) obj).unknownFields.A01 = false;
        throw AnonymousClass000.A0s(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public void Bjl(C26282Cwd cwd, C26105CsP csP, Object obj) {
        this.A02.A00(obj);
        throw AnonymousClass000.A0s("ensureExtensionsAreMutable");
    }

    public void Bjm(C25573CiD ciD, Object obj, byte[] bArr, int i, int i2) {
        C23577Bm6 bm6 = (C23577Bm6) obj;
        if (bm6.unknownFields == C26042Cr6.A04) {
            bm6.unknownFields = new C26042Cr6();
        }
        throw AnonymousClass000.A0s("ensureExtensionsAreMutable");
    }

    public C23577Bm6 BkG() {
        C28668EDk eDk = this.A01;
        boolean z = eDk instanceof C23577Bm6;
        C23577Bm6 bm6 = (C23577Bm6) eDk;
        if (z) {
            return DNC.A0I(bm6);
        }
        C23624Bmt bmt = (C23624Bmt) bm6.A0P(AnonymousClass00R.A0Y, (Object) null);
        C23577Bm6 bm62 = bmt.A00;
        if (AnonymousClass000.A1O(bm62.memoizedSerializedSize & Integer.MIN_VALUE)) {
            bm62.A0Q();
        }
        return bmt.A00;
    }

    public void CSV(CVN cvn, Object obj) {
        throw AnonymousClass000.A0s(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public DNF(C24609CBn cBn, C28668EDk eDk, C25096CXo cXo) {
        this.A02 = cXo;
        this.A00 = cBn;
        this.A01 = eDk;
    }

    public void Bjk(Object obj, Object obj2) {
        C26298CxB.A0R(obj, obj2);
    }
}
