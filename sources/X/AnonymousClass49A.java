package X;

import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.lang.ref.WeakReference;

/* renamed from: X.49A  reason: invalid class name */
public final class AnonymousClass49A extends A34 {
    public final C34651kr A00;
    public final AnonymousClass4SJ A01;
    public final AnonymousClass1ED A02;
    public final WeakReference A03;

    public AnonymousClass49A(C34651kr r2, AnonymousClass4SJ r3, AnonymousClass1ED r4, WDSProfilePhoto wDSProfilePhoto) {
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = AnonymousClass3MW.A0z(wDSProfilePhoto);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i = this.A02.A00;
        C34651kr r2 = this.A00;
        Integer valueOf = Integer.valueOf(i);
        return r2.A01(C18070vi.A0M(valueOf)).get(valueOf);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C89514ca r5 = (C89514ca) obj;
        if (this.A03.get() != null && r5 != null) {
            this.A01.A01(new C97994qO(this, 1), r5.A04);
        }
    }
}
