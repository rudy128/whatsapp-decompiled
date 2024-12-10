package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class CVZ {
    public C24469C5j A00;
    public final CXJ A01;

    public void A00(int i, float[] fArr) {
        C24469C5j c5j = this.A00;
        float[] fArr2 = C26070Crk.A00;
        CXJ cxj = this.A01;
        FloatBuffer floatBuffer = cxj.A06;
        int i2 = cxj.A02;
        int i3 = cxj.A00;
        int i4 = cxj.A03;
        FloatBuffer floatBuffer2 = cxj.A05;
        int i5 = cxj.A01;
        C26070Crk.A02("draw start");
        GLES20.glUseProgram(c5j.A00);
        C26070Crk.A02("glUseProgram");
        GLES20.glActiveTexture(33984);
        int i6 = c5j.A01;
        GLES20.glBindTexture(i6, i);
        GLES20.glUniformMatrix4fv(c5j.A06, 1, false, fArr2, 0);
        C26070Crk.A02("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(c5j.A07, 1, false, fArr, 0);
        C26070Crk.A02("glUniformMatrix4fv");
        int i7 = c5j.A02;
        GLES20.glEnableVertexAttribArray(i7);
        C26070Crk.A02("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i7, i3, 5126, false, i4, floatBuffer);
        C26070Crk.A02("glVertexAttribPointer");
        int i8 = c5j.A03;
        GLES20.glEnableVertexAttribArray(i8);
        C26070Crk.A02("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i8, 2, 5126, false, i5, floatBuffer2);
        C26070Crk.A02("glVertexAttribPointer");
        int i9 = c5j.A05;
        if (i9 >= 0) {
            GLES20.glUniform1fv(i9, 9, c5j.A09, 0);
            GLES20.glUniform2fv(c5j.A08, 9, c5j.A0A, 0);
            GLES20.glUniform1f(c5j.A04, 0.0f);
        }
        GLES20.glDrawArrays(5, 0, i2);
        C26070Crk.A02("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i7);
        GLES20.glDisableVertexAttribArray(i8);
        GLES20.glBindTexture(i6, 0);
        GLES20.glUseProgram(0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.CXJ, java.lang.Object] */
    public CVZ(C24469C5j c5j) {
        Integer num = AnonymousClass00R.A0C;
        ? obj = new Object();
        obj.A06 = CXJ.A07;
        obj.A05 = CXJ.A08;
        obj.A00 = 2;
        obj.A03 = 8;
        obj.A02 = 4;
        obj.A01 = 8;
        obj.A04 = num;
        this.A01 = obj;
        this.A00 = c5j;
    }
}
