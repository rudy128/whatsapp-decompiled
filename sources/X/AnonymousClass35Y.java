package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.35Y  reason: invalid class name */
public final class AnonymousClass35Y implements AnonymousClass3MB {
    public final C24681Lg A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1W6 A02;

    public /* synthetic */ void BCg(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public int BVp() {
        return 4;
    }

    public /* synthetic */ void CRg(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void CRh(C20077A6d a6d, C166048cG r2, AnonymousClass206 r3) {
    }

    public void CRA(AnonymousClass206 r5, Integer num, long j) {
        C692636n r0;
        C438421d r02;
        if (r5 instanceof C445823z) {
            AnonymousClass25F r3 = ((C445823z) r5).A09;
            if (r3.A03 && (r0 = (C692636n) r3.A02) != null && (r02 = r0.A00) != null && r02.A0x == j) {
                r3.A01();
                this.A01.A0J(new C70733Ch(this, r5, 45));
            }
        }
    }

    public void CRB(AnonymousClass206 r4, AnonymousClass206 r5) {
        if ((r5 instanceof C445823z) && (r4 instanceof C438421d)) {
            ((C445823z) r5).A09.A02(new C692636n((C438421d) r4));
        }
        if (!r5.A0z(ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            r5.A0V(ZipDecompressor.UNZIP_BUFFER_SIZE);
            this.A02.A05(r5, -1);
        }
        this.A01.A0J(new C70733Ch(this, r5, 44));
    }

    public AnonymousClass35Y(AnonymousClass1KB r1, C24681Lg r2, AnonymousClass1W6 r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public AnonymousClass6RT BNA() {
        return AnonymousClass6RT.EVENT_COVER_IMAGE;
    }

    public Integer BOc() {
        return AnonymousClass00R.A01;
    }

    public /* synthetic */ Integer BOd() {
        return AnonymousClass00R.A00;
    }

    public /* synthetic */ Integer BOe() {
        return AnonymousClass00R.A00;
    }

    public /* synthetic */ C49382Qg BOg() {
        return C49382Qg.REVOKE_CHILD_ON_PARENT_REVOKE;
    }

    public /* synthetic */ boolean CM5() {
        return true;
    }

    public /* synthetic */ boolean CM8() {
        return false;
    }
}
