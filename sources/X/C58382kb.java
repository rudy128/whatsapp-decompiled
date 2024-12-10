package X;

import com.whatsapp.calling.dialer.DialerProfilePhotoLoader$getContactPhoto$2;

/* renamed from: X.2kb  reason: invalid class name and case insensitive filesystem */
public final class C58382kb {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final C42751yg A00(AnonymousClass1E7 r5) {
        String A0W;
        AnonymousClass00H r3 = this.A01;
        C42751yg A0H = ((C24921Me) r3.get()).A0H(r5, false);
        if (A0H.A01 == null && (A0W = ((C24921Me) r3.get()).A0W(r5, false)) != null) {
            A0H = new C42751yg(A0W, AnonymousClass00R.A0C);
        }
        if (A0H.A01 != null) {
            return A0H;
        }
        String A03 = C24921Me.A03((C24921Me) r3.get(), r5, 2131898919);
        C18070vi.A0X(A03);
        if (A03.length() > 0) {
            return new C42751yg(A03, AnonymousClass00R.A0Y);
        }
        return A0H;
    }

    public final Object A01(AnonymousClass1E7 r5, C30391dr r6, boolean z) {
        C186619eU r3 = (C186619eU) this.A00.get();
        return C30451dy.A00(r6, r3.A03, new DialerProfilePhotoLoader$getContactPhoto$2(r3, r5, (C30391dr) null, z));
    }

    public C58382kb(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
