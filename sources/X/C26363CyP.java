package X;

import android.media.MediaDrm;

/* renamed from: X.CyP  reason: case insensitive filesystem */
public final /* synthetic */ class C26363CyP implements MediaDrm.OnEventListener {
    public final /* synthetic */ C24760CIx A00;
    public final /* synthetic */ C25852CnE A01;

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.A01.A07(this.A00, bArr, i);
    }

    public /* synthetic */ C26363CyP(C24760CIx cIx, C25852CnE cnE) {
        this.A01 = cnE;
        this.A00 = cIx;
    }
}
