package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.9jy  reason: invalid class name and case insensitive filesystem */
public final class C189859jy {
    public EEC A00 = new DMq(true);
    public final AnonymousClass00H A01;

    public C189859jy(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
    }

    public int A00(VersionedCapability versionedCapability) {
        C18070vi.A0d(versionedCapability, 0);
        Number number = (Number) C198909z7.A00.A00((C18030ve) C18070vi.A0E(this.A01)).get(versionedCapability);
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }
}
