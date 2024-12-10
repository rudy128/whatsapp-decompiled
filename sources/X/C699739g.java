package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.InteractiveAnnotation;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.39g  reason: invalid class name and case insensitive filesystem */
public final class C699739g implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void CCZ(AnonymousClass206 r19, C49702Rn r20) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        AnonymousClass97M r1;
        AnonymousClass206 r2;
        AnonymousClass6RT r9;
        C49482Qq r92;
        AnonymousClass97M r12;
        AnonymousClass206 r6 = r19;
        C18070vi.A0d(r6, 0);
        if (r6 instanceof AnonymousClass21V) {
            AnonymousClass205 r5 = r6.A0v;
            if (C22971Dz.A0a(r5.A00)) {
                if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A00), 9522)) {
                    AnonymousClass21V r62 = (AnonymousClass21V) r6;
                    C62572rc r0 = r62.A02;
                    if (!(r0 == null || (interactiveAnnotationArr = r0.A0b) == null)) {
                        ArrayList A13 = AnonymousClass000.A13();
                        for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                            Object obj = interactiveAnnotation.data;
                            if (!(!(obj instanceof AnonymousClass97M) || (r12 = (AnonymousClass97M) obj) == null || r12.A01 == null)) {
                                A13.add(interactiveAnnotation);
                            }
                        }
                        Iterator it = A13.iterator();
                        while (it.hasNext()) {
                            InteractiveAnnotation interactiveAnnotation2 = (InteractiveAnnotation) it.next();
                            Object obj2 = interactiveAnnotation2.data;
                            if (!(!(obj2 instanceof AnonymousClass97M) || (r1 = (AnonymousClass97M) obj2) == null || (r2 = r1.A01) == null)) {
                                C693236t A002 = C60512o9.A00(r2);
                                if (A002 != null) {
                                    r9 = A002.A01;
                                } else {
                                    r9 = AnonymousClass6RT.FUTURE;
                                }
                                C60512o9.A01(r2, new C693236t(r9, new A51(r62.A0I(), r5), r62.A0x));
                                C17880vN.A0c(this.A01).A04(r2);
                                C693236t A003 = C60512o9.A00(r2);
                                if (A003 == null) {
                                    r92 = null;
                                } else if (A003.A01 == AnonymousClass6RT.STATUS_TAPPABLE_MESSAGE) {
                                    r92 = C49482Qq.LINKCLICK;
                                } else {
                                    r92 = null;
                                }
                                interactiveAnnotation2.data = new AnonymousClass97M(r2, Long.valueOf(r2.A0x));
                                interactiveAnnotation2.type = r92;
                                long j = interactiveAnnotation2.interactiveAnnotationId;
                                long j2 = r2.A0x;
                                C28791au A05 = ((C25951Qg) this.A02.get()).A01.A05();
                                try {
                                    ContentValues A08 = C17880vN.A08();
                                    C17880vN.A19(A08, "child_message_row_id", j2);
                                    if (r92 != null) {
                                        C17880vN.A18(A08, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r92.value);
                                    }
                                    ((C28801av) A05).A02.A02(A08, "message_media_interactive_annotation", "_id = ?", "UPDATE_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_WHERE_ID_EMBEDDED_CHILD_ROW_ID", C17900vP.A0t(j));
                                    A05.close();
                                } catch (Throwable th) {
                                    AnonymousClass0DT.A00(th, th);
                                    throw th;
                                }
                            }
                        }
                    }
                    if (r20 != null) {
                        throw C17900vP.A07(C699739g.class);
                    }
                }
            }
        }
    }

    public C699739g(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
