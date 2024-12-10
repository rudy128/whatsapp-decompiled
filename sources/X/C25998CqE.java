package X;

import android.content.res.Resources;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* renamed from: X.CqE  reason: case insensitive filesystem */
public class C25998CqE {
    public final Resources A00;

    public static String A01(C25998CqE cqE, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(cqE.A00.openRawResource(i));
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            CharBuffer allocate = CharBuffer.allocate(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            while (inputStreamReader.read(allocate) != -1) {
                allocate.flip();
                A10.append(allocate);
                allocate.clear();
            }
            String obj = A10.toString();
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
            return obj;
        } catch (IOException e) {
            throw AnonymousClass8BR.A0x(e);
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public C25739Cl9 A03(String str, String str2, boolean z) {
        String obj;
        if (!z) {
            String[] split = str2.split("\n");
            String str3 = split[0];
            if (str3.equals("#extension GL_OES_EGL_image_external : require")) {
                obj = BE6.A0p(str3.length(), str2);
            } else if (!str3.equals("#version 300 es")) {
                throw AnonymousClass000.A0n("Fragment shader's first line must be:\n#extension GL_OES_EGL_image_external : require");
            } else if (split[2].equals("#extension GL_OES_EGL_image_external : require")) {
                StringBuilder A0u = BE6.A0u("");
                for (int i = 0; i < split.length; i++) {
                    if (i != 2) {
                        A0u.append(split[i]);
                        A0u.append(10);
                    }
                }
                obj = A0u.toString();
            } else {
                throw AnonymousClass000.A0n("Fragment shader's fourth line must be:\n#extension GL_OES_EGL_image_external : require");
            }
            str2 = obj.replaceFirst("samplerExternalOES", "sampler2D").replaceFirst("__samplerExternal2DY2YEXT", "sampler2D");
        }
        return new C25739Cl9(str, str2);
    }

    public C25998CqE(Resources resources) {
        this.A00 = resources;
    }

    public static C25739Cl9 A00(C25998CqE cqE, int i, int i2) {
        return new C25739Cl9(A01(cqE, i), A01(cqE, i2));
    }

    public C25739Cl9 A02(int i, int i2, boolean z) {
        return A03(A01(this, i), A01(this, i2), z);
    }
}
