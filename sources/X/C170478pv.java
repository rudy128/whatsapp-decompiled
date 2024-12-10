package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8pv  reason: invalid class name and case insensitive filesystem */
public final class C170478pv extends C170498px {
    public final long A00;
    public final AnonymousClass1BI A01;
    public final boolean A02;
    public final String[] A03;

    public C170478pv(C19999A2n a2n, AnonymousClass1BI r14, AnonymousClass205 r15, String str, long j, long j2, boolean z, boolean z2) {
        super(C62382rJ.A03, a2n, r15, str, 3, j, z2);
        this.A02 = z;
        this.A00 = j2;
        this.A01 = r14;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "deleteMessageForMe";
        this.A03 = C20068A5s.A01(r14, r15, A1Y);
    }

    public C163398Uv A08() {
        C163398Uv A08 = super.A08();
        C23624Bmt A0N = AnonymousClass8ZX.DEFAULT_INSTANCE.A0N();
        boolean z = this.A02;
        AnonymousClass8ZX r1 = (AnonymousClass8ZX) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.deleteMedia_ = z;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        AnonymousClass8ZX r12 = (AnonymousClass8ZX) C17880vN.A0G(A0N);
        r12.bitField0_ |= 2;
        r12.messageTimestamp_ = seconds;
        C166378cn A0O = AnonymousClass8BS.A0O(A08);
        AnonymousClass8ZX r13 = (AnonymousClass8ZX) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0O.deleteMessageForMeAction_ = r13;
        A0O.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        return A08;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C20126A8l.A05(this, "DeleteMessageForMeMutation{rowId=", A10);
        A10.append(" ,key=");
        A10.append(this.A01);
        A10.append(" ,participant=");
        A10.append(this.A01);
        A10.append(" ,deleteMedia=");
        A10.append(this.A02);
        C20126A8l.A02(this, " ,timestamp=", A10);
        A10.append(" ,messageTimestamp=");
        A10.append(this.A00);
        C20126A8l.A03(this, " ,areDependenciesMissing=", A10);
        C20126A8l.A04(this, " ,operation=", A10);
        C20126A8l.A01(this, " ,collectionName=", A10);
        C20126A8l.A06(this, " ,keyId=", A10);
        return AnonymousClass000.A0y(" }", A10);
    }
}
