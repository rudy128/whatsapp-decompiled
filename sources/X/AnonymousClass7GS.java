package X;

import com.whatsapp.waffle.accountlinking.notification.PrimaryDeviceWfalNotificationHandler$syncState$1$onSuccess$1;

/* renamed from: X.7GS  reason: invalid class name */
public class AnonymousClass7GS implements C1606689l {
    public final int A00;
    public final Object A01;

    public AnonymousClass7GS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BrA() {
        switch (this.A00) {
            case 0:
                ((AnonymousClass89J) this.A01).onFailure(new Exception("AvatarUserManagementHelper/createAvatarUser/onDeliveryFailure"));
                return;
            case 1:
                ((AnonymousClass89J) this.A01).onFailure(new Exception("AvatarUserManagementHelper/deleteAvatarUser/onDeliveryFailure"));
                return;
            case 2:
                ((AnonymousClass89J) this.A01).onFailure(new Exception("AvatarUserManagementHelper/generateAvatarRefreshToken/onDeliveryFailure"));
                return;
            case 3:
                return;
            default:
                ((C1606789m) this.A01).BrA();
                return;
        }
    }

    public void Bsw(Exception exc) {
        switch (this.A00) {
            case 3:
                return;
            case 4:
            case 5:
                C18070vi.A0d(exc, 0);
                ((C1606789m) this.A01).Bsw(exc);
                return;
            default:
                C18070vi.A0d(exc, 0);
                ((AnonymousClass89J) this.A01).onFailure(exc);
                return;
        }
    }

    public void C7I(AnonymousClass732 r4) {
        AnonymousClass89J r1;
        switch (this.A00) {
            case 0:
                r1 = (AnonymousClass89J) this.A01;
                if (r4 == null) {
                    r1.onFailure(AnonymousClass000.A0n("Avatar User Entity is null"));
                    return;
                }
                break;
            case 1:
                ((AnonymousClass89J) this.A01).onSuccess();
                return;
            case 2:
                r1 = (AnonymousClass89J) this.A01;
                if (r4 == null) {
                    r1.onFailure(AnonymousClass000.A0n("Avatar User Entity is null"));
                    return;
                }
                break;
            case 3:
                AnonymousClass4GT.A00(AnonymousClass1OR.A00, new PrimaryDeviceWfalNotificationHandler$syncState$1$onSuccess$1((C34401kQ) this.A01, (C30391dr) null));
                return;
            default:
                ((C1606789m) this.A01).C7I(r4);
                return;
        }
        r1.onSuccess();
    }
}
