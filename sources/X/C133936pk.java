package X;

import com.whatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.6pk  reason: invalid class name and case insensitive filesystem */
public final class C133936pk {
    public boolean A00;
    public final int A01;
    public final CameraModeTabLayout A02;
    public final boolean A03;
    public final boolean A04;
    public final C18030ve A05;

    public C133936pk(C1594884s r5, CameraModeTabLayout cameraModeTabLayout, C18030ve r7, int i, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(cameraModeTabLayout, 3);
        this.A05 = r7;
        this.A02 = cameraModeTabLayout;
        this.A04 = z;
        this.A01 = i;
        this.A03 = z2;
        this.A00 = z3;
        cameraModeTabLayout.A01 = r5;
        if (z) {
            int A07 = C108945cZ.A07(cameraModeTabLayout);
            int i2 = 0;
            while (true) {
                if (i2 >= A07) {
                    break;
                }
                C136836uU A08 = cameraModeTabLayout.A08(i2);
                C136836uU r1 = cameraModeTabLayout.A06;
                if (!C18070vi.A18(A08, r1)) {
                    i2++;
                } else if (r1.A03 == cameraModeTabLayout) {
                    cameraModeTabLayout.A0C(r1.A00);
                } else {
                    throw AnonymousClass000.A0k("Tab does not belong to this TabLayout.");
                }
            }
            cameraModeTabLayout.A05.A02.setVisibility(8);
        }
        A00();
        if (this.A00) {
            cameraModeTabLayout.setVisibility(4);
        }
    }

    public final void A00() {
        if (!this.A04 && !this.A03) {
            int i = this.A01;
            if (i == 2 || i == 3 || i == 25 || i == 26) {
                if (C18020vd.A05(C18040vf.A02, this.A05, 8308)) {
                    CameraModeTabLayout cameraModeTabLayout = this.A02;
                    if (cameraModeTabLayout.A00 == null) {
                        C136836uU A0L = cameraModeTabLayout.A0L(2131887881, false);
                        A0L.A06 = C17880vN.A0j();
                        cameraModeTabLayout.A00 = A0L;
                    }
                }
            }
        }
    }

    public final void A01(int i) {
        if (!this.A00) {
            CameraModeTabLayout cameraModeTabLayout = this.A02;
            cameraModeTabLayout.setEnabled(AnonymousClass000.A1P(i));
            cameraModeTabLayout.setVisibility(i);
        }
    }
}
