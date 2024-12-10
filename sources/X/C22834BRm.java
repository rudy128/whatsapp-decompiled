package X;

import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

/* renamed from: X.BRm  reason: case insensitive filesystem */
public final class C22834BRm extends CZB {
    public final IglTexture A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22834BRm(com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture r6) {
        /*
            r5 = this;
            java.lang.String r1 = "IglFrameBufferTexture"
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.CTi r4 = new X.CTi
            r4.<init>(r1)
            r4.A06 = r0
            int r0 = r6.getTarget()
            r4.A02 = r0
            int r0 = r6.getHandle()
            r4.A00 = r0
            int r0 = r6.getWidth()
            r4.A03 = r0
            int r0 = r6.getHeight()
            r4.A01 = r0
            java.util.Map r0 = r6.getParams()
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)
        L_0x002d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)
            int r2 = X.AnonymousClass8BV.A04(r0)
            int r1 = X.BE9.A0J(r0)
            android.util.SparseIntArray r0 = r4.A08
            r0.put(r2, r1)
            goto L_0x002d
        L_0x0045:
            r5.<init>(r4)
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22834BRm.<init>(com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture):void");
    }

    public boolean A01() {
        this.A00.release();
        return super.A01();
    }
}
