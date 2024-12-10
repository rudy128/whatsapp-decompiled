package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class DDO implements E4X {
    public final Integer A00;

    public E97 createImageTranscoder(C25783Clu clu, boolean z) {
        E97 A002;
        C18070vi.A0d(clu, 0);
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    throw AnonymousClass000.A0k("Invalid ImageTranscoderType");
                }
                return new DDL(z);
            }
            E97 A003 = A00(clu, z);
            if (A003 != null) {
                return A003;
            }
        }
        if (C24448C4n.A00 && (A002 = A00(clu, z)) != null) {
            return A002;
        }
        return new DDL(z);
    }

    private final E97 A00(C25783Clu clu, boolean z) {
        try {
            Class<?> cls = Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory");
            Class[] clsArr = new Class[3];
            clsArr[0] = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            clsArr[1] = cls2;
            Constructor A0w = BE6.A0w(cls, cls2, clsArr, 2);
            Object[] objArr = new Object[3];
            C17880vN.A1T(objArr, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, 0);
            AnonymousClass8BR.A1L(objArr, 1, false);
            AnonymousClass8BR.A1L(objArr, 2, true);
            Object newInstance = A0w.newInstance(objArr);
            C18070vi.A0z(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return ((E4X) newInstance).createImageTranscoder(clu, z);
        } catch (NoSuchMethodException e) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (SecurityException e2) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (InstantiationException e3) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InvocationTargetException e4) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (IllegalAccessException e5) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (IllegalArgumentException e6) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (ClassNotFoundException e7) {
            throw BE6.A0o("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }

    public DDO(Integer num) {
        this.A00 = num;
    }
}
