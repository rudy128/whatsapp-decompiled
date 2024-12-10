package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.30I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass30I implements C72123Ks {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C33611j6 A02;

    public final void BcN(byte[] bArr) {
        StringBuilder A10;
        C33611j6 r5 = this.A02;
        UserJid userJid = this.A01;
        long j = this.A00;
        byte[] A022 = A3S.A02((AnonymousClass2HL) null, (C173578vJ) null, bArr);
        if (A022 != null) {
            try {
                C166418cr A012 = C166418cr.A01(A022);
                if (!AnonymousClass000.A1O(A012.bitField0_ & 65536)) {
                    A10 = AnonymousClass000.A10();
                    A10.append("axolotl e2eMessage is missing live location message; jid=");
                    A10.append(userJid);
                } else {
                    C27131Uv r7 = r5.A01;
                    C17900vP.A0Y(userJid, "LocationSharingManager/onReceiveLocation; location.jid=", AnonymousClass000.A10());
                    long A013 = AnonymousClass11P.A01(r7.A0D);
                    C60072nL A023 = C27131Uv.A02(userJid, A012, (AnonymousClass219) null);
                    A023.A05 = A013 - (j * 1000);
                    if (r7.A0f(A023)) {
                        for (C72393Lt C2c : r7.A0X) {
                            C2c.C2c(A023);
                        }
                        return;
                    }
                    A10 = AnonymousClass000.A10();
                    A10.append("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource=");
                    A10.append(A023.A06);
                }
                Log.w(A10.toString());
            } catch (AnonymousClass1PN e) {
                Log.w(AnonymousClass001.A1E(userJid, "axolotl derived plaintext does not represent valid protocol buffer; jid=", AnonymousClass000.A10()), e);
            }
        }
    }

    public /* synthetic */ AnonymousClass30I(UserJid userJid, C33611j6 r2, long j) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = j;
    }
}
