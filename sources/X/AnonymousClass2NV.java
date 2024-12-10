package X;

import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.2NV  reason: invalid class name */
public final class AnonymousClass2NV extends C195509tS {
    public AnonymousClass2NU A00;
    public final C46152Dc A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass1WZ A03;
    public final AnonymousClass19D A04;
    public final C219017v A05;
    public final C203911y A06;
    public final C27371Vv A07;
    public final AnonymousClass1NR A08;
    public final AnonymousClass1Nb A09;
    public final AnonymousClass4aW A0A;
    public final C170178or A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final /* synthetic */ AnonymousClass8GT A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2NV(X.C33621j7 r9, X.C46152Dc r10, X.AnonymousClass1Cd r11, X.AnonymousClass1WZ r12, X.AnonymousClass19D r13, X.C219017v r14, X.C203911y r15, X.C58802lH r16, X.C27371Vv r17, X.AnonymousClass8GT r18, X.AnonymousClass1NR r19, X.AnonymousClass1Nb r20, X.AnonymousClass4aW r21, X.C170178or r22, X.AnonymousClass10I r23, X.C18150vq r24) {
        /*
            r8 = this;
            r1 = r8
            r0 = r18
            r8.A0E = r0
            r2 = r9
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r23
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A0C = r6
            r8.A01 = r10
            r0 = r21
            r8.A0A = r0
            r0 = r20
            r8.A09 = r0
            r8.A06 = r15
            r8.A05 = r14
            r0 = r22
            r8.A0B = r0
            r8.A0D = r7
            r0 = r17
            r8.A07 = r0
            r0 = r19
            r8.A08 = r0
            r8.A04 = r13
            r8.A03 = r12
            r8.A02 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2NV.<init>(X.1j7, X.2Dc, X.1Cd, X.1WZ, X.19D, X.17v, X.11y, X.2lH, X.1Vv, X.8GT, X.1NR, X.1Nb, X.4aW, X.8or, X.10I, X.0vq):void");
    }

    public void A01() {
    }

    public void A00() {
        Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
        AnonymousClass2NU r2 = new AnonymousClass2NU(this);
        this.A00 = r2;
        this.A0C.CGD(r2, new Object[0]);
    }

    public void A02(C192039nf r9) {
        AnonymousClass8GT r7 = this.A0E;
        if (r9 instanceof C46182Dm) {
            Log.i("DirectTransferBackgroundTaskViewModel/removeAllListener");
            r7.A00.removeCallbacks(r7.A07);
            int i = r9.A00;
            int A0H = r7.A04.A0H();
            int i2 = 20;
            switch (i) {
                case 0:
                    i2 = 3;
                    break;
                case 1:
                case 21:
                    break;
                case 2:
                case 19:
                    throw AnonymousClass001.A13("state is not recognized or not used = ", AnonymousClass000.A10(), i);
                case 3:
                    i2 = 16;
                    break;
                case 4:
                    i2 = 17;
                    break;
                case 5:
                    i2 = 1;
                    break;
                case 6:
                    i2 = 2;
                    break;
                case 7:
                    i2 = 18;
                    break;
                case 8:
                    i2 = 5;
                    break;
                case 9:
                    i2 = 6;
                    break;
                case 10:
                    i2 = 7;
                    break;
                case 11:
                    i2 = 8;
                    break;
                case 12:
                    i2 = 9;
                    break;
                case 13:
                    i2 = 10;
                    break;
                case 14:
                    i2 = 11;
                    break;
                case 15:
                    i2 = 12;
                    break;
                case 16:
                    i2 = 13;
                    break;
                case 17:
                    i2 = 14;
                    break;
                case 18:
                    i2 = 15;
                    break;
                case 20:
                    i2 = 19;
                    break;
                default:
                    throw AnonymousClass001.A13("state is not recognized or not used = ", AnonymousClass000.A10(), i);
            }
            AnonymousClass8GT.A05(r7, A0H, i2);
            boolean A1R = C17890vO.A1R(i);
            if (A1R || A0H == 3) {
                C27361Vu r2 = r7.A06;
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putInt("migration_state_on_provider_side", 2);
                Log.i("InterAppCommunicationManager/setDirectMigrationStateOnProviderSide");
                C27361Vu.A00(A0D2, r2, "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide");
            }
            C17900vP.A0n("DirectTransferBackgroundTaskViewModel/afterMessageStoreVerified/success = ", AnonymousClass000.A10(), A1R);
            if (A1R) {
                AnonymousClass8GT.A04(r7, 2);
                return;
            }
            int i3 = 5;
            if (i != 5) {
                i3 = 6;
                if (i != 6) {
                    if (i != 7) {
                        AnonymousClass8GT.A04(r7, 3);
                        return;
                    }
                    return;
                }
            }
            AnonymousClass8GT.A04(r7, i3);
            return;
        }
        throw AnonymousClass000.A0k("should only use RestoreFromDirectMigrationStatus class here");
    }
}
