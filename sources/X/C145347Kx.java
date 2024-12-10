package X;

import com.whatsapp.contact.picker.nativeContactsLauncher.NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1;
import com.whatsapp.util.Log;

/* renamed from: X.7Kx  reason: invalid class name and case insensitive filesystem */
public final class C145347Kx implements C160848Ae {
    public final C26811To A00;
    public final C18600wl A01;
    public final AnonymousClass1OX A02;
    public final int A03;
    public final C72093Kp A04;
    public final C37311pJ A05;
    public final C19830z4 A06;
    public final C37301pI A07;

    public void BzG() {
        Log.e("NativeContactsLauncher/onNoEligibleDisclosure: user is not eligible for NUX");
        this.A04.CC1();
    }

    public void C3C(Integer num) {
        Log.e("NativeContactsLauncher/onRenderingFailed: NUX failed to render");
        this.A04.CC1();
    }

    public void C9h() {
        this.A06.A26(true);
        AnonymousClass3MW.A1X(this.A01, new NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1(this, (C30391dr) null), this.A02);
        this.A05.A00();
        C37301pI r3 = this.A07;
        int i = this.A03;
        AnonymousClass62Q r1 = new AnonymousClass62Q();
        r1.A01 = C17880vN.A0h();
        r1.A00 = Integer.valueOf(i);
        r3.A00.CC7(r1);
        this.A04.CC1();
    }

    public void C9i() {
        Log.e("NativeContactsLauncher/onUserApproved");
        this.A04.CC1();
    }

    public void C9j() {
        Log.e("NativeContactsLauncher/onUserDenied");
        this.A04.CC1();
    }

    public void C9l() {
        this.A06.A26(true);
        AnonymousClass3MW.A1X(this.A01, new NativeContactsDisclosureListener$updatePrimaryFeatureListOnCompanion$1(this, (C30391dr) null), this.A02);
        C37301pI r3 = this.A07;
        int i = this.A03;
        AnonymousClass62Q r1 = new AnonymousClass62Q();
        r1.A01 = C17880vN.A0h();
        r1.A00 = Integer.valueOf(i);
        r3.A00.CC7(r1);
        this.A05.A00();
        this.A04.CC1();
    }

    public void C9m() {
        Log.e("NativeContactsLauncher/onUserOptedIn");
        this.A04.CC1();
    }

    public void C9o() {
        Log.e("NativeContactsLauncher/onUserOptedOut");
        this.A04.CC1();
    }

    public C145347Kx(C26811To r1, C72093Kp r2, C37311pJ r3, C19830z4 r4, C37301pI r5, C18600wl r6, AnonymousClass1OX r7, int i) {
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = r3;
        this.A00 = r1;
        this.A07 = r5;
        this.A03 = i;
        this.A01 = r6;
        this.A02 = r7;
    }
}
