package X;

import com.whatsapp.util.Log;

/* renamed from: X.7Jj  reason: invalid class name and case insensitive filesystem */
public final class C144967Jj implements C25471Oi {
    public final AnonymousClass181 A00;
    public final AnonymousClass121 A01;
    public final C24681Lg A02;
    public final AnonymousClass1D9 A03;
    public final AnonymousClass11A A04;
    public final AnonymousClass10I A05;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass206 r3 = r5.A0A;
        if (r3 != null && (r3 instanceof AnonymousClass219)) {
            AnonymousClass218 r32 = (AnonymousClass218) r3;
            if (!r32.A16()) {
                Log.i("LiveLocationIncomingMessageListener/downloadLocationThumbnail");
                r32.A02 = 1;
                this.A05.CGF(new C146507Pj(this, r32, 44));
            }
        }
    }

    public C144967Jj(AnonymousClass181 r2, AnonymousClass121 r3, C24681Lg r4, AnonymousClass1D9 r5, AnonymousClass11A r6, AnonymousClass10I r7) {
        C18070vi.A0w(r7, r2, r5, r4, r6);
        C18070vi.A0d(r3, 6);
        this.A05 = r7;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
    }

    public String BSr() {
        return "LiveLocationIncomingMessageListener";
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
