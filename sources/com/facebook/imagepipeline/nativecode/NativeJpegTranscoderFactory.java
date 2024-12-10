package com.facebook.imagepipeline.nativecode;

import X.C25385Cel;
import X.C25783Clu;
import X.CIN;
import X.E4X;
import X.E97;

public class NativeJpegTranscoderFactory implements E4X {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.E97, com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, java.lang.Object] */
    public E97 createImageTranscoder(C25783Clu clu, boolean z) {
        if (clu != CIN.A06) {
            return null;
        }
        int i = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A01;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = z2;
        if (!z3) {
            return obj;
        }
        C25385Cel.A00();
        return obj;
    }

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
