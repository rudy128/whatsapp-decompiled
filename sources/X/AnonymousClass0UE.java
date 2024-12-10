package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1;

/* renamed from: X.0UE  reason: invalid class name */
public abstract class AnonymousClass0UE implements C16040rc {
    public final float A00;
    public final C16300s2 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0UE) {
                AnonymousClass0UE r5 = (AnonymousClass0UE) obj;
                if (this.A02 != r5.A02 || !AnonymousClass000.A1P(Float.compare(this.A00, r5.A00)) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final float A00(long j) {
        C02540Ek r0 = C05100Qk.A06;
        C03710Kf A11 = AnonymousClass001.A11(j);
        long j2 = A11.A01;
        if (j2 == AnonymousClass0MS.A01) {
            C18070vi.A0z(A11, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C16380sA r2 = ((C016509i) A11).A02;
            float Bdp = (float) ((r2.Bdp((double) C05100Qk.A04(j)) * 0.2126d) + (r2.Bdp((double) C05100Qk.A03(j)) * 0.7152d) + (r2.Bdp((double) C05100Qk.A02(j)) * 0.0722d));
            if (Bdp <= 0.0f) {
                return 0.0f;
            }
            if (Bdp >= 1.0f) {
                return 1.0f;
            }
            return Bdp;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("The specified color must be encoded in an RGB color space. The supplied color space is ");
        A10.append(AnonymousClass0MS.A00(j2));
        throw AnonymousClass000.A0j(A10);
    }

    public int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0B(i * 31, this.A00));
    }

    public AnonymousClass0UE(C16300s2 r1, float f, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = r1;
    }

    public final C16050rd CEQ(C16110rj r12, C17130tn r13) {
        long j;
        AnonymousClass0K3 r0;
        AnonymousClass0UH r5;
        r13.COB(988743187);
        r13.BFh(AnonymousClass0GZ.A02);
        r13.COB(-1524341038);
        C16300s2 r6 = this.A01;
        if (AnonymousClass000.A0W(r6) != C05100Qk.A05) {
            j = AnonymousClass000.A0W(r6);
        } else {
            r13.COB(2042140174);
            j = C05100Qk.A01;
            A00(j);
            AnonymousClass0VR.A0U(r13);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r13;
        AnonymousClass0VR.A0R(r2, false);
        C17330uU A002 = AnonymousClass0Ou.A00(r13, j);
        r13.COB(-1629816343);
        if (((double) A00(C05100Qk.A01)) > 0.5d) {
            r0 = AnonymousClass0GZ.A00;
        } else {
            r0 = AnonymousClass0GZ.A01;
        }
        AnonymousClass0VR.A0R(r2, false);
        C17330uU A012 = AnonymousClass0Ou.A01(r13, r0);
        boolean z = this.A02;
        float f = this.A00;
        r13.COB(331259447);
        r13.COB(-1737891121);
        Object BFh = r13.BFh(AnonymousClass0PK.A04);
        while (!(BFh instanceof ViewGroup)) {
            ViewParent parent = ((View) BFh).getParent();
            if (parent instanceof View) {
                BFh = parent;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Couldn't find a valid parent for ");
                A10.append(BFh);
                throw AnonymousClass001.A12(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", A10);
            }
        }
        ViewGroup viewGroup = (ViewGroup) BFh;
        AnonymousClass0VR.A0R(r2, false);
        r13.COB(1643267293);
        if (viewGroup.isInEditMode()) {
            boolean A1Y = AnonymousClass001.A1Y(r13, r12, this);
            Object CER = r13.CER();
            if (A1Y || CER == AnonymousClass0MH.A00) {
                CER = new AnonymousClass07Q(A002, A012, f, z);
                r13.CRH(CER);
            }
            AnonymousClass0VR.A0R(r2, false);
            r5 = (AnonymousClass07Q) CER;
            AnonymousClass0VR.A0R(r2, false);
        } else {
            AnonymousClass0VR.A0R(r2, false);
            boolean A1a = AnonymousClass001.A1a(r13, r12, this, 1618982084) | r13.BEf(viewGroup);
            Object CER2 = r13.CER();
            if (A1a || CER2 == AnonymousClass0MH.A00) {
                CER2 = new AnonymousClass07R(viewGroup, A002, A012, f, z);
                r13.CRH(CER2);
            }
            AnonymousClass0VR.A0R(r2, false);
            r5 = (AnonymousClass07R) CER2;
        }
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0UH r52 = r5;
        AnonymousClass0QC.A02(r13, r52, r12, new Ripple$rememberUpdatedInstance$1(r12, r52, (C30391dr) null));
        AnonymousClass0VR.A0R(r2, false);
        return r52;
    }
}
