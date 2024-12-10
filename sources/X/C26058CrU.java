package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Locale;

/* renamed from: X.CrU  reason: case insensitive filesystem */
public abstract class C26058CrU {
    public static String A00(String str, String str2, int i) {
        Object[] A1b = AnonymousClass000.A1b(str, 3);
        C17880vN.A1T(A1b, i, 1);
        A1b[2] = str2;
        return String.format((Locale) null, "%s: GL error 0x%04x %s occurred, see logcat output", A1b);
    }

    public static void A01(String str) {
        A03(str, new Object[0]);
    }

    public static void A02(String str) {
        boolean z = false;
        int i = 12288;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i = eglGetError;
        }
        if (z) {
            switch (i) {
                case 12289:
                    throw new BS1(A00(str, "EGL_NOT_INITIALIZED", i));
                case 12290:
                    throw new C22836BRo(A00(str, "EGL_BAD_ACCESS", i));
                case 12291:
                    throw new C22837BRp(A00(str, "EGL_BAD_ALLOC", i));
                case 12292:
                    throw new C22838BRq(A00(str, "EGL_BAD_ATTRIBUTE", i));
                case 12293:
                    throw new C22839BRr(A00(str, "EGL_BAD_CONFIG", i));
                case 12294:
                    throw new C22840BRs(A00(str, "EGL_BAD_CONTEXT", i));
                case 12295:
                    throw new C22841BRt(A00(str, "EGL_BAD_CURRENT_SURFACE", i));
                case 12296:
                    throw new C22842BRu(A00(str, "EGL_BAD_DISPLAY", i));
                case 12297:
                    throw new C22843BRv(A00(str, "EGL_BAD_MATCH", i));
                case 12298:
                    throw new C22844BRw(A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
                case 12299:
                    throw new C22845BRx(A00(str, "EGL_BAD_NATIVE_WINDOW", i));
                case 12300:
                    throw new C22846BRy(A00(str, "EGL_BAD_PARAMETER", i));
                case 12301:
                    throw new C22847BRz(A00(str, "EGL_BAD_SURFACE", i));
                case 12302:
                    throw new BS0(A00(str, "EGL_CONTEXT_LOST", i));
                default:
                    throw new C27216DZt(i, A00(str, "UNKNOWN", i));
            }
        }
    }

    public static void A03(String str, Object... objArr) {
        boolean z = false;
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            z = true;
            i = glGetError;
        }
        if (z) {
            String format = String.format(str, objArr);
            switch (i) {
                case VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH /*1280*/:
                    throw new BS2(A00(format, "GL_INVALID_ENUM", i));
                case 1281:
                    throw new BS5(A00(format, "GL_INVALID_VALUE", i));
                case 1282:
                    throw new BS4(A00(format, "GL_INVALID_OPERATION", i));
                case 1285:
                    throw new BS6(A00(format, "GL_OUT_OF_MEMORY", i));
                case 1286:
                    throw new BS3(A00(format, "GL_INVALID_FRAMEBUFFER_OPERATION", i));
                default:
                    throw new C27216DZt(i, A00(format, "UNKNOWN", i));
            }
        }
    }
}
