package X;

import java.util.Map;

/* renamed from: X.DEm  reason: case insensitive filesystem */
public final class C26804DEm implements E9C {
    public final /* synthetic */ E7R A00;
    public final /* synthetic */ C22810BPy A01;
    public final /* synthetic */ C26132Csv A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public void Bsw(Exception exc) {
        C2X buq;
        C18070vi.A0d(exc, 0);
        C22810BPy bPy = this.A01;
        C22810BPy.A00(bPy);
        C26379Cyf.A03(this.A00, exc);
        EDE ede = bPy.A03;
        if (ede != null && this.A03 && this.A05) {
            ede.CK6(true);
        }
        EDJ edj = bPy.A04;
        if (edj != null) {
            int hashCode = bPy.hashCode();
            if (exc instanceof C2X) {
                buq = (C2X) exc;
            } else {
                buq = new BUQ((Throwable) exc);
            }
            C9R.A00(buq, edj, "medium", hashCode);
        }
    }

    public void C0W(C25751ClL clL) {
        C25751ClL clL2 = clL;
        C18070vi.A0d(clL, 0);
        E7R e7r = this.A00;
        if (e7r instanceof C28654ECo) {
            C22810BPy bPy = this.A01;
            C22810BPy.A00(bPy);
            Object A012 = clL.A01(C25751ClL.A0X);
            C18070vi.A0b(A012);
            C26379Cyf.A02(e7r, C25866CnZ.A01(clL), (byte[]) A012);
            EDE ede = bPy.A03;
            if (ede != null && this.A03 && this.A05) {
                ede.CK6(true);
                return;
            }
            return;
        }
        C22810BPy bPy2 = this.A01;
        DTF dtf = new DTF(e7r, bPy2, this.A02, clL2, this.A04, this.A03, this.A05);
        EDI edi = bPy2.A06;
        if (edi.Bfg()) {
            edi.BSH("Lite-Controller-Thread").post(dtf);
        } else {
            dtf.run();
        }
    }

    public void C8r(C25751ClL clL) {
        C18070vi.A0d(clL, 0);
        C22810BPy bPy = this.A01;
        EDJ edj = bPy.A04;
        if (edj != null) {
            int hashCode = bPy.hashCode();
            C26294Cx6.A04("PhotoCaptureControllerImpl", "logTakePhotoFinished QPL CAPTURE_PHOTO");
            edj.Bi9("photo_capture_finished", "PhotoCaptureControllerImpl", (Map) null, (long) hashCode);
        }
    }

    public C26804DEm(E7R e7r, C22810BPy bPy, C26132Csv csv, boolean z, boolean z2, boolean z3) {
        this.A01 = bPy;
        this.A03 = z;
        this.A00 = e7r;
        this.A02 = csv;
        this.A04 = z2;
        this.A05 = z3;
    }

    public void Bny() {
        EDE ede = this.A01.A03;
        if (ede != null && this.A03) {
            ede.CK6(false);
        }
        E7R e7r = this.A00;
        if (e7r instanceof C28654ECo) {
            C28654ECo eCo = (C28654ECo) e7r;
            if (C26379Cyf.A0A()) {
                C26159CtX.A01(eCo);
                eCo.Bny();
                return;
            }
            C108955ca.A1F(C26379Cyf.A00(), eCo, 7);
        }
    }
}
