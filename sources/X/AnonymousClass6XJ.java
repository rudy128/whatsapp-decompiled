package X;

import com.whatsapp.InteractiveAnnotation;

/* renamed from: X.6XJ  reason: invalid class name */
public abstract class AnonymousClass6XJ {
    public static final AnonymousClass77U A00(AnonymousClass206 r7) {
        Object obj;
        AnonymousClass21V r72;
        C62572rc r0;
        InteractiveAnnotation[] interactiveAnnotationArr;
        AnonymousClass77U r1;
        C18070vi.A0d(r7, 0);
        if ((r7 instanceof AnonymousClass21V) && (r72 = (AnonymousClass21V) r7) != null && (r0 = r72.A02) != null && (interactiveAnnotationArr = r0.A0b) != null) {
            int length = interactiveAnnotationArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr[i];
                if (interactiveAnnotation.type == C49482Qq.MUSIC) {
                    Object obj2 = interactiveAnnotation.data;
                    if ((obj2 instanceof AnonymousClass77U) && (r1 = (AnonymousClass77U) obj2) != null && r1.A00()) {
                        obj = interactiveAnnotation.data;
                        break;
                    }
                }
                i++;
            }
        }
        obj = null;
        if (obj instanceof AnonymousClass77U) {
            return (AnonymousClass77U) obj;
        }
        return null;
    }
}
